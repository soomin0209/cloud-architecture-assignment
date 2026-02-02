package com.cloudarchitecture.member.service;

import com.cloudarchitecture.member.dto.GetMemberResponse;
import com.cloudarchitecture.member.dto.SaveMemberRequest;
import com.cloudarchitecture.member.dto.SaveMemberResponse;
import com.cloudarchitecture.member.entity.Member;
import com.cloudarchitecture.member.exception.ImageUploadException;
import com.cloudarchitecture.member.exception.MemberNotFoundException;
import com.cloudarchitecture.member.repository.MemberRepository;
import io.awspring.cloud.s3.S3Template;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    private static final Duration PRESIGNED_URL_EXPIRATION = Duration.ofDays(7);
    private final S3Template s3Template;

    @Value("${spring.cloud.aws.s3.bucket}")
    private String bucket;

    @Transactional
    public SaveMemberResponse saveMember(SaveMemberRequest request) {
        Member member = new Member(request.getName(), request.getAge(), request.getMbti());
        Member savedMember = memberRepository.save(member);
        return new SaveMemberResponse(
                savedMember.getId(),
                savedMember.getName(),
                savedMember.getAge(),
                savedMember.getMbti()
        );
    }

    @Transactional
    public GetMemberResponse getMember(Long id) {
        Member member = memberRepository.findById(id).orElseThrow(
                () -> new MemberNotFoundException("존재하지 않는 팀원입니다.")
        );
        return new GetMemberResponse(
                member.getName(),
                member.getAge(),
                member.getMbti()
        );
    }

    @Transactional
    public String uploadImage(Long id, MultipartFile image) {
        Member member = memberRepository.findById(id).orElseThrow(
                () -> new MemberNotFoundException("존재하지 않는 팀원입니다.")
        );
        try {
            String key = "uploads/" + UUID.randomUUID() + "_" + image.getOriginalFilename();
            s3Template.upload(bucket, key, image.getInputStream());
            member.saveProfileImageUrl(key);
            return key;
        } catch (IOException e) {
            throw new ImageUploadException("프로필 이미지 업로드 실패");
        }
    }

    @Transactional
    public URL downloadImage(Long id) {
        Member member = memberRepository.findById(id).orElseThrow(
                () -> new MemberNotFoundException("존재하지 않는 팀원입니다.")
        );
        return s3Template.createSignedGetURL(bucket, member.getProfileImageUrl(), PRESIGNED_URL_EXPIRATION);
    }
}

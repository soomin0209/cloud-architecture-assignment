package com.cloudarchitecture.member.service;

import com.cloudarchitecture.member.dto.GetMemberResponse;
import com.cloudarchitecture.member.dto.SaveMemberRequest;
import com.cloudarchitecture.member.dto.SaveMemberResponse;
import com.cloudarchitecture.member.entity.Member;
import com.cloudarchitecture.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public SaveMemberResponse saveMember(SaveMemberRequest request) {
        Member member = new Member(request.getName(), request.getAge(), request.getMbti());
        Member savedMember = memberRepository.save(member);
        return new SaveMemberResponse(
                savedMember.getName(),
                savedMember.getAge(),
                savedMember.getMbti()
        );
    }

    @Transactional
    public GetMemberResponse getMember(Long id) {
        Member member = memberRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("존재하지 않는 팀원입니다.")
        );
        return new GetMemberResponse(
                member.getName(),
                member.getAge(),
                member.getMbti()
        );
    }
}

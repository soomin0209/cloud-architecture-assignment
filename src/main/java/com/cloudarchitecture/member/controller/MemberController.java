package com.cloudarchitecture.member.controller;

import com.cloudarchitecture.member.dto.*;
import com.cloudarchitecture.member.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.net.URL;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/members")
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<SaveMemberResponse> saveMember(@Valid @RequestBody SaveMemberRequest request) {
        log.info("[API-LOG] 팀원 저장 요청: name={}, age={}, mbti={}", request.getName(), request.getAge(), request.getMbti());
        return ResponseEntity.status(HttpStatus.CREATED).body(memberService.saveMember(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetMemberResponse> getMember(@PathVariable Long id) {
        log.info("[API-LOG] 팀원 조회 요청: id={}", id);
        return ResponseEntity.status(HttpStatus.OK).body(memberService.getMember(id));
    }

    @PostMapping("/{id}/profile-image")
    public ResponseEntity<UploadImageResponse> uploadImage(@PathVariable Long id, @RequestParam("image") MultipartFile image) {
        String key = memberService.uploadImage(id, image);
        return ResponseEntity.ok(new UploadImageResponse(key));
    }

    @GetMapping("/{id}/profile-image")
    public ResponseEntity<DownloadImageResponse> downloadImage(@PathVariable Long id) {
        URL url = memberService.downloadImage(id);
        return ResponseEntity.ok(new DownloadImageResponse(url.toString()));
    }
}

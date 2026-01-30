package com.cloudarchitecture.member.controller;

import com.cloudarchitecture.member.dto.GetMemberResponse;
import com.cloudarchitecture.member.dto.SaveMemberRequest;
import com.cloudarchitecture.member.dto.SaveMemberResponse;
import com.cloudarchitecture.member.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}

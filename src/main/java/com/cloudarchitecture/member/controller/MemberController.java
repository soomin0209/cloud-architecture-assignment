package com.cloudarchitecture.member.controller;

import com.cloudarchitecture.member.dto.GetMemberResponse;
import com.cloudarchitecture.member.dto.SaveMemberRequest;
import com.cloudarchitecture.member.dto.SaveMemberResponse;
import com.cloudarchitecture.member.service.MemberService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/members")
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<SaveMemberResponse> saveMember(@RequestBody SaveMemberRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(memberService.saveMember(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetMemberResponse> getMember(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(memberService.getMember(id));
    }
}

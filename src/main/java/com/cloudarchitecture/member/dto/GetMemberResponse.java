package com.cloudarchitecture.member.dto;

import lombok.Getter;

@Getter
public class GetMemberResponse {

    private final String name;
    private final int age;
    private final String mbti;

    public GetMemberResponse(String name, int age, String mbti) {
        this.name = name;
        this.age = age;
        this.mbti = mbti;
    }
}

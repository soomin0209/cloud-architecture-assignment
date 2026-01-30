package com.cloudarchitecture.member.dto;

import lombok.Getter;

@Getter
public class SaveMemberResponse {

    private final String name;
    private final int age;
    private final String mbti;

    public SaveMemberResponse(String name, int age, String mbti) {
        this.name = name;
        this.age = age;
        this.mbti = mbti;
    }
}

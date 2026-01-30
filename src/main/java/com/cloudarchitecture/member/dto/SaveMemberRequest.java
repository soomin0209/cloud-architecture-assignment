package com.cloudarchitecture.member.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class SaveMemberRequest {

    @NotBlank(message = "이름이 입력되지 않았습니다.")
    private String name;
    @NotNull(message = "나이가 입력되지 않았습니다.")
    private int age;
    @NotBlank(message = "MBTI가 입력되지 않았습니다.")
    private String mbti;
}

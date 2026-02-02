package com.cloudarchitecture.member.dto;

import lombok.Getter;

@Getter
public class UploadImageResponse {

    private final String key;

    public UploadImageResponse(String key) {
        this.key = key;
    }
}

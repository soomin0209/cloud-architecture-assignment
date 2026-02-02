package com.cloudarchitecture.member.exception;

import com.cloudarchitecture.common.exception.ServiceException;
import org.springframework.http.HttpStatus;

public class ImageUploadException extends ServiceException {
    public ImageUploadException(String message) {
        super(HttpStatus.INTERNAL_SERVER_ERROR, message);
    }
}

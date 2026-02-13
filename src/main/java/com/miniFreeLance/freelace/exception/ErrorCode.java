package com.miniFreeLance.freelace.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION (9999, "Uncategorized_exception_Error", HttpStatus.INTERNAL_SERVER_ERROR),
//    INVALID_KEY(10001, "Invalid message key", HttpStatus.BAD_REQUEST),
    USER_EXISTED (1001, "User existed", HttpStatus.BAD_REQUEST),
    USER_NOT_EXISTED (1004, "User not existed", HttpStatus.NOT_FOUND),
    UNAUTHENTICATED(1007, "User unauthenticated", HttpStatus.UNAUTHORIZED);

    ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }

    private int code;
    private String message;
    private HttpStatusCode statusCode;

}


package com.jwtexample.springsecurity.dto;

import lombok.Data;

@Data
public class RefreshTokenRequest {

    private String token;
}

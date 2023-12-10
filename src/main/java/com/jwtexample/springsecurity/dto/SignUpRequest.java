package com.jwtexample.springsecurity.dto;

import lombok.Data;

@Data
public class SignUpRequest {

    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String password;
}

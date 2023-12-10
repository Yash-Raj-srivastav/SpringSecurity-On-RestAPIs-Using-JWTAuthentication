package com.jwtexample.springsecurity.services;

import com.jwtexample.springsecurity.dto.JwtAuthenticationResponse;
import com.jwtexample.springsecurity.dto.RefreshTokenRequest;
import com.jwtexample.springsecurity.dto.SignInRequest;
import com.jwtexample.springsecurity.dto.SignUpRequest;
import com.jwtexample.springsecurity.entities.User;

public interface AuthenticationService {

    User signup(SignUpRequest signUpRequest);
    JwtAuthenticationResponse signin(SignInRequest signInRequest);
    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}

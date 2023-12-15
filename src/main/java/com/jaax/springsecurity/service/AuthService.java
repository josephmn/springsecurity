package com.jaax.springsecurity.service;

import com.jaax.springsecurity.controller.model.AuthResponse;
import com.jaax.springsecurity.controller.model.AuthenticationRequest;
import com.jaax.springsecurity.controller.model.RegisterRequest;

public interface AuthService {

    AuthResponse register(RegisterRequest request);

    AuthResponse authenticate(AuthenticationRequest request);
}

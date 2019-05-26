package com.heiwig.microserviceenv.accountservice.service;

import com.heiwig.microserviceenv.accountservice.client.AuthServiceFeignClient;
import com.heiwig.microserviceenv.accountservice.dto.UserDto;
import com.heiwig.microserviceenv.accountservice.dto.UserRegistrationDto;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final AuthServiceFeignClient authServiceFeignClient;

    public AccountServiceImpl(AuthServiceFeignClient authServiceFeignClient) {
        this.authServiceFeignClient = authServiceFeignClient;
    }

    @Override
    public UserDto create(UserRegistrationDto user) {
        return authServiceFeignClient.createUser(user);
    }
}

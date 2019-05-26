package com.heiwig.microserviceenv.accountservice.service;


import com.heiwig.microserviceenv.accountservice.dto.UserDto;
import com.heiwig.microserviceenv.accountservice.dto.UserRegistrationDto;

public interface AccountService {

    /**
     * Invokes Auth Service user creation
     *
     * @param user
     * @return created account
     */
    UserDto create(UserRegistrationDto user);
}

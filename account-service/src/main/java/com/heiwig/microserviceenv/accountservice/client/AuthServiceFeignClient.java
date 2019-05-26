package com.heiwig.microserviceenv.accountservice.client;

import com.heiwig.microserviceenv.accountservice.dto.UserDto;
import com.heiwig.microserviceenv.accountservice.dto.UserRegistrationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "auth-service")
public interface AuthServiceFeignClient {

    @PostMapping(value = "/uaa/user")
    UserDto createUser(@RequestBody UserRegistrationDto user);

}

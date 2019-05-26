package com.heiwig.microserviceenv.authservice.service;

import com.heiwig.microserviceenv.authservice.domain.User;

public interface UserService {
    User create(User user);
}

package com.testframework.automation.service;

import com.testframework.automation.client.UserFeignClient;
import com.testframework.automation.dto.UserRequestDto;
import com.testframework.automation.dto.UserResponseDto;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserFeignClient userFeignClient;

    public UserService(UserFeignClient userFeignClient) {
        this.userFeignClient = userFeignClient;
    }

    public UserResponseDto getUser(Long id) {
        return userFeignClient.getUserById(id);
    }

    public UserResponseDto createUser(UserRequestDto request) {
        return userFeignClient.createUser(request);
    }
}

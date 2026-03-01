package com.testframework.automation.controller;

import com.testframework.automation.dto.CreateUserRequest;
import com.testframework.automation.dto.CreateUserResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController_local {

    @PostMapping("/create")
    public CreateUserResponse createUser(@RequestBody CreateUserRequest request) {

        // Fake DB save (demo)
        Long generatedId = 1L;

        return CreateUserResponse.builder()
                .id(generatedId)
                .name(request.getName())
                .email(request.getEmail())
                .message("User created successfully")
                .build();
    }
}

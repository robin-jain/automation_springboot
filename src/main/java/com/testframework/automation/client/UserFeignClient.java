package com.testframework.automation.client;

import com.testframework.automation.dto.UserRequestDto;
import com.testframework.automation.dto.UserResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(
        name = "user-service",
        url = "${user.service.url}"

)
public interface UserFeignClient {

    @GetMapping("/users/{id}")
    UserResponseDto getUserById(@PathVariable("id") Long id);

    @PostMapping("/users")
    UserResponseDto createUser(@RequestBody UserRequestDto request);
}

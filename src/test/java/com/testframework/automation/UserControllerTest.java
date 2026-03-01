package com.testframework.automation;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.testframework.automation.dto.CreateUserRequest;
import com.testframework.automation.dto.CreateUserResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void createUser_shouldReturnResponseDto() throws Exception {

        // 1. Create request DTO
        CreateUserRequest request = CreateUserRequest.builder()
                .name("John")
                .email("john@example.com")
                .phone("9876543210")
                .build();

        // 2. Convert request DTO to JSON
        String jsonRequest = objectMapper.writeValueAsString(request);

        // 3. Perform POST request
        MvcResult result = mockMvc.perform(post("/api/users/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonRequest))
                .andExpect(status().isOk())
                .andReturn();

        // 4. Get JSON response as String
        String jsonResponse = result.getResponse().getContentAsString();

        // 5. Convert JSON → Response DTO
        CreateUserResponse response =
                objectMapper.readValue(jsonResponse, CreateUserResponse.class);

        // 6. Assert on DTO fields (NOT jsonPath)
        System.out.println(response);
        assertEquals(1L, response.getId());
        assertEquals("John", response.getName());
        assertEquals("john@example.com", response.getEmail());
        assertEquals("User created successfully", response.getMessage());
    }
}

package com.testframework.automation;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ExternalApiServiceTest extends BaseTest {

    @Autowired
    private WireMockServer wireMockServer;

    @Test
    void shouldCallExternalApiSuccessfully() {
        System.out.println("WireMock running at: " + wireMockServer.baseUrl());
        print();
    }
}

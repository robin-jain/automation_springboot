package com.testframework.automation;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
abstract class BaseTest {

    public void print(){
        System.out.println("--------------BaseIntegrationTest-----------------");
    }
}

package com.testframework.automation.config;


import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import com.testframework.automation.AutomationApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = AutomationApplication.class)
public class CucumberSpringConfig {
}

package com.testframework.automation.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
@Getter
@Setter            // 🔥 THIS IS REQUIRED
public class AppProperties {

    private String environmentName;
    private boolean featureXEnabled;
    private String buildVersion;
}

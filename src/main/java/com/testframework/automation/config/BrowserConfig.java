package com.testframework.automation.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BrowserConfig {

    @Value("${browser.name}")
    private String browser;

    @Value("${headless:false}")
    private boolean headless;

    public String getBrowser() {
        if (browser == null || browser.isBlank()) {
            throw new RuntimeException(
                    "Property 'browser' is NOT set in application properties"
            );
        }
        return browser;
    }

    public boolean isHeadless() {
        return headless;
    }
}

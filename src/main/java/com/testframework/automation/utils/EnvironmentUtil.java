package com.testframework.automation.utils;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentUtil {

    private final Environment environment;

    public EnvironmentUtil(Environment environment) {
        this.environment = environment;
    }

    public String getEnv() {

        // 1️⃣ JVM override (highest priority)
        String env = System.getProperty("env");
        if (env != null && !env.isBlank()) {
            return env.toLowerCase();
        }

        // 2️⃣ application.yml / application-test.yml
        env = environment.getProperty("env");
        if (env != null && !env.isBlank()) {
            return env.toLowerCase();
        }

        // 3️⃣ spring profile fallback
        String[] profiles = environment.getActiveProfiles();
        if (profiles.length > 0) {
            return profiles[0].toLowerCase();
        }

        // 4️⃣ safe default
        return "qa";
    }
}

package com.testframework.automation;

import com.testframework.automation.config.AppProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;


 class AppPropertiesPrint extends BaseTest{


    @Autowired
    private AppProperties appProperties;

    @Autowired
    private Environment env;

    @Test
    void printTestProperties() {
        System.out.println(appProperties.getEnvironmentName());
        System.out.println(appProperties.isFeatureXEnabled());
        System.out.println(appProperties.getBuildVersion());
        System.out.println("Active profiles: " +
                String.join(",", env.getActiveProfiles()));
        System.out.println("Raw envName = " +
                env.getProperty("app.environment.name"));
    }
}

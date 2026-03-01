package com.testframework.automation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;


class PropertyPrintTest extends BaseTest {

    @Value("${app.environment.name}")
    private String envName;

    @Value("${app.featureX.enabled}")
    private boolean featureXEnabled;

    @Value("${app.build.version}")
    private String buildVersion;
    @Value("${app.build.version2}")
    private String buildVersion2;

    @Test
    void printTestProperties() {
        System.out.println("Environment Name = " + envName);
        System.out.println("Feature X Enabled = " + featureXEnabled);
        System.out.println("Build Version = " + buildVersion);
        System.out.println("Build Version2 = " + buildVersion2);
    }
}

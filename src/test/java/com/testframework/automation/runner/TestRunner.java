package com.testframework.automation.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberOptions(
        tags="@smoke",
//        however we should not use tag in runner class
//        mvn test -Dcucumber.filter.tags="@smoke or @sanity"
//        mvn test -Dcucumber.filter.tags="@regression and not @slow"
//        mvn test -Dcucumber.filter.tags="@smoke or @sanity"
        features = "src/test/resources/features",
        glue = {
                "com.testframework.automation.stepdefinitions",
                "com.testframework.automation.hooks",
                "com.testframework.automation.config"
        },
        plugin = {
                "pretty",
                "html:target/cucumber-report.html"
        },
        monochrome = true
)
@SpringBootTest
public class TestRunner extends AbstractTestNGCucumberTests {
}

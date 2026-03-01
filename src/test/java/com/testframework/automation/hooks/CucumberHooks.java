package com.testframework.automation.hooks;

import com.aventstack.extentreports.ExtentReports;

import com.testframework.automation.data.ScenarioContext;
import com.testframework.automation.execution.ExecutionRegistry;
import com.testframework.automation.utils.ExtentManager;
import com.testframework.automation.utils.ExtentScenarioManager;
import com.testframework.automation.utils.ScreenshotUtil;
import com.testframework.automation.driver.DriverFactory;
import com.testframework.automation.driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class CucumberHooks {

    @Autowired
    private DriverFactory driverFactory;   // ✅ This WILL work

    private static final ExtentReports extent =
            ExtentManager.getInstance();

    @Autowired
    private ScenarioContext scenarioContext;
    @Before
    public void beforeScenario(Scenario scenario) {
        // 0️⃣ Initialize ScenarioContext (TEST DATA)
        System.out.println("Scenario Tags: " + scenario.getSourceTagNames());

        String testCaseName =
                scenario.getName().split("-")[0].trim();
        // 🚦 EXECUTION CONTROL
        if (!ExecutionRegistry.shouldExecute(testCaseName)) {
            throw new PendingException(
                    "Skipping execution for test case: " + testCaseName
            );
        }

        scenarioContext.init(testCaseName);

        System.out.println(testCaseName);
        scenarioContext.init(testCaseName);

        // 1️⃣ Create WebDriver
        WebDriver driver = driverFactory.createDriver();
        DriverManager.setDriver(driver);

        // 2️⃣ Create Extent test (Scenario = Test Case)
        ExtentScenarioManager.setScenario(
                extent.createTest(scenario.getName())

        );
    }

    @After
    public void afterScenario(Scenario scenario) {

        if (scenario.isFailed()) {
            String path = ScreenshotUtil.capture(scenario.getName());
            ExtentScenarioManager.getScenario()
                    .fail("Scenario Failed")
                    .addScreenCaptureFromPath(path);
        } else {
//            ExtentScenarioManager.getScenario().pass("Scenario Passed");
        }

        DriverManager.quitDriver();
        ExtentScenarioManager.remove();
        extent.flush();
    }
}

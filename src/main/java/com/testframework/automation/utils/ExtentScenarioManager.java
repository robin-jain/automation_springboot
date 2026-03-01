package com.testframework.automation.utils;

import com.aventstack.extentreports.ExtentTest;

public class ExtentScenarioManager {

    private static ThreadLocal<ExtentTest> scenario = new ThreadLocal<>();

    // Set Extent test for current scenario
    public static void setScenario(ExtentTest test) {
        scenario.set(test);
    }

    // Get Extent test for current scenario
    public static ExtentTest getScenario() {
        return scenario.get();
    }

    // Clear after scenario execution
    public static void remove() {
        scenario.remove();
    }
}

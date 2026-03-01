package com.testframework.automation.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.testframework.automation.utils.ExtentManager;
import com.testframework.automation.utils.ExtentTestManager;
import com.testframework.automation.utils.ScreenshotUtil;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    private static final ExtentReports extent =
            ExtentManager.getInstance();

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTestManager.setTest(
                extent.createTest(result.getMethod().getMethodName())
        );
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentTestManager.getTest().pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String path = ScreenshotUtil.capture(result.getName());
        ExtentTestManager.getTest()
                .fail(result.getThrowable())
                .addScreenCaptureFromPath(path);
    }

    @Override
    public void onFinish(org.testng.ITestContext context) {
        extent.flush();
        ExtentTestManager.unload();
    }
}

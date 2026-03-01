package com.testframework.automation.pages;

import com.testframework.automation.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    private static final Duration DEFAULT_TIMEOUT = Duration.ofSeconds(15);

    protected WebDriver driver() {
        return DriverManager.getDriver();
    }

    protected WebDriverWait getWait() {
        return new WebDriverWait(driver(), DEFAULT_TIMEOUT);
    }

    protected WebElement waitForVisible(By locator) {
        return getWait().until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );
    }

    protected WebElement waitForClickable(By locator) {
        return getWait().until(
                ExpectedConditions.elementToBeClickable(locator)
        );
    }

    protected void click(By locator) {
        waitForClickable(locator).click();
    }

    protected void type(By locator, String text) {
        WebElement element = waitForVisible(locator);
        element.clear();
        element.sendKeys(text);
    }
    protected void openUrl(String url) {
        driver().get(url);
    }
    protected String getTitle() {
        return driver().getTitle();
    }
}


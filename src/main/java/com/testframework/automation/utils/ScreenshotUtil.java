package com.testframework.automation.utils;


import com.testframework.automation.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenshotUtil {

    public static String capture(String testName) {

        try {
            WebDriver driver = DriverManager.getDriver();
            File src = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);

            String timestamp = LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));

            String path = "screenshots/" + testName + "_" + timestamp + ".png";

            Files.createDirectories(Path.of("screenshots"));
            Files.copy(src.toPath(), Path.of(path));

            return path;

        } catch (Exception e) {
            throw new RuntimeException("Screenshot capture failed", e);
        }
    }
}

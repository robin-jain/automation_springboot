package com.testframework.automation.flows;

import com.testframework.automation.data.ScenarioContext;
import org.testng.Assert;
import com.testframework.automation.driver.DriverManager;
import com.testframework.automation.pages.LoginPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class LoginFlow {

    @Autowired
    private LoginPage loginPage;
    @Autowired
    private ScenarioContext scenarioContext;
    public void openLoginPage() {
        loginPage.open();
    }

    public void login(String user, String pass) {
        loginPage.login(user, pass);
    }

    public void verifyHomePage() {
        Assert.assertTrue(
                DriverManager.getDriver().getTitle().contains("Automation"));
        System.out.println(DriverManager.getDriver().getTitle());
    }
    public void login() {

        String username =
                scenarioContext.get("username", String.class);

        String password =
                scenarioContext.get("password", String.class);

        loginPage.login(username, password);

        System.out.println("user name "+username+"  ----    -"+"   Password is   "+password);
    }
}

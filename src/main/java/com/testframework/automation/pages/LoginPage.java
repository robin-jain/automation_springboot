package com.testframework.automation.pages;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class LoginPage extends BasePage {
    @Value("${base.url}")
    private String baseURL;
    private final By usernameInput = By.id("username");
    private final By passwordInput = By.id("password");
    private final By loginButton   = By.id("login");

    public void open(){
        openUrl(baseURL);
    }
    public void login(String user, String pass) {
        type(usernameInput, user);
        type(passwordInput, pass);
        click(loginButton);
    }
}



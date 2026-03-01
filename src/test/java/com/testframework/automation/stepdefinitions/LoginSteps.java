package com.testframework.automation.stepdefinitions;

import com.testframework.automation.flows.LoginFlow;
import com.testframework.automation.utils.ExtentScenarioManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginSteps {

    @Autowired
    private LoginFlow loginFlow;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        loginFlow.openLoginPage();
        ExtentScenarioManager.getScenario()
                .info("User enters username and password");

    }

    @When("user logs in with username {string} and password {string}")
    public void user_logs_in(String user, String pass) {
        loginFlow.login(user, pass);
    }

    @Then("user should see home page")
    public void user_should_see_home_page() {
        loginFlow.verifyHomePage();
    }
    @When("user logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        loginFlow.login();
    }
}

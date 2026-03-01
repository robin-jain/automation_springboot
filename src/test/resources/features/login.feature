Feature: Login
  @smoke @critical
  Scenario: TC_LOGIN_001 - Valid login
    Given user is on login page
    When user logs in with valid credentials
    Then user should see home page


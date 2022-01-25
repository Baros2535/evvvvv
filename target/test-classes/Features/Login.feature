
Feature: Home Page Body Check
  Scenario: AC - 8 user should see Login Page
    Given Go to URL "https://www.ev-comply.com/"
    When user click Login
    Then Verify URL "https://app.ev-comply.com/auth/register#login"



@wip
Feature: Home Page Body Check
  Scenario: AC - 8 user should see Login Page
    Given User is on the given URL
    When user click Login
    Then Verify URL "https://app.ev-comply.com/auth/register#login"



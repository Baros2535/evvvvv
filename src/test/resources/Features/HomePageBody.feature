@wip
Feature: Home Page Body Check

  Background:
    Given User is on the given URL

  Scenario: User should be able load the Url
    Then Verify that user at the URL successfully

  Scenario: User should be able to see "Simplifying your EV Charger installations" at the page
    Then Verify that user sees "Simplifying your EV Charger installations" at the page

   Scenario:User should be able to see "Register interest" at the page
     Then Verify that user sees "Register interest" at the page

  Scenario:ser should be able to see "Watch Our Intro" at the page
    Then Verify that user sees "Watch Our Intro" at the page

  Scenario:User should be able to see the mobile app store links on the page
    Then Verify that user sees the mobile app store links on the page

  Scenario:User should be able to see following links on the the footer
    Then Verify that user sees following links on the the footer
      |About|
      |Pods & Blogs|
      |Partners|
      |Testimonials|
      |EVC Network|
      |Careers|
      |Sign-in|
      |Register interest|

  Scenario:User should be able to see following options end of the page
    Then Verify that user sees following options end of the page
      | Privacy Policy       |
      | Terms & Conditions |








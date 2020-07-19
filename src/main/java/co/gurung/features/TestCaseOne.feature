Feature: Login Action
  This is the description of the login action as the documentation of the feature.

@LoginAction
  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters UserName and Password
    Then Message displayed Login Successfully
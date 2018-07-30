Feature: This feature is about logging in the system

  Scenario: Successful login
    Given I have opened homepage
    When I select My account menu
    And I select Login button
    And I enter login Email
    And I enter login Password
    And I select Login form button
    Then user account page is opened
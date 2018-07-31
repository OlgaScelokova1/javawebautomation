Feature: This feature is about logging in the system

  Scenario: Successful login
    Given I have opened homepage
      And I select My account menu
      And I select Sign up button
      And I create account
      And I select Sign up button
      And user account page is opened
      And I logout from account page
      And login page is opened
    When I enter login Email
    And I enter login Password
    And I select Login form button
    Then user account page is opened
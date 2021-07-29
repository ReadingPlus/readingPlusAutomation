Feature: Educator login

  @smoke
  Scenario: As an Educator, I should be able to login to my account

    Given I am on login page
    When I click on Educator Login button
    And I enter my username and password and I click on login button
    Then I should be able to see Overview page title



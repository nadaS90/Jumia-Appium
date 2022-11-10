Feature: User can login
  Scenario: Guest user could login with valid data successfully
    Given user select country
    And  user choose language
    Then user navigates to Account page
    When user click Login
    And enter email
    And click Continue
    And user enter password
    And click login button
    Then user could login successfully
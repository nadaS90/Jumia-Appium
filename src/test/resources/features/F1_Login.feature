Feature: User can login
  @test
  Scenario: Guest user could login with valid data successfully
    Given user navigates to Account page
    When user click Login
    And enter email
    And click Continue
    And user enter password
    And click login button
    Then user could login successfully
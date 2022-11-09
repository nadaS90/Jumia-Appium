Feature: User add shipping address
  Scenario: User can add shipping address to complete purchasing
    Given user navigates to cart
    When click on total amount
    Then user directed to add new address
    When user fill mandatory fields
    And click save button
    Then user directed to Checkout page

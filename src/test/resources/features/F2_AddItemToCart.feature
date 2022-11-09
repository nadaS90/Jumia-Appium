Feature: User can swap till find item
  Scenario: User can swipe home page till find item to buy
    Given user navigates to Home page
    Then user scroll down till required section
    And user click on the section
    And click Continue
    Then ser swipe to the left till required item
    And click on the item
    When click on add to cart button
    Then Item added successfully to the cart

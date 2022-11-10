Feature: User can swap till find item
  @test
  Scenario: User can swipe home page till find item to buy
    Given user scroll down till required section
    And user click on the section
    Then user swipe to the left till required item
    And click on the item
    When click on add to cart button
    Then Item added successfully to the cart
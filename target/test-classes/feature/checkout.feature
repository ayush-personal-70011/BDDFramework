
@smoke
Feature: Test the checkout functionality

  @Checkout
  Scenario Outline: Validating checkout functionality
    Given User is on GreenCart landing page
    When User search with the sort name <name> and extract the actual result
    And Add "3" quantity of the product
    Then User proceed to the checkout page
    And Validate the <name> item in the checkout page
    And verify the promocode apply button and placeorder button
    
    Examples: 
    | name |
    | Tom  |
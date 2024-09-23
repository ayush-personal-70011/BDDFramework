
@smoke
Feature: Test the search functionality

  @searchproduct
  Scenario Outline: Validating the search functionality
    Given User is on GreenCart landing page
    When User search with the sort name <name> and extract the actual result
    Then User search with the <name> on offers page
    And validate the result
    
    Examples: 
    | name |
    | Tom  |
    | Beet |
    
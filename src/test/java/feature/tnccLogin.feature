@tag
Feature: Test the login funtionality
  
  @tnccLogin
  Scenario Outline: Test the admin login scenario
    Given user is on tncc login page
    When user enters <username> and <password> in the login page
    And clicks on the login button
    Then user should land on the homepage

    Examples: 
      | username          | password  |
      | peter@yopmail.com | Admin@123 |

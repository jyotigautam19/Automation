Feature: Login functionality

  Scenario Outline: Verify login with valid credentials
    Given the user is on the login page
    When the user enters <username> and <password>
    And clicks on login button
    Then the user is navigated to the home page
    
    Examples:
    |username|password|
		|Raghav|12345|
		|ele|12345|
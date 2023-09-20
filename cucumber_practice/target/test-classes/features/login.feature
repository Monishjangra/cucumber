Feature: To test the login functionality of shopping aaplication.

  Scenario: Test login functionality for valid username and password.
    Given Setup browser driver and navigate to the home page.
    When Verify the tittle is homepage.
    Then Select login option.
    Then Enter valid username and password.
    Then Click on sign in button.
    And Verify dashboard.
    Then Close the browser.
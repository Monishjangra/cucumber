Feature: To test the login functionality of shopping aaplication.

  Scenario: Test login functionality for valid username and password.
    Given Setup browser driver and navigate to the home page.
    When Verify the tittle is homepage.
    Then Select login option.
#    Then Enter valid username and password.
    Then Enter valid "monish@gmail.com" and "user".
    Then Click on sign in button.
    And Verify dashboard.
    Then Close the browser.

# Scenario Outline: Test login functionality for invalid username and password.
#    Given Setup browser driver and navigate to the home page.
#    When Verify the tittle is homepage.
#    Then Select login option.
#    Then Enter invalid <username> and <password>.
#    Then Click on sign in button.
#    And Verify dashboard.
#    Then Close the browser.
#  Examples:
#  | username      | password |
#  | abc@gmail.com | user     |
#  | xyz@gmail.com | user     |
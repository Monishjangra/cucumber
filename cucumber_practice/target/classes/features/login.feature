Feature: shopping app feature

  Scenario: login check
    Given user is on home page
    When title of login page is Login Manager
    Then click login page
    Then enter username and password
    Then click login button
    Then user is on home dashboard

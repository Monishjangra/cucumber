Feature: to test login functionality

Scenario: login ckeck
Given user is on home page
When tittle is home
Then user click login button
Then user enter email and password
Then user click submit button
Then user is navigated to home dashboard

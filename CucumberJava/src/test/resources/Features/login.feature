Feature: Login to Practice Automation Test website


Scenario: Check login is successful

Given user is on login page
When user scrolls down
And enter username and password
And clicks on submit button
Then user is navigated to home page

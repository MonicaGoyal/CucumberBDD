Feature: Checking write mail function

Background:

Given user is on login page
When user enters his valid username and password


Scenario:Checking logging function

And clicks on login button
Then user is navigated to the home page

Scenario:Checking writemail function

And clicks on login button
Then user is navigated to the home page
When user clicks write mail button
Then compose mail option opens


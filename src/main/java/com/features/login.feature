Feature: FreeCRM Login Feature

Scenario: Login Test

Given User is already on Login Page
When Title of Login Page is FreeCRM
Then User enters User Name
And User enters Password
And User clicks on Login Button
And Verify User is on Home Page
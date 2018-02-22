Feature: FreeCRM Login Feature


#Data driven with out Examples keyword
#Scenario: Login Test

#Given User is already on Login Page
#When Title of Login Page is FreeCRM
#Then User enters "maddymb"
#And User enters "madhur123"
#And User clicks on Login Button
#And Verify User is on Home Page


# Data driven with Examples Keyword
Scenario Outline: Login Test

Given User is already on Login Page
When Title of Login Page is FreeCRM
Then User enters "<username>"
And User enters "<password>"
And User clicks on Login Button
And Verify User is on Home Page


Examples:

| username | password |
| maddymb  | madhur123|
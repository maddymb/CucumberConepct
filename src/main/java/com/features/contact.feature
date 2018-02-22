Feature: FreeCRM Create Contact Feature
Scenario Outline: Create Contact Test

Given User is already on Login Page
When Title of Login Page is FreeCRM
Then User enters Uname "<username>"
And User enters Pass "<password>"
And User clicks on Login Button
And Verify User is on Home Page
Then User goes to Create Contact Page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"



Examples:

| username | password  | firstname | lastname | position |
| maddymb  | madhur123 | Madhur    | Bharadwaj| Ceo	    |	
Feature: FreeCRM Deals Feature 
Scenario: Fill Deals Details Test 

	Given User is already on Login Page 
	When Title of Login Page is FreeCRM 
	Then User enters Uname and password 
		| maddymb | madhur123 |
	And User clicks on Login Button 
	And Verify User is on Home Page 
	Then User goes to Deals Page 
	Then user enters deals details 
		|abc | 2000| 60|
		
		

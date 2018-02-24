Feature: FreeCRM Deals Feature 
Scenario: Fill Deals Details Test 

	Given User is already on Login Page 
	When Title of Login Page is FreeCRM 
	Then User enters Uname and password 
		| username| password	 |
		| maddymb | madhur123 |
	And User clicks on Login Button 
	And Verify User is on Home Page 
	Then User goes to Deals Page 
	Then user enters deals details
		| title|amount|probability| 
		|abc1 | 2000| 60|
		|abc2 | 3000| 70|
		|abc3 | 4000| 30|
		|abc4 | 5000| 40|
				
		
		

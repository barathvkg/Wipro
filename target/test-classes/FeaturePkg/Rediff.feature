Feature: Store Signin
https://www.rediff.com/

  Scenario: Login with correct username and correct password
	Given I navigate to website page
	When I clicked signin link
	When I clicked create account link
	And I entered the details
	Then I clicked the create account button
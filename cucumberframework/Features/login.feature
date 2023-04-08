Feature: Login with valid credentials

Scenario: Successful login with valid credentials
	Given Launch browser
	And open url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
	When user enters Username as "admin@yourstore.com"
	And enters Password as "admin"
	And clicks on Login button
	Then User navigates to Home page
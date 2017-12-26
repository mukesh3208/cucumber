Feature: Login in PHPTravels application

Scenario Outline: Login in valid username and password
	Given Account already exists with valid <EmailAddress> and <Password>
	When user Navigate to <url>
	And Enter valid <EmailAddress> and valid <Password> 
	And click on Login button
	Then Login should be successful and dashboard page with heading <outcome> should be displayed
	
	Examples: 
	|	url																		|	EmailAddress					| Password	|	outcome								|
	|	https://phptravels.org/clientarea.php	|	mukesh3208@gmail.com	|	Hindu@200	|	Welcome Back, Mukesh	|
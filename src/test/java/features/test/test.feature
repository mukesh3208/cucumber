@bankAccounts @deposit
Feature: Test Account Amount
	This feature is 
	to 
	test 
	amount in account
	
	Background: Pre-requisites
	Given ICICI bank branch exists in Gurugram
	
	@savingBankAccount @deposit
	Scenario Outline: To test amount in new Savings bank account
		Given I have an new Savings bank account
		When I depositied $<depositedAmount> amount
		Then Account balance will be $<outcome>

	Examples: 	
		|	depositedAmount	|	outcome	|
		|	100							|	100			|
		|	200							|	300			|
		|	300							|	600			|
		
	@currentBankAccount @deposit
	Scenario: To test amount in new Current bank account
		Given I have a new Current bank account in <bankName> in Country <countryName>
		|	bankName	|	countryName	|
		|	Citi Bank	|	USA					|
		|	SBI				|	India				| 
		
		When I depositied $200 amount
		Then Account balance will be $200

		
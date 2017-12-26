package com.multiple.features.cucumber.common;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepDefenition {
	
	@Given("^ICICI bank branch exists in Gurugram$")
	public void ICICI_bank_branch_exists_in_Gurugram()
	{
		System.out.println("ICICI bank branch exists in Gurugram");
	}
	
	@Given("^I have an new (\\w*) bank account$")
	public void I_have_an_new_Savings_bank_account(String accountType)
	{
		System.out.println("I have an new "+accountType+" bank account");
	}
	
	@When("^I depositied \\$(\\d+) amount$")
	public void I_depositied_amount(float depositedAmount)
	{
		System.out.println("I depositied $"+depositedAmount+" amount");
	}
	
	@Then("^Account balance will be \\$(\\d*)$")
	public void Account_balance_will_be(float balanceAmount)
	{
		System.out.println("Account balance will be "+"$"+balanceAmount);
	}

	@Given("^I have a new Current bank account in (.*) in Country (.*)$")
	public void I_have_a_new_Current_bank_account_in_bankname_in_Country(String bankName, String countryName, DataTable table)
	{
		List<Map<String,String>> data =table.asMaps(String.class, String.class);
		System.out.println("I have a new Current bank account in "+data.get(0).get("bankName")+" in Country "+data.get(0).get("countryName"));
		System.out.println("I have a new Current bank account in "+data.get(1).get("bankName")+" in Country "+data.get(1).get("countryName"));

	}
}

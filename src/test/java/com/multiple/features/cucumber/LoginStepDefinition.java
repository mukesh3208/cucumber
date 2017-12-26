package com.multiple.features.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.multiple.features.cucumber.common.Setup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	public static WebDriver driver;
	Setup setup = new Setup();
	WebElement element;

	@Given("^Account already exists with valid (.*) and (.*)$")
	public void Account_already_exists_with_valid_emailaddress_and_password(String EmailAddress, String Password)
	{
		System.out.println("Account already exists with valid email adddress as "+EmailAddress+" and password as "+Password);
	}

	@When("^user Navigate to (.*)$")
	public void user_Navigate_to(String url)
	{
		System.out.println("Navigate to url- "+url);
		driver = setup.startup();
		driver.get("https://phptravels.org/clientarea.php");

	}

	@And("^Enter valid (.*) and valid (.*)$")
	public void Enter_valid(String EmailAddress, String Password)
	{
		System.out.println("Enter valid "+EmailAddress+" and valid "+Password);
		element = driver.findElement(By.id("inputEmail"));
		element.sendKeys(EmailAddress);
		element = driver.findElement(By.id("inputPassword"));
		element.sendKeys(Password);		
	}
	@And("^click on Login button$")
	public void click_on_Login_button()
	{
		System.out.println("Click on Login Button");
		//element = driver.findElement(By.xpath("//input[@id='login']"));
		element = driver.findElement(By.id("login"));
		element.click();
	}
	@Then("^Login should be successful and dashboard page with heading (.*) should be displayed$")
	public void Login_should_be_successful_and_dashboard_page_with_heading_should_be_displayed(String heading)
	{
		element = driver.findElement(By.xpath("//h1"));
		String Actualheading = element.getText();
		Assert.assertEquals(heading,Actualheading); 
		System.out.println("Login should be successful as expected heading is "+heading+" and actual heading is "+Actualheading);
	}
}

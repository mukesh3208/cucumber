package com.multiple.features.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.multiple.features.cucumber.common.Setup;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/java/features/Login"},
		glue= {"com.multiple.features.cucumber.common"}, 
		format= {"html:output"})


public class RunTests extends AbstractTestNGCucumberTests {

	RunTests()
	{
		System.out.println("Your are in RunTests constructor");
	}
}

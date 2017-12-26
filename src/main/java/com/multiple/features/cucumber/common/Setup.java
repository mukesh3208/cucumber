package com.multiple.features.cucumber.common;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import cucumber.api.CucumberOptions;




public class Setup {
	Keywords keyword = new Keywords();
	public static WebDriver driver;
	@BeforeTest
	public WebDriver startup() {
		driver = keyword.openApp("Chrome");
		return driver;
	}
	

}
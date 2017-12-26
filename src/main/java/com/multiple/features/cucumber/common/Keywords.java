package com.multiple.features.cucumber.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Keywords {
	public static WebDriver driver;
	public String chromeExepath = "/drivers/chromedriver.exe";
	public ChromeOptions chromeOptions;
	public WebDriver openApp(String appName)
	{
		if(appName.equalsIgnoreCase("chrome"))
		{
			driver = initiateChrome();
		}
		return driver;
	}
	/*
	public WebDriver openApp(String appName)
	{
		appName = appName.toLowerCase();
		switch(appName)
		{
		case "chrome": driver = initiateChrome();
		case "firefox":  initiateFirefox();
		case "internetExplorer": initiateInternetExplorer();
		}
		return driver;
	}
	*/
	public WebDriver initiateChrome() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+chromeExepath);
		chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		return driver;
	}

	public void initiateInternetExplorer() {
		// TODO Auto-generated method stub

	}



	public void initiateFirefox()
	{

	}



}

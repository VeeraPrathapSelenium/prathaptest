package com.Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;

public class Definitions {
	
	@Given("Launch the browser")
	
	public static void launchBrowser()
	{
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().window().maximize();
	}

}

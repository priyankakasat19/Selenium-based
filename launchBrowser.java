package com.mycompany.app.my_selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class launchBrowser
{
	public WebDriver driver; 
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver=new ChromeDriver();
	}	
	@Test
	public void openBrowser()
	{
		driver.get("https://kite.zerodha.com");
	}	
	@Test
	public void openFacebook()
	{
		driver.get("https://www.facebook.com");
	}	
	@AfterMethod
	
	public void afterMethods()
	{
		driver.close();
	}
}

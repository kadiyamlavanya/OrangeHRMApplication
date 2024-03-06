package com.radiobuttons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.utility.Log;

public class Basetest {
	WebDriver driver;
	
	
	String ApplicationUrlAddress="https://echoecho.com/htmlforms10.htm";
		@BeforeTest
		public void Applicationlaunch()
		{

	System.setProperty("webdriver.chrome.driver","./src/drivers/chromedriver.exe");
	driver=new ChromeDriver();
			driver.get(ApplicationUrlAddress);
			driver.manage().window().maximize();
			Log.info("The chrome browser lunch successfully");
	}
		
		
		@AfterTest
		public void Applicationclose()
		{
			driver.close();
		}
	

}

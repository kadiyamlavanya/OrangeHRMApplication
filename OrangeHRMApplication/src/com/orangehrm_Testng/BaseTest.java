package com.orangehrm_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import com.utility.Log;

public class BaseTest {
	 WebDriver driver;
	
	
String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
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
package com.OHRM;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Automatebrowser {

	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\OrangeHRMApplication\\OrangeHRMApplication\\Libraries\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	driver.get(ApplicationUrlAddress);
	
	String ExpectedApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	System.out.println("The Expected Url Address of orangehrm is:-"+ExpectedApplicationUrlAddress);
	String ActualApplicationUrlAddress=driver.getCurrentUrl();
	System.out.println("The Actual Url Address of orangehrm is:-"+ActualApplicationUrlAddress);
	if(ExpectedApplicationUrlAddress.equals(ActualApplicationUrlAddress))
	{
	System.out.println("The Url Address of Orangehrm is matched:-  PASS");
	}
	else
	{
		System.out.println("The Url Address of Orangehrm is not matched:-  FAIL");
	}
	 String ExpectedTitle="OrangeHRM";
	 System.out.println("The Expected Title of orange hrm is:-"+ExpectedTitle);
	 driver.getTitle();
	 String ActualTitle=driver.getTitle();
	 System.out.println("The Actual Title of orange hrm is:-"+ActualTitle);
	 if(ExpectedTitle.equals(ActualTitle))
	 {
		 System.out.println("The orange hrm title is matched-PASS");
	 }
	 else
	 {
		 System.out.println("The orange hrm title is matched-FAIL");
	 }
	
		//<input name="txtUsername" id="txtUsername" type="text">
	String usernametestdata="Admin";
	By usernameproperty=By.id("txtUsername");
	WebElement username=driver.findElement(usernameproperty);
	username.sendKeys(usernametestdata);
	//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	
	String passwordtestdata="Livetech@123";
	By passwordproperty=By.id("txtPassword");
	WebElement password=driver.findElement(passwordproperty);
	password.sendKeys(passwordtestdata);
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	By Loginbuttonproperty=By.className("button");
	WebElement Loginbutton=driver.findElement(Loginbuttonproperty);
	Loginbutton.click();
	

	 
	
	
	 
	
	
	
	
	
	//driver.close();
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		// TODO Auto-generated method stub

	}

}

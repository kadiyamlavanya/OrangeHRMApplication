package com.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Mousehovers_click {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./src/drivers/chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		String ApplicationUrlAddress="http://Amazon.in";
		driver.get(ApplicationUrlAddress);
		// id="nav-link-accountList" - Property of Hello SignIn WebElement
		By signinproperty=By.id("nav-link-accountList");
		WebElement signin =driver.findElement(signinproperty);
		signin.click();
		
		
		
		// TODO Auto-generated method stub

	}

}

package com.TSRTC_Homepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomepagetotalLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "./src/drivers/chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		String ApplicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		driver.get(ApplicationUrlAddress);
		 By linksproperty = By.tagName("a");
		    List < WebElement> links= driver.findElements(linksproperty);  
		    int HomePageLinks=links.size();
		    System.out.println("The no.of Links in Homepage is"+HomePageLinks);
		    for(int index=0;index<HomePageLinks;index++)
		    {
		    	String TSRTClinks=links.get(index).getText();
		    	System.out.println(index+ "-"  + TSRTClinks);
		    }
		    
		

	}

}

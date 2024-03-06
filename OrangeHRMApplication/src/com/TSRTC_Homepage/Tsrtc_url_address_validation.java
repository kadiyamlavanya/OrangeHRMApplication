package com.TSRTC_Homepage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc_url_address_validation {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver" , "./src/drivers/chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		String ApplicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		driver.get(ApplicationUrlAddress);
		//<div class="menu-wrap">
		By HeaderBlock=By.className("menu-wrap");
		WebElement tsrtcheaderblock=driver.findElement(HeaderBlock);
		By linksproperty = By.tagName("a");
	    List < WebElement> links= tsrtcheaderblock.findElements(linksproperty);  
	    int HomePageLinks=links.size();
	    System.out.println("The no.of Links in Homepage is"+HomePageLinks);
	    for(int index=0;index<HomePageLinks;index++)
	    {
	    	String TSRTClinks=links.get(index).getText();
	    	System.out.println(index+ "-"  + TSRTClinks);
	    	
	    
	    links.get(index).click();
	    
	    
	    File capturedSceenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(capturedSceenshot,new File("./TSRtcScreenshots/"+TSRTClinks+".png"));
    
	    String Linktitle=driver.getTitle();
	    System.out.println(Linktitle);
	   String  LinksUrl=driver.getCurrentUrl();
	   System.out.println(LinksUrl);
	   driver.navigate().back();
	   tsrtcheaderblock= driver.findElement(HeaderBlock);
	   
	   
	  links =tsrtcheaderblock.findElements(linksproperty);
	  
	}
	    driver.quit();
	}

	
		// TODO Auto-generated method stub
		
	}



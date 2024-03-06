package com.urlcapturing;

import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_HomePage_get_URL {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\OrangeHRMApplication\\OrangeHRMApplication\\Libraries\\drivers\\chromedriver.exe");
		ChromeDriver chromeBrowser=new ChromeDriver();

		chromeBrowser.get("http://bing.com");
		String ExpectedURLofbingpage="bing.com";
		System.out.println("The Expected URL of bing page is:"+ExpectedURLofbingpage);
		String  ActualURLofbingpage=chromeBrowser.getCurrentUrl();
		System.out.println("The Actual URL of bing page is:"+ActualURLofbingpage);
            if(ActualURLofbingpage.contains(ExpectedURLofbingpage))

			

		{

			System.out.println(" The url of the Bing Home Page Matched - PASS ");

		}

		else

		{

		System.out.println("The url of the BIng Home Page NOT Matched - FAIL ");
		chromeBrowser.close();

		}
		
		
		

	}
}

package com.validatingTitle;
import org.openqa.selenium.chrome.ChromeDriver;


public class Google_HomepageTitle_Validation {

 public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\OrangeHRMApplication\\OrangeHRMApplication\\Libraries\\drivers\\chromedriver.exe");
ChromeDriver chromeBrowser=new ChromeDriver();

chromeBrowser.get("http://google.com");

		String expected_Google_HomePageTitle="Google"; 
		 
		System.out.println(" The Expected title of the Google HomePage is :- "+expected_Google_HomePageTitle);

		String acutal_google_WebPageTitle=chromeBrowser.getTitle();
		
		System.out.println(" The Actual title of the Google Home Page is :- "+acutal_google_WebPageTitle);

		if(acutal_google_WebPageTitle.equals(expected_Google_HomePageTitle))
		{
		System.out.println(" The Title of the Google Home Page Matched - PASS ");
		}
		else
		{
		System.out.println("The Title of the Google Home Page NOT Matched - FAIL ");
		}

		chromeBrowser.close();

		}

		

		// TODO Auto-generated method stub

	}



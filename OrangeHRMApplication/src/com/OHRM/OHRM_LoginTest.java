package com.OHRM;


import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_LoginTest {

	public static void main(String[] args) {
		ChromeDriver chromeBrowser;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\OrangeHRMApplication\\OrangeHRMApplication\\Libraries\\drivers\\chromedriver.exe");
		chromeBrowser = new ChromeDriver();

		chromeBrowser.get(applicationUrlAddress);


		String expected_OrangeHRMApplicationLogInPageTitle="OrangeHRM"; 
		System.out.println(" The Expected Title of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageTitle);

		String actual_OrangeHRMApplicationWebPageTitle=chromeBrowser.getTitle();
		System.out.println(" The Actual Title of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationWebPageTitle);

		if(actual_OrangeHRMApplicationWebPageTitle.equals(expected_OrangeHRMApplicationLogInPageTitle))
		{
		System.out.println(" Title of the OrangeHRM Application LogIN Page Matched - PASS ");
		}
		else
		{
		System.out.println(" Title of the OrangeHRM Application LogIN Page NOT Matched - Fail ");
		
		
			chromeBrowser.close();
		}
		}
			
		
		}

		

	



 

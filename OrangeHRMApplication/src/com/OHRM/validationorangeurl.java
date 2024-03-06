package com.OHRM;


import org.openqa.selenium.chrome.ChromeDriver;

public class validationorangeurl {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Desktop\\\\OrangeHRMApplication\\\\OrangeHRMApplication\\\\Libraries\\\\drivers\\\\chromedriver.exe");
	{

		ChromeDriver chromeBrowser=new ChromeDriver();
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		chromeBrowser.get(applicationUrlAddress);
	

	String Expected_url_address="orangehrm-4.2.0.1";
		System.out.println("The URL of orangehrm is:-"+Expected_url_address);
		String Actual_Url_address="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		System.out.println("The URL of orangehrm is:-"+Actual_Url_address);
		
		if(Actual_Url_address.contains(Expected_url_address)) {
			System.out.println("The URL of orangehram is :- PASS");
		}
		else
		{
			System.out.println("The URL of orangehram is :- FAIL");
			chromeBrowser.close();
			
			
	}

		}
		}
}


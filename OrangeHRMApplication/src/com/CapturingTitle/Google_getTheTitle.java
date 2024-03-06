package com.CapturingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google_getTheTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\OrangeHRMApplication\\OrangeHRMApplication\\Libraries\\drivers\\chromedriver.exe");
		  ChromeDriver chromebrowser=new ChromeDriver();
		  chromebrowser.get("http://google.com");
		 String google_webpagetitle=chromebrowser.getTitle();
		 System.out.println("The Title of Google web page is  :-" +google_webpagetitle);
		 chromebrowser.close();
		  
		  
		// TODO Auto-generated method stub

	}

}


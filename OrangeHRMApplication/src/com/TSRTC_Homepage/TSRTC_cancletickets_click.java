package com.TSRTC_Homepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_cancletickets_click {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "./src/drivers/chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		String ApplicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		driver.get(ApplicationUrlAddress);
		//<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
		                  By Cancelticketsproperty= By.linkText("Cancel Tickets");
		                 WebElement TSRTCCancleTickets=driver.findElement(Cancelticketsproperty);
		                 TSRTCCancleTickets.click();
		                String WebPage= driver.getTitle();
		                System.out.println("The WebPage title is"+WebPage);
		                
		              //  <a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
		               // <a class="tabcopy" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
		               // <a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
                       //<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
		            By linksproperty = By.tagName("a");
		    List < WebElement> links= driver.findElements(linksproperty);  
		    int HomePageLinks=links.size();
		    System.out.println("The no.of Links in Homepage is"+HomePageLinks);
		    
		    driver.quit();
		                
	}

	
		// TODO Auto-generated method stub
		


	
		// TODO Auto-generated method stub
		
	}



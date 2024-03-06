package com.TSRTC_Homepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage_Textboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "./src/drivers/chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		String ApplicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		driver.get(ApplicationUrlAddress);
		//<input type="text" name="fromPlaceName" size="22" value="" onblur="setHelpText('Enter From City Name', 'fromPlaceName');" onfocus="clearHelpText('Enter From City Name', 'fromPlaceName');" id="fromPlaceName" class="ajxPlaceCs ui-autocomplete-input" title="Enter city name and select from the dropdown list." autocomplete="off">
		By Textboxes=By.tagName("input");
		List <WebElement>HomePageTextBoxes=driver.findElements(Textboxes);
	int Boxes=HomePageTextBoxes.size();
	System.out.println("The no.of textboxes is"+Boxes);

	}

}

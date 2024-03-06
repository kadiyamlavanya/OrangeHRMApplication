package cm.World_Time_Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BestTest1 {
	WebDriver driver;
	String applicationUrlAddress="https://www.timeanddate.com/worldclock/";

	@BeforeTest
	public void applicationLaunch()
	{
	System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
	driver = new ChromeDriver();

	System.out.println(" *********  Chrome Browser Launched Successfully ********");
	}
	@Test
	public void navigation()
	{
	driver.get(applicationUrlAddress);

	System.out.println(" Navigated to TIMEandDATE Application WebPage");
	}

	@AfterTest
	public void applicationClose()
	{
	driver.quit();
	System.out.println("******** Chome Browser Closed Successfully *******");
	}
}

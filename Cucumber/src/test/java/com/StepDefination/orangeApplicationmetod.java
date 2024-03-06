package com.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Log;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class orangeApplicationmetod {
	
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";


	@Given("User should Open the Browser in the System")
	public void user_should_open_the_browser_in_the_system()
	{

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();

	// System.out.println(" **** Chrome Browser Launched Successfully *****");

	Log.info("**** Chrome Browser Launched Successfully *****");


	}

	@When("The User enters OrangeHRM Application URL Address in the browser")
	public void the_user_enters_orange_hrm_application_url_address_in_the_browser()
	{

	driver.get(applicationUrlAddress);

	// System.out.println(" Navigated to OrangeHRM Application WebPage ");
	Log.info("Navigated to OrangeHRM Application WebPage");

	driver.manage().window().maximize();

	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Then("The User should be navigated to OrangeHRM Application LogIn WebPage")
	public void the_user_should_be_navigated_to_orange_hrm_application_log_in_web_page()
	{

	String expected_OrangeHRMAplicationLogInPageTitle="OrangeHRM";
	Log.info(" The expected title of the OrangeHRm Application LogIn Page is :- "+expected_OrangeHRMAplicationLogInPageTitle);

	String actual_OrangeHRMAplicationLogInPageTitle=driver.getTitle();
	Log.info(" The actual title of the OrangeHRm Application LogIn Page is :- "+actual_OrangeHRMAplicationLogInPageTitle);

	if(actual_OrangeHRMAplicationLogInPageTitle.equals(expected_OrangeHRMAplicationLogInPageTitle))
	{
	Log.info("Successfully Navigated to OrangeHRM Application LogIn WebPage - PASS");
	}
	else
	{
	Log.info("Failed to Navigate to OrangeHRM Application LogIn WebPage - FAIL");
	}


	// Validating Text - LOGIN Panel

	String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
	Log.info(" The Expected Text of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageText);

	// id="logInPanelHeading"
	By orangeHRMApplicationLogInPageTextProperty=By.id("logInPanelHeading");
	WebElement orangeHRMApplicationLogInPage=driver.findElement(orangeHRMApplicationLogInPageTextProperty);

	String actual_OrangeHRMApplicationLogInPageText=orangeHRMApplicationLogInPage.getText();
	Log.info(" The Actual Text of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageText);

	if(actual_OrangeHRMApplicationLogInPageText.equals(expected_OrangeHRMApplicationLogInPageText))
	{
	Log.info(" Text Found - Successfully Navigated to OrangeHRM Application LogIn Page - PASS ");
	}
	else
	{
	Log.info(" Expected LogIn Page Text Not Found - Failed to Navigate to OrangeHRM Application LogIn Page - FAIL");
	}

	}

	@Then("The User should closed the Browser with the Application")
	public void the_user_should_closed_the_browser_with_the_application()
	{

	driver.quit();
	Log.info(" ************ Chrome Browser closed along with the Application Successfully ************");
	}



	
}

package com.orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogout {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

		System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(applicationUrlAddress);

		String expected_OrangeHRMApplicationLoginPageTitle="OrangeHRM";
		System.out.println("The Expected Title of the OrangeHRM Application LogIN Page is:-" +expected_OrangeHRMApplicationLoginPageTitle);


		String actual_OrangeHRMApplicationWebPageTitle=driver.getTitle();
		System.out.println("The Expected Title of the OrangeHRM Application LogIN Page is:-" +expected_OrangeHRMApplicationLoginPageTitle);


		if(actual_OrangeHRMApplicationWebPageTitle.equals(expected_OrangeHRMApplicationLoginPageTitle))
		{
		System.out.println("Title of the OrangeHRM Application LogIN Page Matched PASS");
		}
		else
		{
		System.out.println("Title of the OrangeHRM Application LogIN Page NOT Matched FAIL");
		}

		System.out.println("---------------------------------------------------------------------------------------------------");

		//URL Address validation

		String expected_OrangeHRMUrlAddress="orangehrm-4.2.0.1";
		System.out.println("The Expected Title of the OrangeHRM is:-" +expected_OrangeHRMUrlAddress);


		String actual_OrangeHRMUrlAddress=driver.getCurrentUrl();
		System.out.println("The actual Title of the OrangeHRM Application LogIN Page is:-" +actual_OrangeHRMUrlAddress);


		if(actual_OrangeHRMUrlAddress.contains(expected_OrangeHRMUrlAddress))
		{
		System.out.println("Title of the OrangeHRMUrlAddress Matched PASS");
		}
		else
		{
		System.out.println("Title of the OrangeHRM UrlAddress NOT Matched FAIL");
		}
		System.out.println("---------------------------------------------------------------------------------------------------");


		//<input name="txtUsername" id="txtUsername" type="text">
		String userNameTestData="Admin";
		By usernameProperty=By.name("txtUsername");
		WebElement name=driver.findElement(usernameProperty);
		name.sendKeys(userNameTestData);



		String passwordTestData="Livetech@123";
		By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordTestData);

		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		By logInButtonProperty=By.className("button");
		WebElement logInButton= driver.findElement(logInButtonProperty);
		logInButton.click();
		System.out.println("---------------------------------------------------------------------------------------------------");

		String expected_OrangeHRMHomePage="orangehrm";
		System.out.println("The Expected Title of the OrangeHRM HomePage is:-" +expected_OrangeHRMHomePage);


		String actual_OrangeHRMHomePage=driver.getCurrentUrl();
		System.out.println("The actual Title of the OrangeHRM Application LogIN Page is:-" +actual_OrangeHRMHomePage);


		if(actual_OrangeHRMHomePage.contains(expected_OrangeHRMHomePage))
		{
		System.out.println("Title of the OrangeHRMHomePage Matched PASS");
		}
		else
		{
		System.out.println("Title of the OrangeHRMHomePage NOT Matched FAIL");
		}

		System.out.println("---------------------------------------------------------------------------------------------------");

		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

		By WelcomeAdminProperty=By.id("welcome");
		WebElement WelcomeAdmin=driver.findElement(WelcomeAdminProperty);
		String welcome=WelcomeAdmin.getText();



		String expected_OrangeHRMWelcome="Welcome";
		System.out.println("The Expected Title of the OrangeHRMWelcome is:-" +expected_OrangeHRMWelcome);


		String actual_OrangeHRMWelcome=(welcome);
		System.out.println("The actual Title of the OrangeHRM Application LogIN Page is:-" +actual_OrangeHRMWelcome);


		if(actual_OrangeHRMWelcome.contains(expected_OrangeHRMWelcome))
		{
		System.out.println("Title of the OrangeHRMWelcomeAdmin Matched PASS");
		}
		else
		{
		System.out.println("Title of the OrangeHRMWelcomeAdmin NOT Matched FAIL");
		}

		By welcomeAdminProperty=By.id("welcome");
		WebElement Welcome=driver.findElement(welcomeAdminProperty);
		Welcome.click();


		Thread.sleep(5000);



		By logOutProperty=By.linkText("Logout");
		WebElement logOut=driver.findElement(logOutProperty);
		logOut.click();


		//<div id="logInPanelHeading">LOGIN Panel</div>//

		By LOGINPanelProperty =By.id("logInPanelHeading");
		WebElement LOGINPanel =driver.findElement(LOGINPanelProperty);
		String LOGINText=LOGINPanel.getText();

		String expected_OrangeHRMLogInpanel="LOGIN Panel";
		System.out.println("The Expected Title of the OrangeHRMLogInpanel is:-" +expected_OrangeHRMLogInpanel);


		String actual_OrangeHRMLogInpanel=(LOGINText);
		System.out.println("The actual Title of the OrangeHRM LogInpanel is:-" +actual_OrangeHRMLogInpanel);


		if(actual_OrangeHRMLogInpanel.equals(expected_OrangeHRMLogInpanel))
		{
		System.out.println("Title of the OrangeHRMLogInpanel Matched PASS");
		}
		else
		{
		System.out.println("Title of the OrangeHRMLogInpanel NOT Matched FAIL");
		}

		System.out.println("---------------------------------------------------------------------------------------------------");

		driver.quit();
		// TODO Auto-generated method stub

	}

}

package com.orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validatetext {

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\OrangeHRMApplication\\OrangeHRMApplication\\Libraries\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(ApplicationUrlAddress);
		//<img src="/orangehrm-4.2.0.1/symfony/web/webres_5bdfdad33dec87.24121780/themes/default/images/login/logo.png">
		//<div id="logInPanelHeading">LOGIN Panel</div>
		By Loginpanelproperty=By.id("logInPanelHeading");
		WebElement Loginpanel=driver.findElement(Loginpanelproperty);
		String ActualLogintext=Loginpanel.getText();
		System.out.println("The Actual Login text is"+ActualLogintext);
		String ExpectedLogintext="LOGIN Panel";
		System.out.println("The Expected Login text is"+ExpectedLogintext);
		if(ActualLogintext.equals(ExpectedLogintext))
		{
			System.out.println("The Actual Loginpanel text is pass");
		}
		else
		{
			System.out.println("The Actual Loginpanel text is fail");
		}
		String usernametestdata="Admin";
		By usernameproperty=By.id("txtUsername");
		WebElement username=driver.findElement(usernameproperty);
		username.sendKeys(usernametestdata);
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		String passwordtestdata="Livetech@123";
		By passwordproperty=By.id("txtPassword");
		WebElement password=driver.findElement(passwordproperty);
		password.sendKeys(passwordtestdata);
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		By Loginbuttonproperty=By.className("button");
		WebElement Loginbutton=driver.findElement(Loginbuttonproperty);
		Loginbutton.click();
		//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
		By Welcomeid = By.id("welcome");
		WebElement WelcomeidName = driver.findElement(Welcomeid);

		String Actualwelcomeidtext =WelcomeidName.getText();
		System.out.println("The Actaul title of home page:"+Actualwelcomeidtext);

		String ExpectedTile ="Welcome Admin";
		System.out.println("The ExpectedTile tile of home page:"+ExpectedTile);



		if(Actualwelcomeidtext.contains(ExpectedTile))
		{
		System.out.println("The  home page name Actualtext is passed");

		}

		else
		{
		System.out.println("The  home page name Actualtext is passed");
		}

		By Welcome = By.id("welcome");
		WebElement Welcomeicon = driver.findElement(Welcome);
		String Welcomeattribute = Welcomeicon.getAttribute("class");
		System.out.println("The attribute value of the welcome icon:"+Welcomeattribute);

		}




		}
		
		
		
		
		
		

	



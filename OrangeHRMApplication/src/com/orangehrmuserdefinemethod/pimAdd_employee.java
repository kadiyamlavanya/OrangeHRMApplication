package com.orangehrmuserdefinemethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pimAdd_employee {
	WebDriver driver;
	private void navigate()
	{
		System.setProperty("webdriver.chrome.driver","./src/drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
	public void login()
	{
		String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(ApplicationUrlAddress);
		String usernametestdata="Admin";
		By usernameproperty=By.id("txtUsername");
		WebElement username=driver.findElement(usernameproperty);
		username.sendKeys(usernametestdata);
		String passwordtestdata="Livetech@123";
				By passwordproperty=By.id("txtPassword");
				WebElement password=driver.findElement(passwordproperty);
				password.sendKeys(passwordtestdata);
				By Loginbuttonproperty=By.className("button");
				WebElement Loginbutton=driver.findElement(Loginbuttonproperty);
				Loginbutton.click();
				
	}

	public static void main(String[] args) throws InterruptedException  {
		pimAdd_employee pm=new pimAdd_employee();
		pm.navigate();
		pm.login();
		pm.pim();
		pm.Addemployee();
		
		
		
		// TODO Auto-generated method stub

	}
public void pim() throws InterruptedException
{
	
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
	By pimproperty=By.id("menu_pim_viewPimModule");
	WebElement pim=driver.findElement(pimproperty);
	//Thread.sleep(3000);
	Actions mouseAction=new Actions(driver);
	mouseAction.moveToElement(pim).build().perform();
	
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
By addemployeeproperty=By.id("menu_pim_addEmployee");
WebElement Addemployee=driver.findElement(addemployeeproperty);
Addemployee.click();


}
public void Addemployee()
{
	//<label class="hasTopFieldHelp">Full Name</label>
	By Fullnameroperty=By.className("hasTopFieldHelp");
	WebElement fullname=driver.findElement(Fullnameroperty);
	fullname.getText();
	String Expected_fullname="Full Name";
	System.out.println("The Expected pim Add employee"+Expected_fullname);
	String Actual_fullname=fullname.getText();
	System.out.println("The Expected pim Add employee"+Actual_fullname);
	if(Actual_fullname.equals(Expected_fullname)) 
	{
		System.out.println("Full Name is PASS");
	}
		else
		{
			System.out.println("Full Name is Fail");
		}
	//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
	String Firstname="Lavanya";
	By inputtext=By.id("firstName");
	WebElement input=driver.findElement(inputtext);
	input.sendKeys(Firstname);
	//<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
	
	String Middlename="sri";
By middlenameproperty=By.id("middleName");
WebElement name=driver.findElement(middlenameproperty);
name.sendKeys(Middlename);

//<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
String Lastname="kadiyam";
By lastnameproperty=By.id("lastName" );
WebElement names=driver.findElement(lastnameproperty);
names.sendKeys(Lastname);

//<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0003" id="employeeId">
By employeeidproperty=By.id("employeeId");
WebElement id=driver.findElement(employeeidproperty);
String employee=id.getAttribute("value");
System.out.println("The value of employee id is"+employee);
//<input type="button" class="" id="btnSave" value="Save">
By buttonproperty=By.id("btnSave");
WebElement buttons=driver.findElement(buttonproperty);
buttons.click();
//<label for="Full_Name" class="hasTopFieldHelp">Full Name</label>
By First=By.className("hasTopFieldHelp");
WebElement Full=driver.findElement(First);
Full.getText();
String Expected_Text="Full Name";
System.out.println("The Expected pim Add employee"+Expected_fullname);
String Actual_Text=Full.getText();
System.out.println("The Expected pim Add employee"+Actual_fullname);
if(Actual_Text.equals(Expected_Text)) 
{
	System.out.println("Full Name is PASS");
}
	else
	{
		System.out.println("Full Name is Fail");
	}


//<input value="Lavanya" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled">
By first=By.id("personal_txtEmpFirstName");
WebElement fid=driver.findElement(first);
String Name=fid.getAttribute("value");
System.out.println("The value of first name is" +Name);


//<input value="sri" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30" title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">
By Middle=By.id("personal_txtEmpMiddleName");
WebElement property=driver.findElement(Middle);
String mid=property.getAttribute("value");
System.out.println("The value of middle name is" +mid);


//<input value="kadiyam" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30" title="Last Name" id="personal_txtEmpLastName" disabled="disabled">
By Last=By.id("personal_txtEmpLastName");
WebElement pro=driver.findElement(Last);
String Las=pro.getAttribute("value");
System.out.println("The value of Last name is" +Las);


String Expected_first_name="Lavanya";
System.out.println("The expected first name is"+Expected_first_name);
String Actual_first_name=Name;
System.out.println("The Actual first name is"+Actual_first_name);
if(Expected_first_name.equals(Actual_first_name))
{
	System.out.println("The firstname is matched PASS");
}
else
{
	System.out.println("The firstname is matched FAIL");
	}

String Expected_middle_name="sri";
System.out.println("The expected first name is"+Expected_middle_name);
String Actual_middle_name=mid;
System.out.println("The Actual first name is"+Actual_middle_name);
if(Expected_middle_name.equals(Actual_middle_name))
{
	System.out.println("The middlename is matched PASS");
}
else
{
	System.out.println("The middlename is matched FAIL");
	}


String Expected_Last_name="kadiyam";
System.out.println("The expected first name is"+Expected_Last_name);
String Actual_Last_name=Las;
System.out.println("The Actual first name is"+Actual_Last_name);
if(Expected_Last_name.equals(Actual_Last_name))
{
	System.out.println("The Lastname is matched PASS");
}
else
{
	System.out.println("The Lastname is matched FAIL");
	}






}

	










}












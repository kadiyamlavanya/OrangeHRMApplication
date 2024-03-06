package com.orangehrm_Testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;

public class Addemployee_functionality extends BaseTest 
{
	FileInputStream data;
	XSSFWorkbook workbook;
	XSSFSheet multipledata;
	
	@Test(priority=1)
	public void Addemployee() throws IOException 
	{
		data=new FileInputStream("./src/com/excel/Addemp.xlsx");
		 workbook=new XSSFWorkbook(data);
		XSSFSheet multipledata=workbook.getSheet("Sheet1");
		
		Row Row1=multipledata.createRow(1);
			
		Cell RowOfCell7=Row1.createCell(7);
		RowOfCell7.setCellValue("Admin");
		String usernametestdata = Row1.getCell(7).getStringCellValue();

         By usernameproperty=By.id("txtUsername");
		WebElement username=driver.findElement(usernameproperty);
		username.sendKeys(usernametestdata);
		
		
		Cell RowOfCell8=Row1.createCell(8);
		RowOfCell8.setCellValue("Livetech@123");
		String passwordtestdata = Row1.getCell(8).getStringCellValue();
		By passwordproperty=By.id("txtPassword");
				WebElement password=driver.findElement(passwordproperty);
				password.sendKeys(passwordtestdata);
				
				By Loginbuttonproperty=By.className("button");
				WebElement Loginbutton=driver.findElement(Loginbuttonproperty);
				Loginbutton.click();
				
				
				Cell RowOfCell0=Row1.createCell(0);
				RowOfCell0.setCellValue("LOGIN Panel");

				Cell RowOfCell1=Row1.createCell(1);
				RowOfCell1.setCellValue("Invalid Credentials");

				Cell RowOfCell2=Row1.createCell(9);
				RowOfCell2.setCellValue("Admin");
				
				Cell RowOfCell4=Row1.createCell(4);
				RowOfCell4.setCellValue("orange HRM");
				
					Cell RowOfCell3=Row1.createCell(12);
				RowOfCell3.setCellValue("Full Name");
		
				
				String Expected_url_address="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
				System.out.println("The expected url is is"+Expected_url_address);
				String Actual_url_address=driver.getCurrentUrl();
				System.out.println("The expected url is is"+Actual_url_address);
				if(Actual_url_address.equals(Expected_url_address))
				{
					System.out.println("The url address is PASS");
					
					Cell RowOfCell5=Row1.createCell(2);
					RowOfCell5.setCellValue("Valid Credentials");
					
					
					String Expectedhomepagetitle = Row1.getCell(9).getStringCellValue();
                    System.out.println("The expected HomePage title is"+Expectedhomepagetitle);


					By AdminProperty=By.className("firstLevelMenu");
					WebElement Admin=driver.findElement(AdminProperty);
					
					String Actual_Admin_Text=Admin.getText();
				Cell RowOfCell9=Row1.createCell(10);
					RowOfCell9.setCellValue(Actual_Admin_Text);
					System.out.println("The Actual HomePage title is"+Actual_Admin_Text);
					
					if(Actual_Admin_Text.equals(Expectedhomepagetitle))
					{
						System.out.println("The home page title is PASS");
						Cell RowOfCell10=Row1.createCell(11);
						RowOfCell10.setCellValue("PASS");
						
					}
					else
					{
						System.out.println("The home page title is PASS");
						Cell RowOfCell11=Row1.createCell(11);
						RowOfCell11.setCellValue("FAIL");
					}
					
					
					
					String Expected_loginpage_text = Row1.getCell(1).getStringCellValue();
					System.out.println("The expected login text"+Expected_loginpage_text );
					
					String Actual_loginpage_text = Row1.getCell(2).getStringCellValue();
					System.out.println("The Actual login text"+Actual_loginpage_text );
					
					if(Actual_loginpage_text.equals(Expected_loginpage_text))
					{
						System.out.println("The home page text is PASS");
						Cell RowOfCell6=Row1.createCell(3);
						RowOfCell6.setCellValue("PASS");
						
					}
					else
					{
						System.out.println("The home page text is fail");
						Cell RowOfCell6=Row1.createCell(3);
						RowOfCell6.setCellValue("FAIL");
					}
					
					
					
				}
				else
				{
					System.out.println("The url address is FAIL");
					
					
					
				}
				
				String Expected_loginpage_title = Row1.getCell(4).getStringCellValue();
				
				System.out.println("The expected login page title is"+Expected_loginpage_title );
				           
				            String actual_LoginPageText=driver.getTitle();
				            Cell OrangeHrmresultCell2=Row1.createCell(5);
				OrangeHrmresultCell2.setCellValue(actual_LoginPageText);
				            System.out.println("The actual home page login page is"+actual_LoginPageText);
				           
				           
				          if(actual_LoginPageText.equals(Expected_loginpage_title))
				            {
				            System.out.println("The home page Orange HRM title is matched");
				            Cell resultCell=Row1.createCell(6);
				            resultCell.setCellValue("Pass");
				           }
				            else
				            {
				            System.out.println("The home page Orange HRM title is  NOT matched");
				            Cell resultCell=Row1.createCell(6);
				            resultCell.setCellValue("Fail");
				            }
	}
				          
	@Test(priority=2)
	public void pim() throws InterruptedException, IOException
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
		Actions keyBoardActions = new Actions(driver);
		keyBoardActions.sendKeys(Keys.TAB).build().perform();
		
		keyBoardActions.sendKeys("sri").build().perform();
		
		keyBoardActions.sendKeys(Keys.TAB).build().perform();
		keyBoardActions.sendKeys("kadiyam").build().perform();
		
		keyBoardActions.sendKeys(Keys.TAB).build().perform();
		keyBoardActions.sendKeys(Keys.TAB).build().perform();
		
		keyBoardActions.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(10000);
		
		java.lang.Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\OrangeHRMApplication\\OrangeHRMApplication\\empolyeephoto\\employee.exe");
		Thread.sleep(10000);
		
		By buttonproperty=By.id("btnSave");
		WebElement buttons=driver.findElement(buttonproperty);
		buttons.click();
	   
		FileOutputStream testresult=new FileOutputStream("./src/com/excel/Addemp1.xlsx");
		 workbook.write(testresult);

	 }
	
}










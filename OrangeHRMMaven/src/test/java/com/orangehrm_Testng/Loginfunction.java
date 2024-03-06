package com.orangehrm_Testng;

import java.io.File;
import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
	import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.utility.Log;

	public class Loginfunction extends BaseTest
	{
	@Test(priority=1)
	public void logindata() throws IOException
	{
	FileInputStream data=new FileInputStream("./src/com/excel/username.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(data);
	XSSFSheet multipledata=workbook.getSheet("Sheet1");

	int rowscount=multipledata.getLastRowNum();
	for(int rowindex=1;rowindex<rowscount;rowindex++)
	{
		String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(ApplicationUrlAddress);
		
	Row row =multipledata.getRow(rowindex);

	Cell RowOfCell0=row.createCell(0);
	RowOfCell0.setCellValue("LOGIN Panel");

	Cell RowOfCell1=row.createCell(1);
	RowOfCell1.setCellValue("Invalid Credentials");

	Cell RowOfCell2=row.createCell(7);
	RowOfCell2.setCellValue("Admin");

String usernametestdata = row.getCell(5).getStringCellValue();

	By usernameProperty=By.id("txtUsername");
	WebElement username=driver.findElement(usernameProperty);
	username.sendKeys(usernametestdata);


	String passwordtestdata = row.getCell(6).getStringCellValue();
	By passwordProperty=By.id("txtPassword");
	WebElement password=driver.findElement(passwordProperty);
	password.sendKeys(passwordtestdata);
	
	 
	By loginProperty=By.className("button");
	WebElement login=driver.findElement(loginProperty);
	login.click();
	
	String loginpage="loginpagescreenshot";
	File capturedSceenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(capturedSceenshot,new File("./orangehrm/"+loginpage+".png"));
	
	
	String Expected_url_address="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	Log.info("The expected url is is"+Expected_url_address);
	String Actual_url_address=driver.getCurrentUrl();
	Log.info("The expected url is is"+Actual_url_address);
	if(Actual_url_address.equals(Expected_url_address))
	{
		Log.info("The url address is PASS");
		
		
		String Expected_HomePage_Text="Admin";
		Log.info("The expected HomePage title is"+Expected_HomePage_Text);
		
		By AdminProperty=By.className("firstLevelMenu");
		WebElement Admin=driver.findElement(AdminProperty);
		
		String Actualhomepagetext =Admin.getText();
		Log.info("The Actual HomePage title is"+Actualhomepagetext);
		
		String loginpage1="loginpage";
		File capturedSceenshot1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(capturedSceenshot1,new File("./orangehrm/"+loginpage1+".png"));
		Cell Admincell=row.createCell(8);
		Admincell.setCellValue(Actualhomepagetext);
		if( Actualhomepagetext.contains(Expected_HomePage_Text))
		{
			Log.info("The Home page text is matched  PASS");
			Cell cellpass=row.createCell(9);
			cellpass.setCellValue("PASS");
		}
		else
		{
			Log.info("The Home page text is matched  FAIL");
			
			
		}
		
		
}
	else
	{
		Cell Admincell1=row.createCell(8);
		Admincell1.setCellValue("FAIL");
		Cell cellpass=row.createCell(9);
		cellpass.setCellValue("FAIL");
		Log.info("The url address is FAIL");
	}
		
	
	
	
	


	String Expected_LoginPageText="OrangeHRM";
	Cell OrangeHrmresultCell1=row.createCell(2);
	OrangeHrmresultCell1.setCellValue("OrangeHRM");
	Log.info("The expected home page login page title is"+Expected_LoginPageText);
	           
	            String actual_LoginPageText=driver.getTitle();
	            Cell OrangeHrmresultCell2=row.createCell(3);
	OrangeHrmresultCell2.setCellValue(actual_LoginPageText);
	Log.info("The actual home page login page is"+actual_LoginPageText);
	           
	           
	           
	         
	            if(actual_LoginPageText.equals(Expected_LoginPageText))
	            {
	            	Log.info("The home page Orange HRM title is matched");
	            Cell resultCell=row.createCell(4);
	            resultCell.setCellValue("Pass");
	           }
	            else
	            {
	            	Log.info("The home page Orange HRM title is  NOT matched");
	            Cell resultCell=row.createCell(4);
	            resultCell.setCellValue("Fail");
	            }
	            
	            FileOutputStream testresultdata=new FileOutputStream("./src/com/excel/username.xlsx");
	   
	    workbook.write(testresultdata);
	   
	   

	}



	}

	
		
		
	}

	


	       




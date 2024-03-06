package Exceloperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm_Login_validinvalid_data {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./src/drivers/chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		FileInputStream testdata=new FileInputStream("./src/com/excel/orangehrm.xlsx"); 
		XSSFWorkbook workbook=new XSSFWorkbook(testdata);
		XSSFSheet userdata=workbook.getSheet("Sheet1");
		int rowscount=userdata.getLastRowNum();
		for(int rowindex=1;rowindex<=rowscount;rowindex++)
		{
			Row row=userdata.getRow(rowindex);
			String usernametestdata=row.getCell(0).getStringCellValue();
			
			String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
			driver.get(ApplicationUrlAddress);
			
			By usernameproperty=By.id("txtUsername");
			WebElement username=driver.findElement(usernameproperty);
			username.sendKeys(usernametestdata);
			
		     String passworddata=row.getCell(1).getStringCellValue();
		     By passwordproperty=By.id("txtPassword");
				WebElement password=driver.findElement(passwordproperty);
				password.sendKeys(passworddata);
				
				By Loginbuttonproperty=By.className("button");
				WebElement Loginbutton=driver.findElement(Loginbuttonproperty);
				Loginbutton.click();
				String Expected_Url_address="dashboard";
				System.out.println("The Homepage of url address"+Expected_Url_address);
				String Actual_Url_address=driver.getCurrentUrl();
				System.out.println("The Homepage of url address"+Actual_Url_address);
				if(Actual_Url_address.contains(Expected_Url_address))
				{
					System.out.println("The Homepage Url address is matched PASS");
					Cell result=row.createCell(2);
					 result.setCellValue("PASS");
				}
				else
				{
					 System.out.println("The Homepage Url address is matched FAIL");
						Cell result=row.createCell(2);
						 result.setCellValue("FAIL");
					 
				}
				FileOutputStream data=new FileOutputStream("./src/com/excel/orangehrm.xlsx"); 
				workbook.write(data);
				
				
				
		     
			
			
		
			
		}
		
		// TODO Auto-generated method stub

	


		// TODO Auto-generated method stub
		



		// TODO Auto-generated method stub
		
	}

}

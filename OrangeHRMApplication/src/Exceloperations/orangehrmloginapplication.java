package Exceloperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class orangehrmloginapplication {

	public static void main(String[] args) throws IOException {

	    System.setProperty("webdriver.chrome.driver","./src/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(ApplicationUrlAddress);
		FileInputStream loginpage=new FileInputStream("./src/com/excel/loginpage.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(loginpage);
		 XSSFSheet testdata=workBook.getSheet("Sheet1");
		 XSSFRow usertestdatarow=testdata.getRow(2);
		 XSSFCell usertestdatacell=usertestdatarow.getCell(0);
		 String Loginusernametestdata=usertestdatacell.getStringCellValue();
		
		
		//String usernametestdata="Admin";
		By usernameproperty=By.id("txtUsername");
		WebElement username=driver.findElement(usernameproperty);
		username.sendKeys(Loginusernametestdata);
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		XSSFCell Loginusertestdatapassword=usertestdatarow.getCell(1);
		 String Testdatapassword=Loginusertestdatapassword.getStringCellValue();
		
		
		//String passwordtestdata="Livetech@123";
		By passwordproperty=By.id("txtPassword");
		WebElement password=driver.findElement(passwordproperty);
		password.sendKeys(Testdatapassword);
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		By Loginbuttonproperty=By.className("button");
		WebElement Loginbutton=driver.findElement(Loginbuttonproperty);
		Loginbutton.click();
		driver.close();
		
	}
}

		
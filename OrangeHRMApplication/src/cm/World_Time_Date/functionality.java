package cm.World_Time_Date;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class functionality extends BestTest1
{
public void tabledata() throws IOException 
{
	//html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	//html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
String xpathexpression1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
String xpathexpression2="]/td[";
String xpathexpression3="]";

FileInputStream inputdata= new FileInputStream("./src/com/excel/TimeandDate.xlsx");
XSSFWorkbook workBook=new XSSFWorkbook("inputdata");
XSSFSheet workbooksheet=workBook.getSheet("Sheet1");
for(int rowIndex=1;rowIndex<=36;rowIndex++)
{

// to goto every Row of all its Cells
for(int cellIndex=1;cellIndex<=8;cellIndex++)
{
By webTableElementPoperty=By.xpath(xpathexpression1+rowIndex+xpathexpression2+cellIndex+xpathexpression3);
WebElement webTableElement=driver.findElement(webTableElementPoperty);
String webTableData=webTableElement.getText();



}
}
}
}
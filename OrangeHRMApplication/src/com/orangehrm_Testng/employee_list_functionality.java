package com.orangehrm_Testng;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utility.Log;

public class employee_list_functionality extends BaseTest {
	@Test(priority=1)
	public void login()
	{
		String usernametestdata="Admin";
		By usernameProperty=By.id("txtUsername");
		WebElement username=driver.findElement(usernameProperty);
		username.sendKeys(usernametestdata);


		String passwordtestdata="Livetech@123";
		By passwordProperty=By.id("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordtestdata);
		
		 
		By loginProperty=By.className("button");
		WebElement login=driver.findElement(loginProperty);
		login.click();
		
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
		
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewEmployeeList/reset/1" id="menu_pim_viewEmployeeList">Employee List</a>
	
		By employeelistproperty=By.id("menu_pim_viewEmployeeList");
		WebElement employeelist=driver.findElement(employeelistproperty);
		employeelist.click();
		
		FileInputStream employee=new FileInputStream("./src/com/excel/employeeList.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(employee); 
		XSSFSheet workboooksheet= workBook.getSheet("Sheet1");
		
            //*[@id="resultTable"]/tbody
		By webTableProperty=By.xpath("//*[@id=\"resultTable\"]/tbody");
		WebElement webTable=driver.findElement(webTableProperty);
		
		By rowProperty=By.tagName("tr");

		
		List<WebElement>webtableRows=webTable.findElements(rowProperty);

		
		for(int rowIndex=0;rowIndex<webtableRows.size();rowIndex++)
		{
		// in the WebTable going to  particular Row
		WebElement webtableRow=webtableRows.get(rowIndex);

		// creating a Row in the Sheet
		Row excelRow=workboooksheet.createRow(rowIndex);

		// going to a Row and finding the number of Row of Its Cells

		By webTableRowOfCellProperty=By.tagName("td");
		List<WebElement>webTableRowOfCells=webtableRow.findElements(webTableRowOfCellProperty);

		// going to a Row of All its Cells
		for(int rowOfCellIndex=0;rowOfCellIndex<webTableRowOfCells.size();rowOfCellIndex++)
		{
		WebElement rowOfCell=webTableRowOfCells.get(rowOfCellIndex);

		// get the data from the Row of Cell
		String employeeTableData=rowOfCell.getText();
		Log.info(employeeTableData+" | ");

		// creating a Row of Cell
		Cell newRowOfCell=excelRow.createCell(rowOfCellIndex);
		newRowOfCell.setCellValue(employeeTableData); // setting the value into the Row of cell Created

		}

		System.out.println();
		}
		

		FileOutputStream excelFileemployeeTableData = new FileOutputStream("./src/com/excel/employeeList.xlsx");
		workBook.write(excelFileemployeeTableData);


		
		
			

}
	}

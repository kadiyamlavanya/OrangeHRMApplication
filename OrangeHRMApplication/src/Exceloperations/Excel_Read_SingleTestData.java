package Exceloperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;



public class Excel_Read_SingleTestData 
{

	public static void main(String[] args)throws IOException 
	{
		// Identify the External File(Excel) in the System
		FileInputStream TestDataFile1 = new FileInputStream("C:\\Users\\user\\Desktop\\OrangeHRMApplication\\OrangeHRMApplication\\src\\com\\excel\\TestDataFile1.xlsx");

		// Identify the WorkBook in the File
		XSSFWorkbook workBook = new XSSFWorkbook(TestDataFile1);

		// Identify the Sheet in the WorkBook
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");

		// Identify a particular Row in the Sheet
		Row testDataSheetRow=testDataSheet.getRow(1);

		// Identify a Particular Row of Cell in the Row
		Cell testDataRowOfCell=testDataSheetRow.getCell(0);


		// get the data from the Row of a Cell
		String testData=testDataRowOfCell.getStringCellValue();

		System.out.println(" The data of the Sheet is :- "+testData);
		
		// TODO Auto-generated method stub

	}

}

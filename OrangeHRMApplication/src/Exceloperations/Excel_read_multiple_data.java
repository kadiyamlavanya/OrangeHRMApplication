package Exceloperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excel_read_multiple_data {

	public static void main(String[] args) throws IOException {
		FileInputStream testDataFile = new FileInputStream("./src/com/excel/readdata.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");

		// Identifying the Number of Active Rows with Test data
		int rowsCount=testDataSheet.getLastRowNum();

		// to automatically goto all the Active Rows
		for(int rowIndex=0;rowIndex<=rowsCount;rowIndex++)
		{

		// Going to an Active Row
		XSSFRow row=testDataSheet.getRow(rowIndex);


		// Going to an Active Row and identifying the number of Active Cells

		int rowOfCellCount=row.getLastCellNum();

		// to goto every Active Row of All its Active Cells
		for(int cellIndex=0;cellIndex<rowOfCellCount;cellIndex++)
		{
		// Going to an Active Row of an Active Cell
		XSSFCell rowOfCell=row.getCell(cellIndex);

		// Get the data from the Row of a Cell
		String testData=rowOfCell.getStringCellValue();

		// Print the data
		System.out.print(testData+" ");

		}

		System.out.println();
		// TODO Auto-generated method stub

	}

	}
}
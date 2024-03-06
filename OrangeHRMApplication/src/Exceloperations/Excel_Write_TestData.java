package Exceloperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_TestData 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream TestData=new FileInputStream("./src/com/excel/WriteData.xlsx");
		
		XSSFWorkbook workBook =new XSSFWorkbook(TestData);
		
		XSSFSheet testDataSheet= workBook.getSheet("WriteData");
		
		Row testDataofrow=testDataSheet.createRow(0);
		
		Cell rowOfCell =testDataofrow.createCell(0);
		
		rowOfCell.setCellValue("Lavanya");
		
		FileOutputStream testResultData=new FileOutputStream("./src/com/excel/WriteData.xlsx");
		workBook.write(testResultData);
		
		
	}

}

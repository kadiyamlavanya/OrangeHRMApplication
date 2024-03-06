package Exceloperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write_multipledata {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
		FileInputStream writedatamultiple=new FileInputStream("./src/com/excel/writemultipledata.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(writedatamultiple);
		XSSFSheet workbooksheet =workBook.getSheet("workdata");
		Row row=workbooksheet.createRow(0);
		Cell testdatarow=row.createCell(0);
		Cell testdatarow1=row.createCell(6);
		testdatarow.setCellValue("Lavanya");
		testdatarow1.setCellValue("502");
		FileOutputStream testdatamultiple=new FileOutputStream("./src/com/excel/writemultipledata.xlsx");
		workBook.write(testdatamultiple);
		
		
		
		
		
		
		
		
		
		
		

	}

}

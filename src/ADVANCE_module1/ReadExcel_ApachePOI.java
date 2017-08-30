package ADVANCE_module1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_ApachePOI {

	public static void main(String[] args) throws Exception {
		
		
		File src = new File("location of excel sheet");
		
		FileInputStream fis = new FileInputStream(src);
		
		// When work with "xlsx" workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		// When work with "xls" workbook
		//HSSFWorkbook wb  = new HSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		String data01 = sh1.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println("Data on Row1 and col2 is: "+data01);
		
		int totalRows = sh1.getLastRowNum();
		System.out.println("Total number of rows are : "+totalRows);

		wb.close();
		

	}

}

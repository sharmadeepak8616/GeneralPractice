package ADVANCE_module1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel_ApachePOI {

	public static void main(String[] args) {
		
		
		try {
			File src = new File("Location of excel sheet to;read");
			
			FileInputStream fis = new FileInputStream(src);
			
			XSSFWorkbook wb =  new XSSFWorkbook(fis);
			
			XSSFSheet sh1 = wb.getSheetAt(0);
			
			String data00 = sh1.getRow(0).getCell(0).getStringCellValue();
			
			System.out.println("Value at row1,col1 is : "+data00);
			
			int totalRows = sh1.getLastRowNum();
			System.out.println("total number of rows are :"+totalRows);			
			
			// #####################################################################
			// Writing to excel sheet
			// #####################################################################
			
			sh1.getRow(0).createCell(1).setCellValue("Happy");
			
			sh1.getRow(1).createCell(1).setCellValue("Peace");
			
			FileOutputStream fos = new FileOutputStream(src);
			//Or if we like to save this as new file, then
			// FileOutputStream fos = new FileOutputStream(new File("Location and name of file to be saved as"));
			
			wb.write(fos);
			
			fos.close();
			
			wb.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

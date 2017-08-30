package ADVANCE_module1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDT_ExcelRead {
	
	XSSFWorkbook wb;
	//XSSFSheet sh;
	
	public  DDT_ExcelRead(String dataFile)
	{	
		try {
			File src = new File(dataFile);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);	
		} catch (Exception e) {
			System.out.println("Inside try-catch");
			System.out.println(e.getMessage());
		}
	}
	
	
	public String getData(int sheetIndex, int rowIndex, int cellIndex)
	{
		
		XSSFSheet sh = wb.getSheetAt(sheetIndex);
		
		String data = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		
		return data;
		
	}
	
	public int[] getRowColCount(int sheetIndex)
	{
		int[] rowCol = new int[2];
		
		XSSFSheet sh = wb.getSheetAt(sheetIndex);
		
		rowCol[0] = sh.getLastRowNum();
		rowCol[1] = sh.getRow(0).getLastCellNum();

		return rowCol;
	}

	public int getRowCount(int sheetIndex)
	{
		
		XSSFSheet sh = wb.getSheetAt(sheetIndex);
		
		int rowCount = sh.getLastRowNum();

		return rowCount;
		
	}	
	
	
	
	
	
	
}

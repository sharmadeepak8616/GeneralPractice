package ADVANCE_module1;

import java.io.File;

import jxl.Sheet;
import jxl.Workbook;

public class ReadExcel_jExcel {

	public static void main(String[] args) throws Exception {
		
		File src = new File("./ReadExcel_jExcel.xls");
		
		Workbook wb = Workbook.getWorkbook(src);
		
		String data01 = wb.getSheet(0).getCell(0, 1).getContents(); 
		//getSheet - we can even pass name of Sheet as string (to getSheet). [index - 0 for Sheet 1; and so on]
		//getCell - first arg is column number, second arg is row number; we can also pass cell name like A1, B1 etc as String.
		
		
		System.out.println("Data at 1st col, and 2nd row is : "+data01);
		
		//System.out.println("Data at 2nd col, and 1st row is : "+data10);
		//System.out.println("Data at 2nd col, and 9th row is : "+data18);
		

		// To get total number of rows
		int totalRows = wb.getSheet(0).getRows();
		System.out.println("Total number of rows are : "+totalRows);
		

		
		// To get total number of columns
		int totalColumns = wb.getSheet(0).getColumns();
		System.out.println("Total number of columns are : "+totalColumns);
		
		
	}

}

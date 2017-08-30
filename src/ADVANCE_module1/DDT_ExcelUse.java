package ADVANCE_module1;

import org.testng.annotations.DataProvider;

public class DDT_ExcelUse {
	
	
	@DataProvider(name="source excel")
	public Object[][] dataBankExcel()
	{
		
		DDT_ExcelRead read = new DDT_ExcelRead("./dataFile.xlsx");
		
		int rowCol[] = read.getRowColCount(0);
		
		int rowCount = rowCol[0];
		int colCount = rowCol[1];
		
		Object[][] data = new Object[rowCount][colCount];
		
		for (int r=0; r<rowCount;r++)
		{
			for(int c=0;c<colCount;c++)
			{
				data[r][c] = read.getData(0, r, c);
			}
		}
		
		
		return data;
		
	}
	

	@DataProvider(name="source excel1")
	public Object[][] dataBankExcel1()
	{
		
		DDT_ExcelRead read = new DDT_ExcelRead("./dataFile.xlsx");
		
		
		int rows = read.getRowCount(0);
		
		int rowCol[] = read.getRowColCount(0);
		int rowCount = rowCol[0];
		int colCount = rowCol[1];
		
		//Object[][] data = new Object[rowCount][colCount];
		Object[][] data = new Object[rows][2];
		
		for (int r=0; r<rows;r++)
		{
				data[r][0] = read.getData(0, r, 0);
				data[r][1] = read.getData(0, r, 1);
		}
		
		
		return data;
		
	}
	
	
	
}

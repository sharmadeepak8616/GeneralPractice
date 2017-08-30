package ADVANCE_module1;

import org.testng.annotations.DataProvider;

public class DDT_Array {
	
	
	@DataProvider(name="source")
	public static Object[][] databank()
	{
		
		Object[][] data = new Object[3][3];
		
		data[0][0] = "admin1";
		data[0][1] = "pass1";
		data[0][2] = "try1";
		
		data[1][0] = "admin2";
		data[1][1] = "pass2";
		data[1][2] = "try2";

		data[2][0] = "admin";
		data[2][1] = "demo123";
		data[2][2] = "final";
		
		return data;
		
	}
	
	

}

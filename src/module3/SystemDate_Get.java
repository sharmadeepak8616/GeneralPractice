package module3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class SystemDate_Get {
	
	@Test
	public void systemDate_Get()
	{
		// Created object of SimpleDateFormat defining Date format
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		
		// Created object of Date, to get system current date
		Date date = new Date();
		
		String currDate = dateFormat.format(date);
		
		System.out.println("Today's date is : "+currDate);

	}

}

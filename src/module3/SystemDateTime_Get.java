package module3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class SystemDateTime_Get {

	@Test
	public void systemDateTime_Get()
	{

		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
		
		Date date = new Date();
		
		String currDateTime = dateFormat.format(date);
		
		System.out.println("Current Date n Time is : "+currDateTime);

	}

}

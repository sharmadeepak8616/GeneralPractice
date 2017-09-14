package SeleniumGrid;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestFFOnGrid {
	
	
	@Test
	public void testOnFF()
	{
		try
		{
			DesiredCapabilities cap = DesiredCapabilities.firefox();
			
			cap.setPlatform(Platform.MAC);
			
			URL url = new URL("http://localhost:4444/wd/hub/");
			
			WebDriver driver = new RemoteWebDriver(url, cap);	
			
			driver.get("http://www.thetestroom.com/webapp/");
			
			System.out.println("Title is - "+driver.getTitle());
			
			driver.quit();		
			
		}
		catch (Exception e)
		{
			System.out.println("Exception raised from testOnFF");
			System.out.println(e.getMessage());
		}
		
	}
	
	
	

}

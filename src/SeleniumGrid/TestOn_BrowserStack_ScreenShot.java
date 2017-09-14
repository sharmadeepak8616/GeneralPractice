package SeleniumGrid;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestOn_BrowserStack_ScreenShot {
	
	public static final String USERNAME = "deepaksharma36";
	public static final String AUTOMATE_KEY = "X47pGpxnysbhzPGCRwvp";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	@Test
	public void testOnBrowserStackWithScreenShot()
	{
		try
		{
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			/*
			 Platform can be one of MAC, WIN8, XP, WINDOWS, and ANY
			 */			
			cap.setPlatform(Platform.MAC);
			cap.setCapability("browserstack.debug", "true");
			
			WebDriver driver = new RemoteWebDriver(new URL(URL), cap);
			
			driver.get("http://www.learn-automation.com/");
			
			System.out.println("Title is - "+driver.getTitle());
			
			driver.quit();
	
		}
		catch(Exception e)
		{
			System.out.println("Exception from testOnBrowserStackWithScreenShot method");
			System.out.println(e.getMessage());
		}

		
		
		
		
	}
	
	
	

}

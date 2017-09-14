package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestOn_BrowserStack {
	
	public static final String USERNAME = "deepaksharma36";
	public static final String AUTOMATE_KEY = "X47pGpxnysbhzPGCRwvp";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	@Test
	public void testOnBrowserStack()
	{
		
		try {
			DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		/*
		 Platform can be one of MAC, WIN8, XP, WINDOWS, and ANY
		 */
			cap.setPlatform(Platform.WINDOWS);
		
			WebDriver driver = new RemoteWebDriver(new URL(URL), cap);
			
			driver.get("http://www.thetestroom.com/webapp/");
			
			System.out.println("Title is - "+driver.getTitle());
			
			driver.quit();

		} catch (MalformedURLException e) {
			
			System.out.println("Exception within testOnBrowserStack method");
			System.out.println(e.getMessage());
			
		}
		
		
		
		
	}
	
	
	

}

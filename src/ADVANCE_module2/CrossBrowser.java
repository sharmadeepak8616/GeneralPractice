package ADVANCE_module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	WebDriver driver;

	@Test
	@Parameters({"browser" , "appUrl"})
	public void crossBrowserTesting(String browserName, String url)
	{

		switch (browserName.toLowerCase())
		{
			case "firefox" :
			{
				driver = new FirefoxDriver();
				break;
			}
			
			case "chrome" :
			{
				driver = new ChromeDriver();
				break;
			}
			
			case "internet explorer" :
			case "ie" :
			case "internetexplorer" :
			{
				driver = new InternetExplorerDriver();
				break;
			}
			
			case "safari" :
			{
				driver = new SafariDriver();
				break;
			}
			
			default :
			{
				System.out.println("Invalid browser name : "+browserName);
			}
		}
		
		driver.get(url);
		System.out.println("Test running on "+browserName);
		System.out.println("Fetched title is : "+driver.getTitle());
		driver.quit();
		
	}

}

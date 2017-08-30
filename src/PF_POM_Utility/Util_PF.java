package PF_POM_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util_PF {

	static WebDriver driver;
	public static String expLoginTitle = "WordPress Demo Install › Log In"; 
	public static String expDashboardTitle = "Dashboard ‹ WordPress Demo Install — WordPress";
	public static String expPostsPageTitle = "Posts ‹ WordPress Demo Install — WordPress";
	public static String expAddNewPageTitle = "Add New Post ‹ WordPress Demo Install — WordPress";
	public static String expEditPostTitle = "Edit Post ‹ WordPress Demo Install — WordPress";


	public static WebDriver openBrowesrAndApp(String browserName, String url)
	{
		switch(browserName.toLowerCase())
		{
			case "firefox" :
			{
				System.setProperty("webdriver.gecko.driver", "/Users/deepaksharma/Documents/Study/Selenium Practice/geckodriver");
				driver = new FirefoxDriver();
				break;
			}
			
			case "chrome" :
			{
				driver  = new ChromeDriver();
				break;
			}
			
			case "ie" :
			case "internet explorer" :
			case "internetexplorer" :
			{
				driver = new InternetExplorerDriver();
				break;
			}
			
			default :
			{
				System.out.println("Invalid browser name : "+browserName);
			}
		}
		
		driver.get(url);
		return driver;
		
	}
	
	public static boolean verifyTitle(WebDriver ldriver , String expTitle)
	{
		
		if (ldriver.getTitle().equals(expTitle))
		{
			return true;
		}
		
		return false;
		
	}	
	
	public static void waitUntilTitle(WebDriver ldriver, String expTitle)
	{
		WebDriverWait wait = new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.titleIs(expTitle));
	}
	
	
	
}

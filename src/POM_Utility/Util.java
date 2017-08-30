package POM_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Util {
	
	static WebDriver driver;
	public static String expLoginTitle = "WordPress Demo Install › Log In";
	public static String expDashboardTitle = "Dashboard ‹ WordPress Demo Install — WordPress";
	public static String expPostsPageTitle = "Posts ‹ WordPress Demo Install — WordPress";
	public static String expAddNewPageTitle = "Add New Post ‹ WordPress Demo Install — WordPress";
	public static String expEditPostTitle = "Edit Post ‹ WordPress Demo Install — WordPress";
	
	public static WebDriver browserStart(String browserName, String url)
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
			case "ie":
			case "internetexplorer":
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
	
	
	
	
	
	
	
	
	
	
	

}

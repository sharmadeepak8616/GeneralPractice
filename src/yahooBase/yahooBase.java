package yahooBase;

import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahooBase {
	
	public String browserName = null;
	
	private HashMap <String, String> pageTitle = new HashMap<String, String> ();

	public WebDriver initBrowser()
	{
		pageTitle.put ("HOME" , "Yahoo");
		pageTitle.put ("MAIL" , "Yahoo - login");
		pageTitle.put ("NEWS" , "Yahoo News - Latest News & Headlines");
		pageTitle.put ("SPORTS" , "Yahoo Sports | Sports News, Scores, Fantasy Games");
		pageTitle.put ("FINANCE" , "Yahoo Finance - Business Finance, Stock Market, Quotes, News");
		
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("FireFox"))
		{
			driver = new FirefoxDriver(); //profiling unstable on Selenium 3.4 (which in installed on this machine)
		}
		else if (browserName.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		return driver;
		
	}
	
	public void gotoPage (WebDriver handle , String pageName)
	{
		WebDriver pageHandle = handle;
		String gotoPage = pageName;
		String home = "https://www.yahoo.com/";
		//Thread.sleep(10000);
		String fullPgLink = home+gotoPage;
		if (pageName.equalsIgnoreCase("home"))
		{
			pageHandle.get(home);
		} else {
			pageHandle.get(fullPgLink);
		}
		
		validatePage(pageHandle , gotoPage);
		
	}
	
	public void validatePage (WebDriver currHandle , String pgToCheck)
	{

		//Assert.assertEquals(currHandle.getTitle() , pageTitle.get(pgToCheck).toUpperCase());
		
		 if (currHandle.getTitle().equals(pageTitle.get(pgToCheck.toUpperCase())))
		 {
			 System.out.println(pgToCheck+" -- "+currHandle.getTitle());
			 System.out.println("Landed on right page");
			 
		 } else {
			 
			 System.out.println("CHECK :: Landed on wrong page");
			 System.out.println(pgToCheck+" -- "+currHandle.getTitle());
		 }
 
	}
}

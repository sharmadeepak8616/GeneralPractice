package yahooProject;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;

import java.awt.Desktop.Action;
import java.lang.*;

public class yahooBase {
	
	public String browserName = null;
	//Integer a = 10;
	//char a = 'a';
	//float a  = (float) 10.10;
	//double a = 10.10;
	
	//int no[]= new int[5];
	
	private HashMap <String, String> pageTitle = new HashMap<String, String> ();
	//private HashMap <Integer, String> pageTitle1 = new HashMap<Integer, String> ();

	public WebDriver initBrowser()
	{
		pageTitle.put ("HOME" , "Yahoo");
		pageTitle.put ("LOGIN" , "Yahoo - login");
		pageTitle.put ("NEWS" , "Yahoo News - Latest News & Headlines");
		pageTitle.put ("SPORTS" , "Yahoo Sports | Sports News, Scores, Fantasy Games");
		pageTitle.put ("FINANCE" , "Yahoo Finance - Business Finance, Stock Market, Quotes, News");
		
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("FireFox"))
		{
			ProfilesIni allProf = new ProfilesIni();
			FirefoxProfile prof = allProf.getProfile("Selenium_Profile");
			driver = new FirefoxDriver(prof); //profiling unstable on Selenium 3.4 (which in installed on this machine)
		}
		else if (browserName.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		return driver;
		
	}
	
	public WebDriver gotoPage (WebDriver handle , String pageName)
	{
		WebDriver pageHandle = handle;
		String gotoPage = pageName;
		String home = "https://www.yahoo.com/";
		//Thread.sleep(10000);
		String fullPgLink = home+gotoPage;
		try
		{
		    Thread.sleep(5000);
		} 
		catch(InterruptedException ex) 
		{
			System.out.println(ex);
		    Thread.currentThread().interrupt();
		}
		
		if (pageName.equalsIgnoreCase("home"))
		{
			pageHandle.get(home);
		} else {
			pageHandle.get(fullPgLink);
		}
		
		validatePage(pageHandle , gotoPage);
		return pageHandle;
		
	}
	
	public void validatePage (WebDriver handle , String pgToCheck)
	{
		
		//System.out.println(pgToCheck+" -- "+handle.getTitle());
		//Assert.assertEquals(handle.getTitle() , pageTitle.get(pgToCheck).toUpperCase());
		//System.out.println(pageTitle.get(pgToCheck).toUpperCase());
		
		 if (handle.getTitle().equals(pageTitle.get(pgToCheck.toUpperCase())))
		 {
			 System.out.println(pageTitle.get(pgToCheck.toUpperCase()));
			 System.out.println(handle.getTitle());
			 System.out.println("Landed on right page");
		 } else {
			 System.out.println("CHECK :: Landed on wrong page");
			 System.out.println(pageTitle.get(pgToCheck.toUpperCase()));
			 System.out.println(handle.getTitle());
		 }
 
	}
	
	public WebDriver login (WebDriver handle , String email, String password)
	{
		handle.findElement(By.id("uh-signin")).click();
		validatePage(handle, "login");
		handle.findElement(By.id("login-username")).sendKeys(email);
		handle.findElement(By.xpath(".//input[@value='Next']")).click();
		handle.findElement(By.xpath(".//input[@id='login-passwd']")).sendKeys(password);
		handle.findElement(By.xpath(".//button[@id='login-signin']")).click();
		try        
		{
		    Thread.sleep(5000);
		} 
		catch(InterruptedException ex) 
		{
			System.out.println(ex);
		    Thread.currentThread().interrupt();
		}	
        String newEmailCount = handle.findElement(By.id("bottombar-mail-count-num")).getText();
        System.out.println("There are "+newEmailCount+" new emails in your inbox");
        return handle;

	}
	
	public void SignOut (WebDriver handle)
	{
		WebElement profileName = handle.findElement(By.xpath(".//button[@title='Profile']"));

		Actions hover = new Actions(handle);
		hover.moveToElement(profileName).perform();
		//handle.findElement(By.xpath(".//a[@id='uh-signout']")).click();
		hover.moveToElement(handle.findElement(By.linkText("Sign Out")));
		hover.click();
		hover.perform();
		handle.findElement(By.xpath(".//*[@id='uh-signin']")).isDisplayed();
		if (handle.findElement(By.xpath(".//*[@id='uh-signin']")).getText().equalsIgnoreCase("Sign in"))
		{
			System.out.println("Signed out Successfully");
		} else
		{
			System.out.println("Check Sign out functionality");
		}
	}



	
	
	
	
	
	
	
	
	
}

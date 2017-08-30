package BaseClass;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
import junit.framework.AssertionFailedError;

public class Pages {

	//WebDriver driver = new FirefoxDriver();
   public String browserName = null;

	
	public WebDriver browser ()
	{
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("FireFox"))
		{
			//ProfilesIni allProf = new ProfilesIni();
			//FirefoxProfile prof = allProf.getProfile("Selenium_Profile");
			driver = new FirefoxDriver(); //profiling unstable on Selenium 3.4 (which in installed on this machine)
		}
		else if (browserName.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		return driver;
	}
	
	
	@SuppressWarnings("deprecation")
	public WebDriver loginPage()
	{
		
		WebDriver driver = browser();
		
		driver.get("https://www.facebook.com");
		//driver.manage().window().maximize();
		//Thread.sleep(5000);
		
		//Assert.assertTrue(driver.findElement(By.xpath(".//h2[text()='Sign Up']")).getText().equalsIgnoreCase("Hello"));
		
		
		//System.out.println(driver.findElement(By.xpath(".//input[@value='Log In']")).isEnabled());
		
		try {
			Assert.assertTrue(driver.findElement(By.xpath(".//input[@value='Log In' and @type='submit']")).isEnabled());
			System.out.println("Landed on right page");
		} catch (AssertionFailedError e) {
	     	System.out.println("Wrong page loaded."+e);
			//driver.quit();
		}		
		
		//Verify Page
		/*System.out.println(driver.getTitle());
		//System.out.println(driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div/div[2]/h2")));
		Assert.assertTrue(driver.findElement(By.xpath(".//h2[text()='Sign Up']")).getText().equalsIgnoreCase("Sign Up"));
		try {
			Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div/div[2]/h2")).getText().equalsIgnoreCase("Hello"));
			System.out.println("Landed on right page");
		}
		catch (Exception e)
		{
			System.out.println("Wrong page loaded."+e);
			driver.quit();
		}
			
		//System.out.println(driver.getTitle());
        	*/
		return driver;
	}
	
	public void newRegistration() {
		
		
		WebDriver regPage = loginPage();
		
		ArrayList<String> values = new ArrayList<String>();
		ArrayList<String> fields = new ArrayList<String>();
		
		values.add("Deepak");
		values.add("Sharma");
		values.add("hellobrother@gmail.com");
		values.add("hellobrother@gmail.com");
		values.add("selenium44$$");
		
		fields.add(".//*[@id='u_0_7']");
		fields.add(".//*[@id='u_0_9']");
		fields.add(".//*[@id='u_0_c']");
        fields.add(".//*[@id='u_0_f']");
		fields.add(".//*[@id='u_0_j']");


		Iterator<String> iterValues = values.iterator();
		Iterator<String> iterFields = fields.iterator();
		
		while(iterValues.hasNext() && iterFields.hasNext())
		{
			regPage.findElement(By.xpath(iterFields.next())).sendKeys(iterValues.next());

		}
		
		regPage.findElement(By.xpath(".//*[@id='u_0_5']")).click();
		
		Select month = new Select(regPage.findElement(By.xpath(".//*[@id='month']")));
		month.selectByVisibleText("Jan");
		
		Select day = new Select(regPage.findElement(By.xpath(".//*[@id='day']")));
		day.selectByIndex(15);
		
		Select year = new Select(regPage.findElement(By.xpath(".//*[@id='year']")));
		year.selectByVisibleText("1986");
		
		regPage.findElement(By.xpath(".//*[@id='u_0_p']")).click();
		
		System.out.println(regPage.getTitle());
	}

	
}

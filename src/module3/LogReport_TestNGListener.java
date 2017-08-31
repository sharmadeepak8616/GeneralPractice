package module3;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(module3.LogReport_TestNGListener_Helper.class)
public class LogReport_TestNGListener {

	@Test(priority=1)
	public void logReport_Using_TestNGListener()
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		String title = driver.getTitle();
		System.out.println("Title of the page is :"+title);
		//Assert.assertTrue(title.contains("WordPress"));
		driver.quit();
	}
	
	@Test (priority=2)
	public void forcefullyFailingTest()
	{
		
		System.out.println("Inside the failing test case");
		Assert.assertTrue(false);
	}	

}

package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Retry_FailedTC_TestFile {
	// Here we have to specify the class – In our case class name is Retry

	@Test(retryAnalyzer=Retry_FailedTC_MainFile.class)
	public void verifySeleniumTitle()
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.learn-automation.com");
		
		// Here we are verifying that title contains QTP or not.
		//This test will fail because title does not contain QTP
		Assert.assertTrue(driver.getTitle().contains("QTP"));
		
		driver.quit();
		
	}
}

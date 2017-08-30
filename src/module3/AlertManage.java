package module3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AlertManage {
	
	@Test
	public void manageAlert() throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ksrtc.in/oprs-web/");
		
		String exp_alertMsg = "Please select start place.";
		
		
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		
		//Returns reference to alert window
		Alert alt = driver.switchTo().alert();
		
		String alertMsg = alt.getText();
		
		System.out.println("Alert Message : "+alertMsg);
		
		Thread.sleep(1000);
		
		alt.accept();

		Assert.assertEquals(alertMsg, exp_alertMsg);
		
		driver.quit();
		
	}
	
	
	

}

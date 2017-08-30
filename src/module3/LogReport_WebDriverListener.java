package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class LogReport_WebDriverListener {
	
	@Test
	public void logReport_Using_WebDriverListener()
	{
		System.out.println("START");
		
		WebDriver driver = new ChromeDriver();
		
		EventFiringWebDriver event = new EventFiringWebDriver(driver);
		
		LogReport_WebDriverListener_Helper handle = new LogReport_WebDriverListener_Helper();
		
		event.register(handle);
		
		event.navigate().to("http://www.facebook.com");
		
		event.findElement(By.xpath(".//*[@id='email']")).sendKeys("try@example.com");
		
		event.findElement(By.xpath(".//*[@id='pass']")).sendKeys("password");
		
		event.findElement(By.xpath(".//input[@value='Log In']")).click();
		
		event.quit();
		
		event.unregister(handle);
		
		System.out.println("END");
		
	}
	
	

}

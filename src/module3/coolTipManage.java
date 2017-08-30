package module3;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class coolTipManage {

	@Test
	public void coolTipHandle() throws Throwable
	{
		
		Logger logger = Logger.getLogger("coolTipManage");
		PropertyConfigurator.configure("log4j.properties");	
		
		logger.info("Started logging for testcase - "+logger.getName());
		
		WebDriver driver = new ChromeDriver();
		logger.info("Browser started");
		
		// ** Typecasting EventFiringWebDriver obj from driver **
		EventFiringWebDriver event = new EventFiringWebDriver(driver);
		logger.info("Event object created");

		LogReport_WebDriverListener_Helper eventHandle = new LogReport_WebDriverListener_Helper();
		logger.info("Listener object created");
		
		// ** Registering event obj with Listener object **
		event.register(eventHandle);
		logger.info("Register listener with event object");

		event.get("https://accounts.google.com/SignUp");
		logger.info("Website started");
		
		System.out.println("Page title is : "+event.getTitle());
		logger.info("Page title printed as - \""+event.getTitle()+"\"");
		
		event.findElement(By.id("FirstName")).sendKeys("Cool");
		event.findElement(By.id("LastName")).sendKeys("Tip");
		
		event.findElement(By.id("GmailAddress")).click();
		logger.info("Filled value and clicked to get bubble");

		Thread.sleep(1000);
		Actions action = new Actions(event);
		
		WebElement coolTipBubble = event.findElement(By.xpath(".//*[contains(@id,'bubble')]"));
		
		action.moveToElement(coolTipBubble).perform();
		logger.info("Moved mouse to bubble");
		
		String found_BubbleMsg = coolTipBubble.getText();
		String exp_BubbleMsg = "You can use letters, numbers, and periods."; 
		
		Assert.assertEquals(found_BubbleMsg.trim(), exp_BubbleMsg);
		logger.info("Compared bubble text");

		event.quit();
		logger.info("Website closed");
		
		event.unregister(eventHandle);
		logger.info("Unregister event handle from listener");
		
	}
	
	
	
}

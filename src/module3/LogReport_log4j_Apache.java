package module3;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogReport_log4j_Apache {

	@Test
	public void logsGeneration()
	{
		Logger logger = Logger.getLogger("Report_log4j_Apache");
		PropertyConfigurator.configure("log4j.properties");
		
		WebDriver driver = new ChromeDriver();
		logger.info("Browser started for testcase - "+logger.getName());
		//logger.getName();
		
		driver.get("http://www.ksrtc.in/oprs-web/");
		logger.info("Website started");
		
		String pageHeading = driver.getTitle();
		logger.info("Home page heading: "+pageHeading);
		
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		logger.info("Clicked on search button");
		
		Alert alt = driver.switchTo().alert();
		logger.info("Alert reference created");
		
		String alertMsg = alt.getText();
		logger.info("Alert Message - "+alertMsg);
		
		alt.accept();
		logger.info("Alert accepted");
		
		driver.quit();
		logger.info("Browser quit");
		
		
		
	}
	
	
	
	
}

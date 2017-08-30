package module4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ForcefullyWrite_WOsendKeys_JavaScript {
	
	@Test
	public void writeToDisableElements()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('identifierId').value='deepaksharma';");
		
		driver.quit();
	
	}
	
	
	
	

}

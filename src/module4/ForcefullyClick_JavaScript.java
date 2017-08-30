package module4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ForcefullyClick_JavaScript {
	
	@Test
	public void forcefully_Click()
	{

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('loginbutton').click();");
		
		driver.quit();

	}
	
}

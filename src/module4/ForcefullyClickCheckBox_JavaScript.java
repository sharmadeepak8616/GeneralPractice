package module4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ForcefullyClickCheckBox_JavaScript {
	
	@Test
	public void forcefully_ClickCheck()
	{

		WebDriver driver = new ChromeDriver();
		driver.get("");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('some id').checked=false;");
		
		driver.quit();
	}

}

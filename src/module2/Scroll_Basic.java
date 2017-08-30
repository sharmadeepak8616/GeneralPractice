package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll_Basic {

	@Test
	public void scrollPage() throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/");
		
		Thread.sleep(5000);
		//((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("scroll(0,400)");

		driver.quit();
	}
	
	@Test
	public void scrollToBottom()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");

		driver.quit();
	}
	
	@Test
	public void scrollToSpecificElement()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		WebElement ele = driver.findElement(By.xpath(".//*[text()='Get to Know Us']"));
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(true);", ele);
		
		driver.quit();
	}
	
	
	
	

}

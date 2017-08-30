package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Scroll_InView {

	@Test
	public void scroll_inView()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[5]"));
		
		je.executeScript("arguments[0].scrollIntoView();", element);
		System.out.println(element.getText());
		
		driver.quit();
		
	}
	
	
}

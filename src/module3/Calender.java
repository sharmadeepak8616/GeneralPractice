package module3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Calender {
	
	@Test
	public void calenderManage()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		
		WebElement frame = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath(".//input[@id='datepicker']")).click();
		
		// Selecting hard-coded date (Static method)
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[6]/a")).click();

		driver.quit();
		
	}

}

package module3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Calender_Dynamic {
	
	@Test
	public void calenderManage()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		
		WebElement frame = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath(".//input[@id='datepicker']")).click();

		// Selecting dynamic date (Dynamic method)
		List<WebElement> dates = driver.findElements(By.xpath(".//table[@class='ui-datepicker-calendar']//tbody//td"));
		
		System.out.println("Total date fields are : "+dates.size());
		
		
		for (WebElement date: dates)
		{
			if (date.getText().equals("10"))
			{
				date.click();
				break;
			} else
			{
				System.out.println("Date is :-"+date.getText()+"*");
			}
		}

		driver.quit();
		
	}

}

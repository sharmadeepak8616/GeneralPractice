package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExceptionHandling {

	@Test
	public void exceptionHandling()
	{
		
		System.out.println("Program started");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("Deepak");
		
		try
		{
			driver.findElement(By.xpath("")).sendKeys("password");
		}
		catch (NoSuchElementException e1)
		{
			System.out.println("Element didn't match the given xpath");
			System.out.println(e1.getMessage());
		}
		
		System.out.println("Program handled exception smoothly - ended");
		
		driver.quit();
		
	}
	
	
}

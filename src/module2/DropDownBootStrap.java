package module2;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class DropDownBootStrap {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		
		String homeHandle = driver.getWindowHandle();
		System.out.println("Home window id is "+homeHandle);
		
		/*
		driver.findElement(By.xpath("//*[text()='Create an account']")).click();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		int totalWindows = allWindowHandles.size();
		
		System.out.println("Total number of windows are : "+totalWindows);
		*/
		
		WebElement moreoptions = driver.findElement(By.xpath("//*[text()='More options']"));
		
		System.out.println("Text is : "+moreoptions.getText());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		moreoptions.click();
		
		//driver.findElement(By.xpath(".//*[text()='Create account']")).click();
		
		
		List<WebElement> menu = driver.findElements(By.xpath(".//div[@class='JAPqpe']/content/div[2]/div"));
		
		for (WebElement option: menu)
		{
			if (option.getAttribute("innerHTML").contentEquals("Create account"))
			{
				System.out.println("IF LOOP Option is : "+option.getAttribute("innerHTML"));
				Thread.sleep(5000);
				option.click();
				break;
			} else {
				System.out.println("Option is : "+option.getAttribute("innerHTML"));
			}
		}
		
		Thread.sleep(5000);
		System.out.println("Sign up page title : "+driver.getTitle());
		
		
		driver.quit();
		
		
		


	}

}

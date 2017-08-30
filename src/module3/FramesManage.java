package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesManage {
	
	@Test
	public void framesManage() throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/deepaksharma/Downloads/multiFrames.html");
		
		int framesCount = driver.findElements(By.xpath("//iframe")).size();
		System.out.println("Total number of frames on page is : "+framesCount);
		
		Assert.assertEquals(framesCount, 3, "Mismatch in total number of frames on home page.");
		
		// switching to frame1
		driver.switchTo().frame("w3s");
		
		driver.findElement(By.xpath(".//a[text()='Projects']")).click();
		
		// back to main window
		driver.switchTo().defaultContent();
		
		String linkText = driver.findElement(By.xpath("//*[contains(text() , 'Selenium tutorial')]")).getAttribute("innerHTML");

		System.out.println("Text of link on main page :- "+linkText);
		
		Assert.assertEquals(linkText.trim(), "Click here for Selenium tutorial");

		// switching to frame2 using webElement
		WebElement secondFrame = driver.findElement(By.xpath("//iframe[@name='selenium']"));
		driver.switchTo().frame(secondFrame);

		
		driver.findElement(By.xpath("//*[@title='Get Selenium']")).click();

		// back to main window
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[contains(text() , 'Selenium tutorial')]")).click();
		
		String ExpPage2Heading = "Selenium WebDriver tutorial - Selenium WebDriver tutorial Step by Step";
		
		String foundPage2Heading = driver.getTitle();
		
		Assert.assertEquals(foundPage2Heading, ExpPage2Heading, "Mismatch in title of second page.");
		
		driver.quit();
	}

}

package module3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class ScreenShot_On_Failure {
	
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void screenShotOnFailue1()
	{
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath(".//*[@id='gosuggest']")).sendKeys("New Delhi");
	}
	
	@Test
	public void screenShotOnFailue2()
	{
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath(".//*[@id='gosuggest_inputSrc']")).sendKeys("New York");
	}
	
	@AfterMethod
	public void captureOn_Failure(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			takeScreenShot(driver, result.getName());
		}
		//driver.quit();
	}
	
	public static void takeScreenShot(WebDriver ldriver, String fileName)
	{
		TakesScreenshot ts = (TakesScreenshot)ldriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./ScreenShots/"+fileName+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}			
	}

}

package module2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBasic {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@name='firstname' and @type='text']")).sendKeys("Deepak");
		driver.findElement(By.xpath("//input[@name='lastname' and @type='text']")).sendKeys("Sharma");
		driver.findElement(By.xpath("//input[@name='reg_email__' and @type='text']")).sendKeys("koichakkarnai@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__' and @type='text']")).sendKeys("koichakkarnai@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__' and @type='password']")).sendKeys("password@1234");
		

		Select month = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		month.selectByVisibleText("Feb");
		
		Select day = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		day.selectByValue("16");
		
		Select year = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		year.selectByIndex(2);
		
		capture(driver, "hello1");
		//Thread.sleep(5000);
		year.selectByIndex(0);
		capture(driver, "hello2");
		
		driver.quit();
		
	}

	public static void capture(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./ScreenShots/"+name+".png"));
	}

}

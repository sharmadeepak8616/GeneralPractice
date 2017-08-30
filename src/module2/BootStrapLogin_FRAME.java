package module2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootStrapLogin_FRAME {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='sign-in-icon-down']")).click();
		driver.findElement(By.xpath(".//*[@id='signInLink']")).click();
		
		// ways to count number of frames
		int frameCount1 = driver.findElements(By.tagName("iframe")).size();  //** Way 1 **
		
		List<WebElement> frames = driver.findElements(By.xpath("//iframe"));  //** Way 2 **
		int frameCount2 = frames.size();
		
		System.out.println(frameCount1+" -- "+frameCount2);

		WebElement f = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(f);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath(".//button[text()='signup with email']")).click();
		driver.findElement(By.className("action-button signup-screen signup-btn")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='emailID']")).sendKeys("deepak");
		driver.findElement(By.className("icon-close")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Print/SMS Ticket']")).click();

	}

}

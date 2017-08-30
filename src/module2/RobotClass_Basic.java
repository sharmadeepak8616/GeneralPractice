package module2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClass_Basic {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("try@example.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("password");
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}

package module2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExplicitDemo {

	public static void main(String[] args) {
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		// ** IMPLICITI WAIT **
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		// This to be added if Implicit wait is to be used instead Explicit.
		//driver.findElement(By.xpath("//p[text()='WebDriver']"));  
		
        // ** Code starts for Explicit wait **       
        WebDriverWait expWait = new WebDriverWait(driver, 4);

        WebElement element;
		try {
			element = expWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
	        if (element.isDisplayed())
	        {
	       	    System.out.println("Element get displayed");
	        }
		} catch (Exception e) {
			System.out.println("Element not found before timeout\n");
			System.out.println(e.getMessage());
		}
         // ** Code ends for Explicit wait **

        driver.quit();
	}

}

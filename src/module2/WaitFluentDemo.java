
package module2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class WaitFluentDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		// ** Fluent code starts **
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(7, TimeUnit.SECONDS)
		       .pollingEvery(1, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);


		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	 
		    	 	WebElement ele = driver.findElement(By.xpath(".//*[@id='demo']"));
		    	 	String value = ele.getAttribute("innerHTML");
		    	 
		    	 	if (value.equalsIgnoreCase("WebDriver"))
		    	 	{
		    	 		System.out.println("Element found - "+value);
		    	 		return ele;
		    	 	} else
		    	 	{
		    	 		System.out.println("Element NOT found - "+value);
		    		 return null;
		    	 	}
		     }
		   });
		// ** Fluent code ends ** 
		
		
		boolean status = element.isDisplayed();
		
		if (status)
		{
			System.out.println("Test case passed");
		}
		
		driver.quit();
		
	}

}

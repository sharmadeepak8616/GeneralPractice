package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickInvisibleElement_JavaScript {

	
	public void clickInvisible()
	{
		
		// #########################################################################
		// This is also one of the solutions for ElementNotVisible Exception
		// or if we forcefully make an element visible in DOM
		// #########################################################################
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		
		//Suppose this element is invisible.
		WebElement elem = driver.findElement(By.xpath(""));
		
		//Using JavaScript, we will make this element visible.
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].style.height='auto'; arguments[0].style.visibility='visible';", elem);
		// Above can also be written as (MAY BE) :
		//js.executeScript("arguments[0].setAttribute('style' , 'visibility:visible ; height: auto;');", elem);
		
		
		// Now we can click on 'elem' using Selenium
		elem.click();
		
		
		
		
	}
	
	
	
	
}

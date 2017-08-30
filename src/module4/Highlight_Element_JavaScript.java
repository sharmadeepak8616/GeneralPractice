package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Highlight_Element_JavaScript {
	
	@Test
	public void highlightElement()
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		
		WebElement username = driver.findElement(By.xpath(".//*[@id='identifierId']"));
		highlight_Ele(driver, username);

		
		WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
		highlight_Ele(driver, nextButton);
		
		System.out.println("HIGHLIGHTED FOUND ELEMENTS");
		

		driver.quit();
		
	}

	public void highlight_Ele(WebDriver ldriver, WebElement element)
	{
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		
		js.executeScript("arguments[0].setAttribute('style','background:yellow ; border: 2px solid red;');", element);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		js.executeScript("arguments[0].setAttribute('style' , 'border : 2px solid white;');", element);
	}
	
	

}

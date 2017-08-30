package module2;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ADV_Actions_RightClick {

	public static void main(String[] args) throws Throwable {
		
		/*
		moveToElement(WebElement)  -- ** Mouse Hover ** Handle Auto-suggestion in Selenium  **

		contextClick()  --    ** Right click on page **

		contextClick(WebElement)  -- ** Right click on specific Element **

		sendKeys(KEYS.TAB)  --     ** For keyboard events **

		clickAndHold(WebElement)  --     ** Click on element and hold until next operation **

		release()   --     ** Release the current control **
		*/
		
		WebDriver driver = new ChromeDriver();
        
        
        
        
        // #####################################################################
        //	** RIGHT CLICK USING Actions Class	**
        // #####################################################################
        
        driver.get("https://www.google.co.in/");
        Actions act = new Actions(driver);
        //act.contextClick().perform();
        
        // code to right click on specific element ** use 'sendKeys' to use keyboard to select an option from right click **
        WebElement companies = driver.findElement(By.xpath("//a[text()='Gmail']"));
        act.contextClick(companies).perform();  

		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}

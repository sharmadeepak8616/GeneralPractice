package module2;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ADV_Actions_AutoSuggestions {

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
		driver.get("https://www.naukri.com/");
		

        driver.findElement(By.xpath(".//*[@class='searchJob']")).click();
        
        // ** Auto-suggestion handling code starts **
        
        //type - keyword
        driver.findElement(By.xpath("//input[@class='sugInp']")).sendKeys("test");
        
        // all auto-suggestions
        List<WebElement> autoSugg = driver.findElements(By.xpath(".//*[@id='sugDrp_skill']/ul/li"));
        
        Actions act = new Actions(driver);
        
        System.out.println("Total auto-suggestions : "+autoSugg.size());
        
        // move to a particular auto-suggestion
        act.moveToElement(driver.findElement(By.xpath(".//*[@id='sugDrp_skill']/ul/li[10]/div"))).perform();
        Thread.sleep(2000);
        // click on the same auto-suggestion
        act.click(driver.findElement(By.xpath(".//*[@id='sugDrp_skill']/ul/li[10]/div"))).perform();
        
        // ** Auto-suggestion handling code ends **
        
        String main = driver.getWindowHandle();
        
        Set<String> handles = driver.getWindowHandles();
        System.out.println("Total number of windows : "+handles.size());
        
        
        for (String handle : handles)
        {
        		if(!(main.equalsIgnoreCase(handle)))
        		{
        			driver.switchTo().window(handle);
        			Thread.sleep(5000);
        			driver.close();
        		}
        }
        
        
        driver.switchTo().window(main);
        driver.findElement(By.xpath("//button[@type='submit' and contains(text(), 'Search')]")).click();
        
		driver.quit();

	}

}

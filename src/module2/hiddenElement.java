package module2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenElement {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement> options = driver.findElements(By.id("male"));		
		
		for(WebElement option:options)
		{
			int x = option.getLocation().getX();
			int y = option.getLocation().getY();
			
			if (x!=0 && y!=0)   //hidden element has x and y as 0.
			{
				option.click();
				break;
			}
		}
		
		clickLang(driver, "java");
		Thread.sleep(5000);
		clickLang(driver, "ruby");
		driver.quit();
	}

	public static void clickLang(WebDriver ldriver, String usrLang) {
		
		List<WebElement> langs = ldriver.findElements(By.name("lang"));
		
		for(WebElement lang : langs)
		{
			if(lang.getAttribute("value").equalsIgnoreCase(usrLang))
			{
				lang.click();
				break;
			}
		}		
		
	}

}

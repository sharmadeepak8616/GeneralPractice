package module2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxandRadioButton {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml");
		
		
		driver.findElement(By.xpath(".//*[@id='name1']")).sendKeys("Deepak");
		driver.findElement(By.xpath(".//*[@id='tel']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("koichakkarnai@gmail.com");
		
		// ###################################################
		// 					RADIO BUTTON
		// ###################################################
		
		List<WebElement> softwares = driver.findElements(By.xpath("//input[@name='software' and @type='radio']"));
		
		for (WebElement software: softwares)
		{
			if(software.getAttribute("value").contentEquals("Peachtree"))
			{
				software.click();
				break;
			} else
			{
				System.out.println("Software available before \"Peach Tree\" is : "+software.getAttribute("value"));
			}
		}
		

		
		List<WebElement> levels = driver.findElements(By.xpath("//input[@name='level' and @type='radio']"));
		
		for (WebElement level: levels)
		{
			if(level.getAttribute("value").contentEquals("Advanced"))
			{
				level.click();
				break;
			} else
			{
				System.out.println("Levels other than \"Advanced\" is : "+level.getAttribute("value"));
			}
		}
		
		driver.findElement(By.xpath("//input[@value='SUBMIT' and @class='button']")).click();

		
		
		// ####################################################
		// 						CHECKBOX
		// ####################################################
		
	/*	List<WebElement> colors = driver.findElements(By.xpath("//input[@name='color' and @type='checkbox']"));
		
		for (WebElement color: colors)
		{
			if (color.getAttribute("value").contentEquals("blue"))
			{
				color.click();
				break;
			} else
			{
				System.out.println("Color value before blue : "+color.getAttribute("value"));
			}
		}
		
		
		List<WebElement> browsers = driver.findElements(By.xpath(".//input[@name='browser' and @type='radio']"));
		
		for (WebElement browser: browsers)
		{
			if (browser.getAttribute("value").contentEquals("Mozilla"))
			{
				browser.click();
			} else
			{
				System.out.println("Other browser value available : "+browser.getAttribute("value"));
			}
		}		
		
	*/	
		
		driver.quit();
	}

}

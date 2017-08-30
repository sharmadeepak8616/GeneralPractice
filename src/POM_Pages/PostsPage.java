package POM_Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PostsPage {

	
	WebDriver driver;
	
	public PostsPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	
	By submenu = By.xpath(".//li[@id='menu-posts']//ul/li");
	
	
	public void subMenuClick(String subItem)
	{
		
		List<WebElement> subMenuList = driver.findElements(submenu);
		
		for (WebElement submenu : subMenuList)
		{
			if(submenu.getText().equalsIgnoreCase(subItem))
			{
				submenu.click();
				break;
			}
		}

	}
	
	
	
	
	
	
	
}

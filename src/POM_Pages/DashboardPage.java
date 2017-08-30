package POM_Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	

	By sideMenuList = By.xpath("//ul[@id='adminmenu']/li");
	By addNewPost = By.xpath("//a[text()='Add New']");
	
	
	public void sideMenuSelect(String item)
	{
		List<WebElement> sidemenu = driver.findElements(sideMenuList);
		
		for (WebElement menu: sidemenu)
		{
			if(menu.getText().equalsIgnoreCase(item))
			{
				menu.click();
				break;
			}
		}
	}
	
	
	
	
	
	public String getDashboardTitle()
	{
		
		
		return "";
	}
	
	
	
	
	
	
	

}

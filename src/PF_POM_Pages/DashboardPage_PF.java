package PF_POM_Pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage_PF {
	
	WebDriver driver;
	
	public DashboardPage_PF (WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	
	@FindBy(how=How.XPATH, using="//ul[@id='adminmenu']/li")
	List<WebElement> menuList;
	
	
	
	public void sidemenuSelect(String item)
	{	
		for (WebElement menu : menuList)
		{
			if(menu.getText().equalsIgnoreCase(item))
			{
				menu.click();
				break;
			}
		}

	}
	
	

}

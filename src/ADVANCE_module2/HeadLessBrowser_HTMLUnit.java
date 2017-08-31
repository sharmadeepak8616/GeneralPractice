package ADVANCE_module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeadLessBrowser_HTMLUnit {
	
	
	@Test
	public void headless_HTMLUnit()
	{
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		String expAppTitle = "WordPress Demo Install › Log In";
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase(expAppTitle), "Application title is not fund as expected.");
		driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys("demo123");
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		String expAfterLoginTitle = "Dashboard ‹ WordPress Demo Install — WordPress";
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase(expAfterLoginTitle), "Application title, after login is not fund as expected.");

	}
	

}

package ADVANCE_module2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import module2.DropDownBasic;

public class HeadLessBrowser_PhantomJS {
	
	@Test
	public void headless_PhantomJS()
	{
		
		File src = new File("/Users/deepaksharma/phantomjs/bin/phantomjs");
		
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		
		WebDriver driver = new PhantomJSDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		// Capture method of Module2 -- DroDownBasic.java
		DropDownBasic.capture(driver, "PhantomJS_App");
		
		String expAppTitle = "WordPress Demo Install › Log In";
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase(expAppTitle), "Application title is not fund as expected.");
		
		driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys("demo123");
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		
		String expAfterLoginTitle = "Dashboard ‹ WordPress Demo Install — WordPress";
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase(expAfterLoginTitle), "Application title, after login is not fund as expected.");

		// Capture method of Module2 -- DroDownBasic.java
		DropDownBasic.capture(driver, "PhantomJS_AfterLogin");

		
	}
	
	
	

}

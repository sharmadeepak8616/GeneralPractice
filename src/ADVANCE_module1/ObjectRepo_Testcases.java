package ADVANCE_module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ObjectRepo_Testcases {
	

	ObjectRepo_Reader reader = new ObjectRepo_Reader();
	
	WebDriver driver = new FirefoxDriver();
	
	@BeforeTest
	public void setUp()
	{
		driver.get(reader.getApplicationUrl());
	}

	@Test
	public void loginWordpress()
	{
		driver.findElement(By.xpath(reader.getUsernameXpath())).sendKeys("admin");
		driver.findElement(By.xpath(reader.getPasswordXpath())).sendKeys("demo123");
		driver.findElement(By.xpath(reader.getLoginButtonXpath())).click();
		System.out.println(driver.getTitle());
		driver.quit();
	}

}

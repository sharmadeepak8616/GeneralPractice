package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Frame_BootStrap_Login {
	
	@Test
	public void bootStrap_Login()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("//a[@id='get_sign_in']")).click();
		
		// switch to frame to fill sing-in details
		driver.switchTo().frame("authiframe");
		
		driver.findElement(By.xpath("//button[@id='mobileSubmitBtn']")).click();
		
		String expErrMsg = "Please enter a valid mobile";
	
		String actErrMsg = driver.findElement(By.id("authMobileErrorMsg")).getAttribute("innerHTML");
		
		System.out.println("Error msg found : "+actErrMsg);
		
		Assert.assertEquals(expErrMsg, actErrMsg);
		
		driver.findElement(By.xpath("//input[@id='authMobile']")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//button[@id='mobileSubmitBtn']")).click();
		
		driver.quit();

	}
	
	
	

}

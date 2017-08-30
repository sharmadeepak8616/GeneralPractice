package module3;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMsgVerify {
	
	@Test
	public void verifyErrMsgGmail() throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com/");
		
		String emailErr = "Enter an email or phone number";
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'doesn’t match any account')]")));
		
		String errMsg = driver.findElement(By.xpath("//*[text()='Enter an email or phone number']")).getText();
		
		Assert.assertTrue(errMsg.equals(emailErr));
		
		driver.quit();

	}
	
	@Test
	public void verifyErrMsgFb() throws Throwable
	{
		
		WebDriver driver = new ChromeDriver();
		
		String emailErr = "The email address or phone number that you've entered doesn't match any account. Sign up for an account.";
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath(".//*[@id='u_0_0']")).click();
		
		String errMsg = driver.findElement(By.xpath(".//*[@id='globalContainer']/div[3]/div/div/div")).getText();
		
		Assert.assertEquals(errMsg, emailErr);
		
		driver.quit();

	}
		
	
	
	
}

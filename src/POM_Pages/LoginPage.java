package POM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	
	By username = By.id("user_login");
	By password = By.xpath(".//*[@id='user_pass']");
	By loginButton = By.xpath(".//*[@id='wp-submit']");
	By loginError = By.xpath(".//*[@id='login_error']");
	
	
	public void typeUsername(String uid)
	{
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typePassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		driver.findElement(loginButton).click();
	}
	
	public void login(String uid, String pwd)
	{
		typeUsername(uid);
		typePassword(pwd);
		clickLogin();
	}
	
	
	public String getLoginErrorText()
	{
		return driver.findElement(loginError).getText();
		
	}
	
	public String getLoginErrorInnerHTML()
	{
		return driver.findElement(loginError).getAttribute("innerHTML");
	}
	
	

}

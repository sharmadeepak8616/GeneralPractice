package PF_POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage_PF {
	
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(how=How.ID, using="user_login")
	WebElement username;
	
	@FindBy(how=How.XPATH, using=".//*[@id='user_pass']")
	WebElement password;
	
	@FindBy(how=How.ID_OR_NAME, using="wp-submit")
	WebElement loginButton;
	
	@FindBy(id="login_error")
	WebElement loginError;
	
	
	public void typeUsername(String uid)
	{
		username.sendKeys(uid);
	}
	
	
	public void typePassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickLogin()
	{
		loginButton.click();
	}
	
	public void login(String uid, String pass)
	{
		username.sendKeys(uid);
		password.sendKeys(pass);
		loginButton.click();
	}
	
	public String getLoginErrorText()
	{
		return loginError.getText();
	}

	
	public String getLoginErrorInnerHTML()
	{
		return loginError.getAttribute("innerHTML");
	}

}

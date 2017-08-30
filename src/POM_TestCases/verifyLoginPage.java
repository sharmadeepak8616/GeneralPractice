package POM_TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM_Pages.DashboardPage;
import POM_Pages.LoginPage;
import POM_Utility.Util;

public class verifyLoginPage {
	
	SoftAssert assertion = new SoftAssert();
	String url = "http://demosite.center/wordpress/wp-login.php";
	String expLoginTitle = "WordPress Demo Install › Log In";
	String expDashboardTitle = "Dashboard ‹ WordPress Demo Install — WordPress";
	
	@Test
	public void validUser()
	{
		WebDriver driver = Util.browserStart("chrome", url);
	
		LoginPage loginPage = new LoginPage(driver);
		
		assertion.assertTrue(Util.verifyTitle(driver,expLoginTitle), "Website Title didn't match");
		
		loginPage.login("admin", "demo123");

		assertion.assertTrue(Util.verifyTitle(driver,expDashboardTitle), "Dashboard Title didn't match");
		
		assertion.assertAll();
	
		driver.quit();
	}

	@Test
	public void invalidPasswordLogin()
	{
		
		WebDriver driver = Util.browserStart("firefox", url);
		
		LoginPage loginPage = new LoginPage(driver);
		
		assertion.assertTrue(Util.verifyTitle(driver,expLoginTitle), "Website Title didn't match");
		
		loginPage.typeUsername("admin");
		loginPage.typePassword("password");
		loginPage.clickLogin();
		
		String expWrongPwdError = "ERROR: The password you entered for the username admin is incorrect. Lost your password?";
		
		assertion.assertEquals(loginPage.getLoginErrorText() , expWrongPwdError);
		assertion.assertAll();
		
		driver.quit();

	}

	
}

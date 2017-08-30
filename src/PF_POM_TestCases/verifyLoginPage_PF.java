package PF_POM_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PF_POM_Pages.DashboardPage_PF;
import PF_POM_Pages.LoginPage_PF;
import PF_POM_Utility.Util_PF;
import POM_Utility.Util;

public class verifyLoginPage_PF {

	WebDriver driver;
	
	@BeforeMethod
	public void initApp()
	{
		System.out.println("Entering before method");
		driver = Util_PF.openBrowesrAndApp("firefox", "http://demosite.center/wordpress/wp-login.php");
		Assert.assertTrue(Util_PF.verifyTitle(driver, Util_PF.expLoginTitle), "Login page title didn't match");
	}
	
	@Test
	public void validUser() throws Throwable
	{
		LoginPage_PF loginPF = PageFactory.initElements(driver, LoginPage_PF.class);
		loginPF.login("admin", "demo123");
		Util_PF.waitUntilTitle(driver, Util_PF.expDashboardTitle);
		Assert.assertTrue(Util_PF.verifyTitle(driver, Util_PF.expDashboardTitle), "Dashboard title didn't match");
		
		DashboardPage_PF dashboardPF = PageFactory.initElements(driver, DashboardPage_PF.class);
		Thread.sleep(5000);
		dashboardPF.sidemenuSelect("comments");
		Thread.sleep(5000);
		dashboardPF.sidemenuSelect("users");
		Thread.sleep(5000);
		dashboardPF.sidemenuSelect("pages");
		Thread.sleep(5000);
		dashboardPF.sidemenuSelect("posts");
		Thread.sleep(5000);
	}

	@Test
	public void invalidPasswordLogin()
	{
		LoginPage_PF loginPF = PageFactory.initElements(driver, LoginPage_PF.class);
		loginPF.typeUsername("admin");
		loginPF.typePassword("invalid");
		loginPF.clickLogin();
		loginPF.getLoginErrorText();
		String expWrongPwdError = "ERROR: The password you entered for the username admin is incorrect. Lost your password?";
		Assert.assertEquals(loginPF.getLoginErrorText() , expWrongPwdError);
	}
	
	
	@AfterMethod
	public void quitBrower()
	{
		System.out.println("Quitting brower");
		driver.quit();
	}
	
	
	
}

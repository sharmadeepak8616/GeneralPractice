package POM_TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM_Pages.AddNewPosts;
import POM_Pages.DashboardPage;
import POM_Pages.LoginPage;
import POM_Pages.PostsPage;
import POM_Utility.Util;

public class verifyPostsPage {

	String url = "http://demosite.center/wordpress/wp-login.php";
	SoftAssert assertion = new SoftAssert();

	

	@Test
	public void addNewPost()
	{
		
		WebDriver driver = Util.browserStart("firefox", url);
		assertion.assertTrue(Util.verifyTitle(driver,Util.expLoginTitle), "Website Title didn't match");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("admin", "demo123");
		
		
		assertion.assertTrue(Util.verifyTitle(driver,Util.expDashboardTitle), "Dash-board Title didn't match");
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.sideMenuSelect("posts");
		
		assertion.assertTrue(Util.verifyTitle(driver,Util.expPostsPageTitle), "Posts Title didn't match");
		PostsPage postsPage = new PostsPage(driver);
		postsPage.subMenuClick("add new");
		
		assertion.assertTrue(Util.verifyTitle(driver,Util.expAddNewPageTitle), "Add New Post Title didn't match");
		AddNewPosts newPost = new AddNewPosts(driver);
		newPost.typeNewPostTitle("Test 1.0 - Title - happy");
		newPost.typeNewPostContent("Test 1.0 - content - happy");
		newPost.clickPublish();
		
		System.out.println(newPost.getEditPostheading());
		System.out.println(driver.getTitle());

		assertion.assertAll();;
		driver.quit();		
		
		
	}

}

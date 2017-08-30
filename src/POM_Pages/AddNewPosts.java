package POM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddNewPosts {
	
	WebDriver driver;
	
	public AddNewPosts(WebDriver ldriver)
	{
		this. driver = ldriver;
	}
	
	
	By newPostTitle = By.xpath(".//*[@id='title']");
	By newPostContent = By.xpath(".//*[@id='content']");
	By publishButton = By.id("publish");
	By editPostHeading = By.xpath("//h2");
	
	public void typeNewPostTitle(String title)
	{
		driver.findElement(newPostTitle).sendKeys(title);
	}
	
	public void typeNewPostContent(String content)
	{
		driver.findElement(newPostContent).sendKeys(content);
	}
	
	public void clickPublish()
	{
		driver.findElement(publishButton).click();
	}
	
	
	public String getEditPostheading()
	{
		return driver.findElement(editPostHeading).getText();
	}
	
	
	
	
	

}

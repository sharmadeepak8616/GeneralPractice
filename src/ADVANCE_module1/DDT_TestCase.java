package ADVANCE_module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DDT_TestCase {
	
	@BeforeMethod
	public void start()
	{
	//	DDT_Array.databank();
		
		System.out.println("To test git integration with Eclipse");
		
	}
	
	// If Test and DataProvider are in SAME file. :-  @Test (dataProvider = "source")
	// If Not :-  (dataProviderClass=dataSource.class, dataProvider="source")
	@Test (dataProviderClass=DDT_ExcelUse.class, dataProvider="source excel1")
	public void loginWordPress(String uname, String pass)
	{

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys(uname);
		
		driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys(pass);
		
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();

	}
	

	@Test (dataProviderClass=DDT_ExcelUse.class, dataProvider="source excel")
	public void loginWordPress(String uname, String pass, String uname1, String pas, String p)
	{

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys(uname);
		
		driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys(pass);
		
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();

	}
	

	@Test (dataProviderClass=DDT_Array.class, dataProvider="source")
	public void loginWordPress(String uname, String pass, String trial)
	{

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys(uname);
		
		driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys(pass);
		
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		
		System.out.println("Attempt - "+trial);

	}	
	
	
}

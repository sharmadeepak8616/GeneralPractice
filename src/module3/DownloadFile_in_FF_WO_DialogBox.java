package module3;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DownloadFile_in_FF_WO_DialogBox {

	@Test
	public void downloadAuto()
	{
		
		ProfilesIni prof = new ProfilesIni();
		
		// Create a profile
		FirefoxProfile profile=prof.getProfile("Selenium_Profile");

		// Set preferences for file type 
		profile.setPreference("browser.helperApps.neverAsk.openFile", "application/pdf");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
		
		// Open browser with profile                   
		WebDriver driver=new FirefoxDriver(profile);
		
		// Set implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		// Open APP to download application
		driver.get("https://www.tutorialspoint.com/java/java_tutorial.pdf");
		
		// Click on download 
		driver.findElement(By.xpath(".//button[@id='download']")).click();
		
		driver.quit();
		
	}
	
	
}

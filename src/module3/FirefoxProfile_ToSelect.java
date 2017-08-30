package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FirefoxProfile_ToSelect {

	
	public void specific_FirefoxProfile_select()
	{
		
		ProfilesIni prof = new ProfilesIni();
		FirefoxProfile prof_FF = prof.getProfile("Selenium_Profile");
		
		WebDriver driver = new FirefoxDriver(prof_FF);
		
		driver.get("https://www.google.com");
		
		driver.quit();
	
	}	
	
}

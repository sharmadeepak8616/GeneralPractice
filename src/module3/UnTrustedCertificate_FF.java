package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class UnTrustedCertificate_FF {
	
	@Test
	public void unTrustedCert_FF()
	{
		
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		
		WebDriver driver = new FirefoxDriver(profile);
		
		driver.get("URL of website which can give untrusted certificate issue");
		// program further
		
	}
	
	
	

}

package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class UnTrustedCertificate_Safari {
	
	@Test
	public void UnTrustedCertificate_Safari()
	{
		
		DesiredCapabilities cap = new DesiredCapabilities().safari();
		
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, "true");
		
		WebDriver driver = new SafariDriver(cap);
		
		driver.get("URL of website which can give untrusted certificate issue");
		// program further 
		
		
	}
	
	
	

}

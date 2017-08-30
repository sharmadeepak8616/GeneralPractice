package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class UnTrustedCertificate_IE {
	
	@Test
	public void UnTrustedCertificate_IE()
	{
		
		DesiredCapabilities cap = new DesiredCapabilities().internetExplorer();
		
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, "true");
		
		WebDriver driver = new InternetExplorerDriver(cap);
		
		driver.get("URL of website which can give untrusted certificate issue");
		// program further 
		
		
	}
	
	
	

}

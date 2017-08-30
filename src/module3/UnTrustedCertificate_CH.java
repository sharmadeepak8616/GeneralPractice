package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class UnTrustedCertificate_CH {
	
	@Test
	public void UnTrustedCertificate_CH()
	{
		
		DesiredCapabilities cap = new DesiredCapabilities().chrome();
		
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, "true");
		
		WebDriver driver = new ChromeDriver(cap);
		
		driver.get("URL of website which can give untrusted certificate issue");
		// program further
		
	}
	
	

}

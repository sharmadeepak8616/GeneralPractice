package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class UnTrustedCertificate_General {
	
	@Test
	public void UnTrustedCertificate_General()
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, "true");
		
		WebDriver driver = new FirefoxDriver();
	//	WebDriver driver = new ChromeDriver();
	//	WebDriver driver = new InternetExplorerDriver();
		
		driver.get("URL of website which can give untrusted certificate issue");
		// program further 
		
		
	}
	
	

}

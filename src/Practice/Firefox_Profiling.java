package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Firefox_Profiling {

	public static void main(String[] args) {
		//ProfilesIni allProf = new ProfilesIni();
		//FirefoxProfile prof = allProf.getProfile("Firefox_Selenium");
		
		//System.setProperty("webdriver.gecko.driver", "/Users/deepaksharma/Documents/Study/Selenium Practice/geckodriver");
		//FirefoxDriver driver = new FirefoxDriver(prof); //profiling unstable on Selenium 3.4 (which in installed on this machine)
		FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.gmail.com");
       //driver.manage().window().maximize();
       // driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();  //click "Sign In" 

        
        WebElement email = driver.findElement(By.id("identifierId"));
        email.sendKeys("learning");
        //above two lines of code ca be summed up as below.
        //driver.findElement(By.id("identifierId")).sendKeys("sharma.deepak8616");  <- IMPORTANT
        
        
        WebElement nextButton = driver.findElement(By.id("identifierNext"));
        nextButton.click();
        //above two lines of code ca be summed up as below.
        //driver.findElement(By.id("identifierNext")).click();  <- IMPORTANT        
        
        System.out.println(driver.getTitle());
        driver.close();

	}

}

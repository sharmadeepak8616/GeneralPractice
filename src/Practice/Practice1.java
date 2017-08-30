package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Practice1 {

	public static void main (String[] args)
	{
		// To skip below mentioning browser driver again and again, save the same in /usr/local/bin/  <- IMPORTANT
		// USE FIREFOX
		/*System.setProperty("webdriver.gecko.driver", "/Users/deepaksharma/Documents/Study/Selenium Practice/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        System.out.println("browser opened successfully");
        driver.close();
        */
		
		//USE CHROME
		/*System.setProperty("webdriver.chrome.driver", "/Users/deepaksharma/Documents/Study/Selenium Practice/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println("browser opened successfully");
        driver.close();
		*/
        
		//USE INTERNET EXPLORER (only for windows)
		/*System.setProperty("webdriver.ie.driver", "/Users/deepaksharma/Documents/Study/Selenium Practice/IEDriverServer");
        InternetExplorerDriver driver = new InternetExplorerDriver();
        driver.get("http://www.google.com");
        System.out.println("browser opened successfully");
        //driver.close();		
		*/	
		//System.setProperty("webdriver.gecko.driver", "/Users/deepaksharma/Documents/Study/Selenium Practice/geckodriver");
		WebDriver driver = null;
        driver = new FirefoxDriver();
        driver.get("http://www.gmail.com");
        
        WebElement email = driver.findElement(By.id("identifierId"));
        email.sendKeys("sharma.deepak8616");
        //above two lines of code can be summed up as below.
        //driver.findElement(By.id("identifierId")).sendKeys("sharma.deepak8616");  <- IMPORTANT
        
        
        WebElement nextButton = driver.findElement(By.id("identifierNext"));
        nextButton.click();
        //above two lines of code ca be summed up as below.
        //driver.findElement(By.id("identifierNext")).click();  <- IMPORTANT        
        
        System.out.println(driver.getTitle());
        driver.close();
		
	}


}

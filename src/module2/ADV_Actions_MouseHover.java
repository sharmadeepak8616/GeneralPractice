package module2;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ADV_Actions_MouseHover {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		//driver.manage().window().maximize();
		
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		
		Actions act =  new Actions(driver);
		
		act.moveToElement(button);
		
		act.perform();
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='dropdown-content']/a"));
		
		for (WebElement link : links)
		{
			if (link.getAttribute("innerHTML").equalsIgnoreCase("Selenium"))
			{
				link.click();
				break;
			} else
			{
				System.out.println("Link for "+link.getAttribute("innerHTML")+" is present before TestNG.");
			}
		}
		
		String mainWindow = driver.getWindowHandle();
		
		
		Set<String> windows = driver.getWindowHandles();
		
		System.out.println("Total number of windows : "+windows.size());

		Thread.sleep(30000);
		for (String window : windows)
		{
			if (window.equals(mainWindow))
			{	
				driver.switchTo().window(window);
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//a[contains(text(), '2017')]")).click();
				//WebElement option = driver.findElement(By.xpath(".//*[@id='identityMenu']"));
				//act.moveToElement(driver.findElement(By.xpath(".//*[@id='identityMenu']"))).click().build().perform();
				//Select prof = new Select(driver.findElement(By.xpath(".//*[@id='identityMenu']")));
				//prof.selectByVisibleText("WordPress");
			}
			if (!(window.equals(mainWindow)))
			{
				driver.switchTo().window(window);
				System.out.println(driver.getTitle());
				WebElement mod = driver.findElement(By.xpath("//strong[contains(text(),'Module 1')]"));
				JavascriptExecutor je = (JavascriptExecutor)driver;
				je.executeScript("arguments[0].scrollIntoView(true);", mod);
				System.out.println(mod.getAttribute("innerHTML"));
			}
			
			
		}
		driver.quit();
		

	}

}

package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementNotClickableAt_XYPoint_Sol_Actions {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com/");
		
		WebElement checkBox = driver.findElement(By.id("persistent"));
		
		Actions act = new Actions(driver);
		act.moveToElement(checkBox).click().build().perform();

        driver.quit();
	}

}

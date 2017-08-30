package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ADV_Actions_DragDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();

		driver.quit();
		
	}

}

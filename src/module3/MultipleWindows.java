package module3;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindows {

	@Test
	public void mulWindows()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		String parent = driver.getWindowHandle();
		
		Set<String> windows = driver.getWindowHandles();
		
		System.out.println("Total number of children : "+(windows.size()-1));
		
		for(String child: windows)
		{
			if(!(child.equals(parent)))
			{
				driver.switchTo().window(child);
				System.out.println("Title of child is ; "+driver.getTitle());
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		System.out.println("Parent title is : "+driver.getTitle());
		
		driver.quit();
		
	}
	
	
	
}

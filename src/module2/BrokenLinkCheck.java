package module2;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkCheck {

	public static int i=0;
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links found : "+allLinks.size());
		
		for (WebElement link: allLinks)
		{
			String url = link.getAttribute("href");
			verifyLink(url);
		}

		driver.quit();
	}
	
	
	public static void verifyLink(String checkurl)
	{
		try {
			URL url = new URL(checkurl);
			HttpURLConnection httpUrlConnection = (HttpURLConnection)url.openConnection();
			
			httpUrlConnection.setConnectTimeout(5000);
			httpUrlConnection.connect();
			
			if (httpUrlConnection.getResponseCode()==HttpURLConnection.HTTP_OK) // 200
			{
				System.out.println(++i);
				System.out.println(checkurl+" -- "+httpUrlConnection.getResponseMessage());
			} else if (httpUrlConnection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) //404 
			{
				System.out.println(++i);
				System.out.println(checkurl+" -- "+httpUrlConnection.getResponseMessage());
			} else
			{
				System.out.println(++i);
				System.out.println(checkurl+" -- "+httpUrlConnection.getResponseCode());
				System.out.println(checkurl+" -- UNKNOWN -- "+httpUrlConnection.getResponseMessage());
			}
		} catch (Exception e) {
			System.out.println(checkurl);
			e.printStackTrace();
		}
		
	}

}

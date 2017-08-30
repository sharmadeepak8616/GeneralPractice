package yahooProject;

import org.openqa.selenium.WebDriver;
//import yahooBase.*;


public class HomePage extends yahooBase {

	public static void main(String[] args) {
		
		HomePage handle = new HomePage();
		//yahooBase yahoo = new yahooBase();
		handle.browserName = "chrome";
		
		WebDriver pageHandle = handle.homePage(handle);
		pageHandle.quit();
	}

	public WebDriver homePage(yahooBase yahooBaseObj)
	{

		WebDriver curser = yahooBaseObj.gotoPage(yahooBaseObj.initBrowser(), "home");
		
		return curser;
		
	}
	
}

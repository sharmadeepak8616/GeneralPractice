package yahooProject;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
//import yahooBase.*;

public class NavigatePages extends yahooBase {

	public static void main(String[] args) {

		NavigatePages NavPagesObj = new NavigatePages();
		//yahooBase yahoo = new yahooBase();
		NavPagesObj.browserName = "firefox";

		WebDriver pageHandle = NavPagesObj.NavPages(NavPagesObj);
		pageHandle.quit();

		
	}

	public WebDriver NavPages (yahooBase yahooBaseObj)
	{
		ArrayList<String> pageNames = new ArrayList<String> ();
		pageNames.add("news");
		pageNames.add("login");
		pageNames.add("home");
		pageNames.add("finance");
		pageNames.add("sports");
		
		WebDriver curser = yahooBaseObj.initBrowser();
		
		for (int i=0 ; i < pageNames.size(); i++)
		{
			yahooBaseObj.gotoPage(curser, pageNames.get(i));
		}
		
		return curser;
	}
	
	
	
}

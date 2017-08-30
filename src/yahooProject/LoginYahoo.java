package yahooProject;

import org.openqa.selenium.WebDriver;

public class LoginYahoo extends yahooBase {
	
	
	public static void main(String[] args) {
		
		LoginYahoo loginObj = new LoginYahoo();
		loginObj.browserName = "firefox";

		WebDriver curser = loginObj.loginTrue(loginObj);
        curser.quit();
	}
	
	public WebDriver loginTrue (yahooBase yahooBaseObj)
	{
		WebDriver curser = yahooBaseObj.gotoPage(yahooBaseObj.initBrowser(), "home");
		WebDriver curserAgain = yahooBaseObj.login(curser, "deepak_8616" , "chakshu4@yahoO");
		//yahooBaseObj.SignOut(curserAgain);
		return curserAgain;
	}

	public WebDriver loginFalse (yahooBase yahooBaseObj)
	{
		WebDriver curser = yahooBaseObj.gotoPage(yahooBaseObj.initBrowser(), "home");
		yahooBaseObj.login(curser, "deepak_8616" , "deepak");

		return curser;
	}
	

}

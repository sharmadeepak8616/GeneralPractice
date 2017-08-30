package FBDemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import BaseClass.Math;
import BaseClass.Pages;

public class FBRegistration {

	public static void main(String[] args) {
		
		Pages p = new Pages();

		p.browserName="chrome";
		
		//WebDriver d = p.newRegistration();
		//d.quit();
		
		p.newRegistration();
	}

}

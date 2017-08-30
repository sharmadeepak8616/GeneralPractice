package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class LogReport_WebDriverListener_Helper implements WebDriverEventListener {

	
	public void afterAlertAccept(WebDriver arg0) {
		System.out.println("afterAlertAccept -- "+arg0.toString());
	}

	public void afterAlertDismiss(WebDriver arg0) {
		System.out.println("afterAlertDismiss -- "+arg0.toString());
	}

	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		System.out.println("afterChangeValueOf -- "+arg0.toString());
		System.out.println("afterChangeValueOf -- "+arg1.toString());
		System.out.println("afterChangeValueOf -- "+arg2.toString());
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("beforeNavigateTo -- "+url.toString());
		System.out.println("beforeNavigateTo -- "+driver.toString());
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("afterNavigateTo -- "+url.toString());
		System.out.println("afterNavigateTo -- "+driver.toString());
	}

	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("beforeNavigateBack -- "+driver.toString());
	}

	public void afterNavigateBack(WebDriver driver) {
		System.out.println("afterNavigateBack -- "+driver.toString());
	}

	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("beforeNavigateForward -- "+driver.toString());
	}

	public void afterNavigateForward(WebDriver driver) {
		System.out.println("afterNavigateForward -- "+driver.toString());
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		System.out.println("beforeNavigateRefresh -- "+driver.toString());
	}

	public void afterNavigateRefresh(WebDriver driver) {
		System.out.println("afterNavigateRefresh -- "+driver.toString());
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("beforeFindBy -- "+by.toString());
		//System.out.println("beforeFindBy -- "+element.getText());
		System.out.println("beforeFindBy -- "+driver.toString());
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("afterFindBy -- "+by.toString());
		//System.out.println("afterFindBy -- "+element.toString());
		System.out.println("afterFindBy -- "+driver.toString());
	}

	public void afterClickOn(WebElement arg0, WebDriver driver) {
		System.out.println("afterClickOn -- "+arg0.toString());
		System.out.println("afterClickOn -- "+driver.toString());
	}

	public void beforeScript(String script, WebDriver driver) {
		System.out.println("beforeScript -- "+script.toString());
		System.out.println("beforeScript -- "+driver.toString());
	}

	public void afterScript(String script, WebDriver driver) {
		System.out.println("afterScript -- "+script.toString());
		System.out.println("afterScript -- "+driver.toString());
	}

	public void beforeAlertAccept(WebDriver arg0) {
		System.out.println("beforeAlertAccept -- "+arg0.toString());
	}

	public void beforeAlertDismiss(WebDriver arg0) {
		System.out.println("beforeAlertDismiss -- "+arg0.toString());
	}

	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		System.out.println("beforeChangeValueOf -- "+arg0.toString());
		System.out.println("beforeChangeValueOf -- "+arg1.toString());
		System.out.println("beforeChangeValueOf -- "+arg2.toString());
	}

	public void beforeClickOn(WebElement arg0, WebDriver driver) {
		System.out.println("beforeClickOn -- "+arg0.toString());
		System.out.println("beforeClickOn -- "+driver.toString());
	}

	public void onException(Throwable throwable, WebDriver driver) {
		System.out.println("onException -- "+throwable.toString());
		System.out.println("onException -- "+driver.toString());
	}

}

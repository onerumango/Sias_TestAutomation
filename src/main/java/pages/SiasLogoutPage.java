package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.SiasProjectSpecificMethods;

public class SiasLogoutPage extends SiasProjectSpecificMethods{

	public SiasLogoutPage clickLogoutSymbol() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasLogoutPage.LogoutSymbol.XPath")));
		wait(3000);
		return this;
	}
	public SiasLoginPageAuthorizer clickSignOut() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasLogoutPage.SignOut.XPath")));
		clickElement(locateElement("xpath", props.getProperty("SiasLogoutPage.OkButton.XPath")));
		wait(4000);
		return new SiasLoginPageAuthorizer();
	}
	
}

package pages;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.SiasProjectSpecificMethods;

public class SiasLoginPageMaker extends SiasProjectSpecificMethods{

	public SiasLoginPageMaker enterMakerUserId()  {
		enterValue(locateElement("xpath", props.getProperty("SiasLoginPageMaker.UserId.XPath")), props.getProperty("makerusername"));
		return this;
	}

	public SiasLoginPageMaker enterMakerPassword()  {
		enterValue(locateElement("xpath", props.getProperty("SiasLoginPageMaker.Password.XPath")), props.getProperty("makerpassword"));
		return this;
	}

	public SiasDashboardPage clickMakerSignInButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasLoginPageMaker.SignInButton.XPath")));
		webDriverWait("Dashboard | Sias2 App");
		return new SiasDashboardPage();
	}
}

package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.SiasProjectSpecificMethods;

public class SiasAuthorizationPage extends SiasProjectSpecificMethods {

	public SiasAuthorizationPage selectReportConfigScreenName() {		
		clickElement(locateElement("xpath", props.getProperty("SiasAuthorizationPage.ScreenName.XPath")));
		clickElement(locateElement("xpath", props.getProperty("SiasAuthorizationPage.ReportConfigScreenName.XPath")));
		return this;
	}

	public SiasAuthorizationPage selectReportMappingScreenName() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasAuthorizationPage.SelectReportMappingScreenName.XPath")));
		wait(2000);
		WebElement reportMapping = locateElement("xpath", props.getProperty("SiasAuthorizationPage.ReportMappingScreenName.XPath"));
		jsExecutor(reportMapping);
		clickElement(reportMapping);
		wait(7000);
		return this;
	}

	public SiasAuthorizationPage clickReportConfigAuthorizeButton() throws InterruptedException {

		WebElement reportIdAuth = locateElement("xpath", props.getProperty("SiasAuthorizationPage.ReportConfigAuthorizeButton.XPath"));
		jsExecutor(reportIdAuth);
		clickElement(reportIdAuth);
		wait(7000);
		return this;
	}

	public SiasAuthorizationPage clickReportMappingAuthorizeButton() throws InterruptedException {
		List<WebElement> reportIdAuth = driver .findElementsByXPath(props.getProperty(
		  "SiasAuthorizationPage.ReportMappingAuthorizeButton.XPath"));
		for (WebElement auth : reportIdAuth) {
			jsExecutor(auth);
			auth.click();
			wait(7000);
		}
		return this;
	}

	public SiasAuthorizationPage clickRejectButton() throws InterruptedException {

		WebElement reportIdRej = locateElement("xpath", props.getProperty("SiasAuthorizationPage.RejectButton.XPath"));
		jsExecutor(reportIdRej);
		clickElement(reportIdRej);
		System.out.println("Rejection is done successfully");
		return this;
	}
	
	public SiasAuthorizationPage selectSecurityPolicyScreenName() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasAuthorizationPage.ScreenName.XPath")));
		wait(2000);
		WebElement securityPolicy = locateElement("xpath", props.getProperty("SiasAuthorizationPage.SecurityPolicyScreenName.XPath"));
		jsExecutor(securityPolicy);
		clickElement(securityPolicy);
		wait(7000);
		return this;
	}
	public SiasAuthorizationPage securityPolicyAuthorizeButton() {
		clickElement(locateElement("xpath", props.getProperty("SiasAuthorizationPage.SecurityPolicyAuthorizeButton.XPath")));
		wait(8000);
		return this;
	}
	
	public SiasAuthorizationPage selectExternalSystemConfigScreenName() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasAuthorizationPage.ScreenName.XPath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("SiasAuthorizationPage.ExternalSystemConfigScreenName.XPath")));
		wait(3000);
		return this;
	}
	
	public SiasAuthorizationPage clickExternalSystemAuthorizeButton() throws InterruptedException {

		WebElement reportIdAuth = locateElement("xpath", props.getProperty("SiasAuthorizationPage.ExternalSystemAuthorizeButton.XPath"));
		jsExecutor(reportIdAuth);
		clickElement(reportIdAuth);
		wait(7000);
		return this;
	}
}

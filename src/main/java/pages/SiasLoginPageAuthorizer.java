package pages;

import java.util.concurrent.TimeUnit;

import base.SiasProjectSpecificMethods;

public class SiasLoginPageAuthorizer extends SiasProjectSpecificMethods{

	public SiasLoginPageAuthorizer enterAuthorUserId() throws InterruptedException  {
		enterValue(locateElement("xpath", props.getProperty("SiasLoginPageAuthorizer.AuthorUserId.XPath")), props.getProperty("authorusername"));
		return this;
	}

	public SiasLoginPageAuthorizer enterAuthorPassword() {
		enterValue(locateElement("xpath", props.getProperty("SiasLoginPageAuthorizer.AuthorPassword.XPath")), props.getProperty("authorpassword"));
		return this;
	}

	public SiasDashboardPage clickAuthorSignInButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasLoginPageAuthorizer.AuthorSignInButton.XPath")));
		return new SiasDashboardPage();
	}
}

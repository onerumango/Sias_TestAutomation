package pages;

import base.SiasProjectSpecificMethods;

public class SiasReviewer1LoginPage extends SiasProjectSpecificMethods{

	public SiasReviewer1LoginPage enterReviewer1UserId() throws InterruptedException  {
		
		wait(7000);
		enterValue(locateElement("xpath", props.getProperty("SiasReviewer1LoginPage.Reviewer1UserId.XPath")), props.getProperty("reviewer1username"));
		return this;
	}

	public SiasReviewer1LoginPage enterReviewer1Password()  {
		enterValue(locateElement("xpath", props.getProperty("SiasReviewer1LoginPage.Reviewer1Password.XPath")), props.getProperty("reviewer1password"));
		return this;
	}
	
	public SiasDashboardPage clickReviewer1SignInButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasReviewer1LoginPage.Reviewer1SignInButton.XPath")));
		return new SiasDashboardPage();
	}
}

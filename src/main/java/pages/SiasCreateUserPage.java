package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.SiasProjectSpecificMethods;

public class SiasCreateUserPage extends SiasProjectSpecificMethods{

	public SiasCreateUserPage enterUserId() {
		enterValue(locateElement("xpath", props.getProperty("SiasCreateUserPage.UserId.XPath")), props.getProperty("SiasCreateUserPage.UserId"));
		return this;
	}
	
	public SiasCreateUserPage enterUsername() {
		enterValue(locateElement("xpath", props.getProperty("SiasCreateUserPage.Username.XPath")), props.getProperty("SiasCreateUserPage.Username"));
		return this;
	}
	
	public SiasCreateUserPage selectroleId() {
		wait(4000);
		clickElement(locateElement("xpath", props.getProperty("SiasCreateUserPage.roleIdDropDown.XPath")));
		wait(4000);
		clickElement(locateElement("xpath", props.getProperty("SiasCreateUserPage.roleId.XPath")));
		return this;
	}
	
	public SiasCreateUserPage enterEmailId() {
		wait(4000);
		enterValue(locateElement("xpath", props.getProperty("SiasCreateUserPage.EmailId.XPath")), props.getProperty("SiasCreateUserPage.EmailId"));
		return this;
	}
	
	public SiasCreateUserPage selectBranch() {
		wait(4000);
		clickElement(locateElement("xpath", props.getProperty("SiasCreateUserPage.BranchDropDown.XPath")));
		clickElement(locateElement("xpath", props.getProperty("SiasCreateUserPage.Branch.XPath")));
		return this;
	}
	
	public SiasCreateUserPage selectCountry() {
		clickElement(locateElement("xpath", props.getProperty("SiasCreateUserPage.CountryDropDown.XPath")));
		clickElement(locateElement("xpath", props.getProperty("SiasCreateUserPage.Country.XPath")));
		return this;
	}
	
	public SiasCreateUserPage enterMobileNo() {
		wait(4000);
		enterValue(locateElement("id", props.getProperty("SiasCreateUserPage.MobileNo.Id")), props.getProperty("SiasCreateUserPage.MobileNo"));
		return this;
		
	}
	
	public SiasDashboardPage clickSubmitButton() throws InterruptedException {

		WebElement submitButton = locateElement("xpath", props.getProperty("SiasCreateUserPage.SubmitButton.XPath"));
		jsExecutor(submitButton);
		clickElement(submitButton);
		wait(10000);
		return new SiasDashboardPage();
	}
}

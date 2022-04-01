package pages;

import base.SiasProjectSpecificMethods;

public class SiasDeleteUserCreationPage extends SiasProjectSpecificMethods{

	public SiasDeleteUserCreationPage enterDeleteUserId() {
		enterValue(locateElement("xpath", props.getProperty("SiasDeleteUserCreationPage.DeleteUserId.XPath")), props.getProperty("SiasDeleteUserCreationPage.UserId"));
		return this;
	}
	
	public SiasDeleteUserCreationPage enterDeleteUsername() {
		enterValue(locateElement("xpath", props.getProperty("SiasDeleteUserCreationPage.DeleteUsername.XPath")), props.getProperty("SiasDeleteUserCreationPage.Username"));
		return this;
	}
	
	public SiasDeleteUserCreationPage selectDeleteroleId() {
		wait(4000);
		clickElement(locateElement("xpath", props.getProperty("SiasDeleteUserCreationPage.DeleteroleIdDropDown.XPath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("SiasDeleteUserCreationPage.DeleteroleId.XPath")));
		return this;
	}
	
	public SiasDeleteUserCreationPage enterDeleteEmailId() {
		wait(4000);
		enterValue(locateElement("xpath", props.getProperty("SiasDeleteUserCreationPage.DeleteEmailId.XPath")), props.getProperty("SiasDeleteUserCreationPage.EmailId"));
		return this;
	}
	
	public SiasDeleteUserCreationPage selectDeleteBranch() {
		wait(4000);
		clickElement(locateElement("xpath", props.getProperty("SiasDeleteUserCreationPage.DeleteBranchDropDown.XPath")));
		clickElement(locateElement("xpath", props.getProperty("SiasDeleteUserCreationPage.DeleteBranch.XPath")));
		return this;
	}
	
	public SiasDeleteUserCreationPage selectDeleteCountry() {
		wait(4000);
		clickElement(locateElement("xpath", props.getProperty("SiasDeleteUserCreationPage.DeleteCountryDropDown.XPath")));
		clickElement(locateElement("xpath", props.getProperty("SiasDeleteUserCreationPage.DeleteCountry.XPath")));
		return this;
	}
	
	public SiasDeleteUserCreationPage enterDeleteMobileNo() {
		wait(4000);
		enterValue(locateElement("xpath", props.getProperty("SiasDeleteUserCreationPage.DeleteMobileNo.Id")), props.getProperty("SiasDeleteUserCreationPage.MobileNo"));
		return this;
		
	}
	
	public SiasDeleteUserCreationPage clickDeleteSubmitButton() throws InterruptedException {
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("SiasDeleteUserCreationPage.DeleteSubmitButton.XPath")));
		wait(10000);
		return this;
	}
}

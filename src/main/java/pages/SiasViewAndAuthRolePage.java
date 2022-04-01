package pages;

import base.SiasProjectSpecificMethods;

public class SiasViewAndAuthRolePage extends SiasProjectSpecificMethods{

	public SiasViewAndAuthRolePage enterRoleId() throws InterruptedException {
		enterValue(locateElement("xpath", props.getProperty("SiasViewAndAuthRolePage.EnterRoleId.XPath")), "TABROLEID");
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("SiasViewAndAuthRolePage.RoleId.XPath")));
		return this;
	}
	public SiasViewAndAuthRolePage clickSearchButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasViewAndAuthRolePage.SearchButton.XPath")));
		wait(2000);
		return this;
	}
	
	public SiasViewAndAuthRolePage selectAppType() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasViewAndAuthRolePage.SelectAppType.XPath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("SiasViewAndAuthRolePage.AppType.XPath")));
		wait(3000);
		return this;
	}
	
	public SiasModifyRoleDetailsPage clickModifyRoleButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasViewAndAuthRolePage.ModifyRoleButton.XPath")));
		wait(7000);
		return new SiasModifyRoleDetailsPage();
	}
	
	public SiasViewAndAuthRolePage clickAuthRoleButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasViewAndAuthRolePage.AuthRoleButton.XPath")));
		wait(7000);
		return this;
	}
		
	}
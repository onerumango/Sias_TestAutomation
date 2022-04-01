package pages;

import base.SiasProjectSpecificMethods;

public class SiasModifyRolePage extends SiasProjectSpecificMethods {
	
	
	public SiasModifyRolePage enterRoleId() throws InterruptedException {
		enterValue(locateElement("xpath", props.getProperty("SiasModifyRolePage.EnterRoleId.XPath")), props.getProperty("SiasModifyRolePage.RoleID"));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("SiasModifyRolePage.RoleId.XPath")));
		return this;

}
	public SiasModifyRolePage clickSearchButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasModifyRolePage.SearchButton.XPath")));
		wait(2000);
		return this;
}

}

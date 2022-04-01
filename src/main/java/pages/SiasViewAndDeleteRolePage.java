package pages;

import base.SiasProjectSpecificMethods;

public class SiasViewAndDeleteRolePage extends SiasProjectSpecificMethods{
	
	public SiasViewAndDeleteRolePage enterDeleteRoleId() throws InterruptedException {
		enterValue(locateElement("xpath", props.getProperty("SiasViewAndDeleteRolePage.EnterDeleteRoleId.XPath")), "VABROLEID");
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("SiasViewAndDeleteRolePage.DeleteRoleId.XPath")));
		return this;
	}
	
	public SiasViewAndDeleteRolePage selectDeleteRoleAppType() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasViewAndDeleteRolePage.SelectDeleteRoleAppType.XPath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("SiasViewAndDeleteRolePage.DeleteRoleAppType.XPath")));
		wait(3000);
		return this;
	}
	public SiasViewAndDeleteRolePage clickDeleteSearchButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasViewAndDeleteRolePage.DeleteSearchButton.XPath")));
		wait(2000);
		return this;
	}
	
	public SiasViewAndDeleteRolePage clickDeleteRoleIcon() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasViewAndDeleteRolePage.DeleteRoleIcon.XPath")));
		wait(7000);
		return this;
	}
	
		public SiasViewAndDeleteRolePage clickDeleteRoleButton() throws InterruptedException {
			clickElement(locateElement("xpath", props.getProperty("SiasViewAndDeleteRolePage.DeleteRoleButton.XPath")));
			wait(7000);
			return this;
		}
}

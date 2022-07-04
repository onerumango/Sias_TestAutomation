package pages;

import java.util.concurrent.TimeUnit;

import base.SiasProjectSpecificMethods;

public class SiasDepartmentmanagementcreatemodifyauthpage extends SiasProjectSpecificMethods{

	public SiasDepartmentmanagementcreatemodifyauthpage entercode() {
		enterValue(locateElement("xpath", props.getProperty("SiasDepartmentPage.entercode.XPath")), "A.B.C");
		wait(3000);
		return this;
	}
	
	public SiasDepartmentmanagementcreatemodifyauthpage entername() {
		enterValue(locateElement("xpath", props.getProperty("SiasDepartmentPage.entername.XPath")), "Information and Technology");
		wait(3000);
		return this;
	}
	
	public  SiasDepartmentmanagementcreatemodifyauthpage clicksave() {
		clickElement(locateElement("xpath", props.getProperty("SiasDepartmentmanagement.clicksave.XPath")));
		wait(3000);
		return this;
	}
	
	public  SiasDepartmentmanagementcreatemodifyauthpage clickviewpage() {
	clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.viewDepartmentManagementLink.XPath")));
	webDriverWait("Admin > View Department | Sias2 App");
	wait(3000);
	return this;
}
	public SiasDepartmentmanagementcreatemodifyauthpage  enterFilterKey() throws InterruptedException {
		enterValue(locateElement("xpath", props.getProperty("SiasDepartmentAuthPage.FilterKey.XPath")), props.getProperty("SiasDepartmentAuthPage.FilterKey"));
				wait(4000);
				return this;

			}
public SiasDepartmentmanagementcreatemodifyauthpage clickedit() {
		clickElement(locateElement("xpath", props.getProperty("SiasDepartmentmanagementcreatemodifyauthpage.clickedit.XPath")));
		wait(3000);
		return this;
	}

public SiasDepartmentmanagementcreatemodifyauthpage entermodifycode() {
		enterValue(locateElement("xpath", props.getProperty("SiasDepartmentmanagementcreatemodifyauthpage.entermodifycode.XPath")), "E.F.G");
		wait(3000);
		return this;
	}

public SiasDepartmentmanagementcreatemodifyauthpage clickupdate() {
		clickElement(locateElement("xpath", props.getProperty("SiasDepartmentmanagementcreatemodifyauthpage.clickupdate.XPath")));
		wait(3000);
		return this;
	}

public SiasDepartmentmanagementcreatemodifyauthpage clickcancel() {
	clickElement(locateElement("xpath", props.getProperty("SiasDepartmentmanagementcreatemodifyauthpage.clickcancel.XPath")));
	wait(3000);
	return this;
}

}

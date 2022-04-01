package pages;

import base.SiasProjectSpecificMethods;

public class SiasCreateMaintenancePage extends SiasProjectSpecificMethods {
	
	public SiasCreateMaintenancePage enterExternal() {
		enterValue(locateElement("xpath", props.getProperty("SiasCreateMaintenancePage.External.XPath")), props.getProperty("SiasCreateMaintenancePage.External"));
		return this;
	}
	
	public SiasCreateMaintenancePage enterDescription() {
		enterValue(locateElement("xpath", props.getProperty("SiasCreateMaintenancePage.Description.XPath")), props.getProperty("SiasCreateMaintenancePage.Description"));
		return this;
	}
	
	public SiasCreateMaintenancePage enterInstance() {
		enterValue(locateElement("xpath", props.getProperty("SiasCreateMaintenancePage.Instance.XPath")), props.getProperty("SiasCreateMaintenancePage.Instance"));
		return this;
}

	public SiasCreateMaintenancePage selectDatabase() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasCreateMaintenancePage.DatabaseDropdown.XPath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("SiasCreateMaintenancePage.Database.XPath")));
		return this;
	}
	
	public SiasCreateMaintenancePage enterPort() {
		enterValue(locateElement("xpath", props.getProperty("SiasCreateMaintenancePage.Port.XPath")), props.getProperty("SiasCreateMaintenancePage.Port"));
		return this;
}
	
	public SiasCreateMaintenancePage enterUserID() {
		enterValue(locateElement("xpath", props.getProperty("SiasCreateMaintenancePage.UserID.XPath")), props.getProperty("SiasCreateMaintenancePage.UserId"));
		return this;
	}
	
	public SiasCreateMaintenancePage enterPasswordID() {
		enterValue(locateElement("xpath", props.getProperty("SiasCreateMaintenancePage.PasswordID.XPath")), props.getProperty("SiasCreateMaintenancePage.Password"));
		return this;
	}
	
	public SiasCreateMaintenancePage clickExtSysMaintSubmitButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasCreateMaintenancePage.ExtSysMaintSubmitButton.XPath")));
		wait(8000);
		return this;
	}
	
	public SiasCreateMaintenancePage clickResetButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasCreateMaintenancePage.ResetButton.XPath")));
		wait(8000);
		return this;
}
	
	public SiasCreateMaintenancePage enterExternalquery() throws InterruptedException {
		enterValue(locateElement("xpath", props.getProperty("SiasCreateMaintenancePage.Externalquery.XPath")), props.getProperty("SiasCreateMaintenancePage.External"));
		wait(2000);
		return this;
	}
	
	public SiasCreateMaintenancePage clickQueryButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasCreateMaintenancePage.QueryButton.XPath")));
		wait(7000);
		return this;
}
}
package pages;

import base.SiasProjectSpecificMethods;

public class SiasUpdateManualMaintenanceReportPage extends SiasProjectSpecificMethods{

	public SiasUpdateManualMaintenanceReportPage clickEditButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasUpdateManualMaintenanceReportPage.EditButton.XPath")));
		wait(3000);
		return this;

	}
	
	public SiasUpdateManualMaintenanceReportPage clickUpdateButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasUpdateManualMaintenanceReportPage.UpdateButton.XPath")));
		wait(7000);
		return this;

	}
	
	public SiasUpdateManualMaintenanceReportPage clickAuthButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasUpdateManualMaintenanceReportPage.AuthButton.XPath")));
		wait(10000);
		return this;

	}
	
}

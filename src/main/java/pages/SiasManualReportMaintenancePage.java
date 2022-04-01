package pages;

import base.SiasProjectSpecificMethods;

public class SiasManualReportMaintenancePage extends SiasProjectSpecificMethods{

	public SiasNewManualReportMaintenancePage clickNewButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasManualReportMaintenancePage.NewButton.XPath")));
		wait(3000);
		return new SiasNewManualReportMaintenancePage();

	}
	
	public SiasManualReportMaintenancePage enterFilterKey() throws InterruptedException {
		enterValue(locateElement("xpath", props.getProperty("SiasManualReportMaintenancePage.FilterKey.XPath")), props.getProperty("SiasManualReportMaintenancePage.FilterKey"));
		wait(4000);
		return this;

	}
	
	public SiasUpdateManualMaintenanceReportPage clickReportCodeLink() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasManualReportMaintenancePage.ReportCodeLink.XPath")));
		wait(2000);
		return new SiasUpdateManualMaintenanceReportPage();

	}

}

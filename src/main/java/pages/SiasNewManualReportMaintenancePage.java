package pages;

import base.SiasProjectSpecificMethods;

public class SiasNewManualReportMaintenancePage extends SiasProjectSpecificMethods {

	public SiasNewManualReportMaintenancePage selectReportCode() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasNewManualReportMaintenancePage.SelectReportCode.XPath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("SiasNewManualReportMaintenancePage.ReportCode.XPath")));
		wait(2000);
		return this;

	}
	
	public SiasNewManualReportMaintenancePage clickSubmitButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasNewManualReportMaintenancePage.SubmitButton.XPath")));
		wait(7000);
		return this;

	}
	
	public SiasManualReportMaintenancePage clickExitButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasNewManualReportMaintenancePage.ExitButton.XPath")));
		wait(3000);
		return new SiasManualReportMaintenancePage();

	}

}

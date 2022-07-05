package pages;

import base.SiasProjectSpecificMethods;

public class SiasNewManualReportMaintenancePage extends SiasProjectSpecificMethods {

	public SiasNewManualReportMaintenancePage selectReportCode() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasNewManualReportMaintenancePage.SelectReportCode.XPath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("SiasManualReportMaintenancePage.ReportCodeLink.XPath")));
		wait(4000);
		return this;

	}
	
	public SiasNewManualReportMaintenancePage clickSubmitButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasNewManualReportMaintenancePage.SubmitButton.XPath")));
		wait(9000);
		return this;

	}
	
	public SiasManualReportMaintenancePage clickExitButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasNewManualReportMaintenancePage.ExitButton.XPath")));
		wait(3000);
		return new SiasManualReportMaintenancePage();

	}

}

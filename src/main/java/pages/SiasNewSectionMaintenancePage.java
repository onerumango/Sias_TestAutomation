package pages;

import base.SiasProjectSpecificMethods;

public class SiasNewSectionMaintenancePage extends SiasProjectSpecificMethods{

	public SiasNewSectionMaintenancePage selectReportCodeAndName() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasNewSectionMaintenancePage.SelectReportCodeAndName.XPath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("SiasNewSectionMaintenancePage.ReportCodeAndName.XPath")));
		return this;
	}
	
	public SiasNewSectionMaintenancePage enterSection() {
		enterValue(locateElement("xpath", props.getProperty("SiasNewSectionMaintenancePage.Section.XPath")), props.getProperty("SiasNewSectionMaintenancePage.Section"));
		return this;
	}
	
	public SiasNewSectionMaintenancePage enterUploadLimit() {
		enterValue(locateElement("xpath", props.getProperty("SiasNewSectionMaintenancePage.UploadLimit.XPath")), props.getProperty("SiasNewSectionMaintenancePage.UploadLimit"));
		return this;
	}
	
	public SiasNewSectionMaintenancePage clickSectionSaveButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasNewSectionMaintenancePage.SectionSaveButton.XPath")));
		wait(7000);
		return this;
	}
	
}

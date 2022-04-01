package pages;

import base.SiasProjectSpecificMethods;

public class SiasSectionMaintenancePage extends SiasProjectSpecificMethods{

	public SiasNewSectionMaintenancePage clickSectionNewButton() {
		clickElement(locateElement("xpath", props.getProperty("SiasNewSectionMaintenancePage.SectionNewButton.XPath")));
		return new SiasNewSectionMaintenancePage();
	}
	
	public SiasSectionMaintenancePage enterSectionFilterCode() throws InterruptedException {
		enterValue(locateElement("xpath", props.getProperty("SiasNewSectionMaintenancePage.SectionFilterCode.XPath")), "ACCOUNTASSET60");
		wait(3000);
		return this;
	}
	
	public SiasUpdateSectionMaintenancePage clickReportNameLink() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasNewSectionMaintenancePage.ReportNameLink.XPath")));
		wait(2000);
		return new SiasUpdateSectionMaintenancePage();
	}
}

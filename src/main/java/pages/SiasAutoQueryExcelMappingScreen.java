package pages;

import base.SiasProjectSpecificMethods;

public class SiasAutoQueryExcelMappingScreen extends SiasProjectSpecificMethods {

	public SiasAutoQueryExcelMappingScreen selectAutoQueryExcelMappingReportName() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasAutoQueryExcelMappingScreen.ReportName.XPath")));
		wait(4000);
		clickElement(locateElement("xpath", props.getProperty("SiasAutoQueryExcelMappingScreen.AutoQueryExcelMappingReportName.XPath")));
		return this;
	}
	
	public SiasAutoQueryExcelMappingScreen selectAutoQueryExcelMappingSection() throws InterruptedException {

		clickElement(locateElement("xpath", props.getProperty("SiasAutoQueryExcelMappingScreen.ProcessCode.XPath")));
		wait(4000);
		clickElement(locateElement("xpath", props.getProperty("SiasAutoQueryExcelMappingScreen.AutoQueryExcelMappingSection.XPath")));
		wait(2000);
		return this;
	}
	
	public SiasAutoQueryExcelMappingScreen clickAutoQueryFetchButton() throws InterruptedException {

		clickElement(locateElement("xpath", props.getProperty("SiasAutoQueryExcelMappingScreen.AutoQueryFetchButton.XPath")));
		wait(3000);
		return this;
	}
	
	public SiasAutoQueryExcelMappingScreen clickAutoQueryAuthButton() throws InterruptedException {

		clickElement(locateElement("xpath", props.getProperty("SiasAutoQueryExcelMappingScreen.AutoQueryAuthButton.XPath")));
		wait(7000);
		return this;
	}
	
}

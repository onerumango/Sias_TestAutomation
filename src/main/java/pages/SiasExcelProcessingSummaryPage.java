package pages;

import base.SiasProjectSpecificMethods;

public class SiasExcelProcessingSummaryPage extends SiasProjectSpecificMethods{

	public SiasExcelProcessingSummaryPage selectExcelProcessingReportName() throws InterruptedException {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("SiasExcelProcessingSummaryPage.SelectExcelProcessingReportName.XPath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("SiasExcelProcessingSummaryPage.ExcelProcessingReportName.XPath")));
		return this;
	}
	
	public SiasExcelProcessingSummaryPage selectExcelProcessingSection() throws InterruptedException {

		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("SiasExcelProcessingSummaryPage.SelectExcelProcessingSection.XPath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("SiasExcelProcessingSummaryPage.ExcelProcessingSection.XPath")));
		return this;

	}
	
	public SiasExcelProcessingSummaryPage enterExcelProcessingExecutionDate() throws InterruptedException {
		enterValue(locateElement("xpath", props.getProperty("SiasExcelProcessingSummaryPage.ExcelProcessingExecutionDate.XPath")), props.getProperty("SiasExcelProcessingSummaryPage.ExecutionDate"));
		return this;

	}
	
	public SiasExcelProcessingSummaryPage clickExcelProcessingQueryButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasExcelProcessingSummaryPage.ExcelProcessingQueryButton.XPath")));
		wait(5000);
		return this;

	}
}

package pages;

import base.SiasProjectSpecificMethods;

public class SiasQueueStatusPage extends SiasProjectSpecificMethods{

	public SiasQueueStatusPage selectQueueStatusReportName() throws InterruptedException  {
		clickElement(locateElement("xpath", props.getProperty("SiasQueueStatusPage.SelectQueueStatusReportName.XPath")));
		clickElement(locateElement("xpath", props.getProperty("SiasQueueStatusPage.QueueStatusReportName.XPath")));
		wait(2000);
		return this;
	}
	
	public SiasQueueStatusPage selectQueueStatusReportDate() throws InterruptedException  {
		enterValue(locateElement("xpath", props.getProperty("SiasQueueStatusPage.QueueStatusReportDate.XPath")), props.getProperty("SiasQueueStatusPage.ReportDate"));
		wait(2000);
		return this;
	}
	
	public SiasQueueStatusPage clickQueueStatusSubmitButton() throws InterruptedException  {
		clickElement(locateElement("xpath", props.getProperty("SiasQueueStatusPage.QueueStatusSubmitButton.XPath")));
		wait(15000);
		return this;
	}
}

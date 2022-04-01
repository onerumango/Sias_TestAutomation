package pages;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeOptions;

import base.SiasProjectSpecificMethods;

public class SiasReportPage extends SiasProjectSpecificMethods{

	public SiasReportPage selectBusinessDate() {
		enterValue(locateElement("xpath", props.getProperty("SiasReportPage.BusinessDate.XPath")), "10/31/2019");
		return this;
		}
	
	public SiasReportPage clickQueryButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasReportPage.QueryButton.XPath")));
		wait(2000);
		return this;
		}
	
	public SiasReportPage clickSaveButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasReportPage.SaveButton.XPath")));
		wait(2000);
		return this;
		}
	
	public SiasReportPage clickGenerateButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasReportPage.GenerateButton.XPath")));
		wait(7000);
		return this;
		}
	
	public SiasSendingForApprovalPage clickSendForApprovalButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasReportPage.SendForApprovalButton.XPath")));
		wait(4000);
		return new SiasSendingForApprovalPage();
		}
}

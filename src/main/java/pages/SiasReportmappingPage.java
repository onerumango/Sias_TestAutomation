package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.SiasProjectSpecificMethods;

public class SiasReportmappingPage extends SiasProjectSpecificMethods{

	public SiasReportmappingPage selectReports() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasReportmappingPage.SelectReports.XPath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("SiasReportmappingPage.Reports.XPath")));
		return this;
	}
		public SiasReportmappingPage clickModifyButton() throws InterruptedException{
			WebElement modify = locateElement("xpath", props.getProperty("SiasReportmappingPage.ModifyButton.XPath"));
			jsExecutor(modify);
			clickElement(modify);
			wait(7000);
			return this;
			
		}
		public SiasReportmappingPage selectRoleId() {
			clickElement(locateElement("xpath", props.getProperty("SiasReportmappingPage.SelectRoleId.XPath")));
			clickElement(locateElement("xpath", props.getProperty("SiasReportmappingPage.RoleId.XPath")));
			return this;
		}
		public SiasReportmappingPage selectEdit() {
			clickElement(locateElement("xpath", props.getProperty("SiasReportmappingPage.SelectEdit.XPath")));
			clickElement(locateElement("xpath", props.getProperty("SiasReportmappingPage.Edit.XPath")));
			return this;	
		}
		public SiasReportmappingPage clickSaveButton() {
			clickElement(locateElement("xpath", props.getProperty("SiasReportmappingPage.SaveButton.XPath")));
			wait(7000);
			return this;
		}
}

package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import base.SiasProjectSpecificMethods;

public class SiasReviewerPage extends SiasProjectSpecificMethods{

	public SiasReviewerPage selectQueueDetailsStatus() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasReviewerPage.SelectQueueDetailsStatus.XPath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("SiasReviewerPage.QueueDetailsStatus.XPath")));
		return this;
	}
	public SiasReviewerPage clickFetchButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasReviewerPage.FetchButton.XPath")));
		wait(2000);
		return this;
	}
	
	public SiasReviewerPage clickDownloadButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasReviewerPage.DownloadButton.XPath")));
		wait(7000);
		return this;
	}
	
	public SiasReviewerPage clickEditButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasReviewerPage.EditButton.XPath")));
		wait(7000);
		return this;
	}
	
	public SiasReviewerAuthorizationPage clickReportButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasReviewerPage.ReportButton.XPath")));
		wait(2000);
		return new SiasReviewerAuthorizationPage();
	}
}

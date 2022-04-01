package pages;

import base.SiasProjectSpecificMethods;

public class SiasExternalSystemRefreshPage extends SiasProjectSpecificMethods{

	public SiasExternalSystemRefreshPage selectExternalSystemExecutionDate() throws InterruptedException  {
		enterValue(locateElement("xpath", props.getProperty("SiasExternalSystemRefreshPage.ExternalSystemExecutionDate.XPath")), props.getProperty("SiasExternalSystemRefreshPage.ExecutionDate"));
		wait(5000);
		return this;
	}
	
	public SiasExternalSystemRefreshPage clickExternalSystemFetchButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasExternalSystemRefreshPage.ExternalSystemFetchButton.XPath")));
		wait(7000);
		return this;
	}
}

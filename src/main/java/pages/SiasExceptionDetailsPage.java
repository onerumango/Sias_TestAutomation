package pages;

import base.SiasProjectSpecificMethods;

public class SiasExceptionDetailsPage extends SiasProjectSpecificMethods{
	
	public SiasExceptionDetailsPage selectprocess() {
		clickElement(locateElement("xpath", props.getProperty("SiasExceptionDetailsPage.SelectProcess.XPath")));
		clickElement(locateElement("xpath", props.getProperty("SiasExceptionDetailsPage.Process.XPath")));
		return this;
	}
	
	public SiasExceptionDetailsPage selectDate() {
		enterValue(locateElement("xpath", props.getProperty("SiasExceptionDetailsPage.Date.XPath")), props.getProperty("SiasExceptionDetailsPage.Date"));
	return this;
	
	}
	
	public SiasExceptionDetailsPage clickExceptionDetailsSubmitButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasExceptionDetailsPage.ExceptionDetailsSubmitButton.XPath")));
		wait(7000);
		return this;
	}
}



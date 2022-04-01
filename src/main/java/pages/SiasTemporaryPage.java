package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import base.SiasProjectSpecificMethods;

public class SiasTemporaryPage extends SiasProjectSpecificMethods{

	public SiasTemporaryPage enterExecutionDate() {
		enterValue(locateElement("xpath", props.getProperty("SiasTemporaryPage.ExecutionDate.XPath")), "6/18/2021");
		return this;
	}
	public SiasTemporaryPage selectTempBranch() {
		clickElement(locateElement("xpath", props.getProperty("SiasTemporaryPage.SelectTempBranch.XPath")));
		clickElement(locateElement("xpath", props.getProperty("SiasTemporaryPage.TempBranch.XPath")));
		return this;
	}
	public SiasTemporaryPage clickTempSubmitButton() {
		clickElement(locateElement("xpath", props.getProperty("SiasTemporaryPage.TempSubmitButton.XPath")));
		wait(8000);
		return this;
	}
}

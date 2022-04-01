package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.SiasProjectSpecificMethods;

public class SiasCommParameterPage extends SiasProjectSpecificMethods{

	public SiasCommParameterPage clickEditButton() throws InterruptedException {
		WebElement edit= locateElement("xpath", props.getProperty("SiasCommParameterPage.EditButton.XPath"));
		jsExecutor(edit);
		clickElement(edit);
		wait(4000);
		return this;
	}
	public SiasCommParameterPage clickCancelButton() {
		clickElement(locateElement("xpath", props.getProperty("SiasCommParameterPage.CancelButton.XPath")));
		return this;
	}
}

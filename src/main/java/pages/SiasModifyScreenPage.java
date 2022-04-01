package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.SiasProjectSpecificMethods;

public class SiasModifyScreenPage  extends SiasProjectSpecificMethods {

	public SiasModifyScreenPage enterModifyUsername() throws InterruptedException {
		wait(3000);
		WebElement username = locateElement("xpath", props.getProperty("SiasModifyScreenPage.ModifyUsername.XPath"));
		clearElement(username);
		enterValue(username, props.getProperty("SiasModifyScreenPage.Username"));
		return this;
}
	
	public SiasModifyScreenPage selectModifyBranch() throws InterruptedException {

		clickElement(locateElement("xpath", props.getProperty("SiasModifyScreenPage.SelectModifyBranch.XPath")));
		clickElement(locateElement("xpath", props.getProperty("SiasModifyScreenPage.ModifyBranch.XPath")));
		wait(3000);
		return this;
	}
	
	public SiasModifyScreenPage clickSubmitButton() throws InterruptedException {
		WebElement submitButton = locateElement("xpath", props.getProperty("SiasModifyScreenPage.SubmitButton.XPath"));
		jsExecutor(submitButton);
		clickElement(submitButton);
		wait(10000);
		return this;
	}
	
	public SiasModifyScreenPage clickDeleteButton() {
		clickElement(locateElement("xpath", props.getProperty("SiasModifyScreenPage.DeleteButton.XPath")));
		return this;
		
	}
}
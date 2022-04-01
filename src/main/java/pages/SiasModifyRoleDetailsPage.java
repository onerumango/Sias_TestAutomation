package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.SiasProjectSpecificMethods;

public class SiasModifyRoleDetailsPage extends SiasProjectSpecificMethods {
	
	public SiasModifyRoleDetailsPage SiasEditAccessRole() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasModifyRoleDetailsPage.EditAccessRole.XPath")));
		wait(7000);
    	return this;
	
		
	}
    public SiasModifyRoleDetailsPage SiasEditRoleClickSubmit() throws InterruptedException {
	WebElement submitButton = locateElement("xpath", props.getProperty("SiasModifyRoleDetailsPage.EditRoleClickSubmit.XPath"));
	jsExecutor(submitButton);
	clickElement(submitButton);
	wait(7000);
	return this;
		
	}
}

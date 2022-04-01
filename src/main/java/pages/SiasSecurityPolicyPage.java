package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.SiasProjectSpecificMethods;

public class SiasSecurityPolicyPage extends SiasProjectSpecificMethods{

	public SiasSecurityPolicyPage clickSPEdit() throws InterruptedException {
    	WebElement edit= locateElement("xpath", props.getProperty("SiasSecurityPolicyPage.SPEdit.XPath"));
		jsExecutor(edit);
		clickElement(edit);
		wait(2000);
		return this;
	}
    public SiasSecurityPolicyPage modifyPasswordReuse() throws InterruptedException {
		  WebElement resusePassword = locateElement("name",
		  props.getProperty("SiasSecurityPolicyPage.PasswordReuse.Name"));
		  clearElement(resusePassword); 
		  enterValue(resusePassword, "8");
    	return this;
    }
    public SiasSecurityPolicyPage clickSPSubmit() throws InterruptedException {
    	clickElement(locateElement("xpath", props.getProperty("SiasSecurityPolicyPage.SPSubmit.XPath")));
    	wait(8000);
    	return this;
    }
}

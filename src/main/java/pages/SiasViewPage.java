package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.SiasProjectSpecificMethods;

public class SiasViewPage extends SiasProjectSpecificMethods{

public SiasViewPage selectUserID() {
	enterValue(locateElement("xpath", props.getProperty("SiasViewPage.SelectUserID.XPath")), props.getProperty("SiasViewPage.UserId"));
		clickElement(locateElement("xpath", props.getProperty("SiasViewPage.UserID.XPath")));
		return this;
	}
	
public SiasViewPage selectUserAppType() throws InterruptedException {
	clickElement(locateElement("xpath", props.getProperty("SiasViewPage.SelectUserAppType.XPath")));
	wait(1000);
	clickElement(locateElement("xpath", props.getProperty("SiasViewPage.UserAppType.XPath")));
	wait(3000);
	return this;
}
	public SiasViewPage clickSearchButton() throws InterruptedException {

		WebElement searchButton = locateElement("xpath", props.getProperty("SiasViewPage.SearchButton.XPath"));
		jsExecutor(searchButton);
		clickElement(searchButton);
		wait(4000);
		return this;
	}
	
	public SiasViewPage clickAuthButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasViewPage.AuthButton.XPath")));
		wait(10000);
		return this;
		
	}
	
	public SiasModifyScreenPage clickModifyButton() {
		clickElement(locateElement("xpath", props.getProperty("SiasViewPage.ModifyButton.XPath")));
		return new SiasModifyScreenPage();
	}
	
}

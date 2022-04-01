package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.SiasProjectSpecificMethods;

public class SiasDeleteUserViewPage extends SiasProjectSpecificMethods{

public SiasDeleteUserViewPage selectDeleteUserID() {
	enterValue(locateElement("xpath", props.getProperty("SiasDeleteUserViewPage.EnterDeleteUserID.XPath")), props.getProperty("SiasDeleteUserCreationPage.UserId"));
	clickElement(locateElement("xpath", props.getProperty("SiasDeleteUserViewPage.SelectDeleteUserID.XPath")));
		return this;
	}

public SiasDeleteUserViewPage selectDeleteUserAppType() throws InterruptedException {
	clickElement(locateElement("xpath", props.getProperty("SiasDeleteUserViewPage.DeleteUserAppTypeDropDown.XPath")));
	wait(1000);
	clickElement(locateElement("xpath", props.getProperty("SiasDeleteUserViewPage.DeleteUserAppType.XPath")));
	wait(3000);
	return this;
}
	
	public SiasDeleteUserViewPage clickDeleteSearchButton() throws InterruptedException {

		WebElement searchButton = locateElement("xpath", props.getProperty("SiasDeleteUserViewPage.DeleteSearchButton.XPath"));
		jsExecutor(searchButton);
		clickElement(searchButton);
		wait(3000);
		return this;
	}
	
	public SiasDeleteUserViewPage clickDeleteButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasDeleteUserViewPage.DeleteButton.XPath")));
		wait(10000);
		return this;
		
	}
	
	public SiasDeleteUserViewPage clickDeleteUserButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasDeleteUserViewPage.DeleteUserButton.XPath")));
		wait(8000);
		return this;
	}
}

package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.SiasProjectSpecificMethods;

public class SiasCreateRolePage extends SiasProjectSpecificMethods{

	public SiasCreateRolePage enterRoleId() throws InterruptedException {
		wait(3000);
		enterValue(locateElement("xpath", props.getProperty("SiasCreateRolePage.RoleId.XPath")), props.getProperty("SiasCreateRolePage.RoleID"));
		wait(3000);
		return this;
	}
	public SiasCreateRolePage enterRoleDesc() throws InterruptedException {
		enterValue(locateElement("xpath", props.getProperty("SiasCreateRolePage.RoleDesc.XPath")), props.getProperty("SiasCreateRolePage.RoleDescription"));
		wait(3000);
		return this;
	}
	
	public SiasCreateRolePage selectAppType() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasCreateRolePage.AppTypeDropDown.XPath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("SiasCreateRolePage.AppType.XPath")));
		wait(3000);
		return this;
	}
	
    public SiasCreateRolePage selectEditReport() throws InterruptedException {
    	WebElement editReport = locateElement("xpath", props.getProperty("SiasCreateRolePage.EditReportDropDown.XPath"));
    	jsExecutor(editReport);
		clickElement(editReport);
		wait(4000);
		clickElement(locateElement("xpath", props.getProperty("SiasCreateRolePage.EditReport.XPath")));
		wait(3000);
    	return this;
    }
    public SiasCreateRolePage selectDownloadReport() throws InterruptedException {
    	clickElement(locateElement("xpath", props.getProperty("SiasCreateRolePage.DownloadReportDropDown.XPath")));
    	clickElement(locateElement("xpath", props.getProperty("SiasCreateRolePage.DownloadReport.XPath")));
    	wait(3000);
    	return this;
    }
    public SiasCreateRolePage selectAllAdminCheckbox() throws InterruptedException {
    	WebElement admin = locateElement("xpath", props.getProperty("SiasCreateRolePage.AllAdminCheckbox.XPath"));
		clickElement(admin);
		wait(2000);
		return this;
    }
	public SiasCreateRolePage selectAllNormalCheckbox() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasCreateRolePage.AllNormalCheckbox.XPath")));
		wait(3000);
    	return this;
	}	
	
	public SiasDashboardPage clickRoleSubmitButton() throws InterruptedException {
		WebElement submitButton = locateElement("xpath", props.getProperty("SiasCreateRolePage.RoleSubmitButton.XPath"));
		jsExecutor(submitButton);
		clickElement(submitButton);
		wait(7000);
		return new SiasDashboardPage();
	}
}

package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.SiasProjectSpecificMethods;

public class SiasDeleteRoleCreationPage extends SiasProjectSpecificMethods{

		public SiasDeleteRoleCreationPage enterDeleteRoleId() throws InterruptedException {
			wait(3000);
			enterValue(locateElement("xpath", props.getProperty("SiasDeleteRoleCreationPage.DeleteRoleId.XPath")), props.getProperty("VABROLEID"));
			wait(3000);
			return this;
		}
		public SiasDeleteRoleCreationPage enterDeleteRoleDesc() throws InterruptedException {
			enterValue(locateElement("xpath", props.getProperty("SiasDeleteRoleCreationPage.DeleteRoleDesc.XPath")), props.getProperty("VABRoleDesc"));
			wait(3000);
			return this;
		}
		
		public SiasDeleteRoleCreationPage selectAppType() throws InterruptedException {
			clickElement(locateElement("xpath", props.getProperty("SiasDeleteRoleCreationPage.AppTypeDropDown.XPath")));
			wait(1000);
			clickElement(locateElement("xpath", props.getProperty("SiasDeleteRoleCreationPage.AppType.XPath")));
			wait(3000);
			return this;
		}
		
	    public SiasDeleteRoleCreationPage selectDeleteEditReport() throws InterruptedException {
	    	clickElement(locateElement("xpath", props.getProperty("SiasDeleteRoleCreationPage.DeleteEditReportDropDown.XPath")));
	    	clickElement(locateElement("xpath", props.getProperty("SiasDeleteRoleCreationPage.DeleteEditReport.XPath")));
	    	wait(3000);
	    	return this;
	    }
	    public SiasDeleteRoleCreationPage selectDeleteDownloadReport() throws InterruptedException {
	    	clickElement(locateElement("xpath", props.getProperty("SiasDeleteRoleCreationPage.DeleteDownloadReportDropDown.XPath")));
	    	clickElement(locateElement("xpath", props.getProperty("SiasDeleteRoleCreationPage.DeleteDownloadReport.XPath")));
	    	wait(3000);
	    	return this;
	    }
	    public SiasDeleteRoleCreationPage selectDeleteAllAdminCheckbox() throws InterruptedException {
	    	clickElement(locateElement("xpath", props.getProperty("SiasDeleteRoleCreationPage.DeleteAllAdminCheckbox.XPath")));
	    	wait(2000);
			return this;
	    }
		public SiasDeleteRoleCreationPage selectDeleteAllNormalCheckbox() throws InterruptedException {
			clickElement(locateElement("xpath", props.getProperty("SiasDeleteRoleCreationPage.DeleteAllNormalCheckbox.XPath")));
			wait(3000);
	    	return this;
		}	
		
		public SiasDeleteRoleCreationPage clickRoleSubmitButton() throws InterruptedException {
			WebElement submitButton = locateElement("xpath", props.getProperty("SiasDeleteRoleCreationPage.RoleSubmitButton.XPath"));
			jsExecutor(submitButton);
			clickElement(submitButton);
			wait(7000);
			return this;
		}
}

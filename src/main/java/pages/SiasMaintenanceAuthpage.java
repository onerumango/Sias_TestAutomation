package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.SiasProjectSpecificMethods;


public class SiasMaintenanceAuthpage extends SiasProjectSpecificMethods {

	public SiasMaintenanceAuthpage selectScreenName() {
		clickElement(locateElement("xpath", props.getProperty("SiasMaintenanceAuthpage.SelectScreenName.XPath")));
		clickElement(locateElement("xpath", props.getProperty("SiasMaintenanceAuthpage.ScreenName.XPath")));
		return this;
	}

	public SiasMaintenanceAuthpage clickAuthorizeButton() throws InterruptedException {

		WebElement reportIdAuth = locateElement("xpath", props.getProperty("SiasMaintenanceAuthpage.AuthorizeButton.XPath"));
		jsExecutor(reportIdAuth);
		clickElement(reportIdAuth);
		wait(10000);
		return this;
	}

	public SiasMaintenanceAuthpage clickRejectButton() throws InterruptedException {

		WebElement reportIdRej = locateElement("xpath", props.getProperty("SiasMaintenanceAuthpage.RejectButton.XPath"));
		jsExecutor(reportIdRej);
		clickElement(reportIdRej);
		System.out.println("Rejection is done successfully");
		return this;
	}
}

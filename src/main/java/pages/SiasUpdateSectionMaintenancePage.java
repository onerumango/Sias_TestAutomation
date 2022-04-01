package pages;

import base.SiasProjectSpecificMethods;

public class SiasUpdateSectionMaintenancePage extends SiasProjectSpecificMethods{
	
	public SiasUpdateSectionMaintenancePage clickSectionAuthButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasUpdateSectionMaintenancePage.SectionAuthButton.XPath")));
		wait(7000);
		return this;
	}
}

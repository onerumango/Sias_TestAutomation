package pages;

import java.util.concurrent.TimeUnit;

import base.SiasProjectSpecificMethods;

public class SiasAuthDepartmentmanagement extends SiasProjectSpecificMethods{

	public SiasAuthDepartmentmanagement enterFilterKey() throws InterruptedException {
		enterValue(locateElement("xpath", props.getProperty("SiasDepartmentAuthPage.FilterKey.XPath")), props.getProperty("SiasDepartmentAuthPage.FilterKey"));
				wait(4000);
				return this;

			}
	public SiasAuthDepartmentmanagement clickauth() {
		clickElement(locateElement("xpath", props.getProperty("SiasDepartmentAuthPage.clickauth.XPath")));
		wait(4000);
		return this;
	}
}
package pages;

import base.SiasProjectSpecificMethods;

public class SiasMasterPage extends SiasProjectSpecificMethods{

	public SiasMasterPage enterMasterExecutionDate() {
		enterValue(locateElement("xpath", props.getProperty("SiasMasterPage.MasterExecutionDate.XPath")), props.getProperty("SiasMasterPage.ExecutionDate"));
		return this;

}
	public SiasMasterPage selectMasterBranch() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasMasterPage.SelectMasterBranch.XPath")));
		clickElement(locateElement("xpath", props.getProperty("SiasMasterPage.MasterBranch.XPath")));
		wait(1000);
		return this;
	}
	public SiasMasterPage clickMasterSubmitButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasMasterPage.MasterSubmitButton.XPath")));
		wait(8000);
		return this;
	}
}

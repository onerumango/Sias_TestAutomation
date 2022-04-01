package pages;

import org.openqa.selenium.WebElement;

import base.SiasProjectSpecificMethods;

public class SiasMappingNonOraclePage extends SiasProjectSpecificMethods{

	public SiasMappingNonOraclePage selectExternalSystemLink() throws InterruptedException {
		clickElement(locateElement("id", props.getProperty("SiasMappingNonOraclePage.SelectExternalSystemLink.Id")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("SiasMappingNonOraclePage.ExternalSystemLink.XPath")));
		wait(2000);
		return this;
	}
	
	public SiasMappingNonOraclePage clickQueryButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasMappingNonOraclePage.QueryButton.XPath")));
		wait(5000);
		return this;
	}
	
	public SiasMappingNonOraclePage clickAddButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasMappingNonOraclePage.AddButton.XPath")));
		wait(5000);
		return this;
	}
	
	public SiasMappingNonOraclePage enterSourceTable()  {
		
		WebElement sourceTable = locateElement("xpath", props.getProperty("SiasMappingNonOraclePage.SourceTable.XPath"));
		clearElement(sourceTable);
		enterValue(sourceTable, "RBCSOURCE2");
		return this;
	}
	
	public SiasMappingNonOraclePage enterDestinationTable() {
		WebElement destTable = locateElement("xpath", props.getProperty("SiasMappingNonOraclePage.DestinationTable.XPath"));
		clearElement(destTable);
		enterValue(destTable, "RBCDEST2");
		return this;
	}
	
	public SiasMappingNonOraclePage selectEnabledDisabledFlag() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasMappingNonOraclePage.SelectEnabledDisabledFlag.XPath")));
		wait(2000);
		WebElement enabDisab = locateElement("xpath", props.getProperty("SiasMappingNonOraclePage.EnabledDisabledFlag.XPath"));
		wait(2000);
		clickElement(enabDisab);
		return this;
	}
	
	public SiasMappingNonOraclePage clickSubmitButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasMappingNonOraclePage.SubmitButton.XPath")));
		wait(7000);
		return this;
	}
	
}

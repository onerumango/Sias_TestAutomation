package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.SiasProjectSpecificMethods;

public class SiasExcelMappingPage extends SiasProjectSpecificMethods{

	public SiasExcelMappingPage selectNewExcelMappingReportName() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasExcelMappingPage.SelectNewExcelMappingReportName.XPath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("SiasExcelMappingPage.NewExcelMappingReportName.XPath")));
		return this;
	}
	
	public SiasExcelMappingPage selectNewExcelMappingSection() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasExcelMappingPage.SelectNewExcelMappingSection.XPath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("SiasExcelMappingPage.NewExcelMappingSection.XPath")));
		wait(2000);
		return this;
	}
	
	public SiasExcelMappingPage enterNewExcelMappingDataRow() {
		enterValue(locateElement("xpath", props.getProperty("SiasExcelMappingPage.NewExcelMappingDataRow.XPath")), props.getProperty("SiasExcelMappingPage.DataRow"));
		return this;
	}
	
	public SiasExcelMappingPage clickNewExcelMappingHeaderCheck() {
		clickElement(locateElement("xpath", props.getProperty("SiasExcelMappingPage.NewExcelMappingHeaderCheck.XPath")));
		return this;
	}
	
	public SiasExcelMappingPage clickNewExcelMappingAddButton() {
		clickElement(locateElement("xpath", props.getProperty("SiasExcelMappingPage.NewExcelMappingAddButton.XPath")));
		return this;
	}
	
	public SiasExcelMappingPage enterNewExcelMappingName1() {
		enterValue(locateElement("xpath", props.getProperty("SiasExcelMappingPage.NewExcelMappingName1.XPath")), props.getProperty("SiasExcelMappingPage.MappingName1"));
		return this;
	}
	
	public SiasExcelMappingPage enterNewExcelMappingDatatype1() {
		clickElement(locateElement("xpath", props.getProperty("SiasExcelMappingPage.EnterNewExcelMappingDatatype1.XPath")));
		clickElement(locateElement("xpath", props.getProperty("SiasExcelMappingPage.NewExcelMappingDatatype1.XPath")));
		return this;
	}
	
	public SiasExcelMappingPage clickNewExcelMappingMandatoryCheck1() {
		clickElement(locateElement("xpath", props.getProperty("SiasExcelMappingPage.NewExcelMappingMandatoryCheck1.XPath")));
		return this;
	}
	
	public SiasExcelMappingPage enterNewExcelMappingHeaderName1() {
		enterValue(locateElement("xpath", props.getProperty("SiasExcelMappingPage.NewExcelMappingHeaderName1.XPath")), props.getProperty("SiasExcelMappingPage.HeaderName1"));
		return this;
	}
	
	public SiasExcelMappingPage enterNewExcelMappingMappingColumn1() {
		enterValue(locateElement("xpath", props.getProperty("SiasExcelMappingPage.NewExcelMappingMappingColumn1.XPath")), props.getProperty("SiasExcelMappingPage.MappingColumn1"));
		return this;
	}
	
	public SiasExcelMappingPage enterNewExcelMappingName2() {
		enterValue(locateElement("xpath", props.getProperty("SiasExcelMappingPage.NewExcelMappingName2.XPath")), props.getProperty("SiasExcelMappingPage.MappingName2"));
		return this;
	}
	
	public SiasExcelMappingPage enterNewExcelMappingDatatype2() {
		clickElement(locateElement("xpath", props.getProperty("SiasExcelMappingPage.EnterNewExcelMappingDatatype2.XPath")));
		clickElement(locateElement("xpath", props.getProperty("SiasExcelMappingPage.NewExcelMappingDatatype2.XPath")));
		return this;
	}
	
	public SiasExcelMappingPage clickNewExcelMappingMandatoryCheck2() {
		clickElement(locateElement("xpath", props.getProperty("SiasExcelMappingPage.NewExcelMappingMandatoryCheck2.XPath")));
		return this;
	}
	
	public SiasExcelMappingPage enterNewExcelMappingHeaderName2() {
		enterValue(locateElement("xpath", props.getProperty("SiasExcelMappingPage.NewExcelMappingHeaderName2.XPath")), props.getProperty("SiasExcelMappingPage.HeaderName2"));
		return this;
	}
	
	public SiasExcelMappingPage enterNewExcelMappingMappingColumn2() {
		enterValue(locateElement("xpath", props.getProperty("SiasExcelMappingPage.NewExcelMappingMappingColumn2.XPath")), props.getProperty("SiasExcelMappingPage.MappingColumn2"));
		return this;
	}
	
	public SiasExcelMappingPage clickNewExcelMappingSubmitButton() throws InterruptedException {

		WebElement submitButton = locateElement("xpath", props.getProperty("SiasExcelMappingPage.NewExcelMappingSubmitButton.XPath"));
		jsExecutor(submitButton);
		clickElement(submitButton);
		wait(7000);
		return this;
	}
	
	public SiasAutoQueryExcelMappingScreen clickExcelMappingAutoQueryButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasExcelMappingPage.ExcelMappingAutoQueryButton.XPath")));
		wait(2000);
		return new SiasAutoQueryExcelMappingScreen();
	}
}

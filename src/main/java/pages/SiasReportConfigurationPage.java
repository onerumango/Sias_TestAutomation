package pages;

import java.util.concurrent.TimeUnit;

import base.SiasProjectSpecificMethods;

public class SiasReportConfigurationPage extends SiasProjectSpecificMethods{

	public SiasReportConfigurationPage enterReportId() {
		enterValue(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.ReportId.XPath")), "ACCREPORTV41");
		return this;
	}

	public SiasReportConfigurationPage enterReportDescription() {
		enterValue(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.ReportDescription.XPath")), "ACCREPORTV41");
		return this;
	}

	public SiasReportConfigurationPage selectType() {
		clickElement(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.SelectType.XPath")));
		clickElement(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.Type.XPath")));
		return this;
	}

	public SiasReportConfigurationPage selectAmendable() {
		clickElement(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.SelectAmendable.XPath")));
		clickElement(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.Amendable.XPath")));
		return this;
	}
	
	public SiasReportConfigurationPage enterReportLevel() {
		enterValue(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.ReportLevel.XPath")), "1");
		return this;
	}

public SiasReportConfigurationPage selectReportEdit() {
		clickElement(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.SelectReportedit.XPath")));
		clickElement(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.YesType.XPath")));
		return this;
	}

public SiasReportConfigurationPage selectfileType() {
		clickElement(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.SelectfileType.XPath")));
		clickElement(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.xlsxType.XPath")));
		return this;
	}

public SiasReportConfigurationPage selectcrossrole() {
		clickElement(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.Selectcrossrole.XPath")));
		clickElement(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.yesrole.XPath")));
		return this;
	}

public SiasReportConfigurationPage selectRoleid() {
		clickElement(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.SelectRoleid.XPath")));
		clickElement(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.role1.XPath")));
		return this;
	}


	public SiasReportConfigurationPage clickAddReportButton() {
		clickElement(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.AddReportButton.XPath")));
		return this;
	}

	public SiasReportConfigurationPage enterTableName() {
		enterValue(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.TableName.XPath")), "t1");
		return this;
	}

	public SiasReportConfigurationPage enterAdjustableTableName() {
		enterValue(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.AdjustableTableName.XPath")), "t2");
		return this;
	}

	public SiasReportConfigurationPage selectUserUploadFlag() {
		clickElement(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.SelectUserUploadFlag.XPath")));
		clickElement(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.UserUploadFlag.XPath")));
		return this;
	}

	public SiasReportConfigurationPage enterTableLabel() {
		enterValue(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.TableLabel.XPath")), "t3");
		return this;
	}

	public SiasReportConfigurationPage enterOrderBy() {
		enterValue(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.OrderBy.XPath")), "Y");
		return this;
	}
	
	public SiasReportConfigurationPage clickSaveButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasReportConfigurationPage.SaveButton.XPath")));
		wait(7000);
		return this;
	}
}

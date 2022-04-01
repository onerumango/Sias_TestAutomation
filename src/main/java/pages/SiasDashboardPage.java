package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.SiasProjectSpecificMethods;

public class SiasDashboardPage extends SiasProjectSpecificMethods {

	public SiasDashboardPage clickDahboardMenuIcon() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.DahboardMenuIcon.XPath")));
		return this;
	}

	public SiasDashboardPage clickMaintenanceLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.MaintenanceLink.XPath")));
		return this;
	}

	public SiasReportConfigurationPage clickReportConfigurationLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.ReportConfigurationLink.XPath")));
		webDriverWait("Sias V2 > Report Configuration | Sias2 App");
		return new SiasReportConfigurationPage();
	}

	public SiasReportmappingPage clickReportMappingLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.ReportMappingLink.XPath")));
		webDriverWait("Admin > Role Maintanance | Sias2 App");
		return new SiasReportmappingPage();

	}

	public SiasCommParameterPage clickCommonParametersLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.CommonParametersLink.XPath")));
		webDriverWait("Sias V2 > Common Parameters | Sias2 App");
		return new SiasCommParameterPage();
	}

	public SiasSecurityPolicyPage clickSecurityPolicyLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.SecurityPolicyLink.XPath")));
		webDriverWait("Sias V2 > Security Policy | Sias2 App");
		return new SiasSecurityPolicyPage();
	}

	public SiasAuthorizationPage clickAuthorizationLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.AuthorizationLink.XPath")));
		webDriverWait("Sias V2 > Authorization | Sias2 App");
		return new SiasAuthorizationPage();
	}

	public SiasDashboardPage clickFileUploadLink() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.FileUploadLink.XPath")));
		wait(2000);
		return this;
	}

	public SiasManualReportMaintenancePage clickManualReportMaintenanceLink() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.ManualReportMaintenanceLink.XPath")));
		wait(5000);
		webDriverWait("Sias V2 > External System Summary | Sias2 App");
		return new SiasManualReportMaintenancePage();
	}

	public SiasSectionMaintenancePage clickSectionMaintenanceLink() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.SectionMaintenanceLink.XPath")));
		wait(5000);
		webDriverWait("Sias V2 > Process Code Mapping Summary | Sias2 App");
		return new SiasSectionMaintenancePage();
	}

	public SiasExcelMappingPage clickExcelMappingLink() throws InterruptedException {

		WebElement excelMapping =locateElement("xpath", props.getProperty("SiasDashboardPage.ExcelMappingLink.XPath"));
		jsExecutor(excelMapping);
		clickElement(excelMapping);
		wait(3000);
		webDriverWait("Sias V2 > Excel Mapping | Sias2 App");
		return new SiasExcelMappingPage();
	}

	public SiasExcelUploadPage clickExcelUploadLink() throws InterruptedException {

		WebElement excelUpload = locateElement("xpath", props.getProperty("SiasDashboardPage.ExcelUploadLink.XPath"));
		jsExecutor(excelUpload);
		clickElement(excelUpload);
		wait(3000);
		webDriverWait("Sias V2 > Excel Upload | Sias2 App");
		return new SiasExcelUploadPage();
	}

	public SiasExcelProcessingSummaryPage clickExcelProcessigSummaryLink() throws InterruptedException {

		WebElement excelProcSummary = locateElement("xpath", props.getProperty("SiasDashboardPage.ExcelProcessigSummaryLink.XPath"));
		jsExecutor(excelProcSummary);
		clickElement(excelProcSummary);
		wait(3000);
		webDriverWait("Sias V2 > Excel Processing Summary | Sias2 App");
		return new SiasExcelProcessingSummaryPage();
	}

	public SiasDashboardPage clickUserManagementLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.UserManagementLink.XPath")));
		return this;
	}

	public SiasCreateUserPage clickCreateUserLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.CreateUserLink.XPath")));
		webDriverWait("Admin > Create User | Sias2 App");
		return new SiasCreateUserPage();
	}

	public SiasDeleteUserCreationPage clickDeleteCreateUserLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.DeleteCreateUserLink.XPath")));
		webDriverWait("Admin > Create User | Sias2 App");
		return new SiasDeleteUserCreationPage();
	}

	public SiasViewPage clickViewUserLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.ViewUserLink.XPath")));
		webDriverWait("Admin > View Users | Sias2 App");
		return new SiasViewPage();

	}

	public SiasDeleteUserViewPage clickDeleteViewUserLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.DeleteViewUserLink.XPath")));
		webDriverWait("Admin > View Users | Sias2 App");
		return new SiasDeleteUserViewPage();

	}

	public SiasDashboardPage clickRoleManagementLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.RoleManagementLink.XPath")));
		return this;
	}

	public SiasCreateRolePage clickCreateRoleLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.CreateRoleLink.XPath")));
		webDriverWait("Admin > Create Role | Sias2 App");
		return new SiasCreateRolePage();
	}

	public SiasDeleteRoleCreationPage clickDeleteCreateRoleLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.DeleteCreateRoleLink.XPath")));
		webDriverWait("Admin > Create Role | Sias2 App");
		return new SiasDeleteRoleCreationPage();
	}
	public SiasViewAndAuthRolePage clickViewRoleLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.ViewRoleLink.XPath")));
		webDriverWait("Admin > View Roles | Sias2 App");
		return new SiasViewAndAuthRolePage();
	}
	
	public SiasViewAndDeleteRolePage clickDeleteViewRoleLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.ViewRoleLink.XPath")));
		webDriverWait("Admin > View Roles | Sias2 App");
		return new SiasViewAndDeleteRolePage();
	}

	public SiasDashboardPage clickWarehouseRefreshLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.WarehouseRefreshLink.XPath")));
		return this;
	}

	public SiasTemporaryPage clickTemporaryLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.TemporaryLink.XPath")));
		webDriverWait("Temp > Temporary Refresh | Sias2 App");
		return new SiasTemporaryPage();
	}

	public SiasStagingPage clickStagingLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.StagingLink.XPath")));
		return new SiasStagingPage();
	}

	public SiasMasterPage clickMasterLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.MasterLink.XPath")));
		return new SiasMasterPage();
	}

	public SiasExceptionDetailsPage clickWarehouseExceptioDetailsLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.WarehouseExceptioDetailsLink.XPath")));
		webDriverWait("Datamart Refresh > Exception Details | Sias2 App");
		return new SiasExceptionDetailsPage();
	}

	public SiasDashboardPage clickReportMenuLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.ReportMenuLink.XPath")));
		return this;
	}

	public SiasDashboardPage clickReportSubMenuLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.ReportSubMenuLink.XPath")));
		return this;
	}

	public SiasReportPage clickReportLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.ReportLink.XPath")));
		webDriverWait("Sias V2 > Report Author | Sias2 App");
		return new SiasReportPage();
	}

	public SiasDashboardPage clickActivitiesLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.ActivitiesLink.XPath")));
		return this;
	}

	public SiasReviewerPage clickQueueDetailsLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.QueueDetailsLink.XPath")));
		webDriverWait("Sias V2 > Workflow Queue Details | Sias2 App");
		return new SiasReviewerPage();
	}

	public SiasReviewerPage clickViewIcon() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.ViewIcon.XPath")));
		return new SiasReviewerPage();
	}

	public SiasQueueStatusPage clickQueueStatusLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.QueueStatusLink.XPath")));
		webDriverWait("Sias V2 > Workflow Queue Status | Sias2 App");
		return new SiasQueueStatusPage();
	}

	public SiasDashboardPage clickExternalSystemLink() throws InterruptedException {
		WebElement extSystem = locateElement("xpath", props.getProperty("SiasDashboardPage.ExternalSystemLink.XPath"));
		jsExecutor(extSystem);
		clickElement(extSystem);
		wait(2000);
		return this;
	}

	public SiasCreateMaintenancePage clickExternalSystemMaintenanceLink() {
		clickElement(locateElement("xpath", props.getProperty("SiasDashboardPage.ExternalSystemMaintenanceLink.XPath")));
		webDriverWait("External Systems > Maintenance | Sias2 App");
		return new SiasCreateMaintenancePage();
	}

	public SiasMappingNonOraclePage clickMappingNonOracleLink() throws InterruptedException {
		WebElement nonMappingOracle = locateElement("xpath", props.getProperty("SiasDashboardPage.MappingNonOracleLink.XPath"));
		jsExecutor(nonMappingOracle);
		clickElement(nonMappingOracle);
		wait(2000);
		webDriverWait("External Systems > Mapping Non-Oracle | Sias2 App");
		return new SiasMappingNonOraclePage();
	}

	public SiasMappingOraclePage clickMappingOracleLink() throws InterruptedException {
		WebElement mappingOracle = locateElement("xpath", props.getProperty("SiasDashboardPage.MappingOracleLink.XPath"));
		jsExecutor(mappingOracle);
		clickElement(mappingOracle);
		webDriverWait("External Systems > Mapping Oracle | Sias2 App");
		return new SiasMappingOraclePage();
	}

	public SiasExternalSystemRefreshPage clickExternalSytemRefreshLink() throws InterruptedException {
		WebElement refresh = locateElement("xpath", props.getProperty("SiasDashboardPage.ExternalSytemRefreshLink.XPath"));
		jsExecutor(refresh);
		clickElement(refresh);
		webDriverWait("External Systems > Refresh | Sias2 App");
		return new SiasExternalSystemRefreshPage();
	}
}

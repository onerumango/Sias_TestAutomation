package testcases;

import org.testng.annotations.Test;

import base.SiasProjectSpecificMethods;
import pages.SiasLoginPageMaker;
import pages.SiasLogoutPage;

public class SiasReportConfigurationTestCase extends SiasProjectSpecificMethods {

	@Test
	public void runReportConfiguration()
			throws InterruptedException {
		
		SiasLoginPageMaker login = new SiasLoginPageMaker();
		login.enterMakerUserId()
		.enterMakerPassword()
		.clickMakerSignInButton()
		.clickMaintenanceLink()
		.clickReportConfigurationLink()
		.enterReportId()
		.enterReportDescription()
		.selectType()
		.selectAmendable()
		.clickAddReportButton()
		.enterTableName()
		.enterAdjustableTableName()
		.selectUserUploadFlag()
		.enterTableLabel()
		.enterOrderBy()
		.clickSaveButton();
		SiasLogoutPage makerLogout = new SiasLogoutPage();
		makerLogout.clickLogoutSymbol()
		.clickSignOut()
		.enterAuthorUserId()
		.enterAuthorPassword()
		.clickAuthorSignInButton()
		.clickMaintenanceLink()
		.clickAuthorizationLink()
		.selectReportConfigScreenName()
		.clickReportConfigAuthorizeButton();
		SiasLogoutPage authorLogout = new SiasLogoutPage();
		authorLogout.clickLogoutSymbol()
		.clickSignOut();
		

	}
}

package testcases;

import org.testng.annotations.Test;

import base.SiasProjectSpecificMethods;
import pages.SiasLoginPageMaker;
import pages.SiasLogoutPage;

public class SiasManualReportMaintenanceTestCase extends SiasProjectSpecificMethods{

	
	@Test
	public void runManualReportMaintenance()
			throws InterruptedException {
		
		SiasLoginPageMaker login = new SiasLoginPageMaker();
		login.enterMakerUserId()
		.enterMakerPassword()
		.clickMakerSignInButton()
		.clickFileUploadLink()
		.clickManualReportMaintenanceLink()
		.clickNewButton()
		.selectReportCode()
		.clickSubmitButton()
		.clickExitButton()
		.enterFilterKey()
		.clickReportCodeLink()
		.clickEditButton()
		.clickUpdateButton();
		SiasLogoutPage makerLogout = new SiasLogoutPage();
		makerLogout.clickLogoutSymbol()
		.clickSignOut()
		.enterAuthorUserId()
		.enterAuthorPassword()
		.clickAuthorSignInButton()
		.clickFileUploadLink()
		.clickManualReportMaintenanceLink()
		.enterFilterKey()
		.clickReportCodeLink()
		.clickAuthButton();
		SiasLogoutPage authorLogout = new SiasLogoutPage();
		authorLogout.clickLogoutSymbol()
		.clickSignOut();
	}
}

package testcases;

import org.testng.annotations.Test;

import base.SiasProjectSpecificMethods;
import pages.SiasLoginPageMaker;
import pages.SiasLogoutPage;

public class SiasReportmappingTestcase extends SiasProjectSpecificMethods {

	@Test
	public void runReportMapping()
			throws InterruptedException {
		
		SiasLoginPageMaker login = new SiasLoginPageMaker();
		login.enterMakerUserId()
		.enterMakerPassword()
		.clickMakerSignInButton()
		.clickMaintenanceLink()
		.clickReportMappingLink()
		.selectReports()
		.clickModifyButton()
		.selectEdit()
		.clickSaveButton();
		SiasLogoutPage makerLogout = new SiasLogoutPage();
		makerLogout.clickLogoutSymbol()
		.clickSignOut()
		.enterAuthorUserId()
		.enterAuthorPassword()
		.clickAuthorSignInButton()
		.clickMaintenanceLink()
		.clickAuthorizationLink()
		.selectReportMappingScreenName()
		.clickReportMappingAuthorizeButton();
		SiasLogoutPage authorLogout = new SiasLogoutPage();
		authorLogout.clickLogoutSymbol()
		.clickSignOut();
	
}
}

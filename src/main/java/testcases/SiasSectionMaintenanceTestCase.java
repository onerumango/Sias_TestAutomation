package testcases;

import org.testng.annotations.Test;

import base.SiasProjectSpecificMethods;
import pages.SiasLoginPageMaker;
import pages.SiasLogoutPage;

public class SiasSectionMaintenanceTestCase extends SiasProjectSpecificMethods{

	@Test
	public void runSectionMaintenance()
			throws InterruptedException {
		
		SiasLoginPageMaker login = new SiasLoginPageMaker();
		login.enterMakerUserId()
		.enterMakerPassword()
		.clickMakerSignInButton()
		.clickFileUploadLink()
		.clickSectionMaintenanceLink()
		.clickSectionNewButton()
		.selectReportCodeAndName()
		.enterSection()
		.enterUploadLimit()
		.clickSectionSaveButton();
		SiasLogoutPage makerLogout = new SiasLogoutPage();
		makerLogout.clickLogoutSymbol()
		.clickSignOut()
		.enterAuthorUserId()
		.enterAuthorPassword()
		.clickAuthorSignInButton()
		.clickFileUploadLink()
		.clickSectionMaintenanceLink()
		.enterSectionFilterCode()
		.clickReportNameLink()
		.clickSectionAuthButton();
		SiasLogoutPage authorLogout = new SiasLogoutPage();
		authorLogout.clickLogoutSymbol()
		.clickSignOut();
}
}

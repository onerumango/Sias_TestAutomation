package testcases;

import org.testng.annotations.Test;
import base.SiasProjectSpecificMethods;
import pages.SiasLoginPageMaker;
import pages.SiasLogoutPage;

public class SiasCreateandAuthMaintenanceTestCase extends SiasProjectSpecificMethods {

	@Test
	public void runCreateMaintenancePage()
			throws InterruptedException {
		SiasLoginPageMaker login = new SiasLoginPageMaker();
		login.enterMakerUserId()
		.enterMakerPassword()
		.clickMakerSignInButton()
		.clickExternalSystemLink()
		.clickExternalSystemMaintenanceLink()
		.enterExternal()
		.enterDescription()
		.enterInstance()
		.selectDatabase()
		.enterPort()
		.enterUserID()
		.enterPasswordID()
		.clickExtSysMaintSubmitButton()
		.clickResetButton()
		.enterExternalquery()
		.clickQueryButton();
		SiasLogoutPage makerLogout = new SiasLogoutPage();
		makerLogout.clickLogoutSymbol()
		.clickSignOut()
		.enterAuthorUserId()
		.enterAuthorPassword()
		.clickAuthorSignInButton()
		.clickMaintenanceLink()
		.clickAuthorizationLink()
		.selectExternalSystemConfigScreenName()
		.clickExternalSystemAuthorizeButton();
		makerLogout.clickLogoutSymbol()
		.clickSignOut();
		

	}
}
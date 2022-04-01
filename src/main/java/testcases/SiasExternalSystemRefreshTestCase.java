package testcases;

import org.testng.annotations.Test;

import base.SiasProjectSpecificMethods;
import pages.SiasLoginPageMaker;
import pages.SiasLogoutPage;

public class SiasExternalSystemRefreshTestCase extends SiasProjectSpecificMethods{

	@Test
	public void runExternalSystemRefresh()
			throws InterruptedException {
		
		SiasLoginPageMaker login = new SiasLoginPageMaker();
		login.enterMakerUserId()
		.enterMakerPassword()
		.clickMakerSignInButton()
		.clickExternalSystemLink()
		.clickExternalSytemRefreshLink()
		.selectExternalSystemExecutionDate()
		.clickExternalSystemFetchButton();
		SiasLogoutPage makerLogout = new SiasLogoutPage();
		makerLogout.clickLogoutSymbol()
		.clickSignOut();
}
}

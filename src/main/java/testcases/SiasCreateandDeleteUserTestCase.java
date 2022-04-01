package testcases;

import org.testng.annotations.Test;

import base.SiasProjectSpecificMethods;
import pages.SiasLoginPageMaker;
import pages.SiasLogoutPage;

public class SiasCreateandDeleteUserTestCase extends SiasProjectSpecificMethods{
	@Test
	public void runCreateandAuthUser()
			throws InterruptedException {
		SiasLoginPageMaker login = new SiasLoginPageMaker();
		login.enterMakerUserId()
		.enterMakerPassword()
		.clickMakerSignInButton()
		.clickUserManagementLink()
		.clickDeleteCreateUserLink()
		.enterDeleteUserId()
		.enterDeleteUsername()
		.selectDeleteroleId()
		.enterDeleteEmailId()
		.selectDeleteBranch()
		.selectDeleteCountry()
		.enterDeleteMobileNo()
		.clickDeleteSubmitButton();
		SiasLogoutPage makerLogout = new SiasLogoutPage();
		makerLogout.clickLogoutSymbol()
		.clickSignOut()
		.enterAuthorUserId()
		.enterAuthorPassword()
		.clickAuthorSignInButton()
		.clickUserManagementLink()
		.clickDeleteViewUserLink()
		.selectDeleteUserID()
		.selectDeleteUserAppType()
		.clickDeleteSearchButton()
		.clickDeleteButton()
		.clickDeleteUserButton();
		SiasLogoutPage authorLogout = new SiasLogoutPage();
		authorLogout.clickLogoutSymbol()
		.clickSignOut();
		
	}

}

package testcases; 

import org.testng.annotations.Test;
import base.SiasProjectSpecificMethods;
import pages.SiasLoginPageAuthorizer;
import pages.SiasLoginPageMaker;
import pages.SiasLogoutPage;

public class SiasCreateModifyandAuthUserTestCase extends SiasProjectSpecificMethods{
	
	@Test
	public void runCreateandAuthUser()
			throws InterruptedException {
		SiasLoginPageMaker login = new SiasLoginPageMaker();
		login.enterMakerUserId()
		.enterMakerPassword()
		.clickMakerSignInButton()
		.clickUserManagementLink()
		.clickCreateUserLink()
		.enterUserId()
		.enterUsername()
		.selectroleId()
		.enterEmailId()
		.selectBranch()
		.selectCountry()
		.enterMobileNo()
		.clickSubmitButton()
		.clickViewUserLink()
		.selectUserID()
		.selectUserAppType()
		.clickSearchButton()
		.clickModifyButton()
		.enterModifyUsername()
		.selectModifyBranch()
		.clickSubmitButton();
		SiasLogoutPage makerLogout = new SiasLogoutPage();
		makerLogout.clickLogoutSymbol()
		.clickSignOut()
		.enterAuthorUserId()
		.enterAuthorPassword()
		.clickAuthorSignInButton()
		.clickUserManagementLink()
		.clickViewUserLink()
		.selectUserID()
		.selectUserAppType()
		.clickSearchButton()
		.clickAuthButton();
		makerLogout.clickLogoutSymbol()
		.clickSignOut();
		
	}
		
}

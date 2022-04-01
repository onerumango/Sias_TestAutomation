package testcases;

import org.testng.annotations.Test;

import base.SiasProjectSpecificMethods;
import pages.SiasLoginPageAuthorizer;
import pages.SiasLoginPageMaker;
import pages.SiasLogoutPage;

public class SiasCreateViewModifyAuthRoleTestCase extends SiasProjectSpecificMethods {
	
	@Test
	public void runCreateRole () throws InterruptedException {
		SiasLoginPageMaker login = new SiasLoginPageMaker();
	login.enterMakerUserId()
	.enterMakerPassword()
	.clickMakerSignInButton()
	.clickRoleManagementLink()
	.clickCreateRoleLink()
    .enterRoleId()
    .enterRoleDesc()
    .selectAppType()
    .selectEditReport()
    .selectDownloadReport()
    .selectAllAdminCheckbox()
    .selectAllNormalCheckbox()
    .clickRoleSubmitButton()
    .clickViewRoleLink()
    .enterRoleId()
    .selectAppType()
    .clickSearchButton()
    .clickModifyRoleButton()
    .SiasEditAccessRole();
	SiasLogoutPage makerLogout= new SiasLogoutPage();
	makerLogout.clickLogoutSymbol()
	.clickSignOut();
	
	SiasLoginPageAuthorizer login2 = new SiasLoginPageAuthorizer();
	login2.enterAuthorUserId()
	.enterAuthorPassword()
	.clickAuthorSignInButton()
	.clickRoleManagementLink()
	.clickViewRoleLink()
	.enterRoleId()
	.selectAppType()
	.clickSearchButton()
	.clickAuthRoleButton();
	makerLogout.clickLogoutSymbol()
	.clickSignOut();
	}
}

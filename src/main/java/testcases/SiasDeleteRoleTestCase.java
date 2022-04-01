package testcases;

import org.testng.annotations.Test;

import base.SiasProjectSpecificMethods;
import net.bytebuddy.asm.Advice.Enter;
import pages.SiasLoginPageAuthorizer;
import pages.SiasLoginPageMaker;
import pages.SiasLogoutPage;

public class SiasDeleteRoleTestCase extends SiasProjectSpecificMethods{
	
	@Test
	public void runDeleteRole () throws InterruptedException {
		SiasLoginPageMaker login = new SiasLoginPageMaker();
	login.enterMakerUserId()
	.enterMakerPassword()
	.clickMakerSignInButton()
	.clickRoleManagementLink()
	.clickDeleteCreateRoleLink()
	.enterDeleteRoleId()
	.enterDeleteRoleDesc()
	.selectAppType()
	.selectDeleteEditReport()
	.selectDeleteDownloadReport()
	.selectDeleteAllAdminCheckbox()
	.selectDeleteAllNormalCheckbox()
	.clickRoleSubmitButton();
	SiasLogoutPage makerLogout= new SiasLogoutPage();
	makerLogout.clickLogoutSymbol()
	.clickSignOut();
	
	SiasLoginPageAuthorizer login1 = new SiasLoginPageAuthorizer();
	login1.enterAuthorUserId()
	.enterAuthorPassword()
	.clickAuthorSignInButton()
	.clickRoleManagementLink()
	.clickDeleteViewRoleLink()
	.enterDeleteRoleId()
	.selectDeleteRoleAppType()
	.clickDeleteSearchButton()
	.clickDeleteRoleIcon()
	.clickDeleteRoleButton();
	makerLogout.clickLogoutSymbol()
	.clickSignOut();
}
}

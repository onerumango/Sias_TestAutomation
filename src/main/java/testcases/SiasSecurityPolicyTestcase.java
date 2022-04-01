package testcases;

import org.testng.annotations.Test;

import base.SiasProjectSpecificMethods;
import pages.SiasLoginPageMaker;
import pages.SiasLogoutPage;

public class SiasSecurityPolicyTestcase extends SiasProjectSpecificMethods{

	@Test
	public void runSecurityPolicy()
			throws InterruptedException {
		
		SiasLoginPageMaker login = new SiasLoginPageMaker();
		login.enterMakerUserId()
		.enterMakerPassword()
		.clickMakerSignInButton()
		.clickMaintenanceLink()
		.clickSecurityPolicyLink()
		.clickSPEdit()
		.modifyPasswordReuse()
		.clickSPSubmit();
		SiasLogoutPage makerLogout = new SiasLogoutPage();
		makerLogout.clickLogoutSymbol()
		.clickSignOut()
		.enterAuthorUserId()
		.enterAuthorPassword()
		.clickAuthorSignInButton()
		.clickMaintenanceLink()
		.clickAuthorizationLink()
		.selectSecurityPolicyScreenName()
		.securityPolicyAuthorizeButton();
		SiasLogoutPage authorLogout = new SiasLogoutPage();
		authorLogout.clickLogoutSymbol()
		.clickSignOut();
}
}

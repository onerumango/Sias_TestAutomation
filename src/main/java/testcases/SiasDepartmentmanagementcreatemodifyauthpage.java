package testcases;

import org.testng.annotations.Test;

import base.SiasProjectSpecificMethods;
import pages.SiasLoginPageMaker;
import pages.SiasLogoutPage;

public class SiasDepartmentmanagementcreatemodifyauthpage extends SiasProjectSpecificMethods{
	@Test
	public void runCreateandAuthUser()
			throws InterruptedException {
		SiasLoginPageMaker login = new SiasLoginPageMaker();
		login.enterMakerUserId()
		.enterMakerPassword()
		.clickMakerSignInButton()
		.clickDepartmentmanagementLink()
		.clickcreateDepartmentmanagement()
		.entercode()
		.entername()
		.clicksave()
		.clickviewpage()
		.enterFilterKey()
		.clickedit()
		.entermodifycode()
		.clickupdate()
		.clickcancel();
		SiasLogoutPage makerLogout = new SiasLogoutPage();
		makerLogout.clickLogoutSymbol()
		.clickSignOut()
		.enterAuthorUserId()
		.enterAuthorPassword()
		.clickAuthorSignInButton()
		.clickDepartmentmanagementLink()
		.clickviewDepartmentmanagement()
		.enterFilterKey()
		.clickauth();
		SiasLogoutPage authorLogout = new SiasLogoutPage();
		authorLogout.clickLogoutSymbol()
		.clickSignOut();
		
	}

}


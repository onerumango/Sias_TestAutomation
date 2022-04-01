package testcases;

import org.testng.annotations.Test;

import base.SiasProjectSpecificMethods;
import pages.SiasLoginPageMaker;
import pages.SiasLogoutPage;

public class SiasTemporaryTestcase extends SiasProjectSpecificMethods{

	@Test
	public void runTemporary() throws InterruptedException {
		SiasLoginPageMaker login = new SiasLoginPageMaker();
		login.enterMakerUserId()
		.enterMakerPassword()
		.clickMakerSignInButton()
		.clickWarehouseRefreshLink()
		.clickTemporaryLink()
		.enterExecutionDate()
		.selectTempBranch()
		.clickTempSubmitButton();
		SiasLogoutPage makerLogout = new SiasLogoutPage();
		makerLogout.clickLogoutSymbol()
		.clickSignOut();
	}
}

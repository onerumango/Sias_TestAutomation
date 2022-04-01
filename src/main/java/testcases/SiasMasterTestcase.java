package testcases;

import org.testng.annotations.Test;

import base.SiasProjectSpecificMethods;
import pages.SiasLoginPageMaker;
import pages.SiasLogoutPage;

public class SiasMasterTestcase extends SiasProjectSpecificMethods{

	@Test
	public void runMaster() throws InterruptedException {
		SiasLoginPageMaker login = new SiasLoginPageMaker();
		login.enterMakerUserId()
		.enterMakerPassword()
		.clickMakerSignInButton()
		.clickWarehouseRefreshLink()
		.clickMasterLink()
		.enterMasterExecutionDate()
		.selectMasterBranch()
		.clickMasterSubmitButton();
		SiasLogoutPage makerLogout = new SiasLogoutPage();
		makerLogout.clickLogoutSymbol()
		.clickSignOut();

}
}

package testcases;

import org.testng.annotations.Test;

import base.SiasProjectSpecificMethods;
import pages.SiasLoginPageMaker;
import pages.SiasLogoutPage;

public class SiasStagingTestcase extends SiasProjectSpecificMethods{

	@Test
	public void runStaging() throws InterruptedException {
		SiasLoginPageMaker login = new SiasLoginPageMaker();
		login.enterMakerUserId()
		.enterMakerPassword()
		.clickMakerSignInButton()
		.clickWarehouseRefreshLink()
		.clickStagingLink()
		.enterstageExecutionDate()
		.selectStageBranch()
		.clickStageSubmitButton();
		
	SiasLogoutPage makerLogout = new SiasLogoutPage();
		makerLogout.clickLogoutSymbol()
		.clickSignOut();
	}
}

package testcases;

import org.testng.annotations.Test;

import base.SiasProjectSpecificMethods;
import pages.SiasLoginPageMaker;
import pages.SiasLogoutPage;

public class SiasMappingNonOracleTestCase extends SiasProjectSpecificMethods{

	@Test
	public void runMappingNonOracle()
			throws InterruptedException {
		
		SiasLoginPageMaker login = new SiasLoginPageMaker();
		login.enterMakerUserId()
		.enterMakerPassword()
		.clickMakerSignInButton()
		.clickExternalSystemLink()
		.clickMappingNonOracleLink()
		.selectExternalSystemLink()
		.clickQueryButton()
		.enterSourceTable()
		.enterDestinationTable()
		.selectEnabledDisabledFlag()
		.clickSubmitButton();
		SiasLogoutPage makerLogout = new SiasLogoutPage();
		makerLogout.clickLogoutSymbol()
		.clickSignOut();
	}
}

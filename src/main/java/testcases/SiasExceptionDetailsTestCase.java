package testcases;

import org.testng.annotations.Test;
import base.SiasProjectSpecificMethods;
import pages.SiasLoginPageMaker;
import pages.SiasLogoutPage;


public class SiasExceptionDetailsTestCase extends SiasProjectSpecificMethods{
	
	@Test
	public void runExceptionDetails()
			throws InterruptedException {
		SiasLoginPageMaker login = new SiasLoginPageMaker();
		login.enterMakerUserId()
		.enterMakerPassword()
		.clickMakerSignInButton()
		.clickWarehouseRefreshLink()
		.clickWarehouseExceptioDetailsLink()
		.selectprocess()
		.selectDate()
		.clickExceptionDetailsSubmitButton();
		SiasLogoutPage makerLogout = new SiasLogoutPage();
		makerLogout.clickLogoutSymbol()
		.clickSignOut();
	}

}

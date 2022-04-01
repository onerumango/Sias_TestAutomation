package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.SiasProjectSpecificMethods;
import pages.SiasLoginPageMaker;
import pages.SiasLogoutPage;

public class SiasExcelProcessingSummaryTestCase extends SiasProjectSpecificMethods{
	
	@Test
	public void runExcelProcessingSummary() throws InterruptedException, IOException {
	SiasLoginPageMaker login = new SiasLoginPageMaker();
	login.enterMakerUserId()
	.enterMakerPassword()
	.clickMakerSignInButton()
	.clickFileUploadLink()
	.clickExcelProcessigSummaryLink()
	.selectExcelProcessingReportName()
	.selectExcelProcessingSection()
	.enterExcelProcessingExecutionDate()
	.clickExcelProcessingQueryButton();
	SiasLogoutPage makerLogout = new SiasLogoutPage();
	makerLogout.clickLogoutSymbol()
	.clickSignOut();
	
	}
}

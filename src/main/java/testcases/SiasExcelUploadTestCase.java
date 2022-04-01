package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.SiasProjectSpecificMethods;
import pages.SiasLoginPageMaker;
import pages.SiasLogoutPage;

public class SiasExcelUploadTestCase extends SiasProjectSpecificMethods{

	@Test
	public void runExcelUpload() throws InterruptedException, IOException {
		
		SiasLoginPageMaker login = new SiasLoginPageMaker();
		login.enterMakerUserId()
		.enterMakerPassword()
		.clickMakerSignInButton()
		.clickFileUploadLink()
		.clickExcelUploadLink()
		.selectExcelUploadReportName()
		.selectExcelUploadSectionName()
		.enterExcelUploadExecutionDate()
		.clickExcelUploadDownloadTemplateButton()
		.clickExcelUploadChooseFileButton()
		.clickExcelUploadButton();
		SiasLogoutPage makerLogout = new SiasLogoutPage();
		makerLogout.clickLogoutSymbol()
		.clickSignOut();
	}
}

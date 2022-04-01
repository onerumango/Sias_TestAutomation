package testcases;

import org.testng.annotations.Test;

import base.SiasProjectSpecificMethods;
import pages.SiasLoginPageMaker;
import pages.SiasLogoutPage;

public class SiasExcelMappingTestCase extends SiasProjectSpecificMethods {

	@Test
	public void runExcelMapping() throws InterruptedException {

		SiasLoginPageMaker login = new SiasLoginPageMaker();
		login.enterMakerUserId().enterMakerPassword().clickMakerSignInButton().clickFileUploadLink()
				.clickExcelMappingLink().selectNewExcelMappingReportName().selectNewExcelMappingSection()
				.clickNewExcelMappingHeaderCheck().enterNewExcelMappingDataRow().clickNewExcelMappingAddButton()
				.enterNewExcelMappingName1().enterNewExcelMappingDatatype1().clickNewExcelMappingMandatoryCheck1()
				.enterNewExcelMappingHeaderName1().enterNewExcelMappingMappingColumn1().clickNewExcelMappingAddButton()
				.enterNewExcelMappingName2().enterNewExcelMappingDatatype2().clickNewExcelMappingMandatoryCheck2()
				.enterNewExcelMappingHeaderName2().enterNewExcelMappingMappingColumn2()
				.clickNewExcelMappingSubmitButton();

		SiasLogoutPage makerLogout = new SiasLogoutPage();
		makerLogout.clickLogoutSymbol().clickSignOut().enterAuthorUserId().enterAuthorPassword()
				.clickAuthorSignInButton().clickFileUploadLink().clickExcelMappingLink()
				.clickExcelMappingAutoQueryButton().selectAutoQueryExcelMappingReportName()
				.selectAutoQueryExcelMappingSection().clickAutoQueryFetchButton().clickAutoQueryAuthButton();
		SiasLogoutPage authorLogout = new SiasLogoutPage();
		authorLogout.clickLogoutSymbol().clickSignOut();
	}
}

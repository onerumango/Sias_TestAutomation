package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.SiasProjectSpecificMethods;
import pages.SiasCapturerLoginPage;
import pages.SiasDashboardPage;
import pages.SiasLogoutPage;
import pages.SiasReviewer1LoginPage;
import pages.SiasReviewer2LoginPage;
import pages.SiasReviewer3LoginPage;

public class SiasWorkFlowTestCase extends SiasProjectSpecificMethods {

	@Test
	public void runWorkflow() throws InterruptedException, IOException {

		SiasCapturerLoginPage login = new SiasCapturerLoginPage();
		login.enterCapturerUserId().enterCapturerPassword().clickMakerSignInButton().clickReportMenuLink()
				.clickReportSubMenuLink().clickReportLink().selectBusinessDate().clickQueryButton().clickSaveButton()
				.clickGenerateButton().clickSendForApprovalButton().enterTextForSendingApproval().selectFileToUpload()
				.clickSendButton();

		SiasLogoutPage makerLogout = new SiasLogoutPage();
		makerLogout.clickLogoutSymbol().clickSignOut();

		SiasReviewer1LoginPage reviewer1 = new SiasReviewer1LoginPage();
		reviewer1.enterReviewer1UserId().enterReviewer1Password().clickReviewer1SignInButton().clickActivitiesLink()
				.clickQueueDetailsLink().selectQueueDetailsStatus().clickFetchButton().clickDownloadButton()
				.clickReportButton().enterTextForReviewerApproval().clickApproveButton();

		SiasLogoutPage rev1Logout = new SiasLogoutPage();
		rev1Logout.clickLogoutSymbol().clickSignOut();

		SiasReviewer2LoginPage reviewer2 = new SiasReviewer2LoginPage();
		reviewer2.enterReviwer2UserId().enterMakerPassword().clickMakerSignInButton().clickViewIcon()
				.selectQueueDetailsStatus().clickFetchButton().clickReportButton().enterTextForReviewerApproval()
				.clickApproveButton();
		
		SiasDashboardPage dashboard = new SiasDashboardPage();
		dashboard.clickDahboardMenuIcon().clickQueueStatusLink().selectQueueStatusReportName()
				.selectQueueStatusReportDate().clickQueueStatusSubmitButton();
		
		rev1Logout.clickLogoutSymbol()
		.clickSignOut();

	}
}

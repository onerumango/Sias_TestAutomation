package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.SiasProjectSpecificMethods;

public class SiasReviewerAuthorizationPage extends SiasProjectSpecificMethods{

	public SiasReviewerAuthorizationPage enterTextForReviewerApproval() throws InterruptedException {
		WebElement approvalText = locateElement("xpath", props.getProperty("SiasReviewerAuthorizationPage.TextForReviewerApproval.XPath"));
		jsExecutor(approvalText);
		enterValue(approvalText, "Approving");
		wait(3000);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		return this;
		}
	public SiasReviewerPage clickApproveButton() throws InterruptedException {
		WebElement approve = locateElement("xpath", props.getProperty("SiasReviewerAuthorizationPage.ApproveButton.XPath"));
		jsExecutor(approve);
		clickElement(approve);
		wait(8000);
		return new SiasReviewerPage();
		}
	
}

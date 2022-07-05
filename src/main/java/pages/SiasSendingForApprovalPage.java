package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.SiasProjectSpecificMethods;

public class SiasSendingForApprovalPage extends SiasProjectSpecificMethods{

	public SiasSendingForApprovalPage enterTextForSendingApproval() {
		enterValue(locateElement("xpath", props.getProperty("SiasSendingForApprovalPage.TextForSendingApproval.XPath")), "Sending Report for Approval");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		return this;
		}
	
	public SiasSendingForApprovalPage selectFileToUpload() throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		Actions action = new Actions(driver);	
		WebElement chooseFile = locateElement("xpath", props.getProperty("SiasSendingForApprovalPage.FileToUpload.XPath"));
		jsExecutor(chooseFile);
		action.moveToElement(chooseFile).perform();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		enterValue(chooseFile, "C:\\Selenium workspace\\SIASAutomation\\downloads\\RSDNTCSH10M2022-01-28.xlsx");
		return this;
		}
	
	public SiasReportPage clickSendButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasSendingForApprovalPage.SendButton.XPath")));
		wait(7000);
		return new SiasReportPage();
		}
}

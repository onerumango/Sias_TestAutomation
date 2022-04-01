package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.SiasProjectSpecificMethods;

public class SiasExcelUploadPage extends SiasProjectSpecificMethods {

	public SiasExcelUploadPage selectExcelUploadReportName() throws InterruptedException {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("SiasExcelUploadPage.SelectExcelUploadReportName.XPath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("SiasExcelUploadPage.ExcelUploadReportName.XPath")));
		wait(2000);
		return this;
	}
	
	public SiasExcelUploadPage selectExcelUploadSectionName() throws InterruptedException {
		enterValue(locateElement("xpath", props.getProperty("SiasExcelUploadPage.SelectExcelUploadSectionName.XPath")), props.getProperty("SiasExcelUploadPage.SectionName"));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("SiasExcelUploadPage.ExcelUploadSectionName.XPath")));
		return this;

	}
	
	public SiasExcelUploadPage enterExcelUploadExecutionDate() throws InterruptedException {
		enterValue(locateElement("xpath", props.getProperty("SiasExcelUploadPage.ExcelUploadExecutionDate.XPath")), props.getProperty("SiasExcelUploadPage.ExecutionDate"));
		return this;

	}
	
	public SiasExcelUploadPage clickExcelUploadDownloadTemplateButton() throws InterruptedException, IOException {
		clickElement(locateElement("xpath", props.getProperty("SiasExcelUploadPage.ExcelUploadDownloadTemplateButton.XPath")));
		wait(3000);
		FileInputStream fis = new FileInputStream(props.getProperty("SiasExcelUploadPage.DownloadPath"));
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(props.getProperty(props.getProperty("SiasExcelUploadPage.SectionName")));
		Row row = sheet.createRow(1);
		Cell cell = row.createCell(0);
		cell.setCellValue(props.getProperty("SiasExcelUploadPage.AccountName1"));
		cell = row.createCell(1);
		cell.setCellValue(props.getProperty("SiasExcelUploadPage.AccountNumber1"));
		row = sheet.createRow(2);
		cell = row.createCell(0);
		cell.setCellValue(props.getProperty("SiasExcelUploadPage.AccountName2"));
		cell = row.createCell(1);
		cell.setCellValue(props.getProperty("SiasExcelUploadPage.AccountNumber2"));
		FileOutputStream fos = new FileOutputStream(props.getProperty("SiasExcelUploadPage.DownloadPath"));
		workbook.write(fos);
		fos.close();
		System.out.println("END OF WRITING DATA IN EXCEL");
		return this;
	}
	
	public SiasExcelUploadPage clickExcelUploadChooseFileButton() throws InterruptedException {

		Actions action = new Actions(driver);	
		WebElement chooseFile = locateElement("xpath", props.getProperty("SiasExcelUploadPage.ExcelUploadChooseFileButton.XPath"));
		action.moveToElement(chooseFile).perform();
		wait(3000);
		enterValue(chooseFile, props.getProperty("SiasExcelUploadPage.DownloadPath"));
		return this;
	}
	
	public SiasExcelUploadPage clickExcelUploadButton() throws InterruptedException {
		clickElement(locateElement("xpath", props.getProperty("SiasExcelUploadPage.ExcelUploadButton.XPath")));
		wait(10000);
		return this;
	}
}

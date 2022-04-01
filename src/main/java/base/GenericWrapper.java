package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericWrapper {
	public static RemoteWebDriver driver;

	public void lanuchBrowser(String browser, String url) {

		try {
			ChromeOptions options = new ChromeOptions();
			HashMap<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("download.default_directory", "C:\\Selenium workspace\\SIASAutomation\\downloads");
			options.setExperimentalOption("prefs", prefs);
			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(options);
			}
			if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
			driver.get(url);
			webDriverWait("Sias2 App");
			wait(8000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public WebElement locateElement(String locator, String locatorValue) {
		switch (locator) {
		case "id":
			return driver.findElementById(locatorValue);
		case "xpath":
			return driver.findElementByXPath(locatorValue);
		case "class":
			return driver.findElementByClassName(locatorValue);
		case "linktext":
			return driver.findElementByLinkText(locatorValue);
		case "name":
			return driver.findElementByName(locatorValue);
		case "partialtext":
			return driver.findElementByPartialLinkText(locatorValue);
		case "cssselector":
			return driver.findElementByCssSelector(locatorValue);
		case "tagname":
			return driver.findElementByTagName(locatorValue);
		}
		return null;
	}

	public void enterValue(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void clickElement(WebElement ele) {
		try {
			ele.click();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void clearElement(WebElement ele) {
		try {
			ele.clear();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void wait(int mSec) {
		try {
			Thread.sleep(mSec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String webDriverWait(String str) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(4));
		wait.until(ExpectedConditions.titleContains(str));
		return str;
	}

	public void jsExecutor(WebElement ele) {
		try {
			wait(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			wait(3000);
			js.executeScript("arguments[0].scrollIntoView(true);", ele);
			wait(3000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

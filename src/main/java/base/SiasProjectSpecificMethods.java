package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SiasProjectSpecificMethods extends GenericWrapper{

	public static Properties props;

	@BeforeMethod
	public void launchApplication() throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./src/main/resources/siasmaker.properties");
		props = new Properties();
		props.load(fis);
		lanuchBrowser("chrome", props.getProperty("SIAS_URL"));
	}

	@AfterMethod
	public void closeBrowser() {

		driver.close();

	}

}

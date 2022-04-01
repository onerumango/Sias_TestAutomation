package pages;

import java.util.concurrent.TimeUnit;

import base.SiasProjectSpecificMethods;

public class SiasCapturerLoginPage extends SiasProjectSpecificMethods{

	public SiasCapturerLoginPage enterCapturerUserId()  {
		wait(7000);
		enterValue(locateElement("xpath", props.getProperty("SiasCapturerLoginPage.CapturerUserId.XPath")), props.getProperty("capturerusername"));
		return this;
	}
	
	public SiasLoginPageMaker enterCapturerPassword()  {
		enterValue(locateElement("xpath", props.getProperty("SiasCapturerLoginPage.CapturerPassword.XPath")), props.getProperty("capturerpassword"));
		return new SiasLoginPageMaker();
	}
}

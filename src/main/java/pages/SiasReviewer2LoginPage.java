package pages;

import base.SiasProjectSpecificMethods;

public class SiasReviewer2LoginPage extends SiasProjectSpecificMethods{

	public SiasLoginPageMaker enterReviwer2UserId() throws InterruptedException  {
		wait(7000);
		enterValue(locateElement("xpath", props.getProperty("SiasReviewer2LoginPage.Reviwer2UserId.XPath")), props.getProperty("reviewer2username"));
		return new SiasLoginPageMaker();
	}
}

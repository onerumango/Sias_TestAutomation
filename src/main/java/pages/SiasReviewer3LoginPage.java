package pages;

import base.SiasProjectSpecificMethods;

public class SiasReviewer3LoginPage extends SiasProjectSpecificMethods{

	public SiasLoginPageMaker enterReviwer3UserId()  {
		enterValue(locateElement("xpath", props.getProperty("SiasReviewer3LoginPage.Reviwer3UserId.XPath")), props.getProperty("reviewer3username"));
		return new SiasLoginPageMaker();
	}
}

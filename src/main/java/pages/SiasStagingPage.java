package pages;

import java.util.concurrent.TimeUnit;

import base.SiasProjectSpecificMethods;

public class SiasStagingPage extends SiasProjectSpecificMethods{

	public SiasStagingPage enterstageExecutionDate() {
		enterValue(locateElement("xpath", props.getProperty("SiasStagingPage.StageExecutionDate.XPath")), "6/18/2021");
		return this;
	}
		public SiasStagingPage selectStageBranch() {
			clickElement(locateElement("xpath", props.getProperty("SiasStagingPage.SelectStageBranch.XPath")));
				clickElement(locateElement("xpath", props.getProperty("SiasStagingPage.StageBranch.XPath")));
				return this;
		}
		public SiasStagingPage clickStageSubmitButton() {
			clickElement(locateElement("xpath", props.getProperty("SiasStagingPage.StageSubmitButton.XPath")));
			wait(8000);
			return this;
		}
}

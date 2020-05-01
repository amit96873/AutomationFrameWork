package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ClameRewardsHelpPage extends BaseTest {

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='How to claim reward?' and @index='0']") private MobileElement helpclaimrewardpagetitle;
	@AndroidFindBy (id = "in.rebase.app:id/negative_button") private MobileElement okbtn;


	public String getClaimRewardsPageTitle() {
		String title = getText(helpclaimrewardpagetitle, "Help Claim Reward Page Title Text");
		return title;
	}

	public SmartCoinRewardsPage pressOkButton() {

		click(okbtn,"Press On Ok Button");
		return new SmartCoinRewardsPage();
	}

}

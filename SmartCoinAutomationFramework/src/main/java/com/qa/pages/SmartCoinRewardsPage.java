package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SmartCoinRewardsPage extends BaseTest{

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Smartcoin Rewards' and @index='0']") private MobileElement coinrewardpagetitle;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;
	@AndroidFindBy (id = "in.rebase.app:id/card_button") private MobileElement claimbtn;

	public String getCoinRewardsPageTitle() {
		String title = getText(coinrewardpagetitle, "SmartCoin Reward Page title text is:- ");
		return title;
	}


	public ClameRewardsHelpPage pressClaimRewardButton() {

		click(claimbtn,"press on clame button");
		return new ClameRewardsHelpPage();
	}
	public ChatPage pressChatButton() {

		click(chatbtn,"press on chat button");
		return new ChatPage();
	}
	public HomePageSmartCoin pressReverseButton() {

		click(reversebtn,"press on reverse button");
		return new HomePageSmartCoin();
	}

}

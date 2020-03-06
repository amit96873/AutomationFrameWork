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
		return getAttribute(coinrewardpagetitle, "text");
	}
	
	
	public ClameRewardsHelpPage pressClaimRewardButton() {
		
		click(claimbtn);
		return new ClameRewardsHelpPage();
	}
public ChatPage pressChatButton() {
		
		click(chatbtn);
		return new ChatPage();
	}
public HomePageSmartCoin pressReverseButton() {
	
	click(reversebtn);
	return new HomePageSmartCoin();
}

}

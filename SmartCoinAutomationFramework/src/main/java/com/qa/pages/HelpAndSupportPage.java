package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HelpAndSupportPage extends BaseTest{
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='EMAIL US' and @index='0']") private MobileElement helpandsupportpagetitletext;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement emailbtn;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement mobilenumberbtn;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement chatbtn;




	public String getHelpAndSupportPageTitle() {
		return getAttribute(helpandsupportpagetitletext, "text");
	}


	public HomePageSmartCoin pressReverseBtn() {
		click(reversebtn);

		return new HomePageSmartCoin();
	}


	public ChatPage pressChatBtn() {
click(chatbtn);
		return new ChatPage();
	}

	public EmailPage pressEmailText() {
		click(emailbtn);
		return new EmailPage();


	}
	public CallPage pressNumberText() {
		click(mobilenumberbtn);
		return new CallPage();


	}




}

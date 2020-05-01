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
		String title = getText(helpandsupportpagetitletext, "Help And Support Page Title Text is:- ");
		return title;
	}


	public HomePageSmartCoin pressReverseBtn() {
		click(reversebtn, "Press On reverse Button");
		return new HomePageSmartCoin();
	}


	public ChatPage pressChatBtn() {
		click(chatbtn,"Press On chat Short Cut Button");
		return new ChatPage();
	}

	public EmailPage pressEmailText() {
		click(emailbtn,"Press On Email Button");
		return new EmailPage();


	}
	public CallPage pressNumberText() {
		click(mobilenumberbtn,"Press On Mobile Number Button");
		return new CallPage();


	}




}

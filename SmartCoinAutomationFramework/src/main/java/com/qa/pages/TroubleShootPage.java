package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TroubleShootPage extends BaseTest {

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Troubleshoot' and @index='0']") private MobileElement troubleshoottitletext;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement troubleshootnowbtn;





	public String getTroubleshootPageTitle() {
		String title = getText(troubleshoottitletext, "Troubleshoot page title text is:- ");
		return title;
	}

	public HomePageSmartCoin pressReverseBtn() {

		click(reversebtn,"press reverse button");
		return new HomePageSmartCoin();
	}


	public ChatPage pressChatPageShortCutBtn() {

		click(chatbtn,"press chat shortcut button");
		return new ChatPage();
	}
	public TroubleShootPage pressTroubleShootNowBtn() {

		click(troubleshootnowbtn,"press troubleshootnow button");
		return this;
	}
}

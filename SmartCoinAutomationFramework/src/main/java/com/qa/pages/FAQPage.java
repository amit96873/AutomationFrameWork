package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FAQPage extends BaseTest {
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='FAQ' and @index='0']") private MobileElement faqtitletext;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;
	
	public String getFAQPageTitle() {
		return getAttribute(faqtitletext, "text");
	}
public HomePageSmartCoin pressReverseBtn() {
		
		click(reversebtn);
		return new HomePageSmartCoin();
	}

public ChatPage pressChatShortCutBtn() {
	
	click(chatbtn);
	return new ChatPage();
}

}

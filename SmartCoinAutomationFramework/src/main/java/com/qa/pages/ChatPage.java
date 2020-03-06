package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ChatPage extends BaseTest{


	@AndroidFindBy (id = "in.rebase.app:id/chat_sdk_btn_chat_send_message") private MobileElement messagesendbtn;
	@AndroidFindBy (id = "in.rebase.app:id/chat_sdk_et_message_to_send") private MobileElement messageedittext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='SmartCoin Customer Support' and @index='1']") private MobileElement chatpagetitletext;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@content-desc='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@content-desc='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Message option button' and @index='0']") private MobileElement messaageoptionbutton;




	public String getTitlechatPageTitle() {
		return getAttribute(chatpagetitletext, "text");
	}

	public ChatPage enterChatMessage(String message) {
		click(messageedittext);
		clear(messageedittext);
		System.out.println("Message is:-  " + message);
		sendkeys(messageedittext, message);
		return this;

	}

	public ChatPage pressSendMessageBtn() {
		click(messagesendbtn);
		return this;
	}
	public ChatActionPage pressChatmenueBtn() {
		click(messaageoptionbutton);
		return new ChatActionPage();
	}
	public HomePageSmartCoin pressReverseBtn() {
		click(reversebtn);
		return new HomePageSmartCoin();
	}
}

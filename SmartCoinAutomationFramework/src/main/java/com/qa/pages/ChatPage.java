package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ChatPage extends BaseTest{

	TestUtils utils = new TestUtils();
	@AndroidFindBy (id = "in.rebase.app:id/chat_sdk_btn_chat_send_message") private MobileElement messagesendbtn;
	@AndroidFindBy (id = "in.rebase.app:id/chat_sdk_et_message_to_send") private MobileElement messageedittext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='SmartCoin Customer Support' and @index='1']") private MobileElement chatpagetitletext;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@content-desc='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@content-desc='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Message option button' and @index='0']") private MobileElement messaageoptionbutton;




	public String getTitlechatPageTitle() {
		String title = getText(chatpagetitletext, "Chat Page Title Text Is:- ");
		return title;
	}

	public ChatPage enterChatMessage(String message) {
		click(messageedittext,"Click On Enter Chat Message");
		clear(messageedittext);
		//		utils.log().info("Message is:-  " + message);
		sendKeys(messageedittext, message,"Chat Message is:-  " + message);
		return this;

	}

	public ChatPage pressSendMessageBtn() {
		click(messagesendbtn,"Press On Send Message Button");
		return this;
	}
	public ChatActionPage pressChatmenueBtn() {
		click(messaageoptionbutton,"Press On Chat Menu Button");
		return new ChatActionPage();
	}
	public HomePageSmartCoin pressReverseBtn() {
		click(reversebtn,"Press On Reverse Button");
		return new HomePageSmartCoin();
	}
}

package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyKhataEnterAccountNamePersionalPage extends BaseTest {
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Enter Account Name' and @index='0']") private MobileElement enteraccountnametitletext;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement continuebtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Enter Name for Khata' and @index='2']") private MobileElement khatanameedittextview;
	
	
	public String getEnterAccountNamePersionalPageTitle() {
		return getAttribute(enteraccountnametitletext, "text");
	}
	public ChatPage pressChatShortCutBtn() {
		click(chatbtn);
		return new ChatPage();
	}
	public MyKhataPage pressReverseBtn() {
		click(reversebtn);
		return new MyKhataPage();
	}
	public MyKhataEnterAccountNamePersionalPage enterPersionalKhataName(String khataname) {
		click(khatanameedittextview);
		clear(khatanameedittextview);
		System.out.println("Enter khata Name is:-  " + khataname);
		sendkeys(khatanameedittextview, khataname);
		return this;

	}
	public CreatedKhataPage pressContinueBtn() {
		click(continuebtn);
		return new CreatedKhataPage();
		
	}
}

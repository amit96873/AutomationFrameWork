package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyKhataEnterAccountNameBusinessPage extends BaseTest{
	
	TestUtils utils = new TestUtils();
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Enter Account Name' and @index='0']") private MobileElement enteraccountnametitletext;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement continuebtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Enter Name for Khata' and @index='2']") private MobileElement khatanameedittextview;
	@AndroidFindBy (id = "in.rebase.app:id/account_book_business_name") private MobileElement businnessnameedittext;
	
	public String getEnterAccountNameBusinessPageTitle() {
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
	
	public MyKhataEnterAccountNameBusinessPage enterBusinessKhataName(String khataname) {
		click(khatanameedittextview);
		clear(khatanameedittextview);
		utils.log().info("Enter khata Name is:-  " + khataname);
		sendkeys(khatanameedittextview, khataname);
		return this;

	}
	public MyKhataEnterAccountNameBusinessPage enterBusinessName(String businessname) {
		click(businnessnameedittext);
		clear(businnessnameedittext);
		utils.log().info("Enter Business Name is:-  " + businessname);
		sendkeys(businnessnameedittext, businessname);
		return this;

	}
	public CreatedKhataPage pressContinueBtn() {
		click(continuebtn);
		return new CreatedKhataPage();
		
	}
	

}

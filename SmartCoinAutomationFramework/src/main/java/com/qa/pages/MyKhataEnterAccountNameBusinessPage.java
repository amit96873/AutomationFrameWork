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
		String title = getText(enteraccountnametitletext, "My Khata Enter Account Name Business Page Title Tet is:- ");
		return title;
	}
	public ChatPage pressChatShortCutBtn() {
		click(chatbtn,"press on chat button");
		return new ChatPage();
	}
	public MyKhataPage pressReverseBtn() {
		click(reversebtn,"press on reverse button");
		return new MyKhataPage();
	}

	public MyKhataEnterAccountNameBusinessPage enterBusinessKhataName(String khataname) {
		click(khatanameedittextview,"press on khata name edit text");
		clear(khatanameedittextview);
		//		utils.log().info("Enter khata Name is:-  " + khataname);
		sendKeys(khatanameedittextview, khataname,"Enter khata Name is:-  " + khataname);
		return this;

	}
	public MyKhataEnterAccountNameBusinessPage enterBusinessName(String businessname) {
		click(businnessnameedittext,"press on business name edit text");
		clear(businnessnameedittext);
		//		utils.log().info("Enter Business Name is:-  " + businessname);
		sendKeys(businnessnameedittext, businessname,"Enter Business Name is:-  " + businessname);
		return this;

	}
	public CreatedKhataPage pressContinueBtn() {
		click(continuebtn,"press on continue button");
		return new CreatedKhataPage();

	}


}

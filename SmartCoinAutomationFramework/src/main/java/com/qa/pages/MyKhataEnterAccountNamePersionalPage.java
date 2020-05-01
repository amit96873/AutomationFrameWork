package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyKhataEnterAccountNamePersionalPage extends BaseTest {
	TestUtils utils = new TestUtils();
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Enter Account Name' and @index='0']") private MobileElement enteraccountnametitletext;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement continuebtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Enter Name for Khata' and @index='2']") private MobileElement khatanameedittextview;


	public String getEnterAccountNamePersionalPageTitle() {
		String title = getText(enteraccountnametitletext, "My Khata Page Title Tet is:- ");
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
	public MyKhataEnterAccountNamePersionalPage enterPersionalKhataName(String khataname) {
		click(khatanameedittextview,"press on khata name edit text");
		clear(khatanameedittextview);
		utils.log().info("Enter khata Name is:-  " + khataname);
		sendKeys(khatanameedittextview, khataname,"Enter khata Name is:-  " + khataname);
		return this;

	}
	public CreatedKhataPage pressContinueBtn() {
		click(continuebtn,"press on continue button");
		return new CreatedKhataPage();

	}
}

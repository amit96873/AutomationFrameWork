package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyKhataChooseTypeOfAccountPage extends BaseTest{


	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Choose type of Account' and @index='0']") private MobileElement choosetypeofaccounttletext;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;
	@AndroidFindBy (id = "in.rebase.app:id/personal_seconday_text") private MobileElement persionalbtn;
	@AndroidFindBy (id = "in.rebase.app:id/business_secondary_text") private MobileElement businessbtn;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement continuebtn;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;



	public String getChooseTypeOfAccountPageTitle() {
		String title = getText(choosetypeofaccounttletext, "Choose type of account Page title is:- ");
		return title;
	}
	public MyKhataChooseTypeOfAccountPage pressPersionalBtn() {
		click(persionalbtn,"press on persional button");
		return this;
	}
	public MyKhataChooseTypeOfAccountPage pressBusinessBtn() {
		click(businessbtn,"press on business button");
		return this;
	}
	public ChatPage pressChatShortCutBtn() {
		click(chatbtn,"press on chat shortcut button");
		return new ChatPage();
	}
	public MyKhataPage pressReverseBtn() {
		click(reversebtn,"press on reverse button");
		return new MyKhataPage();
	}
	public MyKhataEnterAccountNamePersionalPage pressPersionalContinueBtn() {
		click(continuebtn,"press on continue button for persional");
		return new MyKhataEnterAccountNamePersionalPage();
	}
	public MyKhataEnterAccountNameBusinessPage pressBusinessContinueBtn() {
		click(continuebtn,"press on continue button for business");
		return new MyKhataEnterAccountNameBusinessPage();
	}
}

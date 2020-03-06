package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreatedKhataMenuePage extends BaseTest{
	
	
	
	@AndroidFindBy (id = "in.rebase.app:id/add_manually") private MobileElement addmanuallybtn;
	@AndroidFindBy (id = "in.rebase.app:id/add") private MobileElement addfromcontactsbtn;
	@AndroidFindBy (id = "in.rebase.app:id/fab_expand_menu_button") private MobileElement backbtn;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;
	
	public CreatedMyKhataAddNewContactsPage pressAddContactsManuallyBtn() {
		click(addmanuallybtn);
		return new CreatedMyKhataAddNewContactsPage();
	}
	public ChatPage pressChatShortCutBtn() {
		click(chatbtn);
		return new ChatPage();
	}
	public MyKhataPage pressReverseBtn() {
		click(reversebtn);
		return new MyKhataPage();
	}
	public MyKhataPage pressBackBtn() {
		click(backbtn);
		return new MyKhataPage();
	}
	public MobileContactsPage pressAddFromContactBtn() {
		click(addfromcontactsbtn);
		return new MobileContactsPage();
	}
}

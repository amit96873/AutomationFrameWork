package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreatedKhataPage extends BaseTest{

	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;
	@AndroidFindBy (id = "in.rebase.app:id/new_contact_add_button") private MobileElement addbtn;
	@AndroidFindBy (id = "in.rebase.app:id/fab_expand_menu_button") private MobileElement expendmenuebtn;

	public ChatPage pressChatShortCutBtn() {
		click(chatbtn,"Press On Chat Short Cut Button");
		return new ChatPage();
	}
	public MyKhataPage pressReverseBtn() {
		click(reversebtn,"Press On Reverse Button");
		return new MyKhataPage();
	}

	public CreatedMyKhataAddNewContactsPage pressAddNewContactBtn() {
		click(addbtn,"Press On Add Button");
		return new CreatedMyKhataAddNewContactsPage();
	}
	public CreatedKhataMenuePage pressExpendMenueBtn() {
		click(expendmenuebtn,"Press On Expend Menu Button");
		return new CreatedKhataMenuePage();
	}
}

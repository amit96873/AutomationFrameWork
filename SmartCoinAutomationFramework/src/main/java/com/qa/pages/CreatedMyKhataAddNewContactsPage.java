package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreatedMyKhataAddNewContactsPage extends BaseTest {


	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Add New Contact' and @index='0']") private MobileElement addnewcontactspagetitle;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Add Name (Required)' and @index='2']") private MobileElement nameedittext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Add Phone Number (Optional)' and @index='2']") private MobileElement numberedittext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Enter Email Address (Optional)' and @index='2']") private MobileElement emailedittext;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement continuebtn;


	public String getAddNewContactsPageTitle() {
		return getAttribute(addnewcontactspagetitle, "text");
	}
	public CreatedMyKhataAddNewContactsPage enterKhataName(String khataname) {
		click(nameedittext);
		clear(nameedittext);
		System.out.println("Enter khata Name is:-  " + khataname);
		sendkeys(nameedittext, khataname);
		return this;

	}
	public CreatedMyKhataAddNewContactsPage enterKhataNumber(String khatanumber) {
		click(numberedittext);
		clear(numberedittext);
		System.out.println("Enter khata Name is:-  " + khatanumber);
		sendkeys(numberedittext, khatanumber);
		return this;

	}
	public CreatedMyKhataAddNewContactsPage enterKhataEmailId(String khataemailid) {
		click(emailedittext);
		clear(emailedittext);
		System.out.println("Enter khata Name is:-  " + khataemailid);
		sendkeys(emailedittext, khataemailid);
		return this;

	}
	public ChatPage pressChatShortCutBtn() {
		click(chatbtn);
		return new ChatPage();
	}
	public CreatedKhataPage pressReverseBtn() {
		click(reversebtn);
		return new CreatedKhataPage();
	}
	public CreatedKhataPage pressContinueBtn() {
		click(continuebtn);
		return new CreatedKhataPage();
	}
}

package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreatedMyKhataAddNewContactsPage extends BaseTest {

	TestUtils utils = new TestUtils();
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Add New Contact' and @index='0']") private MobileElement addnewcontactspagetitle;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Add Name (Required)' and @index='2']") private MobileElement nameedittext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Add Phone Number (Optional)' and @index='2']") private MobileElement numberedittext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Enter Email Address (Optional)' and @index='2']") private MobileElement emailedittext;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement continuebtn;


	public String getAddNewContactsPageTitle() {
		String title = getAttribute(addnewcontactspagetitle, "text");
		return title;
	}
	public CreatedMyKhataAddNewContactsPage enterKhataName(String khataname) {
		click(nameedittext,"Click On Enter Name Edit Text");
		clear(nameedittext);
		//		utils.log().info("Enter khata Name is:-  " + khataname);
		sendKeys(nameedittext, khataname,"Enter khata Name is:-  " + khataname);
		return this;

	}
	public CreatedMyKhataAddNewContactsPage enterKhataNumber(String khatanumber) {
		click(numberedittext,"Press On Number Edit Text");
		clear(numberedittext);
		//		utils.log().info("Enter khata Name is:-  " + khatanumber);
		sendKeys(numberedittext, khatanumber,"Enter khata Name is:-  " + khatanumber);
		return this;

	}
	public CreatedMyKhataAddNewContactsPage enterKhataEmailId(String khataemailid) {
		click(emailedittext,"Press On Email_Id Edit text");
		clear(emailedittext);
		//		utils.log().info("Enter khata Email_ID is:-  " + khataemailid);
		sendKeys(emailedittext, khataemailid,"Enter khata Email_ID is:-  " + khataemailid);
		return this;

	}
	public ChatPage pressChatShortCutBtn() {
		click(chatbtn,"Press On Chat Short Cut Button");
		return new ChatPage();
	}
	public CreatedKhataPage pressReverseBtn() {
		click(reversebtn,"Press On Reverse Button");
		return new CreatedKhataPage();
	}
	public CreatedKhataPage pressContinueBtn() {
		click(continuebtn,"Press On Continue Button");
		return new CreatedKhataPage();
	}
}

package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyKhataUserWillPayWillGetPage extends BaseTest {

	TestUtils utils = new TestUtils();
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@content-desc='Open' and @index='0']") private MobileElement menubtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Starting balance' and @index='2']") private MobileElement startingbalancetext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Add a Note (Optional)' and @index='2']") private MobileElement noteeditrtext;
	@AndroidFindBy (id = "in.rebase.app:id/debit") private MobileElement userwillpaybtn;
	@AndroidFindBy (id = "in.rebase.app:id/credit") private MobileElement userwillgetbtn;
	@AndroidFindBy (id = "in.rebase.app:id/date") private MobileElement datebtn;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement continuebtn;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;



	public MyKhataDatePage pressDateBtn() {
		click(datebtn,"press date button");
		return new MyKhataDatePage();
	}

	public CreatedKhataPage pressContinueBtn() {
		click(continuebtn,"press continue button");
		return new CreatedKhataPage();
	}

	public MyKhataUserWillPayWillGetPage pressUserWillPayBtn() {
		click(userwillpaybtn,"press user will pay button");
		return new MyKhataUserWillPayWillGetPage();
	}
	public MyKhataUserWillPayWillGetPage pressUserWillGetBtn() {
		click(userwillgetbtn,"press user will get button");
		return new MyKhataUserWillPayWillGetPage();
	}
	public MyKhataUserWillPayWillGetPage enterBalance(String balance) {
		click(startingbalancetext,"press starting balance edit text");
		clear(startingbalancetext);
		//		utils.log().info("Enter Balance is:-  " + balance);
		sendKeys(startingbalancetext, balance,"Enter Balance is:-  " + balance);
		return this;
	}

	public MyKhataUserWillPayWillGetPage enterNotes(String notes) {
		click(noteeditrtext, "press note edit tet");
		clear(noteeditrtext);
		//		utils.log().info("Enter Notes is:-  " + notes);
		sendKeys(noteeditrtext, notes,"Enter Notes is:-  " + notes);
		return this;
	}

	public ChatPage pressChatShortCutBtn() {
		click(chatbtn,"press on chat shortcut button");
		return new ChatPage();
	}
	public MenuPage pressMenuBtn() {
		click(menubtn,"press on menu button");
		return new MenuPage();
	}
}

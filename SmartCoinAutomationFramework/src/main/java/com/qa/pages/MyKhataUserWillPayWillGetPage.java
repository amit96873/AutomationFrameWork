package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyKhataUserWillPayWillGetPage extends BaseTest {

	@AndroidFindBy (xpath = "//android.widget.ImageButton[@content-desc='Open' and @index='0']") private MobileElement menubtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Starting balance' and @index='2']") private MobileElement startingbalancetext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Add a Note (Optional)' and @index='2']") private MobileElement noteeditrtext;
	@AndroidFindBy (id = "in.rebase.app:id/debit") private MobileElement userwillpaybtn;
	@AndroidFindBy (id = "in.rebase.app:id/credit") private MobileElement userwillgetbtn;
	@AndroidFindBy (id = "in.rebase.app:id/date") private MobileElement datebtn;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement continuebtn;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;



	public MyKhataDatePage pressDateBtn() {
		click(datebtn);
		return new MyKhataDatePage();
	}

	public CreatedKhataPage pressContinueBtn() {
		click(continuebtn);
		return new CreatedKhataPage();
	}

	public MyKhataUserWillPayWillGetPage pressUserWillPayBtn() {
		click(userwillpaybtn);
		return new MyKhataUserWillPayWillGetPage();
	}
	public MyKhataUserWillPayWillGetPage pressUserWillGetBtn() {
		click(userwillgetbtn);
		return new MyKhataUserWillPayWillGetPage();
	}
	public MyKhataUserWillPayWillGetPage enterBalance(String balance) {
		click(startingbalancetext);
		clear(startingbalancetext);
		System.out.println("Enter Balance is:-  " + balance);
		sendkeys(startingbalancetext, balance);
		return this;
	}

	public MyKhataUserWillPayWillGetPage enterNotes(String notes) {
		click(noteeditrtext);
		clear(noteeditrtext);
		System.out.println("Enter Notes is:-  " + notes);
		sendkeys(noteeditrtext, notes);
		return this;
	}

	public ChatPage pressChatShortCutBtn() {
		click(chatbtn);
		return new ChatPage();
	}
	public MenuPage pressMenuBtn() {
		click(menubtn);
		return new MenuPage();
	}
}

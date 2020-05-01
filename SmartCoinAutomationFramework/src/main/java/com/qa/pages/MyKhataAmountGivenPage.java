package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyKhataAmountGivenPage extends BaseTest{
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Amount Given' and @index='1']") private MobileElement amountgiventitletext;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;
	@AndroidFindBy (id = "in.rebase.app:id/date") private MobileElement datebtn;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement continuebtn;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Amount' and @index='2']") private MobileElement enteramount;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Add a Note (Optional)' and @index='2']") private MobileElement addnotetext;




	public String getMyKhataAmountGivenPageTitle() {
		String title = getText(amountgiventitletext, "My Khata Amount Given Page title text is:- ");
		return title;
	}

}

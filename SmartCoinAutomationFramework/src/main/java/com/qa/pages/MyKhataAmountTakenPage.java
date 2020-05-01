package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyKhataAmountTakenPage extends BaseTest {



	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Amount Taken' and @index='1']") private MobileElement amounttakentitletext;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;
	@AndroidFindBy (id = "in.rebase.app:id/date") private MobileElement datebtn;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement continuebtn;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Amount' and @index='2']") private MobileElement enteramount;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Add a Note (Optional)' and @index='2']") private MobileElement addnotetext;




	public String getMyKhataAmounttakenPageTitle() {
		String title = getText(amounttakentitletext, "My Khata Amount Taken Page Title is:- ");
		return title;
	}

}

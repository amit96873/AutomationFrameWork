package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyBankDetailsPage extends BaseTest{
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='My Bank Details' and @index='0']") private MobileElement mybankdetailspagetitletext;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;
	@AndroidFindBy (id = "in.rebase.app:id/add_bank_account") private MobileElement addbankaccountbtn;
	

	

	public String getMyBankDetailsPageTitle() {
		return getAttribute(mybankdetailspagetitletext, "text");
	}
}

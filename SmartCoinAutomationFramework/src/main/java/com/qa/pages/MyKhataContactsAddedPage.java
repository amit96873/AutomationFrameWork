package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyKhataContactsAddedPage extends BaseTest {
	
	@AndroidFindBy (id = "in.rebase.app:id/negative_button") private MobileElement dismissbtn;
	@AndroidFindBy (id = "in.rebase.app:id/positive_button") private MobileElement addbalancebtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Contact Added' and @index='1']") private MobileElement contactsaddedpagetitletext;
	
	
	public String getContactsAddedPageTitle() {
		return getAttribute(contactsaddedpagetitletext, "text");
	}
	
	
public MyKhataUserWillPayWillGetPage pressAddBalanceBtn() {
	click(addbalancebtn);
	return new MyKhataUserWillPayWillGetPage();
}
public CreatedKhataPage pressDismissBtn() {
	click(addbalancebtn);
	return new CreatedKhataPage();
}
}

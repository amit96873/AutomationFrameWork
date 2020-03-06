package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyKhataUsersPage extends BaseTest {
	
	
	
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;
	@AndroidFindBy (id = "in.rebase.app:id/creditButton") private MobileElement creditbtn;
	@AndroidFindBy (id = "in.rebase.app:id/debitButton") private MobileElement debitbtn;
	
	

}

package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ConnecationErrorPage extends BaseTest{
	
	@AndroidFindBy (id = "in.rebase.app:id/positive_button") private MobileElement trynowbtn;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Connection Error' and @index='1']") private MobileElement connectionerrorpagetitletext;
	

	

	public String getConnectionErrorPageTitle() {
		return getAttribute(connectionerrorpagetitletext, "text");
	}
}

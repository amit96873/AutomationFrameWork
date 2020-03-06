package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ChooseGmailAccountPage extends BaseTest {
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Choose an account' and @index='1']") private MobileElement choosegmailaccounttitletxt;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='spider96873@gmail.com' and @index='1']") private MobileElement clickongmail;
	
	
	
	
	public String getTitleChooseGmailAccount() {
		return getAttribute(choosegmailaccounttitletxt, "text");
	}
	
}

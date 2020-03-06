package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CallPage extends BaseTest{
	
	@AndroidFindBy (id = "com.google.android.dialer:id/dialpad_floating_action_button") private MobileElement callbtn;

}

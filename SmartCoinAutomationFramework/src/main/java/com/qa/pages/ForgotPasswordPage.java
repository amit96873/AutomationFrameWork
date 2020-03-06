package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ForgotPasswordPage extends BaseTest {

	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Forgot your Pin?' and @index='0']") private MobileElement forgotpasswordpagetitle;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='OK, LOGOUT' and @index='0']") private MobileElement oklogoutbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='CANCEL' and @index='0']") private MobileElement canclebtn;
	
	public String getTitleForgotPassword() {
		return getAttribute(forgotpasswordpagetitle, "text");
	}
	public EnterPasswordPage pressCancleBtn() {

		click(canclebtn);
		return new EnterPasswordPage();
	}
	public HomeMobileScreenPage pressOkLogOutBtn() {

		click(oklogoutbtn);
		return new HomeMobileScreenPage();
	}
	
}

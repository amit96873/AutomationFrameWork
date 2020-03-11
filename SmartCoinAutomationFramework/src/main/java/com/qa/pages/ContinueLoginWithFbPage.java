package com.qa.pages;

import com.qa.BaseTestForSigninSignUp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ContinueLoginWithFbPage extends BaseTestForSigninSignUp {
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Continue' and @index='0']") private MobileElement continueloginbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Cancel' and @index='1']") private MobileElement cancleloginbtn;
	@AndroidFindBy (xpath = "//android.view.View[@text='Log in with Facebook' and @index='1']") private MobileElement continueoginwithfacebooktitletxt;
	
	
	public String getTitleContinueloginWithFB() {
		return getAttribute(continueoginwithfacebooktitletxt, "text");
	}
	
	
	public CreatePasswordPage presscontinuebtn() {

		click(continueloginbtn);
		return new CreatePasswordPage();
	}
	
	public SignINWithGmailAndFacebookPage presscanclebtn() {

		click(cancleloginbtn);
		return new SignINWithGmailAndFacebookPage();
	}
	
	
}

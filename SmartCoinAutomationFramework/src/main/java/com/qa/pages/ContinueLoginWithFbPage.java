package com.qa.pages;

import com.qa.BaseTest;
import com.qa.BaseTestForSigninSignUp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ContinueLoginWithFbPage extends BaseTest {
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Continue' and @index='0']") private MobileElement continueloginbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Cancel' and @index='1']") private MobileElement cancleloginbtn;
	@AndroidFindBy (xpath = "//android.view.View[@text='Log in with Facebook' and @index='1']") private MobileElement continueoginwithfacebooktitletxt;


	public String getTitleContinueloginWithFB() {
		String title = getAttribute(continueoginwithfacebooktitletxt, "text");
		return title;
	}


	public CreatePasswordPage presscontinuebtn() {

		click(continueloginbtn,"Press On Continue LoginButton");
		return new CreatePasswordPage();
	}

	public SignINWithGmailAndFacebookPage presscanclebtn() {

		click(cancleloginbtn,"Press Cancel Login Button");
		return new SignINWithGmailAndFacebookPage();
	}


}

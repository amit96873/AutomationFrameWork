package com.qa.pages;

import com.qa.BaseTest;
import com.qa.BaseTestForSigninSignUp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignINWithGmailAndFacebookPage  extends BaseTest{



	@AndroidFindBy (id = "in.rebase.app:id/sign_in_google") private MobileElement signinwithgmailbtn;
	@AndroidFindBy (id = "in.rebase.app:id/fb_sign_in") private MobileElement signinwithfbbtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Sign in' and @index='0']") private MobileElement signinwithgmailFBtitletxt;


	public String getTitleSigninWithGmailFB() {
		String title = getText(signinwithgmailFBtitletxt, "Sign in With Gmail and Facebook page Title Text is:- ");
		return title;
	}
	public FacebookPage pressfacebookbtn() {

		click(signinwithfbbtn,"press on signin with fb button");
		return new FacebookPage();
	}
	public ChooseGmailAccountPage pressGmailBtn() {

		click(signinwithgmailbtn,"press on signin with gmail button");
		return new ChooseGmailAccountPage();
	}
}

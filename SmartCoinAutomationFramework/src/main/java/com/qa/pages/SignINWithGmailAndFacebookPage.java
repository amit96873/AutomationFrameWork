package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignINWithGmailAndFacebookPage  extends BaseTest{
	
	
	
	@AndroidFindBy (id = "in.rebase.app:id/sign_in_google") private MobileElement signinwithgmailbtn;
	@AndroidFindBy (id = "in.rebase.app:id/fb_sign_in") private MobileElement signinwithfbbtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Sign in' and @index='0']") private MobileElement signinwithgmailFBtitletxt;
	
	
	public String getTitleSigninWithGmailFB() {
		return getAttribute(signinwithgmailFBtitletxt, "text");
	}
	public FacebookPage pressfacebookbtn() {
		
		click(signinwithfbbtn);
		return new FacebookPage();
		}
	public ChooseGmailAccountPage pressGmailBtn() {
		
		click(signinwithgmailbtn);
		return new ChooseGmailAccountPage();
		}
}

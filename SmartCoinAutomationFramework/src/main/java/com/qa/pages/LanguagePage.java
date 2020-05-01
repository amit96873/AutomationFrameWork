package com.qa.pages;

import com.qa.BaseTest;
import com.qa.BaseTestForSigninSignUp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LanguagePage extends BaseTest {

	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='English' and @index='0']") private MobileElement englishlanguagebutton;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='हिंदी' and @index='1']") private MobileElement hindilanguagebutton;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='ಕನ್ನಡ' and @index='2']") private MobileElement otherlanguagebutton;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement continuebutton;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Language' and @index='0']") private MobileElement languagetitletxt;


	public String getTitle() {
		String title =  getAttribute(languagetitletxt, "Language Page Title Text is :- ");
		return title;
	}


	public LanguagePage pressOtherLangBtn() {

		click(otherlanguagebutton,"press on select other language button ");
		return this;
	}
	public LanguagePage pressHindiLangBtn() {

		click(hindilanguagebutton,"press on select hindi language button");
		return this;
	}
	public LanguagePage pressEnglishLangBtn() {

		click(englishlanguagebutton,"press on english language button");
		return this;
	}
	public PermissionPage pressContinueBtnSignin() {

		click(continuebutton,"press on continue button signin");
		return new PermissionPage();
	}
	public RegisterNameMobileNumberPage pressContinueBtnSignup() {

		click(continuebutton, "press on continue button signup");
		return new RegisterNameMobileNumberPage();
	}
	public RegisterNameMobileNumberPage langToRegistration() {
		click(englishlanguagebutton,"press on select english language button");
		click(continuebutton,"press on continue button");
		return new RegisterNameMobileNumberPage();
	}
}

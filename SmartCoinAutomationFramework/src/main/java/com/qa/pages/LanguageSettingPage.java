package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LanguageSettingPage extends BaseTest{

	
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='English' and @index='0']") private MobileElement englishlanguagebutton;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='हिंदी' and @index='1']") private MobileElement hindilanguagebutton;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='ಕನ್ನಡ' and @index='2']") private MobileElement otherlanguagebutton;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement continuebutton;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Language' and @index='0']") private MobileElement languagetitletxt;

	
	public String getTitle() {
		return getAttribute(languagetitletxt, "text");
	}
	
	
public LanguageSettingPage pressOtherLangBtn() {
		
	click(otherlanguagebutton);
	return this;
	}
public LanguageSettingPage pressHindiLangBtn() {
	
	click(hindilanguagebutton);
	return this;
	}
public LanguageSettingPage pressEnglishLangBtn() {
	
	click(englishlanguagebutton);
	return this;
	}
public HomePageSmartCoin pressContinueBtn() {
	click(continuebutton);
	return new HomePageSmartCoin();
	}

}

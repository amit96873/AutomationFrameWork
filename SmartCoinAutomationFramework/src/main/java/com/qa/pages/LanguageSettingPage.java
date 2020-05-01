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



	public String getLanguagePageTitle() {
		String title =  getText(languagetitletxt, "text");
		return title;
	}
	public HomePageSmartCoin pressReverseBtn() {
		click(reversebtn,"press on reverse button");
		return new HomePageSmartCoin();
	}

	public LanguageSettingPage pressOtherLangBtn() {

		click(otherlanguagebutton,"press on select other language button");
		return this;
	}
	public LanguageSettingPage pressHindiLangBtn() {

		click(hindilanguagebutton,"press on select hindi language button");
		return this;
	}
	public LanguageSettingPage pressEnglishLangBtn() {

		click(englishlanguagebutton,"press on select english language button");
		return this;
	}
	public HomePageSmartCoin pressContinueBtn() {
		click(continuebutton,"press on continue button");
		return new HomePageSmartCoin();
	}

}

package com.qa.pages;

import com.qa.BaseTestForSigninSignUp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ConfirmYourPasswordPage extends BaseTestForSigninSignUp {

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Confirm your 4-digit Pin' and @index='0']") private MobileElement confirmpasswordtitletext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='1' and @index='0']") private MobileElement digitone;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='2' and @index='0']") private MobileElement digittwo;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='3' and @index='0']") private MobileElement digitthree;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='4' and @index='0']") private MobileElement digitfour;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='5' and @index='0']") private MobileElement digitfive;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='6' and @index='0']") private MobileElement digitsix;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='7' and @index='0']") private MobileElement digitseven;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='8' and @index='0']") private MobileElement digiteight;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='9' and @index='0']") private MobileElement digitnine;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='0' and @index='0']") private MobileElement digitzero;
	@AndroidFindBy (id = "in.rebase.app:id/keyboard_button_imageview") private MobileElement deleteonedigitpassword;
	
	
	public String getTitleConfirmPassword() {
		return getAttribute(confirmpasswordtitletext, "text");
	}
	
	public ConfirmYourPasswordPage pressOne() {

		click(digitone);
		return this;
	}
	public ConfirmYourPasswordPage pressTwo() {

		click(digittwo);
		return this;
	}
	public ConfirmYourPasswordPage pressThree() {

		click(digitthree);
		return this;
	}
	public ConfirmYourPasswordPage pressFour() {

		click(digitfour);
		return this;
	}
	public ConfirmYourPasswordPage pressFive() {

		click(digitfive);
		return this;
	}
	public ConfirmYourPasswordPage pressOSix() {

		click(digitsix);
		return this;
	}
	public ConfirmYourPasswordPage pressSeven() {

		click(digitseven);
		return this;
	}
	public ConfirmYourPasswordPage pressEight() {

		click(digiteight);
		return this;
	}
	public ConfirmYourPasswordPage pressNine() {

		click(digitnine);
		return this;
	}
	public ConfirmYourPasswordPage pressZero() {

		click(digitzero);
		return this;
	}
	public HomePageSmartCoinForSigninSignup pressOne1() {

		click(digitone);
		return new HomePageSmartCoinForSigninSignup();
	}
	public HomePageSmartCoinForSigninSignup pressTwo2() {

		click(digittwo);
		return new HomePageSmartCoinForSigninSignup();
	}
	public HomePageSmartCoinForSigninSignup pressThree3() {

		click(digitthree);
		return new HomePageSmartCoinForSigninSignup();
	}
	public HomePageSmartCoinForSigninSignup pressFour4() {

		click(digitfour);
		return new HomePageSmartCoinForSigninSignup();
	}
	public HomePageSmartCoinForSigninSignup pressFive5() {

		click(digitfive);
		return new HomePageSmartCoinForSigninSignup();
	}
	public HomePageSmartCoinForSigninSignup pressOSix6() {

		click(digitsix);
		return new HomePageSmartCoinForSigninSignup();
	}
	public HomePageSmartCoinForSigninSignup pressSeven7() {

		click(digitseven);
		return new HomePageSmartCoinForSigninSignup();
	}
	public HomePageSmartCoinForSigninSignup pressEight8() {

		click(digiteight);
		return new HomePageSmartCoinForSigninSignup();
	}
	public HomePageSmartCoinForSigninSignup pressNine9() {

		click(digitnine);
		return new HomePageSmartCoinForSigninSignup();
	}
	public HomePageSmartCoinForSigninSignup pressZero0() {

		click(digitzero);
		return new HomePageSmartCoinForSigninSignup();
	}
	public ConfirmYourPasswordPage pressDeleteOneDigitPassword() {

		click(deleteonedigitpassword);
		return this;
	}
	
}

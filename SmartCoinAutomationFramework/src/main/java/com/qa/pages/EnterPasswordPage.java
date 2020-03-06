package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EnterPasswordPage extends BaseTest {

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Enter your 4-digit Pin' and @index='0']") private MobileElement enterpasswordpagetitle;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Forgot?' and @index='2']") private MobileElement forgotpassword;
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
	
	
	public String getTitleEnterPassword() {
		return getAttribute(enterpasswordpagetitle, "text");
	}
	
	public ForgotPasswordPage pressForgotPassword() {

		click(forgotpassword);
		return new ForgotPasswordPage();
	}
	public EnterPasswordPage pressOne() {

		click(digitone);
		return this;
	}
	public EnterPasswordPage pressTwo() {

		click(digittwo);
		return this;
	}
	public EnterPasswordPage pressThree() {

		click(digitthree);
		return this;
	}
	public EnterPasswordPage pressFour() {

		click(digitfour);
		return this;
	}
	public EnterPasswordPage pressFive() {

		click(digitfive);
		return this;
	}
	public EnterPasswordPage pressOSix() {

		click(digitsix);
		return this;
	}
	public EnterPasswordPage pressSeven() {

		click(digitseven);
		return this;
	}
	public EnterPasswordPage pressEight() {

		click(digiteight);
		return this;
	}
	public EnterPasswordPage pressNine() {

		click(digitnine);
		return this;
	}
	public EnterPasswordPage pressZero() {

		click(digitzero);
		return this;
	}
	public HomePageSmartCoin pressOne1() {

		click(digitone);
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressTwo2() {

		click(digittwo);
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressThree3() {

		click(digitthree);
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressFour4() {

		click(digitfour);
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressFive5() {

		click(digitfive);
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressOSix6() {

		click(digitsix);
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressSeven7() {

		click(digitseven);
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressEight8() {

		click(digiteight);
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressNine9() {

		click(digitnine);
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressZero0() {

		click(digitzero);
		return new HomePageSmartCoin();
	}
	public EnterPasswordPage pressDeleteOneDigitPassword() {

		click(deleteonedigitpassword);
		return this;
	}
	
}

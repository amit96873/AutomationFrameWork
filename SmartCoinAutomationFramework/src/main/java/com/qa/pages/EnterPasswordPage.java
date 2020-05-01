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
		String title = getAttribute(enterpasswordpagetitle, "Enter Password Page Title Text is:- ");
		return title;
	}

	public ForgotPasswordPage pressForgotPassword() {

		click(forgotpassword,"Press On Forgot Password Button");
		return new ForgotPasswordPage();
	}
	public EnterPasswordPage pressOne() {

		click(digitone,"Press On Digit One(1)");
		return this;
	}
	public EnterPasswordPage pressTwo() {

		click(digittwo,"Press On Digit Two(2)");
		return this;
	}
	public EnterPasswordPage pressThree() {

		click(digitthree,"Press On Digit Three(3)");
		return this;
	}
	public EnterPasswordPage pressFour() {

		click(digitfour,"Press On Digit Four(4)");
		return this;
	}
	public EnterPasswordPage pressFive() {

		click(digitfive,"Press On Digit Five(5)");
		return this;
	}
	public EnterPasswordPage pressOSix() {

		click(digitsix,"Press On Digit Six(6)");
		return this;
	}
	public EnterPasswordPage pressSeven() {

		click(digitseven,"Press On Digit Seven(7)");
		return this;
	}
	public EnterPasswordPage pressEight() {

		click(digiteight,"Press On Digit Eight(8)");
		return this;
	}
	public EnterPasswordPage pressNine() {

		click(digitnine,"Press On Digit Nine(9)");
		return this;
	}
	public EnterPasswordPage pressZero() {

		click(digitzero,"Press On Digit zero(0)");
		return this;
	}
	public HomePageSmartCoin pressOne1() {

		click(digitone,"Press On Digit One(1)");
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressTwo2() {

		click(digittwo,"Press on Digit Two(2)");
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressThree3() {

		click(digitthree,"Press on digit Three(3)");
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressFour4() {

		click(digitfour,"Press On Digit Four(4)");
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressFive5() {

		click(digitfive,"Press On Digit Five(5)");
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressOSix6() {

		click(digitsix,"Press On Digit Six(6)");
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressSeven7() {

		click(digitseven,"Press On Digit Seven(7)");
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressEight8() {

		click(digiteight,"Press on Digit Eight(8)");
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressNine9() {

		click(digitnine,"Press On Digit Nine(9)");
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressZero0() {

		click(digitzero,"Press on Digit Zero(0)");
		return new HomePageSmartCoin();
	}
	public EnterPasswordPage pressDeleteOneDigitPassword() {

		click(deleteonedigitpassword,"Press on Delete One digit Password");
		return this;
	}

}

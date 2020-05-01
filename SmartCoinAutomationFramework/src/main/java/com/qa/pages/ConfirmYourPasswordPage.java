package com.qa.pages;

import com.qa.BaseTest;
import com.qa.BaseTestForSigninSignUp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ConfirmYourPasswordPage extends BaseTest {

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
		String title = getText(confirmpasswordtitletext, "text");
		return title;
	}

	public ConfirmYourPasswordPage pressOne() {

		click(digitone,"Press Digit One(1)");
		return this;
	}
	public ConfirmYourPasswordPage pressTwo() {

		click(digittwo,"Press Digit Two(2)");
		return this;
	}
	public ConfirmYourPasswordPage pressThree() {

		click(digitthree,"Press Digit Three(3)");
		return this;
	}
	public ConfirmYourPasswordPage pressFour() {

		click(digitfour,"Press Digit Four(4)");
		return this;
	}
	public ConfirmYourPasswordPage pressFive() {

		click(digitfive,"Press Digit Five(5)");
		return this;
	}
	public ConfirmYourPasswordPage pressOSix() {

		click(digitsix,"Press Digit Six(6)");
		return this;
	}
	public ConfirmYourPasswordPage pressSeven() {

		click(digitseven,"Press Digit Seven(7)");
		return this;
	}
	public ConfirmYourPasswordPage pressEight() {

		click(digiteight,"Press Digit Eight(8)");
		return this;
	}
	public ConfirmYourPasswordPage pressNine() {

		click(digitnine,"Press Digit Nine(9)");
		return this;
	}
	public ConfirmYourPasswordPage pressZero() {

		click(digitzero,"Press Digit Zero(0)");
		return this;
	}
	public HomePageSmartCoin pressOne1() {

		click(digitone,"Press Digit One(1)");
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressTwo2() {

		click(digittwo,"Press Digit Two(2)");
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressThree3() {

		click(digitthree,"Press Digit Three(3)");
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressFour4() {

		click(digitfour,"Press Digit Four(4)");
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressFive5() {

		click(digitfive,"Press Digit Five(5)");
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressOSix6() {

		click(digitsix,"Press Digit Six(6)");
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressSeven7() {

		click(digitseven,"Press Digit Seven(7)");
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressEight8() {

		click(digiteight,"Press Digit Seven(8)");
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressNine9() {

		click(digitnine,"Press Digit Seven(9)");
		return new HomePageSmartCoin();
	}
	public HomePageSmartCoin pressZero0() {

		click(digitzero,"Press Digit Seven(0)");
		return new HomePageSmartCoin();
	}
	public ConfirmYourPasswordPage pressDeleteOneDigitPassword() {

		click(deleteonedigitpassword,"Delete one digit password");
		return this;
	}

}

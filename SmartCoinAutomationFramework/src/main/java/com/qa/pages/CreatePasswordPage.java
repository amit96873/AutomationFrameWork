package com.qa.pages;

import com.qa.BaseTest;
import com.qa.BaseTestForSigninSignUp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreatePasswordPage extends BaseTest {

	@AndroidFindBy (id = "in.rebase.app:id/pin_code_step_textview") private MobileElement createpasswordtitletext;
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


	public String getTitleCreatePassword() {
		String title = getAttribute(createpasswordtitletext, "text");
		return title;
	}

	public CreatePasswordPage pressOne() {

		click(digitone,"Press Digit One(1)");
		return this;
	}
	public CreatePasswordPage pressTwo() {

		click(digittwo,"Press Digit Two(2)");
		return this;
	}
	public CreatePasswordPage pressThree() {

		click(digitthree,"Press Digit Three(3)");
		return this;
	}
	public CreatePasswordPage pressFour() {

		click(digitfour,"Press Digit Four(4)");
		return this;
	}
	public CreatePasswordPage pressFive() {

		click(digitfive,"Press Digit Five(5)");
		return this;
	}
	public CreatePasswordPage pressOSix() {

		click(digitsix,"Press Digit Six");
		return this;
	}
	public CreatePasswordPage pressSeven() {

		click(digitseven,"Press Digit Seven");
		return this;
	}
	public CreatePasswordPage pressEight() {

		click(digiteight,"Press Digit Eight(8)");
		return this;
	}
	public CreatePasswordPage pressNine() {

		click(digitnine,"Press Digit Nine(9)");
		return this;
	}
	public CreatePasswordPage pressZero() {

		click(digitzero,"Press Digit Zero(0)");
		return this;
	}

	public ConfirmYourPasswordPage pressOne1() {

		click(digitone,"Press Digit Digit One(1)");
		return new ConfirmYourPasswordPage();
	}
	public ConfirmYourPasswordPage pressTwo2() {

		click(digittwo,"Press Digit Two(2)");
		return new ConfirmYourPasswordPage();
	}
	public ConfirmYourPasswordPage pressThree3() {

		click(digitthree,"Press Digit Three(3)");
		return new ConfirmYourPasswordPage();
	}
	public ConfirmYourPasswordPage pressFour4() {

		click(digitfour,"Press Digit Four(4)");
		return new ConfirmYourPasswordPage();
	}
	public ConfirmYourPasswordPage pressFive5() {

		click(digitfive,"Press Digit Five(5)");
		return new ConfirmYourPasswordPage();
	}
	public ConfirmYourPasswordPage pressOSix6() {

		click(digitsix,"Press Digit Six(6)");
		return new ConfirmYourPasswordPage();
	}
	public ConfirmYourPasswordPage pressSeven7() {

		click(digitseven,"Press Digit Seven(7)");
		return new ConfirmYourPasswordPage();
	}
	public ConfirmYourPasswordPage pressEight8() {

		click(digiteight,"Press Digit Eight(8)");
		return new ConfirmYourPasswordPage();
	}
	public ConfirmYourPasswordPage pressNine9() {

		click(digitnine,"Press Digit Nine(9)");
		return new ConfirmYourPasswordPage();
	}
	public ConfirmYourPasswordPage pressZero0() {

		click(digitzero,"Press Digit Zero(0)");
		return new ConfirmYourPasswordPage();
	}
	public CreatePasswordPage pressDeleteOneDigitPassword() {

		click(deleteonedigitpassword,"Press Delete One Digit Password");
		return this;
	}

}

package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreatePasswordPage extends BaseTest {

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Create a 4-digit Pin' and @index='0']") private MobileElement createpasswordtitletext;
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
		return getAttribute(createpasswordtitletext, "text");
	}
	
	public CreatePasswordPage pressOne() {

		click(digitone);
		return this;
	}
	public CreatePasswordPage pressTwo() {

		click(digittwo);
		return this;
	}
	public CreatePasswordPage pressThree() {

		click(digitthree);
		return this;
	}
	public CreatePasswordPage pressFour() {

		click(digitfour);
		return this;
	}
	public CreatePasswordPage pressFive() {

		click(digitfive);
		return this;
	}
	public CreatePasswordPage pressOSix() {

		click(digitsix);
		return this;
	}
	public CreatePasswordPage pressSeven() {

		click(digitseven);
		return this;
	}
	public CreatePasswordPage pressEight() {

		click(digiteight);
		return this;
	}
	public CreatePasswordPage pressNine() {

		click(digitnine);
		return this;
	}
	public CreatePasswordPage pressZero() {

		click(digitzero);
		return this;
	}
	
	public ConfirmYourPasswordPage pressOne1() {

		click(digitone);
		return new ConfirmYourPasswordPage();
	}
	public ConfirmYourPasswordPage pressTwo2() {

		click(digittwo);
		return new ConfirmYourPasswordPage();
	}
	public ConfirmYourPasswordPage pressThree3() {

		click(digitthree);
		return new ConfirmYourPasswordPage();
	}
	public ConfirmYourPasswordPage pressFour4() {

		click(digitfour);
		return new ConfirmYourPasswordPage();
	}
	public ConfirmYourPasswordPage pressFive5() {

		click(digitfive);
		return new ConfirmYourPasswordPage();
	}
	public ConfirmYourPasswordPage pressOSix6() {

		click(digitsix);
		return new ConfirmYourPasswordPage();
	}
	public ConfirmYourPasswordPage pressSeven7() {

		click(digitseven);
		return new ConfirmYourPasswordPage();
	}
	public ConfirmYourPasswordPage pressEight8() {

		click(digiteight);
		return new ConfirmYourPasswordPage();
	}
	public ConfirmYourPasswordPage pressNine9() {

		click(digitnine);
		return new ConfirmYourPasswordPage();
	}
	public ConfirmYourPasswordPage pressZero0() {

		click(digitzero);
		return new ConfirmYourPasswordPage();
	}
	public CreatePasswordPage pressDeleteOneDigitPassword() {

		click(deleteonedigitpassword);
		return this;
	}
	
}

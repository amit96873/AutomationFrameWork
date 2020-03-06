package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MobileNumberOTPVerificationPage extends BaseTest {

	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='OTP Verification' and @index='0']") private MobileElement otpverificationstitletext;
	@AndroidFindBy (id = "in.rebase.app:id/change_number") private MobileElement changenumberbtn;
	@AndroidFindBy (id = "in.rebase.app:id/resend_code") private MobileElement resendotpbtn;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement verifybtn;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='This OTP is incorrect' and @index='2']") private MobileElement invaidotperrortext;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (id = "in.rebase.app:id/otp_code_part_1") private MobileElement otp1;
	@AndroidFindBy (xpath = "//android.widget.EditText[@text='' and @index='1']") private MobileElement otp2;
	@AndroidFindBy (xpath = "//android.widget.EditText[@text='' and @index='2']") private MobileElement otp3;
	@AndroidFindBy (xpath = "//android.widget.EditText[@text='' and @index='3']") private MobileElement otp4;
	@AndroidFindBy (xpath = "//android.widget.EditText[@text='' and @index='4']") private MobileElement otp5;
	
	

	public String getNumberVerificationsPageTitle() {
		return getAttribute(otpverificationstitletext, "text");
	}
	public String getinvalidotptext() {
		return getAttribute(invaidotperrortext, "text");
	}
	public HomePageSmartCoin pressReversebtn() {
		click(reversebtn);
		return new HomePageSmartCoin();
	}

	public ChangeMobileNumberPage pressChangeNumberbtn() {
		click(changenumberbtn);
		return new ChangeMobileNumberPage();
	}

	public MobileNumberOTPVerificationPage pressResendOtpbtn() {
		click(resendotpbtn);
		return new MobileNumberOTPVerificationPage();
	}
}


package com.qa.pages;

import com.qa.BaseTest;
import com.qa.BaseTestForSigninSignUp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegisterNameMobileNumberPage extends BaseTestForSigninSignUp {

	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement regcontinuebutton;	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Need Instant Loan? Register with us...' and @index='1']") private MobileElement registernamenumtitletxt;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Full Name' and @index='2']") private MobileElement upfullnamelayer;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Mobile Number' and @index='2']") private MobileElement upmobilenumberlayer;
	@AndroidFindBy (id = "in.rebase.app:id/name") private MobileElement fullnameTxtFld;
	@AndroidFindBy (id = "in.rebase.app:id/mobile_number") private MobileElement mobileNumberTxtFld;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Invalid Mobile No.' and @index='0']") private MobileElement errortextformobilenumber;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Invalid Name' and @index='0']") private MobileElement errortextforname;

	public String getTitle() {
		return getAttribute(registernamenumtitletxt, "text");
	}

	public RegisterNameMobileNumberPage pressUpFullName() {

		click(upfullnamelayer);
		return this;
	}
	public RegisterNameMobileNumberPage pressOnTitle() {

		click(registernamenumtitletxt);
		return this;
	}
	public RegisterNameMobileNumberPage enterFullName(String fullname) {
		click(upfullnamelayer);
		clear(fullnameTxtFld);
		System.out.println("Full Name is:-  " + fullname);
		sendkeys(fullnameTxtFld, fullname);
		return this;

	}
	public RegisterNameMobileNumberPage pressUpMobileNumber() {

		click(upmobilenumberlayer);
		return this;
	}

	public RegisterNameMobileNumberPage enterMobileNumber(String mobileNumber) {
		click(upmobilenumberlayer);
		clear(mobileNumberTxtFld);
		System.out.println("Mobile Number is :-" + mobileNumber);
		sendkeys(mobileNumberTxtFld, mobileNumber);
		return this;
	}
	public RegisterNameMobileNumberPage clearNameTextField() {
		clear(fullnameTxtFld);
		return this;
	}
	public RegisterNameMobileNumberPage clearMobileNumberTextField() {
		clear(mobileNumberTxtFld);
		return this;
	}

	public String getErrTxtMobileNumber() {

		String MobileNumberError =  getText(errortextformobilenumber);
		System.out.println("Error Mobile Number Text is:- " + MobileNumberError);
		return MobileNumberError;
	}

	
	public String getErrTxtName() {

		String nameError= getText(errortextforname);
		System.out.println("Error Full Name Text is :- " + nameError);
		return nameError;
	}

	public PermissionPage pressRegContinueBtn() {
		click(registernamenumtitletxt);
		click(regcontinuebutton);
		System.out.println("Click Register Continue button");
		return new PermissionPage();
	}
	
	public PermissionPage validDetailsForPermissionPage() {
		click(upfullnamelayer);
		clear(fullnameTxtFld);		
		sendkeys(fullnameTxtFld, "Ajit Singh");
		click(upmobilenumberlayer);
		clear(mobileNumberTxtFld);
		sendkeys(mobileNumberTxtFld, "8073420765");
		click(registernamenumtitletxt);
		click(regcontinuebutton);
		return new PermissionPage();
		
		
		
		
	}
}

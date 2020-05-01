
package com.qa.pages;

import com.qa.BaseTest;
import com.qa.BaseTestForSigninSignUp;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegisterNameMobileNumberPage extends BaseTest {

	TestUtils utils = new TestUtils();
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement regcontinuebutton;	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Need Instant Loan? Register with us...' and @index='1']") private MobileElement registernamenumtitletxt;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Full Name' and @index='2']") private MobileElement upfullnamelayer;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Mobile Number' and @index='2']") private MobileElement upmobilenumberlayer;
	@AndroidFindBy (id = "in.rebase.app:id/name") private MobileElement fullnameTxtFld;
	@AndroidFindBy (id = "in.rebase.app:id/mobile_number") private MobileElement mobileNumberTxtFld;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Invalid Mobile No.' and @index='0']") private MobileElement errortextformobilenumber;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Invalid Name' and @index='0']") private MobileElement errortextforname;

	public String getTitle() {
		String title = getText(registernamenumtitletxt, "Register name and Mobile number Page Title Text is:- ");
		return title;
	}

	public RegisterNameMobileNumberPage pressUpFullName() {

		click(upfullnamelayer,"press Enter name edit text");
		return this;
	}
	public RegisterNameMobileNumberPage pressOnTitle() {

		click(registernamenumtitletxt,"press on title");
		return this;
	}
	public RegisterNameMobileNumberPage enterFullName(String fullname) {
		click(upfullnamelayer,"press enter name edit text");
		clear(fullnameTxtFld);
		//		utils.log().info("Full Name is:-  " + fullname);
		sendKeys(fullnameTxtFld, fullname,"Full Name is:-  " + fullname);
		return this;

	}
	public RegisterNameMobileNumberPage pressUpMobileNumber() {

		click(upmobilenumberlayer,"press Enter mobile number edit text");
		return this;
	}

	public RegisterNameMobileNumberPage enterMobileNumber(String mobileNumber) {
		click(upmobilenumberlayer,"press enter mobile number edit text");
		clear(mobileNumberTxtFld);
		//		utils.log().info("Mobile Number is :-" + mobileNumber);
		sendKeys(mobileNumberTxtFld, mobileNumber,"Mobile Number is :-" + mobileNumber);
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

		String MobileNumberError =  getText(errortextformobilenumber,"Error Mobile Number Text is:- ");
		//		utils.log().info("Error Mobile Number Text is:- " + MobileNumberError);
		return MobileNumberError;
	}


	public String getErrTxtName() {

		String nameError= getText(errortextforname,"Error Full Name Text is :- ");
		//		utils.log().info("Error Full Name Text is :- " + nameError);
		return nameError;
	}

	public PermissionPage pressRegContinueBtn() {
		click(registernamenumtitletxt);
		click(regcontinuebutton,"Press Register Continue button");
		//		utils.log().info("Click Register Continue button");
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

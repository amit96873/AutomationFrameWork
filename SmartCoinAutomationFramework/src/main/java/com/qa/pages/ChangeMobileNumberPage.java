package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ChangeMobileNumberPage extends BaseTest{
	
	TestUtils utils = new TestUtils();
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Enter Phone Number' and @index='0']") private MobileElement changenubertitletext;
	@AndroidFindBy (id = "in.rebase.app:id/phone_number_to_be_changed") private MobileElement enternumberedittext;
	@AndroidFindBy (id = "in.rebase.app:id/save") private MobileElement savebtn;
	@AndroidFindBy (id = "in.rebase.app:id/cancel") private MobileElement canclebtn;


	

	public String getChangeMobileNumberPageTitle() {
		return getAttribute(changenubertitletext, "text");
	}
	
	public ChangeMobileNumberPage enterNewMobileNumber(String changenumber) {
		click(enternumberedittext);
		clear(enternumberedittext);
		utils.log().info("Change Number is:-  " + changenumber);
		sendkeys(enternumberedittext, changenumber);
		return this;

	}
	public MobileNumberOTPVerificationPage pressSaveBtn() {
		click(savebtn);
		return new MobileNumberOTPVerificationPage();
	}
	public MobileNumberOTPVerificationPage pressCancelBtn() {
		click(canclebtn);
		return new MobileNumberOTPVerificationPage();
	}
}

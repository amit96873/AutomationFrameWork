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
		String title = getText(changenubertitletext, "Change Mobile NUmber Page Title Text is:- ");
		return title;
	}

	public ChangeMobileNumberPage enterNewMobileNumber(String changenumber) {
		click(enternumberedittext,"Click On Enter Mobile Number Edit Text");
		clear(enternumberedittext);
		utils.log().info("Change Number is:-  " + changenumber);
		sendKeys(enternumberedittext, changenumber,"Change Number is:-  " + changenumber);
		return this;

	}
	public MobileNumberOTPVerificationPage pressSaveBtn() {
		click(savebtn,"Press On Save Button");
		return new MobileNumberOTPVerificationPage();
	}
	public MobileNumberOTPVerificationPage pressCancelBtn() {
		click(canclebtn,"Press On Cancel Button");
		return new MobileNumberOTPVerificationPage();
	}
}

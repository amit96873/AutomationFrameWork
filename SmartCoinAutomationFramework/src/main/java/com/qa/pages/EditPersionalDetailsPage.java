package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EditPersionalDetailsPage extends BaseTest{
	
	TestUtils utils = new TestUtils();
	@AndroidFindBy (id = "in.rebase.app:id/name") private MobileElement enternametext;
	@AndroidFindBy (id = "in.rebase.app:id/mobile_number") private MobileElement entermobilenumbertext;
	@AndroidFindBy (id = "in.rebase.app:id/dob") private MobileElement dobspinner;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='Trans' and @index='2']") private MobileElement transgender;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='Female' and @index='1']") private MobileElement famale;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='Male' and @index='0']") private MobileElement male;
	@AndroidFindBy (id = "in.rebase.app:id/residence_address") private MobileElement editaddresstext;
	@AndroidFindBy (id = "in.rebase.app:id/residence_pincode") private MobileElement pincodeedittext;
	@AndroidFindBy (id = "in.rebase.app:id/father_name") private MobileElement fathersnameedittext;
	@AndroidFindBy (id = "in.rebase.app:id/mother_name") private MobileElement mothersnameedittext;
	@AndroidFindBy (id = "in.rebase.app:id/cl_title") private MobileElement editpersionaldetailstitletext;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='Yes' and @index='0']") private MobileElement yesbtn;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='No' and @index='1']") private MobileElement nobtn;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement continuebtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Are you married?' and @index='9']") private By areyoumarriedtext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Full Name?' and @index='2']") private By fullnametext;
	
	
	
	public String getEditPersionalDetailsTitleText() {
		return getAttribute(editpersionaldetailstitletext, "text");
	}
	public void scrollUp() {
		BaseTest bt=new BaseTest();
		bt.scrollToElement(areyoumarriedtext, "up");	
	}
		public void scrollDown() {
			BaseTest bt=new BaseTest();
			bt.scrollToElement(fullnametext, "down");	
		}
	
	public SelectDOBPage pressDOBSpinner() {
		click(dobspinner);
		return new SelectDOBPage();
	}
	
	public EditPersionalDetailsPage pressMariedYesRadioBtn() {
		click(yesbtn);
		return this;
	}
	public EditPersionalDetailsPage pressMariedNoRadioBtn() {
		click(nobtn);
		return this;
	}
	public MyProfilePage pressReverseBtn() {
		click(reversebtn);
		return new MyProfilePage();
	}
	public MyProfilePage pressContinueBtn() {
		click(continuebtn);
		return new MyProfilePage();
	}
	
	public EditPersionalDetailsPage pressMailRadioBtn() {
		click(male);
		return this;
	}
	public EditPersionalDetailsPage pressFemaleRadioBtn() {
		click(famale);
		return this;
	}
	public EditPersionalDetailsPage pressTransgenderRadioBtn() {
		click(transgender);
		return this;
	}
	public EditPersionalDetailsPage enterFullName(String fullname) {
		click(enternametext);
		clear(enternametext);
		utils.log("Full Name is:-  " + fullname);
		sendkeys(enternametext, fullname);
		return this;

	}
	public EditPersionalDetailsPage enterMobileNumber(String mobileNumber) {
		click(entermobilenumbertext);
		clear(entermobilenumbertext);
		utils.log("Mobile Number is :-" + mobileNumber);
		sendkeys(entermobilenumbertext, mobileNumber);
		return this;
	}
	public EditPersionalDetailsPage enterCurrentAddress(String address) {
		click(editaddresstext);
		clear(editaddresstext);
		utils.log(" Current Address is :-" + address);
		sendkeys(editaddresstext, address);
		return this;
	}
	public EditPersionalDetailsPage enterPinCode(String pincode) {
		click(pincodeedittext);
		clear(pincodeedittext);
		utils.log(" Pin Code is :-" + pincode);
		sendkeys(pincodeedittext, pincode);
		return this;
	}
	public EditPersionalDetailsPage enterFathersName(String fathersname) {
		click(fathersnameedittext);
		clear(fathersnameedittext);
		utils.log(" Fathers Name is :-" + fathersname);
		sendkeys(fathersnameedittext, fathersname);
		return this;
	}
	public EditPersionalDetailsPage enterMothersname(String mothersname) {
		click(mothersnameedittext);
		clear(mothersnameedittext);
		utils.log(" Mothers Name is :-" + mothersname);
		sendkeys(mothersnameedittext, mothersname);
		return this;
	}

}

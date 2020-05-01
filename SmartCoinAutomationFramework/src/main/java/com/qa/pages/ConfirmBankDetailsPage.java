package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ConfirmBankDetailsPage extends BaseTest {

	@AndroidFindBy (id = "in.rebase.app:id/negative_button") private MobileElement canclebtn;
	@AndroidFindBy (id = "in.rebase.app:id/positive_button") private MobileElement okbtn;
	@AndroidFindBy (id = "in.rebase.app:id/title") private MobileElement confirmbankdetailspagetitle;

	public String getConfirmBankAccountPageTitle() {
		String title =  getText(confirmbankdetailspagetitle, "Confirm Bank Account Page Title Text Is:-");
		return title;
	}

	public AddBankAccountWithIfscCodePage pressCancelButton() {

		click(canclebtn,"Press On Cancel Button");
		return new AddBankAccountWithIfscCodePage();
	}
	public MyBankDetailsPage pressOkButton() {

		click(okbtn,"Press On Ok Button");
		return new MyBankDetailsPage();
	}	


}

package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ExistingLoanPage extends BaseTest{

	@AndroidFindBy (id = "in.rebase.app:id/title") private MobileElement titletext;
	@AndroidFindBy (id = "in.rebase.app:id/negative_button") private MobileElement dismissbtn;
	@AndroidFindBy (id = "in.rebase.app:id/positive_button") private MobileElement gotocurrentloanbtn;

	public String getTitleExistingLoanPage() {	
		String title = getText(titletext, "Eisting Loan Page Title Text is:- ");
		return title;	
	}
	public LoanOffersPage pressDismissBtn() {
		click(dismissbtn,"Press On Dissmiss Button");
		return new LoanOffersPage();
	}

	public CurrentLoanPage pressGoToCurrentLoanBtn() {
		click(gotocurrentloanbtn,"Press On GoTo Cureent Loan Button");
		return new CurrentLoanPage();
	}
}

package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoanApplicationSubmittedPage extends BaseTest{
	
	@AndroidFindBy (id = "in.rebase.app:id/title") private MobileElement titletext;
	@AndroidFindBy (id = "in.rebase.app:id/negative_button") private MobileElement okbtn;

	public String getTitleLoanApplicationSubmittedPage() {	
		String title = getAttribute(titletext, "Loan Application submitted page Title Text is:- ");
		return title;
	}
	
public CurrentLoanPage pressOkBtn() {
	click(okbtn,"press on ok button");
	return new CurrentLoanPage();
}
}

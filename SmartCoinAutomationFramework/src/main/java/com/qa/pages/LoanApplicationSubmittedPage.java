package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoanApplicationSubmittedPage extends BaseTest{
	
	@AndroidFindBy (id = "in.rebase.app:id/title") private MobileElement titletext;
	@AndroidFindBy (id = "in.rebase.app:id/negative_button") private MobileElement okbtn;

	public String getTitleLoanApplicationSubmittedPage() {	
		return getAttribute(titletext, "text");
		
	}
	
public CurrentLoanPage pressOkBtn() {
	click(okbtn);
	return new CurrentLoanPage();
}
}

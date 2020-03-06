package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AddBankAccountSugestationPage extends BaseTest {
	
	
	@AndroidFindBy (id = "in.rebase.app:id/question") private MobileElement helpaddbanktitletext;
	
	@AndroidFindBy (id = "in.rebase.app:id/negative_button") private MobileElement okbtn;
	
	public String getHelpAddBankAccountDetailsPageTitle() {
		return getAttribute(helpaddbanktitletext, "text");
	}
	
	
	public AddBankAccountWithChequeLeafPage pressCheckLeafSuggestionPageOkButton() {
		
		click(okbtn);	
		return new AddBankAccountWithChequeLeafPage();
	}
	

	public AddBankAccountWithIfscCodePage pressIfscCodeSuggestionPageOkButton() {
		
		click(okbtn);	
		return new AddBankAccountWithIfscCodePage();
	}


}

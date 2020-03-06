package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class UploadBankStatementSugestationPage extends BaseTest {
	
	
	@AndroidFindBy (id = "in.rebase.app:id/negative_button") private MobileElement okbtn;
	@AndroidFindBy (id = "in.rebase.app:id/question") private MobileElement helpbankstatementtitletext;
	
	public String getSelectBankStatementHelpPageTitle() {
		return getAttribute(helpbankstatementtitletext, "text");
	}
	

	public UploadBankStatementsPage pressOkBtn() {
		click(okbtn);
		return new UploadBankStatementsPage();
	}
}

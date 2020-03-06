package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BankAccountPendingPage extends BaseTest{
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Bank Account Pending' and @index='0']") private MobileElement bankpendingtitletext;
	@AndroidFindBy (id = "in.rebase.app:id/positive_button") private MobileElement addaccountbtn;
	

	public String getBankAccountPendingPageTitle() {
		return getAttribute(bankpendingtitletext, "text");
	}
	
	
	
	public AddBankAccountWithChequeLeafPage pressAddBankAccountWithChequeLeafBtn() {
		click(addaccountbtn);
		return new AddBankAccountWithChequeLeafPage();
	}
	public AddBankAccountWithIfscCodePage pressAddBankAccountWithIfscCodeBtn() {
		click(addaccountbtn);
		return new AddBankAccountWithIfscCodePage();
	}
}

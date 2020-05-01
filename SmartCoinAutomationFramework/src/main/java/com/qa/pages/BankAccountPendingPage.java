package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BankAccountPendingPage extends BaseTest{


	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Bank Account Pending' and @index='0']") private MobileElement bankpendingtitletext;
	@AndroidFindBy (id = "in.rebase.app:id/positive_button") private MobileElement addaccountbtn;


	public String getBankAccountPendingPageTitle() {
		String title =  getText(bankpendingtitletext, "Bank Account Pending Page Title is:-");
		return title;
	}



	public AddBankAccountWithChequeLeafPage pressAddBankAccountWithChequeLeafBtn() {
		click(addaccountbtn,"Press On add Bank Account Number Button With Checque Leafe");
		return new AddBankAccountWithChequeLeafPage();
	}
	public AddBankAccountWithIfscCodePage pressAddBankAccountWithIfscCodeBtn() {
		click(addaccountbtn,"Press Add Bank Account Number Button With Ifasc Code");
		return new AddBankAccountWithIfscCodePage();
	}
}

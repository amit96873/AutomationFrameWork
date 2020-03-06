package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AddBankAccountWithIfscCodePage extends BaseTest{
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Add a Bank Account' and @index='0']") private MobileElement addbankaccountpagetitletext;
	@AndroidFindBy (id = "in.rebase.app:id/bank_account_number") private MobileElement enteraccountnumbertextfield;
	@AndroidFindBy (id = "in.rebase.app:id/re_bank_account_number") private MobileElement reenteraccountnumbertextfield;
	@AndroidFindBy (id = "in.rebase.app:id/ifsc_code") private MobileElement enterifsccodeedittext;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement continuebtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Bank Account Number' and @index='2']") private MobileElement aacountnumberup;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Re-enter Bank Account Number' and @index='2']") private MobileElement reenteraccountnumberup;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='IFSC Code' and @index='2']") private MobileElement ifsccodeup;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='No' and @index='1']") private MobileElement noifsc;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='Yes' and @index='0']") private MobileElement yesifsc;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Need Help?' and @index='1']") private MobileElement needhelpbtn;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Invalid IFSC Code' and @index='0']") private MobileElement invalidifsccodeerrortext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='This field is required' and @index='0']") private MobileElement emptyerrortext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Invalid Bank Account No.' and @index='0']") private MobileElement invalidaccountnumbererrortext;
	
	public String getAddBankAccountPageTitle() {
		return getAttribute(addbankaccountpagetitletext, "text");
	}
	public String getErrEmptyEditTextfield() {

		String AccountError= getText(emptyerrortext);
		System.out.println("Error AccountNumber Text is :- " + AccountError);
		return AccountError;
	}
	public String getErrInvalidIfscCode() {

		String invalidifsccodeError= getText(invalidifsccodeerrortext);
		System.out.println("Error IFSC Code Text is :- " + invalidifsccodeError);
		return invalidifsccodeError;
	}
	public String getErrInvalidAccountNumber() {

		String invalidAccountnumberError= getText(invalidaccountnumbererrortext);
		System.out.println("Error AccountNumber Text is :- " + invalidAccountnumberError);
		return invalidAccountnumberError;
	}

	public AddBankAccountWithIfscCodePage enterBankAccountNumber(String accountnumber) {
		click(aacountnumberup);
		clear(enteraccountnumbertextfield);
		System.out.println("Account Number is:-  " + accountnumber);
		sendkeys(enteraccountnumbertextfield, accountnumber);
		return this;
	}
	public AddBankAccountWithIfscCodePage reenterBankAccountNumber(String reenteraccountnumber) {
		click(reenteraccountnumberup);
		clear(reenteraccountnumbertextfield);
		System.out.println("ReEnter Account Number is:-  " + reenteraccountnumber);
		sendkeys(reenteraccountnumbertextfield, reenteraccountnumber);
		return this;
	}
	public AddBankAccountWithIfscCodePage enterIfscCoder(String ifsccode) {
		click(ifsccodeup);
		clear(enterifsccodeedittext);
		System.out.println("IFSC Code is:-  " + ifsccode);
		sendkeys(enterifsccodeedittext, ifsccode);
		return this;
	}

	public AddBankAccountWithIfscCodePage pressYesIfscButton() {

		click(yesifsc);
		return this;
	}
	public AddBankAccountWithChequeLeafPage pressNoIfscButton() {

		click(noifsc);
		return new AddBankAccountWithChequeLeafPage();
	}
	public AddBankAccountSugestationPage pressIfscCodeNeedHelpButton() {

		click(needhelpbtn);
		return new AddBankAccountSugestationPage();
	}

	public AddBankAccountWithIfscCodePage pressReverseButton() {

		click(reversebtn);
		return this;
	}
	public AddBankAccountWithIfscCodePage pressContinueButton() {

		click(continuebtn);
		return this;
	}
}

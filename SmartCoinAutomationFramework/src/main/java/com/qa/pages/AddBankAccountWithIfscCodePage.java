package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AddBankAccountWithIfscCodePage extends BaseTest{
	TestUtils utils = new TestUtils();
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
		String title =  getText(addbankaccountpagetitletext, "Add Bank Account Page Title Text Is:- ");
		return title;
	}
	public String getErrEmptyEditTextfield() {
		String error= getText(emptyerrortext,"Error AccountNumber Text is :- ");
		//		utils.log().info("Error AccountNumber Text is :- " + AccountError);
		return error;
	}
	public String getErrInvalidIfscCode() {

		String invalidifsccodeError= getText(invalidifsccodeerrortext,"Error IFSC Code Text is :- ");
		//		utils.log().info("Error IFSC Code Text is :- " + invalidifsccodeError);
		return invalidifsccodeError;
	}
	public String getErrInvalidAccountNumber() {

		String invalidAccountnumberError= getText(invalidaccountnumbererrortext,"Error AccountNumber Text is :- ");
		//		utils.log().info("Error AccountNumber Text is :- " + invalidAccountnumberError);
		return invalidAccountnumberError;
	}

	public AddBankAccountWithIfscCodePage enterBankAccountNumber(String accountnumber) {
		click(aacountnumberup,"Click on Account Number Edit Text fields");
		clear(enteraccountnumbertextfield);
		//		utils.log().info("Account Number is:-  " + accountnumber);
		sendKeys(enteraccountnumbertextfield, accountnumber,"Account Number is:-  " + accountnumber);
		return this;
	}
	public AddBankAccountWithIfscCodePage reenterBankAccountNumber(String reenteraccountnumber) {
		click(reenteraccountnumberup,"Click On Retenter Account Number");
		clear(reenteraccountnumbertextfield);
		utils.log().info("ReEnter Account Number is:-  " + reenteraccountnumber);
		sendKeys(reenteraccountnumbertextfield, reenteraccountnumber,"ReEnter Account Number is:-  " + reenteraccountnumber);
		return this;
	}
	public AddBankAccountWithIfscCodePage enterIfscCode(String ifsccode) {
		click(ifsccodeup,"Click On IFSC Code");
		clear(enterifsccodeedittext);
		utils.log().info("IFSC Code is:-  " + ifsccode);
		sendKeys(enterifsccodeedittext, ifsccode,"IFSC Code is:-  " + ifsccode);
		return this;
	}

	public AddBankAccountWithIfscCodePage pressYesIfscButton() {

		click(yesifsc,"click on yes ifsc radio button");
		return this;
	}
	public AddBankAccountWithChequeLeafPage pressNoIfscButton() {

		click(noifsc,"click on No ifsc radio button");
		return new AddBankAccountWithChequeLeafPage();
	}
	public AddBankAccountSugestationPage pressIfscCodeNeedHelpButton() {

		click(needhelpbtn,"click on need help button");
		return new AddBankAccountSugestationPage();
	}

	public AddBankAccountWithIfscCodePage pressReverseButton() {

		click(reversebtn,"click on reverse button");
		return this;
	}
	public MyBankDetailsPage pressContinueButton() {

		click(continuebtn,"click on continue button");
		return new MyBankDetailsPage();
	}
	public ConfirmBankDetailsPage pressContinueButtontogetConfirmBankDetailsPage() {

		click(continuebtn,"click on confirm bank details confirm button");
		return new ConfirmBankDetailsPage();
	}
}

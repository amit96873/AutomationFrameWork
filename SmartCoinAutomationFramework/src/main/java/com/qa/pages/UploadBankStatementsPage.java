package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class UploadBankStatementsPage extends BaseTest{



	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Unlock Loan Offers' and @index='0']") private MobileElement bankstatementpagetitletext;
	@AndroidFindBy (id = "in.rebase.app:id/spinner") private MobileElement selectbank;
	@AndroidFindBy (id = "in.rebase.app:id/help_button") private MobileElement helpbtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Upload only pdf format files' and @index='2']") private MobileElement uploadbankstatementtextview;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='Yes' and @index='0']") private MobileElement passwordyesbtn;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='No' and @index='1']") private MobileElement passwordnobtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Enter Bank Statement Password' and @index='2']") private MobileElement enterpasswordup;
	@AndroidFindBy (xpath = "//android.widget.EditText[@text='' and @index='0']") private MobileElement enterpasswordedittext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='PAN Card - FRONT' and @index='0']") private MobileElement pancardtextview;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Take a photo' and @index='2']") private MobileElement uploadpancardtextview;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement continuebtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='This field is required' and @index='3']") private MobileElement errortextview;

	public String getBankStatementPageTitle() {
		return getAttribute(bankstatementpagetitletext, "text");
	}
	public String getEmtyErrorText() {
		return getAttribute(errortextview, "text");
	}
	public UploadBankStatementsPage enterPassword(String password) {
		click(enterpasswordup);
		clear(enterpasswordedittext);
		System.out.println("Bank Statement PDF Password is:-  " + password);
		sendkeys(enterpasswordedittext, password);
		return this;

	}
	public CameraPage pressUploadPanCardBtn() {
		click(uploadpancardtextview);
		return new CameraPage();
	}
	public UploadBankStatementsPage pressContinueBtn() {
		click(continuebtn);
		return this;
	}

	public UploadBankStatementsPage pressYesPasswordBtn() {
		click(passwordyesbtn);
		return this;
	}
	public UploadBankStatementsPage pressNoPasswordBtn() {
		click(passwordnobtn);
		return this;
	}
	public HomePageSmartCoin pressReverseBtn() {
		click(reversebtn);
		return new HomePageSmartCoin();
	}
	public SelectBankPage pressSelectBankSpinnerBtn() {
		click(selectbank);
		return new SelectBankPage();
	}
	public DocumentsFoldesPage pressUploadPdfAccountStatementBtn() {
		click(uploadbankstatementtextview);
		return new DocumentsFoldesPage();
	}

	public UploadBankStatementSugestationPage pressHelpBankAccountStatementBtn() {
		click(helpbtn);
		return new UploadBankStatementSugestationPage();
	}

}

package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class UploadBankStatementsPage extends BaseTest{


	TestUtils utils = new TestUtils();
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
		String title = getText(bankstatementpagetitletext, "Upload bank statements page title text is:- ");
		return title;
	}
	public String getEmtyErrorText() {
		String error = getText(errortextview, "Empty Error is:- ");
		return error;
	}
	public UploadBankStatementsPage enterPassword(String password) {
		click(enterpasswordup,"press on enter password edit text");
		clear(enterpasswordedittext);
		//		utils.log().info("Bank Statement PDF Password is:-  " + password);
		sendKeys(enterpasswordedittext, password,"Bank Statement PDF Password is:-  " + password);
		return this;

	}
	public CameraPage pressUploadPanCardBtn() {
		click(uploadpancardtextview,"press on upload pan card button");
		return new CameraPage();
	}
	public UploadBankStatementsPage pressContinueBtn() {
		click(continuebtn,"press on continue button");
		return this;
	}

	public UploadBankStatementsPage pressYesPasswordBtn() {
		click(passwordyesbtn,"press on yes button for password");
		return this;
	}
	public UploadBankStatementsPage pressNoPasswordBtn() {
		click(passwordnobtn,"press on No button for password");
		return this;
	}
	public HomePageSmartCoin pressReverseBtn() {
		click(reversebtn,"press on reverse button");
		return new HomePageSmartCoin();
	}
	public SelectBankPage pressSelectBankSpinnerBtn() {
		click(selectbank,"press on select bank buton");
		return new SelectBankPage();
	}
	public DocumentsFoldesPage pressUploadPdfAccountStatementBtn() {
		click(uploadbankstatementtextview,"press on upload bank statement button");
		return new DocumentsFoldesPage();
	}

	public UploadBankStatementSugestationPage pressHelpBankAccountStatementBtn() {
		click(helpbtn,"press on help button");
		return new UploadBankStatementSugestationPage();
	}

}

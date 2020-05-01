package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AddBankAccountWithChequeLeafPage extends BaseTest{
	TestUtils utils = new TestUtils();
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Edit Bank Account' and @index='0']") private MobileElement editbankaccountpagetitletext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Add a Bank Account' and @index='0']") private MobileElement addbankaccountpagetitletext;
	@AndroidFindBy (id = "in.rebase.app:id/bank_account_number") private MobileElement enteraccountnumbertextfield;
	@AndroidFindBy (id = "in.rebase.app:id/re_bank_account_number") private MobileElement reenteraccountnumbertextfield;
	@AndroidFindBy (id = "in.rebase.app:id/ifsc_code") private MobileElement enterifsccodeedittext;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement continuebtn;
	@AndroidFindBy (id = "in.rebase.app:id/desc") private MobileElement uploadcheckleafpic;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Bank Account Number' and @index='2']") private MobileElement aacountnumberup;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Re-enter Bank Account Number' and @index='2']") private MobileElement reenteraccountnumberup;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='IFSC Code' and @index='2']") private MobileElement ifsccodeup;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='No' and @index='1']") private MobileElement noifsc;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='Yes' and @index='0']") private MobileElement yesifsc;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Need Help?' and @index='1']") private MobileElement needhelpbtn;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='This field is required' and @index='0']") private MobileElement emptyerrortext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='This field is required' and @index='0']") private MobileElement emptycheckleaferrortext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Invalid Bank Account No.' and @index='0']") private MobileElement invalidaccountnumbererrortext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Bank Account Cheque' and @index='0']") private MobileElement checkleafverificationtext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='IFSC Code' and @index='2']") private MobileElement ifscverificationtext;
	
	
	public String getAddBankAccountPageTitle() {
		String title = getAttribute(addbankaccountpagetitletext, "Add Bank Account Page Title Text is:- ");
		return title;
	}
	public String getEditBankAccountPageTitle() {
		String title =  getAttribute(editbankaccountpagetitletext, "Edit Bank Account Page Title Text is:- ");
		return title;
	}
	public String getAddIfscVerifivationTitleText() {
		String title =  getAttribute(ifscverificationtext, "Add IFSC Code Verification Page Title Text is:- ");
		return title;
	}
	public String getAddCheckLeafVerifivationTitleText() {
		String title =  getAttribute(checkleafverificationtext, "Add Check Leaf Title Text is :- ");
		return title;
	}
	public String getErrInvalidAccountNumber() {

		String invalidAccountnumberError= getText(invalidaccountnumbererrortext,"Account Number Error Text");
//		utils.log().info("Error AccountNumber Text is :- " + invalidAccountnumberError);
		return invalidAccountnumberError;
	}
	
	public String getErrEmptyCheckLeaffield() {

		String EmptycheckleafError= getText(emptycheckleaferrortext,"Empty Check Leaf Error Text is:-");
//		utils.log().info("Error AccountNumber Text is :- " + EmptycheckleafError);
		return EmptycheckleafError;
	}
	public String getErrEmptyEditTextfield() {

		String AccountError= getText(emptyerrortext, "Account Number Error Text");
//		utils.log().info("Error AccountNumber Text is :- " + AccountError);
		return AccountError;
	}

	public AddBankAccountWithChequeLeafPage enterBankAccountNumber(String accountnumber) {
		click(aacountnumberup,"clicked on Account Number Edit text ");
		clear(enteraccountnumbertextfield);
//		utils.log().info("Account Number is:-  " + accountnumber);
		sendKeys(enteraccountnumbertextfield, accountnumber,"Account Number is:-  " + accountnumber);
		return this;
	}
	public AddBankAccountWithChequeLeafPage reenterBankAccountNumber(String reenteraccountnumber) {
		click(reenteraccountnumberup,"Clicked on ReEnter Account Number Edit Text");
		clear(reenteraccountnumbertextfield);
//		utils.log().info("ReEnter Account Number is:-  " + reenteraccountnumber);
		sendKeys(reenteraccountnumbertextfield, reenteraccountnumber,"ReEnter Account Number is:-  " + reenteraccountnumber);
		return this;
	}
	
	public CameraPage pressCheckLeaf() {
		
		click(uploadcheckleafpic,"Clicked on check Leaf Button");
		return new CameraPage();
	}

public PermissionPage pressCheckLeafWithPermission() {
		
		click(uploadcheckleafpic,"Press Check leaf Button with Permission");
		return new PermissionPage();
	}
	public AddBankAccountWithIfscCodePage pressYesIfscButton() {

		click(yesifsc,"Press Yes IFSC Code Radio Button");
		return new AddBankAccountWithIfscCodePage();
	}
	public AddBankAccountWithChequeLeafPage pressNoIfscButton() {

		click(noifsc,"Press No Ifsc Code Radio Button");
		return this;
	}
	public AddBankAccountSugestationPage pressCheckLeafNeedHelpButton() {

		click(needhelpbtn,"Press Need Help Button");
		return new AddBankAccountSugestationPage();
	}

	public AddBankAccountWithChequeLeafPage pressReverseButton() {

		click(reversebtn,"Press on Reverse Button");
		return this;
	}
	public MyBankDetailsPage pressContinueButton() {

		click(continuebtn,"Press On Continue Button");
		return new MyBankDetailsPage();
	}
}

package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyBankDetailsPage extends BaseTest{
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='My Bank Details' and @index='0']") private MobileElement mybankdetailspagetitletext;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;
	@AndroidFindBy (id = "in.rebase.app:id/add_bank_account") private MobileElement addbankaccountbtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Documents Uploaded!' and @index='0']") private MobileElement checkleafuploadedsuccessfully;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Nothing was changed' and @index='0']") private MobileElement sameupdationmessage;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Bank Details changed successfully!' and @index='0']") private MobileElement bankdetailsIfscupdatedsuccessfully;
	

	public String getMyBankDetailsPageTitle() {
		return getAttribute(mybankdetailspagetitletext, "text");
	}
	public String getmessageforsamedetailsupdation() {
		return getAttribute(sameupdationmessage, "text");
	}
	public String getMessageforChangeBankAccountDetails() {
		return getAttribute(bankdetailsIfscupdatedsuccessfully, "text");
	}
	public String getMessageOfSuccessfullyUploadedCheckLeafandAccountDetails() {
		return getAttribute(checkleafuploadedsuccessfully, "text");
	}
	public AddBankAccountWithChequeLeafPage pressAddBankAccountWithChequeLeafBtn() {
		click(addbankaccountbtn);
		return new AddBankAccountWithChequeLeafPage();
	}
	public AddBankAccountWithIfscCodePage pressAddBankAccountWithIfscCodeBtn() {
		click(addbankaccountbtn);
		return new AddBankAccountWithIfscCodePage();
	}
}

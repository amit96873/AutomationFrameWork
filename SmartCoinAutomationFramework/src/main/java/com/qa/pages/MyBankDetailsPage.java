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
		String title = getText(mybankdetailspagetitletext, "My Bank Details Page Titile Text is:-");
		return title;
	}
	public String getmessageforsamedetailsupdation() {
		String title = getAttribute(sameupdationmessage, "Message for Same Details Updation Is:- ");
		return title;
	}
	public String getMessageforChangeBankAccountDetails() {
		String title = getText(bankdetailsIfscupdatedsuccessfully, "Message For Check Bank Details Page is:- ");
		return title;
	}
	public String getMessageOfSuccessfullyUploadedCheckLeafandAccountDetails() {
		String title = getAttribute(checkleafuploadedsuccessfully, "Message Of Successfull Upload Check Leaf and Account details page is:- ");
		return title;
	}
	public AddBankAccountWithChequeLeafPage pressAddBankAccountWithChequeLeafBtn() {
		click(addbankaccountbtn,"Press On Add Bank Account Button for check leaf");
		return new AddBankAccountWithChequeLeafPage();
	}
	public AddBankAccountWithIfscCodePage pressAddBankAccountWithIfscCodeBtn() {
		click(addbankaccountbtn,"Press on add bank account button for ifsc code");
		return new AddBankAccountWithIfscCodePage();
	}
}

package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoanOffersPage extends BaseTest{

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Loan Offers' and @index='0']") private MobileElement loanofferspagetitletext;
	@AndroidFindBy (id = "in.rebase.app:id/actionButton") private MobileElement unlockhigherloanbtn;
	@AndroidFindBy (id = "in.rebase.app:id/loan_apply_card") private MobileElement loanapplybtn;
	public String getTitleLoanOffersPage() {	
		return getAttribute(loanofferspagetitletext, "text");
		
	}
	public UploadBankStatementsPage pressUnlockHeigherLoanBtn() {
		click(unlockhigherloanbtn);
		return new UploadBankStatementsPage();
	}
	public ApplyForLoan pressLoanApplyCardBtn() {
		click(loanapplybtn);
		return new ApplyForLoan();
	}
	
	
}

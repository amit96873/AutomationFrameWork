package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ApplyForLoan extends BaseTest{
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Apply for Loan' and @index='0']") private MobileElement applyforloantitletext;
	@AndroidFindBy (id = "in.rebase.app:id/actionButton") private MobileElement durationbarbtn;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement applybtn;
	@AndroidFindBy (id = "in.rebase.app:id/error") private MobileElement errortext;
	@AndroidFindBy (id = "in.rebase.app:id/spinner") private MobileElement selectreasionspinnerbtn;
	
	
	
	public String getTitleApplyForLoanPage() {	
		return getAttribute(applyforloantitletext, "text");
		
	}
	
	public LoanApplicationSubmittedPage pressApplyBtn() {
		click(applybtn);
		return new LoanApplicationSubmittedPage();
	}
	public WhyDoYouNeedThisLoanPage pressSelectReasionBtn() {
		click(selectreasionspinnerbtn);
		return new WhyDoYouNeedThisLoanPage();
	}
	
	
	public String getErrorText() {	
		return getAttribute(errortext, "text");
		
	}
	public ApplyForLoan pressDurationBarBtn() {
		click(durationbarbtn);
		return this;
	}
	

}

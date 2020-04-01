package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class WhyDoYouNeedThisLoanPage extends BaseTest{
	
	TestUtils utils = new TestUtils();
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='WHY DO YOU NEED THIS LOAN?' and @index='0']") private MobileElement wdyntlPagetitletext;
	@AndroidFindBy (id = "in.rebase.app:id/search_text") private MobileElement searchedittext;
	@AndroidFindBy (xpath = "//in.rebase.app:id/item_button[@text='BILL PAYMENT' and @index='0']") private MobileElement selectbillpaymentbtn;
	
	

	public String getTitleWhyDoYouNeedThisLoanPage() {	
		return getAttribute(wdyntlPagetitletext, "text");
		
	}
	
	public ApplyForLoan pressBillPaymentsBtn() {
		click(selectbillpaymentbtn);
		return new ApplyForLoan();
	}
	public WhyDoYouNeedThisLoanPage enterReasionForLoan(String reasion) {
		click(searchedittext);
		clear(searchedittext);
		utils.log("Full Name is:-  " + reasion);
		sendkeys(searchedittext, reasion);
		return this;

	}
	
	
}

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
		String title = getText(wdyntlPagetitletext, "Why Do YOu Need This Loan Page Title Text is:- ");
		return title;

	}

	public ApplyForLoan pressBillPaymentsBtn() {
		click(selectbillpaymentbtn,"press on select bill payments");
		return new ApplyForLoan();
	}
	public WhyDoYouNeedThisLoanPage enterReasionForLoan(String reasion) {
		click(searchedittext,"press on Enter serch edit text");
		clear(searchedittext);
		//		utils.log().info("Full Name is:-  " + reasion);
		sendKeys(searchedittext, reasion,"Reasion is:-  " + reasion);
		return this;

	}


}

package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyLoansPage extends BaseTest{



	@AndroidFindBy (xpath = "//android.widget.TextView[@text='My Loans' and @index='0']") private MobileElement myloanstitletext;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;



	public String getMyloanPageTitle() {
		String title = getText(myloanstitletext, "My Loan Page Title Text is:- ");
		return title;
	}

	public HomePageSmartCoin pressReverseBtn() {

		click(reversebtn,"press reverse button");
		return new HomePageSmartCoin();
	}

}

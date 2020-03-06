package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyLoansPage extends BaseTest{
	
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='My Loans' and @index='0']") private MobileElement myloanstitletext;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	
	
	
	public String getMyloanPageTitle() {
		return getAttribute(myloanstitletext, "text");
	}
	
	public HomePageSmartCoin pressReverseBtn() {
		
		click(reversebtn);
		return new HomePageSmartCoin();
	}

}

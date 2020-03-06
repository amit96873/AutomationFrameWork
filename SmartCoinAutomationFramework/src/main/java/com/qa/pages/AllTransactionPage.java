package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AllTransactionPage extends BaseTest{
	
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='All Transactions' and @index='0']") private MobileElement alltransactiontitletext;
	
	
	
	

	public String getAllTransactionPageTitle() {
		return getAttribute(alltransactiontitletext, "text");
	}
	
public HomePageSmartCoin pressReverseBtn() {
		
		click(reversebtn);
		return new HomePageSmartCoin();
	}

}

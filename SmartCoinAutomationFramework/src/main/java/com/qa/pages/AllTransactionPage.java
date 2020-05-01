package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AllTransactionPage extends BaseTest{

	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='All Transactions' and @index='0']") private MobileElement alltransactiontitletext;





	public String getAllTransactionPageTitle() {
		String title = getText(alltransactiontitletext, "All Transaction Page Title Text");
		return title;
	}

	public HomePageSmartCoin pressReverseBtn() {

		click(reversebtn,"press on Reverse Button");
		return new HomePageSmartCoin();
	}

}

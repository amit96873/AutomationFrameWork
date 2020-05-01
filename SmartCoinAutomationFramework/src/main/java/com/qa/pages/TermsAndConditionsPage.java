
package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TermsAndConditionsPage extends BaseTest {


	@AndroidFindBy (id = "in.rebase.app:id/negative_button") private MobileElement dismisspvcbutton;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='SmartCoin Terms & Conditions' and @index='1']") private MobileElement smartcoinprivecypolicytxt;


	public String getTitle() {
		String title = getText(smartcoinprivecypolicytxt, "Terms and conditions page title text is:- ");
		return title;
	}


	public PermissionPage presstandcBtn() {

		click(dismisspvcbutton,"press dismiss button");
		return new PermissionPage();
	}
}

package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PrivecyPolicyPage extends BaseTest {
	

	@AndroidFindBy (id = "in.rebase.app:id/negative_button") private MobileElement dismisspvcbutton;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='SmartCoin Privacy Policy' and @index='1']") private MobileElement smartcoinprivecypolicytxt;

	
	public String getTitle() {
		String title = getText(smartcoinprivecypolicytxt, "Privecy policy title text is:- ");
		return title;
	}
	
	
public PermissionPage presspvcBtn() {
		
	click(dismisspvcbutton,"press dismiss SSPVC button");
	return new PermissionPage();
	}

}

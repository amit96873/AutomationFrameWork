package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CompleteProfilePage extends BaseTest {

	@AndroidFindBy (id = "in.rebase.app:id/title") private MobileElement titletext;
	
	
	public String getTitleCurrentLoanPage() {	
		return getAttribute(titletext, "text");
		
	}
}

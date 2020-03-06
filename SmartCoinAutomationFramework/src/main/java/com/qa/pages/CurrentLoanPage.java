package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CurrentLoanPage extends BaseTest{

	
	
	@AndroidFindBy (id = "in.rebase.app:id/title") private MobileElement titletext;
	@AndroidFindBy (id = "in.rebase.app:id/step_button") private MobileElement stepbtn;
	
	public String getTitleCurrentLoanPage() {	
		return getAttribute(titletext, "text");
		
	}
	
	public CompleteProfilePage pressStepBtn() {
		click(stepbtn);
		return new CompleteProfilePage();
	}
	
	
}

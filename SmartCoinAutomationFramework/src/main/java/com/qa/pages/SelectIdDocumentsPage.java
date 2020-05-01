package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SelectIdDocumentsPage extends BaseTest{

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Select ID Document' and @index='0']") private MobileElement iddocumentstitletext;	
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='PAN Card' and @index='0']") private MobileElement pancardbtn;	
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='Aadhaar front' and @index='1']") private MobileElement aadharfrontbtn;
	@AndroidFindBy (id = "in.rebase.app:id/negative_button") private MobileElement cancelbtn;
	@AndroidFindBy (id = "in.rebase.app:id/positive_button") private MobileElement selectbtn;



	public String getSelectIdDocumentsPageTitle() {
		String title =getText(iddocumentstitletext, "Select id document page title text is:- ");
		return title;
	}
	public  SelectIdDocumentsPage pressSelectPanCardBtn() {
		click(pancardbtn,"press pan card button");
		return this;
	}

	public  SelectIdDocumentsPage pressSelectAadharCardFrontBtn() {
		click(aadharfrontbtn,"press adhar card button");
		return this;
	}

	public  KYCUploadDocumentsPage pressCancelBtn() {
		click(cancelbtn,"press cancel button");
		return new KYCUploadDocumentsPage();
	}
	public  KYCUploadDocumentsPage pressOkBtn() {
		click(selectbtn,"press select button");
		return new KYCUploadDocumentsPage();
	}
}

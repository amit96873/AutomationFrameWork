package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SelectAddressDocumentsPage extends BaseTest{

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Select Address Document' and @index='0']") private MobileElement adressdocumentpagetitletext;	
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='Aadhaar back' and @index='0']") private MobileElement aadharbackbtn;	
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='Utility Bill' and @index='1']") private MobileElement utilitybillbtn;
	@AndroidFindBy (id = "in.rebase.app:id/negative_button") private MobileElement cancelbtn;
	@AndroidFindBy (id = "in.rebase.app:id/positive_button") private MobileElement selectbtn;

	public String getSelectAddressDocumentsPageTitle() {
		String title = getText(adressdocumentpagetitletext, "Select Address Document Page title is:-");
		return title;
	}	

	public  SelectAddressDocumentsPage pressSelectAadharbackBtn() {
		click(aadharbackbtn,"press aadhar back button");
		return this;
	}

	public  SelectAddressDocumentsPage pressSelectUtillityBillBtn() {
		click(utilitybillbtn,"press utility bills button");
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

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
		return getAttribute(adressdocumentpagetitletext, "text");
	}	
	
public  SelectAddressDocumentsPage pressSelectAadharbackBtn() {
	click(aadharbackbtn);
	return this;
}

public  SelectAddressDocumentsPage pressSelectUtillityBillBtn() {
	click(utilitybillbtn);
	return this;
}
public  KYCUploadDocumentsPage pressCancelBtn() {
	click(cancelbtn);
	return new KYCUploadDocumentsPage();
}
public  KYCUploadDocumentsPage pressOkBtn() {
	click(selectbtn);
	return new KYCUploadDocumentsPage();
}
}

package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class UploadUtilityBillSugestionPage extends BaseTest{
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='How to upload Utility Bill?' and @index='0']") private MobileElement utilitybilltitletext;
	@AndroidFindBy (id = "in.rebase.app:id/positive_button") private MobileElement capturebtn;
	@AndroidFindBy (id = "in.rebase.app:id/negative_button") private MobileElement canclebtn;
	
	

	public String getUtilitybillSugestationTitle() {
		return getAttribute(utilitybilltitletext, "text");
	}
	
	public CameraPage pressCaptureUtilityBillBtn() {
		click(capturebtn);
		return new CameraPage();
	}
	public KYCUploadDocumentsPage pressCancelBtn() {
		click(canclebtn);
		return new KYCUploadDocumentsPage();
	}
}

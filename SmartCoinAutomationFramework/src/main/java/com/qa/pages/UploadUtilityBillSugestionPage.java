package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class UploadUtilityBillSugestionPage extends BaseTest{


	@AndroidFindBy (xpath = "//android.widget.TextView[@text='How to upload Utility Bill?' and @index='0']") private MobileElement utilitybilltitletext;
	@AndroidFindBy (id = "in.rebase.app:id/positive_button") private MobileElement capturebtn;
	@AndroidFindBy (id = "in.rebase.app:id/negative_button") private MobileElement canclebtn;



	public String getUtilitybillSugestationTitle() {
		String title = getText(utilitybilltitletext, "Upload Utility bills sugestion page title text is:- ");
		return title;
	}

	public CameraPage pressCaptureUtilityBillBtn() {
		click(capturebtn,"press on capture button");
		return new CameraPage();
	}
	public KYCUploadDocumentsPage pressCancelBtn() {
		click(canclebtn,"press on cancel button");
		return new KYCUploadDocumentsPage();
	}
}

package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class UploadAdharBackSugestionPage extends BaseTest {
	

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='How to upload your Aadhaar Card (Back)?' and @index='0']") private MobileElement aadharbacktitletext;
	@AndroidFindBy (id = "in.rebase.app:id/positive_button") private MobileElement capturebtn;
	@AndroidFindBy (id = "in.rebase.app:id/negative_button") private MobileElement canclebtn;
	
	

	public String getAadharBackSugestationTitle() {
		return getAttribute(aadharbacktitletext, "text");
	}
	public CameraPage pressCaptureAdharBackBtn() {
		click(capturebtn);
		return new CameraPage();
	}
	public KYCUploadDocumentsPage pressCancelBtn() {
		click(canclebtn);
		return new KYCUploadDocumentsPage();
	}
}

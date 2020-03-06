package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class UploadSelfieSugestionPage extends BaseTest{
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='How to upload your photo (selfie)?' and @index='0']") private MobileElement selfiehelptitletext;
	@AndroidFindBy (id = "in.rebase.app:id/positive_button") private MobileElement capturebtn;
	@AndroidFindBy (id = "in.rebase.app:id/negative_button") private MobileElement canclebtn;
	
	

	public String getSelfiesugestationTitle() {
		return getAttribute(selfiehelptitletext, "text");
	}
	
	public CameraPage pressCaptureSelfieBtn() {
		click(capturebtn);
		return new CameraPage();
	}
	public KYCUploadDocumentsPage pressCancelBtn() {
		click(canclebtn);
		return new KYCUploadDocumentsPage();
	}
	
	
}

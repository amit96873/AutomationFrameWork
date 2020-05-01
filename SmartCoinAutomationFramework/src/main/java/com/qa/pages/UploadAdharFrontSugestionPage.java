package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class UploadAdharFrontSugestionPage extends BaseTest {




	@AndroidFindBy (xpath = "//android.widget.TextView[@text='How to upload your Aadhaar Card (Front)?' and @index='0']") private MobileElement aadharfronttitletext;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='CAPTURE' and @index='1']") private MobileElement capturebtn;
	@AndroidFindBy (id = "in.rebase.app:id/negative_button") private MobileElement canclebtn;



	public String getAadharFrontSugestationTitle() {
		String title = getText(aadharfronttitletext, "Upload adhar front sugestion page title tet is:- ");
		return title;
	}

	public CameraPage pressCaptureAdharFrontBtn() {
		click(capturebtn,"press capture button");
		return new CameraPage();
	}
	public KYCUploadDocumentsPage pressCancelBtn() {
		click(canclebtn,"press cancel button");
		return new KYCUploadDocumentsPage();
	}

	public CameraPage pressCaptureAdharFrontBtnWithPermission() {
		click(capturebtn,"press capture button");
		return new CameraPage();
	}
	public PermissionPageForAppHome pressCaptureAdhar() {
		click(capturebtn,"press cancel button");
		return new PermissionPageForAppHome();
	}


}

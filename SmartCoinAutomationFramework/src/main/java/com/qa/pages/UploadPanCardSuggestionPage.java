package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class UploadPanCardSuggestionPage extends BaseTest{


	@AndroidFindBy (xpath = "//android.widget.TextView[@text='How to upload your PAN card?' and @index='0']") private MobileElement pancardtitletext;
	@AndroidFindBy (id = "in.rebase.app:id/positive_button") private MobileElement capturebtn;
	@AndroidFindBy (id = "in.rebase.app:id/negative_button") private MobileElement canclebtn;



	public String getPanCardugestationTitle() {
		String title = getText(pancardtitletext, "Upload Pan Card Suggestion page Title Text is:- ");
		return title;
	}

	public CameraPage pressCapturePanCardBtn() {
		click(capturebtn,"press capture button");
		return new CameraPage();
	}
	public KYCUploadDocumentsPage pressCancelBtn() {
		click(canclebtn,"press cancel button");
		return new KYCUploadDocumentsPage();
	}

}

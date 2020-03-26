package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CameraPiccheckPage extends BaseTest {


    //for emulator
	@AndroidFindBy (id = "com.android.camera2:id/done_button") private MobileElement donebtn;
	@AndroidFindBy (id = "com.android.camera2:id/cancel_button") private MobileElement canclebtn;
	@AndroidFindBy (id = "com.android.camera2:id/retake_button") private MobileElement retakebtn;
	//for real device
	@AndroidFindBy (id = "com.android.camera:id/done_button") private MobileElement donebtn1;
	@AndroidFindBy (id = "com.android.camera:id/cancel_button") private MobileElement canclebtn1;
	@AndroidFindBy (id = "com.android.camera:id/retake_button") private MobileElement retakebtn1;
	
	


	public KYCUploadDocumentsPage pressDoneBtnKYCPageForEmulator() {
		click(donebtn);
		return new KYCUploadDocumentsPage();
	}
	public KYCUploadDocumentsPage pressDoneBtnKYCPageForRealDevice() {
		click(donebtn1);
		return new KYCUploadDocumentsPage();
	}
	public KYCUploadDocumentsPage pressDoneAadharBack() {
		click(donebtn);
		return new KYCUploadDocumentsPage();
	}
	public KYCUploadDocumentsPage pressDoneSelfie() {
		click(donebtn);
		return new KYCUploadDocumentsPage();
	}
	public KYCUploadDocumentsPage pressDonePanCard() {
		click(donebtn);
		return new KYCUploadDocumentsPage();
	}
	public KYCUploadDocumentsPage pressDoneUtilityBills() {
		click(donebtn);
		return new KYCUploadDocumentsPage();
	}
	public AddBankAccountWithChequeLeafPage pressDoneCheckLeafBtn() {
		click(donebtn);
		return new AddBankAccountWithChequeLeafPage();
	}
}

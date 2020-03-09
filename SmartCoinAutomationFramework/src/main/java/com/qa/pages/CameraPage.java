package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CameraPage extends BaseTest{
	
	
	@AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc='Shutter‎‏‎‎‏‎' and @index='0']") private MobileElement shhotpicbtn1;
	@AndroidFindBy (id = "com.android.camera2:id/shutter_button") private MobileElement shootpicbtn2;
	
	
	public CameraPiccheckPage pressCaptureAadharFront() {
		
		click(shootpicbtn2);
		return new CameraPiccheckPage();
	}
public CameraPiccheckPage pressCaptureAadharBackBtn() {
		
		click(shootpicbtn2);
		return new CameraPiccheckPage();
	}
public CameraPiccheckPage pressCaptureSelfieBtn() {
	
	click(shootpicbtn2);
	return new CameraPiccheckPage();
}
public CameraPiccheckPage pressCapturePanCardBtn() {
	
	click(shootpicbtn2);
	return new CameraPiccheckPage();
}
public CameraPiccheckPage pressCaptureUtilityBillsBtn() {
	
	click(shootpicbtn2);
	return new CameraPiccheckPage();
}
public CameraPiccheckPage pressCaptureCheckLeafBtn() {
	
	click(shootpicbtn2);
	return new CameraPiccheckPage();
}
}

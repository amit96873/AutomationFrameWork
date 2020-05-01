package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CameraPage extends BaseTest{
	
	
	@AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc='Shutter‎‏‎‎‏‎' and @index='0']") private MobileElement shhotpicbtn1;
	@AndroidFindBy (id = "com.android.camera2:id/shutter_button") private MobileElement shootpicbtn2;
	@AndroidFindBy (id = "com.android.camera:id/shutter_button") private MobileElement realdeviceshootbtn;
	@AndroidFindBy (id = "com.android.camera:id/cancel_leftbutton") private MobileElement realdevicecancleshootbtn;
	@AndroidFindBy (id = "com.android.camera:id/camera_switch") private MobileElement realdeviceswitchcamerabtn;
	
	
	public CameraPiccheckPage pressCaptureBtnForEmulator() {
		
		click(shootpicbtn2,"Press On Capture Button");
		return new CameraPiccheckPage();
	}
public CameraPage pressRealDeviceSwitchCamera() {
		
		click(realdeviceswitchcamerabtn,"Press On Capture Button For Real Device");
		return this;
	}

	public KYCUploadDocumentsPage pressCancleCaptureBtnForRealDevice() {
		
		click(realdevicecancleshootbtn,"Press Cancel Button For Real Device");
		return new KYCUploadDocumentsPage();
	}
public CameraPiccheckPage pressCaptureBtnForRealDevice() {
		
		click(realdeviceshootbtn,"Press Capture Button For Real Device");
		return new CameraPiccheckPage();
	}

}

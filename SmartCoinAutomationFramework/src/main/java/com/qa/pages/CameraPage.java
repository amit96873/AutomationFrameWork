package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CameraPage extends BaseTest{
	
	
	@AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc='Shutter‎‏‎‎‏‎' and @index='0']") private MobileElement shhotpicbtn1;
	@AndroidFindBy (id = "com.android.camera2:id/shutter_button") private MobileElement shootpicbtn2;

}

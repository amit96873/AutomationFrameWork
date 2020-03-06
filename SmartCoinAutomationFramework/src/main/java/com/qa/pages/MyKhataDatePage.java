package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyKhataDatePage extends BaseTest{
	@AndroidFindBy (id = "android:id/prev") private MobileElement nextbtn;
	@AndroidFindBy (id = "android:id/next") private MobileElement prevbtn;
	@AndroidFindBy (id = "android:id/button2") private MobileElement canlebtn;
	@AndroidFindBy (id = "android:id/button1") private MobileElement okbtn;
	@AndroidFindBy (xpath = "//android.view.View[@content-desc='12 February 2020']") private MobileElement selectdatebtn;
	
	
	

}

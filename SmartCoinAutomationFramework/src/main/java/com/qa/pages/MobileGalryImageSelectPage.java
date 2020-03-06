package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MobileGalryImageSelectPage extends BaseTest {
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Select a photo' and @index='1']") private MobileElement galarypagetitletext;
	

}

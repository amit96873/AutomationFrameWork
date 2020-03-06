package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ChatActionPage extends BaseTest{


	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Actions'  and @index='0']") private MobileElement chatactionpagetitletext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Take Photo' and @index='0']") private MobileElement takephotobtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Choose Photo' and @index='1']") private MobileElement choosephotobtn;



	public String getTitlechatActionPageTitle() {
		return getAttribute(chatactionpagetitletext, "text");
	}

	public CameraPage pressTakePhotoBtn() {
		click(takephotobtn);
		return new CameraPage();
	}

	public MobileGalryImageSelectPage pressChhosePhoto() {
		click(choosephotobtn);
		return new MobileGalryImageSelectPage();
	}
}


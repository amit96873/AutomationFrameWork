package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EmailPage extends BaseTest {

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Compose' and @index='1']") private MobileElement emailtitletext;
	@AndroidFindBy (xpath = "//android.widget.EditText[@text='Compose email' and @index='0']") private MobileElement emailedittext;
	@AndroidFindBy (id = "com.google.android.gm:id/subject") private MobileElement subjectedittext;
	@AndroidFindBy (id = "com.google.android.gm:id/send") private MobileElement sendbtn;



	public String getEmailPageTitle() {
		String title =  getAttribute(emailtitletext, "text");
		return title;
	}

}

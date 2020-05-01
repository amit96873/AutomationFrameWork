package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AllowMediaFilesPage extends BaseTest {
	
	
	@AndroidFindBy (id = "com.android.packageinstaller:id/permission_allow_button") private MobileElement allowbtn;
	@AndroidFindBy (id = "com.android.packageinstaller:id/permission_deny_button") private MobileElement denybtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Allow SmartCoin to access photos, media, and files on your device?' and @index='1']") private MobileElement allowmediafilestitletext;
	@AndroidFindBy (xpath = "//android.widget.CheckBox[@text='Don't ask again' and @index='0']") private MobileElement dontaskagaincheckbox;
	
	public String getTitleAlloeMediaFilesPageTitle() {
		String title =  getText(allowmediafilestitletext, "Allow Media Files Page Title Text");
		return title;
	}
	
	
}

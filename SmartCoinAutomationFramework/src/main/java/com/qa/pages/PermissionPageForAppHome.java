package com.qa.pages;

import com.qa.BaseTest;
import com.qa.BaseTestForSigninSignUp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PermissionPageForAppHome extends BaseTest {
	@AndroidFindBy (xpath = "//android.widget.Button[@text='ALLOW' and @index='1']") private MobileElement aadharfrontallowbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='AGREE AND CONTINUE' and @index='2']") private MobileElement agreeandcontinuebutton;
	@AndroidFindBy (id = "com.android.packageinstaller:id/permission_allow_button") private MobileElement allowbutton;
	@AndroidFindBy (id = "com.android.packageinstaller:id/permission_deny_button") private MobileElement denybutton;
	@AndroidFindBy (id = "in.rebase.app:id/login_google") private MobileElement signupwithgamil;
	@AndroidFindBy (id = "com.google.android.gms:id/account_name") private MobileElement gmailid;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Permissions' and @index='0']") private MobileElement permissiontitletxt;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Allow SmartCoin to send and view SMS messages?' and @index='1']") private MobileElement sendviewsmstitletext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Allow SmartCoin to access your contacts?' and @index='1']") private MobileElement accesscontactstitletxt;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Allow SmartCoin to make and manage phone calls?' and @index='1']") private MobileElement managephonecallstitletxt;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Allow SmartCoin to access this device's location?' and @index='1']") private MobileElement locationtitletxt;

	public String getTitlepermission() {
		String title = getText(permissiontitletxt, "Permission page title is:- ");
		return title;
	}

	public String getTitleSms() {
		String title = getText(sendviewsmstitletext, "Title of sms permission page is:- ");
		return title;
	}

	public String getTitleContats() {
		String title = getText(accesscontactstitletxt, "title of contacts permission page is:- ");
		return title;
	}

	public String getTitlePhoneCall() {
		String title = getText(managephonecallstitletxt, "title of phone call permission page is:- ");
		return title;
	}

	public String getTitleLocation() {
		String title = getText(locationtitletxt, "title of location permission page is:- ");
		return title;
	}
	public PermissionPageForAppHome pressagreeAndContinuebtn() {

		click(agreeandcontinuebutton,"press agree and continue button");
		return this;
	}
	public PermissionPageForAppHome pressallowButton() {
		click(allowbutton,"press allow button");
		return this;
	}
	public CameraPage pressallowButtonForCheckLeaf() {

		click(allowbutton,"press allow button");
		return new CameraPage();
	}
	public CameraPage pressallowlocation() {

		click(allowbutton,"press allow button");
		return new CameraPage();
	}
	public UploadAdharFrontSugestionPage pressallowForAadharFrontButton() {
		click(allowbutton,"press allow button");
		return new UploadAdharFrontSugestionPage();
	}
	public SignINWithGmailAndFacebookPage pressLastallowButton() {

		click(allowbutton,"press allow button");
		return new SignINWithGmailAndFacebookPage();
	}
	public PermissionPageForAppHome pressdenyButton() {

		click(denybutton,"press deny button");
		return this;
	}
	public PermissionPageForAppHome pressLoginWithGamiButton() {

		click(signupwithgamil,"press signup with gmail button");
		return this;
	}
	public PermissionPageForAppHome pressOnGmailId() {

		click(gmailid,"press gmail id button");
		return this;
	}


}

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
		return getAttribute(permissiontitletxt, "text");
	}

	public String getTitleSms() {
		return getAttribute(sendviewsmstitletext, "text");
	}

	public String getTitleContats() {
		return getAttribute(accesscontactstitletxt, "text");
	}

	public String getTitlePhoneCall() {
		return getAttribute(managephonecallstitletxt, "text");
	}

	public String getTitleLocation() {
		return getAttribute(locationtitletxt, "text");
	}
public PermissionPageForAppHome pressagreeAndContinuebtn() {
		
	click(agreeandcontinuebutton);
	return this;
	}
public PermissionPageForAppHome pressallowButton() {
	System.out.println("i am here");
	click(allowbutton);
	return this;
	}
public CameraPage pressallowButtonForCheckLeaf() {
	
	click(allowbutton);
	return new CameraPage();
	}
public CameraPage pressallowlocation() {
	
	click(allowbutton);
	return new CameraPage();
	}
public UploadAdharFrontSugestionPage pressallowForAadharFrontButton() {
	click(allowbutton);
	return new UploadAdharFrontSugestionPage();
	}
public SignINWithGmailAndFacebookPage pressLastallowButton() {
	
	click(allowbutton);
	return new SignINWithGmailAndFacebookPage();
	}
public PermissionPageForAppHome pressdenyButton() {
	
	click(denybutton);
	return this;
	}
public PermissionPageForAppHome pressLoginWithGamiButton() {
	
	click(signupwithgamil);
	return this;
	}
public PermissionPageForAppHome pressOnGmailId() {
	
	click(gmailid);
	return this;
	}


}

package com.qa.pages;

import com.qa.BaseTestForSigninSignUp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FacebookPage extends BaseTestForSigninSignUp {
	@AndroidFindBy (xpath = "//android.widget.EditText[@text='' and @index='0']") private MobileElement usernameTxtFld;
	@AndroidFindBy (xpath = "//android.widget.EditText[@text='' and @index='1']") private MobileElement passwordTxtFld;
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.Button") private MobileElement loginbtn;
	@AndroidFindBy (xpath = "//android.view.View[@text='facebook' and @index='0']") private MobileElement facebooktitletxt;
	
	public String getTitleFacebookPage() {
		return getAttribute(facebooktitletxt, "text");
	}
	
	public FacebookPage enterUserName(String username) {
		clear(usernameTxtFld);
		System.out.println("UserName is:-  " + username);
		sendkeys(usernameTxtFld, username);
		return this;

	}
	public FacebookPage enterPassword(String password) {
		clear(passwordTxtFld);
		System.out.println("Password is:-  " + password);
		sendkeys(passwordTxtFld, password);
		return this;

	}
	public ContinueLoginWithFbPage pressLoginbtn() {

		click(loginbtn);
		return new ContinueLoginWithFbPage();
	}
}

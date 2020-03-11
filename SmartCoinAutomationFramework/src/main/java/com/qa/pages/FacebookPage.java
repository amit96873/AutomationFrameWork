package com.qa.pages;

import com.qa.BaseTestForSigninSignUp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FacebookPage extends BaseTestForSigninSignUp {
	@AndroidFindBy (xpath = "//android.widget.EditText[@text='' and @index='0']") private MobileElement usernameTxtFld;
	@AndroidFindBy (xpath = "//android.widget.EditText[@text='Facebook password' and @index='1']") private MobileElement passwordTxtFld;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Log In' and @index='0']") private MobileElement loginbtn;
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

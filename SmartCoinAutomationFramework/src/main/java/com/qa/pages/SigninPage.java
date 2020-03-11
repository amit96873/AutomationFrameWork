package com.qa.pages;

import com.qa.BaseTestForSigninSignUp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SigninPage extends BaseTestForSigninSignUp {
	

	@AndroidFindBy (id = "in.rebase.app:id/sign_in_button") private MobileElement signinbutton;

	
	
public LanguagePage pressSignInBtn() {
		
	click(signinbutton);
	return new LanguagePage();
	}


}

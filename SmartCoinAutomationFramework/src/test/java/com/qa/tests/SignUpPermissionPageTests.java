package com.qa.tests;

import org.testng.annotations.Test;
import com.qa.BaseTest;
import com.qa.pages.LanguagePage;
import com.qa.pages.PermissionPage;
import com.qa.pages.RegisterNameMobileNumberPage;
import com.qa.pages.SignupPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.InputStream;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.AfterClass;


public class SignUpPermissionPageTests extends BaseTest {
	SignupPage signupPage;
	LanguagePage languagePage;
	PermissionPage permissionpage;
	RegisterNameMobileNumberPage registrationpage;
	InputStream datais;
	JSONObject loginuser;

	@BeforeClass
	public void beforeClass() throws Exception {
		try {
			String dataFileName = "data/loginuser.json";
			datais = getClass().getClassLoader().getResourceAsStream(dataFileName);
			JSONTokener tokener= new JSONTokener(datais);
			loginuser = new JSONObject(tokener);
			signupPage= new SignupPage();
			languagePage = signupPage.pressSignUpBtn();
			registrationpage = languagePage.langToRegistration();
			permissionpage = registrationpage.validDetailsForPermissionPage();

		}catch(Exception e) {

			e.printStackTrace();


		}
		finally {
			if(datais!=null) {
				datais.close();
			}

		}

	}
	@AfterClass
	public void afterClass() {

	}

	/*
	@BeforeMethod
	public void beforeMethod(Method m) {
		signupPage= new SignupPage();
		System.out.println("\n"+"******** starting test:"+m.getName() + "********");


	}
	
	@Test
	public void deny() {
		permissionpage.pressagreeAndContinuebtn();
		permissionpage.pressdenyButton();
		permissionpage.pressdenyButton();
		permissionpage.pressdenyButton();
		permissionpage.pressdenyButton();
		
	}
	 */
@Test
public void allow() {
	System.out.println("i am the allow test");
	permissionpage.pressagreeAndContinuebtn();
	permissionpage.pressallowButton();
	permissionpage.pressallowButton();
	permissionpage.pressallowButton();
	permissionpage.pressallowButton();
	permissionpage.pressLoginWithGamiButton();
	permissionpage.pressOnGmailId();
	
}

	@AfterMethod
	public void afterMethod() {

	}


}

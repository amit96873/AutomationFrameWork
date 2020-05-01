package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.BaseTest;
import com.qa.listeners.AllureListener;
import com.qa.pages.LanguagePage;
import com.qa.pages.PermissionPage;
import com.qa.pages.RegisterNameMobileNumberPage;
import com.qa.pages.SignupPage;
import com.qa.utils.TestUtils;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.io.InputStream;
import java.lang.reflect.Method;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

@Listeners({AllureListener.class})
public class SignupRegisterFullNameAndMobileNumberTests extends BaseTest {
	SignupPage signupPage;
	LanguagePage languagePage;
	PermissionPage permissionpage;
	RegisterNameMobileNumberPage registrationpage;
	JSONObject loginuser;
	TestUtils utils = new TestUtils();
	
	@BeforeClass
	public void beforeClass() throws Exception {
		InputStream datais = null;
		try {
			String dataFileName = "data/loginuser.json";
			datais = getClass().getClassLoader().getResourceAsStream(dataFileName);
			JSONTokener tokener= new JSONTokener(datais);
			loginuser = new JSONObject(tokener);
			signupPage= new SignupPage();
			languagePage = signupPage.pressSignUpBtn();
			registrationpage = languagePage.langToRegistration();

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


	@BeforeMethod
	public void beforeMethod(Method m) {
		signupPage= new SignupPage();
		utils.log().info("\n"+"******** starting test:"+m.getName() + "********");


	}
	 




	@Test(priority=1, description="Check Registration by enter invalid name and Valid Mobile Number")
	@Description("Check Registration by enter invalid name and Valid Mobile Number")
	@Epic("EP001")
	@Feature("Feature1: Verify Full Name Edit Text with invalid data and Mobile Number Edit Text with valid data ")
	@Story("Story: verify Full name Edit text and Mobile Number Edit Text which is peresence Registration page on signup")
	@Step("Checked Full Name Edit text with invalid data and Mobile Number Edit Text With Valid Data")
	@Severity(SeverityLevel.NORMAL)
	public void checkRegistrationInvalidName() {
		System.out.println("checkRegistrationInvalidName");
		SoftAssert sa= new SoftAssert();
		registrationpage.enterFullName(loginuser.getJSONObject("invalidusername").getString("full_name"));
		registrationpage.enterMobileNumber(loginuser.getJSONObject("invalidusername").getString("Mobile_Number"));
		registrationpage.pressRegContinueBtn();
		String errortextforname= registrationpage.getErrTxtName();
		String expectedNameErrorText=getString().get("fullName_Error_text");
		sa.assertEquals(errortextforname, expectedNameErrorText);
		sa.assertAll();
		utils.log().info("Actual ErrorText:- " + errortextforname + "\n" + "Expected ErrorText:- "+expectedNameErrorText);


	}

	@Test(priority=2, description="Check Registration by enter Valid name and Invalid Mobile Number")
	@Description("Check Registration by enter Valid name and Invalid Mobile Number")
	@Epic("EP001")
	@Feature("Feature2: Verify Full Name Edit Text with Valid data and Mobile Number Edit Text with Invalid data ")
	@Story("Story: verify Full name Edit text and Mobile Number Edit Text which is peresence Registration page on signup")
	@Step("Checked Full Name Edit text with Valid data and Mobile Number Edit Text With Invalid Data")
	@Severity(SeverityLevel.NORMAL)
	public void checkRegistrationInvalidNumber() {
		System.out.println("checkRegistrationInvalidNumber");
		SoftAssert sa= new SoftAssert();
		registrationpage.enterFullName(loginuser.getJSONObject("invalidnumber").getString("full_name"));
		registrationpage.enterMobileNumber(loginuser.getJSONObject("invalidnumber").getString("Mobile_Number"));
		registrationpage.pressRegContinueBtn();
		String errortextfornumber= registrationpage.getErrTxtMobileNumber();
		String expectedNumberErrorText=getString().get("mobileNumber_Error_text");
		sa.assertEquals(errortextfornumber, expectedNumberErrorText);
		sa.assertAll();
		utils.log().info("actual ErrorText:- " + errortextfornumber + "\n" + "expected ErrorText:- "+expectedNumberErrorText);
	}


	@Test(priority=3, description="Check Registration by enter invalid name by using Speacal charachter and Valid Mobile Number")
	@Description("Check Registration by enter invalid name by using Speacal charachter and Valid Mobile Number")
	@Epic("EP001")
	@Feature("Feature3: Verify Full Name Edit Text with invalid data(invalid name by using Speacal charachter) and Mobile Number Edit Text with valid data ")
	@Story("Story: verify Full name Edit text and Mobile Number Edit Text which is peresence Registration page on signup")
	@Step("Checked Full Name Edit text with invalid data(invalid name by using Speacal charachter) and Mobile Number Edit Text With Valid Data")
	@Severity(SeverityLevel.NORMAL)
	public void checkRegistrationInvalidNameBySpacelChar() { 
		System.out.println("checkRegistrationInvalidNameBySpacelChar");
		SoftAssert sa= new SoftAssert();
		registrationpage.enterFullName(loginuser.getJSONObject("invalidusernamebyspacealchar").getString("full_name"));
		registrationpage.enterMobileNumber(loginuser.getJSONObject("invalidusernamebyspacealchar").getString("Mobile_Number"));
		registrationpage.pressRegContinueBtn();
		String errortextforname= registrationpage.getErrTxtName();
		String expectedNameErrorText=getString().get("fullName_Error_text");
		sa.assertEquals(errortextforname, expectedNameErrorText);
		sa.assertAll();
		utils.log().info("Actual ErrorText:- " + errortextforname + "\n" + "Expected ErrorText:- "+expectedNameErrorText);


	}



	@Test(priority=4, description="Check Registration by enter Empty name and Empty Mobile Number")
	@Description("Check Registration by enter Empty name and Empty Mobile Number")
	@Epic("EP001")
	@Feature("Feature4: Verify Full Name Edit Text with Empty data and Mobile Number Edit Text with Empty data ")
	@Story("Story: verify Full name Edit text and Mobile Number Edit Text which is peresence Registration page on signup")
	@Step("Checked Full Name Edit text with Empty data and Mobile Number Edit Text With Empty Data")
	@Severity(SeverityLevel.NORMAL)
	public void checkRegistrationEmptyNameAndNumber() {
		System.out.println("checkRegistrationEmptyNameAndNumber");
		SoftAssert sa= new SoftAssert();
		registrationpage.enterFullName(loginuser.getJSONObject("emptynameandnumber").getString("full_name"));
		registrationpage.enterMobileNumber(loginuser.getJSONObject("emptynameandnumber").getString("Mobile_Number"));
		registrationpage.pressRegContinueBtn();
		String errortextforname= registrationpage.getErrTxtName();
		String expectedNameErrorText=getString().get("fullName_Error_text");
		sa.assertEquals(errortextforname, expectedNameErrorText);
		String errortextfornumber= registrationpage.getErrTxtMobileNumber();
		String expectedNumberErrorText=getString().get("mobileNumber_Error_text");
		sa.assertEquals(errortextfornumber, expectedNumberErrorText);
		sa.assertAll();
		utils.log().info("Actual ErrorText:- " + errortextforname + "\n" + "Expected ErrorText:- "+expectedNameErrorText);
		utils.log().info("actual ErrorText:- " + errortextfornumber + "\n" + "expected ErrorText:- "+expectedNumberErrorText);



	}


	@Test(priority=5, description="Check Registration by enter Empty name and Valid Mobile Number")
	@Description("Check Registration by enter Empty name and Valid Mobile Number")
	@Epic("EP001")
	@Feature("Feature5: Verify Full Name Edit Text with Empty data and Mobile Number Edit Text with valid data ")
	@Story("Story: verify Full name Edit text and Mobile Number Edit Text which is peresence Registration page on signup")
	@Step("Checked Full Name Edit text with Empty data and Mobile Number Edit Text With Valid Data")
	@Severity(SeverityLevel.NORMAL)
	public void checkRegistrationEmptyNameValidNumber() {
		System.out.println("checkRegistrationEmptyNameValidNumber");
		SoftAssert sa= new SoftAssert();
		registrationpage.enterFullName(loginuser.getJSONObject("emptynamevalidnumber").getString("full_name"));
		registrationpage.enterMobileNumber(loginuser.getJSONObject("emptynamevalidnumber").getString("Mobile_Number"));
		registrationpage.pressRegContinueBtn();
		String errortextforname= registrationpage.getErrTxtName();
		String expectedNameErrorText=getString().get("fullName_Error_text");
		sa.assertEquals(errortextforname, expectedNameErrorText);
		sa.assertAll();
		utils.log().info("Actual ErrorText:- " + errortextforname + "\n" + "Expected ErrorText:- "+expectedNameErrorText);



	}


	@Test(priority=6, description="Check Registration by enter Valid name and Empty Mobile Number")
	@Description("Check Registration by enter Valid name and Empty Mobile Number")
	@Epic("EP001")
	@Feature("Feature6: Verify Full Name Edit Text with Valid data and Mobile Number Edit Text with Empty data ")
	@Story("Story: verify Full name Edit text and Mobile Number Edit Text which is peresence Registration page on signup")
	@Step("Checked Full Name Edit text with Valid data and Mobile Number Edit Text With Empty Data")
	@Severity(SeverityLevel.NORMAL)
	public void checkRegistrationEmptyNumberValidName() {
		System.out.println("checkRegistrationEmptyNumberValidName");
		SoftAssert sa= new SoftAssert();
		registrationpage.enterFullName(loginuser.getJSONObject("emptynumbervalidname").getString("full_name"));
		registrationpage.enterMobileNumber(loginuser.getJSONObject("emptynumbervalidname").getString("Mobile_Number"));
		registrationpage.pressRegContinueBtn();
		String errortextfornumber= registrationpage.getErrTxtMobileNumber();
		String expectedNumberErrorText=getString().get("mobileNumber_Error_text");
		sa.assertEquals(errortextfornumber, expectedNumberErrorText);
		sa.assertAll();
		utils.log().info("actual ErrorText:- " + errortextfornumber + "\n" + "expected ErrorText:- "+expectedNumberErrorText);

	}


	@Test(priority=7, description="Check Registration by enter Valid name and Space in Number Mobile Number")
	@Description("Check Registration by enter Valid name and Space in Mobile Number")
	@Epic("EP001")
	@Feature("Feature7: Verify Full Name Edit Text with Valid data and Mobile Number Edit Text with Space in data ")
	@Story("Story: verify Full name Edit text and Mobile Number Edit Text which is peresence Registration page on signup")
	@Step("Checked Full Name Edit text with Valid data and Mobile Number Edit Text With Space in Data")
	@Severity(SeverityLevel.NORMAL)
	public void checkRegistrationSpaceInNumber() {
		System.out.println("checkRegistrationSpaceInNumber");
		SoftAssert sa= new SoftAssert();
		registrationpage.enterFullName(loginuser.getJSONObject("spaceinnumber").getString("full_name"));
		registrationpage.enterMobileNumber(loginuser.getJSONObject("spaceinnumber").getString("Mobile_Number"));
		registrationpage.pressRegContinueBtn();
		String errortextfornumber= registrationpage.getErrTxtMobileNumber();
		String expectedNumberErrorText=getString().get("mobileNumber_Error_text");
		sa.assertEquals(errortextfornumber, expectedNumberErrorText);
		sa.assertAll();
		utils.log().info("actual ErrorText:- " + errortextfornumber + "\n" + "expected ErrorText:- "+expectedNumberErrorText);


	}


	@Test(priority=8, description="Check Registration by enter Valid name and Eight Digits Mobile Number")
	@Description("Check Registration by enter Valid name and Eight Digits Mobile Number")
	@Epic("EP001")
	@Feature("Feature8: Verify Full Name Edit Text with Valid data and Mobile Number Edit Text with Eight Digits Number ")
	@Story("Story: verify Full name Edit text and Mobile Number Edit Text which is peresence Registration page on signup")
	@Step("Checked Full Name Edit text with Valid data and Mobile Number Edit Text With Eight Digits Number")
	@Severity(SeverityLevel.NORMAL)
	public void checkRegistrationEightDigitsNumber() {
		System.out.println("checkRegistrationlessThanTenDigitsNumber");
		SoftAssert sa= new SoftAssert();
		registrationpage.enterFullName(loginuser.getJSONObject("lessthantendigitnumber").getString("full_name"));
		registrationpage.enterMobileNumber(loginuser.getJSONObject("lessthantendigitnumber").getString("Mobile_Number"));
		registrationpage.pressRegContinueBtn();
		String errortextfornumber= registrationpage.getErrTxtMobileNumber();
		String expectedNumberErrorText=getString().get("mobileNumber_Error_text");
		sa.assertEquals(errortextfornumber, expectedNumberErrorText);
		sa.assertAll();
		utils.log().info("actual ErrorText:- " + errortextfornumber + "\n" + "expected ErrorText:- "+expectedNumberErrorText);

	}


	@Test(priority=9, description="Check Registration by enter Valid name and Valid Mobile Number")
	@Description("Check Registration by enter Valid name and Valid Mobile Number")
	@Epic("EP001")
	@Feature("Feature9: Verify Full Name Edit Text with Valid data and Mobile Number Edit Text with valid data ")
	@Story("Story: verify Full name Edit text and Mobile Number Edit Text which is peresence Registration page on signup")
	@Step("Checked Full Name Edit text with Valid data and Mobile Number Edit Text With Valid Data")
	@Severity(SeverityLevel.NORMAL)
	public void checkRegistrationWithValidNameAndNumber() {
		System.out.println("checkRegistrationWithValidNameAndMobile_Number");
		SoftAssert sa= new SoftAssert();
		registrationpage.enterFullName(loginuser.getJSONObject("validnameandnumber").getString("full_name"));
		registrationpage.enterMobileNumber(loginuser.getJSONObject("validnameandnumber").getString("Mobile_Number"));
		permissionpage = registrationpage.pressRegContinueBtn();
		String actualResult= permissionpage.getTitlepermission();
		String expectedResult=getString().get("Permission_Page_Title");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		utils.log().info("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);

	}

	@AfterMethod
	public void afterMethod() {

	}


}

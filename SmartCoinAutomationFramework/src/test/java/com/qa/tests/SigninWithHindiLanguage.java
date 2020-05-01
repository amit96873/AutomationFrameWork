package com.qa.tests;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.BaseTest;
import com.qa.listeners.AllureListener;
import com.qa.pages.ConfirmYourPasswordPage;
import com.qa.pages.ContinueLoginWithFbPage;
import com.qa.pages.CreatePasswordPage;
import com.qa.pages.FacebookPage;
import com.qa.pages.HomePageSmartCoin;
import com.qa.pages.LanguagePage;
import com.qa.pages.PermissionPage;
import com.qa.pages.SignINWithGmailAndFacebookPage;
import com.qa.pages.SigninPage;
import com.qa.utils.TestUtils;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.InputStream;
import java.lang.reflect.Method;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
@Listeners({AllureListener.class})
public class SigninWithHindiLanguage extends BaseTest {
	SigninPage signinPage;
	LanguagePage languagePage;
	PermissionPage permissionpage;
	SignINWithGmailAndFacebookPage signINWithGmailAndFacebookPage;
	FacebookPage facebookpage;
	ContinueLoginWithFbPage continueloginwithfb;
	CreatePasswordPage createpasswordpage;
	ConfirmYourPasswordPage confirmyourpasswordpage;
	HomePageSmartCoin homepagesmartcoin;
	InputStream datais;
	JSONObject loginuser;
	TestUtils utils = new TestUtils();

	@BeforeClass
	public void beforeClass() throws Exception {
		try {
			String dataFileName = "data/loginuser.json";
			datais = getClass().getClassLoader().getResourceAsStream(dataFileName);
			JSONTokener tokener= new JSONTokener(datais);
			loginuser = new JSONObject(tokener);
			signinPage= new SigninPage();


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
		signinPage= new SigninPage();
		utils.log().info("\n"+"******** starting test:"+m.getName() + "********");
	}

	@AfterMethod
	public void afterMethod() {

	}

	@Test(priority=1, description="Verify Signin Button and after verification it will jump on Language page")
	@Description("Verify Signin Button and after verification it will jump on Language page")
	@Epic("EP0013")
	@Feature("Feature1: Verified Signin Button")
	@Story("Story: Clicked On Signin Button then its jumped on Language Page")
	@Step("Clicked On Signin Button and get Language Page")
	@Severity(SeverityLevel.MINOR)
	public void checkSignInButton() {
		SoftAssert sa= new SoftAssert();
		languagePage = signinPage.pressSignInBtn();
		String actualResult= languagePage.getTitle();
		String expectedResult=getString().get("Language_Page_Title");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		utils.log().info("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}

	@Test(priority=2, description="Verify Select Hindi language  Button and clicked on Continue With Hindi Language Button and after verification it will jump on Permission page")
	@Description("Verify Select Hindi language  Button and clicked on Continue With Hindi Language Button and after verification it will jump on Permission page")
	@Epic("EP0013")
	@Feature("Feature2: Select Hindi Language and clicked on Continue Button")
	@Story("Story: Select Hindi Language and then Clicked on continue button to get Permission Page")
	@Step("Select Hindi Language and Clicked On continue Button the get Permission Page")
	@Severity(SeverityLevel.MINOR)
	public void checkHindiLangButton() {
		SoftAssert sa= new SoftAssert();
		languagePage.pressHindiLangBtn();
		permissionpage = languagePage.pressContinueBtnSignin();
		String actualResult= permissionpage.getTitlepermission();
		String expectedResult=getString().get("Permission_Page_Title");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		utils.log().info("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}

	@Test(priority=3, description="Verified Agree_And Continue Button To Get The Permision Page Which Will Ask The Permission For Sending SMS")
	@Description("Verified Agree_And Continue Button To Get The Permision Page Which Will Ask The Permission For Sending SMS")
	@Epic("EP0013")
	@Feature("Feature3: Verified Agree and Continue Button")
	@Story("Story: Press On Agree_And_Continiue Button then Its Jumped On permission Page Which Will Ask the Permission For Sending SMS")
	@Step("Clicked On Agre_And_Continue Button")
	@Severity(SeverityLevel.MINOR)
	public void checkAgreeAndContinueButton() {
		SoftAssert sa= new SoftAssert();
		permissionpage.pressagreeAndContinuebtn();
		String actualResult= permissionpage.getTitleSms();
		String expectedResult=getString().get("SendSMS_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		utils.log().info("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}

	@Test(priority=4, description="Verified allow button to Give The Permission For Sending SMS")
	@Description("Verified allow button to Give The Permission For Sending SMS")
	@Epic("EP0013")
	@Feature("Feature4: Clicked On Allow Button To Give The Permission For Sending Sms")
	@Story("Story: Give the Permision For Sending SMS and Jumped On asking The Permission For Access Contacts")
	@Step("Clicked On Allow Button which will Give the Permission For Sending SMS")
	@Severity(SeverityLevel.MINOR)
	public void checkSmsAllowButton() {
		SoftAssert sa= new SoftAssert();
		permissionpage.pressallowButton();
		String actualResult= permissionpage.getTitleContats();
		String expectedResult=getString().get("Acces_Contacts_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		utils.log().info("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}
	@Test(priority=5, description="Verified allow button to Give The Permission For Access Contacts")
	@Description("Verified allow button to Give The Permission For Access Contacts")
	@Epic("EP0013")
	@Feature("Feature5: Clicked On Allow Button To Give The Permission For Access Contacts")
	@Story("Story: Give the Permision For Access Contacts and Jumped On next page which will ask The Permission For Manage Phone Calls")
	@Step("Clicked On Allow Button which will Give the Permission For Access Contacts")
	@Severity(SeverityLevel.MINOR)
	public void checkContactsAllowButton() {
		SoftAssert sa= new SoftAssert();
		permissionpage.pressallowButton();
		String actualResult= permissionpage.getTitlePhoneCall();
		String expectedResult=getString().get("managePhoneCalls_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		utils.log().info("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}
	@Test(priority=6, description="Verified allow button to Give The Permission For Manage Phone Calls")
	@Description("Verified allow button to Give The Permission For Manage Phone Calls")
	@Epic("EP0013")
	@Feature("Feature6: Clicked On Allow Button To Give The Permission For Manage Phone Calls")
	@Story("Story: Give the Permision For Manage Phone Calls and Jumped On next page which will ask The Permission For Location")
	@Step("Clicked On Allow Button Which Will Give The Permission For Manage Phone Calls")
	@Severity(SeverityLevel.MINOR)
	public void checkManagePhoneCallsAllowButton() {
		SoftAssert sa= new SoftAssert();
		permissionpage.pressallowButton();
		String actualResult= permissionpage.getTitleLocation();
		String expectedResult=getString().get("Location_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		utils.log().info("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}
	@Test(priority=7, description="Verified allow button to Give The Permission For Location")
	@Description("Verified allow button to Give The Permission For Location")
	@Epic("EP0013")
	@Feature("Feature7: Clicked On Allow Button Which Will Give The Permission For Location")
	@Story("Story: Give the Permision For Location and Jumped On next page which Should be Signin(Gmail/facebook)")
	@Step("Clicked On Allow Button Which Will Give The Permission For Location")
	@Severity(SeverityLevel.MINOR)
	public void checkLocationAllowButton() {
		SoftAssert sa= new SoftAssert();
		signINWithGmailAndFacebookPage =permissionpage.pressLastallowButton();
		String actualResult= signINWithGmailAndFacebookPage.getTitleSigninWithGmailFB();
		String expectedResult=getString().get("signinwithgmailfb_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		utils.log().info("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}
	@Test(priority=8, description="Verified Login With Facebook Button And Get Facebook Page For Login By Username and Password")
	@Description("Verified Login With Facebook Button And Get Facebook Page For Login By Username and Password")
	@Epic("EP0013")
	@Feature("Feature8: Clicked Login With Facebook Button And Get Facebook Page For Login By Username and Password")
	@Story("Story: Clicked On Login With Facebook Button And Get Facebook Page For Login By Username and Password")
	@Step("Clicked on Login With Facebook Button")
	@Severity(SeverityLevel.MINOR)
	public void checkFBLoginButton() {
		SoftAssert sa= new SoftAssert();
		facebookpage = signINWithGmailAndFacebookPage.pressfacebookbtn();
		String actualResult= facebookpage.getTitleFacebookPage();
		String expectedResult=getString().get("facebookpage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		utils.log().info("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}
	@Test(priority=9, description="Verified(EditText By Enter FaceBook_UserName And Facebook_Password and Clicked On Login Button)")
	@Description("Verified(EditText By Enter FaceBook_UserName And Facebook_Password and Clicked On Login Button)")
	@Epic("EP0013")
	@Feature("Feature9: Enter FaceBook_UserName And Facebook_Password and Clicked On Login Button")
	@Story("Story: Verified(EditText By Enter FaceBook_UserName And Facebook_Password and Clicked On Login Button Which Should get Continue With Fb Page)")
	@Step("Enter FaceBook_UserName And Facebook_Password and Clicked On Login Button")
	@Severity(SeverityLevel.MINOR)
	public void checkFBLoginPage() {
		SoftAssert sa= new SoftAssert();
		facebookpage.enterUserName(loginuser.getJSONObject("fbusernamepassword").getString("username"));
		facebookpage.enterPassword(loginuser.getJSONObject("fbusernamepassword").getString("password"));
		continueloginwithfb = facebookpage.pressLoginbtn();
		String actualResult= continueloginwithfb.getTitleContinueloginWithFB();
		String expectedResult=getString().get("ContinueLoginWithfacebookpage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		utils.log().info("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}
	@Test(priority=10, description="Verified Continue Fb Button")
	@Description("Verified Continue Fb Button")
	@Epic("EP0013")
	@Feature("Feature10: Clicked on Continue Fb Button")
	@Story("Story: Clicked on Continue Fb Button and get Create Password Page")
	@Step("Clicked On Continue Button")
	@Severity(SeverityLevel.MINOR)
	public void checkContinueLoginWithFBBtn() {
		SoftAssert sa= new SoftAssert();
		createpasswordpage = continueloginwithfb.presscontinuebtn();
		String actualResult= createpasswordpage.getTitleCreatePassword();
		String expectedResult=getString().get("createpasswordPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		utils.log().info("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}
	@Test(priority=11, description="Verified Create Password By Enter 4 Digits Password(1,2,3,4)")
	@Description("Verified Create Password By Enter 4 Digits Password(1,2,3,4)")
	@Epic("EP0013")
	@Feature("Feature11: Create Password By Enter 4 Digits Password(1,2,3,4)")
	@Story("Story: Verified Create Password By Enter 4 Digits Password(1,2,3,4) and after Ener 4th Digit Password Its Should jump on Confirm Password Page")
	@Step("Create Password By Enter 4 Digits Password(1,2,3,4)")
	@Severity(SeverityLevel.MINOR)
	public void checkCreatePassword() {
		SoftAssert sa= new SoftAssert();
		createpasswordpage.pressOne();
		createpasswordpage.pressTwo();
		createpasswordpage.pressThree();
		confirmyourpasswordpage = createpasswordpage.pressFour4();
		String actualResult= confirmyourpasswordpage.getTitleConfirmPassword();
		String expectedResult=getString().get("confirmpasswordPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		utils.log().info("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}

	@Test(priority=12, description="Verified Confirm Password By Enter Same Password(1,2,3,4)")
	@Description("Verified Confirm Password By Enter Same Password(1,2,3,4)")
	@Epic("EP0013")
	@Feature("Feature12: Confirm Password By Enter Same Password(1,2,3,4)")
	@Story("Story: Verified Confirm Password By Enter Same Password(1,2,3,4) and After Enter 4th Digits Password It Should Jump on Home Page")
	@Step("Simple Confirm Password By Enter Same Password(1,2,3,4)")
	@Severity(SeverityLevel.MINOR)
	public void checkConfirmPassword() {
		SoftAssert sa= new SoftAssert();
		confirmyourpasswordpage.pressOne();
		confirmyourpasswordpage.pressTwo();
		confirmyourpasswordpage.pressThree();
		homepagesmartcoin = confirmyourpasswordpage.pressFour4();
		String actualResult10= homepagesmartcoin.getTitleHomePage();
		String expectedResult10=getString().get("homePage_Title_Text");
		Assert.assertEquals(actualResult10, expectedResult10);
		sa.assertAll();
		utils.log().info("actual title - " + actualResult10 + "\n" + "expected title - "+expectedResult10);
	}

}

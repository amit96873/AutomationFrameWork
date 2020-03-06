package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.qa.BaseTest;
import com.qa.pages.ConfirmYourPasswordPage;
import com.qa.pages.ContinueLoginWithFbPage;
import com.qa.pages.CreatePasswordPage;
import com.qa.pages.FacebookPage;
import com.qa.pages.HomePageSmartCoin;
import com.qa.pages.LanguagePage;
import com.qa.pages.PermissionPage;
import com.qa.pages.SignINWithGmailAndFacebookPage;
import com.qa.pages.SigninPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.InputStream;
import java.lang.reflect.Method;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class SigninSigninButtonTests extends BaseTest {
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
		System.out.println("\n"+"******** starting test:"+m.getName() + "********");
	}

	@AfterMethod
	public void afterMethod() {
		
	}

	
	@Test
	public void checkSignInButton() {
		SoftAssert sa= new SoftAssert();
		languagePage = signinPage.pressSignInBtn();
		String actualResult= languagePage.getTitle();
		String expectedResult=strings.get("Language_Page_Title");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}

	@Test
	public void checkEnglishLangButton() {
		SoftAssert sa= new SoftAssert();
		languagePage = signinPage.pressSignInBtn();
		languagePage.pressEnglishLangBtn();
		permissionpage = languagePage.pressContinueBtnSignin();
		String actualResult= permissionpage.getTitlepermission();
		String expectedResult=strings.get("Permission_Page_Title");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}
	@Test
	public void checkHindiLangButton() {
		SoftAssert sa= new SoftAssert();
		languagePage = signinPage.pressSignInBtn();
		languagePage.pressHindiLangBtn();
		permissionpage = languagePage.pressContinueBtnSignin();
		String actualResult= permissionpage.getTitlepermission();
		String expectedResult=strings.get("Permission_Page_Title");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}
	@Test
	public void checkOtherLangButton() {
		SoftAssert sa= new SoftAssert();
		languagePage = signinPage.pressSignInBtn();
		languagePage.pressOtherLangBtn();
		permissionpage = languagePage.pressContinueBtnSignin();
		String actualResult= permissionpage.getTitlepermission();
		String expectedResult=strings.get("Permission_Page_Title");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}
	
	@Test
	public void checkAgreeAndContinueButton() {
		SoftAssert sa= new SoftAssert();
		languagePage = signinPage.pressSignInBtn();
		languagePage.pressEnglishLangBtn();
		permissionpage = languagePage.pressContinueBtnSignin();
		permissionpage.pressagreeAndContinuebtn();
		String actualResult= permissionpage.getTitleSms();
		String expectedResult=strings.get("SendSMS_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}
	
	@Test
	public void checkSmsAllowButton() {
		SoftAssert sa= new SoftAssert();
		languagePage = signinPage.pressSignInBtn();
		languagePage.pressEnglishLangBtn();
		permissionpage = languagePage.pressContinueBtnSignin();
		permissionpage.pressagreeAndContinuebtn();
		permissionpage.pressallowButton();
		String actualResult= permissionpage.getTitleContats();
		String expectedResult=strings.get("Acces_Contacts_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}
	@Test
	public void checkContactsAllowButton() {
		SoftAssert sa= new SoftAssert();
		languagePage = signinPage.pressSignInBtn();
		languagePage.pressEnglishLangBtn();
		permissionpage = languagePage.pressContinueBtnSignin();
		permissionpage.pressagreeAndContinuebtn();
		permissionpage.pressallowButton();
		permissionpage.pressallowButton();
		String actualResult= permissionpage.getTitlePhoneCall();
		String expectedResult=strings.get("managePhoneCalls_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}
	@Test
	public void checkManagePhoneCallsAllowButton() {
		SoftAssert sa= new SoftAssert();
		languagePage = signinPage.pressSignInBtn();
		languagePage.pressEnglishLangBtn();
		permissionpage = languagePage.pressContinueBtnSignin();
		permissionpage.pressagreeAndContinuebtn();
		permissionpage.pressallowButton();
		permissionpage.pressallowButton();
		permissionpage.pressallowButton();
		String actualResult= permissionpage.getTitleLocation();
		String expectedResult=strings.get("Location_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}
	@Test
	public void checkLocationAllowButton() {
		SoftAssert sa= new SoftAssert();
		languagePage = signinPage.pressSignInBtn();
		languagePage.pressEnglishLangBtn();
		permissionpage = languagePage.pressContinueBtnSignin();
		permissionpage.pressagreeAndContinuebtn();
		permissionpage.pressallowButton();
		permissionpage.pressallowButton();
		permissionpage.pressallowButton();
		signINWithGmailAndFacebookPage =permissionpage.pressLastallowButton();
		String actualResult= signINWithGmailAndFacebookPage.getTitleSigninWithGmailFB();
		String expectedResult=strings.get("signinwithgmailfb_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}
	@Test
	public void checkFBLoginButton() {
		SoftAssert sa= new SoftAssert();
		languagePage = signinPage.pressSignInBtn();
		languagePage.pressEnglishLangBtn();
		permissionpage = languagePage.pressContinueBtnSignin();
		permissionpage.pressagreeAndContinuebtn();
		permissionpage.pressallowButton();
		permissionpage.pressallowButton();
		permissionpage.pressallowButton();
		signINWithGmailAndFacebookPage =permissionpage.pressLastallowButton();
		facebookpage = signINWithGmailAndFacebookPage.pressfacebookbtn();
		String actualResult= facebookpage.getTitleFacebookPage();
		String expectedResult=strings.get("facebookpage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}
	@Test
	public void checkFBLoginPage() {
		SoftAssert sa= new SoftAssert();
		languagePage = signinPage.pressSignInBtn();
		languagePage.pressEnglishLangBtn();
		permissionpage = languagePage.pressContinueBtnSignin();
		permissionpage.pressagreeAndContinuebtn();
		permissionpage.pressallowButton();
		permissionpage.pressallowButton();
		permissionpage.pressallowButton();
		signINWithGmailAndFacebookPage =permissionpage.pressLastallowButton();
		facebookpage = signINWithGmailAndFacebookPage.pressfacebookbtn();
		facebookpage.enterUserName(loginuser.getJSONObject("fbusernamepassword").getString("username"));
		facebookpage.enterPassword(loginuser.getJSONObject("fbusernamepassword").getString("password"));
		continueloginwithfb = facebookpage.pressLoginbtn();
		String actualResult= continueloginwithfb.getTitleContinueloginWithFB();
		String expectedResult=strings.get("ContinueLoginWithfacebookpage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}
	@Test
	public void checkContinueLoginWithFBBtn() {
		SoftAssert sa= new SoftAssert();
		languagePage = signinPage.pressSignInBtn();
		languagePage.pressEnglishLangBtn();
		permissionpage = languagePage.pressContinueBtnSignin();
		permissionpage.pressagreeAndContinuebtn();
		permissionpage.pressallowButton();
		permissionpage.pressallowButton();
		permissionpage.pressallowButton();
		signINWithGmailAndFacebookPage =permissionpage.pressLastallowButton();
		facebookpage = signINWithGmailAndFacebookPage.pressfacebookbtn();
		facebookpage.enterUserName(loginuser.getJSONObject("fbusernamepassword").getString("username"));
		facebookpage.enterPassword(loginuser.getJSONObject("fbusernamepassword").getString("password"));
		continueloginwithfb = facebookpage.pressLoginbtn();
		createpasswordpage = continueloginwithfb.presscontinuebtn();
		String actualResult= createpasswordpage.getTitleCreatePassword();
		String expectedResult=strings.get("createpasswordPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}
	@Test
	public void checkCreatePassword() {
		SoftAssert sa= new SoftAssert();
		languagePage = signinPage.pressSignInBtn();
		languagePage.pressEnglishLangBtn();
		permissionpage = languagePage.pressContinueBtnSignin();
		permissionpage.pressagreeAndContinuebtn();
		permissionpage.pressallowButton();
		permissionpage.pressallowButton();
		permissionpage.pressallowButton();
		signINWithGmailAndFacebookPage =permissionpage.pressLastallowButton();
		facebookpage = signINWithGmailAndFacebookPage.pressfacebookbtn();
		facebookpage.enterUserName(loginuser.getJSONObject("fbusernamepassword").getString("username"));
		facebookpage.enterPassword(loginuser.getJSONObject("fbusernamepassword").getString("password"));
		continueloginwithfb = facebookpage.pressLoginbtn();
		createpasswordpage = continueloginwithfb.presscontinuebtn();
		createpasswordpage.pressOne();
		createpasswordpage.pressTwo();
		createpasswordpage.pressThree();
		confirmyourpasswordpage = createpasswordpage.pressFour4();
		String actualResult= confirmyourpasswordpage.getTitleConfirmPassword();
		String expectedResult=strings.get("confirmpasswordPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
	}
	
	@Test
	public void checkConfirmPassword() {
		SoftAssert sa= new SoftAssert();
		languagePage = signinPage.pressSignInBtn();
		String actualResult= languagePage.getTitle();
		String expectedResult=strings.get("Language_Page_Title");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
		languagePage.pressEnglishLangBtn();
		permissionpage = languagePage.pressContinueBtnSignin();
		String actualResult01= permissionpage.getTitlepermission();
		String expectedResult01=strings.get("Permission_Page_Title");
		Assert.assertEquals(actualResult01, expectedResult01);
		sa.assertAll();
		System.out.println("actual title - " + actualResult01 + "\n" + "expected title - "+expectedResult01);
		permissionpage.pressagreeAndContinuebtn();
		String actualResult1= permissionpage.getTitleSms();
		String expectedResult1=strings.get("SendSMS_Title_Text");
		Assert.assertEquals(actualResult1, expectedResult1);
		sa.assertAll();
		System.out.println("actual title - " + actualResult1 + "\n" + "expected title - "+expectedResult1);
		permissionpage.pressallowButton();
		String actualResult2= permissionpage.getTitleContats();
		String expectedResult2=strings.get("Acces_Contacts_Title_Text");
		Assert.assertEquals(actualResult2, expectedResult2);
		sa.assertAll();
		System.out.println("actual title - " + actualResult2 + "\n" + "expected title - "+expectedResult2);
		permissionpage.pressallowButton();
		String actualResult3= permissionpage.getTitlePhoneCall();
		String expectedResult3=strings.get("managePhoneCalls_Title_Text");
		Assert.assertEquals(actualResult3, expectedResult3);
		sa.assertAll();
		System.out.println("actual title - " + actualResult3 + "\n" + "expected title - "+expectedResult3);
		permissionpage.pressallowButton();
		signINWithGmailAndFacebookPage =permissionpage.pressLastallowButton();
		String actualResult5= signINWithGmailAndFacebookPage.getTitleSigninWithGmailFB();
		String expectedResult5=strings.get("signinwithgmailfb_Title_Text");
		Assert.assertEquals(actualResult5, expectedResult5);
		sa.assertAll();
		System.out.println("actual title - " + actualResult5 + "\n" + "expected title - "+expectedResult5);
		facebookpage = signINWithGmailAndFacebookPage.pressfacebookbtn();
		String actualResult6= facebookpage.getTitleFacebookPage();
		String expectedResult6=strings.get("facebookpage_Title_Text");
		Assert.assertEquals(actualResult6, expectedResult6);
		sa.assertAll();
		System.out.println("actual title - " + actualResult6 + "\n" + "expected title - "+expectedResult6);
		facebookpage.enterUserName(loginuser.getJSONObject("fbusernamepassword").getString("username"));
		facebookpage.enterPassword(loginuser.getJSONObject("fbusernamepassword").getString("password"));
		continueloginwithfb = facebookpage.pressLoginbtn();
		String actualResult7= continueloginwithfb.getTitleContinueloginWithFB();
		String expectedResult7=strings.get("ContinueLoginWithfacebookpage_Title_Text");
		Assert.assertEquals(actualResult7, expectedResult7);
		sa.assertAll();
		System.out.println("actual title - " + actualResult7 + "\n" + "expected title - "+expectedResult7);
		createpasswordpage = continueloginwithfb.presscontinuebtn();
		String actualResult8= createpasswordpage.getTitleCreatePassword();
		String expectedResult8=strings.get("createpasswordPage_Title_Text");
		Assert.assertEquals(actualResult8, expectedResult8);
		sa.assertAll();
		System.out.println("actual title - " + actualResult8 + "\n" + "expected title - "+expectedResult8);
		createpasswordpage.pressOne();
		createpasswordpage.pressTwo();
		createpasswordpage.pressThree();
		confirmyourpasswordpage = createpasswordpage.pressFour4();
		String actualResult9= confirmyourpasswordpage.getTitleConfirmPassword();
		String expectedResult9=strings.get("confirmpasswordPage_Title_Text");
		Assert.assertEquals(actualResult9, expectedResult9);
		sa.assertAll();
		System.out.println("actual title - " + actualResult9 + "\n" + "expected title - "+expectedResult9);
		confirmyourpasswordpage.pressOne();
		confirmyourpasswordpage.pressTwo();
		confirmyourpasswordpage.pressThree();
		homepagesmartcoin = confirmyourpasswordpage.pressFour4();
		String actualResult10= homepagesmartcoin.getTitleHomePage();
		String expectedResult10=strings.get("homePage_Title_Text");
		Assert.assertEquals(actualResult10, expectedResult10);
		sa.assertAll();
		System.out.println("actual title - " + actualResult10 + "\n" + "expected title - "+expectedResult10);
	}
	
}

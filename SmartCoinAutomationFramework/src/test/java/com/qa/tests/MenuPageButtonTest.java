package com.qa.tests;
import java.io.InputStream;
import java.lang.reflect.Method;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.qa.BaseTest;
import com.qa.listeners.AllureListener;
import com.qa.pages.ApplyForLoan;
import com.qa.pages.ChatPage;
import com.qa.pages.ConfirmYourPasswordPage;
import com.qa.pages.ContinueLoginWithFbPage;
import com.qa.pages.CreatePasswordPage;
import com.qa.pages.EnterPasswordPage;
import com.qa.pages.FacebookPage;
import com.qa.pages.HelpAndSupportPage;
import com.qa.pages.HomePageSmartCoin;
import com.qa.pages.LanguagePage;
import com.qa.pages.MenuPage;
import com.qa.pages.MobileNumberOTPVerificationPage;
import com.qa.pages.MyKhataPage;
import com.qa.pages.MyLoansPage;
import com.qa.pages.MyProfilePage;
import com.qa.pages.PermissionPage;
import com.qa.pages.SignINWithGmailAndFacebookPage;
import com.qa.pages.SigninPage;
import com.qa.pages.SmartCoinRewardsPage;
import com.qa.pages.UploadBankStatementsPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

@Listeners({AllureListener.class})
public class MenuPageButtonTest extends BaseTest {
	SigninPage signinPage;
	LanguagePage languagePage;
	PermissionPage permissionpage;
	SignINWithGmailAndFacebookPage signINWithGmailAndFacebookPage;
	FacebookPage facebookpage;
	ContinueLoginWithFbPage continueloginwithfb;
	CreatePasswordPage createpasswordpage;
	ConfirmYourPasswordPage confirmyourpasswordpage;
	HomePageSmartCoin homepagesmartcoin;
	EnterPasswordPage enterpasswordpage;
	UploadBankStatementsPage bankstatementpage;
	MenuPage menupage;
	ChatPage chatpage;
	SmartCoinRewardsPage rewardspage;
	MobileNumberOTPVerificationPage mobilenumberotpverificationpage;
	MyKhataPage mykhatapage;
	MyProfilePage myprofilepage;
	HelpAndSupportPage helpandsupportpage;
	MyLoansPage myloanspage;
	ApplyForLoan applyforloan;
	InputStream datais;
	JSONObject loginuser;


	@BeforeClass
	public void beforeClass() throws Exception {
		try {
			String dataFileName = "data/loginuser.json";
			datais = getClass().getClassLoader().getResourceAsStream(dataFileName);
			JSONTokener tokener= new JSONTokener(datais);
			loginuser = new JSONObject(tokener);
			enterpasswordpage = new EnterPasswordPage();


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
		enterpasswordpage = new EnterPasswordPage();
		System.out.println("\n"+"******** starting test:"+m.getName() + "********");
	}

	@AfterMethod
	public void afterMethod() {

	}

	@Test(priority=1, description="Verify Home Page Scrolling")
	@Description("Verify Home Page Scrolling")
	@Epic("EP001")
	@Feature("Feature1: HomePage Scrolling")
	@Story("Story: Scroll the home page on both side up and down")
	@Step("Simple Scrolling")
	@Severity(SeverityLevel.MINOR)
	public void checkHomePageScrolling() {
		SoftAssert sa= new SoftAssert();
		enterpasswordpage.pressOne();
		enterpasswordpage.pressTwo();
		enterpasswordpage.pressThree();
		homepagesmartcoin = enterpasswordpage.pressFour4();
		String actualResult= homepagesmartcoin.getTitleHomePage();
		String expectedResult=strings.get("homePage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);	
		homepagesmartcoin.scrollUp();
		homepagesmartcoin.scrollDown();

	}

	@Test(priority=2, description="Verify Home Page Menu Button")
	@Description("Verify Home Page Menu Button")
	@Epic("EP001")
	@Feature("Feature2: Verify Menu Button")
	@Story("Story: verify the Menu Button which is peresence on Home Page")
	@Step("Checked Menu Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkHomeButton() {
		SoftAssert sa= new SoftAssert();
		menupage = homepagesmartcoin.pressMenuBtn();
		String actualResult= menupage.getTitleMenuePage();
		String expectedResult=strings.get("menuPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);	
		homepagesmartcoin = menupage.pressHomeBtn();
		String actualResult1= homepagesmartcoin.getTitleHomePage();
		String expectedResult1=strings.get("homePage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult1 + "\n" + "expected title - "+expectedResult1);	
	}
	@Test(priority=2, description="Verify Home Page Menu Button")
	@Description("Verify Home Page Menu Button")
	@Epic("EP001")
	@Feature("Feature2: Verify Menu Button")
	@Story("Story: verify the Menu Button which is peresence on Home Page")
	@Step("Checked Menu Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkMyLoansButton() {
		SoftAssert sa= new SoftAssert();
		menupage = homepagesmartcoin.pressMenuBtn();
		String actualResult= menupage.getTitleMenuePage();
		String expectedResult=strings.get("menuPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
		myloanspage = menupage.pressMyLoanBtn();
		String actualResult1= myloanspage.getMyloanPageTitle();
		String expectedResult1=strings.get("myloansPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult1 + "\n" + "expected title - "+expectedResult1);
	}
	@Test(priority=2, description="Verify Home Page Menu Button")
	@Description("Verify Home Page Menu Button")
	@Epic("EP001")
	@Feature("Feature2: Verify Menu Button")
	@Story("Story: verify the Menu Button which is peresence on Home Page")
	@Step("Checked Menu Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkMyProfileButton() {
		SoftAssert sa= new SoftAssert();
		menupage = homepagesmartcoin.pressMenuBtn();
		String actualResult= menupage.getTitleMenuePage();
		String expectedResult=strings.get("menuPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
		myprofilepage = menupage.pressMyProfileBtn();
		String actualResult1= myprofilepage.getMyProfilePageTitle();
		String expectedResult1=strings.get("myloansPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult1 + "\n" + "expected title - "+expectedResult1);
	}
	
}

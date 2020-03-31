package com.qa.tests;

import java.io.InputStream;
import java.lang.reflect.Method;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
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
public class HomePageButtonTests extends BaseTest {
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
	@Epic("EP002")
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
		String expectedResult=getString().get("homePage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);	
		homepagesmartcoin.scrollUp();
		homepagesmartcoin.scrollDown();

	}

	@Test(priority=2, description="Verify Home Page Menu Button")
	@Description("Verify Home Page Menu Button")
	@Epic("EP002")
	@Feature("Feature2: Verify Menu Button")
	@Story("Story: verify the Menu Button which is peresence on Home Page")
	@Step("Checked Menu Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkMenueButton() {
		SoftAssert sa= new SoftAssert();
		menupage = homepagesmartcoin.pressMenuBtn();
		String actualResult= menupage.getTitleMenuePage();
		String expectedResult=getString().get("menuPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);	
}

	@Test(priority=3, description="Verify Home Page Chat ShortCut Button")
	@Description("Verify Home Page Chat ShortCut Button")
	@Epic("EP002")
	@Feature("Feature3: Verify Chat ShortCut Button")
	@Story("Story: verify the Chat ShortCut Button which is peresence on Home Page")
	@Step("Checked Chat ShortCut Button of Home Page")
	@Severity(SeverityLevel.NORMAL)
	public void checkChatShortCutButton() {
		SoftAssert sa= new SoftAssert();
		homepagesmartcoin =menupage.pressHomeBtn();
		String actualResult1= homepagesmartcoin.getTitleHomePage();
		String expectedResult1=getString().get("homePage_Title_Text");
		Assert.assertEquals(actualResult1, expectedResult1);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult1 + "\n" + "expected title - "+expectedResult1);	
		chatpage = homepagesmartcoin.pressChatShortCutBtn();
		String actualResult= chatpage.getTitlechatPageTitle();
		String expectedResult=getString().get("chatpage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);	
	}

	@Test(priority=4, description="Verify Home Page Mobile Number Verify Button")
	@Description("Verify Home Page Mobile Number Verify Button")
	@Epic("EP002")
	@Feature("Feature4: Verify Mobile Number Verify Button")
	@Story("Story: verify the Mobile Number Verify Button which is peresence on Home Page")
	@Step("Checked Verify Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkVerifyMobileNumberButton() {
		SoftAssert sa= new SoftAssert();
		homepagesmartcoin =chatpage.pressReverseBtn();
		String actualResultb= homepagesmartcoin.getTitleHomePage();
		String expectedResultb=getString().get("homePage_Title_Text");
		Assert.assertEquals(actualResultb, expectedResultb);
		sa.assertAll();	
		System.out.println("actual title - " + actualResultb + "\n" + "expected title - "+expectedResultb);	
		mobilenumberotpverificationpage = homepagesmartcoin.pressVerifyMobileNumberBtn();
		String actualResult= mobilenumberotpverificationpage.getNumberVerificationsPageTitle();
		String expectedResult=getString().get("numberverification_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);	
		
	}

	@Test(priority=5, description="Verify Home Page Bank Account Statement Upload Button")
	@Description("Verify Home Page Bank Account Statement Upload Button")
	@Epic("EP002")
	@Feature("Feature5: Verify Upload Button")
	@Story("Story: verify the Upload Button which is peresence on Home Page")
	@Step("Checked Upload Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkUploadBankAccountStatementButton() {
		SoftAssert sa= new SoftAssert();
		homepagesmartcoin =mobilenumberotpverificationpage.pressReversebtn();
		String actualResultb= homepagesmartcoin.getTitleHomePage();
		String expectedResultb=getString().get("homePage_Title_Text");
		Assert.assertEquals(actualResultb, expectedResultb);
		sa.assertAll();	
		System.out.println("actual title - " + actualResultb + "\n" + "expected title - "+expectedResultb);	
		bankstatementpage = homepagesmartcoin.pressUploadBankStatementBtn();
		String actualResult= bankstatementpage.getBankStatementPageTitle();
		String expectedResult=getString().get("bankstatementpage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);	
		    	
	}

	@Test(priority=6, description="Verify Home Page Earn  Button")
	@Description("Verify Home Page Earn Button")
	@Epic("EP002")
	@Feature("Feature6: Verify Earn Button")
	@Story("Story: verify the Earn Button which is peresence on Home Page")
	@Step("Checked Earn Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkEarnCoinsButton() {
		SoftAssert sa= new SoftAssert();
		homepagesmartcoin =bankstatementpage.pressReverseBtn();
		String actualResultb= homepagesmartcoin.getTitleHomePage();
		String expectedResultb=getString().get("homePage_Title_Text");
		Assert.assertEquals(actualResultb, expectedResultb);
		sa.assertAll();	
		System.out.println("actual title - " + actualResultb + "\n" + "expected title - "+expectedResultb);	
		rewardspage = homepagesmartcoin.pressEarnBtn();
		String actualResult= rewardspage.getCoinRewardsPageTitle();
		String expectedResult=getString().get("SmartCoinRewardsPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);	
		homepagesmartcoin =rewardspage.pressReverseButton();
		
	}

	@Test(priority=7, description="Verify Home Page MyKhata Button")
	@Description("Verify Home Page MyKhata Button")
	@Epic("EP002")
	@Feature("Feature7: Verify MyKhata Button")
	@Story("Story: verify the MyKhata Button which is peresence on Home Page")
	@Step("Checked MyKhata Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkMyKhataButton() {
		SoftAssert sa= new SoftAssert();
		String actualResultb= homepagesmartcoin.getTitleHomePage();
		String expectedResultb=getString().get("homePage_Title_Text");
		Assert.assertEquals(actualResultb, expectedResultb);
		sa.assertAll();	
		System.out.println("actual title - " + actualResultb + "\n" + "expected title - "+expectedResultb);	
		homepagesmartcoin.scrollUp();
		mykhatapage = homepagesmartcoin.pressMyKhataBtn();
		String actualResult= mykhatapage.getMyKhataPageTitle();
		String expectedResult=getString().get("mykhataPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);	


	}

	@Test(priority=8, description="Verify Home Page MyProfile Button")
	@Description("Verify Home Page MyProfile Button")
	@Epic("EP002")
	@Feature("Feature8: Verify MyProfile Button")
	@Story("Story: verify the MyProfile Button which is peresence on Home Page")
	@Step("Checked MyProfile Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkMyProfileButton() {
		SoftAssert sa= new SoftAssert();
		homepagesmartcoin =mykhatapage.pressReverseBtn();
		String actualResultb= homepagesmartcoin.getTitleHomePage();
		String expectedResultb=getString().get("homePage_Title_Text");
		Assert.assertEquals(actualResultb, expectedResultb);
		sa.assertAll();	
		System.out.println("actual title - " + actualResultb + "\n" + "expected title - "+expectedResultb);	
		homepagesmartcoin.scrollUp();
		myprofilepage = homepagesmartcoin.pressMyProfileBtn();
		String actualResult= myprofilepage.getMyProfilePageTitle();
		String expectedResult=getString().get("myprofilePage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);	
		
	}

	@Test(priority=9, description="Verify Home Page ContactUs Button")
	@Description("Verify Home Page ContactUs Button")
	@Epic("EP002")
	@Feature("Feature9: Verify ContactUs Button")
	@Story("Story: verify the ContactUs Button which is peresence on Home Page")
	@Step("Checked ContactUs Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkContactUsButton() {
		SoftAssert sa= new SoftAssert();
		homepagesmartcoin =myprofilepage.pressReverseBtn();
		String actualResultb= homepagesmartcoin.getTitleHomePage();
		String expectedResultb=getString().get("homePage_Title_Text");
		Assert.assertEquals(actualResultb, expectedResultb);
		sa.assertAll();	
		System.out.println("actual title - " + actualResultb + "\n" + "expected title - "+expectedResultb);	
		homepagesmartcoin.scrollUp();
		helpandsupportpage = homepagesmartcoin.pressContactUsBtn();
		String actualResult= helpandsupportpage.getHelpAndSupportPageTitle();
		String expectedResult=getString().get("helpandsupportPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);	

	}

}

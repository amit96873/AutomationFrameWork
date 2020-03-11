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
import com.qa.pages.AllTransactionPage;
import com.qa.pages.ApplyForLoan;
import com.qa.pages.BankAccountPendingPage;
import com.qa.pages.ChatPage;
import com.qa.pages.ConfirmYourPasswordPage;
import com.qa.pages.ContinueLoginWithFbPage;
import com.qa.pages.CreatePasswordPage;
import com.qa.pages.EnterPasswordPage;
import com.qa.pages.FAQPage;
import com.qa.pages.FacebookPage;
import com.qa.pages.HelpAndSupportPage;
import com.qa.pages.HomePageSmartCoin;
import com.qa.pages.LanguagePage;
import com.qa.pages.LanguageSettingPage;
import com.qa.pages.MenuPage;
import com.qa.pages.MobileNumberOTPVerificationPage;
import com.qa.pages.MyBankDetailsPage;
import com.qa.pages.MyKhataPage;
import com.qa.pages.MyLoansPage;
import com.qa.pages.MyProfilePage;
import com.qa.pages.PermissionPage;
import com.qa.pages.SignINWithGmailAndFacebookPage;
import com.qa.pages.SigninPage;
import com.qa.pages.SmartCoinRewardsPage;
import com.qa.pages.TroubleShootPage;
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
	BankAccountPendingPage bankaccountpendingpage;
	AllTransactionPage alltransactionpage;
	FAQPage faqpage;
	LanguageSettingPage languagesettingpage;
	TroubleShootPage troubleshootpage;
	MyBankDetailsPage mybankdetailspage;
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
	@Epic("EP003")
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

	@Test(priority=2, description="Verify Home Button which is peresence on Menu Page")
	@Description("Verify Home Button which is peresence on Menu Page")
	@Epic("EP003")
	@Feature("Feature2: Verify Home Button")
	@Story("Story: verify the Home Button and its completely working fine after click on the Home Button we suppose to get Home Page and that we can see in screenshot")
	@Step("Checked Home Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkMenuPageHomeButton() {
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
	@Test(priority=3, description="Verify My_Loans Button which is peresence on Menu Page")
	@Description("Verify My_Loans Button which is peresence on Menu Page")
	@Epic("EP003")
	@Feature("Feature3: Verify My_Loans Button")
	@Story("Story: verify the My_Loans Button and after click on the My_Loans button it should jump on My_Loans page that we can see in screen shot")
	@Step("Checked My_Loans Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkMenuPageMyLoansButton() {
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
	@Test(priority=4, description="Verify My_Profile Button which is peresence on Menu Page")
	@Description("Verify My_Profile Button which is peresence on Menu Page")
	@Epic("EP003")
	@Feature("Feature4: Verify My_Profile Button")
	@Story("Story: verify the My_Profile Button and after clicked on the My_Profile Button it should jump on My profile page that we can check with the screenshot")
	@Step("Checked My_Profile Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkMenuPageMyProfileButton() {
		SoftAssert sa= new SoftAssert();
		homepagesmartcoin=myloanspage.pressReverseBtn();
		String actualResult1= homepagesmartcoin.getTitleHomePage();
		String expectedResult1=strings.get("homePage_Title_Text");
		Assert.assertEquals(actualResult1, expectedResult1);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult1 + "\n" + "expected title - "+expectedResult1);
		menupage = homepagesmartcoin.pressMenuBtn();
		String actualResult= menupage.getTitleMenuePage();
		String expectedResult=strings.get("menuPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
		myprofilepage = menupage.pressMyProfileBtn();
		String actualResult2= myprofilepage.getMyProfilePageTitle();
		String expectedResult2=strings.get("myprofilePage_Title_Text");
		Assert.assertEquals(actualResult2, expectedResult2);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult2 + "\n" + "expected title - "+expectedResult2);
	}
	
	@Test(priority=5, description="Verify All_Transaction Button which is peresence on Menu Page")
	@Description("Verify All_Transaction Button which is peresence on Menu Page")
	@Epic("EP003")
	@Feature("Feature5: Verify All_Transaction Button")
	@Story("Story: verify the All_Transaction Button and checked after clicked on the All_Transaction buttont its get jumped on All_Transaction page")
	@Step("Checked All_Transaction Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkMenuPageAllTransactionButton() {
		SoftAssert sa= new SoftAssert();
		homepagesmartcoin = myprofilepage.pressReverseBtn();
		String actualResult1= homepagesmartcoin.getTitleHomePage();
		String expectedResult1=strings.get("homePage_Title_Text");
		Assert.assertEquals(actualResult1, expectedResult1);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult1 + "\n" + "expected title - "+expectedResult1);
		menupage = homepagesmartcoin.pressMenuBtn();
		String actualResult= menupage.getTitleMenuePage();
		String expectedResult=strings.get("menuPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
		alltransactionpage = menupage.pressAllTransactionBtn();
		String actualResult2= alltransactionpage.getAllTransactionPageTitle();
		String expectedResult2=strings.get("alltransactionPage_Title_Text");
		Assert.assertEquals(actualResult2, expectedResult2);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult2 + "\n" + "expected title - "+expectedResult2);
	}
	@Test(priority=6, description="Verify Help_And_Support Button which is peresence on Menu Page")
	@Description("Verify Help_And_Support Button which is peresence on Menu Page")
	@Epic("EP003")
	@Feature("Feature6: Verify Help_And_Support Button")
	@Story("Story: verify the Help_And_Support Button and after clicked on the Help_And_Support button its get jumped on help and support page")
	@Step("Checked Help_And_Support Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkMenuPageHelpAndSupportButton() {
		SoftAssert sa= new SoftAssert();
		homepagesmartcoin = alltransactionpage.pressReverseBtn();
		String actualResult1= homepagesmartcoin.getTitleHomePage();
		String expectedResult1=strings.get("homePage_Title_Text");
		Assert.assertEquals(actualResult1, expectedResult1);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult1 + "\n" + "expected title - "+expectedResult1);
		menupage = homepagesmartcoin.pressMenuBtn();
		String actualResult= menupage.getTitleMenuePage();
		String expectedResult=strings.get("menuPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
		helpandsupportpage = menupage.pressHelpAndSupportBtn();
		String actualResult2= helpandsupportpage.getHelpAndSupportPageTitle();
		String expectedResult2=strings.get("helpandsupportPage_Title_Text");
		Assert.assertEquals(actualResult2, expectedResult2);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult2 + "\n" + "expected title - "+expectedResult2);
	}
	@Test(priority=7, description="Verify FAQ Button which is peresence on Menu Page")
	@Description("Verify FAQ Button which is peresence on Menu Page")
	@Epic("EP003")
	@Feature("Feature7: Verify FAQ Button")
	@Story("Story: verify the FAQ Button and after clicked on the FAQ button its get jumped on FAQ Page")
	@Step("Checked FAQ Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkMenuPageFAQButton() {
		SoftAssert sa= new SoftAssert();
		homepagesmartcoin = helpandsupportpage.pressReverseBtn();
		String actualResult1= homepagesmartcoin.getTitleHomePage();
		String expectedResult1=strings.get("homePage_Title_Text");
		Assert.assertEquals(actualResult1, expectedResult1);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult1 + "\n" + "expected title - "+expectedResult1);
		menupage = homepagesmartcoin.pressMenuBtn();
		String actualResult= menupage.getTitleMenuePage();
		String expectedResult=strings.get("menuPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
		faqpage = menupage.pressFAQBtn();
		String actualResult2= faqpage.getFAQPageTitle();
		String expectedResult2=strings.get("faqPage_Title_Text");
		Assert.assertEquals(actualResult2, expectedResult2);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult2 + "\n" + "expected title - "+expectedResult2);
	}
	@Test(priority=8, description="Verify Language Button which is peresence on Menu Page")
	@Description("Verify Language Button which is peresence on Menu Page")
	@Epic("EP003")
	@Feature("Feature8: Verify Language Button")
	@Story("Story: verify the Menu Button and after clicked on the Language Button its Should jumped on Language Setting Page")
	@Step("Checked Language Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkMenuPageLanguageSettingButton() {
		SoftAssert sa= new SoftAssert();
		homepagesmartcoin = faqpage.pressReverseBtn();
		String actualResult1= homepagesmartcoin.getTitleHomePage();
		String expectedResult1=strings.get("homePage_Title_Text");
		Assert.assertEquals(actualResult1, expectedResult1);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult1 + "\n" + "expected title - "+expectedResult1);
		menupage = homepagesmartcoin.pressMenuBtn();
		String actualResult= menupage.getTitleMenuePage();
		String expectedResult=strings.get("menuPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
		languagesettingpage = menupage.pressLanguageSettingBtn();
		String actualResult2= languagesettingpage.getLanguagePageTitle();
		String expectedResult2=strings.get("languagepage_Title_Text");
		Assert.assertEquals(actualResult2, expectedResult2);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult2 + "\n" + "expected title - "+expectedResult2);
	}
	@Test(priority=9, description="Verify Troubleshoot Button which is peresence on Menu Page")
	@Description("Verify Troubleshoot Button which is peresence on Menu Page")
	@Epic("EP003")
	@Feature("Feature9: Verify Troubleshoot Button")
	@Story("Story: verify the Troubleshoot Button and after clicked on the Troubleshoot Button its should jumed on Troubleshoot page")
	@Step("Checked Troubleshoot Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkMenuPageTroubleshootButton() {
		SoftAssert sa= new SoftAssert();
		homepagesmartcoin = languagesettingpage.pressReverseBtn();
		menupage = homepagesmartcoin.pressMenuBtn();
		String actualResult= menupage.getTitleMenuePage();
		String expectedResult=strings.get("menuPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
		menupage = homepagesmartcoin.pressMenuBtn();
		String actualResult2= menupage.getTitleMenuePage();
		String expectedResult2=strings.get("menuPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult2 + "\n" + "expected title - "+expectedResult2);
		troubleshootpage = menupage.pressTroubleShootBtn();
		String actualResult1= troubleshootpage.getTroubleshootPageTitle();
		String expectedResult1=strings.get("troubleshootpage_Title_Text");
		Assert.assertEquals(actualResult1, expectedResult1);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult1 + "\n" + "expected title - "+expectedResult1);
	}
	@Test(priority=10, description="Verify My_Bank_Details Button which is peresence on Menu Page")
	@Description("Verify My_Bank_Details Button which is peresence on Menu Page")
	@Epic("EP003")
	@Feature("Feature10: Verify My_Bank_Details Button")
	@Story("Story: verify the My_Bank_Details Button and verified its geting jummped On My_Bank_Details page")
	@Step("Checked My_Bank_Details Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkMenuPageMyBankDetailsButton() {
		SoftAssert sa= new SoftAssert();
		homepagesmartcoin = troubleshootpage.pressReverseBtn();
		String actualResult1= homepagesmartcoin.getTitleHomePage();
		String expectedResult1=strings.get("homePage_Title_Text");
		Assert.assertEquals(actualResult1, expectedResult1);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult1 + "\n" + "expected title - "+expectedResult1);
		menupage = homepagesmartcoin.pressMenuBtn();
		String actualResult= menupage.getTitleMenuePage();
		String expectedResult=strings.get("menuPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
		mybankdetailspage = menupage.pressMyBankDetailsBtntogetMyBankDetailsPage();
		String actualResult2= mybankdetailspage.getMyBankDetailsPageTitle();
		String expectedResult2=strings.get("mybankdetailsPage_Title_Text");
		Assert.assertEquals(actualResult2, expectedResult2);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult2 + "\n" + "expected title - "+expectedResult2);
	}
}

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
import com.qa.pages.AddBankAccountWithChequeLeafPage;
import com.qa.pages.AddBankAccountWithIfscCodePage;
import com.qa.pages.AllTransactionPage;
import com.qa.pages.ApplyForLoan;
import com.qa.pages.BankAccountPendingPage;
import com.qa.pages.CameraPage;
import com.qa.pages.CameraPiccheckPage;
import com.qa.pages.ChatPage;
import com.qa.pages.ConfirmBankDetailsPage;
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
public class AddBankAccountPageTest extends BaseTest {
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
	AddBankAccountWithChequeLeafPage addbankaccountwithcheckleafpage;
	AddBankAccountWithIfscCodePage addbankaccountwithifsccodepage;
	CameraPage camerapage;
	CameraPiccheckPage camrapiccheckpage;
	MyBankDetailsPage mybankdetailspage;
	ConfirmBankDetailsPage confirmbankdetailspage;
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

	@Test(priority=10, description="Verify My_Bank_Details Button which is peresence on Menu Page")
	@Description("Verify My_Bank_Details Button which is peresence on Menu Page")
	@Epic("EP003")
	@Feature("Feature10: Verify My_Bank_Details Button")
	@Story("Story: verify the My_Bank_Details Button and verified its geting jummped On My_Bank_Details page")
	@Step("Checked My_Bank_Details Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkAddBankAccountWithCheckLeafPage() {
		SoftAssert sa= new SoftAssert();
		menupage = homepagesmartcoin.pressMenuBtn();
		String actualResult= menupage.getTitleMenuePage();
		String expectedResult=strings.get("menuPage_Title_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
		mybankdetailspage = menupage.pressMyBankDetailsBtntogetMyBankDetailsPage();
		addbankaccountwithcheckleafpage = mybankdetailspage.pressAddBankAccountWithChequeLeafBtn(); 
		addbankaccountwithcheckleafpage.enterBankAccountNumber(loginuser.getJSONObject("addbankaccountdetails").getString("enter_account_number"));
		addbankaccountwithcheckleafpage.reenterBankAccountNumber(loginuser.getJSONObject("addbankaccountdetails").getString("reenter_account_number"));
		addbankaccountwithcheckleafpage.pressNoIfscButton();
		camerapage = addbankaccountwithcheckleafpage.pressCheckLeaf();
		camrapiccheckpage = camerapage.pressCaptureCheckLeafBtn();
		addbankaccountwithcheckleafpage = camrapiccheckpage.pressDoneCheckLeafBtn();
		addbankaccountwithcheckleafpage = addbankaccountwithcheckleafpage.pressContinueButton();
		
	}
	@Test(priority=10, description="Verify My_Bank_Details Button which is peresence on Menu Page")
	@Description("Verify My_Bank_Details Button which is peresence on Menu Page")
	@Epic("EP003")
	@Feature("Feature10: Verify My_Bank_Details Button")
	@Story("Story: verify the My_Bank_Details Button and verified its geting jummped On My_Bank_Details page")
	@Step("Checked My_Bank_Details Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkAddBankAccountWithIfscCodefPage() {
		SoftAssert sa= new SoftAssert();
		addbankaccountwithifsccodepage = mybankdetailspage.pressAddBankAccountWithIfscCodeBtn(); 
		addbankaccountwithifsccodepage.enterBankAccountNumber(loginuser.getJSONObject("addbankaccountdetailswithifsc").getString("enter_account_number"));
		addbankaccountwithifsccodepage.reenterBankAccountNumber(loginuser.getJSONObject("addbankaccountdetailswithifsc").getString("reenter_account_number"));
		addbankaccountwithifsccodepage.pressYesIfscButton();
		addbankaccountwithifsccodepage.enterIfscCode(loginuser.getJSONObject("addbankaccountdetailswithifsc").getString("ifsc_code"));
		homepagesmartcoin.scrollDown();
		confirmbankdetailspage = addbankaccountwithifsccodepage.pressContinueButtontogetConfirmBankDetailsPage();
		mybankdetailspage = confirmbankdetailspage.pressOkButton();
		String actualResult= mybankdetailspage.getMessageforChangeBankAccountDetails();
		String expectedResult=strings.get("addbankaccountdetailswithifscConfirmation_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);	
		

	}
}

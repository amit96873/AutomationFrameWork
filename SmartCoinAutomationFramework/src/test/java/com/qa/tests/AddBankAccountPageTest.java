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

	@Test(priority=1, description="Verify Home Page Scrolling and this is Prereusit to get Add Bank Account Page")
	@Description("Verify Home Page Scrolling and this is Prereusit to get Add Bank Account Page")
	@Epic("EP007")
	@Feature("Feature1: Prereusit to get Add Bank Account Page")
	@Story("Story: Prereusit to get Add Bank Account Page")
	@Step("Simple Steps to get Add Bank Account Page")
	@Severity(SeverityLevel.MINOR)
	public void checkHomePageScrolling() {
		SoftAssert sa= new SoftAssert();
		String actualResult4= enterpasswordpage.getTitleEnterPassword();
		String expectedResult4=strings.get("enterpasswordpage_Title_Text");
		Assert.assertEquals(actualResult4, expectedResult4);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult4 + "\n" + "expected title - "+expectedResult4);	
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
		menupage = homepagesmartcoin.pressMenuBtn();
		String actualResult1= menupage.getTitleMenuePage();
		String expectedResult1=strings.get("menuPage_Title_Text");
		Assert.assertEquals(actualResult1, expectedResult1);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult1 + "\n" + "expected title - "+expectedResult1);
		mybankdetailspage = menupage.pressMyBankDetailsBtntogetMyBankDetailsPage();
		String actualResult2= mybankdetailspage.getMyBankDetailsPageTitle();
		String expectedResult2=strings.get("mybankdetailsPage_Title_Text");
		Assert.assertEquals(actualResult2, expectedResult2);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult2 + "\n" + "expected title - "+expectedResult2);
		addbankaccountwithcheckleafpage = mybankdetailspage.pressAddBankAccountWithChequeLeafBtn(); 
		String actualResult3= addbankaccountwithcheckleafpage.getEditBankAccountPageTitle();
		String expectedResult3=strings.get("editbankdetailsPage_Title_Text");
		Assert.assertEquals(actualResult3, expectedResult3);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult3 + "\n" + "expected title - "+expectedResult3);
		
	}

	@Test(priority=2, description="Verify Home Page Scrolling and this is Prereusit to get Add Bank Account Page")
	@Description("Verify Home Page Scrolling and this is Prereusit to get Add Bank Account Page")
	@Epic("EP007")
	@Feature("Feature2: Prereusit to get Add Bank Account Page")
	@Story("Story: Prereusit to get Add Bank Account Page")
	@Step("Simple Steps to get Add Bank Account Page")
	@Severity(SeverityLevel.MINOR)
	public void checkAddBankAccountPageWithCheckLeaf() {	
		SoftAssert sa= new SoftAssert();
		addbankaccountwithcheckleafpage.enterBankAccountNumber(loginuser.getJSONObject("addbankaccountdetails").getString("enter_account_number"));
		addbankaccountwithcheckleafpage.reenterBankAccountNumber(loginuser.getJSONObject("addbankaccountdetails").getString("reenter_account_number"));
		addbankaccountwithcheckleafpage.pressNoIfscButton();
		String actualResult1= addbankaccountwithcheckleafpage.getAddCheckLeafVerifivationTitleText();
		String expectedResult1=strings.get("editbankaccountwithcheckleafPage_Title_Text");
		Assert.assertEquals(actualResult1, expectedResult1);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult1 + "\n" + "expected title - "+expectedResult1);
		camerapage = addbankaccountwithcheckleafpage.pressCheckLeaf();
		camrapiccheckpage = camerapage.pressCaptureCheckLeafBtn();
		addbankaccountwithcheckleafpage = camrapiccheckpage.pressDoneCheckLeafBtn();
		mybankdetailspage = addbankaccountwithcheckleafpage.pressContinueButton();
		//assertion for get confirmation message
		String actualResult2= mybankdetailspage.getMessageOfSuccessfullyUploadedCheckLeafandAccountDetails();
		String expectedResult2=strings.get("documentsuploadedconfirmationmessage_Text");
		Assert.assertEquals(actualResult2, expectedResult2);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult2 + "\n" + "expected title - "+expectedResult2);
		//assertion for my bank details page
		String actualResult3= mybankdetailspage.getMyBankDetailsPageTitle();
		String expectedResult3=strings.get("mybankdetailsPage_Title_Text");
		Assert.assertEquals(actualResult3, expectedResult3);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult3 + "\n" + "expected title - "+expectedResult3);
	}


	@Test(priority=3, description="Verify My_Bank_Details Button which is peresence on Menu Page")
	@Description("Verify My_Bank_Details Button which is peresence on Menu Page")
	@Epic("EP007")
	@Feature("Feature3: Verify My_Bank_Details Button")
	@Story("Story: verify the My_Bank_Details Button and verified its geting jummped On My_Bank_Details page")
	@Step("Checked My_Bank_Details Button")
	@Severity(SeverityLevel.NORMAL)
	public void checkAddBankAccountWithIfscCodefPage() {
		SoftAssert sa= new SoftAssert();
		addbankaccountwithifsccodepage = mybankdetailspage.pressAddBankAccountWithIfscCodeBtn(); 
		String actualResult3= addbankaccountwithcheckleafpage.getEditBankAccountPageTitle();
		String expectedResult3=strings.get("editbankdetailsPage_Title_Text");
		Assert.assertEquals(actualResult3, expectedResult3);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult3 + "\n" + "expected title - "+expectedResult3);
		addbankaccountwithifsccodepage.enterBankAccountNumber(loginuser.getJSONObject("addbankaccountdetailswithifsc").getString("enter_account_number"));
		addbankaccountwithifsccodepage.reenterBankAccountNumber(loginuser.getJSONObject("addbankaccountdetailswithifsc").getString("reenter_account_number"));
		addbankaccountwithifsccodepage.pressYesIfscButton();
		String actualResult1= addbankaccountwithcheckleafpage.getAddIfscVerifivationTitleText();
		String expectedResult1=strings.get("editbankaccountwithifscPage_Title_Text");
		Assert.assertEquals(actualResult1, expectedResult1);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult1 + "\n" + "expected title - "+expectedResult1);
		addbankaccountwithifsccodepage.enterIfscCode(loginuser.getJSONObject("addbankaccountdetailswithifsc").getString("ifsc_code"));
		homepagesmartcoin.scrollDown();
		confirmbankdetailspage = addbankaccountwithifsccodepage.pressContinueButtontogetConfirmBankDetailsPage();
		//assertion for confirm bank details page
		String actualResult4= confirmbankdetailspage.getConfirmBankAccountPageTitle();
		String expectedResult4=strings.get("confirmbankdetailspage_Text");
		Assert.assertEquals(actualResult4, expectedResult4);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult4 + "\n" + "expected title - "+expectedResult4);
		mybankdetailspage = confirmbankdetailspage.pressOkButton();
		//assertion for get confirmation message
		String actualResult= mybankdetailspage.getMessageforChangeBankAccountDetails();
		String expectedResult=strings.get("addbankaccountdetailswithifscConfirmation_Text");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);
		//assertion for my bank details page
		String actualResult2= mybankdetailspage.getMyBankDetailsPageTitle();
		String expectedResult2=strings.get("mybankdetailsPage_Title_Text");
		Assert.assertEquals(actualResult2, expectedResult2);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult2 + "\n" + "expected title - "+expectedResult2);


	}
}

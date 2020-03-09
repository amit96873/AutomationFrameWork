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
import com.qa.pages.CameraPage;
import com.qa.pages.CameraPiccheckPage;
import com.qa.pages.ChatPage;
import com.qa.pages.ConfirmYourPasswordPage;
import com.qa.pages.ContinueLoginWithFbPage;
import com.qa.pages.CreatePasswordPage;
import com.qa.pages.EditPersionalDetailsPage;
import com.qa.pages.EditWorkDetailsPage;
import com.qa.pages.EnterPasswordPage;
import com.qa.pages.FAQPage;
import com.qa.pages.FacebookPage;
import com.qa.pages.HelpAndSupportPage;
import com.qa.pages.HomePageSmartCoin;
import com.qa.pages.KYCUploadDocumentsPage;
import com.qa.pages.LanguagePage;
import com.qa.pages.LanguageSettingPage;
import com.qa.pages.MenuPage;
import com.qa.pages.MobileNumberOTPVerificationPage;
import com.qa.pages.MyKhataPage;
import com.qa.pages.MyLoansPage;
import com.qa.pages.MyProfilePage;
import com.qa.pages.PermissionPage;
import com.qa.pages.ProfileExpendMenueButonPage;
import com.qa.pages.SelectAddressDocumentsPage;
import com.qa.pages.SelectDOBPage;
import com.qa.pages.SelectDesignationPage;
import com.qa.pages.SelectEmployeementStatusPage;
import com.qa.pages.SelectIdDocumentsPage;
import com.qa.pages.SignINWithGmailAndFacebookPage;
import com.qa.pages.SigninPage;
import com.qa.pages.SmartCoinRewardsPage;
import com.qa.pages.TroubleShootPage;
import com.qa.pages.UploadAdharBackSugestionPage;
import com.qa.pages.UploadAdharFrontSugestionPage;
import com.qa.pages.UploadBankStatementsPage;
import com.qa.pages.UploadPanCardSuggestionPage;
import com.qa.pages.UploadSelfieSugestionPage;
import com.qa.pages.UploadUtilityBillSugestionPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
@Listeners({AllureListener.class})
public class KYCUploadDocumentsPageTests extends BaseTest{
	
	
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
	ProfileExpendMenueButonPage profileexpendmenupage;
	EditWorkDetailsPage editworkdetailspage;
	EditPersionalDetailsPage editpersionaldetailspage;
	SelectDOBPage selectdobpage;
	SelectEmployeementStatusPage selectemployeementstatuspage;
	SelectDesignationPage selectdesignationpage;
	KYCUploadDocumentsPage kycuploaddocumentspage;
	UploadAdharFrontSugestionPage uploadadharfrontsuggestionpage;
	CameraPage camerapage;
	CameraPiccheckPage camrapiccheckpage;
	UploadAdharBackSugestionPage uploadaadharbacksugestionpage;
	UploadSelfieSugestionPage uploadselfiesuggestionpage;
	SelectIdDocumentsPage selectiddocumentspage;
	SelectAddressDocumentsPage selectaddressdocumentspage;
	UploadPanCardSuggestionPage uploadpancardsuggestionpage;
	UploadUtilityBillSugestionPage uploadutilitybillssuggestionpage;
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

	@Test(priority=1, description="verify Enter Password Page and home page my_profile Button and On My profile page Expend Menu Button and Edit_Persional Details Button on menu page")
	@Description("verify Enter Password Page and home page my_profile Button and On My profile page Expend Menu Button and Edit_Persional Details Button on menu page")
	@Epic("EP006")
	@Feature("Feature1: verified enter password button and home page my profile button and my profile page expend menu button and expend menu page edit work details button")
	@Story("Story: This is Prerequsit to get Edit_Persional_Details Page to verify the Edit_Work_Details Page")
	@Step("1st step is Enter Password and 2nd step is Scroll the home page and click on my profile button and 3rd step is in my profile click on expend menu button and 4th step is on expend menu page click on edit_work_details button")
	@Severity(SeverityLevel.BLOCKER)
	public void checkHomePageScrolling() {
		SoftAssert sa= new SoftAssert();
		String actualResult1 = enterpasswordpage.getTitleEnterPassword();
		String expectedResult1=strings.get("enterpasswordpage_Title_Text");
		Assert.assertEquals(actualResult1, expectedResult1);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult1 + "\n" + "expected title - "+expectedResult1);	
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
		myprofilepage = homepagesmartcoin.pressMyProfileBtn();
		homepagesmartcoin.scrollUp();
		profileexpendmenupage=myprofilepage.pressExpendMenueBtn();
		kycuploaddocumentspage=profileexpendmenupage.pressEditKYCBtn();
		String actualResult2= kycuploaddocumentspage.getKYCPageTitle();
		String expectedResult2=strings.get("editkycpage_Title_Text");
		Assert.assertEquals(actualResult2, expectedResult2);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult2 + "\n" + "expected title - "+expectedResult2);
		
	}
	@Test(priority=2, description="Verify Edit KYC Details Page by Uploading valid data and Scrolling and documents uploaded Aadhar front as ID proof and Aadhar back As Address Proof")
	@Description("Verify Edit KYC Details Page by Entering valid data and Scrolling")
	@Epic("EP006")
	@Feature("Feature2: Edit KYC Details Page enteed valid data and Scrolling")
	@Story("Story: Upload the valid data on edit persional details page and after uploaded all the valid data and click on continue button it should get my_profile_page and that will show in the screen shot")
	@Step("validate by Uploading correct value")
	@Severity(SeverityLevel.CRITICAL)
	public void checkUploadAadharFrontAsIDAndAddharBackAsAddressProofe() {
		SoftAssert sa= new SoftAssert();
		uploadadharfrontsuggestionpage = kycuploaddocumentspage.pressUploadAdharFrontBtn();
		camerapage = uploadadharfrontsuggestionpage.pressCaptureAdharFrontBtn();
		camrapiccheckpage = camerapage.pressCaptureAadharFront();
		kycuploaddocumentspage =camrapiccheckpage .pressDoneAadharFront();
		uploadaadharbacksugestionpage =kycuploaddocumentspage.pressUploadAdharBackBtn();
		camerapage = uploadaadharbacksugestionpage.pressCaptureAdharBackBtn();
		camrapiccheckpage =camerapage .pressCaptureAadharBackBtn(); 
		kycuploaddocumentspage = camrapiccheckpage.pressDoneAadharBack();
		uploadadharfrontsuggestionpage = kycuploaddocumentspage.pressHelpAdharFrontBtn();
		kycuploaddocumentspage = uploadadharfrontsuggestionpage .pressCancelBtn();
		homepagesmartcoin.scrollUp();
		uploadselfiesuggestionpage = kycuploaddocumentspage.pressUploadSelfieBtn();
		camerapage = uploadselfiesuggestionpage.pressCaptureSelfieBtn();
		camrapiccheckpage=camerapage.pressCaptureSelfieBtn();
		kycuploaddocumentspage =camrapiccheckpage.pressDoneSelfie();
		myprofilepage = kycuploaddocumentspage.pressContinueBtn();
		String actualResult2= myprofilepage.getDocumentsUploadedConfirmationMessage();
		String expectedResult2=strings.get("documentsuploadedconfirmationmessage_Text");
		Assert.assertEquals(actualResult2, expectedResult2);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult2 + "\n" + "expected title - "+expectedResult2);

	}
	@Test(priority=3, description="Verify Edit KYC Details Page by Uploading valid data and Scrolling and documents uploaded Pan Card as ID proof and Utillity bills  As Address Proof")
	@Description("Verify Edit KYC Details Page by Entering valid value and Scrolling")
	@Epic("EP006")
	@Feature("Feature3: Edit KYC Details Page enteed valid values and Scrolling")
	@Story("Story: uploded the valid data on edit KYC details page and after uploaded all the valid data and click on continue button it should get my_profile_page and it will show in screen shot")
	@Step("validate by Uploading correct value")
	@Severity(SeverityLevel.CRITICAL)
	public void checkUploadPanCardAsIDAndUtillityBillsAsAddressProofe() {
		SoftAssert sa= new SoftAssert();
		profileexpendmenupage=myprofilepage.pressExpendMenueBtn();
		kycuploaddocumentspage=profileexpendmenupage.pressEditKYCBtn();
		String actualResult2= kycuploaddocumentspage.getKYCPageTitle();
		String expectedResult2=strings.get("editkycpage_Title_Text");
		Assert.assertEquals(actualResult2, expectedResult2);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult2 + "\n" + "expected title - "+expectedResult2);
		selectiddocumentspage = kycuploaddocumentspage.pressSelectAnotherIdDocumentsBtn();
		selectiddocumentspage.pressSelectPanCardBtn();
		kycuploaddocumentspage = selectiddocumentspage.pressOkBtn();
		uploadpancardsuggestionpage = kycuploaddocumentspage.pressUploadPanCardBtn();
		camerapage = uploadpancardsuggestionpage.pressCapturePanCardBtn();
		camrapiccheckpage = camerapage.pressCapturePanCardBtn();
		kycuploaddocumentspage =camrapiccheckpage.pressDonePanCard();
		selectaddressdocumentspage = kycuploaddocumentspage.pressSelectAnotherAddressDocumentsBtn();
		selectaddressdocumentspage.pressSelectUtillityBillBtn();
		kycuploaddocumentspage = selectaddressdocumentspage.pressOkBtn();
		uploadutilitybillssuggestionpage =kycuploaddocumentspage.pressUploadUtilityBillSBtn();
		camerapage = uploadutilitybillssuggestionpage.pressCaptureUtilityBillBtn();
		camrapiccheckpage =camerapage.pressCaptureUtilityBillsBtn();
		kycuploaddocumentspage = camrapiccheckpage.pressDoneUtilityBills();
		uploadadharfrontsuggestionpage = kycuploaddocumentspage.pressHelpAdharFrontBtn();
		kycuploaddocumentspage = uploadadharfrontsuggestionpage .pressCancelBtn();
		homepagesmartcoin.scrollUp();
		uploadselfiesuggestionpage = kycuploaddocumentspage.pressUploadSelfieBtn();
		camerapage = uploadselfiesuggestionpage.pressCaptureSelfieBtn();
		camrapiccheckpage=camerapage.pressCaptureSelfieBtn();
		kycuploaddocumentspage =camrapiccheckpage.pressDoneSelfie();
		myprofilepage = kycuploaddocumentspage.pressContinueBtn();
		String actualResult3= myprofilepage.getDocumentsUploadedConfirmationMessage();
		String expectedResult3=strings.get("documentsuploadedconfirmationmessage_Text");
		Assert.assertEquals(actualResult3, expectedResult3);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult3 + "\n" + "expected title - "+expectedResult3);

	}	
	}	
	
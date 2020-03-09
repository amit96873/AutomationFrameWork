
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
import com.qa.pages.EditPersionalDetailsPage;
import com.qa.pages.EditWorkDetailsPage;
import com.qa.pages.EnterPasswordPage;
import com.qa.pages.FAQPage;
import com.qa.pages.FacebookPage;
import com.qa.pages.HelpAndSupportPage;
import com.qa.pages.HomePageSmartCoin;
import com.qa.pages.LanguagePage;
import com.qa.pages.LanguageSettingPage;
import com.qa.pages.MenuPage;
import com.qa.pages.MobileNumberOTPVerificationPage;
import com.qa.pages.MyKhataPage;
import com.qa.pages.MyLoansPage;
import com.qa.pages.MyProfilePage;
import com.qa.pages.PermissionPage;
import com.qa.pages.ProfileExpendMenueButonPage;
import com.qa.pages.SelectDOBPage;
import com.qa.pages.SelectDesignationPage;
import com.qa.pages.SelectEmployeementStatusPage;
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
public class EditWorkDetailsPageTest extends BaseTest{
	
	
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
	@Epic("EP004")
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
		editworkdetailspage=profileexpendmenupage.pressEditWorklDetailsBtn();
		String actualResult2= editworkdetailspage.getWorkDetailsPageTitle();
		String expectedResult2=strings.get("editworkdetailspage_Title_Text");
		Assert.assertEquals(actualResult2, expectedResult2);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult2 + "\n" + "expected title - "+expectedResult2);
	}
	@Test(priority=3, description="Verify Edit Persional Details Page by Entering valid value and Scrolling")
	@Description("Verify Edit Persional Details Page by Entering valid value and Scrolling")
	@Epic("EP004")
	@Feature("Feature3: Edit Persional Details Page enteed valid values and Scrolling")
	@Story("Story: Enter the valid value on esit persional details page and after enered all the valid values and click on continue button it should get my_profile_page and it will show in screen shot")
	@Step("validating by entering correct value")
	@Severity(SeverityLevel.CRITICAL)
	public void checkWithoutEnteringAnyValue() {
		SoftAssert sa= new SoftAssert();
		selectemployeementstatuspage = editworkdetailspage.pressSelectEmployeementStatusSpinner();
		editworkdetailspage = selectemployeementstatuspage.pressSelectPRIVATESECTORJOBWORKINGINSHOP();
		editworkdetailspage.enterMonthlyIncome(loginuser.getJSONObject("editworkdetails").getString("monthaly_income"));
		editworkdetailspage.enterPanNumber(loginuser.getJSONObject("editworkdetails").getString("pan_number"));
		selectdesignationpage = editworkdetailspage.pressSelectDesignationSpinner();
		editworkdetailspage = selectdesignationpage.pressOwnerOfShopBtn();
		homepagesmartcoin.scrollUp();
		editworkdetailspage.enterWorkPlaceName(loginuser.getJSONObject("editworkdetails").getString("workspace_name"));
		editworkdetailspage.enterWorkPlaceAddress(loginuser.getJSONObject("editworkdetails").getString("workspace_address"));
		editworkdetailspage.enterWorkPlacepincode(loginuser.getJSONObject("editworkdetails").getString("workspace_postalcode"));
		homepagesmartcoin.scrollDown();
		myprofilepage = editworkdetailspage.pressContinueBtn();
		String actualResult2= myprofilepage.getMyProfilePageTitle();
		String expectedResult2=strings.get("myprofilePage_Title_Text");
		Assert.assertEquals(actualResult2, expectedResult2);
		sa.assertAll();	
		System.out.println("actual title - " + actualResult2 + "\n" + "expected title - "+expectedResult2);
	}
		
	}	
	
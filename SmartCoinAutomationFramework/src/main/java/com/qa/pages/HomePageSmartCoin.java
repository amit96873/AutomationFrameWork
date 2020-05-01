package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePageSmartCoin extends BaseTest {
	BaseTest bs=new BaseTest();

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='SmartCoin' and @index='1']") private MobileElement homepagetitletext;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement homepagechatshortcut;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@content-desc='Open' and @index='0']") private MobileElement menuebutton;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='VERIFY' and @index='0']") private MobileElement numberverificationbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='UPLOAD' and @index='0']") private MobileElement uploadbankstatementbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='EARN' and @index='0']") private MobileElement earnbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='APPLY' and @index='0']") private MobileElement applybtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='VIEW ALL' and @index='0']") private MobileElement viewallbtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='My Loan Offers' and @index='1']") private MobileElement myloanoffertitletext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='My Coins' and @index='1']") private MobileElement mycointext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Total Coin Balance' and @index='0']") private MobileElement totalcoinbalancetext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='My Utilities' and @index='1']") private By myutilitytext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='My Khata' and @index='1']") private MobileElement mykhata;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='My Profile' and @index='1']") private MobileElement myprofile;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Contact Us' and @index='1']") private MobileElement contactus;


	public String getTitleHomePage() {	
		String title = getText(homepagetitletext, "Home Page Title Text is :- ");
		return title;
	}
	public LoanOffersPage pressViewAllBtn() {
		click(viewallbtn,"Press On View Button");
		return new LoanOffersPage();
	}

	public ApplyForLoan pressApplyBtn() {
		click(applybtn,"Press On Apply Button");
		return new ApplyForLoan();
	}

	public String getMyCoinText() {	
		String text = getText(mycointext, "My Coin Text is:- ");
		return text;

	}

	public String getTotalCoinBalanceText() {	
		String text = getText(totalcoinbalancetext, "Total Coin Balance Text is:- ");
		return text;
	}

	public String getMyLoanOfferText() {	
		String text = getText(myloanoffertitletext, "My Loan Offer Tet is:- ");
		return text;

	}
	public MyKhataPage pressMyKhataBtn() {
		click(mykhata,"Press On My Khata Button");
		return new MyKhataPage();
	}
	public MyProfilePage pressMyProfileBtn() {
		click(myprofile,"Press On My Profile Button");
		return new MyProfilePage();
	}
	public HelpAndSupportPage pressContactUsBtn() {
		click(contactus,"Press On Contact_Us Button");
		return new HelpAndSupportPage();
	}

	public SmartCoinRewardsPage pressEarnBtn() {
		click(earnbtn,"Press On Earn Button");
		return new SmartCoinRewardsPage();
	}

	public MobileNumberOTPVerificationPage pressVerifyMobileNumberBtn() {
		click(numberverificationbtn,"Press On Mobile_Number_Verification Button");
		return new MobileNumberOTPVerificationPage();
	}
	public MenuPage pressMenuBtn() {
		click(menuebutton,"Press On Menu Button");
		return new MenuPage();
	}

	public ChatPage pressChatShortCutBtn() {
		click(homepagechatshortcut,"Press On Home Page Short Cut Button");
		return new ChatPage();
	}
	public void scrollUp() {
		BaseTest bt=new BaseTest();
		bt.scrollToElement(myutilitytext, "up");	
	}
	public void scrollDown() {
		BaseTest bt=new BaseTest();
		bt.scrollToElement(myutilitytext, "down");	
	}

	public UploadBankStatementsPage pressUploadBankStatementBtn() {
		click(uploadbankstatementbtn,"Press On Upload Bank Statement Button");
		return new UploadBankStatementsPage();
	}
}

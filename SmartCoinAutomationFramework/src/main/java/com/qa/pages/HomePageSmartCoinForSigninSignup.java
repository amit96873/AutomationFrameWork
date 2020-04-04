package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.BaseTest;
import com.qa.BaseTestForSigninSignUp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePageSmartCoinForSigninSignup extends BaseTestForSigninSignUp  {
	BaseTestForSigninSignUp bt = new BaseTestForSigninSignUp();

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
		return getAttribute(homepagetitletext, "text");

	}
	public LoanOffersPage pressViewAllBtn() {
		click(viewallbtn);
		return new LoanOffersPage();
	}

	public ApplyForLoan pressApplyBtn() {
		click(applybtn);
		return new ApplyForLoan();
	}

	public String getMyCoinText() {	
		return getAttribute(mycointext, "text");

	}

	public String getTotalCoinBalanceText() {	
		return getAttribute(totalcoinbalancetext, "text");

	}

	public String getMyLoanOfferText() {	
		return getAttribute(myloanoffertitletext, "text");

	}
	public MyKhataPage pressMyKhataBtn() {
		click(mykhata);
		return new MyKhataPage();
	}
	public MyProfilePage pressMyProfileBtn() {
		click(myprofile);
		return new MyProfilePage();
	}
	public HelpAndSupportPage pressContactUsBtn() {
		click(contactus);
		return new HelpAndSupportPage();
	}

	public SmartCoinRewardsPage pressEarnBtn() {
		click(earnbtn);
		return new SmartCoinRewardsPage();
	}

	public MobileNumberOTPVerificationPage pressVerifyMobileNumberBtn() {
		click(numberverificationbtn);
		return new MobileNumberOTPVerificationPage();
	}
	public MenuPage pressMenuBtn() {
		click(menuebutton);
		return new MenuPage();
	}

	public ChatPage pressChatShortCutBtn() {
		click(homepagechatshortcut);
		return new ChatPage();
	}
	public void scrollUp() {
		BaseTestForSigninSignUp bt = new BaseTestForSigninSignUp();
		bt.scrollToElement(myutilitytext, "up");	
	}
	public void scrollDown() {
		BaseTestForSigninSignUp bt = new BaseTestForSigninSignUp();
		bt.scrollToElement(myutilitytext, "down");	
	}

	public UploadBankStatementsPage pressUploadBankStatementBtn() {
		click(uploadbankstatementbtn);
		return new UploadBankStatementsPage();
	}
}

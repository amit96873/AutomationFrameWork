package com.qa.pages;

import com.qa.BaseTest;
import com.qa.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class KYCUploadDocumentsPage extends BaseTest{

	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='KYC : Upload Documents' and @index='0']") private MobileElement kycpagetitletext;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView") private MobileElement IdProoftakepicbtn;
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.Button[2]") private MobileElement anotheriddocumentsbtn;
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.Button[2]") private MobileElement anotheraddressdocumentsbtn;
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.Button[1]") private MobileElement helpiddocumentsbtn;
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.Button[1]") private MobileElement helpaddressdocumentsbtn;
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[1]") private MobileElement addressproftakepicbtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='take a selfie' and @index='2']") private MobileElement takeselfIPIC;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='Need Help?' and @index='0']") private MobileElement needhelpbtnforselfee;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement continuebtn;


	public String getKYCPageTitle() {
		return getAttribute(kycpagetitletext, "text");
	}
	public UploadAdharBackSugestionPage pressUploadAdharBackBtn() {

		click(addressproftakepicbtn);
		return new UploadAdharBackSugestionPage();
	}
	public UploadUtilityBillSugestionPage pressUploadUtilityBillSBtn() {

		click(addressproftakepicbtn);
		return new UploadUtilityBillSugestionPage();
	}
	public UploadPanCardSuggestionPage pressUploadPanCardBtn() {

		click(IdProoftakepicbtn);
		return new UploadPanCardSuggestionPage();
	}
	public PermissionPageForAppHome pressUploadAdharFrontBtnWithPermission() {
		click(IdProoftakepicbtn);
		return new PermissionPageForAppHome();
		
	}
	public UploadAdharFrontSugestionPage pressUploadAdharFrontBtn() {
		click(IdProoftakepicbtn);
		return new UploadAdharFrontSugestionPage();
		
	}
	public UploadSelfieSugestionPage pressUploadSelfieBtn() {

		click(takeselfIPIC);
		return new UploadSelfieSugestionPage();
	}

	public UploadAdharBackSugestionPage pressHelpAdharBackBtn() {

		click(helpaddressdocumentsbtn);
		return new UploadAdharBackSugestionPage();
	}
	public UploadUtilityBillSugestionPage pressHelpUtilityBillBtn() {

		click(helpaddressdocumentsbtn);
		return new UploadUtilityBillSugestionPage();
	}
	public UploadAdharFrontSugestionPage pressHelpAdharFrontBtn() {

		click(helpiddocumentsbtn);
		return new UploadAdharFrontSugestionPage();
	}

	public UploadPanCardSuggestionPage pressHelpPanCardBtn() {

		click(helpiddocumentsbtn);
		return new UploadPanCardSuggestionPage();
	}
	public UploadSelfieSugestionPage pressHelpUploadSelfieBtn() {

		click(needhelpbtnforselfee);
		return new UploadSelfieSugestionPage();
	}

	public SelectIdDocumentsPage pressSelectAnotherIdDocumentsBtn() {

		click(anotheriddocumentsbtn);
		return new SelectIdDocumentsPage();
	}
	public SelectAddressDocumentsPage pressSelectAnotherAddressDocumentsBtn() {

		click(anotheraddressdocumentsbtn);
		return new SelectAddressDocumentsPage();
	}
	public MyProfilePage pressReverseBtn() {

		click(reversebtn);
		return new MyProfilePage();
	}
	public MyProfilePage pressContinueBtn() {

		click(continuebtn);
		return new MyProfilePage();
	}
	public ChatPage pressChatShortCutBtn() {

		click(chatbtn);
		return new ChatPage();
	}


}

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
		String title = getText(kycpagetitletext, "KYC Upload Documents Page Title Text is :- ");
		return title;
	}
	public UploadAdharBackSugestionPage pressUploadAdharBackBtn() {

		click(addressproftakepicbtn,"Press On Address Proof take pic Button for Adhar Back");
		return new UploadAdharBackSugestionPage();
	}
	public UploadUtilityBillSugestionPage pressUploadUtilityBillSBtn() {

		click(addressproftakepicbtn,"press on address proof take pic button for utility bills");
		return new UploadUtilityBillSugestionPage();
	}
	public UploadPanCardSuggestionPage pressUploadPanCardBtn() {

		click(IdProoftakepicbtn,"press on id proof take pic button for pan card");
		return new UploadPanCardSuggestionPage();
	}
	public PermissionPageForAppHome pressUploadAdharFrontBtnWithPermission() {
		click(IdProoftakepicbtn,"press on id proof button with permission");
		return new PermissionPageForAppHome();

	}
	public UploadAdharFrontSugestionPage pressUploadAdharFrontBtn() {
		click(IdProoftakepicbtn,"press on id proof button for adhar front ");
		return new UploadAdharFrontSugestionPage();

	}
	public UploadSelfieSugestionPage pressUploadSelfieBtn() {

		click(takeselfIPIC,"press on Upload selfee button");
		return new UploadSelfieSugestionPage();
	}

	public UploadAdharBackSugestionPage pressHelpAdharBackBtn() {

		click(helpaddressdocumentsbtn,"Press on help button for Address proof by adhar");
		return new UploadAdharBackSugestionPage();
	}
	public UploadUtilityBillSugestionPage pressHelpUtilityBillBtn() {

		click(helpaddressdocumentsbtn,"press on help button for utility bills");
		return new UploadUtilityBillSugestionPage();
	}
	public UploadAdharFrontSugestionPage pressHelpAdharFrontBtn() {

		click(helpiddocumentsbtn,"press on help button for Adhar front");
		return new UploadAdharFrontSugestionPage();
	}

	public UploadPanCardSuggestionPage pressHelpPanCardBtn() {

		click(helpiddocumentsbtn,"press on help button for Pan Card");
		return new UploadPanCardSuggestionPage();
	}
	public UploadSelfieSugestionPage pressHelpUploadSelfieBtn() {

		click(needhelpbtnforselfee,"press on need help button for selfee,");
		return new UploadSelfieSugestionPage();
	}

	public SelectIdDocumentsPage pressSelectAnotherIdDocumentsBtn() {

		click(anotheriddocumentsbtn,"press on another Address proof documents button");
		return new SelectIdDocumentsPage();
	}
	public SelectAddressDocumentsPage pressSelectAnotherAddressDocumentsBtn() {

		click(anotheraddressdocumentsbtn,"press on another id proof documents button");
		return new SelectAddressDocumentsPage();
	}
	public MyProfilePage pressReverseBtn() {

		click(reversebtn,"press on reverse button");
		return new MyProfilePage();
	}
	public MyProfilePage pressContinueBtn() {

		click(continuebtn,"press on continue button");
		return new MyProfilePage();
	}
	public ChatPage pressChatShortCutBtn() {

		click(chatbtn,"press on chat button");
		return new ChatPage();
	}


}

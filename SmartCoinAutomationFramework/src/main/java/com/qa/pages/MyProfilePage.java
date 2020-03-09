package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyProfilePage extends BaseTest{

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='My Profile' and @index='0']") private MobileElement myprofilestitletext;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='OWNER OF SHOP' and @index='0']") private MobileElement ownerofshoptext;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;
	@AndroidFindBy (id = "in.rebase.app:id/fab_expand_menu_button") private MobileElement expendmenuebtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Documents Uploaded!' and @index='0']") private MobileElement documentsuploadedconfirmationmessage;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Profile Saved Successfully!' and @index='0']") private MobileElement editworkdetailssavedsuccesfully;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Profile Saved Successfully!' and @index='0']") private MobileElement editpersionaldetailssavedsuccesfully;
	
	
	
	
	public String getMyProfilePageTitle() {
		return getAttribute(myprofilestitletext, "text");
	}
	public String getDocumentsUploadedConfirmationMessage() {
		return getAttribute(documentsuploadedconfirmationmessage, "text");
	}
	public String getEditPersionaldetailsSavedSuccessfully() {
		return getAttribute(editpersionaldetailssavedsuccesfully, "text");
	}
	public String getEditworkdetailsSavedSuccessfully() {
		return getAttribute(editworkdetailssavedsuccesfully, "text");
	}
	public String getEndPageText() {
		return getAttribute(ownerofshoptext, "text");
	}


	public HomePageSmartCoin pressReverseBtn() {

		click(reversebtn);
		return new HomePageSmartCoin();
	}
	public ChatPage pressChatShortCutBtn() {

		click(chatbtn);
		return new ChatPage();
	}

	public ProfileExpendMenueButonPage pressExpendMenueBtn() {
		click(expendmenuebtn);
		return new ProfileExpendMenueButonPage();
	}


}

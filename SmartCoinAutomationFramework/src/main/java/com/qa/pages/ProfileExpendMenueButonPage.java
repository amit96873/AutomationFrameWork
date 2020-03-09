package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfileExpendMenueButonPage extends BaseTest {




	@AndroidFindBy (id = "in.rebase.app:id/kyc_edit_button") private MobileElement editkycbtn;
	@AndroidFindBy (id = "in.rebase.app:id/fab_expand_menu_button") private MobileElement reversebtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='EDIT PERSONAL DETAILS' and @index='0']") private MobileElement editpersionaldetailsbtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='EDIT WORK DETAILS' and @index='2']") private MobileElement editworkdetailsbtn;





	public String getMenueExpendPageTitle() {
		return getAttribute(editpersionaldetailsbtn, "text");
	}

	public MyProfilePage pressReverseBtn() {
		click(reversebtn);
		return new MyProfilePage();
	}
	public KYCUploadDocumentsPage pressEditKYCBtn() {
		click(editkycbtn);
		return new KYCUploadDocumentsPage();
	}
	public EditPersionalDetailsPage pressEditPersionalDetailsBtn() {
		click(editpersionaldetailsbtn);
		return new EditPersionalDetailsPage();
	}
	public EditWorkDetailsPage pressEditWorklDetailsBtn() {
		click(editworkdetailsbtn);
		return new EditWorkDetailsPage();
	}
}

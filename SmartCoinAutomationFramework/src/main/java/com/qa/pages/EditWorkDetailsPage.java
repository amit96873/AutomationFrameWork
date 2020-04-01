package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EditWorkDetailsPage extends BaseTest {
	TestUtils utils = new TestUtils();
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Edit Work Details' and @index='0']") private MobileElement editworkdetailstitletext;
	@AndroidFindBy (id = "in.rebase.app:id/spinner") private MobileElement Employeementstatuspineer;
	@AndroidFindBy (id = "in.rebase.app:id/monthly_income") private MobileElement monthlyincomeedittext;
	@AndroidFindBy (id = "in.rebase.app:id/pan") private MobileElement pannumberedittext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='OWNER OF SHOP' and @index='0']") private MobileElement designationspinner;
	@AndroidFindBy (id = "in.rebase.app:id/workplace_name") private MobileElement workplacenameedittext;
	@AndroidFindBy (id = "in.rebase.app:id/workplace_address") private MobileElement workplaceaddressedittext;
	@AndroidFindBy (id = "in.rebase.app:id/workplace_pincode") private MobileElement workplacepincodeedittext;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement continuebtn;



	public String getWorkDetailsPageTitle() {
		return getAttribute(editworkdetailstitletext, "text");
	}

	public MyProfilePage pressContinueBtn() {
		click(continuebtn);
		return new MyProfilePage();
	}

	public EditWorkDetailsPage enterWorkPlacepincode(String workplacepincode) {
		click(workplacepincodeedittext);
		clear(workplacepincodeedittext);
		utils.log("Work Place Address is:-  " + workplacepincode);
		sendkeys(workplacepincodeedittext, workplacepincode);
		return this;

	}

	public EditWorkDetailsPage enterWorkPlaceAddress(String workplaceaddress) {
		click(workplaceaddressedittext);
		clear(workplaceaddressedittext);
		utils.log("Work Place Address is:-  " + workplaceaddress);
		sendkeys(workplaceaddressedittext, workplaceaddress);
		return this;

	}


	public EditWorkDetailsPage enterWorkPlaceName(String workplacename) {
		click(workplacenameedittext);
		clear(workplacenameedittext);
		utils.log("Work Place Name is:-  " + workplacename);
		sendkeys(workplacenameedittext, workplacename);
		return this;

	}


	public EditWorkDetailsPage enterMonthlyIncome(String income) {
		click(monthlyincomeedittext);
		clear(monthlyincomeedittext);
		utils.log("Monthly income is:-  " + income);
		sendkeys(monthlyincomeedittext, income);
		return this;

	}

	public EditWorkDetailsPage enterPanNumber(String pannumber) {
		click(pannumberedittext);
		clear(pannumberedittext);
		utils.log("Pan Number is:-  " + pannumber);
		sendkeys(pannumberedittext, pannumber);
		return this;

	}


	public SelectEmployeementStatusPage pressSelectEmployeementStatusSpinner() {

		click(Employeementstatuspineer);
		return new SelectEmployeementStatusPage();
	}
	public SelectDesignationPage pressSelectDesignationSpinner() {

		click(designationspinner);
		return new SelectDesignationPage();
	}



}

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
		String title = getAttribute(editworkdetailstitletext, "Edit Work Details Page Title is:- ");
		return title;
	}

	public MyProfilePage pressContinueBtn() {
		click(continuebtn,"Press On Continue Button");
		return new MyProfilePage();
	}

	public EditWorkDetailsPage enterWorkPlacepincode(String workplacepincode) {
		click(workplacepincodeedittext,"Press on Enter Work Place Pin Code Edit Text");
		clear(workplacepincodeedittext);
		//		utils.log().info("Work Place Address is:-  " + workplacepincode);
		sendKeys(workplacepincodeedittext, workplacepincode,"Work Place Address is:-  " + workplacepincode);
		return this;

	}

	public EditWorkDetailsPage enterWorkPlaceAddress(String workplaceaddress) {
		click(workplaceaddressedittext,"Press on Enter Work Place Address Edit Text ");
		clear(workplaceaddressedittext);
		utils.log().info("Work Place Address is:-  " + workplaceaddress);
		sendKeys(workplaceaddressedittext, workplaceaddress,"Work Place Address is:-  " + workplaceaddress);
		return this;

	}


	public EditWorkDetailsPage enterWorkPlaceName(String workplacename) {
		click(workplacenameedittext,"Press On Enter Work Place Name Edit Text");
		clear(workplacenameedittext);
		utils.log().info("Work Place Name is:-  " + workplacename);
		sendKeys(workplacenameedittext, workplacename,"Work Place Name is:-  " + workplacename);
		return this;

	}


	public EditWorkDetailsPage enterMonthlyIncome(String income) {
		click(monthlyincomeedittext,"Press On Enter Monthly Income Edit Text");
		clear(monthlyincomeedittext);
		utils.log().info("Monthly income is:-  " + income);
		sendKeys(monthlyincomeedittext, income,"Monthly income is:-  " + income);
		return this;

	}

	public EditWorkDetailsPage enterPanNumber(String pannumber) {
		click(pannumberedittext,"Press On Enter Pan Number Edit Text");
		clear(pannumberedittext);
		utils.log().info("Pan Number is:-  " + pannumber);
		sendKeys(pannumberedittext, pannumber,"Pan Number is:-  " + pannumber);
		return this;

	}


	public SelectEmployeementStatusPage pressSelectEmployeementStatusSpinner() {

		click(Employeementstatuspineer,"Press On Employeement Status Spinner");
		return new SelectEmployeementStatusPage();
	}
	public SelectDesignationPage pressSelectDesignationSpinner() {

		click(designationspinner,"Press On Select Designation Spinner");
		return new SelectDesignationPage();
	}



}

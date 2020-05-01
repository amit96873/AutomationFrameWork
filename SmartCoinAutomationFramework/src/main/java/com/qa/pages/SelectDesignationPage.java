package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SelectDesignationPage extends BaseTest{

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='DESIGNATION' and @index='0']") private MobileElement Designationpagetitletext;
	@AndroidFindBy (xpath = "//android.widget.EditText[@text='Start typing to search...' and @index='0']") private MobileElement serchedittext;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='OWNER OF SHOP' and @index='0']") private MobileElement ownerofshopbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='OWNER OF BUSINESS' and @index='0']") private MobileElement ownerofbusinessbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='OWNER OF CAB' and @index='0']") private MobileElement ownerofcabbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='OWNER OF PG' and @index='0']") private MobileElement ownerofpgbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='OWNER SME' and @index='0']") private MobileElement ownerofsmebtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='OWNER (OTHERS)' and @index='0']") private MobileElement ownerofotherbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='SALES MANAGER' and @index='0']") private MobileElement salesmanagerbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='RELATIONSHIP MANAGER' and @index='0']") private MobileElement relationmanagerbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='AREA SALES MANAGER' and @index='0']") private MobileElement areaselsmanagerbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='CUSTOMER RELATIONSHIP MANAGER' and @index='0']") private MobileElement crmanagerbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='ASSISTANT MANAGER' and @index='0']") private MobileElement ambtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='DEPUTY MANAGER' and @index='0']") private MobileElement dmbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='BRANCH MANAGER' and @index='0']") private MobileElement bmbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='BUSINESS DEVELOPMENT MANAGER' and @index='0']") private MobileElement bdmbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='STORE MANAGER' and @index='0']") private MobileElement smbtn;



	public String getSelectDesignationPageTitle() {
		String title =getText(Designationpagetitletext, "Select Designation page title text is:- ");
		return title;
	}

	public EditWorkDetailsPage pressOwnerOfPgBtn() {
		click(ownerofpgbtn,"press on owner of pg button");		
		return new EditWorkDetailsPage();
	}
	public EditWorkDetailsPage pressOwnerOfShopBtn() {
		click(ownerofshopbtn,"press on owner of shop button");		
		return new EditWorkDetailsPage();
	}
	public EditWorkDetailsPage pressOwnerOfCabBtn() {
		click(ownerofcabbtn,"press on owner of cab button");		
		return new EditWorkDetailsPage();
	}
	public EditWorkDetailsPage pressAssistantManagerBtn() {
		click(ownerofcabbtn,"press on owner of cab button");		
		return new EditWorkDetailsPage();
	}
}

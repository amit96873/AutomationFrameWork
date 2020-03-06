package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SelectEmployeementStatusPage extends BaseTest{
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='EMPLOYMENT STATUS' and @index='0']") private MobileElement employeementstatuspagetitletext;	
	@AndroidFindBy (xpath = "//android.widget.Button[@text='BUSINESS OWNER - SHOP' and @index='0']") private MobileElement selectshopowner;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='BUSINESS OWNER - OTHER' and @index='0']") private MobileElement selectshoownerother;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='PRIVATE SECTOR JOB - WORKING IN SHOP' and @index='0']") private MobileElement pvtshopjobs;	
	@AndroidFindBy (xpath = "//android.widget.Button[@text='PRIVATE SECTOR JOB - WORKING IN FACTORY' and @index='0']") private MobileElement pvtfactoryjobs;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='PRIVATE SECTOR JOB - OTHER' and @index='0']") private MobileElement pvtotherjobs;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='PUBLIC SECTOR JOB' and @index='0']") private MobileElement publicsecjobs;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='SELF EMPLOYED' and @index='0']") private MobileElement govsectorjobs;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='SELF EMPLOYED' and @index='0']") private MobileElement selfemployeed;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='HOUSEWIFE' and @index='0']") private MobileElement housewfe;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='STUDENT' and @index='0']") private MobileElement student;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='RETIRED' and @index='0']") private MobileElement retired;
	
	
	public String getTitle() {
		return getAttribute(employeementstatuspagetitletext, "text");
	}
	public EditWorkDetailsPage pressSelectHouseWife() {
		click(housewfe);
		return new EditWorkDetailsPage();
	}
	public EditWorkDetailsPage pressSelectStudents() {
		click(student);
		return new EditWorkDetailsPage();
	}
	public EditWorkDetailsPage pressSelectRetired() {
		click(retired);
		return new EditWorkDetailsPage();
	}
	public EditWorkDetailsPage pressSelectPUBLICSECTORJOB() {
		click(publicsecjobs);
		return new EditWorkDetailsPage();
	}
	public EditWorkDetailsPage pressSelectSELFEMPLOYED() {
		click(selfemployeed);
		return new EditWorkDetailsPage();
	}
	public EditWorkDetailsPage pressSelectBusinessOwnerShop() {
		click(selectshopowner);
		return new EditWorkDetailsPage();
	}

	public EditWorkDetailsPage pressSelectBUSINESSOWNEROTHER() {
		click(selectshoownerother);
		return new EditWorkDetailsPage();
	}
	public EditWorkDetailsPage pressSelectPRIVATESECTORJOBWORKINGINSHOP() {
		click(pvtshopjobs);
		return new EditWorkDetailsPage();
	}
	public EditWorkDetailsPage pressSelectPRIVATESECTORJOBWORKINGINFactory() {
		click(pvtfactoryjobs);
		return new EditWorkDetailsPage();
	}
	public EditWorkDetailsPage pressSelectPRIVATESECTORJOBOther() {
		click(pvtotherjobs);
		return new EditWorkDetailsPage();
	}



}

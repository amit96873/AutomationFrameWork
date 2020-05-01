package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SelectDOBPage extends BaseTest{
	TestUtils utils = new TestUtils();

	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.EditText") private MobileElement monthtext;
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.EditText") private MobileElement datetext;
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[3]/android.widget.EditText") private MobileElement yeartext;
	@AndroidFindBy (id = "android:id/button1") private MobileElement okbtn;
	@AndroidFindBy (id = "android:id/button2") private MobileElement cancelbtn;

	public EditPersionalDetailsPage pressOkBtn() {
		click(okbtn,"press ok button");
		return new EditPersionalDetailsPage();
	}
	public EditPersionalDetailsPage pressCancelBtn() {
		click(cancelbtn,"press cancel button");
		return new EditPersionalDetailsPage();
	}

	public SelectDOBPage enterMonth(String month) {
		click(monthtext,"press Enter month");
		click(monthtext);
		clear(monthtext);
		//		utils.log().info("Month is :-" + month);
		sendKeys(monthtext, month,"Month is :-" + month);
		return this;
	}
	public SelectDOBPage enterDate(String date) {
		click(datetext,"press enter date ");
		click(datetext);
		clear(datetext);
		//		utils.log().info("Date is :-" + date);
		sendKeys(datetext, date,"Date is :-" + date);
		return this;
	}
	public SelectDOBPage enterYear(String year) {
		click(yeartext,"press enter year");
		click(yeartext);
		clear(yeartext);
		//		utils.log().info("Year is :-" + year);
		sendKeys(yeartext, year,"Year is :-" + year);
		return this;
	}



}

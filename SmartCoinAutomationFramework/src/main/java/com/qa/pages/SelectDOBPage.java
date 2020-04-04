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
		click(okbtn);
		return new EditPersionalDetailsPage();
	}
	public EditPersionalDetailsPage pressCancelBtn() {
		click(cancelbtn);
		return new EditPersionalDetailsPage();
	}
	
	public SelectDOBPage enterMonth(String month) {
		click(monthtext);
		click(monthtext);
		clear(monthtext);
		utils.log().info("Month is :-" + month);
		sendkeys(monthtext, month);
		return this;
	}
	public SelectDOBPage enterDate(String date) {
		click(datetext);
		click(datetext);
		clear(datetext);
		utils.log().info("Date is :-" + date);
		sendkeys(datetext, date);
		return this;
	}
	public SelectDOBPage enterYear(String year) {
		click(yeartext);
		click(yeartext);
		clear(yeartext);
		utils.log().info("Year is :-" + year);
		sendkeys(yeartext, year);
		return this;
	}
	
	
	
}

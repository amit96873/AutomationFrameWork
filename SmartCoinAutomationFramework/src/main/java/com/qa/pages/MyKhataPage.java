package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyKhataPage extends BaseTest{
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Khata' and @index='0']") private MobileElement mykhatatitletext;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='ADD NEW KHATA' and @index='0']") private MobileElement addnewkhatabtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='VIEW' and @index='0']") private MobileElement viewbtn;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	

	public String getMyKhataPageTitle() {
		return getAttribute(mykhatatitletext, "text");
	}
	
	public ChatPage pressChatShortCutBtn() {
		click(chatbtn);
		return new ChatPage();
	}
	public HomePageSmartCoin pressReverseBtn() {
		click(reversebtn);
		return new HomePageSmartCoin();
	}
	public MyKhataChooseTypeOfAccountPage pressAddNewKhataBtn() {
		click(addnewkhatabtn);
		return new MyKhataChooseTypeOfAccountPage();
	}
	
	
	
}

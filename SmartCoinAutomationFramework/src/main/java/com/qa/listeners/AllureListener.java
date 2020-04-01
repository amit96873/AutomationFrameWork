package com.qa.listeners;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Attachment;


public class AllureListener implements ITestListener{

	TestUtils utils = new TestUtils();
	
	private static String getTestMethodName(ITestResult iTestResult) {
		
		return iTestResult.getMethod().getConstructorOrMethod().getName();
	}
	
	@Attachment
	public byte[] saveFailureScreenShot(WebDriver driver) {
		
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	@Attachment
	public byte[] saveSuccessScreenShot(WebDriver driver) {
		
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	
	@Attachment(value = "{0}", type ="text/plain")
	public static String saveTextLog(String message) {
		return message;
	}
	
	@Override
	public void onStart(ITestContext iTestContext) {
		utils.log("I am in OnStart Method "+ iTestContext.getName());
		BaseTest base = new BaseTest();
		iTestContext.setAttribute("WebDriver", base.getDriver());
	}
	@Override
	public void onFinish(ITestContext iTestContext) {
		utils.log("I am in OnFinish Method "+ iTestContext.getName());
		
	}
	@Override
	public void onTestStart(ITestResult iTestResult) {
		utils.log("I am in OnStart Method "+ iTestResult.getName()+ "Start");
		
	}
	@Override
	public void onTestSuccess(ITestResult iTestResult) {
		System.out.println("I am in OnTest Success Method "+ iTestResult.getName() + "Succeed");
		Object testclass = iTestResult.getInstance();
		BaseTest base = new BaseTest();
		AppiumDriver driver = base.getDriver();
		//Allure ScreenShot and save test log
		if(driver instanceof AppiumDriver) {
			utils.log("Scrren Shot Captured For Test Case: "+getTestMethodName(iTestResult));
			saveFailureScreenShot(driver);
		}
		saveTextLog(getTestMethodName(iTestResult)+ "Passed And Screenshot Taken");	
		
	}
	@Override
	public void onTestFailure(ITestResult iTestResult) {
		utils.log("I am in onTestFailuer Method "+ iTestResult.getName()+ "Failed");
		Object testclass = iTestResult.getInstance();
		BaseTest base = new BaseTest();
		AppiumDriver driver = base.getDriver();
		//Allure ScreenShot and save test log
		if(driver instanceof AppiumDriver) {
			utils.log("Scrren Shot Captured For Test Case: "+getTestMethodName(iTestResult));
			saveFailureScreenShot(driver);
		}
		saveTextLog(getTestMethodName(iTestResult)+ "Failed And Screenshot Taken");				
	}
	@Override
	public void onTestSkipped(ITestResult iTestResult) {
		utils.log("I am in onTestSkipped Method "+ getTestMethodName(iTestResult)+ "Skiped");
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
		utils.log("Test Failed But It Is Defined Success Ratio "+ getTestMethodName(iTestResult)+ "test failed but within success ratio");
	}
	
}



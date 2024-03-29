package com.qa;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.qa.utils.TestUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import okhttp3.internal.platform.Platform;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.binary.Base64;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.screenrecording.CanRecordScreen;
public class BaseTestForSigninSignUp {
	protected static ThreadLocal <AppiumDriver> driver = new ThreadLocal <AppiumDriver>();
	protected static ThreadLocal <Properties> props = new ThreadLocal <Properties>();
	protected static ThreadLocal <HashMap<String, String>> strings = new ThreadLocal<HashMap<String, String>>();
	protected static ThreadLocal <String> dateTime = new ThreadLocal <String>();
	protected static ThreadLocal <String> platform = new ThreadLocal <String>();
	protected static ThreadLocal <String> deviceName = new ThreadLocal <String>();
	TestUtils utils = new TestUtils();

	public AppiumDriver getDriver() {
		return driver.get();
	}
	public void setDriver(AppiumDriver driver2) {
		driver.set(driver2);
	}
	public Properties getProps() {
		return props.get();
	}
	public void setProps(Properties props2) {
		props.set(props2);
	}
	public HashMap<String, String> getString(){
		return strings.get();
	}
	public void  setStrings(HashMap<String, String> string2) {
		strings.set(string2);
	}
	public String getPlatform() {
		return platform.get();
	}
	public void setPlatform(String platform2) {
		platform.set(platform2);
	}
	public String getDateTime() {
		return dateTime.get();
	}
	public void setDateTime(String dateTime2) {
		dateTime.set(dateTime2);
	}
	public String getDeviceName() {
		return deviceName.get();
	}
	public void setDeviceNmae(String deviceName2) {
		deviceName.set(deviceName2);
	}
	public BaseTestForSigninSignUp() {

		PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
	}


	/*
	 * to take video for full test when testCase fail/pass
	@BeforeMethod
	public void beforeMethod() { 
		((CanRecordScreen) getDriver() ).startRecordingScreen();		
	}
	@AfterMethod
	public synchronized void afterMethod(ITestResult result) {
		String media = ((CanRecordScreen) getDriver() ).stopRecordingScreen();

		if(result.getStatus() == 1) {

			Map<String, String> params = result.getTestContext().getCurrentXmlTest().getAllParameters();
			String dir = "videos" + File.separator + params.get("platformName")+ "_"+params.get("platformVersion")+ "_"
					+params.get("deviceName")+ File.separator +getDateTime()+File.separator+result.getTestClass().getRealClass().getSimpleName();

			File videodir = new File(dir);
			synchronized (videodir){
			
			
			if(!videodir.exists()) {
				videodir.mkdirs();
			}

			}
			try {
				FileOutputStream stream=new FileOutputStream(videodir + File.separator + result.getName()+".mp4");
				stream.write(Base64.decodeBase64(media));
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	 */

	@Parameters({"platformName", "platformVersion", "devicename","udid"})
	@BeforeTest
	public void beforeTest(String platformName, String platformVersion, String deviceName, 
			String udid) throws Exception {
		utils = new TestUtils();
		setDateTime(utils.DateTime());
		setPlatform(platformName);
		setDeviceNmae(deviceName);
		InputStream inputStream = null;
		InputStream stringsis = null;
		Properties props = new Properties();
		AppiumDriver driver;
		try {
			props = new Properties();
			String propFileName = "config.properties";
			String xmlFileName="strings/strings.xml";
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
			props.load(inputStream);
			setProps(props);
			stringsis=getClass().getClassLoader().getResourceAsStream(xmlFileName);
			setStrings(utils.paseStringXML(stringsis));
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
			dc.setCapability("udid", udid);
			dc.setCapability("palatformVersion", platformVersion);
			URL url = new URL(props.getProperty("appiumURL"));
			dc.setCapability(MobileCapabilityType.NO_RESET, true);
			dc.setCapability(MobileCapabilityType.FULL_RESET, false);
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("androidAutomationName"));
			dc.setCapability("appPackage", props.getProperty("androidAppPackage"));
			dc.setCapability("appActivity", props.getProperty("androidAppActivity"));
        	String androidAppUrl = getClass().getClassLoader().getResource(props.getProperty("androidAppLocation")).getFile();
			System.out.println("appurl is" +androidAppUrl);
			dc.setCapability("app", androidAppUrl);
			driver = new AndroidDriver<WebElement>(url,dc);
			String sessionId = driver.getSessionId().toString();
            setDriver(driver);
		}catch(Exception e) {

			e.printStackTrace();
			throw e;
		}finally {
			if(inputStream !=null) {
				inputStream.close();
			}
			if(stringsis !=null) {
				stringsis.close();
			}
		}

	}

	private void setPlatform(ThreadLocal<String> platform2) {
		// TODO Auto-generated method stub
		
	}
	private void setDateTime1(String dateTime2) {
		// TODO Auto-generated method stub
		
	}
	public void waitForVisibility(MobileElement e) {

		WebDriverWait wait = new WebDriverWait(getDriver(),TestUtils.WAIT);
		wait.until(ExpectedConditions.visibilityOf(e));
	}

	public void waitForVisibility(WebElement e) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())
		.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(e));
	}
	
	public void click(MobileElement e) {

		waitForVisibility(e);
		e.click();
	}
	public void clear(MobileElement e) {

		waitForVisibility(e);
		e.clear();
	}

	public void sendkeys(MobileElement e, String txt) {
		waitForVisibility(e);
		e.sendKeys(txt);
	}


	public String getAttribute(MobileElement e, String attribute) {
		waitForVisibility(e);
		return  e.getAttribute(attribute);
	}

	public void closeApp() {
		((InteractsWithApps) driver).closeApp();
	}
	public void launchApp() {
		((InteractsWithApps) driver).launchApp();
	}

	public String getText(MobileElement e) {
		return getAttribute(e,"text");
	}

	public  void scrollToElement(By e, String direction) {

		for(int i=0; i<3; i++) {

			if(isDisplayed(e)) {
				break;
			}else {
				if(direction.equalsIgnoreCase("up")) {
					scrollUsingTouchAction("up");
				}else {
					scrollUsingTouchAction("down");
				}
			}
		}




	}
	public  boolean isDisplayed(final By e) {
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(),2);
			return wait.until(new ExpectedCondition<Boolean>() {

				public Boolean apply(WebDriver driver) {

					if(driver.findElement(e).isDisplayed()) {
						return true; 
					}
					return false;
				}
			});
		} catch (Exception ex) {

			return false;
		}
	}


	public  void scrollUsingTouchAction(String direction) {

		Dimension dim = getDriver().manage().window().getSize();
		int x = dim.getWidth()/2;
		int starty=0;
		int endy=0;

		switch(direction) {	  
		case "up":
			starty = (int)(dim.getHeight()*0.8);
			endy = (int)(dim.getHeight()*0.2);
			break;

		case "down":
			starty = (int)(dim.getHeight()*0.2);
			endy = (int)(dim.getHeight()*0.8); 
			break;
		}

		TouchAction t=new TouchAction(getDriver());
		t.press(PointOption.point(x, starty)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		.moveTo(PointOption.point(x, endy)).release().perform();
	}

	@AfterTest
	public void afterTest() {
		getDriver().quit();
	}

	
	
	
}

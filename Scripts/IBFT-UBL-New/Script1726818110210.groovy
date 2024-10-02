import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import io.appium.java_client.ios.IOSDriver
import io.appium.java_client.MobileElement
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

// Get the device's screen height
int screenHeight = Mobile.getDeviceHeight()

// Get the device's screen width
int screenWidth = Mobile.getDeviceWidth()


Mobile.waitForElementPresent(findTestObject('Object Repository/IBFT-UBL/XCUIElementTypeStaticText - Money Transfer'), 0)

Mobile.tap(findTestObject('Object Repository/IBFT-UBL/XCUIElementTypeStaticText - Money Transfer'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/IBFT-UBL/XCUIElementTypeCell (2)'), 0)

Mobile.tap(findTestObject('Object Repository/IBFT-UBL/XCUIElementTypeStaticText - Bank Transfer'), 0)

TestObject BankObj = findTestObject('Object Repository/IBFT-UBL/XCUIElementTypeStaticText - United Bank Limited')
for(int i=0;i<10;i++)
{
	try
	{
		System.out.println("Value of i = " +  i)
		swipedownScreen()

		
		Mobile.verifyElementVisible(BankObj, 2)
		System.out.println(" element is found)")
		Mobile.tap(BankObj, 0)
		break
	}
	catch(Exception exp)
	{
		System.out.println("Exception element not found)")
	}
}



Mobile.setText(findTestObject('Object Repository/IBFT-UBL/XCUIElementTypeTextField - XXXXXXXXXXXXXXXXXXXXXXXX'), '0239074101111510',
		0)

Mobile.tap(findTestObject('Object Repository/IBFT-UBL/XCUIElementTypeButton - Done'), 0)

//Mobile.waitForElementNotPresent(findTestObject('Object Repository/IBFT-UBL/XCUIElementTypeOther'), 0)

Mobile.tap(findTestObject('Object Repository/IBFT-UBL/XCUIElementTypeStaticText - Add Bank Account Number'), 0)

Mobile.tap(findTestObject('Object Repository/IBFT-UBL/XCUIElementTypeStaticText - 1'), 0)

Mobile.tap(findTestObject('Object Repository/IBFT-UBL/XCUIElementTypeButton - Send Rs.  1'), 0)

Mobile.scrollToText('Others')

//Mobile.waitForElementNotPresent(findTestObject('Object Repository/IBFT-UBL/XCUIElementTypeOther (1)'), 0)

Mobile.tap(findTestObject('Object Repository/IBFT-UBL/XCUIElementTypeStaticText - Others'), 0)

//Mobile.waitForElementNotPresent(findTestObject('Object Repository/IBFT-UBL/XCUIElementTypeOther (2)'), 0)

Mobile.tap(findTestObject('Object Repository/IBFT-UBL/XCUIElementTypeStaticText - Confirm'), 0)

//Mobile.waitForElementNotPresent(findTestObject('Object Repository/IBFT-UBL/XCUIElementTypeOther (1)'), 0)

Mobile.tap(findTestObject('Object Repository/IBFT-UBL/XCUIElementTypeButton - homeCloseIcon'), 0)

//Mobile.waitForElementNotPresent(findTestObject('Object Repository/IBFT-UBL/XCUIElementTypeButton - 8'), 0)

Mobile.tap(findTestObject('Object Repository/IBFT-UBL/XCUIElementTypeStaticText - Yes, Cancel'), 0)
//



def swipedownScreen()
{



	// Get the AndroidDriver instance
	IOSDriver<MobileElement> driver = (IOSDriver<MobileElement>) MobileDriverFactory.getDriver()


	def swipeObject = new HashMap<String, Object>()
	swipeObject.put("direction", "up")
	
	int startX = 0;
	int endX = 0;
	int startY = 0;
	int endY = 0;
	
	int device_Height = Mobile.getDeviceHeight()
	int device_Width = Mobile.getDeviceWidth()
	
	startY = (device_Height * 0.50);
	endY = (int) (device_Height * 0.25);
	startX = (device_Width / 5);
	
	swipeObject.put("startX", startX)  // Start point X coordinate (percentage)
	swipeObject.put("startY", startY)  // Start point Y coordinate (percentage)
	swipeObject.put("endX", startX)    // End point X coordinate (percentage)
	swipeObject.put("endY", startX)    // End point Y coordinate (percentage)
	

	
	swipeObject.put("duration", 2000)  // Duration in milliseconds
	
	driver.executeScript("mobile: swipe", swipeObject)
	
	

}




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

//import io.appium.java_client.AppiumDriver
//import io.appium.java_client.ios.IOSDriver
//import org.openqa.selenium.remote.DesiredCapabilities
//
//// Appium server URL
//URL appiumServerUrl = new URL("http://127.0.0.1:4724/wd/hub")
//
//// Desired capabilities for the iOS app
//DesiredCapabilities capabilities = new DesiredCapabilities()
//capabilities.setCapability("platformName", "iOS")
//capabilities.setCapability("deviceName", "iPhone 12")  // Set your iOS device name
//capabilities.setCapability("platformVersion", "15.0")  // Set your iOS version
//capabilities.setCapability("automationName", "XCUITest")
//capabilities.setCapability("bundleId", "com.apple.Health")
//capabilities.setCapability("newCommandTimeout", 1800)
//capabilities.setCapability("wdaLocalPort", 50486)  // Make sure this port is available
//
//// Connect to the Appium server and launch the app
//AppiumDriver driver = new IOSDriver(appiumServerUrl, capabilities)
//
//// Perform actions with the driver here, e.g., interacting with the app, finding elements, etc.
//// ...
//
//// Close the session
//driver.quit()


Mobile.startExistingApplication('com.apple.Health')

Mobile.waitForElementNotPresent(findTestObject('Object Repository/Health/XCUIElementTypeStaticText - Continue'), 0)
Mobile.tap(findTestObject('Object Repository/Health/XCUIElementTypeStaticText - Continue'), 0)
//Mobile.tap(findTestObject('Object Repository/Health/XCUIElementTypeStaticText - Show All Health Trends'), 0)

Mobile.tap(findTestObject('Object Repository/Health/XCUIElementTypeStaticText - Continue'), 0)

//Mobile.tap(findTestObject('Object Repository/Health/XCUIElementTypeStaticText - Continue'), 0)

Mobile.setText(findTestObject('Object Repository/Health/XCUIElementTypeTextField - Optional'), 'Muhammad Sadiq', 0)
Mobile.delay(2)

Mobile.closeApplication()


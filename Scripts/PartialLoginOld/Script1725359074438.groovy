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
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.MobileElement as MobileElement
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.By

Mobile.startExistingApplication('com.jazzcash.customerapp')


Mobile.waitForElementNotPresent( findTestObject('Object Repository/PartialLogin/XCUIElementTypeButton')  , 0, FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/PartialLogin/XCUIElementTypeButton'), 0)

Mobile.waitForElementNotPresent( findTestObject('bject Repository/Login/XCUIElementTypeButton - 1')  , 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Login/XCUIElementTypeButton - 1'), 0)

Mobile.tap(findTestObject('Object Repository/Login/XCUIElementTypeButton - 1'), 0)

Mobile.tap(findTestObject('Object Repository/Login/XCUIElementTypeStaticText - 2'), 0)

Mobile.tap(findTestObject('Object Repository/Login/XCUIElementTypeStaticText - 2'), 0)


//AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver()
//
//MobileElement TestElement = driver.findElementByXPath('//XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton')
//
////WebDriverWait waitObj = new WebDriverWait(driver,10)
////waitObj.until(ExpectedConditions.elementToBeClickable(TestElement)
////	By.xpath("'//XCUIElementTypeStaticText[@name=\'Log in\']'"));
//
//
//
//System.out.println('mTestElement =' + TestElement.id)
//TestElement.click()




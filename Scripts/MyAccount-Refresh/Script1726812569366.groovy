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



Mobile.waitForElementPresent(findTestObject('Object Repository/MyAccount/XCUIElementTypeImage - background'), 3)

Mobile.tap(findTestObject('Object Repository/MyAccount/XCUIElementTypeStaticText - My Account'), 3)

Mobile.waitForElementPresent(findTestObject('Object Repository/MyAccount/XCUIElementTypeCell (1)'), 3)

Mobile.tap(findTestObject('Object Repository/MyAccount/XCUIElementTypeStaticText - Got It'), 3)

Mobile.waitForElementPresent(findTestObject('Object Repository/MyAccount/XCUIElementTypeCell (2)'), 3)

Mobile.tap(findTestObject('Object Repository/MyAccount/XCUIElementTypeStaticText - Got It'), 3)

Mobile.waitForElementPresent(findTestObject('Object Repository/MyAccount/XCUIElementTypeCell (3)'), 3)

Mobile.tap(findTestObject('Object Repository/MyAccount/XCUIElementTypeTable'), 3)

Mobile.tap(findTestObject('Object Repository/MyAccount/XCUIElementTypeStaticText - Got It'), 3)



Mobile.scrollToText('Transaction History')

Mobile.waitForElementPresent(findTestObject('Object Repository/MyAccount/XCUIElementTypeOther'), 3)

Mobile.tap(findTestObject('Object Repository/MyAccount/XCUIElementTypeStaticText - Transaction History'), 3)

Mobile.waitForElementPresent(findTestObject('Object Repository/MyAccount/XCUIElementTypeOther'), 3)

Mobile.tap(findTestObject('Object Repository/MyAccount/XCUIElementTypeButton - back'), 3)

Mobile.scrollToText('Logout')

Mobile.waitForElementPresent(findTestObject('Object Repository/MyAccount/XCUIElementTypeOther'), 3)

Mobile.tap(findTestObject('Object Repository/MyAccount/XCUIElementTypeStaticText - Logout'), 3)

Mobile.waitForElementPresent(findTestObject('Object Repository/MyAccount/XCUIElementTypeCell'), 3)

Mobile.tap(findTestObject('Object Repository/MyAccount/XCUIElementTypeStaticText - Yes, Im sure'), 3)

Mobile.closeApplication()


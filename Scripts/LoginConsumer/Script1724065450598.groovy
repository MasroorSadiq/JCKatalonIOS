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

Mobile.startApplication('/Users/mansoor.sadiq/Jazz App/IOS/JazzCash Customer.ipa', true)

//Mobile.tap(findTestObject('Login/DontAllowPopup'), 2)



Mobile.tap(findTestObject('Object Repository/Login/XCUIElementTypeTextField - 03XXXXXXXXX'), 2)



Mobile.tap(findTestObject('Object Repository/Login/XCUIElementTypeStaticText - 0'), 2)

Mobile.tap(findTestObject('Object Repository/Login/XCUIElementTypeStaticText - 3'), 2)

Mobile.tap(findTestObject('Object Repository/Login/XCUIElementTypeStaticText - 1'), 2)

Mobile.tap(findTestObject('Object Repository/Login/XCUIElementTypeStaticText - 3'), 2)

Mobile.tap(findTestObject('Object Repository/Login/XCUIElementTypeStaticText - 0'), 2)

Mobile.tap(findTestObject('Object Repository/Login/XCUIElementTypeStaticText - 5'), 2)

Mobile.tap(findTestObject('Object Repository/Login/XCUIElementTypeStaticText - 0'), 2)

Mobile.tap(findTestObject('Object Repository/Login/XCUIElementTypeStaticText - 5'), 2)

Mobile.tap(findTestObject('Object Repository/Login/XCUIElementTypeStaticText - 9'), 2)

Mobile.tap(findTestObject('Object Repository/Login/XCUIElementTypeStaticText - 4'), 2)

Mobile.tap(findTestObject('Object Repository/Login/XCUIElementTypeStaticText - 5'), 2)

Mobile.tap(findTestObject('Object Repository/Login/XCUIElementTypeButton - Continue'), 2)

Mobile.waitForElementPresent(findTestObject('Object Repository/Login/XCUIElementTypeButton - 1'), 5)

Mobile.tap(findTestObject('Object Repository/Login/XCUIElementTypeButton - 1'), 2)

Mobile.tap(findTestObject('Object Repository/Login/XCUIElementTypeButton - 1'), 2)

Mobile.tap(findTestObject('Object Repository/Login/XCUIElementTypeStaticText - 2'), 2)

Mobile.tap(findTestObject('Object Repository/Login/XCUIElementTypeStaticText - 2'), 2)




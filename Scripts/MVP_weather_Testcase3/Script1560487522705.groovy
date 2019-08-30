import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com/')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Weather Application/Page_Weather Application/span_England_us'), 
    5)

WebUI.click(findTestObject('Object Repository/Page_Weather Application/Page_Weather Application/span_England_us'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Weather Application/Page_Weather Application/h1_United States of America'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Weather Application/Page_Weather Application/span_United States of America_fr'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Weather Application/Page_Weather Application/h1_France'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Weather Application/Page_Weather Application/h1_France'), 
    'France')

WebUI.click(findTestObject('Object Repository/Page_Weather Application/Page_Weather Application/span_France_en'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Weather Application/Page_Weather Application/h1_England'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Weather Application/Page_Weather Application/h1_England'), 
    'England')

WebUI.closeBrowser()


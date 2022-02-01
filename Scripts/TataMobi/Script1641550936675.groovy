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

Mobile.startApplication('C:\\Users\\ASUS\\Downloads\\com.tce.studi.10.apk', false)

Mobile.waitForElementPresent(findTestObject('TataStudi/ObjChildNameEdit'), 10)

Mobile.sendKeys(findTestObject('TataStudi/ObjChildNameEdit'), 'Children')

Mobile.tap(findTestObject('TataStudi/ObjSignUp'), 5)

Mobile.tap(findTestObject('TataStudi/ObjCBSE'), 5)

Mobile.tap(findTestObject('TataStudi/ObjClass1'), 5)

Mobile.tap(findTestObject('TataStudi/ObjContinue'), 5)

Mobile.sendKeys(findTestObject('TataStudi/ObjMobileNo'), '8888888888')

Mobile.sendKeys(findTestObject('TataStudi/ObjEmailID'), 'testing@gmail.com')

Mobile.tap(findTestObject('TataStudi/ObjVerifyMobile'), 5)


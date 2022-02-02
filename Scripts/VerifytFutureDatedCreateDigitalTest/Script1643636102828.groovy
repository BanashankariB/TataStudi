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

Mobile.startApplication('C:\\Users\\ASUS\\Downloads\\com.tce.studi.42.apk', true)

Mobile.tap(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.widget.TextView - Already a User Login'), 
    0)

Mobile.setText(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.widget.EditText'), '9886664332', 
    0)

Mobile.tap(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.widget.TextView - Login'), 0)

Mobile.setText(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.widget.EditText (1)'), 'Password123!@#', 
    0)

Mobile.tap(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.widget.TextView - Verify'), 0)

Mobile.tap(findTestObject('VerifyIdontKnowClick/android.widget.TextView - Anvita'), 0)

Mobile.tap(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.widget.TextView - Start new session'), 
    0)


Mobile.tap(findTestObject('VerifyCreateNote/android.widget.TextView - Hide Message'), 0)
Mobile.tap(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.widget.TextView - Hide Message'), 
    0)

Mobile.tap(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.widget.TextView - Assignments'), 
    0)

Mobile.tap(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.widget.TextView - Digital Test'), 
    0)

Mobile.tap(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.widget.TextView - English Language'), 
    0)

Mobile.tap(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.widget.TextView - Introduction to Naming Words'), 
    0)

Mobile.tap(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.widget.TextView - Common and Special Naming Words'), 
    0)

Mobile.scrollToText('Next')

Mobile.tap(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.widget.TextView - 31-Jan-2022'), 
    0)

Mobile.tap(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.view.View - 22'), 0)

Mobile.tap(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.widget.Button - OK'), 0)

Mobile.scrollToText('Assign')

Mobile.tap(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.widget.TextView - Assign'), 0)

Mobile.scrollToText('Upcoming')

Mobile.verifyElementVisible(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.widget.TextView - 1  assignment scheduled'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.widget.TextView - Test'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/VerifytFutureDatedCreateDigitalTest/android.widget.TextView - Digital Test English Language'), 
    0)

Mobile.closeApplication()


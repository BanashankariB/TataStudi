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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

KeywordUtil.logInfo("Starting application")
KeywordUtil.logInfo("Starting application")
Mobile.startApplication('C:\\Users\\ASUS\\Downloads\\com.tce.studi.42.apk', true)

KeywordUtil.logInfo("Clicking sign in button")

Mobile.tap(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.TextView - Already a User Login'), 0)

KeywordUtil.logInfo("Entering mobile number")

Mobile.setText(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.EditText'), '9886664332', 0)

KeywordUtil.logInfo("Clicking Login button")


Mobile.tap(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.TextView - Login'), 0)

KeywordUtil.logInfo("Entering password")


Mobile.setText(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.EditText (1)'), 'Password123!@#', 0)

KeywordUtil.logInfo("Clicking Verify button")

Mobile.tap(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.TextView - Verify'), 0)

KeywordUtil.logInfo("Verifying profile user and clicking on it")

Mobile.tap(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.TextView - Anvita'), 0)

KeywordUtil.logInfo("Clicking startnew session")


Mobile.tap(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.TextView - Start new session'), 0)

KeywordUtil.logInfo("Clicking Hide report button")


Mobile.tap(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.TextView - Hide Message'), 0)

KeywordUtil.logInfo("Clicking Syllabus button")


Mobile.tap(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.TextView - Syllabus'), 0)

KeywordUtil.logInfo("Clicking add button to create oral test")


Mobile.tap(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.ImageButton'), 0)

KeywordUtil.logInfo("Clicking oral test button")


Mobile.tap(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.TextView - Oral Test'), 0)

KeywordUtil.logInfo("Clicking select lang button")


Mobile.tap(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.TextView - English Language'), 0)

KeywordUtil.logInfo("Clicking select chapter button")


Mobile.tap(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.TextView - Common and Special Naming Words'), 
    0)

KeywordUtil.logInfo("Clicking  select chapter button")

Mobile.scrollToText('One and Many')

Mobile.tap(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.TextView - One and Many'), 0)

Mobile.scrollToText('Next')


KeywordUtil.logInfo("Clicking  next button")
Mobile.tap(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.TextView - Next'), 0)

Mobile.scrollToText('Start Test')

KeywordUtil.logInfo("Clicking start  test button")

Mobile.tap(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.TextView - Start Test'), 0)

KeywordUtil.logInfo("Verifying start test screen")

Mobile.verifyElementVisible(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.TextView - What you will be tested on'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.TextView - Begin Test'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.TextView - Common and Special Naming Words (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.TextView - One and Many (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.TextView - What are common and special naming words'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/VerifyCreateOralTest/android.widget.TextView - How are words showing one and many different'), 
    0)

KeywordUtil.logInfo("Closing application")

Mobile.closeApplication()


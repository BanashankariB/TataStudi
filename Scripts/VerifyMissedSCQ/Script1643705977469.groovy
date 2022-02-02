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

Mobile.tap(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.TextView - Already a User Login'), 0)

Mobile.setText(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.EditText'), '9886664332', 0)

Mobile.tap(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.TextView - Login'), 0)

Mobile.setText(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.EditText (1)'), 'Password123!@#', 0)

Mobile.tap(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.TextView - Verify'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.TextView - Anvita'), 0)

Mobile.tap(findTestObject('android.widget.TextView - Anvita (1)'), 0)

Mobile.tap(findTestObject('ReviseModuleQuizCorrectOptionSubmit/android.widget.TextView - Start new session'), 0)

Mobile.tap(findTestObject('VerifyCreateNote/android.widget.TextView - Hide Message'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.TextView - Syllabus'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.TextView - English Language'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.TextView - Test'), 0)

Mobile.tap(findTestObject('VerifyMissedSCQ/android.widget.TextView - Re-attempt Test'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.TextView - Re-attempt Test (1)'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.CheckedTextView - bee'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.CheckedTextView - honey'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.TextView - parrot'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.TextView - her'), 0)

Mobile.tap(findTestObject('VerifyMissedSCQ/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.TextView - Baby'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.TextView - Cat'), 0)

Mobile.tap(findTestObject('VerifyMissedSCQ/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('VerifyMissedSCQ/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('VerifyMissedSCQ/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('VerifyMissedSCQ/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.TextView - Submit Test'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.TextView - Check Answers'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.TextView - Correct'), 0)

Mobile.tap(findTestObject('VerifyMissedSCQ/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('VerifyMissedSCQ/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('VerifyMissedSCQ/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('VerifyMissedSCQ/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('VerifyMissedSCQ/android.widget.ImageView'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.TextView - Missed'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.TextView - Exit Review'), 0)

Mobile.tap(findTestObject('VerifyMissedSCQ/android.widget.TextView - Re-attempt Test'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.TextView - Re-attempt Test (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/VerifyMissedSCQ/android.widget.TextView - Look at the picture and fill in the blank'), 
    0)

Mobile.closeApplication()


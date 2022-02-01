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

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - Already a User Login'), 0)

Mobile.setText(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.EditText'), '9886664332', 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - Login'), 0)

Mobile.setText(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.EditText (2)'), 'Password123!@#', 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - Verify'), 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - Anvita'), 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - Syllabus'), 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - English Language'), 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - Test'), 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - Test again'), 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.CheckedTextView - bee'), 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.CheckedTextView - honey'), 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - parrot'), 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - girl'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - Bottle'), 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - Baby'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.CheckedTextView - fruits'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.CheckedTextView - garden'), 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.CheckedTextView - friends'), 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.CheckedTextView - toys'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - End of Test'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - You have reached the end of test'), 
    0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - Submit Test'), 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - Check Answers'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - Exit Review'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.CheckedTextView - bee (1)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - Re-attempt Test'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - Re-attempt Test for a better score'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - All previous scores will be lost'), 
    0)

Mobile.tap(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - Return'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/VeriFyMissedMCQ/android.widget.TextView - Oops You missed this'), 
    0)

Mobile.closeApplication()


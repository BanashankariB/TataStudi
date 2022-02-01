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

Mobile.tap(findTestObject('Object Repository/VerifyIdontKnowClick/android.widget.TextView - Already a User Login'), 0)

Mobile.setText(findTestObject('Object Repository/VerifyIdontKnowClick/android.widget.EditText'), '9886664332', 0)

Mobile.tap(findTestObject('Object Repository/VerifyIdontKnowClick/android.widget.TextView - Login'), 0)

Mobile.setText(findTestObject('Object Repository/VerifyIdontKnowClick/android.widget.EditText (2)'), 'Password123!@#', 0)

Mobile.tap(findTestObject('Object Repository/VerifyIdontKnowClick/android.widget.TextView - Verify'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyIdontKnowClick/android.widget.TextView - Anvita'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyIdontKnowClick/android.widget.TextView - Start new session'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyIdontKnowClick/android.widget.TextView - Syllabus'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyIdontKnowClick/android.widget.TextView - English Language'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyIdontKnowClick/android.widget.TextView - Introduction to Naming Words'), 
    0)

Mobile.tap(findTestObject('VerifyIdontKnowClick/android.widget.TextView - Begin Practice (1)'), 0)

Mobile.tap(findTestObject('VerifyIdontKnowClick/android.widget.TextView - Begin Practice'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyIdontKnowClick/android.widget.CheckedTextView - eraser'), 0)

Mobile.tap(findTestObject('VerifyIdontKnowClick/android.widget.TextView - Check Answer'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/VerifyIdontKnowClick/android.widget.TextView - Not quite. Lets continue'), 
    0)

Mobile.tap(findTestObject('VerifyIdontKnowClick/android.widget.TextView - Continue'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyIdontKnowClick/android.widget.TextView - a'), 10)

Mobile.tap(findTestObject('VerifyIdontKnowClick/android.widget.TextView - a (1)'), 0)

Mobile.tap(findTestObject('VerifyIdontKnowClick/android.widget.TextView - Check Answer'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/VerifyIdontKnowClick/android.widget.TextView - Uh-oh Give it another shot'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/VerifyIdontKnowClick/android.widget.TextView - I dont know'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/VerifyIdontKnowClick/android.widget.TextView - Try Again'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/VerifyIdontKnowClick/android.widget.TextView - Not quite right'), 
    0)

Mobile.tap(findTestObject('VerifyIdontKnowClick/android.widget.TextView - I dont know'), 0)

Mobile.closeApplication()


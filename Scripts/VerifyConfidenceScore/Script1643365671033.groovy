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

Mobile.tap(findTestObject('Object Repository/NonRegisteredUser/android.widget.TextView - Already a User Login'), 0)

Mobile.setText(findTestObject('Object Repository/NonRegisteredUser/android.widget.EditText'), '9886664332', 0)

Mobile.tap(findTestObject('Object Repository/NonRegisteredUser/android.widget.TextView - Login'), 0)

Mobile.setText(findTestObject('Object Repository/NonRegisteredUser/android.widget.EditText (1)'), 'Password123!@#', 0)

Mobile.tap(findTestObject('Object Repository/NonRegisteredUser/android.widget.TextView - Verify'), 0)

Mobile.waitForElementPresent(findTestObject('android.widget.TextView - Anvita (1)'), 0)

Mobile.tap(findTestObject('android.widget.TextView - Anvita (1)'), 0)

Mobile.tap(findTestObject('android.widget.TextView - Start new session'), 0)

Mobile.tap(findTestObject('android.widget.TextView - Syllabus'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/ExplorePlan/android.widget.TextView - English Language'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/ExplorePlan/android.widget.TextView - English Literature'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/ExplorePlan/android.widget.TextView - Hindi Language'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/ExplorePlan/android.widget.TextView - Hindi Literature'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/ExplorePlan/android.widget.TextView - Mathematics'), 0)

Mobile.tap(findTestObject('Object Repository/ExplorePlan/android.view.ViewGroup (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/ExplorePlan/android.widget.TextView - All Chapters'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/ExplorePlan/android.widget.TextView - Introduction to Naming Words'), 
    0)

Mobile.scrollToText('One and Many', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Highlight', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/ExplorePlan/android.widget.TextView - Highlight'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/ExplorePlan/android.widget.TextView - Study Status'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/ExplorePlan/android.widget.TextView - Not Assessed'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/ExplorePlan/android.widget.TextView - Completed in School'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/ExplorePlan/android.widget.TextView - Low Confidence'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/ExplorePlan/android.widget.TextView - Medium Confidence'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/ExplorePlan/android.widget.TextView - High Confidence'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/ExplorePlan/android.widget.TextView - Apply'), 0)

Mobile.pressBack()

Mobile.closeApplication()


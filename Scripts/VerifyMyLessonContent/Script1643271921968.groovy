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

Mobile.tap(findTestObject('Object Repository/MyLesson/android.widget.TextView - Already a User Login'), 0)

Mobile.setText(findTestObject('Object Repository/MyLesson/android.widget.EditText'), '9886664332', 0)

Mobile.tap(findTestObject('Object Repository/MyLesson/android.widget.TextView - Login'), 0)

Mobile.setText(findTestObject('Object Repository/MyLesson/android.widget.EditText (1)'), 'Password123!@#', 0)

Mobile.tap(findTestObject('Object Repository/MyLesson/android.widget.TextView - Verify'), 0)

Mobile.tap(findTestObject('android.widget.TextView - Anvita (1)'), 0)

Mobile.checkElement(findTestObject('android.widget.TextView - Start new session'), 0)

Mobile.tap(findTestObject('VerifyCreateNote/android.widget.TextView - Hide Message'), 0)

Mobile.tap(findTestObject('MyLesson/android.widget.TextView - Plan  Test Unit'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/MyLesson/android.widget.TextView - Our plan for today'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MyLesson/android.widget.TextView - 3 mins'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MyLesson/android.widget.TextView - Today'), 0)

Mobile.scrollToText('Upcoming', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/MyLesson/android.widget.TextView - Upcoming'), 0)

Mobile.scrollToText('View Full Schedule', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/MyLesson/android.widget.TextView - View Full Schedule'), 0)

Mobile.scrollToText('Portion', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/MyLesson/android.widget.TextView - Portion'), 0)

Mobile.scrollToText('Time', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/MyLesson/android.widget.TextView - Time'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/MyLesson/android.widget.TextView - Review Plan'), 0)

Mobile.scrollToText('Test', FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/MyLesson/android.widget.TextView - Test'), 0)

Mobile.closeApplication()


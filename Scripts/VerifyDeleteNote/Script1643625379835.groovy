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

Mobile.tap(findTestObject('Object Repository/VerifyDeleteNote/android.widget.TextView - Already a User Login'), 0)

Mobile.setText(findTestObject('Object Repository/VerifyDeleteNote/android.widget.EditText'), '9886664332', 0)

Mobile.tap(findTestObject('Object Repository/VerifyDeleteNote/android.widget.TextView - Login'), 0)

Mobile.setText(findTestObject('Object Repository/VerifyDeleteNote/android.widget.EditText (1)'), 'Password123!@#', 0)

Mobile.tap(findTestObject('Object Repository/VerifyDeleteNote/android.widget.TextView - Verify'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyDeleteNote/android.widget.TextView - Anvita'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyDeleteNote/android.widget.TextView - Start new session'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyDeleteNote/android.widget.TextView - Hide Message'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyDeleteNote/android.widget.TextView - Syllabus'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyDeleteNote/android.widget.TextView - English Language'), 0)

Mobile.tapAndHold(findTestObject('Object Repository/VerifyDeleteNote/android.widget.TextView - Introduction to Naming Words'), 
    0, 0)

String sBeforeDelete = Mobile.getText(findTestObject('VerifyDeleteNote/android.widget.TextView - 20 Notes'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyDeleteNote/android.widget.TextView - Notes'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyDeleteNote/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyDeleteNote/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyDeleteNote/android.widget.TextView - Delete Note'), 0)

Mobile.tap(findTestObject('Object Repository/VerifyDeleteNote/android.widget.ImageView (1)'), 0)

String sAfterDelete = Mobile.getText(findTestObject('VerifyDeleteNote/android.widget.TextView - 20 Notes'), 0)

Mobile.verifyNotEqual(sBeforeDelete.replaceAll("[^0-9]", ""),sAfterDelete.replaceAll("[^0-9]", ""))

Mobile.closeApplication()


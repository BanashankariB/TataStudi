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

Mobile.startApplication('C:\\Users\\ASUS\\Downloads\\com.tce.studi.10 (1).apk', true)

Mobile.setText(findTestObject('Object Repository/SignUp15Days Trial/android.widget.EditText (5)'), 'Anvita', 0)

Mobile.tap(findTestObject('Object Repository/SignUp15Days Trial/android.widget.TextView - Sign up (1)'), 0)

Mobile.tap(findTestObject('Object Repository/SignUp15Days Trial/android.widget.TextView - Continue (1)'), 0)

Mobile.setText(findTestObject('Object Repository/SignUp15Days Trial/android.widget.EditText (6)'), '9886664332', 0)

Mobile.setText(findTestObject('Object Repository/SignUp15Days Trial/android.widget.EditText (7)'), 'banashankari17@gmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/SignUp15Days Trial/android.widget.TextView - Verify Mobile (1)'), 0)

Mobile.tap(findTestObject('Object Repository/SignUp15Days Trial/android.widget.TextView - Verify (1)'), 0)

Mobile.setText(findTestObject('Object Repository/SignUp15Days Trial/android.widget.EditText (8)'), 'Password123!@#', 0)

Mobile.tap(findTestObject('Object Repository/SignUp15Days Trial/android.widget.TextView - Create Password (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SignUp15Days Trial/android.widget.TextView - Get Started (1)'), 
    0)

Mobile.tap(findTestObject(''), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/SignUp15Days Trial/android.widget.TextView - Choose a profile'), 
    0)

Mobile.verifyEqual(findTestObject(''), 0)

Mobile.verifyEqual(findTestObject(''), 0)

Mobile.closeApplication()


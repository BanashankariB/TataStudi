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

Mobile.startApplication('C:\\Users\\User\\Downloads\\com.tce.studi.10.apk', true)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.TextView - Already a User Login'), 0)

Mobile.setText(findTestObject('Object Repository/Recorded/android.widget.EditText'), '9880005460', 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.TextView - Login'), 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Recorded/android.widget.EditText (1)'), 'L45czgZYkZcEE8xM5YqqWA==', 
    0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.TextView - Verify'), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.RelativeLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.TextView - Create new profile'), 0)

Mobile.setText(findTestObject('Object Repository/Recorded/android.widget.EditText (2)'), 'Testing', 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.TextView - CBSE - NCERT'), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.TextView - Class 1'), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.TextView - Continue'), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.TextView - Select new plan'), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.TextView - Continue with the 14 days free trial'), 
    0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.TextView - Accept Terms'), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.TextView - Create Study Plan'), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.Image'), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.TextView'), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.TextView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.Button - Add to portion'), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.Image (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.TextView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.TextView (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.Button - Add to portion (1)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.Image (2)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.TextView (4)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.Button - Next Step'), 0)

Mobile.swipe(0, 0, 0, 300)

Mobile.swipe(0, 500, 0, 200)

Mobile.scrollToText('Hindi Literature')

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.Image (3)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.Image (4)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.Button - Next Step (1)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.Button - Next Step (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Recorded/android.widget.EditText - Test Unit'), 'Testing Plan', 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.Button - Activate Plan'), 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.Button - Begin studying'), 0)

Mobile.closeApplication()


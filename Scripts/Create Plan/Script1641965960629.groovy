import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import io.appium.java_client.MobileElement as MobileElement

Mobile.startApplication('C:\\Users\\User\\Downloads\\com.tce.studi.10.apk', false)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.TextView - Already a User Login'), 0)

Mobile.setText(findTestObject('Object Repository/Recorded/android.widget.EditText'), '9880005460', 0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.TextView - Login'), 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Recorded/android.widget.EditText (1)'), '3Z9vEXbPUsAj6uTp7mC4Pw==', 
    0)

Mobile.tap(findTestObject('Object Repository/Recorded/android.widget.TextView - Verify'), 0)

Mobile.tap(findTestObject('Object Repository/Create Plan/android.widget.RelativeLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Create Plan/android.widget.ImageView'), 0)

Mobile.delay(5)

Mobile.scrollToText('Manage and Create Plans')

Mobile.delay(5)

//AndroidDriver driver = MobileDriverFactory.driver
//
//MobileElement signInButton = (MobileElement)driver.findElementByXPath("//*[contains(text(),'Manage and Create Plans')]")
//
//signInButton.click()
Mobile.tap(findTestObject('Object Repository/Create Plan/android.widget.TextView - Manage and Create Plans'), 0)

//Mobile.tap(findTestObject('Object Repository/Create Plan/android.widget.TextView - CREATE A STUDY PLAN'), 0)

Mobile.tap(findTestObject('Object Repository/Create Plan/android.widget.TextView - Create Plan'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Create Plan/android.widget.Image'), 0)

Mobile.tap(findTestObject('Object Repository/Create Plan/android.widget.TextView'), 0)

Mobile.delay(5)

//Mobile.tap(findTestObject('Object Repository/Create Plan/android.widget.Button - Add to portion'), 0)

MobileElement element = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Create Plan/android.widget.Button - Add to portion'), 10)
element.click()

Mobile.tap(findTestObject('Object Repository/Create Plan/android.widget.Image (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Create Plan/android.widget.Button - Next Step'), 0)

MobileElement element1 = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Create Plan/android.widget.Button - Next Step'), 10)
element1.click()

MobileElement element2 = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Create Plan/android.widget.Button - Next Step'), 10)
element2.click()

MobileElement element3 = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Create Plan/android.widget.Button - Activate Plan'), 10)
element3.click()

MobileElement element4 = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Create Plan/android.widget.Button - Begin studying'), 10)
element4.click()

Mobile.pressBack()

Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/Create Plan/android.widget.TextView - Sign Out'), 0)

Mobile.pressBack()
Mobile.delay(2)

Mobile.closeApplication()


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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Home Page/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/User Account Pages/Login Page/Registration Section/input_Email address create'), 'sara1@testing.com')

WebUI.click(findTestObject('Object Repository/User Account Pages/Login Page/Registration Section/button_Create an account'))

WebUI.click(findTestObject('Object Repository/User Account Pages/Registration Page/Personal Information Section/radio_Gender_Mr'))

WebUI.setText(findTestObject('Object Repository/User Account Pages/Registration Page/Personal Information Section/input_Customer First Name'), 
    'Sara')

WebUI.setText(findTestObject('Object Repository/User Account Pages/Registration Page/Personal Information Section/input_ Customer Last Name'), 
    'Sarah')

WebUI.setText(findTestObject('Object Repository/User Account Pages/Registration Page/Personal Information Section/input_Email'), 'sara1@testing.com')

WebUI.setEncryptedText(findTestObject('Object Repository/User Account Pages/Registration Page/Personal Information Section/input_Password'), 
    '/6k4BPw6PkQ=')

WebUI.selectOptionByValue(findTestObject('Object Repository/User Account Pages/Registration Page/Personal Information Section/input_DoB_Day'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/User Account Pages/Registration Page/Personal Information Section/input_DoB_Month'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/User Account Pages/Registration Page/Personal Information Section/input_DoB_Year'), 
    '1977', true)

WebUI.setText(findTestObject('Object Repository/User Account Pages/Registration Page/Address Section/input_First Name'), 'Sara')

WebUI.setText(findTestObject('Object Repository/User Account Pages/Registration Page/Address Section/input_Last Name'), 'Sarah')

WebUI.setText(findTestObject('Object Repository/User Account Pages/Registration Page/Address Section/input_Company'), 'AGT')

WebUI.setText(findTestObject('Object Repository/User Account Pages/Registration Page/Address Section/input_Address Line 1'), 'PO')

WebUI.setText(findTestObject('Object Repository/User Account Pages/Registration Page/Address Section/input_Address Line 2'), 'PO')

WebUI.setText(findTestObject('Object Repository/User Account Pages/Registration Page/Address Section/input_City'), 'BGD')

WebUI.selectOptionByValue(findTestObject('Object Repository/User Account Pages/Registration Page/Address Section/select_State'), '1', true)

WebUI.setText(findTestObject('Object Repository/User Account Pages/Registration Page/Address Section/input_Postal Code'), '12312')

WebUI.setText(findTestObject('Object Repository/User Account Pages/Registration Page/Address Section/textarea_Additional Information'), 'A')

WebUI.setText(findTestObject('Object Repository/User Account Pages/Registration Page/Address Section/input_Home Phone'), '1123')

WebUI.setText(findTestObject('Object Repository/User Account Pages/Registration Page/Address Section/input_Mobile Phone'), '123')

WebUI.setText(findTestObject('Object Repository/User Account Pages/Registration Page/Address Section/input_Address Alias'), 'My addressADD')

WebUI.click(findTestObject('Object Repository/User Account Pages/Registration Page/button_Register'))


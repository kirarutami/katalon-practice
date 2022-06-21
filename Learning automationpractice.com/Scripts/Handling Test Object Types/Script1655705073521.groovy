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

WebUI.maximizeWindow()

WebUI.navigateToUrl('automationpractice.com')

WebUI.click(findTestObject('Object Repository/Home Page/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/User Account Pages/Login Page/Registration Section/input_Email address create'), 
    'emailadddd@testing.com')

WebUI.delay(5)

WebUI.click(findTestObject('User Account Pages/Login Page/Registration Section/button_Create an account'))

WebUI.selectOptionByLabel(findTestObject('User Account Pages/Registration Page/Personal Information Section/input_DoB_Day'), 
    '4  ', false)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('User Account Pages/Registration Page/Personal Information Section/input_DoB_Month'), 
    '5', false)

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('User Account Pages/Registration Page/Personal Information Section/input_DoB_Year'), 
    3)

WebUI.delay(3)

WebUI.closeBrowser()


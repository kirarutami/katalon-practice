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

WebUI.click(findTestObject('Page_My Store/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email_create'), 'sara1@testing.com')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Create an account'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Mr_id_gender'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/label_Mrs'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname'), 'Sara')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_lastname'), 'Sarah')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input__email'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/form_Your personal informationTitleMr.Mrs.F_0dfd37'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__email'), 'sara1@testing.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input__passwd'), '/6k4BPw6PkQ=')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-12345678910111213141516171819202122_51e29d'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-20222021202020192018201720162015201_66c453'), 
    '1977', true)

WebUI.doubleClick(findTestObject('Object Repository/Page_Login - My Store/label_Sign up for our newsletter'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Login - My Store/label_Receive special offers from our partners'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input__firstname'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/form_Your personal informationTitleMr.Mrs.F_a5232a'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__firstname'), 'Sara')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__lastname'), 'Sarah')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Company_company'), 'AGT')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__address1'), 'PO')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Address (Line 2)_address2'), 'PO')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__city'), 'BGD')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__postcode'), '12312')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/textarea_Additional information_other'), 'A')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Home phone_phone'), '1123')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__phone_mobile'), '123')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__alias'), 'My addressADD')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))


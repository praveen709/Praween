import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/index.php/auth/login')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Username'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Assign Leave'))

WebUI.verifyTextPresent('', false)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Reports'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Leave Entitlements and Usage Report'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OrangeHRM/select_-- Select --Leave TypeEmployee'), '1', 
    true)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Reports'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Leave Entitlements and Usage Report'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OrangeHRM/select_-- Select --Leave TypeEmployee'), '2', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input__leave_balanceemployeeempName'), 'fgfg')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__view'))

WebUI.closeBrowser()


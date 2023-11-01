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

WebUI.openBrowser("https://www.amazon.com/");
WebUI.click(findTestObject("Object Repository/signin"))

WebUI.setText(findTestObject("Object Repository/emailobj"), GlobalVariable.email)
WebUI.click(findTestObject("Object Repository/clickcontinueobj"))
WebUI.setEncryptedText(findTestObject("Object Repository/passwordtestobj"), GlobalVariable.password)
WebUI.click(findTestObject("Object Repository/finalsignin"))
WebUI.setText(findTestObject("Object Repository/amazonsearchobj"), GlobalVariable.search)
WebUI.click(findTestObject("Object Repository/dropdownobj"))
WebUI.click(findTestObject("Object Repository/itemclickobj"))
WebUI.click(findTestObject("Object Repository/clickaddtocart"))
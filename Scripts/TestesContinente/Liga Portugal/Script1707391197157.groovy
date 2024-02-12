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

WebUI.callTestCase(findTestCase('TestesContinente/AbrirPáginaContinente'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Site Continente/LigaPortugal/img_LigaPortugal'))

WebUI.switchToWindowTitle('Bilhetes Liga Portugal | Continente')

WebUI.navigateToUrl('https://feed.continente.pt/liga-portugal?utm_source=hp-col&utm_medium=referral&utm_campaign=24-liga-portugal&utm_term=S6&utm_content=banner_2&_gl=1*kcvj90*_ga*MTE5NTI1MjM0OC4xNzA3MzkxNDc2*_ga_56Q9X41Z3T*MTcwNzM5MTQ3My4xLjAuMTcwNzM5MTQ3OC41OC4wLjA.')

WebUI.click(findTestObject('Object Repository/Page_Bilhetes Liga Portugal  Continente/button_Aceitar Todos'))


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

WebUI.click(findTestObject('Object Repository/Site Continente/PaginaInicial/a_Receitas  Inspirao'))

WebUI.switchToWindowTitle('Continente Feed')

WebUI.navigateToUrl('https://feed.continente.pt/?utm_source=continente+pt&utm_medium=referral&utm_campaign=Receitas+Feed&utm_content=tab_receitas_col&_gl=1*19mhwuj*_ga*MTUzNjc5NzMwMS4xNzA3Mzg4OTQ0*_ga_56Q9X41Z3T*MTcwNzM4ODk0MS4xLjAuMTcwNzM4ODk0OC41OC4wLjA.')

WebUI.click(findTestObject('Object Repository/Page_Continente Feed/button_Aceitar Todos'))

WebUI.click(findTestObject('Object Repository/Page_Continente Feed/img'))

WebUI.click(findTestObject('Object Repository/Page_Receitas  Continente/img_PequenoAlmoco'))

WebUI.click(findTestObject('Object Repository/Page_Pequeno-Almoo  Receitas  Continente/h2_Tapioca de Manteiga de Amendoim e Banana'))


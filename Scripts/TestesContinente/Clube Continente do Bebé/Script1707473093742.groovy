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

WebUI.click(findTestObject('Site Continente/PaginaInicial/img_ClubeContinenteDoBebJunte-seAoClube'))

WebUI.switchToWindowTitle('Clube Continente do Bebé | Continente')

WebUI.navigateToUrl('https://feed.continente.pt/gravidez-bebe/clube-continente-do-bebe?utm_source=hp-col&utm_medium=referral&utm_campaign=24-feira-bebe&utm_term=S6&utm_content=banner_1&_gl=1*1pa4kp2*_ga*MTc0NTY4ODg4OC4xNzA3NDc0MDIx*_ga_56Q9X41Z3T*MTcwNzQ3NDAxOC4xLjAuMTcwNzQ3NDAyNC41OS4wLjA.')

WebUI.click(findTestObject('Object Repository/Site Continente/PaginaClubeContinenteDoBebé/button_AceitarTodos_ClubeContinenteDoBebé'))

WebUI.click(findTestObject('Object Repository/Site Continente/PaginaClubeContinenteDoBebé/p_Como  que me inscrevo para fazer parte do_e3849d'))


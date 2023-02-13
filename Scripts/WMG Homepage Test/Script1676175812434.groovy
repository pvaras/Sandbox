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

WebUI.navigateToUrl('https://www.wmg.com/')

WebUI.click(findTestObject('Object Repository/Page_Warner Music Group  WMG Global Music C_d6bc62/a_Recorded Music'))

WebUI.click(findTestObject('Object Repository/Page_Record Labels  Warner Music Group Reco_ecd1f7/a_Music Publishing'))

WebUI.click(findTestObject('Object Repository/Page_Music Publishing  Warner Music Group/a_Brands  Media'))

WebUI.click(findTestObject('Object Repository/Page_Artist Services  Warner Music Group Br_f460e3/a_News'))

WebUI.click(findTestObject('Object Repository/Page_Music Industry News  Trends  Warner Mu_8c2aa6/a_About'))

WebUI.click(findTestObject('Object Repository/Page_About Us  Warner Music Group/a_Leadership'))

WebUI.click(findTestObject('Object Repository/Page_Leadership  Warner Music Group/a_Read about Robert Kyncl'))

WebUI.click(findTestObject('Object Repository/Page_Robert Kyncl - Warner Music Group/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/Page_Leadership  Warner Music Group/a_Read about Max Lousada'))

WebUI.click(findTestObject('Object Repository/Page_Max Lousada - Warner Music Group/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/Page_Leadership  Warner Music Group/a_Read about Guy Moot'))

WebUI.click(findTestObject('Object Repository/Page_Guy Moot - Warner Music Group/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/Page_Leadership  Warner Music Group/a_Read about Carianne Marshall'))

WebUI.click(findTestObject('Object Repository/Page_Carianne Marshall - Warner Music Group/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/Page_Leadership  Warner Music Group/a_Read about Bernadette Rotolo'))

WebUI.click(findTestObject('Object Repository/Page_Bernadette Rotolo - Warner Music Group/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/Page_Leadership  Warner Music Group/a_Read about Charlie Cohen'))

WebUI.click(findTestObject('Object Repository/Page_Charlie Cohen - Warner Music Group/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/Page_Leadership  Warner Music Group/a_Read about Eric Levin'))

WebUI.click(findTestObject('Object Repository/Page_Eric Levin - Warner Music Group/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/Page_Leadership  Warner Music Group/a_Read about James Steven'))

WebUI.click(findTestObject('Object Repository/Page_James Steven - Warner Music Group/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/Page_Leadership  Warner Music Group/a_Read about JanelleCurtis'))

WebUI.click(findTestObject('Object Repository/Page_JanelleCurtis - Warner Music Group/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/Page_Leadership  Warner Music Group/a_Read about Maria Osherova'))

WebUI.click(findTestObject('Object Repository/Page_Maria Osherova - Warner Music Group/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/Page_Leadership  Warner Music Group/a_Read about Dr. Maurice A Stinnett'))

WebUI.click(findTestObject('Object Repository/Page_Dr. Maurice A Stinnett - Warner Music Group/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/Page_Leadership  Warner Music Group/a_Read about MoinHaque'))

WebUI.click(findTestObject('Object Repository/Page_MoinHaque - Warner Music Group/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/Page_Leadership  Warner Music Group/a_Read about Oana Ruxandra'))

WebUI.click(findTestObject('Object Repository/Page_Oana Ruxandra - Warner Music Group/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/Page_Leadership  Warner Music Group/a_Read about Paul M. Robinson'))

WebUI.click(findTestObject('Object Repository/Page_Paul M. Robinson - Warner Music Group/a_Back to Leadership'))

WebUI.click(findTestObject('Object Repository/Page_Leadership  Warner Music Group/use'))

WebUI.closeBrowser()


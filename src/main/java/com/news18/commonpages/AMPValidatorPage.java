package com.news18.commonpages;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.IPath;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Sanjeeb
 * This class contains WebElements and business logic of AMP Validator page
 * URL:https://validator.ampproject.org/
 */

public class AMPValidatorPage {
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	public Actions action = new Actions(webDriverActions.getDriver());


	public WebDriver driver;
	public AMPValidatorPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	/*AMP URL textbox*/
	@FindBy(xpath = "//label[text()='URL']/following-sibling::input")
	private WebElement ampTxtBox;

	/*AMP Validate button present right side of URL textbox*/
	@FindBy(xpath = "//paper-button[@id='validateButton']")
	private WebElement ampValidateBtn;

	/*Status of Validation*/
	@FindBy(xpath = "//div[contains(text(),'Validation Status:')]/span")
	private WebElement validationStatus;

	/*Amp Text Lnk*/
	@FindBy(xpath = "(//div[@class='style-scope iron-dropdown'])//paper-item[1]")
	private WebElement ampTxtLnk;

	/*Amp Link */
	@FindBy(xpath = "//td[contains(@class,'line-content')]//span[text()='amphtml']/following-sibling::a")
	private WebElement  ampLnk;
	
	/*AMP URL textbox*/
	@FindBy(xpath = "//html")
	private WebElement veiwSourcePagetext;
	
	/*AMP URL textbox*/
	@FindBy(xpath = "//span")
	private WebElement veiwSourceClickText;
	
	/*AMP URL textbox*/
	@FindBy(xpath = "//div[contains(@class,'CodeMirror-lines')]")
	private WebElement ampCodeBox;


	public WebElement getAmpLnk() {
		return ampLnk;
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to Verify AMP Url validations status by navigating into the view source code
	 * and Taking the Help Of Amp Validator
	 * Url-https://validator.ampproject.org/ 
	 */
	public void verifyAMPValidationStatus(String newsUrl) 
	{
		try {
			String ampUrl = getAmpHtml(newsUrl);
			webDriverActions.navigateToUrl(fileUtility.readDataFromPropertyFile("aMPValidatorUrl"));
			webDriverActions.waitForPageToLoad();
			webDriverActions.inputText(ampTxtBox,ampUrl);
			webDriverActions.highlightElement(ampValidateBtn);
			webDriverActions.clickJS(ampValidateBtn);
			Logs.info(getClass(), "Start Validating");
			webDriverActions.waitForSecond(5000);
			webDriverActions.highlightElement(validationStatus);
			String actual = webDriverActions.getTextFromElement(validationStatus);
			if(actual.equals("PASS")){
				Logs.info(getClass(), "AMP Url Verification Passed "+ampUrl);
			}
			else if(actual.equals("FAIL"))
			{
				Logs.error(getClass(), "AMP Url Verification Failed");
				Assert.fail("AMP Url Verification Failed "+ampUrl);
			}
		}
		catch(Exception e)
		{
			Logs.error(getClass(), "AMP Url Verification Failed");
		}
	}


	/**
	 * @author Abhishek Raj
	 * This Method is used to get AmpHtml urls present in respective pages
	 * @param url
	 * @return
	 */
	public String getAmpHtml(String url) {
		String aMPUrl="";
		try {
			webDriverActions.navigateToUrl(url);
			webDriverActions.waitForPageToLoad();
			Assert.assertTrue(webDriverActions.compareTwoStrings(url, webDriverActions.getCurrentPageUrl()), "Unable to navigate to "+ url);
			webDriverActions.viewPageSource();
			webDriverActions.waitForPageToLoad();
			String amphHtmlLnk = webDriverActions.getAttribute("href", getAmpLnk());
			Logs.info(getClass(), amphHtmlLnk);
			aMPUrl=amphHtmlLnk;
			int count=0;
			if(amphHtmlLnk.contains("amp"))
			{
				count++;
				if(count==1)
				{
					Logs.info(getClass(), amphHtmlLnk  +" Amp  is  present  " + count);
				}
				else
				{
					Logs.info(getClass(), amphHtmlLnk  + "null" );
				}
				return amphHtmlLnk;
			}
		}
		catch(NoSuchElementException e)
		{
			if(! aMPUrl.contains("amp")) {
				Logs.error(getClass(), "Amp url is not present");	
				Assert.fail("Missing AMP Link for this URL " +"view-source:"+webDriverActions.getCurrentPageUrl()+" in View Source Page ");
			}
		}
		return aMPUrl;
	}
	
	/**
	 * @author DanishR
	 * This method is used to Verify AMP Url validations status by navigating into the view source code
	 * and Taking the Help Of Amp Validator
	 * Url-https://validator.ampproject.org/ 
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public void verifyAmpHtmlValidation(ArrayList<String> list) throws IOException, InterruptedException 
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForElement(1000);
		String ampUrl="";
		
		for(int i=0;i<list.size();i++)
		{
			if (!list.get(i).contains("/amp/")) {
				String url = getAmpHtml(list.get(i));
				ampUrl=url;
				webDriverActions.viewPageSource(ampUrl);
			}
			else
			{
				webDriverActions.viewPageSource(list.get(i));
			}
			webDriverActions.softWaitForElementVisibility(veiwSourcePagetext, 3);
			webDriverActions.doubleClick(veiwSourceClickText);
			action.keyDown(Keys.LEFT_CONTROL).sendKeys("a").keyUp(Keys.LEFT_CONTROL).build().perform();
			action.keyDown(Keys.LEFT_CONTROL).sendKeys("c").keyUp(Keys.LEFT_CONTROL).build().perform();
			String pageSourceamp = genericUtility.getClipboardContents();
			webDriverActions.waitForSecond(2000);
			System.out.println("Source code of page before writing to file :"+pageSourceamp);
			try {
				BufferedWriter f_writer
				= new BufferedWriter(new FileWriter(
						IPath.ampHtmlPath));
				f_writer.write(pageSourceamp);
				f_writer.flush();
				f_writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			webDriverActions.waitForSecond(2000);
			ProcessBuilder pb9 = new ProcessBuilder("cmd","/c","amphtml-validator",""+IPath.ampHtmlPath+"",">"+IPath.ampStatus);
			pb9.redirectOutput(ProcessBuilder.Redirect.INHERIT);
			pb9.redirectError(ProcessBuilder.Redirect.INHERIT);
			Process p9 = pb9.start();
			p9.waitFor();
			webDriverActions.waitForSecond(2000);
			BufferedReader f_reader= new BufferedReader(new FileReader((IPath.ampStatus)));
			String text1 = f_reader.readLine();
			f_reader.close();
			Logs.info(getClass(),"The AMP Status is " +text1);
			softAssert.assertTrue(text1.contains("PASS"),"AMP Validation Fail" +ampUrl);
			softAssert.assertAll("Issue found in Home Page AMP Url");
		}
	}
	
	/**
	 * @author DanishR
	 * This method is used to Verify AMP Url validations status by navigating into the view source code
	 * and Taking the Help Of Amp Validator
	 * Url-https://validator.ampproject.org/ 
	 */
	public void verifyUIAMPValidationStatus(ArrayList<String> list,String serverType) 
	{
			SoftAssert softAssert = new SoftAssert();
			webDriverActions.waitForElement(1000);
			String ampUrl="";
			for(int i=0;i<list.size();i++)
			{
				if (!list.get(i).contains("/amp/")) {
					String url = getAmpHtml(list.get(i));
					ampUrl=url;
//					ampUrl = webDriverActions.getCurrentPageUrl();
					if (serverType.contains("preProd") && !ampUrl.contains("//beta")) {
						String betaUrl = genericUtility.replaceInUrl(ampUrl);
						webDriverActions.navigateToUrl(betaUrl);
						ampUrl=betaUrl;
					}
					webDriverActions.viewPageSource(ampUrl);
				}
				else
				{
					webDriverActions.viewPageSource(list.get(i));
				}
				webDriverActions.softWaitForElementVisibility(veiwSourcePagetext, 3);
				webDriverActions.doubleClick(veiwSourcePagetext);
				action.keyDown(Keys.LEFT_CONTROL).sendKeys("a").keyUp(Keys.LEFT_CONTROL).build().perform();
				action.keyDown(Keys.LEFT_CONTROL).sendKeys("c").keyUp(Keys.LEFT_CONTROL).build().perform();
				webDriverActions.navigateToUrl(fileUtility.readDataFromPropertyFile("aMPValidatorUrl"));
				webDriverActions.softWaitForElementVisibility(ampCodeBox, 3);
				webDriverActions.doubleClick(ampCodeBox);
				action.keyDown(Keys.LEFT_CONTROL).sendKeys("a"+Keys.BACK_SPACE).keyUp(Keys.LEFT_CONTROL).build().perform();
				action.keyDown(Keys.LEFT_CONTROL).sendKeys("V"+Keys.BACK_SPACE).keyUp(Keys.LEFT_CONTROL).build().perform();
				Logs.info(getClass(), "Start Validating");
//				webDriverActions.waitForSecond(1000);
				webDriverActions.highlightElement(validationStatus);
				String actual = webDriverActions.getTextFromElement(validationStatus);
//				softAssert.assertTrue(actual.equals("PASS"), "AMP Url Validation Failed "+actual);
				if(actual.equals("PASS")){
					Logs.info(getClass(), "AMP Url Verification Passed "+list.get(i));
				}
				else if(actual.equals("FAIL"))
				{
					Logs.error(getClass(), "AMP Url Verification Failed");
					softAssert.fail("AMP Url Verification Failed "+list.get(i));
				}
				webDriverActions.navigateBack();
			}
			softAssert.assertAll("Issue found in AMP validation ");
		}
}
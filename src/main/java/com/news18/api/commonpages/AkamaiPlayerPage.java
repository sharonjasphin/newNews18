package com.news18.api.commonpages;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class AkamaiPlayerPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	SoftAssert assrt = new SoftAssert();
	GenericUtility genericUtility= new GenericUtility();

	public AkamaiPlayerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Url Input text box*/
	@FindBy(id="selectedstream")
	private WebElement inputUrlTxtBx;

	/*Play Button*/
	@FindBy(id="playButton")
	private WebElement playBtn;

	/*Segment Length*/
	@FindBy(xpath="//td[contains(text(),'10s')]")
	private WebElement tenSecText;


	public void validateAkamaiPlayer(String url) {
		try {
			webDriverActions.inputText(inputUrlTxtBx, url);
			webDriverActions.click(playBtn);
			webDriverActions.waitForElementVisibility(tenSecText, 15);
			Assert.assertEquals(webDriverActions.getTextFromElement(tenSecText), "10s","Failed in validating 10s segment length");
			Logs.info(getClass(), "Verified successfully streaming for url :"+url);
		}
		catch (ElementNotInteractableException e) {
			Logs.error(getClass(), "Error in validating  segment Length in video");	
			assrt.assertTrue(false,"Error in validating  segment Length in video");
		}

	}





}

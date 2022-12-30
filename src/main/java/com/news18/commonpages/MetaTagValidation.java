package com.news18.commonpages;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * 
 * @author Abhishek Raj
 * This class contains WebElements and business logic for Robots Text and max-image-preview:large text validation
 */

public class MetaTagValidation {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public MetaTagValidation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Robot text present in View Page Source*/
	@FindBy(xpath = "//td[contains(@class,'line-content')]//span[text()='robots']")
	private List<WebElement>  robotTxtLnk;

	/*Max text link present in View Page Source*/
	@FindBy(xpath = "//td[contains(@class,'line-content')]//span[text()='max-image-preview:large']")
	private List<WebElement>  maxTxtLnk;
	
	/*Index Max text link present in View Page Source*/
	@FindBy(xpath = "//td[contains(@class,'line-content')]//span[text()='index,follow,max-image-preview:large']")
	private List<WebElement>  indexMaxTxtLnk;


	/**
	 * @author Abhishek Raj
	 * This Method is used to verify robot text and Max preview text is present or not in view page source
	 */
	public void verifyMetaTag() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForSecond(10000);
		webDriverActions.viewPageSource();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForSecond(5000);
		webDriverActions.scrollToLast();
		try {
			for(int i=0;i<robotTxtLnk.size();i++)
			{
				webDriverActions.isElementDisplayed(robotTxtLnk.get(i));
			}
		}
		catch(NoSuchElementException e) {
			Logs.error(getClass(), "Failed to display meta tags for robot text  "+" "+ webDriverActions.getCurrentPageUrl());	
			Assert.fail("No Robot text is present for url  "+" "+ webDriverActions.getCurrentPageUrl());
		}
		if(maxTxtLnk.size()==1) {
			try {

				if(webDriverActions.getTextFromElement(maxTxtLnk.get(0)).equals("max-image-preview:large") || webDriverActions.getTextFromElement(indexMaxTxtLnk.get(0)).equals("index,follow,max-image-preview:large"))
				{
					Logs.info(getClass(), "Robots Text is  present " + webDriverActions.getCurrentPageUrl());
					Logs.info(getClass(), "Value contains max-image-preview:large or index,Follow,max-image-preview:large "+" "+webDriverActions.getCurrentPageUrl());
				}
				
				else if (webDriverActions.getTextFromElement(maxTxtLnk.get(0)).equals("max-image-preview:large")) {
					Logs.info(getClass(), "Robots Text is  present " + webDriverActions.getCurrentPageUrl());
					Logs.info(getClass(), "Value contains max-image-preview:large"+" "+webDriverActions.getCurrentPageUrl());
				}
				
			}
			catch(NoSuchElementException e)
			{
				Logs.error(getClass(), "Failed to display meta tags for max-image-preview:large text and index,Follow,max-image-preview:large content  "+ webDriverActions.getCurrentPageUrl());	
				Assert.fail("Robots Text is present, but there is no value present content for this url " + webDriverActions.getCurrentPageUrl());
			}
		}

		else if (maxTxtLnk.size()>1) 
		{
			Logs.error(getClass(),"Values are same in robots tag " + maxTxtLnk.size() +" "+ webDriverActions.getCurrentPageUrl() );
			Assert.fail("Values are same in robots tag  "+" "+ maxTxtLnk.size()+" "+ webDriverActions.getCurrentPageUrl());
		}
		
		else if (indexMaxTxtLnk.size()==1) {
			Assert.assertTrue(webDriverActions.getTextFromElement(indexMaxTxtLnk.get(0)).equals("index,follow,max-image-preview:large"));
			Logs.info(getClass(), "Robots Text is  present " + webDriverActions.getCurrentPageUrl());
			Logs.info(getClass(), "Value contains index,follow,max-image-preview:large"+" "+webDriverActions.getCurrentPageUrl());
		}
		
		else {
			Logs.error(getClass(),"Value does not contains max-image-preview:large or index,Follow,max-image-preview:large "+ webDriverActions.getCurrentPageUrl() );
			Assert.fail("Value does not contains max-image-preview:large or index,Follow,max-image-preview:large "+ webDriverActions.getCurrentPageUrl());
		}
		
	}	
}
package com.news18.bengalipages;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Abhishek
 *
 */
public class MobileBengaliSectionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;

	public MobileBengaliSectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/* Article Links on First Section Page */
	@FindBy(xpath = "//ul[contains(@class,'listview')]//li//img")
	private List<WebElement> articlesLnk;


	/**
	 * @author Abhishek
	 * This method is used to navigate and click on First Article of Bengali first Section Page 
	 */
	public void clickOnFirstArticleSectionPage() {
		webDriverActions.waitForPageToLoad();
		try {
			webDriverActions.clickJS(articlesLnk.get(0));
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Section First Article Link", e);
			throw new SkipException("Unable to locate section page first Article "+webDriverActions.getCurrentPageUrl());
		}
	}
}




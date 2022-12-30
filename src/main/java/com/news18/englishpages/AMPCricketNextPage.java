package com.news18.englishpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Danish R
 * This class contain WebElements and their Business logics.
 */

public class AMPCricketNextPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public AMPCricketNextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*LiveBlog Article of English CricketNext Page*/
	@FindBy(xpath = "//div[contains(@class,'cn-story-wrap')]//a[contains(@href,'live')]")
	private List<WebElement> cricketNextLiveBlogArticleLnks;

	/* CricketNext Title Header in AMPHompage*/
	@FindBy(xpath = "//h2[contains(@class,'title')]/span[contains(text(),'Cricketnext')]")
	private WebElement cricketNxtTitleTxt;

	/* CricketNext Articles Links in AMPHomepage*/
	@FindBy(xpath = "//div[contains(@class,'cn-story-wrap')]//li//a")
	private List<WebElement> cricketNxtArticleLnks;

	/* CricketNext Page Links*/
	@FindBy(xpath = "https://www.news18.com/cricketnext/")
	private List<WebElement> cricketNxtPageLnks;

	/* CricketNext Page Ads*/
	@FindBy(xpath = "//iframe[@aria-label='Advertisement']")
	private List<WebElement> cricketNxtPageAds;

	/* CricketNext Page Footer*/
	@FindBy(xpath = "//footer")
	private WebElement cricketPageFooter;

	/* CricketNext Page Header*/
	@FindBy(xpath = "//header")
	private WebElement cricketPageHeader;

	/**
	 * @author SanjeebKumarPati
	 * This method is used to click on First Article of English Home Page 
	 */
	public void clickOnFirstArticleCricketNextPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(1000);
			webDriverActions.clickJS(cricketNxtArticleLnks.get(0));
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Cricket Next Article Link", e);
		}
	}


	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of English Home Page 
	 */
	public void clickOnLiveBlogArticleCricketNextPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(1000);
			if(webDriverActions.isElementDisplayed(cricketNextLiveBlogArticleLnks.get(0)))
			{
				webDriverActions.clickJS(cricketNextLiveBlogArticleLnks.get(0));
			}
			else
			{
				Logs.error(getClass(), "Exception in Live blog in HomePage Link");
				throw new SkipException("Unable to locate Live Blog Article element possibly no Live Blog Present "+webDriverActions.getCurrentPageUrl());	
			}
		}
		catch(IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Live blog in HomePage Link");
			throw new SkipException("Unable to locate Live Blog Article element possibly no Live Blog Present "+webDriverActions.getCurrentPageUrl());
		}
	}

}
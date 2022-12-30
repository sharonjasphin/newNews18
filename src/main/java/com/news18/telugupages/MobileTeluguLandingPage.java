package com.news18.telugupages;

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
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author AbhishekRaj
 *
 */
public class MobileTeluguLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public MobileTeluguLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/*Homepage List of article Link for news18 Telugu Page*/
	@FindBy(xpath ="//div[contains(@class,'newstrendvideo-box')]//ul//li//a[not(contains(@href,'live')) and not(contains(@href,'cricket'))]")
	private List<WebElement> homePageArticleLnk;

	/*photo section Present in LineOne navigation bar in Telugu HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[contains(@href,'/photogallery/')]")
	private WebElement photoSectionLnk;

	/*Homepage List of Live article Link for news18 Telugu Page*/
	@FindBy(xpath ="//div[contains(@class,'wapper')]//li/a[contains(@href,'live')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*Latest Section in line one navigation bar*/
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[@href='/news/']")
	private WebElement latestSectionLnk;

	/*Latest Section in line one navigation bar*/
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[@href='/sports/']")
	private WebElement sportsSectionLnk;

	/*Latest Section in line one navigation bar*/
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[@href='/videos/']")
	private WebElement videosSectionLnk;

	/*Latest Section in line one navigation bar*/
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[@href='/politics/']")
	private WebElement politicsSectionLnk;

	/*covid Tracker Lnk present on Telgu Home Page*/
	@FindBy(xpath="//div[contains(@class,'toolbarbtn')]//img")
	private WebElement covidTrackerLnk;

	/*Covid Updated Time present on header of Telugu Home Page*/
	@FindBy(xpath="//div[contains(@class,'corona-m-ftr')]//ul//li//span")
	private WebElement telgucovidUpdatedTime;

	/**
	 * This method is used to click on First Article of Telugu Home Page 
	 */
	public void clickOnFirstArticleTeluguHomePage() {
		try{
			webDriverActions.clickJS(homePageArticleLnk.get(0));
		}
		catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in first Article Homepage ", e);
		}
	}


	/**
	 * @author AbhishekRaj
	 * This method used to click on photos section of Telugu Homepage
	 */
	public void clickOnPhotoSection()
	{
		try {
			webDriverActions.click(photoSectionLnk);
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in PhotoSection Link ", e);
		}

	}
	
	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of Telugu Home Page 
	 */
	public void clickOnLiveBlogArticleHomePage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(1000);
			if(webDriverActions.isElementDisplayed(homePageLiveBlogArticleLnk.get(0)))
			{
				webDriverActions.clickJS(homePageLiveBlogArticleLnk.get(0));
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

	/**
	 * @author SanjeebKumarPati
	 * This method used to navigate to Latest Section Page
	 */
	public void latestSection() {
		try{
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(latestSectionLnk);
			Logs.info(getClass(),"Clicked on latest section link");
		}catch (Exception e) {
			Logs.error(getClass(),"Latest section link is not found");
		}
	}

	/**
	 * This method used to click on sports section of Telugu Homepage
	 */
	public void clickOnSportsSection()
	{
		try {
			webDriverActions.click(sportsSectionLnk);
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in Sports Link Homepage ", e);
		}
	}

	/**
	 * This method used to click on videos section of Telugu Homepage
	 */
	public void clickOnVideosSection()
	{
		try {
			webDriverActions.click(videosSectionLnk);
		}

		catch (Exception e) {
			Logs.error(getClass(), "Exception in Videos Section Link ", e);
		}
	}


	/**
	 * This method used to click on politics section of Telugu Homepage
	 */
	public void clickOnPoliticsSection()
	{
		try {
			webDriverActions.click(politicsSectionLnk);
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in politics Section Lnk ", e);
		}
	}

	/**
	 * This method is used validate Covid tracker Date
	 */
	public void clickOnMobileTracker() {
		try {
			webDriverActions.waitForSecond(2000);
			webDriverActions.highlightElement(covidTrackerLnk);
			webDriverActions.waitForSecond(5000);
			webDriverActions.clickJS(covidTrackerLnk);
		}
		catch (Exception e) {
			Assert.fail("Unable to Locate Covid Tracker Link "+covidTrackerLnk);
		}
		webDriverActions.waitForElementVisibility(telgucovidUpdatedTime,GlobalVariables.sec60);
		webDriverActions.waitForSecond(5000);
		String covidDate=webDriverActions.getTextFromElement(telgucovidUpdatedTime);
		//below actual variable is to get string position from the article text
		String actual = genericUtility.getSubstring(9, 20,covidDate).trim();
		Logs.info(getClass(), "Current Covid Tracker Date is: "+actual);
		String expected = genericUtility.getSystemDateTime();
		Logs.info(getClass(), "Current System Date is: " +expected);
		Assert.assertTrue(genericUtility.compareTwoStrings(actual,expected),"Failed to navigate "+actual);
		
	}	

}

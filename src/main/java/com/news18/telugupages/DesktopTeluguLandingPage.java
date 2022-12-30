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
 * @author Abhishek Raj
 *This Class Contains elements and business logics for Telugu Desktop Landing  Page
 */
public class DesktopTeluguLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopTeluguLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Homepage First article Link  is present below the Line Two  Menu bar in RHS*/
	@FindBy(xpath ="//div[contains(@class,'topnews')]/ul/li/a[not(contains(@href,'live')) and not(contains(@href,'photogallery'))]")
	private List<WebElement> homePageArticleLnk;

	/*Homepage LiveBlog article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@class,'top_news_right')]//a[contains(@href,'live')]")
	private List<WebElement>  homePageLiveBlogArticleLnk;

	/*photo section Present in Line One navigation bar */
	@FindBy(xpath="//ul[contains(@class,'nav_bar')]//a[contains(@href,'/photogallery/')]")
	private WebElement photoSectionL1;

	/*Sports link present after clicking on line two*/
	@FindBy(xpath ="//div[contains(@class,'container')]//ul[contains(@class,'nav_bar')]//a[@href='/sports/']")
	private WebElement sportsSectionLnk;

	/*Section links present at line one section*/
	@FindBy(xpath ="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]//a[not(contains(@href,'/sports/')) and not(contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))]")
	private List<WebElement> sectionLnks;

	/*video link present at Footer section*/
	@FindBy(xpath ="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]//a[@href='/videos/']")
	private WebElement videoSectionLnk;

	/*Trending Topic link present at header section*/
	@FindBy(xpath ="//div[contains(@class,'nhtranding')]//a")
	private List<WebElement> trendingTopicsLnk;

	/*Latest Section in line one navigation bar*/
	@FindBy(xpath="//div[contains(@class,'container')]//ul[contains(@class,'nav_bar')]//a[@href='/news/']")
	private WebElement latestSectionLnk;

	/*covid Tracker Lnk present on Telgu Home Page*/
	@FindBy(xpath="//div[contains(@class,'toolbarbtn')]//img")
	private WebElement covidTrackerLnk;

	/*covid Updated Time Lnk present on Telgu Home Page*/
	@FindBy(xpath="(//div[contains(@class,'corona-m-box')])[3]/child::span")
	private WebElement covidUpdatedTime;


	/**
	 * @author Abhishek
	 * This method is used to click on First Article of English Home Page 
	 */
	public void clickOnFirstArticleHomePage() {
		try {
			webDriverActions.clickJS(homePageArticleLnk.get(0));
		}
		catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in first Article Homepage ", e);
		}

	}


	/**
	 * @author Abhishek
	 * This method used to click on photos section
	 */
	public void clickOnPhotosSection()
	{
		try {
			webDriverActions.clickJS(photoSectionL1);
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
	 * @author Sanjeeb
	 * This method is used to click on sports link present on lineOne section
	 */
	public void clickOnSportsLnk()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(sportsSectionLnk);
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in Sports Link Homepage ", e);
		}
	}


	/**
	 * @author Sanjeeb
	 * This method is used to click on Cinema link present on line one section
	 */
	public void clickOnFirstSectionLnk()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(sectionLnks.get(1));	
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in Sports Link Homepage ", e);
		}
	}


	/**
	 * @author Sanjeeb
	 * This method is used to click on Video link present on Line one section
	 */
	public void clickOnVideoLnk()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.continuousScrollTillElement(videoSectionLnk, GlobalVariables.sec30);
			webDriverActions.click(videoSectionLnk);
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in Videos Section Link ", e);
		}
	}


	/**
	 * @author Sanjeeb
	 * This method is used to Click on First topic link of Trending Topics Section present At the Footer Of HomePage
	 */
	public void clickOnFirstTopicLnkTrendingTopics() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(trendingTopicsLnk.get(0));
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in Footer Topic Link Homepage ", e);
		}
	}




	/**
	 * @author SanjeebKumarPati
	 * This method used to navigate to Latest Section Page
	 */
	public void latestSection() {
		try{
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(latestSectionLnk);
			Logs.info(getClass(),"Clicked on latest section link");
		}catch (Exception e) {
			Logs.error(getClass(),"Latest section link is not found");
		}
	}

	/**
	 * This method is used validate Covid tracker Date
	 */
	public void clickOnTracker() {
		try {
			webDriverActions.waitForSecond(2000);
			webDriverActions.highlightElement(covidTrackerLnk);
			webDriverActions.waitForSecond(5000);
			webDriverActions.clickJS(covidTrackerLnk);
		}
		catch (Exception e) {
			Assert.fail("Unable to Locate Covid Tracker Link "+covidTrackerLnk);
		}
		webDriverActions.waitForElementVisibility(covidUpdatedTime,GlobalVariables.sec60);
		String covidDate=webDriverActions.getTextFromElement(covidUpdatedTime);
		//below actual variable is to get string position from the article text
		String actual = genericUtility.getSubstring(9, 20,covidDate).trim();
		Logs.info(getClass(), "Current Covid Tracker Date is: "+actual);
		String expected = genericUtility.getSystemDateTime();
		Logs.info(getClass(), "Current System Date is: " +expected);
		Assert.assertTrue(genericUtility.compareTwoStrings(actual,expected),"Failed to navigate "+actual);
		
	}	
}

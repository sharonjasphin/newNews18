package com.news18.tamilpages;

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
 * @author AbhishekRaj
 * This page contains elements and business logic for Tamil mobile home page
 */
public class MobileTamilLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public MobileTamilLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/*Homepage List of article Link for news18 Tamil Page*/
	@FindBy(xpath ="//div[contains(@class,'newstrendvideo-box')]//li/a[not(contains(@href,'live')) and not(contains(@href,'cricket'))]")
	private List<WebElement> homePageArticleLnk;

	/*photo section Present in Line one navigation bar in Tamil HomePage */
	@FindBy(xpath="//ul[contains(@class,'navigation')]//li//a[contains(@href,'photogallery')]")
	private WebElement photoSectionLnk;

	/*Homepage List of Live article Link for news18 Tamil Page*/
	@FindBy(xpath ="//div[contains(@class,'wapper')]//li/a[contains(@href,'live-updates')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*photo section Present in Line one navigation bar in Tamil HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[contains(@href,'memes')]")
	private WebElement lineOneLnk;

	/*photo section Present in Line one navigation bar in Tamil HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[contains(@href,'videos')]")
	private WebElement videosLnk;

	/*photo section Present in Line one navigation bar in Tamil HomePage */
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'sports')]")
	private WebElement sportsLnk;

	/*Humburger  Lnk Present above Line one navigation bar in Tamil HomePage */
	@FindBy(xpath="//div[contains(@class,'mobile_nav_icon')]//a[contains(@class,'nav_icon')]")
	private WebElement humburgerLnk;

	/*Trending Topic link present in Home page*/
	@FindBy(xpath ="//div[contains(@class,'top_links')]//a[contains(@href,'tag')]")
	private List<WebElement> trendingTopicsfirstLnk;


	/**
	 * This method is used to click on First Article of Tamil Home Page 
	 */
	public void clickOnFirstArticleTamilHomePage() {
		try {
			webDriverActions.clickJS(homePageArticleLnk.get(0));
			Logs.info(getClass(), "Clicked on first article");
		}
		catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in first Article Homepage ", e);
		}
	}


	/**
	 * @author AbhishekRaj
	 * This method used to click on photos section of Tamil Homepage
	 */
	public void clickOnPhotoSection()
	{
		try {
			webDriverActions.clickJS(humburgerLnk);
			webDriverActions.scrollDown();
			webDriverActions.clickJS(photoSectionLnk);
			Logs.info(getClass(), "Clicked on photo Section ");
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in PhotoSection Link ", e);
		}
	}

	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of Tamil Home Page 
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
	 * @author AbhishekRaj
	 * This method used to click on photos section of Tamil Homepage
	 */
	public void clickOnVideosSection()
	{
		try {
			webDriverActions.clickJS( videosLnk);
			Logs.info(getClass(), "Clicked on videos Section ");
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in Videos Section Link ", e);
		}
	}

	/**
	 * @author Sanjeeb
	 * This method used to click on photos section of Tamil Homepage
	 */
	public void clickOnLineOneSection()
	{
		try {
			webDriverActions.clickJS(lineOneLnk);
			Logs.info(getClass(), "Clicked on Line One Section ");
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in Videos Section Homepage ", e);
		}
	}

	/**
	 * @author Sanjeeb
	 * This method used to click on photos section of Tamil Homepage
	 */
	public void clickOnSportsLnk()
	{
		try {
			webDriverActions.clickJS(sportsLnk);
			Logs.info(getClass(), "Clicked on sports Section ");
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in Sports Link Homepage ", e);
		}
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Click on First topic link of Trending Topics Section present At the Footer Of HomePage
	 */
	public void clickOnFirstTopicLnkTrendingTopics() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.scrollToLast();
			webDriverActions.continuousScrollTillElement(trendingTopicsfirstLnk.get(0), 5);
			webDriverActions.waitForSecond(5000);
			webDriverActions.clickJS(trendingTopicsfirstLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First topic link");
		}
	}
}

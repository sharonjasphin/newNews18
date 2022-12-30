package com.news18.bengalipages;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
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
 * @author AnupamG
 * This Class Contains elements and business logics for Bengali Mobile Landing Page
 */
public class MobileBengaliLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public MobileBengaliLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/*Homepage List of article Link for news18 Bengali Page*/
	@FindBy(xpath ="//div[contains(@class,'newstrendvideo-box')]//li/a[not(contains(@href,'live')) and not(contains(@href,'cricket'))]")
	private List<WebElement> homePageArticleLnk;

	/*photo section Present in LineOne navigation bar in Bengali HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[.=' ছবি']")
	private WebElement photoSectionLnk;

	/*Homepage List of Live article Link for news18 Bengali Page*/
	@FindBy(xpath ="//div[contains(@class,'newstrendvideo-box')]//li//h3[contains(text(),'Live Updates')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*photo section Present in LineOne navigation bar in Bengali HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[text()='দেশ']")
	private WebElement lineOneSectionLnk;

	/*Homepage List of Live article Link for news18 Bengali Page*/
	@FindBy(xpath ="//div[contains(@class,'top_links_cont')]//a[contains(@href,'/sports/')]")
	private WebElement cricketNextLnk;

	/*Homepage List of Live article Link for news18 Bengali Page*/
	@FindBy(xpath ="//div[contains(@class,'top_links_cont')]//a[contains(@href,'/videos/')]")
	private WebElement videosLnk;

	/*Trending Topic link present in home page*/
	@FindBy(xpath ="//div[contains(@class,'side_bar')]//a[contains(@href,'tag')]")
	private List<WebElement> trendingTopicsfirstLnk;


	/**
	 * @author AnupamG
	 * This method is used to click on First Article of Bengali Home Page 
	 */
	public void clickOnFirstArticleBengaliHomePage() {
		webDriverActions.waitForPageToLoad();
		try {
			webDriverActions.clickJS(homePageArticleLnk.get(0));
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Homepage First Article Link", e);
		}
	}


	/**
	 * @author AnupamG
	 * This method used to click on photos section of Bengali Homepage
	 */
	public void clickOnPhotoSection()
	{
		webDriverActions.waitForPageToLoad();
		try {
			webDriverActions.click(photoSectionLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Photos Section Link", e);
		}
	}


	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of Bengali Home Page 
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
	 * This method used to click on Cricket Next section of Bengali Homepage
	 */
	public void clickOnSportsSection()
	{
		webDriverActions.waitForPageToLoad();
		try {
			webDriverActions.click(cricketNextLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Sports Section Link", e);
		}
	}

	/**
	 * @author AbhishekRaj
	 * This method used to click on section of Bengali Homepage
	 */
	public void clickOnLineOneSection()
	{
		webDriverActions.waitForPageToLoad();
		try {
			webDriverActions.click(lineOneSectionLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Sports Section Link", e);
		}
	}


	/**
	 * @author AbhishekRaj
	 * This method used to click on Video section of Bengali Homepage
	 */
	public void clickOnVideosSection()
	{
		webDriverActions.waitForPageToLoad();
		try {
			webDriverActions.click(videosLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Videos Section link", e);
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
			Logs.error(getClass(), "Exception in First topic of Trending Topic");
		}
		webDriverActions.switchToNewWindow();
	}
}

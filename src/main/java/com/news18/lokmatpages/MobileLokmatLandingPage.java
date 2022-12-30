package com.news18.lokmatpages;

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
 * @author DanishR
 *
 */
public class MobileLokmatLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public MobileLokmatLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/*Homepage List of article Link for news18 Lokmat Page*/
	@FindBy(xpath ="//div[contains(@class,'newstrendvideo-box')]//li/a[not(contains(@href,'live')) and not(contains(@href,'cricket'))]")
	private List<WebElement> homePageArticleLnk;

	/*Homepage List of Live article Link for news18 Lokmat Page*/
	@FindBy(xpath ="//div[contains(@class,'wapper')]//li/a[contains(@href,'live-update')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*photo section Present in LineOne navigation bar in Lokmat HomePage */
	@FindBy(xpath="//nav[contains(@class,'adclsnav')]//ul[contains(@class,'adclsnavg')]//li//a[contains(@href,'photogallery')]")
	private WebElement photoSectionLnk;

	/*video section Present in LineOne navigation bar in Lokmat HomePage */
	@FindBy(xpath="//div[contains(@class,'wapper')]/ul/li/a[contains(@href,'video')]")
	private WebElement videoSectionLnk;

	/*sports section Present in LineOne navigation bar in Lokmat HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[contains(@href,'/sport/')]")
	private WebElement sportsSectionLnk;

	/*Section Present in LineOne navigation bar in Lokmat HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[not(contains(@href,'/astrology/')) and not(contains(@href,'/Pune/')) and not(contains(@href,'/netrasuraksha/')) and not(@href='/')]")
	private List<WebElement> sectionLnk;
	
	/*Section Present in LineOne navigation bar in Lokmat HomePage */
	@FindBy(xpath="//div[contains(@class,'mobile_nav_icon')]//a[contains(@class,'nav_icon')]")
	private WebElement humburgerLnk;
	
	/*Trending Topic link present in home page*/
	@FindBy(xpath ="//div[contains(@class,'side_bar')]//a[contains(@href,'tag')]")
	private List<WebElement> trendingTopicsfirstLnk;
	

	/**
	 * @author AbhishekRaj
	 * This method is used to click on First Article of Lokmat Home Page 
	 */
	public void clickOnFirstArticleLokmatHomePage() {
		try {
			webDriverActions.clickJS(homePageArticleLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First Article of Home Page",e);
		}
	}


	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of Lokmat Home Page 
	 */
	public void clickOnFirstLiveBlogArticleLokmatHomePage() {
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
	 * @author Anupam
	 * This method used to click on photos section of Lokmat Homepage
	 */
	public void clickOnPhotoSection(){
		try {
			webDriverActions.click(humburgerLnk);
			webDriverActions.click(photoSectionLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Photos Section Link of Home Page",e);
		}
	}


	/**
	 * @author AbhishekRaj
	 * This method used to click on video section
	 */
	public void clickOnVideoSection()
	{
		try {
			webDriverActions.click(videoSectionLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Video Section Link of Home Page",e);
		}
	}

	/**
	 * @author Sanjeeb
	 * This method used to click on Sports section
	 */
	public void clickOnSportsSection()
	{
		try {
			webDriverActions.click(sportsSectionLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Sports section Link of Home Page",e);
		}
	}

	/**
	 * @author AbhishekRaj
	 * This method used to click on first section
	 */
	public void clickOnFirstSection()
	{
		try {
			webDriverActions.clickJS(sectionLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Section Link of Home Page",e);
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

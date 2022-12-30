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
 * @author Abhishek Raj
 *This Class Contains elements and business logics for Bengali Desktop Landing  Page
 */
public class DesktopBengaliLandingPage {
	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopBengaliLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/*Homepage First article Link for news18 Bengali Page*/
	@FindBy(xpath ="//div[contains(@class,'topnews-right')]//li/a[not(contains(@href,'live')) and not(contains(@href,'/photogallery/'))]")
	private List<WebElement> homePageFirstArticleLnk;

	/*Homepage LiveBlog article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@class,'topnews')]//a[contains(@href,'live-updates')]")
	private List<WebElement> homePageLiveBlogArticleLnk;


	/*CricketNext link present on LineTwo Section*/
	@FindBy(xpath ="//div[contains(@class,'sub_navigation')]//a[@href='/sports/']")
	private WebElement cricketNextSectionLnk;

	/*photo section Present in LineTwo navigation bar in Bengali HomePage */
	@FindBy(xpath="//div[contains(@class,'container')]//ul[contains(@class,'nav_bar')]//a[@href='/photogallery/']")
	private WebElement photoSectionLineTwoLnk;

	/*Videos link present on Homepage*/
	@FindBy(xpath ="//div[contains(@class,'container')]//ul[contains(@class,'nav_bar')]//a[@href='/videos/']")
	private WebElement videosLnk;

	/*Trending Topics First Link is present in Footer of home page*/
	@FindBy(xpath="(//div[contains(@class,'nhtranding')]//a)[1]")
	private WebElement trendingTopicsFirstLnks;

	/*Trending Topic link present at header section*/
	@FindBy(xpath ="(//div[contains(@class,'nhtranding')]//a)[1]")
	private WebElement trendingTopicsLnk;


	/**
	 * @author Abhishek
	 * This method is used to click on First Article of English Home Page 
	 */
	public void clickOnFirstArticleHomePage() {
		webDriverActions.waitForPageToLoad();
		try {
			webDriverActions.waitForElementVisibility(homePageFirstArticleLnk.get(0), 10);
			webDriverActions.clickJS(homePageFirstArticleLnk.get(0));
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in First Article Hompage Link", e);

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
	 * @author Sanjeeb
	 * This method is used to click on CricketNext link present on Hamburger Menu
	 */
	public void clickOnCricketNextLnk()
	{
		webDriverActions.waitForPageToLoad();
		try {
			webDriverActions.click(cricketNextSectionLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Cricket Next Link", e);
		}
	}


	/**
	 * @author Sanjeeb
	 * This method used to click on photos section of Hindi Homepage
	 */
	public void clickOnPhotoSection()
	{
		webDriverActions.waitForPageToLoad();
		try {
			webDriverActions.click(photoSectionLineTwoLnk);
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Photo Section Link", e);
		}

	}

	/**
	 * @author Sanjeeb
	 * This method is used to click on Videos Section news 18 Hindi Home Page 
	 */
	public void navigateToVideosSection() {
		webDriverActions.waitForPageToLoad();
		try {
			webDriverActions.click(videosLnk);
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Video Section Link", e);
		}
	}

	/**
	 * @author Sanjeeb
	 * This method is used to Click on First topic link of Trending Topics Section present At the Footer Of HomePage
	 */
	public void clickOnFirstTopicLnkTrendingTopics() {
		webDriverActions.waitForPageToLoad();
		try {
			webDriverActions.clickJS(trendingTopicsLnk);
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Trending Topics Article ", e);
		}
	}
}


package com.news18.malayalampages;

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
 *This Class Contains elements and business logics for Malayalam Desktop Landing  Page
 */
public class DesktopMalayalamLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopMalayalamLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Videos link present after clicking on Hamburger menu*/
	@FindBy(xpath ="//div[contains(@class,'sub-nav')]//li//a[text()='Videos']")
	private WebElement videosLnk;

	/*Homepage LiveBlog article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@class,'top_news_right')]//a[contains(@href,'live')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*photo section Present in Line One navigation bar */
	@FindBy(xpath="//ul[contains(@class,'nav_bar')]//a[@href='/photogallery/']")
	private WebElement photoSectionLineOneLnk;

	/*Homepage First article Link  is present below the Line Two Menu bar in RHS*/
	@FindBy(xpath ="//div[contains(@class,'topnews-right')]//ul//li//a[not(contains(@href,'live')) and contains(@href,'/news/')]")
	private List<WebElement> homePageArticleLnk;

	/*Sports link present after clicking on line two*/
	@FindBy(xpath ="//div[contains(@class,'container')]//ul[contains(@class,'nav_bar')]//a[contains(@href,'/sports/')]")
	private WebElement sportsSectionLnk;

	/*India link present at line one section*/
	@FindBy(xpath ="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]//a[not(contains(@href,'/sports/'))and not(contains(@href,'/photogallery/'))]")
	private List<WebElement> sectionLnks;

	/*video link present at Footer section*/
	@FindBy(xpath ="//div[contains(@class,'sub_navigation')]//a[contains(@href,'/videos/')]")
	private WebElement videoSectionLnk;

	/*Trending Topic link present at header section*/
	@FindBy(xpath ="//div[contains(@class,'nhtranding')]//a")
	private List<WebElement> trendingTopicsLnk;


	/*Latest Section in line one navigation bar*/
	@FindBy(xpath="//div[contains(@class,'container')]//ul[contains(@class,'sub_navigation')]//a[@href='/news/']")
	private WebElement latestSectionLnk;


	/**
	 * @author Abhishek
	 * This method is used to click on First Article of English Home Page 
	 */
	public void clickOnFirstArticleHomePage() {
		try {
			webDriverActions.clickJS(homePageArticleLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First Article of Home Page",e);
		}
	}
	

	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of Malayalam Home Page 
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
	 * @author Abhishek
	 * This method used to click on photos section
	 */
	public void clickOnPhotosSection()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(photoSectionLineOneLnk);
			webDriverActions.waitForSecond(5000);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Photos Section Link of Home Page",e);
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
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Sports Section Link of Home Page",e);
		}	
	}


	/**
	 * @author Sanjeeb
	 * This method is used to click on india link present on line one section
	 */
	public void clickOnFirstSectionLnk()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(sectionLnks.get(1));
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Section page Link of Home Page",e);
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
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Video Section Link of Home Page",e);
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
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First Topic of Trending Topic",e);
		}
	}



	/**
	 * This method used to navigate to Latest Section Page
	 */
	public void latestSection() {
		try{
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(latestSectionLnk);
			Logs.info(getClass(),"Clicked on latest section link");
		}catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Latest Section of Home Page",e);
		}
	}


}

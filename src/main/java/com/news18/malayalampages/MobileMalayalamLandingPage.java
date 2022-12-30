package com.news18.malayalampages;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;


/**
 * @author AnupamGupta
 * This page contains elements and business logic for malayalam mobile home page
 *
 */
public class MobileMalayalamLandingPage {
	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public MobileMalayalamLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/*Homepage List of article Link for news18 Malayalam Page*/
	@FindBy(xpath ="//div[contains(@class,'newstrendvideo-box')]//li/a[not(contains(@href,'live')) and not(contains(@href,'cricket'))]")
	private List<WebElement> homePageArticleLnk;

	/*Homepage List of Live article Link for news18 Malayalam Page*/
	@FindBy(xpath ="//div[contains(@class,'wapper')]//li/a[contains(@href,'live-update')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*photo section Present in Line one navigation bar in Malayalam HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[.='Photos']")
	private WebElement photoSectionLnk;

	@FindBy(xpath ="//div[contains(@class,' top_links_cont')]//a[contains(@href,'/video')]")
	private List<WebElement> homePageVideoSection;

	/*Sports link present in Malayalam HomePage  */
	@FindBy(xpath ="//div[contains(@class,'top_links_cont')]//a[@href='/sports/']")
	private WebElement sportsLnk;

	/*India link present at line one menu */
	@FindBy(xpath ="//div[contains(@class,'top_links_cont')]//a[contains(@href,'/india/')]")
	private WebElement indiaSectionLnks;

	/**
	 * @author AnupamGupta
	 * This method is used click on video section
	 */
	public void clickOnVideoSection() {
		try {
			webDriverActions.clickJS(homePageVideoSection.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Video Section Link of Home Page",e);
		}
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to click on First Article of Malayalam Home Page 
	 */
	public void clickOnFirstArticleMalayalamHomePage() {
		try {
			webDriverActions.clickJS(homePageArticleLnk.get(0));
			Logs.info(getClass(), "Clicked on first article");
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First Article  of Home Page",e);
		}
	}


	 /**
		 *@author SanjeebKumarPati
		 * This method is used to click on LiveBlog Article of Malayalam Home Page 
		 */
		public void clickOnFirstLiveBlogArticleMalayalamHomePage() {
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
	 * @author AnupamGupta
	 * This method used to click on photos section of Malayalam Homepage
	 */
	public void clickOnPhotoSection()
	{
		try {
			webDriverActions.click(photoSectionLnk);
			Logs.info(getClass(), "Clicked on photo section");
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Photos Section Link of Home Page",e);
		}
	}

	/**
	 * @author Sanjeeb
	 * This method is used to click on the sports link of home page
	 */
	public void clickOnSportsLnk()
	{
		try {
			webDriverActions.clickJS(sportsLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Sports Section Link of Home Page",e);
		}
	}

	/**
	 * @author AnupamGupta
	 * This method is used to click on India Section link present on line one section
	 */
	public void clickOnIndiaSection()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(indiaSectionLnks);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in India Section Link of Home Page",e);
		}	
	}
}

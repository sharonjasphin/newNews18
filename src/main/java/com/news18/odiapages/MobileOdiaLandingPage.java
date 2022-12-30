package com.news18.odiapages;

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
 * @author AbhishekRaj
 *
 */
public class MobileOdiaLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public MobileOdiaLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Humberger Button Present in Line one navigation bar in Odia HomePage */
	@FindBy(xpath="//div[contains(@class,'mobile_nav_icon')]/a[contains(@class,'nav_icon')]")
	private WebElement humbergerBtn;

	/*photo section Present in Line one navigation bar in Odia HomePage */
	@FindBy(xpath="//ul[contains(@class,'navigation adclsnavg')]/li/a[contains(@href,'/photogallery/')]")
	private WebElement photoSectionLnk;

	/*Homepage List of article Link for news18 Odia Page*/
	@FindBy(xpath ="//div[contains(@class,'container')]//li/a[not(contains(@href,'live')) and not(contains(@href,'cricket'))]")
	private List<WebElement> homePageArticleLnk;

	/*Homepage List of Live article Link for news18 Odia Page*/
	@FindBy(xpath ="//div[contains(@class,'wapper')]//li/a[contains(@href,'live-update')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*Section links Present in Line one navigation bar in Odia HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[contains(@href,'/india-')]")
	private WebElement sectionLnk;

	/*Video section Present in Line one navigation bar in Odia HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[contains(@href,'/videos/')]")
	private WebElement videosSectionLnk;

	/*Sports section Present in Line one navigation bar in Odia HomePage */
	@FindBy(xpath="//ul[contains(@class,'navigation adclsnavg')]/li/a[contains(@href,'/sport/')]")
	private WebElement sportsSectionLnk;


	/**
	 * @author AbhishekRaj
	 * This method is used to click on First Article of Odia Home Page 
	 */
	public void clickOnFirstArticleOdiaHomePage() {
		try {
			webDriverActions.clickJS(homePageArticleLnk.get(0));
			Logs.info(getClass(), "Clicked on first article");
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Home Page Article Homepage ", e);
		}
	}

	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of Odia Home Page 
	 */
	public void clickOnFirstLiveBlogArticleOdiaHomePage() {
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
	 * This method used to click on photos section of Odia Homepage
	 */
	public void clickOnSportsSection()
	{
		try {
			webDriverActions.click(humbergerBtn);
			webDriverActions.click(sportsSectionLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Sports Section Hamburger link", e);
			Logs.error(getClass(), "Exception in Sports section link", e);
		}
	}

	/**
	 * @author AbhishekRaj
	 * This method used to click on photos section of Odia Homepage
	 */
	public void clickOnVideoSection()
	{
		try {
			webDriverActions.click(videosSectionLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Videos Section link", e);
		}
	}


	/**
	 * @author Sanjeeb
	 * This method used to click on photos section of Odia Homepage
	 */
	public void clickOnSection()
	{
		try {
			webDriverActions.click(sectionLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(),"Exception in Section link Homepage ", e);
		}
	}

	/**
	 * @author Anupam
	 * This method used to click on photos section of Odia Homepage
	 */
	public void clickOnPhotosSection()
	{
		try {
			webDriverActions.click(humbergerBtn);
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(photoSectionLnk);
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Photo Section Homepage ", e);
		}
	}

}

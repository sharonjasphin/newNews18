package com.news18.urdupages;

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
 *
 */
public class MobileUrduLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public MobileUrduLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/*Homepage List of article Link for news18 urdu Page*/
	@FindBy(xpath ="//div[contains(@class,'global-storylist')]//ul//li//a[not(contains(@href,'live')) and not(contains(@href,'cricket'))]")
	private List<WebElement> homePageArticleLnk;

	/*photo section Present in LineOne navigation bar in urdu HomePage */
	@FindBy(xpath="//div[contains(@class,'hamburgernav')]//ul[@class='mbl-mhbgr-navigation adclsnavg']//li//a[contains(@href,'photogallery')]")
	private WebElement photoSectionLnk;

	/*Homepage List of Live article Link for news18 urdu Page*/
	@FindBy(xpath ="//div[contains(@class,'wapper')]//li/a[contains(@href,'live')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*Homepage video section for news18 urdu Page*/
	@FindBy(xpath ="//div[contains(@class,'hamburgernav')]//ul//a[contains(@href,'videos')]")
	private WebElement homePageVideoSection;

	/*nation link present in urdu HomePage  */
	@FindBy(xpath ="//div[contains(@class,'top_links_element')]//a[contains(@href,'/nation/')]")
	private WebElement nationLnk;

	/*Hamburger Icon link present in urdu HomePage  */
	@FindBy(xpath ="//div[contains(@class,'new-header')]//a[contains(@title,'icon')]")
	private WebElement hamburgerIconLnk;
	
	/*Sports link present in urdu HomePage  */
	@FindBy(xpath ="//div[contains(@class,'hamburgernav')]//ul//a[contains(@href,'sports')]")
	private WebElement sportsLnk;


	/**
	 * @author AnupamG
	 * This method is used to click on video section of Urdu Home Page 
	 */
	public void clickOnVideoSection() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(hamburgerIconLnk);
			webDriverActions.clickJS(homePageVideoSection);
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Video Section ", e);
		}
	}

	/**
	 * @author AbhishekRaj
	 * This method is used to click on First Article of Urdu Home Page 
	 */
	public void clickOnFirstArticleUrduHomePage() {
		try {
			webDriverActions.clickJS(homePageArticleLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Home Page Article Link ", e);
		}
	}


	/**
	 * @author AnupamG
	 * This method used to click on photos section of Urdu Home page
	 */
	public void clickOnPhotoSection()
	{
		try {
			webDriverActions.clickJS(hamburgerIconLnk);
			webDriverActions.clickJS(photoSectionLnk);
		} catch(NoSuchElementException e)
		{
			Logs.error(getClass(), "Exception in Photo Section link", e);
		}
	}


	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of Urdu Home Page 
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
	 * This method used to click on Sports section of Urdu Home page
	 */
	public void clickOnSportsSection()
	{
		try {
			webDriverActions.clickJS(hamburgerIconLnk);
			webDriverActions.clickJS(sportsLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Sports Section link", e);
		}
	}

	/**
	 * This method used to click on nation section of Urdu Home page
	 */
	public void clickOnNationsSection()
	{
		try {
			webDriverActions.clickJS(nationLnk);
		}  catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Sports Section link", e);
		}
	}
}




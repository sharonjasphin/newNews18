package com.news18.punjabipages;

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
 *
 */
public class MobilePunjabLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public MobilePunjabLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/*Homepage List of article Link for news18 punjab Page*/
	@FindBy(xpath ="//div[contains(@class,'news')]//ul//li//a[not(contains(@href,'live')) and not(contains(@href,'cricket'))]")
	private List<WebElement> homePageArticleLnk;

	/*photo section Present in in Homepage Hamburger Menu list for news18 punjab Page */
	@FindBy(xpath="//ul[contains(@class,'navigation')]//a[contains(@href,'photo')]")
	private WebElement photoSectionLnk;

	/*Homepage List of Live article Link for news18 punjab Page*/
	@FindBy(xpath ="//div[contains(@class,'wapper')]//li/a[contains(@href,'live')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*Video section Present in LineOne navigation bar in punjab HomePage */
	@FindBy(xpath ="//div[contains(@class,'top_links')]//a[contains(@href,'videos')]")
	private List<WebElement> homePageVideoSection;

	/*World section Present in LineOne navigation bar in punjab HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links')]//a[contains(@href,'/international/')]")
	private WebElement worldSectionLnk;

	/*Homepage Hamburger Menu list for news18 punjab Page*/
	@FindBy(xpath ="//div[contains(@class,'nav_icon')]//a[contains(@class,'nav_icon')]")
	private WebElement humburgerMenuLnk;

	/*Sports link present in Homepage Hamburger Menu list for news18 punjab Page */
	@FindBy(xpath ="//ul[contains(@class,'navigation')]//a[contains(@href,'sports')]")
	private WebElement sportsLnk;


	/**
	 * @author AbhishekRaj
	 * This method is used click on video section
	 */
	public void clickOnVideoSection() {
		webDriverActions.clickJS(homePageVideoSection.get(0));
	}

	/**
	 * @author AbhishekRaj
	 * This method is used to click on First Article of Punjab Home Page 
	 */
	public void clickOnFirstArticlePunjabHomePage() {
		try {
			webDriverActions.clickJS(homePageArticleLnk.get(0));
		}
		catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in first Article Homepage ", e);
		}
	}



	/**
	 * @author Anupam
	 * This method used to click on photos section of Punjab Homepage
	 */
	public void clickOnPhotoSection()
	{
		try {
			webDriverActions.clickJS(humburgerMenuLnk);
			webDriverActions.scrollDown();
			webDriverActions.clickJS(photoSectionLnk);
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in PhotoSection Link ", e);
		}
	}


	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of Punjab Home Page 
	 */
	public void clickOnFirstLiveBlogArticleHomePage() {
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
	 * This method used to click on photos section of Punjab Homepage
	 */
	public void clickOnWorldsSection()
	{
		try {
			webDriverActions.clickJS(worldSectionLnk);
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in Section Page Link ", e);
		}
	}

	/**
	 * This method used to click on photos section of Punjab Homepage
	 */
	public void clickOnSportsSection()
	{
		try {
			webDriverActions.clickJS(humburgerMenuLnk);
			webDriverActions.clickJS(sportsLnk);
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in Humburger Menu Link Homepage ", e);
			Logs.error(getClass(), "Exception in Sports Link Homepage ", e);
		}
	}
}

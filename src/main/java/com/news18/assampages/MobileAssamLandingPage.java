package com.news18.assampages;

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
 * This Class Contains elements and business logics for Assam Mobile Landing  Page
 */
public class MobileAssamLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public MobileAssamLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/*Homepage List of article Link for news18 Assam Page*/
	@FindBy(xpath ="(//div[contains(@class,'container_mob')]//ul[contains(@class,'topnews-left-list')]//li//a[not(contains(@href,'live')) and not(contains(@href,'cricket'))  and not(contains(@href,'photogallery'))])[1]")
	private WebElement homePageArticleLnk;

	/*photo section Present in LineOne navigation bar in Assam HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[contains(@href,'/photogallery/')]")
	private WebElement photoSectionLnk;
	
	/*Homepage List of Live article Link for news18 Assam Page*/
	@FindBy(xpath ="//div[contains(@class,'wapper')]//li/a[contains(@href,'live-update')]")
	private List<WebElement> homePageLiveBlogArticleLnk;
	
	/*Homepage List of Live article Link for news18 Assam Page*/
	@FindBy(xpath ="//div[contains(@class,'top_links_cont')]//a[contains(@href,'/nation/')]")
	private WebElement lineOneSectionLnk;
	
	/*Homepage List of Live article Link for news18 Assam Page*/
	@FindBy(xpath ="//nav[contains(@class,'adclsnav')]//a[contains(@href,'/sports/')]")
	private List<WebElement> cricketNxtLnk;
	
	/*Homepage List of Live article Link for news18 Assam Page*/
	@FindBy(xpath ="//div[contains(@class,'top_links_cont')]//a[contains(@href,'/videos/')]")
	private WebElement videosLnk;
	
	/*Homepage List of Live article Link for news18 Assam Page*/
	@FindBy(xpath ="//div[contains(@class,'mobile_nav_icon')]//a[contains(@class,'nav_icon')]")
	private WebElement humburgerLnk;
	
	
	

	/**
	 * @author Vipin
	 * This method is used to click on First Article of Assam Home Page 
	 */
	public void clickOnFirstArticleAssamHomePage() {
		webDriverActions.waitForPageToLoad();
		try {
			webDriverActions.clickJS(homePageArticleLnk);
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First Article of Home Page",e);
		}
	}


	/**
	 * @author Abhishek
	 * This method used to click on photos section of Assam Homepage
	 */
	public void clickOnPhotoSection()
	{
		try {
			webDriverActions.mouseHover(photoSectionLnk);
			webDriverActions.highlightElement(photoSectionLnk);
			webDriverActions.clickJS(photoSectionLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Possibly PhotoSection is Not Visble",e);
		}
	}
	
	
	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of Assam Home Page 
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
	 * @author DanishR
	 * This method used to click on photos section of Assam Homepage
	 */
	public void clickOnLineOneSection()
	{
		try {
			webDriverActions.click(lineOneSectionLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Section page Link of Home page",e);
		}
	}
	
	/**
	 * @author Abhishek
	 * This method used to click on photos section of Assam Homepage
	 */
	public void clickOnSports()
	{
		try {
			webDriverActions.click(humburgerLnk);
			webDriverActions.click(cricketNxtLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Sports Link of Home page",e);
		}
	}
	
	/**
	 * @author Anupam
	 * This method used to click on photos section of Assam Homepage
	 */
	public void clickOnVideos()
	{
		try {
			webDriverActions.click(videosLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Video Section Link of Home page",e);
		}
	}
	

}

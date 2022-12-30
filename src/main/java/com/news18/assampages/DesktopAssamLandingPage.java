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
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Abhishek Raj
 *This Class Contains elements and business logics for Assam Desktop Landing  Page
 */
public class DesktopAssamLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopAssamLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Homepage First article Link  is present below the Line Two Menu bar in RHS*/
	@FindBy(xpath ="//div[contains(@class,'topnews-right')]//ul//li//a[not(contains(@href,'live')) and contains(@href,'/news/')]")
	private List<WebElement> homePageArticleLnk;

	/*Homepage LiveBlog article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@class,'top_news_right')]//a[contains(@href,'live')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*photo section Present in LineOne navigation bar */
	@FindBy(xpath="//ul[contains(@class,'nav_bar')]//a[contains(@href,'/photogallery/')]")
	private WebElement photoSectionLineOneLnk;

	/*Sports link present after clicking on line two*/
	@FindBy(xpath ="//div[contains(@class,'container')]//a[@href='/sports/']")
	private WebElement sportsSectionLnk;

	/*Entertainment link present at line one section*/
	@FindBy(xpath ="//div[contains(@class,'container')]//ul[contains(@class,'nav_bar')]//a[not(contains(@href,'/sports/')) and not(contains(@href,'/photogallery/'))]")
	private List<WebElement> sectionLnks;

	/*video link present at Footer section*/
	@FindBy(xpath ="//div[contains(@class,'container')]//ul[contains(@class,'sub_navigation')]//a[@href='/videos/']")
	private WebElement videoSectionLnk;





	/**
	 * @author Sanjeeb
	 * This method is used to click on First Article of English Home Page 
	 */
	public void clickOnFirstArticleHomePage() {
		try {
			webDriverActions.clickJS(homePageArticleLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First Article of Home Page ",e);
		}
	}


	/**
	 * @author Sanjeeb
	 * This method used to click on photos section
	 */
	public void clickOnPhotosSection(){
		try {
			webDriverActions.clickJS(photoSectionLineOneLnk);
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Photos Link in Home Page ",e);
		}
	}


	/**
	 * @author Sanjeeb
	 * This method is used to click on sports link present on lineOne section
	 */
	public void clickOnSportsLnk(){
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(sportsSectionLnk);
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Sports Link in Home Page ",e);
		}	
	}


	/**
	 * @author Sanjeeb 
	 * This method is used to click on First Section link present on line one section
	 */
	public void clickOnFirstSectionLnk(){
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(sectionLnks.get(1));
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Section Link in Home Page ",e);
		}	
	}


	/**
	 * @author Sanjeeb
	 * This method is used to click on Video link present on Line one section
	 */
	public void clickOnVideoLnk(){
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.continuousScrollTillElement(videoSectionLnk, GlobalVariables.sec30);
			webDriverActions.click(videoSectionLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Videos Link in Home Page ",e);
		}	
	}

	/**
	 * @author Sanjeeb
	 * This method is used to click on LiveBlog Article of English Home Page 
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
}

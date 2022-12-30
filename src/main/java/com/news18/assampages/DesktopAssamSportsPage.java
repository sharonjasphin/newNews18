package com.news18.assampages;

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
 * @author SanjeebKumarPati
 *This Class Contains elements and business logics for Assam Sports Page
 */
public class DesktopAssamSportsPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopAssamSportsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*live Blog First Article of sports Page*/
		@FindBy(xpath = "(//div[contains(@class,'resLiftSideFull')]//a[contains(@title,'LIVE Updates')])")
		private List< WebElement> liveBlogtFirstArticleLnk;
		
	/*Article of sports Page*/
	@FindBy(xpath = "//div[contains(@class,'blog-left-img-list')]//a")
	private List<WebElement> sportsArticlesLnk;



	/**
	 * @author SanjeebKumarPati
	 * This method is used to click on First Article of Assam sports Page 
	 */
	public void clickOnFirstArticleSportsPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(sportsArticlesLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First Article of Sports Section ",e);
		}
	}


	 /**
		 *@author SanjeebKumarPati
		 * This method is used to click on LiveBlog Article of assam sports Home Page 
		 */
		public void clickOnFirstLiveBlogArticleSportsPage() {
			try {
				webDriverActions.waitForPageToLoad();
				webDriverActions.waitForSecond(1000);
				if(webDriverActions.isElementDisplayed(liveBlogtFirstArticleLnk.get(0)))
				{
					webDriverActions.clickJS(liveBlogtFirstArticleLnk.get(0));
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

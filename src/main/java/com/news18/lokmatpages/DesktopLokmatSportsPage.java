package com.news18.lokmatpages;

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
 *This class contain WebElements and their Business logics of Lokmat Amp Sports Pages
 */
public class DesktopLokmatSportsPage extends WebDriverActions {
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;

	public DesktopLokmatSportsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Article of lokmat sports Page*/
	@FindBy(xpath = "(//div[contains(@class,'left-img-list')]//a)[1]")
	private WebElement sportsArticlesLnk;

	/*LiveBlog First Article of lokmat Sports Page*/
	@FindBy(xpath = "(//div[contains(@class,'left')]//a[(contains(@href,'live-updates'))])")
	private List<WebElement> sportsLiveBlogFirstArticleLnk;


	/**
	 * @author SanjeebKumarPati
	 * This method is used to click on First Article of lokmat Home Page 
	 */
	public void clickOnFirstArticleSportsPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(sportsArticlesLnk);
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First Article of Sports Page",e);
		}
	}



	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of lokmat Home Page 
	 */
	public void clickOnFirstLiveBlogArticleSportsPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(1000);
			if(webDriverActions.isElementDisplayed(sportsLiveBlogFirstArticleLnk.get(0)))
			{
				webDriverActions.clickJS(sportsLiveBlogFirstArticleLnk.get(0));
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

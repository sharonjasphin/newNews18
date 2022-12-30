package com.news18.kannadapages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author SanjeebKumarPati
 * This Class Contains elements and business logics for Kannada Sports Page
 */
public class DesktopKannadaSportsPage {
	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public  DesktopKannadaSportsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Article of sports Page*/
	@FindBy(xpath = "//div[contains(@class,'blog-left-img-list')]//a")
	private List<WebElement> sportsArticlesLnk;

	/*live Blog First Article of sports Page*/
	@FindBy(xpath = "(//div[contains(@class,'resLiftSideFull')]//a[contains(@href,'live-updates')])")
	private List<WebElement> liveBlogFirstArticleLnk;


	/**
	 * @author SanjeebKumarPati
	 * This method is used to click on First Article of kannada sports Page 
	 */
	public void clickOnFirstArticleSportsPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(sportsArticlesLnk.get(0));
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in First Article in Sports Page ",e);
		}
	}

	
	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of Kannada Home Page 
	 */
	public void clickOnFirstLiveBlogArticleSportsPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(1000);
			if(webDriverActions.isElementDisplayed(liveBlogFirstArticleLnk.get(0)))
			{
				webDriverActions.clickJS(liveBlogFirstArticleLnk.get(0));
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

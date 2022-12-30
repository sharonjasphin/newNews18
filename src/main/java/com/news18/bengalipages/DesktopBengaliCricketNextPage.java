package com.news18.bengalipages;

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
 *This Class Contains elements and business logics for Bengali AMP cricket next Page
 */
public class DesktopBengaliCricketNextPage {
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;

	public DesktopBengaliCricketNextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* Article of bengali CricketNext Page*/
	@FindBy(xpath = "(//div[contains(@class,'ctgr-rgt fright')]//a)[1]")
	private List<WebElement> cricketNxtArticleLnks;

	/*LiveBlog Article of bengali CricketNext Page*/
	@FindBy(xpath = "//div[contains(@class,'hmlft fleft')]//a[(contains(@href,'live'))]")
	private List<WebElement> cricketNextLiveBlogArticleLnks;

	/*LiveButton present on the live blog header*/
	@FindBy(xpath = "//div[contains(@class,'language_row')]//p[text()='Live now']")
	private WebElement liveNowBtn;


	/**
	 * @author SanjeebKumarPati
	 * This method is used to click on First Article of Bengali Home Page 
	 */
	public void clickOnFirstArticleCricketNextPage() {
		webDriverActions.waitForPageToLoad();
		try {
			webDriverActions.waitForElementVisibility(cricketNxtArticleLnks.get(0), 10);
			webDriverActions.clickJS(cricketNxtArticleLnks.get(0));
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in First Cricket Next Page Link", e);
		}
	}


	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of Bengali CricketNext Page 
	 */
	public void clickOnFirstLiveBlogArticleCricketNextPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(1000);
			if(webDriverActions.isElementDisplayed(cricketNextLiveBlogArticleLnks.get(0)))
			{
				webDriverActions.clickJS(cricketNextLiveBlogArticleLnks.get(0));
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

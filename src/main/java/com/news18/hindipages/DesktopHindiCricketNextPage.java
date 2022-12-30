
package com.news18.hindipages;

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
 *This Class Contains elements and business logics for hindi Cricket next Page 
 */
public class DesktopHindiCricketNextPage {
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;

	public DesktopHindiCricketNextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*first Article of Hindi CricketNext Page*/
	@FindBy(xpath = "(//div[contains(@class,'leftwrap')]//div[contains(@class,'img-list forstates')]//a)[1]")
	private WebElement cricketNxtFirstArticleLnk;

	/*LiveBlog First Article of HIndi CricketNext Page*/
	@FindBy(xpath = "//div[contains(@class,'lazyload-wrapper')]//img[(contains(@alt,'Live'))]")
	private List<WebElement> cricketNextLiveBlogArticleLnks;


	/**
	 * @author SanjeebKumarPati
	 * This method is used to click on First Article of Hindi Home Page 
	 */
	public void clickOnFirstArticleCricketNextPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(cricketNxtFirstArticleLnk);
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Cricket Next Article Link", e);
		}
	}
	

	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of English Home Page 
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

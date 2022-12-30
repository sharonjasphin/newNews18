package com.news18.assampages;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 *@author SanjeebKumarPati
 *This Class Contains elements and business logics for Assam entertainment Page
 */
public class DesktopAssamSectionPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	
	public DesktopAssamSectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Article of Entertainment Page*/
	@FindBy(xpath = "//div[contains(@class,'blog-left-img-list')]//a")
	private List<WebElement> articlesLnks;
	
	/*First published date mentioned in latest article*/
	@FindBy(xpath = "//ul[contains(@class,'listview-story')]//li//img")
	private WebElement firstArticlesLnk;


	/**
	 * @author SanjeebKumarPati
	 * This method is used to click on First Article of Assam Section Page 
	 */
	public void clickOnFirstArticleSectionPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(articlesLnks.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First Article Of Section Page ",e);
		}
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to click on First Article of Assam Section Page 
	 */
	public void clickOnFirstArticleNationSectionPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(firstArticlesLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in First Article of Nation Page ",e);
		}
	}
}
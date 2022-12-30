package com.news18.bengalipages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author SanjeebKumarPati
 *This Class Contains elements and business logics for Bengali AMP Videos Page
 */
public class DesktopBengaliVideosPage {
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;

	public DesktopBengaliVideosPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* video Section First Article Link */
	@FindBy(xpath = "(//div[contains(@class,'intro')]//a)[1]")
	private WebElement videosFirstArticleLnk;


	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate and click on First Article of Bengali Video Page 
	 */
	public void clickOnFirstVideoArticle() {
		webDriverActions.waitForPageToLoad();
		try {
			webDriverActions.clickJS(videosFirstArticleLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Videos First Article Link", e);
		}
		webDriverActions.switchToNewWindow();
	}
}



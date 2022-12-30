package com.news18.assampages;

import java.util.NoSuchElementException;

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
 *This Class Contains elements and business logics for Assam Video Page
 */
public class DesktopAssamVideosPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public  DesktopAssamVideosPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Article of video Page*/
	@FindBy(xpath = "(//div[contains(@class,'data-list-cat')]/figure/a)[1]")
	private WebElement videoArticlesLnk;


	/**
	 * @author SanjeebKumarPati
	 * This method is used to click on First Article of Assam video Page 
	 */
	public void clickOnFirstArticleVideoPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(2000);
			webDriverActions.scrollToElement(videoArticlesLnk);
			webDriverActions.clickJS(videoArticlesLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in First article of Video Page",e);
		}
	}

}
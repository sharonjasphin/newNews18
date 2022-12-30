package com.news18.hindipages;

import java.util.List;

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
 *This Class Contains elements and business logics for hindi Videos Page
 */
public class DesktopHindiVideosPage {
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;
	
	public DesktopHindiVideosPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* Video Section Article Link */
	@FindBy(xpath = "//div[contains(@class,'trading_news')]//li/a")
	private List<WebElement> videosArticleLnks;
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate and click on First Article of Hindi Section Page 
	 */
	public void clickOnFirstVideoArticle() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForElementVisibility(videosArticleLnks.get(0), 30);
			webDriverActions.click(videosArticleLnks.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Video Section Article Link ", e);
		}
		webDriverActions.switchToNewWindow();
	}
}


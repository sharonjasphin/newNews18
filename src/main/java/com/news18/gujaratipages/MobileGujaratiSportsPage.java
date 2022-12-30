package com.news18.gujaratipages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Anupam
 *
 */
public class MobileGujaratiSportsPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();

	public  MobileGujaratiSportsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Article of sports Page*/
	@FindBy(xpath = "//div[contains(@class,'grid_story')]//ul//a")
	private List<WebElement> sportsArticlesLnk;

	/**
	 * @author AnupamGupta
	 * This method is used to click on First Article of Gujarati sports Page 
	 */
	public void clickOnFirstArticleSportsPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(sportsArticlesLnk.get(0));
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in CricketNext Article Link ", e);
		}
	}
}
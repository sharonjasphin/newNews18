package com.news18.tamilpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author AbhishekRaj
 *
 */
public class MobileTamilCricketNextPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public MobileTamilCricketNextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Homepage First article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="(//ul[contains(@class,'listview-story')]//img)[1]")
	private WebElement sportsArticleLnk ;

	/**
	 * This method is used to click on First article link
	 */
	public void clickSportsFirstArticle() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(sportsArticleLnk);
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in CricketNext Article Link ", e);
		}
	}
}




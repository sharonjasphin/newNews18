package com.news18.punjabipages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class MobilePunjabCricketNextPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public MobilePunjabCricketNextPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Homepage List of Live article Link for news18 punjab Page*/
	@FindBy(xpath ="//ul[contains(@class,'listview-story')]//li//img")
	private List<WebElement> sportsArticleLnk;

	/**
	 * @author Sanjeeb
	 * This method is used to click on First article link
	 */
	public void clickSportsFirstArticle() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(sportsArticleLnk.get(0));
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in CricketNext Article Link ", e);
		}
	}


}




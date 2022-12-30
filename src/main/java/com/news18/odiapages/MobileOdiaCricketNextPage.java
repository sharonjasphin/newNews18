package com.news18.odiapages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class MobileOdiaCricketNextPage {
	
	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public   MobileOdiaCricketNextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Homepage First article Link  is present below the Line Two Menu Bar in RHS*/
	@FindBy(xpath ="//div[contains(@class,'tpnews')]//ul[contains(@class,'listview-story')]//li//img")
	private List<WebElement> sportsArticleLink ;

	/**
	 * This method is used to click on First article link
	 */
	public void clicksportsFirstArticle() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(sportsArticleLink.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Sports Page Article Homepage ", e);
		}
	}

}




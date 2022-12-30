package com.news18.hindipages;

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
public class MobileHindiCricketNextPage {
	
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;
	
	public MobileHindiCricketNextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	/*cricket Next Article Link  for news18 Hindi Page*/
	@FindBy(xpath ="(//div[contains(@class,'CN-Thumbstory')]//div//a)[1]")
	private WebElement cricketNextArticleLnk;
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to click on First Article of Hindi Home Page 
	 */
	public void clickOnFirstArticleCricketNextPage() {
		webDriverActions.waitForPageToLoad();
		try {
			webDriverActions.clickJS(cricketNextArticleLnk);
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in CricketNext Article Link ", e);
		}
	}
}




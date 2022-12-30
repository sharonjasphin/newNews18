package com.news18.urdupages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author AnupamGupta
 * This Class Contains elements and business logics for Urdu Mobile Sports Page
 */
public class MobileUrduSportsPage {

	WebDriverActions webDriverActions = new WebDriverActions();

	public WebDriver driver;
	public MobileUrduSportsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Links of all latest article in latest section*/
	@FindBy(xpath = "//div[contains(@class,'tpnews clearfix mainContent')]//li/a")
	private List<WebElement> articlerLst;


	/**
	 * @author AnupamGupta
	 * This method is used to click on First article link
	 */
	public void clickOnFirstArticleSportsPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(articlerLst.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Sports Page Article Link", e);
		}
	}
}

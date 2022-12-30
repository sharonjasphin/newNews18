package com.news18.lokmatpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author AnupamGupta
 * This Class Contains elements and business logics for Lokmat Mobile Sports Page
 */
public class MobileLokmatSportsPage {

	WebDriverActions webDriverActions = new WebDriverActions();

	public WebDriver driver;
	public MobileLokmatSportsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Links of all latest article in sports section*/
	@FindBy(xpath = "//div[contains(@class,'tpnews')]/ul//figure/a")
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
			Logs.error(getClass(), "Exception in First Article of Sports Page",e);
		}
	}
}
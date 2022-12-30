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
 * This Class Contains elements and business logics for Lokmat Mobile Section Page
 */
public class MobileLokmatSectionPage {

	WebDriverActions webDriverActions = new WebDriverActions();

	public WebDriver driver;
	public MobileLokmatSectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Links of all latest article in latest section*/
	@FindBy(xpath = "//div[contains(@class,'tpnews')]//li/a")
	private List<WebElement> articleLnk;


	/**
	 * @author AnupamGupta
	 * This method is used to click on First article link
	 */
	public void clickOnFirstArticleSectionPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.scrollDown();
			webDriverActions.clickJS(articleLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First Article of Section Page",e);
		}
	}
}
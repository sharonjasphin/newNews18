package com.news18.urdupages;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author AnupamGupta
 * This Class Contains elements and business logics for Urdu Mobile Section Page
 */
public class MobileUrduSectionPage {


	WebDriverActions webDriverActions = new WebDriverActions();

	public WebDriver driver;
	public MobileUrduSectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Links of all latest article in latest section*/
	@FindBy(xpath = "(//div[contains(@class,'pdngsxtn')]//li/a)[1]")
	private WebElement nationFirstArtcleLnk;


	/**
	 * @author AnupamGupta
	 * This method is used to click on First article link
	 */
	public void clickOnFirstArticleSectionPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.scrollDown();
			webDriverActions.clickJS(nationFirstArtcleLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Section Page Article link", e);
		}
	}
}
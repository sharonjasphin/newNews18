package com.news18.kannadapages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author AnupamGupta
 * This Class Contains elements and business logics for kannada Mobile Section Page
 */
public class MobileKannadaSectionPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();

	public  MobileKannadaSectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Article of Section Page*/
	@FindBy(xpath = "//ul[contains(@class,'listview-story')]/li/a")
	private List<WebElement> sectionArticlesLnk;

	/**
	 * @author AnupamGupta
	 * This method is used to click on First Article of Kannada section Page 
	 */
	public void clickOnFirstArticleSectionPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(sectionArticlesLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First Article of Section Page ",e);
		}
	}
}
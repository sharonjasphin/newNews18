package com.news18.malayalampages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author AnupamGupta
 * This Class Contains elements and business logics for Malayalam Mobile Section Page
 */
public class MobileMalayalamSectionPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();

	public  MobileMalayalamSectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Article of Section Page*/
	@FindBy(xpath = "//div[contains(@class,'tpnews')]//ul/li/a")
	private List<WebElement> sectionArticlesLnk;

	/**
	 * @author AnupamGupta
	 * This method is used to click on First Article of Malayalam section Page 
	 */
	public void clickOnFirstArticleSectionPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(sectionArticlesLnk.get(1));
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in First Article of Section page",e);
		}
	}
}
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
 * This Class Contains elements and business logics for Malayalam Mobile Sports Page
 */
public class MobileMalayalamSportsPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();

	public  MobileMalayalamSportsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Article of sports Page*/
	@FindBy(xpath = "//ul[contains(@class,'listview-story')]//a")
	private List<WebElement> sportsArticlesLnk;

	/**
	 * @author AnupamGupta
	 * This method is used to click on First Article of Malayalam sports Page 
	 */
	public void clickOnFirstArticleSportsPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(sportsArticlesLnk.get(1));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.waitForPageToLoad();
				webDriverActions.clickJS(sportsArticlesLnk.get(1));
			}
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in First Article of Sports page",e);
		}
	}
}
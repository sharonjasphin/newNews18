package com.news18.gujaratipages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Anupam
 *
 */
public class MobileGujaratiSectionPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();

	public  MobileGujaratiSectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Article of Section Page*/
	@FindBy(xpath = "//div[contains(@class,'grid_story')]//ul//a")
	private List<WebElement> sectionArticlesLnk;

	/**
	 * @author AnupamGupta
	 * This method is used to click on First Article of Gujarati section Page 
	 */
	public void clickOnFirstArticleSectionPage() {
		try{
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(sectionArticlesLnk.get(0));
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in Section page Article Link ", e);
		}
	}
}
package com.news18.bengalipages;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author SanjeebKumarPati
 *This Class Contains elements and business logics for Bengali AMP Section Page
 */
public class DesktopBengaliSectionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;

	public DesktopBengaliSectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* Section Link Present on the LIne One Section Of News18 bengali Home Page*/
	@FindBy(xpath = "//div[contains(@class,'container')]//ul[contains(@class,'nav_bar')]//a[not(contains(@href,'/videos/')) and not(contains(@href,'/photogallery/'))]")
	private List<WebElement> sectionLnks;

	/* Article Links on First Section Page */
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a")
	private List<WebElement> articleLnks;


	/**
	 * @author Sanjeeb
	 * This method is used to navigate and click on First Article of Bengali first Section Page 
	 */
	public void clickOnFirstArticlSectionPage() {
		webDriverActions.waitForPageToLoad();
		try {
			webDriverActions.click(sectionLnks.get(1));
			webDriverActions.click(articleLnks.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Section Link "+sectionLnks, e);
			Logs.error(getClass(), "Exception in Section article Link "+articleLnks, e);
			Assert.fail("Possibily element is not Visible and not Clickable "+articleLnks);
		}
	}
}

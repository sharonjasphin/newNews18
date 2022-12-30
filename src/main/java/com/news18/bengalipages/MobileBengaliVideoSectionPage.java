package com.news18.bengalipages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author DanishR
 *
 */
public class MobileBengaliVideoSectionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;

	public MobileBengaliVideoSectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/* Article Links on First Section Page */
	@FindBy(xpath = "(//ul[contains(@class,'gridview-story')]/li//figure/img)[1]")
	private WebElement articlesLnk;


	/**
	 * @author Abhishek
	 * This method is used to navigate and click on First Article of Bengali first Section Page 
	 */
	public void clickOnFirstArticleVideosSectionPage() {
		webDriverActions.continuousScrollTillElement(articlesLnk, GlobalVariables.sec30);
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(articlesLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Section First Article Link", e);
		}
	}
}

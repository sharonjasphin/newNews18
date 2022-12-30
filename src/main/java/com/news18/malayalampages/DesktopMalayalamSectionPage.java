package com.news18.malayalampages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author SanjeebKumarPati
 *This Class Contains elements and business logics for Malayalam India Page
 */
public class DesktopMalayalamSectionPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopMalayalamSectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Article of India Page*/
	@FindBy(xpath = "//div[contains(@class,'blog-left-img-list')]//a")
	private List<WebElement> articlesLnk;


	/**
	 * @author SanjeebKumarPati
	 * This method is used to click on First Article of Kannada Section Page 
	 */
	public void clickOnFirstArticleSectionPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(articlesLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First Article  of Section Page",e);
		}
	}
}

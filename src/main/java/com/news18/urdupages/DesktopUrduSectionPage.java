package com.news18.urdupages;


import org.openqa.selenium.NoSuchElementException;
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
 *This Class Contains elements and business logics for urdu entertainment Page
 */
public class DesktopUrduSectionPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopUrduSectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Article of Entertainment Page*/
	@FindBy(xpath = "(//div[contains(@class,'blog-left-img-list')]//a)[1]")
	private WebElement aticlesLnk;


	/**
	 * @author SanjeebKumarPati
	 * This method is used to click on First Article of urdu Section Page 
	 */
	public void clickOnFirstArticleSectionPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(aticlesLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Photo Section Link", e);
		}
	}
}

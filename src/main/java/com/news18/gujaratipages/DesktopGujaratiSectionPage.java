package com.news18.gujaratipages;

import java.util.List;

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
 *This Class Contains elements and business logics for Gujurati Section Page
 */
public class DesktopGujaratiSectionPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public  DesktopGujaratiSectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Article of entertainment Page*/
	@FindBy(xpath = "//div[contains(@class,'blog_list')]//a")
	private List<WebElement> articlesLnk;


	/**
	 * @author SanjeebKumarPati
	 * This method is used to click on First Article of Gujarati  Page 
	 */
	public void clickOnFirstArticleSectionPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(articlesLnk.get(0));
		}
		catch(NoSuchElementException e)
		{
			Logs.error(getClass(), "Exception in Section page Article Link ", e);
		}
	}
}

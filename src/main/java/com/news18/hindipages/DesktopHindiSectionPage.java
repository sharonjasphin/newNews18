package com.news18.hindipages;

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
 *This Class Contains elements and business logics for hindi Section Page
 */
public class DesktopHindiSectionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;

	public DesktopHindiSectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* section Links Present on the LIne One Section Of News18 Home Page*/
	@FindBy(xpath = "(//div[contains(@class,'nav_wap')]//ul[contains(@class,'nav_bar')]//a[not(contains(@href,'/cricket/')) and not(@href='/')])[2]")
	private WebElement sectionLnks;

	/*  Section First Article Link */
	@FindBy(xpath = "(//div[contains(@class,'left-img-list')]//a)[1]")
	private WebElement sectionArticleLnks;


	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate and click on First Article of Hindi India Page  
	 */
	public void clickOnFirstArticleSectionPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(sectionLnks);
			webDriverActions.click(sectionArticleLnks);
		}
		catch(NoSuchElementException e)
		{
			Logs.error(getClass(), "Exception in Section page Article Link ", e);
		}
	}
}

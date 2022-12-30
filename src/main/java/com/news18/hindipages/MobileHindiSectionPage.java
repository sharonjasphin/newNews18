package com.news18.hindipages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;
public class MobileHindiSectionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;

	public MobileHindiSectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*cricket Next Article Link  for news18 Hindi Page*/
	@FindBy(xpath ="//div[contains(@class,'lstintro')]//h2//a")
	private List<WebElement> sectionArticleLnk;

	/**
	 * @author SanjeebKumarPati
	 * This method is used to click on First Article of Hindi Home Page 
	 */
	public void clickOnFirstSectionArticle() {
		webDriverActions.waitForPageToLoad();
		try {
			webDriverActions.clickJS(sectionArticleLnk.get(0));
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Section page Article Link ", e);
		}
	}
}







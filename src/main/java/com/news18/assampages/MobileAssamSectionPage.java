package com.news18.assampages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class MobileAssamSectionPage {
	
	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public MobileAssamSectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/*Homepage List of Live article Link for news18 Assam Page*/
	@FindBy(xpath ="//ul[contains(@class,'listview-story')]//img")
	private List<WebElement> sectionsLnk;


	/**
	 * @author Sanjeeb
	 * This method is used to click on First article link
	 */
	public void clickSectionFirstArticle() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(sectionsLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First Article of Section Page",e);
		}
	}

}




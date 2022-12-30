package com.news18.lokmatpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class MobileLokmatVideoPage {
	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public  MobileLokmatVideoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Article of video Page*/
	@FindBy(xpath = "//div[contains(@class,'lstintro')]//a[not (contains(@class,'vodeoiconb'))]")
	private List<WebElement> videoArticlesLnk;


	/**
	 * @author SharonJasphin
	 * This method is used to click on First Article of Lokmat video Page 
	 */
	public void clickOnFirstArticleVideoPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.scrollDown();
			webDriverActions.clickJS(videoArticlesLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First Article of Videos Page",e);
		}
	}
}

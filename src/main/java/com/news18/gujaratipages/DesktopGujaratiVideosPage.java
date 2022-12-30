package com.news18.gujaratipages;

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
 *This Class Contains elements and business logics for Gujarati Videos Page
 */
public class DesktopGujaratiVideosPage {
	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public  DesktopGujaratiVideosPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Article of video Page*/
	@FindBy(xpath = "//div[contains(@class,'video')]//div[contains(@class,'data')]//p//a")
	private List<WebElement> videoArticlesLnk;

	/**
	 * @author SanjeebKumarPati
	 * This method is used to click on First Article of Gujarati video Page 
	 */
	public void clickOnFirstArticleVideoPage() {
		try {
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(videoArticlesLnk.get(0));
		}
		catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Video Section Article Link ", e);
		}
	}
}

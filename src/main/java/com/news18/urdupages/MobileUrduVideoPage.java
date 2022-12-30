package com.news18.urdupages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author AbhishekRaj
 *
 */
public class MobileUrduVideoPage {

	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public  MobileUrduVideoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Article of video Page*/
	@FindBy(xpath = "//div[contains(@class,'pdng')]//ul//li//a//img")
	private List<WebElement> videoArticlesLnk;


	/**
	 * @author AbhishekRaj
	 * This method is used to click on First Article of Assam video Page 
	 */
	public void clickOnFirstArticleVideoPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.scrollDown();
			webDriverActions.clickJS(videoArticlesLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Video Page Article Link", e);
		}
	}
}

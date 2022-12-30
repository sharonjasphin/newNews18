package com.news18.englishpages;

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
 * @author AnupamGupta
 * This class contain WebElements and their Business logics of English CricketNext Page
 */
public class MobileCricketNextPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public MobileCricketNextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* CricketNext Articles Links in Cricket next page*/
	@FindBy(xpath = "//div[contains(@class,'CN-storyWrap')]//li/a[not(contains(@href,'live'))]")
	private List<WebElement> cricketNxtArticleLnks;


	/**
	 * @author AnupamGupta
	 * This method is used to click on First Article of English CricketNext Page 
	 */
	public void clickOnFirstArticleCricketNextPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(cricketNxtArticleLnks.get(0));
			Logs.info(getClass(), "clicked on first article");
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Cricket Next First Article", e);
		}
	}
}

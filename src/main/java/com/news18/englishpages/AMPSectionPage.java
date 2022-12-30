package com.news18.englishpages;

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
 *This class contain WebElements and their Business logics for  Section
 */
public class AMPSectionPage {
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;
	public AMPSectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* Section Links Present on the LIne One Section Of News18 Home Page*/
	@FindBy(xpath = "(//div[contains(@class,'topNavContainer')]//li[contains(@class,'top_nav')]/a[not(contains(text(),'Home')) and not(contains(text(),'Photos'))])[2]")
	private WebElement sectionLnks;

	/* India Section  Article Link */
	@FindBy(xpath = "//div[contains(@class,'top_story_right')]//a")
	private List<WebElement> articleLnks;

	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate and click on First Article of English Any Section Page 
	 */
	public void clickOnFirstArticleSectionPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(sectionLnks);
			webDriverActions.click(articleLnks.get(0));
		}
		catch(NoSuchElementException e)
		{
			Logs.error(getClass(), "Exception in Section page Link");
			Logs.error(getClass(), "Exception in Section page Article Link");
		}
		catch(IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Section page Article Link");
		}
	}
}

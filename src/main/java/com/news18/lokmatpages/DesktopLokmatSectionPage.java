package com.news18.lokmatpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author SanjeebKumarPati
 *This class contain WebElements and their Business logics of Lokmat Amp section Pages
 */
public class DesktopLokmatSectionPage extends WebDriverActions {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();

	public WebDriver driver;
	
	public DesktopLokmatSectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* Entertainment Section First Article Link */
	@FindBy(xpath = "(//div[contains(@class,'container')]//ul[contains(@class,'nav_bar')]//a)[2]")
	private WebElement sectionLnk;

	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate and click on First Article of Lokmat Section Page 
	 */
	public void clickOnFirstArticleSectionPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(sectionLnk);
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First Article of Section page",e);
		}
	}
}

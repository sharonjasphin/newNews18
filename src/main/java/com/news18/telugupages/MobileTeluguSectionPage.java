package com.news18.telugupages;

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
 * @author AbhishekRaj
 *
 */
public class MobileTeluguSectionPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public  MobileTeluguSectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Homepage First article Link  is present below the Line Two Menu Bar in RHS*/
	@FindBy(xpath ="//div[contains(@class,'lstintro')]//a")
	private List<WebElement> sectionArticleLnk ;

	/**
	 * @author AbhishekRaj
	 * This method is used to click on First article link
	 */
	public void clickPhotogalleryFirstArticle() {
		try {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		webDriverActions.clickJS(sectionArticleLnk.get(0));
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in Section page Article Link ", e);
		}
	}


}




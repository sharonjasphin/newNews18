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


/**
 * @author SanjeebKumarPati
 *This class contain WebElements and their Business logics of Lokmat Amp Videos Pages
 */
public class DesktopLokmatVideosPage extends WebDriverActions {
	
	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	
	public DesktopLokmatVideosPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* Entertainment Section First Article Link */
	@FindBy(xpath = "//div[contains(@class,'blog-left-img')]/ul/li/a")
	private List<WebElement> videosFirstArticleLnk;
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate and click on First Article of lokmat India Page 
	 */
	public void clickOnFirstVideoArticle() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(videosFirstArticleLnk.get(0));
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in First Article of Videos Page",e);
		}
		webDriverActions.switchToNewWindow();
	}
}


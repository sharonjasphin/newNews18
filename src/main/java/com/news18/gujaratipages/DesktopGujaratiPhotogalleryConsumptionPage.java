package com.news18.gujaratipages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Abhishek
 *This Class Contains elements and business logics for Assam Desktop Photogallery Consumption Page
 */
public class DesktopGujaratiPhotogalleryConsumptionPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public  DesktopGujaratiPhotogalleryConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Homepage First article Link  is present below the LineTwo Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@class,'pht-tp')]/ul/li/a | //div[contains(@class,'blog-list')]//a")
	private List<WebElement> photogalleryArticleLnk;

	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="//div[contains(@class,'artcl-share fright')]//a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'artcl-share fright')]")
	private WebElement allShareIcons;


	public List<WebElement> getSocialShareIconsLnk() {
		return socialShareIconsLnk;
	}

	public WebElement getAllShareIcons() {
		return allShareIcons;
	}


	/**
	 * @author Abhishek
	 * This method is used to click on First article link
	 */
	public void clickPhotogalleryFirstArticle() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(5000);
			webDriverActions.waitForAllElementsVisible(photogalleryArticleLnk, GlobalVariables.sec30);
			webDriverActions.clickJS(photogalleryArticleLnk.get(0));
		}
		catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Photo Section First Article", e);
		}
	}

}

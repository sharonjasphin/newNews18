package com.news18.hindipages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.GenericUtility;
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Abhishek
 *This Class Contains elements and business logics for Assam Desktop Photogallery Consumption Page
 */
public class DesktopHindiPhotoGalleryConsumptionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();

	public WebDriver driver;
	public DesktopHindiPhotoGalleryConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Homepage First article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//ul[contains(@class,'pht-tprgt')]//h2//a")
	private List<WebElement> photogalleryArticleLnk ;

	/*Desktop_LiveBlogPage Social share Links*/
	@FindBy(xpath = "(//div[contains(@class,'-share')])[1]/a | //div/ul[contains(@class,'-share')]//a")
	private List<WebElement> socialShareIconsLnks;

	/*All share icons division*/
	@FindBy(xpath = "(//div[contains(@class,'-share')])[1] | //div/ul[contains(@class,'-share')]")
	private WebElement allShareIcons;

	public List<WebElement> getSocialShareIconsLnks() {
		return socialShareIconsLnks;
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
			webDriverActions.click(photogalleryArticleLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Photogallery Article Link ", e);
		}
	}
}

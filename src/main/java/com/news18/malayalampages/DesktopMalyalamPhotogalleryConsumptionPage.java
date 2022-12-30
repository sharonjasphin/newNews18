package com.news18.malayalampages;

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
 *This Class Contains elements and business logics for Kannada Desktop Photogallery Consumption Page
 */
public class DesktopMalyalamPhotogalleryConsumptionPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopMalyalamPhotogalleryConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Homepage First article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//ul[contains(@class,'pht-tprgt')]//h2/a")
	private List<WebElement> photogalleryArticleLnk ;

	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="//div[contains(@class,'pht-artcl-share fright')]//a | //ul[contains(@class,'newbyeline-share')]//a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'pht-artcl-share fright')] | //ul[contains(@class,'newbyeline-share')]")
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
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForSecond(5000);
		try {
			webDriverActions.waitForAllElementsVisible(photogalleryArticleLnk, GlobalVariables.sec30);
			webDriverActions.waitForSecond(3000);
			webDriverActions.clickJS(photogalleryArticleLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First Article  of Photos gallery Page",e);
		}

	}
}

package com.news18.kannadapages;

import java.util.ArrayList;
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
 * @author Abhishek
 *This Class Contains elements and business logics for Kannada Desktop Photogallery Consumption Page
 */
public class DesktopKannadaPhotogalleryConsumptionPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopKannadaPhotogalleryConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Homepage First article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@class,'pht-tp')]//h2//a")
	private List<WebElement> photogalleryArticleLnk ;

	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="//div[contains(@class,'pht-artcl-share fright')]//a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'pht-artcl-share fright')]")
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
		ArrayList<String> list = new ArrayList<String>();

		try {
			webDriverActions.waitForPageToLoad();
			for (int i = 0; i < photogalleryArticleLnk.size(); i++)
			{
				String article = webDriverActions.getAttribute("href", photogalleryArticleLnk.get(i));
				list.add(article);
				Logs.info(getClass(), list.get(i));
			}
			webDriverActions.navigateToUrl(list.get(0));
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in First Article in Photo Section Page ",e);
		}
	}
}

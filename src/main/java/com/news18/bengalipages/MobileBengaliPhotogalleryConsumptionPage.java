package com.news18.bengalipages;

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
 * @author Abhishek
 *
 */
public class MobileBengaliPhotogalleryConsumptionPage {


	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public  MobileBengaliPhotogalleryConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Homepage First article Link  is present below the Line Two Menu Bar in RHS*/
	@FindBy(xpath ="(//div[contains(@class,'pdngsxtn')]//ul/li/a)[1]")
	private WebElement photogalleryArticleLink ;

	/*Desktop_LiveBlogPage Social share Links*/
	@FindBy(xpath = "//div[contains(@class,'share clearfix')]//a")
	private List<WebElement> socialShareIconsLnks;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'share clearfix')]")
	private WebElement allShareIcon;
	
	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="(//div[contains(@class,'share-icon')])/a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'share-icon')]")
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
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(5000);
		try {
			webDriverActions.clickJS(photogalleryArticleLink);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in PhotoGallery First Article Link", e);
		}
	}
}

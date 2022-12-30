package com.news18.hindipages;

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
 *
 */
public class MobileHindiPhotoGalleryConsumptionPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public MobileHindiPhotoGalleryConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Homepage First article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@class,'wapper')]//section[contains(@class,'photo_section_b')]//ul//li//a//img")
	private List<WebElement> photogalleryArticleLnk ;

	/*Desktop_LiveBlogPage Social share Links*/
	@FindBy(xpath = "//div[contains(@class,'share clearfix')]//a")
	private List<WebElement> socialShareIconsLnks;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'share clearfix')]")
	private WebElement allShareIcon;

	/*Homepage First article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@class,'pdng')]")
	private WebElement photogalleryArticleDiv ;
	
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
	 * @author VipinKumarGawande
	 * This method is used to click on First article link in photogallery consumptionpage
	 */
	public void clickPhotogalleryFirstArticle() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForSecond(5000);
		try {
			webDriverActions.continuousScrollTillElement(photogalleryArticleDiv, GlobalVariables.sec3);
			webDriverActions.clickJS(photogalleryArticleLnk.get(0));
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in PhotoGallery Article Link ", e);
		}
	}

}




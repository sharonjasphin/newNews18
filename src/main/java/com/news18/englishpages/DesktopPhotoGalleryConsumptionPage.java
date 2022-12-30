package com.news18.englishpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Abhishek raj
 * This class contains WebElements and BusinessLogic of Desktop Photo Gallery Consumption Page 
 */

public class DesktopPhotoGalleryConsumptionPage {
	WebDriverActions webDriverActions = new WebDriverActions();

	public WebDriver driver;
	public DesktopPhotoGalleryConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/* Desktop_PhotoGalleryConsumption_Page List ofphotoGalleryFirstArticle*/
	@FindBy(xpath = "//a[text()='Photogalleries']//ancestor::h2/following-sibling::div[@class='pnv-gallery']//li[contains(@class,'slick-active')]//h3/a[not(text()='Cricketnext')]")
	private List<WebElement> photoGalleryFirstArticle;

	/* Desktop_PhotoGalleryConsumption_Page List of breadCrumLnk*/
	@FindBy(xpath = "//div[contains(@class,'bre')]//a//span")
	private List<WebElement> breadCrumLnk;

	/* Desktop_PhotoGalleryConsumption_Page fbShareIcon */
	@FindBy(xpath = "//div[contains(@class,'jsx-949867167 pht')]//a)[1]")
	private WebElement fbShareIcon;

	/* Desktop_PhotoGalleryConsumption_Page twitterIcon */
	@FindBy(xpath =	"//div[contains(@class,'jsx-949867167 pht')]//a)[3]")
	private WebElement twitterIcon;

	/* Desktop_PhotoGalleryConsumption_Page whatsappIcon */
	@FindBy(xpath =	"//div[contains(@class,'jsx-949867167 pht')]//a)[4]")
	private WebElement whatsappIcon;

	/* Desktop_PhotoGalleryConsumption_Page topGalleries */
	@FindBy(xpath =	"//h2[contains(@class,'photo')]")
	private WebElement topGalleries;

	/* Desktop_PhotoGalleryConsumption_Page List of rhsTopGalleriesList*/
	@FindBy(xpath = "//div[contains(@class,'jsx-1945834281 photogellary_widget')]//ul//li")
	private List<WebElement> rhsTopGalleriesList;

	/* Desktop_PhotoGalleryConsumption_Page List of htmlTag in browser source code page */
	@FindBy(xpath = "//span[@class='html-tag']")
	private List<WebElement> htmlTag;

	/* Desktop_PhotoGalleryConsumption_Page titleTag in browser source code page  */
	@FindBy(xpath =	"//*[contains(text(),'<title')]")
	private WebElement tileTag;

	/* Desktop_PhotoGalleryConsumption_Page titleText in browser source code page  */
	@FindBy(xpath =	"//*[contains(text(),'<titl')]/parent::td")
	private WebElement tileText;

	/* Desktop_PhotoGalleryConsumption_Page List of keywordsTag in browser source code page */
	@FindBy(xpath = "//span[text()='keywords']/following-sibling::span[@class='html-attribute-value']")
	private List<WebElement> keywordsTag;

	/* Desktop_PhotoGalleryConsumption_Page ogImage in browser source code page  */
	@FindBy(xpath =	"//span[text()='og:image']/following-sibling::span[@class='html-attribute-value']")
	private WebElement ogImage;	

	/* Desktop_PhotoGalleryConsumption_Page ampHtmlTag in browser source code page */
	@FindBy(xpath =	"//span[text()='amphtml']/following-sibling::a[contains(@class,'html-attribute-value')]")
	private WebElement ampHtmlTag;

	/* Desktop_PhotoGalleryConsumption_Page List of outbrain*/
	@FindBy(xpath = "//a[normalize-space()='Recommended by']")
	private List<WebElement> outbrain;

	/* List of All social Icons present in PhotoGallery Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'photo_section')]/ul")
	private List<WebElement> allSocialIcons;

	/* List of All social Icons like 1= fb 2 = getpocket 3 = twitter 4 = whatsapp*/
	@FindBy(xpath = "//div[contains(@class,'photo_section')][1]/ul/li/a")
	private List<WebElement> socialIconsLnk;

	/*Outbrain Txt  is present in the above the Footer and Rhs of Promoted Content*/
	@FindBy(xpath ="//div[contains(@class,'ob_what ob_what_resp')]//span[@class='ob_logo']")
	private WebElement outbrainTxt;

	/* List of Images present in photo page */
	@FindBy(xpath="//div[contains(@class,'heading_title')]/following-sibling::ul/li//img")
	private List<WebElement> listImg;

	/*List of down arrow button present on the image in photo article consumption page */
	@FindBy(xpath = "//a[contains(@class,'arrow_bottom')]")
	private List<WebElement> downArrowLnk;

	/*List of Up arrow button present on the image in photo article consumption page */
	@FindBy(xpath = "//a[contains(@class,'arrow_top')]")
	private List<WebElement> upArrowLnk;

	/* Article in photogallery page*/
	@FindBy(xpath = "//div//ul[contains(@class,'photoGalleryList')]//li//h3//a[contains(@href,'photo')]")
	private List<WebElement> articleLnks;

	/* First old Article in photogallery page*/
	@FindBy(xpath = "(//div//ul[contains(@class,'photoGalleryList')]//li//h3//a[not(contains(@href,'photonews')) and not(contains(@href,'/cricketnext/'))])[1]")
	private WebElement oldArticleLnks;

	/* List of Promoted Content Ads in RHS of PhotoGallery Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'OUTBRAIN')]/div//ul/li/a/span[contains(@class,'text')]")
	private List<WebElement> promotedContentRHSLnk;

	/* List of Promoted Content Ads in body of PhotoGallery Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'OUTBRAIN')]//div[contains(@class,'items-container')]/div/a/section")
	private List<WebElement> promotedContentBodyLnk;

	/*Outbrain Logo Links in body of PhotoGallery Consumption Page*/
	@FindBy(xpath ="//div[contains(@class,'grid-layout')]/div/div/a/span[contains(@class,'logo')]" )
	private WebElement outbrainLogoLnkBody;

	/*Outbrain Logo Links in RHS of PhotoGallery Consumption Page*/
	@FindBy(xpath ="(//div[contains(@class,'ob_what')])[2]/a/span" )
	private WebElement outbrainLogoLnkRHS;

	/*Desktop_LiveBlogPage Social share Links*/
	@FindBy(xpath = "(//div[contains(@class,'pht-artcl-shr2')])[1]/a")
	private List<WebElement> socialShareIconsLnks;

	/*All share icons division*/
	@FindBy(xpath = "(//div[contains(@class,'pht-artcl-shr2')])[1]")
	private WebElement allShareIcons;

	public List<WebElement> getSocialShareIconsLnks() {
		return socialShareIconsLnks;
	}

	public WebElement getAllShareIcons() {
		return allShareIcons;
	}

	/**
	 * @author Abhishek raj
	 * This method is used to click on First photo article link
	 */
	public void navigateToOldPhotogalleryFirstArticle() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(5000);
			webDriverActions.click(oldArticleLnks);
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Old PhotoGallery Article", e);
		}
	}

	/**
	 * @author Abhishek raj
	 * This method is used to click on First photo article link
	 */
	public void navigateToPhotogalleryFirstArticle() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(5000);
			webDriverActions.waitForAllElementsVisible(articleLnks, GlobalVariables.sec30);
			webDriverActions.click(articleLnks.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Photo Section First Article", e);
		}
	}

	/**
	 * This method is used to click on the first article in the photogallery section
	 */
	public void clickOnFirstArt() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(listImg.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Photo Section First Article", e);
		}
	}
}
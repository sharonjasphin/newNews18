package com.news18.englishpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Abhishek
 *  This class contains WebElements and BusinessLogic of Mobile PhotoGallery Consumption Page 
 */

public class MobilePhotoGalleryConsumptionPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	public MobilePhotoGalleryConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* Mobile_PhotoGalleryConsumption_Page photogalleriesLink */
	@FindBy(xpath = "//a[text()='Photogalleries']")
	private WebElement photogalleriesLnk;

	/* Mobile_PhotoGalleryConsumption_Page photogalleriesArticleLink */
	@FindBy(xpath = "//span[text()='Photogalleries']//ancestor::h2/following-sibling::div[@class='ofhidden']//li[@class='glide__slide--active']/a[2]")
	private WebElement photogalleriesArticleLnk;

	/* Mobile_PhotoGalleryConsumption_Page photogalleriesArticleImgLink */
	@FindBy(xpath = "//span[text()='Photogalleries']//ancestor::h2/following-sibling::div[@class='ofhidden']//li[not(contains(@class,'glide__slide--clone'))]//a[not(contains(@href,'cricketnext'))][1]")
	private WebElement photogalleriesArticleImgLnk;

	/* Mobile_PhotoGalleryConsumption_Page socialShareIcon */
	@FindBy(xpath = "//div[@class='jsx-1927145440 pht-artcl-shr fright']")
	private WebElement socialShareIcon;

	/* Mobile_LiveBlogPage List of footerLnk*/
	@FindBy(xpath = "//span[@class='ftr_title']/span")
	private List<WebElement> footerLnk ;

	/* Mobile_PhotoGalleryConsumption_Page headerLnk */
	@FindBy(xpath = "//img[@title='News18 English']")
	private WebElement headerLnk;

	/* Mobile_PhotoGalleryConsumption_Page firstImg  */
	@FindBy(xpath = "(//div[@class='photo-gallery vspacer30 prelative photo-gallery-slider glide--ltr glide--carousel glide--swipeable']//img)[4]")
	private WebElement firstImg;

	/* Mobile_LiveBlogPage List of imageList*/
	@FindBy(xpath = "//div[@class='jsx-1927145440 glrbox']//img")
	private List<WebElement> imageList ;

	/* Mobile_PhotoGalleryConsumption_Page footerContainer  */
	@FindBy(xpath = "//div[@class='ftr_container']")
	private WebElement footerContainer;

	/* Mobile_PhotoGalleryConsumption_Page SocialFirstImage  */
	@FindBy(xpath = "(//div[contains(@class,'glrbox')])[1]")
	private WebElement SocialFirstImage;

	@FindBy(xpath = "(//div[@class='jsx-1927145440 pht-artcl-shr fright'])[1]//a[1]")
	private WebElement fbShareIcon;

	/* Mobile_PhotoGalleryConsumption_Page getPocketIcon  */
	@FindBy(xpath = "(//div[@class='jsx-1927145440 pht-artcl-shr fright'])[1]//a[2]")
	private WebElement getPocketIcon;

	/* Mobile_PhotoGalleryConsumption_Page twitterIcon  */
	@FindBy(xpath = "(//div[@class='jsx-1927145440 pht-artcl-shr fright'])[1]//a[3]")
	private WebElement twitterIcon;

	/* Mobile_PhotoGalleryConsumption_Page whatsappIcon  */
	@FindBy(xpath = "(//div[@class='jsx-1927145440 pht-artcl-shr fright'])[1]//a[4]")
	private WebElement whatsappIcon;

	/* Mobile_LiveBlogPage List of shareIconOfImage*/
	@FindBy(xpath = "//div[contains(@class,'glrbox')][1]/figure/a/span[contains(@class,'phtsprt2 shr')]")
	private List<WebElement> shareIconOfImage ;

	/*List of Top Story Articles in PhotoGallery page */
	@FindBy(xpath = "//div[contains(@class,'story_title')]//h3//a[not (contains(@href,'photonews'))]")
	private List<WebElement> photoGalleryArticleLnkLst;

	/*Desktop_LiveBlogPage Social share Links*/
	@FindBy(xpath = "//div[contains(@class,'PGsocialBox ')]//a")
	private List<WebElement> socialShareIconsLnks;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'PGsocialBox ')]")
	private WebElement allShareIcons;

	/*List of Top Story Articles in PhotoGallery page */
	@FindBy(xpath = "//ul[contains(@class,'top_story_list')]//h3/a[contains(@href,'photonews')]")
	private List<WebElement> newPhotoGalleryArticleLnkLst;
	
	public List<WebElement> getSocialShareIconsLnk() {
		return socialShareIconsLnks;
	}

	public WebElement getAllShareIcons() {
		return allShareIcons;
	}

	/**
	 * @author AnupamGupta
	 * This method is used to Navigate to First Article of PhotoGallery 
	 */
	public void navigateToPhotogalleryFirstArticle()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(5000);
			webDriverActions.mouseHover(photoGalleryArticleLnkLst.get(0));
			webDriverActions.highlightElement(photoGalleryArticleLnkLst.get(0));
			webDriverActions.clickJS(photoGalleryArticleLnkLst.get(0));// Click on First PhotoGallery Article
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in PhotoGallery Article Link", e);
		}
	}

	/**
	 * @author Anupam gupta
	 * This method is used to Navigate to First Article of new PhotoGallery 
	 */
	public void navigateToNewPhotogalleryFirstArticle()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(5000);
			webDriverActions.click(newPhotoGalleryArticleLnkLst.get(0));	// Click on First PhotoGallery Article
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in New PhotoGallery Article Link", e);
		} 	
	}
}

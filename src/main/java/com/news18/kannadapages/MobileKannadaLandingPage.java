package com.news18.kannadapages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.asserts.SoftAssert;

import com.news18.commonpages.HomePageLinksValidation;
import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;


/**
 * @author DanishR
 * This page contains elements and business logic for Kannada mobile home page
 *
 */
public class MobileKannadaLandingPage {
	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	SoftAssert softAssert = new SoftAssert();

	public MobileKannadaLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*photo section Headline present in the homwpage*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//h2//a[contains(@href,'web')]")
	private WebElement webHeadline;

	/*photoArticle Links present at the Rhs*/
	@FindBy(xpath ="//div[contains(@id,'clkbuttonpradesh')]//ul[contains(@class,'photogallery')]//li//a")
	private List<WebElement> photoArticleLnk;

	/*LiveTv video player displaying in RHS of Savings and Investment page*/
	@FindBy(xpath = "//div[@id='playerContainer']")
	private WebElement liveTvPlayer;

	/*Skip ad button present in live Tv*/
	@FindBy(xpath = "//div//button[contains(@class,'videoAdUiSkipButton videoAdUiAction')]")
	private WebElement skipAd;

	/*Video Ad element present in Live Tv*/
	@FindBy(xpath = "//div[@id='playerContainer']//div[contains(@id,'content_video_ima-ad-container')]")
	private WebElement videoAds;

	/*Ad iframe present in Live Tv Section*/
	@FindBy(xpath = "//iframe[contains(@id,'goog_')]")
	private WebElement videoAdsIframe;

	/*Pause and play button displaying in below of video player*/
	@FindBy(xpath = "//button[@class='vjs-play-control vjs-control vjs-button vjs-playing']//span[.='Pause']")
	private WebElement pauseBtn;

	/*Play button displaying in below of video player*/
	@FindBy(xpath = "//button[@class='vjs-play-control vjs-control vjs-button vjs-paused']//span[.='Play']")
	private WebElement playBtn;

	/*Mute button displaying in below of video player*/
	@FindBy(xpath = "//button[@class='vjs-mute-control vjs-control vjs-button vjs-vol-0']//span[.='Unmute']")
	private WebElement unmuteBtn;

	/*Unmute button displaying in below of video player*/
	@FindBy(xpath = "//button[@class='vjs-mute-control vjs-control vjs-button vjs-vol-3']//span[.='Mute']")
	private WebElement muteBtn;

	/*share Button displaying in below of video player*/
	@FindBy(xpath = "//div//button[contains(@class,'vjs-control vjs-button vjs-icon-share')]")
	private WebElement shareBtn;

	/*Maximum Button displaying in below of video player*/
	@FindBy(xpath = "//div//button[contains(@class,'vjs-fullscreen-control vjs-control vjs-button')]")
	private WebElement maximizeBtn;

	/*Minimum Button displaying in below of video player*/
	@FindBy(xpath = "//div//button[contains(@class,'vjs-fullscreen-control vjs-control vjs-button')]")
	private WebElement minimizeBtn;

	@FindBy(xpath = "//div[contains(text(),'Advertisement')]")
	private WebElement liveTvAds;

	/*Close Button present in Live TV section*/
	@FindBy(xpath = "//div[@class='vjs-close-btn vjs-share-close']")
	private WebElement shareCloseBtn;

	/*Element present in action bar*/
	@FindBy(xpath = "//video[contains(@id,'content_video_html5_api')]")
	private WebElement mouseoverActionBar;

	/*LiveTv Headline*/
	@FindBy(xpath = "//div[contains(@class,'justify-space-betwwen')]//h2//a[contains(@href,'livetv')]")
	private WebElement liveTvHeadline;

	/*Homepage List of article Link for news18 Kannada Page*/
	@FindBy(xpath ="//div[contains(@class,'newstrendvideo-box')]//li/a[not(contains(@href,'live')) and not(contains(@href,'cricket'))]")
	private List<WebElement> homePageArticleLnk;

	/*photo section Present in Line one navigation bar in Kannada HomePage */
	@FindBy(xpath="//div[contains(@class,'wapper')]//ul//li//a[.='ಫೋಟೋ']")
	private WebElement photoSectionLnk;

	/*Live blog present in the kannada landing page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]//li/a[contains(@href,'live-update')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*video section present of Kannada page*/
	@FindBy(xpath ="//div[contains(@class,' top_links_cont')]//a[text()='ವಿಡಿಯೋ'] ")
	private List<WebElement> homePageVideoSection;

	/*Sports link present in kannada HomePage  */
	@FindBy(xpath ="//div[contains(@class,'top_links_cont')]//a[@href='/sports/']")
	private WebElement sportsLnk;

	/*Section link present at line one menu */
	@FindBy(xpath ="//div[contains(@class,'top_links_cont')]//a[not(contains(@href,'paani/')) and not(contains(@href,'/web')) and not(contains(@href,'/state/')) and not(contains(@href,'live')) and not(@href='/')]")
	private List<WebElement> sectionLnks;

	/*photo section Headline present in the homwpage*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//h2//a[contains(@href,'photogallery')]")
	private WebElement photoSectionHeadline;

	//=======================================Sanjeeb's Elements==================================

	/*social Share Section Present on Mobile Landing Page At footer section*/
	@FindBy(xpath ="//div[contains(@class,'social_net')]")
	private WebElement socialShareSection;

	/*social Share Section Present on Mobile Landing Page At footer section*/
	@FindBy(xpath ="//div[contains(@class,'social_net')]//a")
	private List<WebElement> socialShareSectionEle;

	/*Header Text Present After Clicking On FaceBook Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="//div[contains(@class,'b0ur3jhr')]")
	private WebElement faceBookTxt;

	/*PlayStore Header Text Present At footer of Mobile English Landing Page*/
	@FindBy(xpath ="(//header[contains(@role,'banner')])")
	private WebElement playStoreHeaderTxt;

	/*appleStore Header Text Icon Present At footer of Mobile English Landing Page*/
	@FindBy(xpath ="(//div[contains(@class,'ac-gn-content')])")
	private WebElement appleStoreHeaderTxt;

	/*Header Text Present After Clicking On Skype Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="//div[contains(@id,'react-root')]")
	private WebElement twitterTxt;

	/*Header Text Present After Clicking On Instagram Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="//img[contains(@alt,'Instagram')] | //main[contains(@role,'main')]")
	private WebElement instaTxt;

	/*Header Text Present After Clicking On Youtube Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="//div[@id='channel-header'] | //div[contains(@class,'header-banner')]")
	private WebElement youtubeTxt;

	/*Header Text Present After Clicking On JIo Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="(//div[@class='container'])[1]")
	private WebElement jioTxt;

	/*social Share Section Present on Mobile Landing Page At footer section*/
	@FindBy(xpath ="//ul[contains(@class,'btnvav')]")
	private WebElement footerStickySection;

	/*social Share Section Present on Mobile Landing Page At footer section*/
	@FindBy(xpath ="//ul[contains(@class,'btnvav')]//a")
	private List<WebElement> footerStickySectionEle;

	/*Header Text */
	@FindBy(xpath="(//div[contains(@class,'mobile_nav_icon') or contains(@class,'fl')])[1]")
	private WebElement headerTextLnk;

	/*Hambergur icon present in Gujarati HomePage  */
	@FindBy(xpath ="//div[contains(@class,'mobile_nav_icon')]//a[contains(@href,'#')]")
	private WebElement hambergerIcon;

	/*Bhasha Chune(Change Language) section herader present at Header Hamburger Menu*/
	@FindBy(xpath ="//div[contains(@class,'chs-tplng')]//ul//li//a[contains(@href,'#')]")
	private WebElement hamburgerLangSection;  

	/*Hamburger Languages list*/
	@FindBy(xpath ="//ul[contains(@class,'lng-subnav lng-scrlsbnv')]//li//a[contains(@href,'news18')]")
	private List<WebElement> hamburgerLangLnks; 

	/*Header logo present in Gujarati HomePage  */
	@FindBy(xpath ="//div[contains(@class,'news_page')] | //div[contains(@class,'brade_crum')] | //div[contains(@class,'CN-PageWrap')] | //div[contains(@class,'story_container')] | //div[contains(@class,'videosSliderWrapper')] | //div[contains(@class,'photoGalleryWrapper')] | //div[contains(@class,'header')] | //div[contains(@class,'row')]")
	private WebElement headerSection;

	/*Hamburger Section list*/
	@FindBy(xpath ="//ul[contains(@class,'adclsnavg')]//li/a")
	private List<WebElement> hamburgerSectionList;

	/*BreadCrumb Present on Article Header*/
	@FindBy(xpath="//div[contains(@class,'brda') or contains(@class,'bread') or contains(@class,'brd') or contains(@class,'brad')] | //ul[contains(@class,'brdcrm') or contains(@class,'bread')]  | //h2[contains(@class,'brd')] | //h1[contains(@class,'brd')]//div[contains(@class,'brda') or contains(@class,'bread') or contains(@class,'brd')] | //ul[contains(@class,'brdcrm') or contains(@class,'bread')]  | //h2[contains(@class,'brd')] | //h1[contains(@class,'brd')]//div[contains(@class,'brda') or contains(@class,'bread') or contains(@class,'brd')] | //ul[contains(@class,'brdcrm') or contains(@class,'bread')]  | //h2[contains(@class,'brd')] | //h1[contains(@class,'brd')]")
	private WebElement headerBreadcrumbLnk;

	/*Netrasuraksha text*/
	@FindBy(xpath="//div[contains(@class,'launch_info')]")
	private WebElement netrasurakshaText;


	//------------------------------Vipin's Webelement -------------------------------------//


	/* Article Header Text in Article Consumption Page */
	@FindBy(xpath ="//h1[contains(@class,'article_heading') or contains(@class,'live_blog') or contains(@class,'gallery_tilte')] | //div[contains(@class,'art') or contains(@class,'TstoryHead')]/h1" )
	private WebElement articleHeaderTxt;

	/* Article BreadCrumb Division */
	@FindBy(xpath = "//div[contains(@class,'brade')] | //div[contains(@class,'brd')]  | //ul[contains(@class, 'bread')]")
	private WebElement articleBreadCrumbDiv;

	/*List of Priority Panel Article Links in Homepage*/ 
	@FindBy(xpath = "//div[contains(@class,'container')]/div[contains(@class,'newstrend')]/ul//a")
	private List<WebElement> priorityPanelArticleLnk;

	/*List of Priority Panel Article Links in Homepage*/ 
	@FindBy(xpath = "//div[contains(@class,'container')]/div[contains(@class,'newstrend')]/ul//a//img[@data-src]")
	private List<WebElement> priorityPanelImgLnk;

	/*Priority Panel Section Related News Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'container')]/div[contains(@class,'newstrend')]/a")
	private WebElement priortiyPanelRelatedNewsLnk;

	/*List of Entertainment Article in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'globalhd')]//a[contains(.,'ಮನರಂಜನೆ')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a")
	private List<WebElement> entertainmentArticleLnk;

	/*List of Entertainment Image in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'globalhd')]//a[contains(.,'ಮನರಂಜನೆ')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a//img")
	private List<WebElement> entertainmentImgLnk;

	/*Entertainment Section Read More Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'globalhd')]//a[contains(.,'ಮನರಂಜನೆ')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement entertainmentReadMoreLnk;

	/*Entertainment Section Title Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'globalhd')]//a[contains(.,'ಮನರಂಜನೆ')]")
	private WebElement entertainmentTitleLnk;

	/* Webstories Section  Title Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]//h2/a")
	private WebElement webstoriesTitleLnk;

	/* List of Webstrories Article Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories') and not (contains(@class,'news_story'))]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'slick-slide') and not (contains(@class,'slick-cloned'))]//a")
	private List<WebElement> webstoriesArticleLnk;

	/* List of Webstrories Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories') and not (contains(@class,'news_story'))]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'slick-slide') and not (contains(@class,'slick-cloned'))]//a//img")
	private List<WebElement> webstoriesImgLnk;

	/* Active Webstories Article Link in Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories') and not (contains(@class,'news_story'))]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'current') and not (contains(@class,'slick-cloned'))]//a")
	private WebElement activeWebstoriesArticleLnk;

	/* Active Webstories Image Link in Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories') and not (contains(@class,'news_story'))]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'current') and not (contains(@class,'slick-cloned'))]//a//img")
	private WebElement activeWebstoriesImgLnk;

	/* Webstories Slider Button in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories') and not (contains(@class,'news_story'))]//ul[contains(@class,'slick-dots')]/li/button")
	private List<WebElement> webstoriesSliderBtn;

	/* WebStories Next Story Button after navigation of WebStories Article */
	@FindBy(xpath = "//div[contains(@class,'next-container')]")
	private WebElement nextWebStoryBtn;

	//-------------------Anupam*Webelement-------------

	//---------sport
	/* Sport section present in homepage */
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(.,'ಕ್ರೀಡೆ')]")
	private WebElement sportSectionLnk;

	/*Sport section Article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(.,'ಕ್ರೀಡೆ')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(.,'ಕ್ರೀಡೆ')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> sportSectionArticleLnk;

	/* Sport section Image present in homepage */
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(.,'ಕ್ರೀಡೆ')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> sportSectionImgLnk;

	/* Sport section ReadMore present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(.,'ಕ್ರೀಡೆ')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreSportSectionLnk;

	/*Breadcrumb present in sport article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement sportBreadcrumb;


	//---------lifestyle
	/* Lifestyle section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(.,'ಲೈಫ್ ಸ್ಟೈಲ್')]")
	private WebElement lifestyleSectionLnk;

	/* Lifestyle section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(.,'ಲೈಫ್ ಸ್ಟೈಲ್')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(.,'ಲೈಫ್ ಸ್ಟೈಲ್')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> lifestyleSectionArticleLnk;

	/* Lifestyle section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(.,'ಲೈಫ್ ಸ್ಟೈಲ್')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> lifestyleSectionImgLnk;

	/* Lifestyle section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(.,'ಲೈಫ್ ಸ್ಟೈಲ್')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreLifestyleSectionLnk;

	/*Breadcrumb present in Lifestyle article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement lifestyleBreadcrumb;


	//---------MobileAndTech
	/* MobileAndTech section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(.,'ಮೊಬೈಲ್- ಟೆಕ್')]")
	private WebElement mobileAndTechSectionLnk;

	/*MobileAndTech section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(.,'ಮೊಬೈಲ್- ಟೆಕ್')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(.,'ಮೊಬೈಲ್- ಟೆಕ್')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> mobileAndTechSectionArticleLnk;

	/*MobileAndTech section Image present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(.,'ಮೊಬೈಲ್- ಟೆಕ್')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> mobileAndTechSectionImgLnk;

	/*MobileAndTech section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(.,'ಮೊಬೈಲ್- ಟೆಕ್')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreMobileAndTechSectionLnk;

	/*Breadcrumb present in MobileAndTech article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement mobileAndTechBreadcrumb;

	//---------national-international
	/* national-international section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(.,'ದೇಶ-ವಿದೇಶ')]")
	private WebElement nationalInternationalSectionLnk;

	/*national-international section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(.,'ದೇಶ-ವಿದೇಶ')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(.,'ದೇಶ-ವಿದೇಶ')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> nationalInternationalArticleLnk;

	/*national-international section Image present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(.,'ದೇಶ-ವಿದೇಶ')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> nationalInternationalImgLnk;

	/*national-international section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(.,'ದೇಶ-ವಿದೇಶ')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreNationalInternationalLnk;

	/*national-international present in MobileAndTech article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement nationalInternationalBreadcrumb;

	//	****************************Danish***WebElement*******************************

	/*District Icon present on Home Page Header*/
	@FindBy(xpath="//div[contains(@id,'header')]//div[contains(text(),'District')]")
	private WebElement districtIcon;

	/*District Cities present inside District icon*/
	@FindBy(xpath="//div[contains(@class,'tpctlits')]//ul//li//a")
	private List<WebElement> districtIconCities;

	/*Header Logo Icon */
	@FindBy(xpath ="//div[contains(@class,'mobile')]//a[contains(@class,'logo')]")
	private WebElement headerLogo;

	/*Kannada Section City Links*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a//parent::h2//parent::div//following-sibling::ul//li//a")
	private List<WebElement> citiesLnks;

	/*Kannada Section City Article Links*/
	@FindBy(xpath="(//div[contains(@class,'bigstory')]//following-sibling::ul)[1]//li//a[contains(@href,'kannada')] | (//div[contains(@class,'bigstory')])[1]//a")
	private List<WebElement> citiesArticleLnks;

	/*Kannada Section Read More Link in Homeoage*/
	@FindBy(xpath = "(//div[contains(@class,'globalhd')]/parent::div/a)[1]")
	private WebElement KannadaSectionReadMoreLnk;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'crum') or contains(@class,'breadcum') or contains(@class,'brdc')]  | //ul[contains(@class, 'bread') or contains(@class,'brdc')]")
	private WebElement articleBreadcrumb;


	/**
	 * @author AbhishekRaj
	 * This method is used click on video section
	 */
	public void clickOnVideoSection() {
		try {
			webDriverActions.clickJS(homePageVideoSection.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Video Section Link in Home Page ",e);
		}
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to click on First Article of Kannada Home Page 
	 */
	public void clickOnFirstArticleKannadaHomePage() {
		try {
			webDriverActions.clickJS(homePageArticleLnk.get(0));
			Logs.info(getClass(), "clicked on first article");
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First Article in Home Page ",e);
		}
	}


	/**
	 * @author Anupam
	 * This method used to click on photos section of Kannada Homepage
	 */
	public void clickOnPhotoSection()
	{
		try {
			webDriverActions.click(photoSectionLnk);
			Logs.info(getClass(), "clicked on photo section");
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Photos Section Link in Home Page ",e);
		}
	}


	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of Kannada Home Page 
	 */
	public void clickOnFirstLiveBlogArticleKannadaHomePage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(1000);
			if(webDriverActions.isElementDisplayed(homePageLiveBlogArticleLnk.get(0)))
			{
				webDriverActions.clickJS(homePageLiveBlogArticleLnk.get(0));
			}
			else
			{
				Logs.error(getClass(), "Exception in Live blog in HomePage Link");
				throw new SkipException("Unable to locate Live Blog Article element possibly no Live Blog Present "+webDriverActions.getCurrentPageUrl());	
			}
		}
		catch(IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Live blog in HomePage Link");
			throw new SkipException("Unable to locate Live Blog Article element possibly no Live Blog Present "+webDriverActions.getCurrentPageUrl());
		}
	}

	/**
	 * @author Sanjeeb
	 * This method is used to click on the sports link of home page
	 */
	public void clickOnSportsLnk()
	{
		try {
			webDriverActions.clickJS(sportsLnk);
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Sports Link in Home Page ",e);
		}
	}

	/**
	 * @author AnupamGupta
	 * This method is used to click on First Section link present on line one section
	 */
	public void clickOnFirstSection(){
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(sectionLnks.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Section Link in Home Page ",e);
		}	
	}







	//=======================================Sanjeeb's Business Logics==================================

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Footer social share Section Present In Footer Part Of Mobile English Home Page.
	 */
	public void verifySocialSites()
	{
		webDriverActions.waitForPageToLoad();
		String pageTitle = webDriverActions.getPageTitle();
		webDriverActions.scrollToLast();
		webDriverActions.softMouseHover(socialShareSection);

		for(int i=0;i<socialShareSectionEle.size();i++)
		{
			webDriverActions.softScrollToElement(socialShareSectionEle.get(i));
			String actual = webDriverActions.getAttribute("href",socialShareSectionEle.get(i));
			Logs.info(getClass(), actual);
			String title = webDriverActions.getAttribute("target", socialShareSectionEle.get(i));
			webDriverActions.softClickJS(socialShareSectionEle.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				webDriverActions.waitForSecond(1000);
			}
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(socialShareSectionEle.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					webDriverActions.waitForSecond(1000);
				}
			}
			webDriverActions.waitForPageToLoad();
			String expected = webDriverActions.getCurrentPageUrl();
			//it takes the social share Url from property File
			ArrayList<String> list=new ArrayList<String>();
			list.add(fileUtility.readDataFromPropertyFile("facebook"));
			list.add(fileUtility.readDataFromPropertyFile("twitter"));
			list.add(fileUtility.readDataFromPropertyFile("instagram"));
			list.add(fileUtility.readDataFromPropertyFile("youtube"));
			list.add(fileUtility.readDataFromPropertyFile("jionews"));
			//it add the element of social share icons.
			ArrayList<WebElement> listEle=new ArrayList<WebElement>();
			listEle.add(faceBookTxt);
			listEle.add(twitterTxt);
			listEle.add(instaTxt);
			listEle.add(youtubeTxt);
			listEle.add(jioTxt);
			// it will iterate the list and validate 
			if(actual.contains("facebook") || actual.contains("twitter") || actual.contains("instagram") || actual.contains("youtube") || actual.contains("jionews"))
			{
				for(int j=0;j<list.size();j++)
				{
					if(actual.contains(list.get(j)))
					{
						softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j)), "Possibly Element Is Not Visible For This URL "+expected);
					}
				}
			}
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageTitle);
			}
			else
			{
				webDriverActions.navigateBack();
			}
			webDriverActions.scrollToLast();
			webDriverActions.softMouseHover(socialShareSection);
			softAssert.assertAll("Issues Found In Validating Footer Section Follow Us Section");
		}
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Footer Sticky Section Present In Footer Part Of Mobile Kannada Home Page.
	 */
	public void verifyStickySection()
	{
		webDriverActions.waitForPageToLoad();
		String pageURL = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollToLast();
		webDriverActions.softMouseHover(footerStickySection);
		//webDriverActions.continuousScrollTillElement(footerStickySection,20);
		for(int i=0;i<footerStickySectionEle.size();i++)
		{
			webDriverActions.softClickJS(footerStickySectionEle.get(i));
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateToUrl(pageURL);
				webDriverActions.continuousScrollTillElement(footerStickySection,20);
				webDriverActions.softClickJS(footerStickySectionEle.get(i));
			}
			String actual = webDriverActions.getCurrentPageUrl();
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTextLnk), "Possibly Element Is Not Visible For This URL "+actual);
			webDriverActions.navigateToUrl(pageURL);
		}
		softAssert.assertAll("Mobile Sticky Section Validation Failed");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Hamburger Language Sites on Mobile kannada landing Page.
	 */
	public void verifyHamburgerLanguageSection() 
	{
		webDriverActions.waitForPageToLoad();
		String pageURL = webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		webDriverActions.softMouseHover(hambergerIcon);
		webDriverActions.softClickJS(hambergerIcon);
		webDriverActions.softClickJS(hamburgerLangSection);
		for (int i=0;i<hamburgerLangLnks.size();i++)
		{
			webDriverActions.softScrollToElement(hamburgerLangLnks.get(i));
			String actual = webDriverActions.getAttribute("href",hamburgerLangLnks.get(i));
			Logs.info(getClass(), actual);
			String title = webDriverActions.getAttribute("target", hamburgerLangLnks.get(i));
			webDriverActions.softClickJS(hamburgerLangLnks.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				webDriverActions.waitForSecond(1000);
			}
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateToUrl(pageURL);
				webDriverActions.softMouseHover(hambergerIcon);
				webDriverActions.softClickJS(hambergerIcon);
				webDriverActions.softClickJS(hamburgerLangSection);
				webDriverActions.softClickJS(hamburgerLangLnks.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					webDriverActions.waitForSecond(1000);
				}
			}
			webDriverActions.waitForPageToLoad();
			String expected = webDriverActions.getCurrentPageUrl();
			webDriverActions.waitForElement(2000);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerSection), "Possibly Element Is Not Visible For This URL "+expected);
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageTitle);
			}
			else
			{
				webDriverActions.navigateToUrl(pageURL);
				webDriverActions.softMouseHover(hambergerIcon);
				webDriverActions.softClickJS(hambergerIcon);
				webDriverActions.softClickJS(hamburgerLangSection);
			}
		}
		softAssert.assertAll("Hamburger Menu Language Section Validation Failed ");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Hamburger Section Validation on Mobile kannada landing Page.
	 */
	public void verifyHamburgerSection() 
	{
		webDriverActions.waitForPageToLoad();
		String pageURL = webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		webDriverActions.softMouseHover(hambergerIcon);
		webDriverActions.softClickJS(hambergerIcon);
		for (int i=1;i<hamburgerSectionList.size();i++)
		{
			webDriverActions.softScrollToElement(hamburgerSectionList.get(i));
			String actual = webDriverActions.getAttribute("href",hamburgerSectionList.get(i));
			Logs.info(getClass(), actual);
			String title = webDriverActions.getAttribute("target", hamburgerSectionList.get(i));
			webDriverActions.softClickJS(hamburgerSectionList.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				webDriverActions.waitForSecond(1000);
			}
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateToUrl(pageURL);
				webDriverActions.softMouseHover(hambergerIcon);
				webDriverActions.softClickJS(hambergerIcon);
				webDriverActions.softClickJS(hamburgerSectionList.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					webDriverActions.waitForSecond(1000);
				}
			}
			webDriverActions.waitForPageToLoad();
			String expected = webDriverActions.getCurrentPageUrl();
			if(expected.contains("netrasuraksha"))
			{
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(netrasurakshaText), "Possibly Element Is Not Visible For This URL "+expected);	
			}
			else
			{	
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Possibly Element Is Not Visible For This URL "+expected);
			}
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageTitle);
			}
			else
			{
				webDriverActions.navigateToUrl(pageURL);
				webDriverActions.softMouseHover(hambergerIcon);
				webDriverActions.softClickJS(hambergerIcon);
			}
		}
		softAssert.assertAll("Hamburger Menu Section Validation Failed ");
	}


	// ------------------------- Vipin Business Logic  ---------------------------------------- //

	/**
	 * @param artList
	 * @param element
	 * @author VipinKumarGawande
	 * This method is used to Verify All The Widgets Article Text Navigation  
	 */
	public void verifyArticleNavigation(String serverType , List<WebElement> artList , WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		// // String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(artList, 15);
		if(artList.size()>0)
		{
			webDriverActions.softScrollToElement(artList.get(0));
			webDriverActions.softMouseHover(artList.get(0));
			webDriverActions.waitForSecond(1000);
			for(int i=0; i<artList.size() ;i++)
			{
				webDriverActions.waitForSecond(1000);
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				String actual =	webDriverActions.getAttribute("href", artList.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.waitForSecond(2000);
				webDriverActions.softClickJS(artList.get(i));
				webDriverActions.waitForSecond(2000);
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(artList.get(i));
					webDriverActions.softScrollToElement(artList.get(i));
					actual = webDriverActions.getAttribute("href", artList.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.waitForSecond(2000);
					webDriverActions.softClickJS(artList.get(i));
				}
				String currentPage =webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), currentPage);
				String expectedUrl = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.softHighlightElement(element);
				webDriverActions.waitForSecond(2000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in "+currentPage);;
				// // webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+artList.size());
		}

		softAssert.assertAll("Issues Found in Homepage Body");
	}


	/**
	 * @param imgList
	 * @param element
	 * @author VipinKumarGawande
	 * This method is used to Verify All The Widgets Image Navigation  
	 */
	public void verifyImageNavigation(String serverType , List<WebElement> imgList, WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(imgList, 15);
		if(imgList.size()>0)
		{
			webDriverActions.softScrollToElement(imgList.get(0));
			webDriverActions.softMouseHover(imgList.get(0));
			for(int i=0; i<imgList.size() ;i++)
			{
				webDriverActions.softMouseHover(imgList.get(i));
				webDriverActions.softScrollToElement(imgList.get(i));
				String actual =	webDriverActions.getAttribute("src", imgList.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softHighlightElement(imgList.get(i));
				webDriverActions.softClickJS(imgList.get(i));
				webDriverActions.waitForPageToLoad();
				webDriverActions.waitForSecond(2000);
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(imgList.get(i));
					webDriverActions.softScrollToElement(imgList.get(i));
					actual = webDriverActions.getAttribute("href", imgList.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.waitForSecond(2000);
					webDriverActions.softClickJS(imgList.get(i));
				}
				String currentPage =webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), currentPage);
				String expectedUrl = webDriverActions.getCurrentPageUrl();
				if(expectedUrl.equalsIgnoreCase(homeUrl))
				{
					softAssert.fail("Unable to Navigate in "+actual);
				}
				else if (serverType.equalsIgnoreCase("preProd")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.softHighlightElement(element);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) ,  "Unable to Display Element in "+currentPage);
				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+imgList.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @param moreLnk
	 * @param element
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Widget News Navigation
	 */
	public void verifyMoreNewsNavigation(String serverType , WebElement moreLnk , WebElement element) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(moreLnk, 15);
		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		String actual = webDriverActions.getAttribute("href", moreLnk);
		webDriverActions.softClickJS(moreLnk);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		webDriverActions.highlightElement(element);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in "+currentPage);
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyTitleNavigation(String serverType , WebElement element , WebElement breadcrumb)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(element, 20);
		webDriverActions.softScrollToElement(element);
		webDriverActions.softMouseHover(element);
		webDriverActions.softClickJS(element);
		webDriverActions.waitForPageToLoad();
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb), "Unable to Display Element in "+currentPage);
		softAssert.assertAll("Issue in Homepage Body ");
	}

	public void verifyPriorityPanelArticleNavigation(String serverType) {
		verifyArticleNavigation(serverType, priorityPanelArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyPriorityPanelImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, priorityPanelImgLnk, articleBreadCrumbDiv);
	}

	public void verifyPriorityPanelRelatedNewsNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, priortiyPanelRelatedNewsLnk, articleBreadCrumbDiv);
	}
	public void verifyEntertainmentArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, entertainmentArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyEntertainmentImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, entertainmentImgLnk, articleBreadCrumbDiv);
	}

	public void verifyEntertainmentReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, entertainmentReadMoreLnk, articleBreadCrumbDiv);
	}

	public void verifyEntertainmentTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, entertainmentTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyWebstoriesArticleNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String title = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillAllElement(webstoriesArticleLnk, 20);
		if(webstoriesArticleLnk.size()>0)
		{
			webDriverActions.softScrollToElement(webstoriesArticleLnk.get(0));
			webDriverActions.softMouseHover(webstoriesArticleLnk.get(0));
			webDriverActions.waitForSecond(1000);
			for(int i=0; i<webstoriesArticleLnk.size() ;i++)
			{
				webDriverActions.softClickJS(webstoriesSliderBtn.get(i));
				webDriverActions.softClickJS(activeWebstoriesArticleLnk);
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForSecond(1000);
				String currentPage =webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), currentPage);
				if (serverType.equalsIgnoreCase("preProd")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.waitForSecond(1000);
				webDriverActions.softHighlightElement(nextWebStoryBtn);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(nextWebStoryBtn) , "Unable to Display Element in "+currentPage);;
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(title);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+webstoriesArticleLnk.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyWebstoriesImageNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String title = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillAllElement(webstoriesImgLnk, 20);
		if(webstoriesImgLnk.size()>0)
		{
			webDriverActions.softScrollToElement(webstoriesImgLnk.get(0));
			webDriverActions.softMouseHover(webstoriesImgLnk.get(0));
			webDriverActions.waitForSecond(2000);
			for(int i=0; i<webstoriesImgLnk.size() ;i++)
			{
				webDriverActions.softClickJS(webstoriesSliderBtn.get(i));
				webDriverActions.softClickJS(activeWebstoriesImgLnk);
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForSecond(1000);
				String currentPage =webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), currentPage);
				if (serverType.equalsIgnoreCase("preProd")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.waitForSecond(1000);
				webDriverActions.softHighlightElement(nextWebStoryBtn);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(nextWebStoryBtn) , "Unable to Display Element in "+currentPage);;
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(title);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+webstoriesImgLnk.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyWebstoriesSliderNavigation()
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(webstoriesTitleLnk);
		webDriverActions.softScrollToElement(webstoriesTitleLnk);
		if(webDriverActions.isElementDisplayed(activeWebstoriesArticleLnk))
		{
			for(int i = 0 ; i< webstoriesSliderBtn.size() ; i++)
			{
				webDriverActions.softMouseHover(activeWebstoriesArticleLnk);
				webDriverActions.softScrollToElement(activeWebstoriesArticleLnk);
				String beforeSlide = webDriverActions.getTextFromElement(activeWebstoriesArticleLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softHighlightElement(webstoriesSliderBtn.get(i));
				webDriverActions.softClickJS(webstoriesSliderBtn.get(i));
				webDriverActions.waitForSecond(2000);
				String afterSlide = webDriverActions.getTextFromElement(activeWebstoriesArticleLnk);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Slider is Not Working ");
			}
		}
		else
		{
			softAssert.fail("Possibly Slider Button Is Not Displayed ");
		}
	}

	public void verifyWebstoriesTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , webstoriesTitleLnk, articleBreadCrumbDiv);
	}

	//------------------Anupam*Business Logic----------

	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation in home page
	 * @param serverType
	 * @param section
	 * @param artList
	 */
	public void verifyArticlesNavigation(String serverType,WebElement section ,List<WebElement> artList, WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(section, 12);
		webDriverActions.softMouseHover(section);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softHighlightElement(section);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<artList.size() ;i++)
		{
			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			String actualUrl =	webDriverActions.getAttribute("href", artList.get(i));
			Logs.info(getClass(), actualUrl);
			webDriverActions.softClickJS(artList.get(i));
			webDriverActions.waitForPageToLoad();

			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				actualUrl =	webDriverActions.getAttribute("href", artList.get(i));
				Logs.info(getClass(), actualUrl);
				webDriverActions.softClickJS(artList.get(i));
				webDriverActions.waitForPageToLoad();
			}

			webDriverActions.waitForSecond(1000);
			String currentPage = webDriverActions.getCurrentPageUrl();
			String expectedUrl = webDriverActions.getCurrentPageUrl();

			if (serverType.equalsIgnoreCase("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			} 

			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(2000);
			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element "+element +"in "+currentPage);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}		
		}
		softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	
	}


	/**
	 * @author AnupamGupta
	 * This method is used to verify image navigation of section in home page	
	 * @param serverType
	 * @param section
	 * @param artList
	 */
	public void verifyImgNavigation(String serverType ,WebElement section ,List<WebElement> artList ,WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(section, 20);		
		webDriverActions.softScrollToElement(section);
		webDriverActions.softMouseHover(section);
		webDriverActions.softHighlightElement(section);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<artList.size() ;i++)
		{
			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			webDriverActions.softClickJS(artList.get(i));
			webDriverActions.waitForPageToLoad();

			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				webDriverActions.softClickJS(artList.get(i));
				webDriverActions.waitForPageToLoad();
			}

			webDriverActions.waitForSecond(1000);
			String currentPage = webDriverActions.getCurrentPageUrl();
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			} 

			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(2000);
			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) ,  "Unable to Display Element "+element + " on "+currentPage);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}		
		}
		softAssert.assertAll("Issue Found in HomePage Body Image Navigation");	}


	/**
	 * @author AnupamGupta
	 * This method is used to Verify the More Widget News Navigation
	 * @param serverType
	 * @param moreLnk
	 * @param breadcrumb
	 */
	public void verifyMoreLnks(String serverType,WebElement moreLnk, WebElement breadcrumb) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(moreLnk, 12);	
		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		webDriverActions.softHighlightElement(moreLnk);
		String actualUrl = webDriverActions.getAttribute("href", moreLnk);
		webDriverActions.softHighlightElement(moreLnk);
		webDriverActions.softClickJS(moreLnk);
		webDriverActions.waitForPageToLoad();

		webDriverActions.waitForSecond(1000);
		String currentPage = webDriverActions.getCurrentPageUrl();
		softAssert.assertEquals(actualUrl, currentPage , "Unable to Navigate "+actualUrl);

		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		} 

		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+ "in "+currentPage);
		softAssert.assertAll("Issue Found in HomePage Body More Link");
	}

	/**
	 * @author AnupamGupta
	 * This method is used to Verify the More Widget News Navigation
	 * @param serverType
	 * @param section
	 * @param breadcrumb
	 */
	public void verifySectionLnks(String serverType,WebElement section, WebElement breadcrumb) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(section, 12);	
		webDriverActions.softMouseHover(section);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softHighlightElement(section);
		String actualUrl = webDriverActions.getAttribute("href", section);
		webDriverActions.softHighlightElement(section);
		webDriverActions.softClickJS(section);
		webDriverActions.waitForPageToLoad();

		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(section);
			webDriverActions.softScrollToElement(section);
			webDriverActions.softClickJS(section);
			webDriverActions.waitForPageToLoad();
		}


		webDriverActions.waitForSecond(1000);
		String currentPage = webDriverActions.getCurrentPageUrl();
		softAssert.assertEquals(actualUrl, currentPage , "Unable to Navigate "+actualUrl);

		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		} 

		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+"in "+currentPage);
		//		webDriverActions.waitForSecond(1000);
		softAssert.assertAll("Issue Found in HomePage Body Section Link");
	}


	//-----Sport
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget
	 */
	public void verifySportWidget(String serverType) {
		verifySectionLnks(serverType,sportSectionLnk, sportBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget Article
	 */
	public void verifySportWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,sportSectionLnk,sportSectionArticleLnk, sportBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget Image
	 */
	public void verifySportWidgetImg(String serverType) {
		verifyImgNavigation(serverType,sportSectionLnk,sportSectionImgLnk, sportBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More FooterSport News
	 */
	public void verifyMoreSportLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreSportSectionLnk, sportBreadcrumb);
	}

	//-----Life

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget
	 */
	public void verifyLifeWidget(String serverType) {
		verifySectionLnks(serverType,lifestyleSectionLnk, lifestyleBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget Article
	 */
	public void verifyLifeWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,lifestyleSectionLnk,lifestyleSectionArticleLnk, lifestyleBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget Image
	 */
	public void verifyLifeWidgetImg(String serverType) {
		verifyImgNavigation(serverType,lifestyleSectionLnk,lifestyleSectionImgLnk, lifestyleBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Lifestyle News
	 */
	public void verifyMoreLifeLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreLifestyleSectionLnk, lifestyleBreadcrumb);
	}

	//-----MobileAndTech
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of MobileAndTech Widget
	 */
	public void verifyMobileAndTechWidget(String serverType) {
		verifySectionLnks(serverType,mobileAndTechSectionLnk, mobileAndTechBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of MobileAndTech Widget Article
	 */
	public void verifyMobileAndTechWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,mobileAndTechSectionLnk,mobileAndTechSectionArticleLnk, mobileAndTechBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of MobileAndTech Widget Image
	 */
	public void verifyMobileAndTechWidgetImg(String serverType) {
		verifyImgNavigation(serverType,mobileAndTechSectionLnk,mobileAndTechSectionImgLnk, mobileAndTechBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More MobileAndTech News
	 */
	public void verifyMoreMobileAndTechLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreMobileAndTechSectionLnk, mobileAndTechBreadcrumb);
	}


	//-----national-international
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of national-international Widget
	 */
	public void verifyNationalInternationalWidget(String serverType) {
		verifySectionLnks(serverType,nationalInternationalSectionLnk, nationalInternationalBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of national-international Widget Article
	 */
	public void verifyNationalInternationalWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,nationalInternationalSectionLnk,nationalInternationalArticleLnk, nationalInternationalBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of national-international Widget Image
	 */
	public void verifyNationalInternationalWidgetImg(String serverType) {
		verifyImgNavigation(serverType,nationalInternationalSectionLnk,nationalInternationalImgLnk, nationalInternationalBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More national-international News
	 */
	public void verifyMoreNationalInternationalLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreNationalInternationalLnk, nationalInternationalBreadcrumb);
	}

	/**
	 * @author DanishR
	 * This Method is use to verify Header District Icon Cities Navigation
	 */
	public void districtIconCitiesNavigations(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String parent = webDriverActions.getCurrentPageUrl();
		webDriverActions.softClickJS(districtIcon);
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(districtIconCities.size()>0,"Possibly element not visible " +webDriverActions.getCurrentPageUrl());
		/* Below loop will fetch list of articles and navigate to each one by one */     
		for (int i = 0; i < districtIconCities.size(); i++)
		{
			webDriverActions.softMouseHover(districtIconCities.get(i));
			webDriverActions.softHighlightElement(districtIconCities.get(i));
			webDriverActions.softClickJS(districtIconCities.get(i));
			webDriverActions.waitForPageToLoad();
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.waitForSecond(2000);
				webDriverActions.softClickJS(districtIcon);
				webDriverActions.waitForSecond(2000);
				webDriverActions.softMouseHover(districtIconCities.get(i));
				webDriverActions.softHighlightElement(districtIconCities.get(i));
				webDriverActions.softClickJS(districtIconCities.get(i));
				webDriverActions.waitForPageToLoad();
			}
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.contains("preProd") && !currentPageUrl.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl=betaUrl;
			}
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Possibly element not visible " +currentPageUrl);
			webDriverActions.navigateToUrl(parent);
			webDriverActions.navigateToUrl(parent);
			webDriverActions.waitForSecond(2000);
			webDriverActions.softClickJS(districtIcon);
			webDriverActions.waitForSecond(2000);
		}
		softAssert.assertAll("Issues Found In Validating Header District Icon ");
	}

	/**
	 * @author DanishR
	 * This Method is use to verify Header Logo Icon
	 */
	public void headerLogoIcon(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String actual = webDriverActions.getPageTitle();
		webDriverActions.mouseHover(headerLogo);
		webDriverActions.softHighlightElement(headerLogo);
		webDriverActions.softClickJS(headerLogo);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.waitForSecond(2000);
			webDriverActions.mouseHover(headerLogo);
			webDriverActions.softHighlightElement(headerLogo);
			webDriverActions.softClickJS(headerLogo);
		}
		String expected = webDriverActions.getPageTitle();
		softAssert.assertEquals(expected,actual," Element not visible "+webDriverActions.getCurrentPageUrl()+ serverType);
		softAssert.assertAll("Issues Found In Validating Header Logo Icon ");
	}

	/**
	 * @author DanishR
	 * This method is used to click and navigate to Kannada Cities Articles
	 */
	public void verifyKannadaCitiesNavigation(String serverType)
	{

		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.softScrollToElement(citiesLnks.get(0));
		softAssert.assertTrue(citiesLnks.size()>0, "Possibly Element is Not Visible "+homeUrl);

		/* Below loop validates the Kannada cities articles Navigations */
		for (int i = 10; i < citiesLnks.size();i++) {
			webDriverActions.softHighlightElement(citiesLnks.get(i));
			webDriverActions.softMouseHover(citiesLnks.get(i));
			webDriverActions.softClickJS(citiesLnks.get(i));
			webDriverActions.waitForSecond(2000);

			for (int j = 0; j < citiesArticleLnks.size();j++) {
				webDriverActions.softHighlightElement(citiesArticleLnks.get(j));
				webDriverActions.softMouseHover(citiesArticleLnks.get(j));
				webDriverActions.softClickJS(citiesArticleLnks.get(j));
				webDriverActions.waitForSecond(2000);
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softHighlightElement(citiesArticleLnks.get(j));
					webDriverActions.softMouseHover(citiesArticleLnks.get(j));
					webDriverActions.softClickJS(citiesArticleLnks.get(j));
					webDriverActions.waitForSecond(2000);
				}

				String currentPageUrl = webDriverActions.getCurrentPageUrl();
				if (serverType.contains("preProd") && !currentPageUrl.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
					webDriverActions.navigateToUrl(betaUrl);
					currentPageUrl=betaUrl;
				}
				webDriverActions.softHighlightElement(articleBreadcrumb);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb) | webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Possibly Element is Not Visible "+currentPageUrl);
				webDriverActions.navigateToUrl(homeUrl);
				webDriverActions.waitForSecond(2000);
				webDriverActions.softScrollToElement(citiesLnks.get(i));
				webDriverActions.softHighlightElement(citiesLnks.get(i));
				webDriverActions.softMouseHover(citiesLnks.get(i));
				webDriverActions.softClickJS(citiesLnks.get(i));
				webDriverActions.waitForSecond(2000);
			}
		}
		softAssert.assertAll("Issues Found In Validating Kannada Section Cities Articles Present on HomePage");
	}


	/**
	 * @author DanishR
	 * This method is used to click and navigate to kannada Cities Articles
	 */
	public void kannadaMobileCitiesAticleLinksTest(String serverType)
	{
		HomePageLinksValidation http = new HomePageLinksValidation(driver);

		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(citiesLnks.get(0));
		softAssert.assertTrue(citiesLnks.size()>0, "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());
		ArrayList<String> articleList = new ArrayList<>();
		webDriverActions.waitForElement(1000);

		for (int i = 0; i <citiesLnks.size() ;i++) {
			webDriverActions.softMouseHover(citiesLnks.get(i));
			webDriverActions.softHighlightElement(citiesLnks.get(i));
			webDriverActions.softClickJS(citiesLnks.get(i));
			webDriverActions.waitForSecond(2000);
			for (int j = 0; j < citiesArticleLnks.size();j++) {
				String aticleLink = citiesArticleLnks.get(j).getAttribute("href");
				if (serverType.equalsIgnoreCase("preProd")) {
					String betaUrl = genericUtility.replaceInUrl(aticleLink);	
					articleList.add(betaUrl);
				}
			}
		}
		Logs.info(getClass(),"Total Links "+articleList.size());
		long startingTime= System.currentTimeMillis();
		articleList.parallelStream().forEach(e -> http.checkLinks(e));
		long endingTime= System.currentTimeMillis();
		Logs.info(getClass(),"  Total time  "+(endingTime-startingTime)/1000 +"s");
		softAssert.assertAll("Issue present in this Url : "+webDriverActions.getCurrentPageUrl()+" "+" are below ");

	}

	/**
	 * @author DanishR
	 * This method is used to click and navigate to Kannada Cities Articles Read More
	 */
	public void verifyKannadaReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType,KannadaSectionReadMoreLnk , articleBreadcrumb);
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the Headline of the Photo Section
	 */
	public void verifyPhotoSectionHeadline(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(webHeadline);
		webDriverActions.continuousScrollTillElement(photoSectionHeadline,12);
		webDriverActions.softScrollToElement(photoSectionHeadline);
		webDriverActions.softClickJS(photoSectionHeadline);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(photoSectionHeadline);
			webDriverActions.softScrollToElement(photoSectionHeadline);
			String actual = webDriverActions.getAttribute("href", photoSectionHeadline);
			Logs.info(getClass(), actual);
			//
			webDriverActions.softClickJS(photoSectionHeadline);
		}
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element"+currentPage);
		softAssert.assertAll("Issues found in this url ");	
	}

	/**
	 * @author RahulK
	 * @param serverType
	 * This method is used to click on the articles of the Photo Section 
	 */
	public void verifyPhotoArticleList(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(webHeadline);
		webDriverActions.continuousScrollTillElement(photoSectionHeadline,12);
		webDriverActions.softScrollToElement(photoArticleLnk.get(0));
		if(photoArticleLnk.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<photoArticleLnk.size();i++)
			{
				webDriverActions.waitForSecond(2000);
				webDriverActions.softHighlightElement(photoArticleLnk.get(i));
				webDriverActions.softMouseHover(photoArticleLnk.get(i));
				webDriverActions.softClickJS(photoArticleLnk.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(photoArticleLnk.get(i));
					webDriverActions.softScrollToElement(photoArticleLnk.get(i));
					String actual = webDriverActions.getAttribute("href", photoArticleLnk.get(i));
					Logs.info(getClass(), actual);
					//webDriverActions.waitForSecond(2000);
					webDriverActions.softClickJS(photoArticleLnk.get(i));
				}
				String expectedPageUrl = webDriverActions.getCurrentPageUrl();
				String currentPageUrl = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
					webDriverActions.navigateToUrl(betaUrl);
					currentPageUrl = betaUrl;
				}
				webDriverActions.waitForPageToLoad();
				webDriverActions.waitForSecond(2000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element"+webDriverActions.getCurrentPageUrl());
				if (expectedPageUrl.equalsIgnoreCase(currentPageUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+photoArticleLnk.size());
		}
		softAssert.assertAll("Issues found in this Url "); 
	}

	/**
	 * @author Rahul
	 * @throws InterruptedException
	 * This method is used to click on the functionalities of the Live Tv
	 */
	public void verifyLiveTv() throws InterruptedException {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(liveTvHeadline, 10);
		webDriverActions.softHighlightElement(liveTvHeadline);
		webDriverActions.softMouseHover(liveTvHeadline);
		//vidgyor_iframe is the frame name for Live TV
		webDriverActions.switchToFrame("vidgyor_iframe");
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.highlightElement(liveTvPlayer);

		/* Pause button */

		webDriverActions.waitForSecond(5000);
		webDriverActions.softMouseHover(mouseoverActionBar);
		webDriverActions.doubleClick(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(pauseBtn, 20);
		webDriverActions.softClickJS(pauseBtn);
		Logs.info(getClass(),"LiveTv is paused");
		webDriverActions.softWaitForElementVisibility(playBtn, 20);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(playBtn),"Unable to display Element");

		/* Play Button */				
		webDriverActions.softWaitForElementVisibility(playBtn, 20);
		webDriverActions.softClickJS(playBtn);
		Logs.info(getClass(),"Live Tv Playing");

		/* Unmute Button */
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softMouseHover(mouseoverActionBar);
		webDriverActions.doubleClick(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(unmuteBtn, 20);
		webDriverActions.softClickJS(unmuteBtn);
		Logs.info(getClass(),"audio unmuted");
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(muteBtn),"Unable to display Element");

		/* Mute Button */
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softMouseHover(mouseoverActionBar);
		webDriverActions.doubleClick(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(muteBtn, 20);
		webDriverActions.softClickJS(muteBtn);
		Logs.info(getClass(),"audio is muted");

		/* Share Button */
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softMouseHover(mouseoverActionBar);
		webDriverActions.doubleClick(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(shareBtn, 30);
		webDriverActions.softClickJS(shareBtn);
		Logs.info(getClass(),"clicked on share Button");
		webDriverActions.softClickJS(shareCloseBtn);
		Logs.info(getClass(),"clicked on close Button");

		/* Maximize Button */
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softMouseHover(mouseoverActionBar);
		webDriverActions.doubleClick(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(maximizeBtn, 30);
		webDriverActions.softClickJS(maximizeBtn);
		Logs.info(getClass(), "Maximized Live Tv");

		/* Minimize Button */
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softMouseHover(mouseoverActionBar);
		webDriverActions.doubleClick(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(minimizeBtn, 30);
		webDriverActions.softClickJS(minimizeBtn);
		Logs.info(getClass(), "Minimized Live Tv");
		softAssert.assertAll("Live Tv Functionalities are not working fine "+ webDriverActions.getCurrentPageUrl()); 
	}

	/**
	 * @author DanishR
	 * This method is used to validate live tv headline
	 * @param serverType
	 */
	public void verifyLiveTvHeadline(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.mouseHover(liveTvHeadline);
		webDriverActions.clickJS(liveTvHeadline);
		String expectedPageUrl = webDriverActions.getCurrentPageUrl();
		String currentPageUrl = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
			webDriverActions.navigateToUrl(betaUrl);
			currentPageUrl = betaUrl;
		}
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element"+webDriverActions.getCurrentPageUrl());
		if (expectedPageUrl.equalsIgnoreCase(currentPageUrl)) {
			webDriverActions.navigateBack();
		}
		else {
			webDriverActions.navigateBack();
			webDriverActions.navigateBack();
		}
	}
}

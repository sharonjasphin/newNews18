package com.news18.kannadapages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.asserts.SoftAssert;

import com.news18.commonpages.HomePageLinksValidation;
import com.news18.init.DriverUtility;
import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Abhishek Raj
 *This Class Contains elements and business logics for kannada Desktop Landing  Page
 */
public class DesktopKannadaLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	SoftAssert softAssert = new SoftAssert();

	public  DesktopKannadaLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*photo section Headline present in the homwpage*/
	@FindBy(xpath="//div[contains(@class,'globalhd large dflex')]//h2//a[contains(@href,'photogallery')] ")
	private WebElement photoSectionHeadline;

	/*photo section Headline present in the RHS*/
	@FindBy(xpath="//div[contains(@class,'side_bab_gallery')]//h2//a[contains(@href,'photogallery')] ")
	private WebElement photoRhs;

	/*photoArticle Links present at the Rhs*/
	@FindBy(xpath ="//div[contains(@class,'side_bab_gallery')]//ul//li//a")
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

	/*LiveTv Ads present in the Live Tv*/
	@FindBy(xpath = "//div[contains(text(),'Advertisement')]")
	private WebElement liveTvAds;

	/*Close Button present in Live TV section*/
	@FindBy(xpath = "//div[@class='vjs-close-btn vjs-share-close']")
	private WebElement shareCloseBtn;

	/*Element present in action bar*/
	@FindBy(xpath = "//div[@class='vjs-progress-control vjs-control']")
	private WebElement mouseoverActionBar;

	/*Element present in action bar*/
	@FindBy(xpath = "//div[contains(@class,'livetv-hdr')]//a")
	private WebElement liveTvHeadline; 

	/*Homepage First article Link  is present below the Line Two Menu bar in RHS*/
	@FindBy(xpath ="//div[contains(@class,'topnews-right')]//ul//li//a[not(contains(@href,'live')) and contains(@href,'/news/')]")
	private List<WebElement> homePageArticleLnk;

	/*Videos link present after clicking on Hamburger menu*/
	@FindBy(xpath ="//div[contains(@class,'sub-nav')]//li//a[text()='Videos']")
	private WebElement videosLnk;

	/*Homepage LiveBlog article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@class,'__next')]//a[contains(@href,'live-updates')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*Sports link present after clicking on line two*/
	@FindBy(xpath ="//div[contains(@class,'footer_other')]//ul[contains(@class,'footer_links')]//a[@href='/sports/']")
	private WebElement sportsSectionLnk;

	/*cinema link present at line one section*/
	@FindBy(xpath ="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]//a[not(contains(@href,'/sports/'))and not(contains(@href,'/photogallery/'))]")
	private List<WebElement> sectionLnks;

	/*video link present at Footer section*/
	@FindBy(xpath ="//div[contains(@class,'footer_other')]//ul//a[@href='/videos/']")
	private WebElement videoSectionLnk;

	/*Trending Topic link present at header section*/
	@FindBy(xpath ="//div[contains(@class,'nhtranding')]//a")
	private List<WebElement> trendingTopicsLnk;

	/*photo section Present in LineOne navigation bar */
	@FindBy(xpath="//div[contains(@class,'container')]//ul[contains(@class,'nav_bar')]//a[@href='/photogallery/']")
	private WebElement photoSectionLineOneLnk;


	//===============================Sanjeeb's WebELements========================

	/*Footer Live TV Section */
	@FindBy(xpath="//div[contains(@class,'footer_other_logo')]")
	private WebElement footerLiveTVSection;

	/*list Of elements present under Footer Live Tv Section*/
	@FindBy(xpath="//div[contains(@class,'carousel__slider-tray')]//a")
	private List<WebElement> liveTvEleList;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'headerContainer')] | //div[contains(@class,'headerContainer')]//h2 | //div[contains(@class,'n18hcontainer')] | //div[contains(@class,'n18nheader')]  ")
	private WebElement headerTxtLogoLnk;

	/*choose District Section present on Header */
	@FindBy(xpath="//div[contains(@class,'chsstctbtn')]")
	private WebElement chooseYourDistrictSection;

	/*Search section present on choose District Header */
	@FindBy(xpath="//div[contains(@class,'tpchsstctnames')]/input")
	private WebElement chooseDistrictSearchBtn;

	/*Search section present on choose District Header */
	@FindBy(xpath="(//div[contains(@class,'tpctlits')])[1]")
	private WebElement filterDistrictResultSection;

	/*choose District Section present on Header */
	@FindBy(xpath="//a[contains(@class,'chsstctbtnclose')]")
	private WebElement cancelBtn;

	/*list Of elements present under choose District Section*/
	@FindBy(xpath="//div[contains(@class,'tpctlits')]//li/a")
	private List<WebElement> chooseDistrictEle;

	/*Hamburger Menu Link is present in the Top Main Menu*/
	@FindBy(xpath ="//div[contains(@class,'nav_open')]")
	private WebElement hamburgerMenuLnk;

	/*list of sections present inside hamburger menu present on the header of homepage*/
	@FindBy(xpath ="//div[contains(@class,'open_nav_sub')]//li/a")
	private List<WebElement> hamburgerSectionsLnk;

	/*BreadCrumb Present on Article Header*/
	@FindBy(xpath="//div[contains(@class,'br')] | //ul[contains(@class,'br')] ")
	private WebElement headerBreadcrumbLnk;

	/*list of sections present in Line One Section Bar present at the header of Homepage*/
	@FindBy(xpath ="//ul[contains(@class,'nav_bar')]//li/a")
	private List<WebElement> lineOneSectionELementLnk;

	/*list of sections present in Line One Section Bar present at the header of Homepage*/
	@FindBy(xpath ="//div[contains(@class,'container')]//ul[contains(@class,'nav_bar')]")
	private WebElement lineOneSectionLnk;

	/*Search Button Link Present on Line One Section of Homepage*/
	@FindBy(xpath ="(//div[contains(@class,'header_search')]/a)[1]")
	private WebElement searchBtnLnk;

	/*Search Box Button present after clicking on Search Icon present on the Line One Section*/
	@FindBy(xpath ="//div[contains(@id,'_gcse')]//input")
	private WebElement searchBoxBtn;

	/*Search Icon Present After Clicking on The Search Btn Present On the Line One Bar */
	@FindBy(xpath ="//*[local-name()='svg']/parent::button")
	private WebElement insideSearchIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//section[contains(@class,'top_section')]")
	private WebElement netraSurkshaIcon;

	/*Search Box Link Present on Line One Section of Homepage*/
	@FindBy(xpath ="(//div[contains(@class,'gsc-results')])[1]/div[contains(@class,'gsc-results')]")
	private WebElement closeBtn;

	/*list of sections present inside line two present on the header of homepage*/
	@FindBy(xpath ="//ul[contains(@class,'sub_navigation_ul')]//a")
	private List<WebElement> lineTwoSectionsLnk;

	/*crypto ki Samajh Icon Present On LineTwo Section*/
	@FindBy(xpath ="(//div[contains(@class,'crypto_container')])[1]")
	private WebElement cryptoKiSamajhIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'header-login')] | //div[contains(@class,'header-top')] ")
	private WebElement townHallAndTopLearningIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'header-wrap container')] | //div[contains(@class,'logo-main')] ")
	private WebElement firstPostAndCnbcIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'header-wrap container')] | //div[contains(@class,'container')]")
	private WebElement historyAndMTvIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'headtop')  or contains(@class,'head_homepage') or contains(@class,'stmimg')]")
	private WebElement moneyControlInstaPlayStoreIcon;

	/*header Text for CompareIndia*/
	@FindBy(xpath ="//div[contains(@class,'desklogo')]")
	private WebElement compareIndiaIcon;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//img[contains(@src,'JioNewsAppIcon')]")
	private WebElement jioHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'Mhrnjf')]")
	private WebElement googlePlayHeader;

	// --------------------------Vipin's Webelement -------------------------------//

	/* Article Header Text in Article Consumption Page */
	@FindBy(xpath ="//h1[contains(@class,'article_heading') or contains(@class,'live_blog') or contains(@class,'gallery_tilte')] | //div[contains(@class,'art') or contains(@class,'TstoryHead')]/h1" )
	private WebElement articleHeaderTxt;

	/* Article BreadCrumb Division */
	@FindBy(xpath = "//div[contains(@class,'brade')] | //div[contains(@class,'brdc')]  | //ul[contains(@class, 'bread')]")
	private WebElement articleBreadCrumbDiv;

	/*List of Priority Panel Article Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'topnews-left')]/ul[contains(@class,'top')]/li/a")
	private List<WebElement> priorityPanelArticleLnk;

	/*List of Priority Panel Image Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'topnews-left')]/ul[contains(@class,'top')]/li/a//img")
	private List<WebElement> priorityPanelImgLnk;

	/*List of Top News Article Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'topnews-left')]/ul[contains(@class,'top')]/li/a")
	private List<WebElement> topNewsArticleLnk;

	/*List of Top News Image Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'topnews-left')]/ul[contains(@class,'top')]/li/a//img")
	private List<WebElement> topNewsImgLnk;

	/* Webstories Section  Title Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'news_story')]//h2/a")
	private WebElement topstoryTitleLnk;

	/* List of Webstrories Article Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'news_story')]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'slick-slide') and not (contains(@class,'slick-cloned'))]//a")
	private List<WebElement> topstoryArticleLnk;

	/* List of Webstrories Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'news_story')]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'slick-slide') and not (contains(@class,'slick-cloned'))]//a//img")
	private List<WebElement> topstoryImgLnk;

	/* Active Webstories Article Link in Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'news_story')]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'current') and not (contains(@class,'slick-cloned'))]//a")
	private WebElement activeTopstoryArticleLnk;

	/* Active Webstories Image Link in Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'news_story')]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'current') and not (contains(@class,'slick-cloned'))]//a//img")
	private WebElement activeTopstoryImgLnk;

	/* Webstories Slider Button in Homepage */
	@FindBy(xpath = "//div[contains(@class,'news_story')]//ul[contains(@class,'slick-dots')]/li/button")
	private List<WebElement> topstorySliderBtn;


	/* Webstories Section  Title Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'news_story')]//h2/a")
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

	/*Entertainment Section Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//a[contains(@href,'/entertainment/')]/ancestor::div[contains(@class,'home-sports')]//ul[contains(@class,'khelnews')]/li/a")
	private List<WebElement> entertainmentArticleLnk;

	/*Entertainment Section Image Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//a[contains(@href,'/entertainment/')]/ancestor::div[contains(@class,'home-sports')]//ul[contains(@class,'khelnews')]/li/a//img[@data-src]")
	private List<WebElement> entertainmentImgLnk;

	/*Entertainment Section Read More Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//a[contains(@href,'/entertainment/')]/ancestor::div[contains(@class,'home-sports')]/div[contains(@class,'sportstories')]/a")
	private WebElement entertainmentReadMoreLnk;

	/*Entertainment Section Title Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//a[contains(@href,'/entertainment/')]")
	private WebElement entertainmentTitleLnk;

	/*Trend Section Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//a[contains(@href,'/trend/')]/ancestor::div[contains(@class,'home-sports')]//ul[contains(@class,'khelnews')]/li/a")
	private List<WebElement> trendArticleLnk;

	/*Trend Section Image Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//a[contains(@href,'/trend/')]/ancestor::div[contains(@class,'home-sports')]//ul[contains(@class,'khelnews')]/li/a//img[@data-src]")
	private List<WebElement> trendImgLnk;

	/*Trend Section Read More Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//a[contains(@href,'/trend/')]/ancestor::div[contains(@class,'home-sports')]/div[contains(@class,'sportstories')]/a")
	private WebElement trendReadMoreLnk;

	/*Trend Section Title Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//a[contains(@href,'/trend/')]")
	private WebElement trendTitleLnk;

	//--------------Anupam*Webelement---------------------

	//---------State
	/* State section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/state/')]")
	private WebElement stateSectionLnk;

	/* State section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/state/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> stateSectionArticleLnk;

	/* State section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/state/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> stateSectionImgLnk;

	/* State section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/state/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreStateSectionLnk;

	/*Breadcrumb present in State article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]")
	private WebElement stateBreadcrumb;


	//---------national-international
	/* national-international section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/national-international/')]")
	private WebElement nationalInternationalSectionLnk;

	/*national-international section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/national-international/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> nationalInternationalArticleLnk;

	/*national-international section Image present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/national-international/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> nationalInternationalImgLnk;

	/*national-international section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/national-international/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreNationalInternationalLnk;

	/*national-international present in MobileAndTech article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]")
	private WebElement nationalInternationalBreadcrumb;


	//---------lifestyle
	/* Lifestyle section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/lifestyle/')]")
	private WebElement lifestyleSectionLnk;

	/* Lifestyle section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/lifestyle/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> lifestyleSectionArticleLnk;

	/* Lifestyle section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/lifestyle/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> lifestyleSectionImgLnk;

	/* Lifestyle section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/lifestyle/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreLifestyleSectionLnk;

	/*Breadcrumb present in Lifestyle article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]")
	private WebElement lifestyleBreadcrumb;


	//---------MobileAndTech
	/* MobileAndTech section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/tech/')]")
	private WebElement mobileAndTechSectionLnk;

	/*MobileAndTech section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/tech/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> mobileAndTechSectionArticleLnk;

	/*MobileAndTech section Image present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/tech/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> mobileAndTechSectionImgLnk;

	/*MobileAndTech section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/tech/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreMobileAndTechSectionLnk;

	/*Breadcrumb present in MobileAndTech article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]")
	private WebElement mobileAndTechBreadcrumb;


	//------------Photos
	/* Photos section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/photogallery/')]")
	private WebElement photosBodySectionLnk;

	/* Photos section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'leftwrap')]//ul[contains(@class,'photogallerystories')]/li/a")
	private List<WebElement> photosSectionArticleLnk;

	/* Photos section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'leftwrap')]//ul[contains(@class,'photogallerystories')]/li/a//img")
	private List<WebElement> photosSectionImgLnk;

	/* List of Photo Tabs Link Navigation In Homepage*/
	@FindBy(xpath = "//div[contains(@class,'globalhd')]//a[contains(@href,'/photogallery/')]//ancestor::div[contains(@class,'globalhd')]//li/a")
	private List<WebElement> photosTabsLnk;

	/*Breadcrumb present in Photos article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement photosBreadcrumb;


	//	****************************Danish***WebElement*******************************

	/* Change Language List present in Homepage Header*/
	@FindBy(xpath ="//div//span[contains(text(),'CHANGE LANGUAGE')]//parent::div//a[contains(@href,'news18')]" )
	private List<WebElement> changeLanguageList;

	/*Change Language Button present at Header Part*/
	@FindBy(xpath="(//div//span[contains(text(),'CHANGE LANGUAGE')]//parent::div//a[contains(@href,'news18')])[1]")
	private WebElement changeLanguageBtn;

	/*Home Page Header Watch Live TV*/
	@FindBy(xpath="//div[contains(@class,'nhlivetv')]//a[contains(@href,'live-tv')]")
	private WebElement headerLiveTv;

	/*Home Page Header Watch Live TV Page Attribute*/
	@FindBy(xpath="//h1")
	private WebElement h1Txt;

	/*Download News-18 App Link is present on the Top before the Follow us on link*/
	@FindBy(xpath ="//div[contains(@class,'lnlapp')]/a")
	private List<WebElement> downloadNews18AppLnks;

	/*List Of App Store Image after clicking on News18 Download App present in header*/
	@FindBy(xpath ="//div[@class='gpaimg']//a//img")
	private List<WebElement> appStore;

	/*Social Media icons present in header of HomePage*/
	@FindBy(xpath ="(//div[contains(@class,'social')])[1]//a[contains(translate(@href,'News18','news18'),'news18')]")
	private List<WebElement> socialMediaIconsLnk;

	/*Trending Topics First Link is present in Header of home page*/
	@FindBy(xpath="//div[contains(@class,'tranding')]//a[contains(@href,'news18')]")
	private List<WebElement> headerTrendingTopicsLnks;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//*[local-name()='svg' and contains(@aria-label,'Instagram')]")
	private WebElement instagramHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div//a[contains(@aria-label,'Facebook')]")
	private WebElement facebookHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'tgme_head')]")
	private WebElement telegramHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'ytd-topbar')]")
	private WebElement youtubeHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'r-')]//h1")
	private WebElement twitterHeader;

	/*Header Text Link Present in google app store page*/
	@FindBy(xpath ="//header//a[contains(@href,'store/games')]")
	private WebElement playStoreHeader;

	/*Header Text Link Present in apple app store page*/
	@FindBy(xpath ="//div[contains(@class,'container')]//following-sibling::ul")
	private WebElement appleHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'logo')]")
	private WebElement logoHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'crum') or contains(@class,'breadcum') or contains(@class,'brdc')]  | //ul[contains(@class, 'bread') or contains(@class,'brdc')]")
	private WebElement articleBreadcrumb;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'nwlvtv')]//h1")
	private WebElement watchLiveTVHeader;

	/*kannada Section Title Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'/kannada')]")
	private WebElement kannadaSectionTitleLnk;

	/* kannada Section Cities Name in Homepage */
	@FindBy(xpath = "//div[contains(@class,'citiesname')]//ul/li/a")
	private List<WebElement> kannadaSectionCitiesName;

	/*kannada Section Article Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pradesh-newswrap')]/ul//li//a")
	private List<WebElement> kannadaSectionArticleLnk;

	/*kannada Section Previous Slider Button in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'citiesname')]/div[contains(@class,'contorls')]/button[@data-glide-dir='<']")
	private WebElement kannadaSectionPreviousBtn;

	/*kannada Section Next Slider Button in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'citiesname')]/div[contains(@class,'contorls')]/button[@data-glide-dir='>']")
	private WebElement kannadaSectionNextBtn;

	/* Active kannada Section City Name in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'citiesname')]/div/ul/li[contains(@class,'active')]/a")
	private WebElement activekannadaCityName;

	/*kannada Section Read More Link in Homeoage*/
	@FindBy(xpath = "//div[contains(@class,'pradesh-newswrap')]/parent::div/a")
	private WebElement kannadaSectionReadMoreLnk;


	/**
	 * @author Abhishek
	 * This method is used to click on First Article of Kannada Home Page 
	 */
	public void clickOnFirstArticleHomePage() {
		try {
			webDriverActions.clickJS(homePageArticleLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in first Article Homepage",e);
		}
	}


	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of Kannada Home Page 
	 */
	public void clickOnLiveBlogArticleHomePage() {
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
	 * This method is used to click on sports link present on lineOne section
	 */
	public void clickOnSportsLnk()
	{
		try{
			webDriverActions.scrollToLast();
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(sportsSectionLnk);
		}
		catch(NoSuchElementException e){
			Logs.error(getClass(), "Exception in Sports Link in HomePage",e);
		}
	}


	/**
	 * @author Sanjeeb
	 * This method is used to click on Cinema link present on line one section
	 */
	public void clickOnFirstSectionLnk(){
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(sectionLnks.get(1));
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Section Page Link in HomePage",e);
		}	
	}


	/**
	 * @author Sanjeeb
	 * This method is used to click on Video link present on Line one section
	 */
	public void clickOnVideoLnk()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.continuousScrollTillElement(videoSectionLnk, GlobalVariables.sec30);
			webDriverActions.clickJS(videoSectionLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Video section Link in HomePage",e);
		}	
	}


	/**
	 * @author Sanjeeb
	 * This method is used to Click on First topic link of Trending Topics Section present At the Footer Of HomePage
	 */
	public void clickOnFirstTopicLnkTrendingTopics() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(trendingTopicsLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First Trending Topic Link",e);
		}
	}

	/**
	 * @author Abhishek
	 * This method used to click on photos section
	 */
	public void clickOnPhotosSection(){
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(photoSectionLineOneLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Photos Section Link in HomePage",e);
		}
	}


	//===============================Sanjeeb's BusinessLogics========================
	/**
	 * @author SanjeebKumarPati
	 * This method used to verify footer live Tv in desktop Landing page.
	 */
	public void verifyFooterLiveTv()
	{
		verifyFooterThirdPartySection(footerLiveTVSection, liveTvEleList, headerTxtLogoLnk);
	}

	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Line One Section Choose Your District Present in Hindi Desktop Landing Page.
	 */
	public void verifyLineOneSectionChooseYourDistrict(String server)
	{
		//This line of Script to verify RajyaSeher Chune Icon Present in the Linone Section of Hindi News 18 Home Page.
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String pageUrl=webDriverActions.getCurrentPageUrl();
		webDriverActions.softClickJS(chooseYourDistrictSection);
		softAssert.assertTrue(chooseDistrictEle.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for(int i=0;i<chooseDistrictEle.size();i++)
		{
			webDriverActions.softHighlightElement(chooseDistrictEle.get(i));
			String expected = webDriverActions.getAttribute("href", chooseDistrictEle.get(i));
			Logs.info(getClass(), expected);
			webDriverActions.softClickJS(chooseDistrictEle.get(i));
			String currentPageUrl=webDriverActions.getCurrentPageUrl();
			if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(chooseYourDistrictSection);
				webDriverActions.softClickJS(chooseDistrictEle.get(i));
			}
			String actual = webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd")&& !actual.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(actual);
				expected=betaUrl;
				webDriverActions.navigateToUrl(expected);
			}
			webDriverActions.stopPageLoading();
			webDriverActions.softWaitForElementVisibility(headerBreadcrumbLnk, 3);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Possibly Element Is Not Visible For This URL "+actual);
			webDriverActions.navigateToUrl(pageUrl);
			webDriverActions.softClickJS(chooseYourDistrictSection);
		}
		softAssert.assertAll("Rajya Seher Chune Verification Failed");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Line One Hamburger Menu and Line Two Section after clicking on the hamburger Icon.
	 */
	public void verfyLineOneHamburgerMenu(String server)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String pageURL = webDriverActions.getCurrentPageUrl();
		webDriverActions.softClick(hamburgerMenuLnk);
		softAssert.assertTrue(hamburgerSectionsLnk.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		//It will fetch the line one Elements except search Icon
		for (int i = 0; i < hamburgerSectionsLnk.size(); i++)
		{
			webDriverActions.softHighlightElement(hamburgerSectionsLnk.get(i));
			String actual = webDriverActions.getAttribute("href", hamburgerSectionsLnk.get(i));
			Logs.info(getClass(), actual);
			webDriverActions.softClickJS(hamburgerSectionsLnk.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.waitForPageToLoad();
				webDriverActions.navigateToUrl(pageURL);
				webDriverActions.softClick(hamburgerMenuLnk);
				webDriverActions.softClickJS(hamburgerSectionsLnk.get(i));
			}
			String expected = webDriverActions.getCurrentPageUrl();	
			if(server.contains("preProd") && !expected.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(expected);
				expected=betaUrl;
				webDriverActions.navigateToUrl(expected);
			}
			webDriverActions.waitForSecond(1000);
			webDriverActions.softWaitForElementVisibility(headerBreadcrumbLnk, 3);
			webDriverActions.stopPageLoading();
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Failed To display The Header Text For This URL "+actual);	
			webDriverActions.navigateToUrl(pageURL);
			webDriverActions.waitForPageToLoad();
			webDriverActions.softClickJS(hamburgerMenuLnk);
		}
		softAssert.assertAll("Issues Found In Validating Hamburger Menu");
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify elements Present In Line One Section By Clicking On It.
	 */
	public void verfyLineOneSection(String server)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String pageURL = webDriverActions.getCurrentPageUrl();
		webDriverActions.softWaitForElementVisibility(lineOneSectionLnk, 3);
		softAssert.assertTrue(lineOneSectionELementLnk.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		//Validating the Line one section Except Search Button
		softAssert.assertTrue(lineOneSectionELementLnk.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for (int i = 1; i < lineOneSectionELementLnk.size(); i++)
		{
			webDriverActions.softHighlightElement(lineOneSectionELementLnk.get(i));
			webDriverActions.softClick(lineOneSectionELementLnk.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateToUrl(pageURL);
				webDriverActions.softClickJS(lineOneSectionELementLnk.get(i));
			}
			String expected = webDriverActions.getCurrentPageUrl();	
			if(server.contains("preProd") && !expected.contains("//beta"))
			{
				if(!(expected.contains("netrasuraksha")))
				{
					String betaUrl = genericUtility.replaceInUrl(expected);
					expected=betaUrl;
					webDriverActions.navigateToUrl(expected);
				}
			}
			if(expected.contains("netrasuraksha"))
			{
				webDriverActions.softWaitForElementVisibility(netraSurkshaIcon, 3);
				webDriverActions.stopPageLoading();
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(netraSurkshaIcon), "Failed To display Header Icon For This URL"+expected);	
			}
			else
			{
				webDriverActions.softWaitForElementVisibility(headerTxtLogoLnk, 3);
				webDriverActions.stopPageLoading();
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Failed To display Header Icon For This URL"+expected);
			}
			webDriverActions.navigateToUrl(pageURL);
		}
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify elements Present In Line One Section By Clicking On It.
	 */
	public void verfyLineOneSearchSection(String server)
	{
		//validating Search Button
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForSecond(5000);
		webDriverActions.softClickJS(searchBtnLnk);
		webDriverActions.waitForSecond(5000);
		webDriverActions.inputText(searchBoxBtn, "News 18");
		webDriverActions.softHighlightElement(insideSearchIcon);
		webDriverActions.softClick(insideSearchIcon);
		webDriverActions.waitForSecond(2000);
		webDriverActions.softHighlightElement(closeBtn);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(closeBtn), "Posibly Search Box is not displayed");	
		softAssert.assertAll("Issues Found In Line One Sections");	

	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Line Two Section.
	 */
	public void verfyLineTwoSection(String server)
	{
		String expected ="";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String pageTitle = webDriverActions.getPageTitle();
		String pageUrl = webDriverActions.getCurrentPageUrl();
		//It will fetch the line one Elements except search Icon
		softAssert.assertTrue(lineTwoSectionsLnk.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for (int i = 0; i < lineTwoSectionsLnk.size(); i++)
		{
			webDriverActions.softHighlightElement(lineTwoSectionsLnk.get(i));
			String title = webDriverActions.getAttribute("target", lineTwoSectionsLnk.get(i));
			webDriverActions.softClickJS(lineTwoSectionsLnk.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateToUrl(pageUrl);
				webDriverActions.softClickJS(lineTwoSectionsLnk.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					webDriverActions.waitForSecond(1000);
				}
			}
			expected=webDriverActions.getCurrentPageUrl();
			if(expected.contains("crypto-ki-samajh"))
			{
				webDriverActions.softWaitForElementVisibility(cryptoKiSamajhIcon, 3);
				webDriverActions.stopPageLoading();
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(cryptoKiSamajhIcon), "Possibly Element Is Not Visible For This URL "+expected);	
			}
			else
			{
				if(server.contains("preProd") && !expected.contains("//beta"))
				{
					String betaUrl = genericUtility.replaceInUrl(expected);
					expected=betaUrl;
					webDriverActions.navigateToUrl(expected);
				}
				webDriverActions.softWaitForElementVisibility(headerTxtLogoLnk, 3);
				webDriverActions.stopPageLoading();
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Possibly Element Is Not Visible For This URL "+expected);	
			}	
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageTitle);
			}
			else
			{
				webDriverActions.navigateToUrl(pageUrl);
			}
		}
		softAssert.assertAll("Issues Found In Validating Line Two Sections");
	}


	public void verifyFooterThirdPartySection(WebElement footerSection,List<WebElement> footerSectionEleList,WebElement headerText)
	{
		//it takes the social share Url from property File
		ArrayList<String> list=new ArrayList<String>();
		list.add(fileUtility.readDataFromPropertyFile("topperlearning"));
		list.add(fileUtility.readDataFromPropertyFile("firstpost"));
		list.add(fileUtility.readDataFromPropertyFile("cnbctv18"));
		list.add(fileUtility.readDataFromPropertyFile("historyindia"));
		list.add(fileUtility.readDataFromPropertyFile("mtvindia"));
		list.add(fileUtility.readDataFromPropertyFile("moneycontrol"));
		list.add(fileUtility.readDataFromPropertyFile("compareindia"));
		list.add(fileUtility.readDataFromPropertyFile("facebook"));
		list.add(fileUtility.readDataFromPropertyFile("twitter"));
		list.add(fileUtility.readDataFromPropertyFile("instagram"));
		list.add(fileUtility.readDataFromPropertyFile("youtube"));
		list.add(fileUtility.readDataFromPropertyFile("jionews"));
		list.add(fileUtility.readDataFromPropertyFile("googlePlay"));
		list.add(fileUtility.readDataFromPropertyFile("apple"));

		//it add the element of social share icons.
		ArrayList<WebElement> listEle=new ArrayList<WebElement>();
		listEle.add(townHallAndTopLearningIcon);
		listEle.add(firstPostAndCnbcIcon);
		listEle.add(firstPostAndCnbcIcon);
		listEle.add(historyAndMTvIcon);
		listEle.add(historyAndMTvIcon);
		listEle.add(moneyControlInstaPlayStoreIcon);
		listEle.add(compareIndiaIcon);
		listEle.add(facebookHeader);
		listEle.add(twitterHeader);
		listEle.add(instagramHeader);
		listEle.add(youtubeHeader);
		listEle.add(jioHeader);
		listEle.add(googlePlayHeader);
		listEle.add(appleHeader);
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String pageURL = webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(footerSection);
		webDriverActions.softWaitForElementVisibility(footerSection, 3);
		webDriverActions.softHighlightElement(footerSection);
		softAssert.assertTrue(footerSectionEleList.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for(int i=0;i<footerSectionEleList.size();i++)
		{
			String title = webDriverActions.getAttribute("target", footerSectionEleList.get(i));
			webDriverActions.softWaitForElementVisibility(footerSectionEleList.get(i), i);
			webDriverActions.softMouseHover(footerSectionEleList.get(i));
			webDriverActions.softClickJS(footerSectionEleList.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForSecond(2000);
			}
			String actual = webDriverActions.getCurrentPageUrl();
			if(actual.contains("topperlearning")||actual.contains("moneycontrol")||actual.contains("firstpost")||actual.contains("compareindia")||actual.contains("historyindia")||actual.contains("mtvindia")||actual.contains("caprep18")||actual.contains("play.google.com")||actual.contains("apple")||actual.contains("facebook")||actual.contains("twitter")||actual.contains("instagram")||actual.contains("jionews")||actual.contains("youtube"))
			{
				for(int j=0;j<list.size();j++)
				{
					if(actual.contains(list.get(j)))
					{
						webDriverActions.softWaitForElementVisibility(listEle.get(j), 3);
						webDriverActions.stopPageLoading();
						softAssert.assertTrue(actual.contains(list.get(j))&&webDriverActions.softIsElementDisplayed(listEle.get(j)), "Possibly Element Is Not Visible For This URL "+actual);
					}
				}
			}
			else
			{
				webDriverActions.softWaitForElementVisibility(headerText, 3);
				webDriverActions.stopPageLoading();
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerText), "Possibly Element Is Not Visible For This URL "+actual);
			}
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageTitle);
			}
			else
			{
				webDriverActions.navigateToUrl(pageURL);
			}
			webDriverActions.scrollToLast();
			webDriverActions.softScrollToElement(footerSection);
			webDriverActions.softWaitForElementVisibility(footerSection, 3);
			webDriverActions.softHighlightElement(footerSection);
		}
		softAssert.assertAll("Footer Section validation Unsucessful");
	}

	public void verifyFooterSection(WebElement footerSection,List<WebElement> footerSectionEleList,WebElement headerText,String server)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String pageURL = webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(footerSection);
		webDriverActions.softWaitForElementVisibility(footerSection, 3);
		webDriverActions.softHighlightElement(footerSection);
		softAssert.assertTrue(footerSectionEleList.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for(int i=0;i<footerSectionEleList.size();i++)
		{
			String title = webDriverActions.getAttribute("target", footerSectionEleList.get(i));
			webDriverActions.softWaitForElementVisibility(footerSectionEleList.get(i), i);
			webDriverActions.softMouseHover(footerSectionEleList.get(i));
			webDriverActions.softClickJS(footerSectionEleList.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForSecond(2000);
			}
			String actual = webDriverActions.getCurrentPageUrl();
			webDriverActions.softWaitForElementVisibility(headerText, 3);
			webDriverActions.stopPageLoading();
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerText), "Possibly Element Is Not Visible For This URL "+actual);

			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageTitle);
			}
			else
			{
				webDriverActions.navigateToUrl(pageURL);
			}
			webDriverActions.scrollToLast();
			webDriverActions.softScrollToElement(footerSection);
			webDriverActions.softWaitForElementVisibility(footerSection, 3);
			webDriverActions.softHighlightElement(footerSection);
		}
		softAssert.assertAll("Footer Section validation Unsucessful");
	}


	/* List of Webstrories Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'footer_right')]/ul")
	private WebElement aboutUsSectionLnk;

	/* Active Webstories Article Link in Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'footer_right')]/ul//a")
	private List<WebElement> aboutUsSectionEleLnk;

	/* List of Webstrories Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'new_social')]")
	private WebElement socialShareSectionLnk;

	/* Active Webstories Article Link in Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'new_social')]//a")
	private List<WebElement> socialShareEleLnk;

	/* List of Webstrories Image Link in Homepage */
	@FindBy(xpath = "(//div[contains(@class,'footer_other')])[2]")
	private WebElement bivagSectionLnk;

	/* Active Webstories Article Link in Webstories Section in Homepage */
	@FindBy(xpath = "(//div[contains(@class,'footer_other')])[2]//a")
	private List<WebElement> bivagSectionEleLnk;

	/* List of Webstrories Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'footer_center')]")
	private WebElement LatestSectionLnk;

	/* Active Webstories Article Link in Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'footer_center')]//a")
	private List<WebElement> LatestSectionEleLnk;

	/* List of Webstrories Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'footer_network')]/div[contains(@class,'justify')]")
	private WebElement news18GroupSitesSectionLnk;

	/* Active Webstories Article Link in Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'footer_network')]/div[contains(@class,'justify')]//a")
	private List<WebElement> news18GroupSitesSectionEleLnk;

	/**
	 * @author SanjeebKumarPati
	 * This method used to verify footer About Us section of Desktop Landing Page.
	 */
	public void verifyFooterAboutUSSection(String server)
	{
		verifyFooterSection(aboutUsSectionLnk,aboutUsSectionEleLnk,headerBreadcrumbLnk,server);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify footer About Us section of Desktop Landing Page.
	 */
	public void verifyFooterSocialShareSection()
	{
		verifyFooterThirdPartySection(socialShareSectionLnk,socialShareEleLnk,headerBreadcrumbLnk);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify footer Bivag section of Desktop Landing Page.
	 */
	public void verifyFooterBivagSection(String server)
	{
		verifyFooterSection(bivagSectionLnk, bivagSectionEleLnk,headerBreadcrumbLnk, server);	
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify footer Latest section of Desktop Landing Page.
	 */
	public void verifyFooterLatestSection(String server)
	{
		verifyFooterSection(LatestSectionLnk, LatestSectionEleLnk,headerBreadcrumbLnk, server);	
	}

	/**
	 * @author SanjeebKumarPati
	 * This method used to verify footer NewsSites section of Desktop Landing Page.
	 */
	public void verifyFooterNews18GroupSitesSection()
	{
		verifyFooterThirdPartySection(news18GroupSitesSectionLnk, news18GroupSitesSectionEleLnk,headerTxtLogoLnk);
	}


	// --------------------------- Vipin's Business Logic ---------------------------//


	/**
	 * @param artList
	 * @param element
	 * @author VipinKumarGawande
	 * This method is used to Verify All The Widgets Article Text Navigation  
	 */
	public void verifyArticleNavigation(String serverType , List<WebElement> artList , WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(artList, 15);
		for(int i=0; i<artList.size() ;i++)
		{
			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			webDriverActions.softClickJS(artList.get(i));
			String currentPage =webDriverActions.getCurrentPageUrl();
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			}
			webDriverActions.waitForPageToLoad();
			webDriverActions.softHighlightElement(element);
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
			for(int i=0; i<imgList.size() ;i++)
			{
				webDriverActions.softMouseHover(imgList.get(i));
				webDriverActions.softScrollToElement(imgList.get(i));
				String actual =	webDriverActions.getAttribute("src", imgList.get(i));
				webDriverActions.softHighlightElement(imgList.get(i));
				webDriverActions.softClickJS(imgList.get(i));
				//							webDriverActions.waitForPageToLoad();
				String currentPage =webDriverActions.getCurrentPageUrl();
				String expectedUrl = webDriverActions.getCurrentPageUrl();
				if(expectedUrl.equalsIgnoreCase(homeUrl))
				{
					softAssert.fail("Unable to Navigate in "+actual);
				}
				else if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.waitForPageToLoad();
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
		webDriverActions.softClickJS(moreLnk);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		webDriverActions.waitForPageToLoad();
		webDriverActions.highlightElement(element);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in "+currentPage);
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * @param element
	 * @param breadcrumb
	 * This method is used to Validate the Title Navigation for All Section In Homepage
	 */
	public void verifyTitleNavigation(String serverType , WebElement element , WebElement breadcrumb)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(element);
		webDriverActions.softMouseHover(element);
		webDriverActions.softClickJS(element);
		webDriverActions.waitForPageToLoad();
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(breadcrumb);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb), "Unable to Display Element in"+currentPage);
		softAssert.assertAll("Issue in Homepage Body ");
	}


	public void verifyPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, priorityPanelArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyPriorityPanelImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, priorityPanelImgLnk, articleBreadCrumbDiv);
	}

	public void verifyTopNewsArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, topNewsArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyTopNewsImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, topNewsImgLnk, articleBreadCrumbDiv);
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
				webDriverActions.waitForPageToLoad();
				String currentPage =webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), currentPage);
				if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.waitForPageToLoad();
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
			for(int i=0; i<webstoriesImgLnk.size() ;i++)
			{
				webDriverActions.softClickJS(webstoriesSliderBtn.get(i));
				webDriverActions.softClickJS(activeWebstoriesImgLnk);
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();
				String currentPage =webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), currentPage);
				if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
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

	public void verifyTopStoriesArticleNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String title = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillAllElement(topstoryArticleLnk, 20);
		if(topstoryArticleLnk.size()>0)
		{
			webDriverActions.softScrollToElement(topstoryArticleLnk.get(0));
			webDriverActions.softMouseHover(topstoryArticleLnk.get(0));
			for(int i=0; i<topstoryArticleLnk.size() ;i++)
			{
				webDriverActions.softClickJS(topstorySliderBtn.get(i));
				webDriverActions.softClickJS(activeTopstoryArticleLnk);
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();
				String currentPage =webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), currentPage);
				if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.waitForSecond(1000);
				webDriverActions.softHighlightElement(articleBreadCrumbDiv);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in "+currentPage);;
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

	public void verifyTopStoriesImageNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String title = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillAllElement(topstoryImgLnk, 20);
		if(topstoryArticleLnk.size()>0)
		{
			webDriverActions.softScrollToElement(topstoryImgLnk.get(0));
			webDriverActions.softMouseHover(topstoryImgLnk.get(0));
			for(int i=0; i<topstoryImgLnk.size() ;i++)
			{
				webDriverActions.softClickJS(topstorySliderBtn.get(i));
				webDriverActions.softClickJS(activeTopstoryImgLnk);
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();
				String currentPage =webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), currentPage);
				if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.waitForPageToLoad();
				webDriverActions.softHighlightElement(articleBreadCrumbDiv);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in "+currentPage);;
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

	public void verifyTopStoriesSliderNavigation()
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(topstoryTitleLnk);
		webDriverActions.softScrollToElement(topstoryTitleLnk);
		if(webDriverActions.isElementDisplayed(activeTopstoryArticleLnk))
		{
			for(int i = 0 ; i< topstorySliderBtn.size() ; i++)
			{
				webDriverActions.softMouseHover(activeTopstoryArticleLnk);
				webDriverActions.softScrollToElement(activeTopstoryArticleLnk);
				String beforeSlide = webDriverActions.getTextFromElement(activeTopstoryArticleLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softHighlightElement(topstorySliderBtn.get(i));
				webDriverActions.softClickJS(topstorySliderBtn.get(i));
				webDriverActions.waitForSecond(2000);
				String afterSlide = webDriverActions.getTextFromElement(activeTopstoryArticleLnk);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Slider is Not Working ");
			}
		}
		else
		{
			softAssert.fail("Possibly Slider Button Is Not Displayed ");
		}
	}

	public void verifyTopStoryTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , topstoryTitleLnk, articleBreadCrumbDiv);
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

	public void verifyTrendArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, trendArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyTrendImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, trendImgLnk, articleBreadCrumbDiv);
	}

	public void verifyTrendReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, trendReadMoreLnk, articleBreadCrumbDiv);
	}

	public void verifyTrendTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, trendTitleLnk, articleBreadCrumbDiv);
	}

	//---------------------Anupam*Business logic------------

	//--------------------------------Anupam Business logic----
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
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(1000);
		webDriverActions.scrollToPoint(0, 0);
		webDriverActions.continuousScrollTillElement(section, 20);
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

			webDriverActions.waitForSecond(1000);
			String currentPage = webDriverActions.getCurrentPageUrl();
			String expectedUrl = webDriverActions.getCurrentPageUrl();

			if (serverType.equalsIgnoreCase("preProd")) {
				if(currentPage.contains("//beta")) {
					Logs.info(getClass(), "url already contain beta");
				}
				else {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			} 

			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(2000);
			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element "+element +" in "+currentPage);
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
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(1000);
		webDriverActions.scrollToPoint(0, 0);
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

			webDriverActions.waitForSecond(1000);
			String currentPage = webDriverActions.getCurrentPageUrl();
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd")) {
				if(currentPage.contains("//beta")) {
					Logs.info(getClass(), "url already contain beta");
				}
				else {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			} 

			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(2000);
			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) ,  "Unable to Display Element "+element + " in "+currentPage);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
				webDriverActions.waitForSecond(1000);
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
	public void verifyMoreLnks(String serverType,WebElement moreLnk, WebElement breadcrumb) 
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(1000);
		webDriverActions.scrollToPoint(0, 0);
		webDriverActions.continuousScrollTillElement(moreLnk, 20);	
		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		webDriverActions.softHighlightElement(moreLnk);
		String actualUrl = webDriverActions.getAttribute("href", moreLnk);
		Logs.info(getClass(),"Actual text Before Click " + actualUrl);
		webDriverActions.softClickJS(moreLnk);
		webDriverActions.waitForPageToLoad();

		webDriverActions.waitForSecond(1000);
		String currentPage = webDriverActions.getCurrentPageUrl();
		softAssert.assertEquals(actualUrl, currentPage , "Unable to Navigate "+actualUrl);

		if (serverType.equalsIgnoreCase("preProd")) {
			if(currentPage.contains("//beta")) {
				Logs.info(getClass(), "url already contain beta");
			}
			else {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		} 

		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForSecond(2000);
		webDriverActions.softHighlightElement(breadcrumb);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+ " in "+currentPage);
		softAssert.assertAll("Issue Found in HomePage Body More Link");
	}

	/**
	 * @author AnupamGupta
	 * This method is used to Verify the More Widget News Navigation
	 * @param serverType
	 * @param section
	 * @param breadcrumb
	 */
	public void verifySectionLnks(String serverType,WebElement section, WebElement breadcrumb) 
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(1000);
		webDriverActions.scrollToPoint(0, 0);
		webDriverActions.continuousScrollTillElement(section, 20);	
		webDriverActions.softMouseHover(section);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softHighlightElement(section);
		String actualUrl = webDriverActions.getAttribute("href", section);
		Logs.info(getClass(),"Actual text Before Click " + actualUrl);
		webDriverActions.softClickJS(section);
		webDriverActions.waitForPageToLoad();

		webDriverActions.waitForSecond(1000);
		String currentPage = webDriverActions.getCurrentPageUrl();
		softAssert.assertEquals(actualUrl, currentPage , "Unable to Navigate "+actualUrl);

		if (serverType.equalsIgnoreCase("preProd")) {
			if(currentPage.contains("//beta")) {
				Logs.info(getClass(), "url already contain beta");
			}
			else {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		} 

		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForSecond(2000);
		webDriverActions.softHighlightElement(breadcrumb);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+" in "+currentPage);
		webDriverActions.waitForSecond(1000);
		softAssert.assertAll("Issue Found in HomePage Body Section Link");
	}

	//-----State

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of State Widget
	 */
	public void verifyStateWidget(String serverType) {
		verifySectionLnks(serverType,stateSectionLnk, stateBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Career State Article
	 */
	public void verifyStateWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,stateSectionLnk,stateSectionArticleLnk, stateBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of State Widget Image
	 */
	public void verifyStateWidgetImg(String serverType) {
		verifyImgNavigation(serverType,stateSectionLnk,stateSectionImgLnk, stateBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More State News
	 */
	public void verifyMoreStateLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreStateSectionLnk, stateBreadcrumb);
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

	//-----------Photo

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of MobileAndTech Widget
	 */
	public void verifyPhotoWidget(String serverType) {
		verifySectionLnks(serverType,photosBodySectionLnk, photosBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation in home page
	 * @param serverType
	 * @param section
	 * @param artList
	 */
	public void verifyPhotosArticlesNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(photosBodySectionLnk, 20);
		webDriverActions.softMouseHover(photosBodySectionLnk);
		webDriverActions.softScrollToElement(photosBodySectionLnk);
		webDriverActions.softHighlightElement(photosBodySectionLnk);
		webDriverActions.waitForSecond(1000);

		for(int j =0 ; j<photosTabsLnk.size() ; j++)
		{
			//			webDriverActions.continuousScrollTillAllElement(photosTabsLnk, 20);
			webDriverActions.softScrollToElement(photosTabsLnk.get(j));
			webDriverActions.softHighlightElement(photosTabsLnk.get(j));
			webDriverActions.softClickJS(photosTabsLnk.get(j));
			webDriverActions.waitForSecond(2000);
			softAssert.assertTrue(photosSectionArticleLnk.size()>0, " Possibly Element is Not Visible "+ photosSectionArticleLnk );
			for(int i=0; i<photosSectionArticleLnk.size() ;i++)
			{
				//				webDriverActions.softMouseHover(photosSectionArticleLnk.get(i));
				//				webDriverActions.softScrollToElement(photosSectionArticleLnk.get(i));
				String actualUrl =	webDriverActions.getAttribute("href", photosSectionArticleLnk.get(i));
				Logs.info(getClass(), actualUrl);
				webDriverActions.softClickJS(photosSectionArticleLnk.get(i));
				webDriverActions.waitForPageToLoad();

				webDriverActions.waitForSecond(1000);
				String currentPage = webDriverActions.getCurrentPageUrl();
				String expectedUrl = webDriverActions.getCurrentPageUrl();

				if (serverType.equalsIgnoreCase("preProd")) {
					if(currentPage.contains("//beta")) {
						Logs.info(getClass(), "url already contain beta");
					}
					else {
						String betaUrl = genericUtility.replaceInUrl(currentPage);
						webDriverActions.navigateToUrl(betaUrl);
						currentPage=betaUrl;
						webDriverActions.waitForPageToLoad();
						webDriverActions.waitForSecond(1000);
					}
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				} 

				//				webDriverActions.softHighlightElement(photosBreadcrumb);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(photosBreadcrumb) , "Unable to Display Element "+photosBreadcrumb +" in "+currentPage);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForSecond(1000);
				webDriverActions.softMouseHover(photosTabsLnk.get(j));
				webDriverActions.softHighlightElement(photosTabsLnk.get(j));
				webDriverActions.softClickJS(photosTabsLnk.get(j));
				webDriverActions.waitForSecond(2000);
			}

		}
		softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	
	}

	/**
	 * @author AnupamGupta
	 * This method is used to verify image navigation of section in home page	
	 * @param serverType
	 */
	public void verifyPhotosImgNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(photosBodySectionLnk, 20);
		webDriverActions.softMouseHover(photosBodySectionLnk);
		webDriverActions.softScrollToElement(photosBodySectionLnk);
		webDriverActions.softHighlightElement(photosBodySectionLnk);
		webDriverActions.waitForSecond(1000);

		for(int j =0 ; j<photosTabsLnk.size() ; j++)
		{
			webDriverActions.softScrollToElement(photosTabsLnk.get(j));
			webDriverActions.softHighlightElement(photosTabsLnk.get(j));
			webDriverActions.softClickJS(photosTabsLnk.get(j));
			webDriverActions.waitForSecond(2000);
			softAssert.assertTrue(photosSectionImgLnk.size()>0, " Possibly Element is Not Visible "+ photosSectionImgLnk );
			for(int i=0; i<photosSectionImgLnk.size() ;i++)
			{
				webDriverActions.softMouseHover(photosSectionImgLnk.get(i));
				webDriverActions.softScrollToElement(photosSectionImgLnk.get(i));
				webDriverActions.softClickJS(photosSectionImgLnk.get(i));
				webDriverActions.waitForPageToLoad();

				webDriverActions.waitForSecond(1000);
				String currentPage = webDriverActions.getCurrentPageUrl();
				String expectedUrl = webDriverActions.getCurrentPageUrl();

				if (serverType.equalsIgnoreCase("preProd")) {
					if(currentPage.contains("//beta")) {
						Logs.info(getClass(), "url already contain beta");
					}
					else {
						String betaUrl = genericUtility.replaceInUrl(currentPage);
						webDriverActions.navigateToUrl(betaUrl);
						currentPage=betaUrl;
						webDriverActions.waitForPageToLoad();
						webDriverActions.waitForSecond(1000);
					}
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				} 

				//				webDriverActions.softHighlightElement(photosBreadcrumb);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(photosBreadcrumb) , "Unable to Display Element "+photosBreadcrumb +" in "+currentPage);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForSecond(1000);
				webDriverActions.softMouseHover(photosTabsLnk.get(j));
				webDriverActions.softHighlightElement(photosTabsLnk.get(j));
				webDriverActions.softClickJS(photosTabsLnk.get(j));
				webDriverActions.waitForSecond(2000);
			}
		}
		softAssert.assertAll("Issue Found in HomePage Body Image Navigation");
	}

	/*********************************DanishR**Business**Logic***********************/

	/**
	 * @author DanishR
	 * @param serverType
	 * Below method is to validate Kannada Section Widget Title
	 */
	public void verifyKannadaTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, kannadaSectionTitleLnk, articleBreadcrumb);
	}

	/**
	 * @author DanishR
	 * This method used to verify kannada Slider Navigation on Home Page
	 */
	public void verifyKannadaSliderNavigation()
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(kannadaSectionNextBtn, 10);
		webDriverActions.softMouseHover(kannadaSectionNextBtn);
		webDriverActions.softScrollToElement(kannadaSectionNextBtn);
		if(webDriverActions.isElementDisplayed(kannadaSectionNextBtn))
		{
			for(int i = 0 ; i< 10 ; i++)
			{
				webDriverActions.softMouseHover(kannadaSectionNextBtn);
				webDriverActions.softScrollToElement(kannadaSectionNextBtn);
				String beforeSlide = webDriverActions.getTextFromElement(activekannadaCityName);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softClickJS(kannadaSectionNextBtn);
				webDriverActions.waitForSecond(2000);
				String afterSlide = webDriverActions.getTextFromElement(activekannadaCityName);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Next Slider is Not Working ");
			}
		}
		else
		{
			softAssert.fail("Possibly Next Slider Button Is Not Displayed ");
		}

		if(webDriverActions.isElementDisplayed(kannadaSectionPreviousBtn))
		{
			for(int i = 0 ; i< 10 ; i++)
			{
				webDriverActions.softMouseHover(kannadaSectionPreviousBtn);
				webDriverActions.softScrollToElement(kannadaSectionPreviousBtn);
				String beforeSlide = webDriverActions.getTextFromElement(activekannadaCityName);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softClickJS(kannadaSectionPreviousBtn);
				webDriverActions.waitForSecond(2000);
				String afterSlide = webDriverActions.getTextFromElement(activekannadaCityName);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Previous Slider is Not Working ");
			}
		}
		else
		{
			softAssert.fail("Possibly Previous Slider Button Is Not Displayed ");
		}
		softAssert.assertAll("Issue in Homepage Body Kannada Section Widget ");
	}

	/**
	 * @author DanishR
	 * This method is used to click and navigate to kannada Cities Articles
	 */
	public void verifyKannadaCitiesNavigation(String serverType)
	{

		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.softScrollToElement(kannadaSectionCitiesName.get(0));
		softAssert.assertTrue(kannadaSectionCitiesName.size()>0, "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());

		/* Below loop validates the kannada cities articles Navigations */
		for (int i = 0; i < 1;i++) {
			webDriverActions.softHighlightElement(kannadaSectionCitiesName.get(i));
			webDriverActions.softMouseHover(kannadaSectionCitiesName.get(i));
			webDriverActions.softClickJS(kannadaSectionCitiesName.get(i));
			webDriverActions.waitForSecond(2000);

			for (int j = 0; j < kannadaSectionArticleLnk.size();j++) {
				webDriverActions.softHighlightElement(kannadaSectionArticleLnk.get(j));
				webDriverActions.softMouseHover(kannadaSectionArticleLnk.get(j));
				webDriverActions.softClickJS(kannadaSectionArticleLnk.get(j));
				webDriverActions.waitForSecond(2000);
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
				webDriverActions.softHighlightElement(kannadaSectionCitiesName.get(i));
				webDriverActions.softMouseHover(kannadaSectionCitiesName.get(i));
				webDriverActions.softClickJS(kannadaSectionCitiesName.get(i));
				webDriverActions.waitForSecond(2000);
			}
		}
		softAssert.assertAll("Issues Found In Validating kannada Section Cities Articles Present on HomePage");
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to verify Read more Link of kannada section
	 */
	public void verifyKannadaReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType,kannadaSectionReadMoreLnk , articleBreadcrumb);
	}


	/**
	 * @author DanishR
	 * This method is used to click and navigate to kannada Cities Articles
	 */
	public void kannadaCitiesAticleLinksTest(String serverType)
	{
		HomePageLinksValidation http = new HomePageLinksValidation(driver);
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(kannadaSectionCitiesName.get(0));
		softAssert.assertTrue(kannadaSectionCitiesName.size()>0, "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());
		ArrayList<String> articleList = new ArrayList<>();
		webDriverActions.waitForElement(1000);

		for (int i = 0; i <kannadaSectionCitiesName.size() ;i++) {
			webDriverActions.softMouseHover(kannadaSectionCitiesName.get(i));
			webDriverActions.softHighlightElement(kannadaSectionCitiesName.get(i));
			webDriverActions.softClickJS(kannadaSectionCitiesName.get(i));
			webDriverActions.waitForSecond(2000);
			for (int j = 0; j < kannadaSectionArticleLnk.size();j++) {
				String aticleLink = kannadaSectionArticleLnk.get(j).getAttribute("href");
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
	 * This method used to navigate to All News18 Languages present in Home Page Header
	 */
	public void verifyChangeLanguage() {
		webDriverActions.waitForPageToLoad();
		String parentTitle = webDriverActions.getPageTitle();
		if (changeLanguageList.size()>0) {
			for (int i = 1; i < changeLanguageList.size(); i++) {
				webDriverActions.softMouseHover(changeLanguageBtn);
				webDriverActions.softHighlightElement(changeLanguageList.get(i));
				webDriverActions.waitForSecond(2000);
				webDriverActions.softClickJS(changeLanguageList.get(i));
				//				webDriverActions.waitForPageToLoad();
				webDriverActions.waitForSecond(2000);
				webDriverActions.switchToNewWindow();
				String languageUrl=webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), "Naviagted to "+languageUrl);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(logoHeader),"Unable to display "+languageUrl);
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
				webDriverActions.waitForSecond(2000);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+changeLanguageList.size());
		}

		softAssert.assertAll("Issues found in this Url "+ webDriverActions.getCurrentPageUrl());
	}


	/**
	 * @author DanishR
	 * This method validates Live Tv navigation from HomaPage
	 */
	public void verifyHeaderLiveTv(String serverType) {
		webDriverActions.waitForPageToLoad();
		webDriverActions.softClickJS(headerLiveTv);
		String currentPageUrl = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preProd") && !currentPageUrl.contains("//beta")) {
			String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
			webDriverActions.navigateToUrl(betaUrl);
			currentPageUrl=betaUrl;
		}
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(watchLiveTVHeader),"Possibily element is not visible "+currentPageUrl);
		softAssert.assertAll("Issues found in Home Page Header Live Tv");
	}

	/**
	 * @author DanishR
	 * This method validates Download App navigation from HomaPage
	 */
	public void verifyDownloadApp(String serverType) {
		webDriverActions.waitForPageToLoad();
		String parent = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(downloadNews18AppLnks.size()>0," Possibly element is not visible "+parent);
		for (int i = 0; i < downloadNews18AppLnks.size(); i++) 
		{
			webDriverActions.waitForSecond(2000);
			webDriverActions.softHighlightElement(downloadNews18AppLnks.get(i));
			webDriverActions.mouseHover(downloadNews18AppLnks.get(i));
			webDriverActions.softClickJS(downloadNews18AppLnks.get(i));
			webDriverActions.switchToNewWindow();
			webDriverActions.waitForSecond(2000);
			String currentPage = webDriverActions.getCurrentPageUrl();

			if (currentPage.contains("google")) {
				Logs.info(getClass(), "Navigated to " + webDriverActions.getCurrentPageUrl());
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(playStoreHeader),"Possibly element not visible "+webDriverActions.getCurrentPageUrl());
				webDriverActions.navigateToUrl(parent);
			}

			else if (currentPage.contains("apple")) {
				Logs.info(getClass(), "Navigated to " + webDriverActions.getCurrentPageUrl());
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(appleHeader),"Possibly element not visible "+webDriverActions.getCurrentPageUrl());
				webDriverActions.navigateToUrl(parent);
			}

			else {
				Logs.info(getClass(), "Possibly element not found "+currentPage);
			}
		}
		softAssert.assertAll("Issues found in Home Page Header Download App ");
	}


	/**
	 * @author DanishR
	 * This method validates social Media navigation present on Home Page
	 */
	public void verifySocialMedia() {
		webDriverActions.waitForPageToLoad();
		String parent = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(socialMediaIconsLnk.size()>0, " Possibly Element is not Visible "+ socialMediaIconsLnk );
		for (int i = 0; i < socialMediaIconsLnk.size(); i++) {
			webDriverActions.softHighlightElement(socialMediaIconsLnk.get(i));//used to Highlight the particular element
			webDriverActions.softClickJS(socialMediaIconsLnk.get(i));
			webDriverActions.waitForSecond(2000);
			webDriverActions.switchToNewWindow();
			webDriverActions.waitForSecond(2000);
			String currentPage = webDriverActions.getCurrentPageUrl();

			//it takes the social share Url from property File
			ArrayList<String> list=new ArrayList<String>();
			list.add(fileUtility.readDataFromPropertyFile("facebook"));
			list.add(fileUtility.readDataFromPropertyFile("twitter"));
			list.add(fileUtility.readDataFromPropertyFile("instagram"));
			list.add(fileUtility.readDataFromPropertyFile("youtube"));

			//Below list adds webelements of social share icons
			ArrayList<WebElement> listEle=new ArrayList<WebElement>();
			listEle.add(facebookHeader);
			listEle.add(twitterHeader);
			listEle.add(instagramHeader);
			listEle.add(youtubeHeader);

			// it will iterate the list and validate s
			for(int j=0;j<list.size();j++)
			{
				if(currentPage.contains(list.get(j)))
				{
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j)), " Possibly Element Is Not Visible For This URL "+currentPage);	
				}
			}
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(parent);

		}
		softAssert.assertAll("Issues found in Home Page Header Social Media ");
	}


	/**
	 * @author DanishR
	 * This method is used to Validate Trending Topics Section in Home Page
	 */
	public void verifyTrendingTopics(String serverType) {
		webDriverActions.waitForPageToLoad();
		String parent = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(headerTrendingTopicsLnks.size()>0, " Possibly Element is Not Visible "+ webDriverActions.getCurrentPageUrl());
		for (int i = 0;i<headerTrendingTopicsLnks.size() ; i++) {
			webDriverActions.softClickJS(headerTrendingTopicsLnks.get(i));
			String currentPage = webDriverActions.getCurrentPageUrl();
			//Below if condition replaces to Beta Url
			if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				Logs.info(getClass(), "Navigated to "+currentPage);
			} 
			webDriverActions.waitForPageToLoad();
			Logs.info(getClass(), "Navigated to Trending Topic Link "+ webDriverActions.getCurrentPageUrl());
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Failed to Display "+currentPage);
			webDriverActions.navigateToUrl(parent);
		}
		softAssert.assertAll("Issues found in this Url "+ webDriverActions.getCurrentPageUrl());
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the Photo Section Headline
	 */
	public void verifyPhotoSectionHeadline(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(photoRhs);
		webDriverActions.softMouseHover(photoRhs);
		webDriverActions.softClickJS(photoRhs);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(photoRhs);
			webDriverActions.softScrollToElement(photoRhs);
			String actual = webDriverActions.getAttribute("href", photoRhs);
			Logs.info(getClass(), actual);
			webDriverActions.waitForSecond(2000);
			webDriverActions.softClickJS(photoRhs);
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
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the articles of Photo Section
	 */
	public void verifyPhotoArticleList(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(photoRhs);
		if(photoArticleLnk.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<photoArticleLnk.size();i++)
			{
				webDriverActions.waitForSecond(2000);
				webDriverActions.softClickJS(photoArticleLnk.get(i));
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
	 * @author Sharon
	 * @throws InterruptedException
	 * This method is used to click on the functionalities on the Live Tv
	 */
	public void verifyLiveTv() throws InterruptedException {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		webDriverActions.waitForElement(2000);
		//vidgyor_iframe is the frame name for Live TV
		webDriverActions.switchToFrame("vidgyor_iframe");
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.highlightElement(liveTvPlayer);
		if (videoAds.isDisplayed()) {
			DriverUtility.getDriver().switchTo().frame(videoAdsIframe);
			webDriverActions.waitForSecond(2000);
			webDriverActions.softMouseHover(skipAd);
			webDriverActions.softHighlightElement(skipAd);
			webDriverActions.mouseHoverAndClick(skipAd);
			DriverUtility.getDriver().switchTo().parentFrame();
		}
		else {
			Logs.info(getClass(), "Live TV is Displayed ");
		}

		/* Pause button */
		webDriverActions.waitForSecond(4000);
		webDriverActions.softMouseHover(mouseoverActionBar);
		webDriverActions.softClickJS(pauseBtn);
		Logs.info(getClass(),"LiveTv is paused");
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(playBtn),"Unable to display Element");

		/* Play Button */				
		webDriverActions.softClickJS(playBtn);
		Logs.info(getClass(),"Live Tv Playing");

		/* Unmute Button */
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softMouseHover(mouseoverActionBar);
		webDriverActions.softClickJS(unmuteBtn);
		Logs.info(getClass(),"audio unmuted");
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(muteBtn),"Unable to display Element");

		/* Mute Button */
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softMouseHover(mouseoverActionBar);
		webDriverActions.softClickJS(muteBtn);
		Logs.info(getClass(),"audio is muted");

		/* Share Button */
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softClickJS(shareBtn);
		Logs.info(getClass(),"clicked on share Button");
		webDriverActions.softClickJS(shareCloseBtn);
		Logs.info(getClass(),"clicked on close Button");

		/* Maximize Button */
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softMouseHover(mouseoverActionBar);
		webDriverActions.softClickJS(maximizeBtn);
		Logs.info(getClass(), "Maximized Live Tv");

		/* Minimize Button */
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softClickJS(minimizeBtn);
		Logs.info(getClass(), "Minimized Live Tv");
		softAssert.assertAll("Live Tv Functionalities are not working fine "+ webDriverActions.getCurrentPageUrl()); 
	}

	/**
	 * @author DanishR
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

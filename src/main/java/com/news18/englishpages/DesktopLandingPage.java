package com.news18.englishpages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.asserts.SoftAssert;

import com.news18.init.DriverUtility;
import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Abhishek raj
 * This class contains WebElements and BusinessLogic of Desktop Landing Page
 */

public class DesktopLandingPage  {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	public SoftAssert softAssert = new SoftAssert();



	public DesktopLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Homepage article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="(//div[contains(@class,'top_story_right')]//li/a[not(contains(@href,'live')) and contains(@href,'/news/')])[1]")
	private WebElement homePageArticleLnks;

	/*Videos link present after clicking on Hamburger menu*/
	@FindBy(xpath ="//div[contains(@class,'sub-nav')]//li//a[text()='Videos']")
	private WebElement videosSectionLnk;

	/* Video Article Link present on Video Page*/
	@FindBy(xpath ="//div[contains(@class,'videoListingTopVideos')]//ul/li/a")
	private List<WebElement> videosArticleLnks;

	/*Homepage LiveBlog article Link  is present below the LineTwo Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@class,'top_story')]//a[contains(@href,'live-update')]")
	private List<WebElement> homePageLiveBlogArticleLnks;

	/*Latest News Article Link  present inside Latest News at RHS of page  */
	@FindBy(xpath ="//span[text()='Latest News']/../..//li")
	private List<WebElement> latestNewsArticleLnk;

	/*Top Story First Article Text is present below L2 Section */
	@FindBy(xpath ="//h1")
	private WebElement firstTopStoryArticleTxt;

	/*Top Story First Article Link is present below L2 Section*/
	@FindBy(xpath ="//h1/..")
	private WebElement  firstTopStoryLnk;

	/*RHS Promoted Content present in All Pages Except Home Page */
	@FindBy(xpath ="//div[@id='outbrain_widget_1' or @class='OUTBRAIN']//ul")
	private List<WebElement> rhsPromotedContentArticle;

	/*All Astro Sign is present inside the HomePage Horoscope Section*/
	@FindBy(xpath ="//span[text()='Horoscope' or text()='HOROSCOPE']/../../following-sibling::div//div/div/a")
	private List<WebElement> astroSigns;

	/*Social Link is present in Footer Section */                                                   
	@FindBy(xpath ="//div[@class='social_icon']//div[@class='social_net']//a")
	private List<WebElement> socialLnk;

	/*Trending Topics All Links are present in Footer Section*/
	@FindBy(xpath ="//span[contains(.,'TRENDING')]/following-sibling::div//a")
	private List<WebElement> trendingTopicsLnk;

	/*Article Links present in video wall Section*/
	@FindBy(xpath ="//div[@class='from-show']//ul/li")
	private List<WebElement> articlesLnk;

	/*HomePage covid updated time*/
	@FindBy(xpath="(//div[contains(@class,'corona-m-box')])[3]/child::span")
	private WebElement covidUpdatedTime;

	/*Videos Articles Link are present in Videos Section*/
	@FindBy(xpath ="//span[text()='Videos']//ancestor::h2/following-sibling::div[@class='pnv-gallery']//li[contains(@class,'slick-active')]/a")
	private List<WebElement> videosArticlesLnk;

	/*Videos Article List present in the Videos Section*/ 
	@FindBy(xpath ="//span[text()='Videos']//ancestor::h2/following-sibling::div[@class='pnv-gallery']//li[contains(@class,'slick-active')]")
	private List<WebElement> videosArticlesList;

	/*Top News List Link  is present below the L2 Tag  Menu in RHS*/
	@FindBy(xpath ="//ul[@class='lead-mstory']/li/a")
	private List<WebElement> topNewsLstLnk;


	/*Home Link is present in the Top Main Menu Bar*/
	@FindBy(xpath ="//ul[@class='fleft nav-box']/li/a[text()='Home']")
	private WebElement homLnk;

	/*Tracker Link is present in the Top Main Menu Bar*/
	@FindBy(xpath ="//ul[contains(@class,'topNavList')]//li[contains(@class,'entryPointCovid')]/a")
	private WebElement trackerLnk;

	/*Updated Date Link  is present in the Covid-19 Tracker box*/
	@FindBy(xpath ="//div[@class='corona-m-ftr']/div[@class='corona-m-box']/span[@id='UpdatedStateTimeStamp']")
	private WebElement updatedDateLnk;

	/*First Rhs Top Article Link present in the Lifestyle,Movies,Business,Education-Career,Explainers page in L2 Menu Bar*/
	@FindBy(xpath ="//div[contains(@class,'top_story_right')]/ul/li[1]/a")
	private WebElement firstArticleLnk;


	/*photo section Present in L1 navigation bar */
	@FindBy(xpath="//ul[@class='fleft nav-box']//a[text()='Photos']")
	private WebElement photoSectionL1;

	/*HomePage PhotoGallery Click on First Article   */
	@FindBy(xpath ="//a[text()='Photogalleries']//ancestor::h2/following-sibling::div[@class='pnv-gallery']//li[contains(@class,'slick-active')]//h4/a")
	private WebElement photoGalleryArticleLnk;

	/*Photogallery First Article Link is present Latest News On PhotoGallery in photo section*/
	@FindBy(xpath="//ul[contains(@class,'photoGalleryList')]//a[1]")
	private WebElement photogalleryArticleLnk;

	/*List of advertisement present in page */
	@FindBy(xpath="//iframe[@aria-label='Advertisement']")
	private List<WebElement> ads;

	/*Latest Section in line one navigation bar*/
	@FindBy(xpath="//div//ul//li//a[contains(text(),'Latest')]")
	private WebElement latestSectionLnk;

	/*Outbrain Block present at the Footer Portion*/
	@FindBy(xpath ="//div[@class='OUTBRAIN']")
	private WebElement outbrainBlock;

	/*Promoted Content All Article List present inside Outbrain*/
	@FindBy(xpath ="//div[@class='ob-widget-items-container']//section/span[1]")
	private List<WebElement> promotedContentArticleList;

	/*Promoted Content image is present inside Promoted Content*/
	@FindBy(xpath ="//div[@class='ob-widget-items-container']//span[@class='ob-unit ob-rec-image-container']")
	private List<WebElement> promotedContentImg;

	/*Outbrain Text  is present in the above the Footer and Rhs of Promoted Content*/
	@FindBy(xpath ="//div[contains(@class,'ob_what ob_what_resp')]//span[@class='ob_logo']")
	private List<WebElement> outbrainTxt;

	/*photo section Present in Line One navigation bar */
	@FindBy(xpath="//div[contains(@class,'sub-nav')]//ul[contains(@class,'clearfix')]//a[contains(@href,'/photogallery/')]")
	private WebElement photoSectionLineOneLnk;

	/*Trending Topics First Link is present in Footer of home page*/
	@FindBy(xpath="(//span[contains(.,'TRENDING')]/following-sibling::div//a[contains(@href,'topics')])[1]")
	private WebElement trendingTopicsfirstLnk;

	/*Hamburger Menu Link is present in the Top Main Menu*/
	@FindBy(xpath ="//div[contains(@class,'hamburger')]")
	private WebElement hamburgerMenuLnk;

	/*CricketNext link present after clicking on Hamburger menu*/
	@FindBy(xpath ="//div[contains(@class,'sub-nav')]//ul[contains(@class,'clearfix')]//a[(text()='Cricket')]")
	private WebElement cricketNextLnk;

	/* Link of Gold Price Today in footer Tending Topics section in Homepage */
	@FindBy(xpath ="//div[contains(@class,'trending-row')]//a[contains(@href,'topics') and contains(text(),'Gold')]" )
	private WebElement footerGoldPriceTopicLnk;

	//	****************************Danish***WebElement*******************************

	/* Change Language List present in Homepage Header*/
	@FindBy(xpath ="//div//span[contains(text(),'CHANGE LANGUAGE')]//parent::div//a[contains(@href,'news18')]" )
	private List<WebElement> changeLanguageList;

	/*Change Language Button present at Header Part*/
	@FindBy(xpath="(//div//span[contains(text(),'CHANGE LANGUAGE')]//parent::div//a[contains(@href,'news18')])[1]")
	private WebElement changeLanguageBtn;

	/*Home Page Header Watch Live TV*/
	@FindBy(xpath="//div[contains(@class,'nhlivetv')]//a[contains(@href,'livetv')]")
	private WebElement headerLiveTv;

	/*Home Page Header Watch Live TV Page Attribute*/
	@FindBy(xpath="//h1")
	private WebElement h1Txt;

	/*Download News-18 App Link is present on the Top before the Follow us on link*/
	@FindBy(xpath ="//div[contains(@class,'lnlapp')]/a")
	private WebElement downloadNews18AppLnk;

	/*List Of App Store Image after clicking on News18 Download App present in header*/
	@FindBy(xpath ="//div[@class='gpaimg']//a//img")
	private List<WebElement> appStore;

	/*Social Media icons present in header of HomePage*/
	@FindBy(xpath ="(//div[contains(@class,'social')])[1]//a[contains(@href,'news18')]")
	private List<WebElement> socialMediaIconsLnk;

	/*Trending Topics First Link is present in Header of home page*/
	@FindBy(xpath="//div[contains(@class,'trandingTopics')]//a[contains(@href,'news18')]")
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
	@FindBy(xpath ="//div[contains(@class,'brade_crum')] | //div[contains(@class,'bread')]  | //ul[contains(@class, 'bread')] | //div[contains(@class, 'bred')] | (//h1)[1]")
	private WebElement articleBreadcrumb;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'livetv-container')]//h1")
	private WebElement watchLiveTVHeader;

	//************************Vipin********************************************************

	/* List of Article Links in Priority Panel in Homepage */
	@FindBy(xpath ="//div[contains(@class,'top_story')]//figure/a[contains(@class,'head_story')]" )
	private List<WebElement> priorityPanelHeaderArticleLnk;

	@FindBy(xpath ="//div[contains(@class,'top_story')]//figure/a[contains(@class,'head_story')]" )
	private WebElement temppriorityPanelHeaderArticleLnk;

	/* List of SubHeader Article Links in Priority Panel in Homepage */
	@FindBy(xpath ="//div[contains(@class,'top_story')]//ul/li/a" )
	private List<WebElement> priorityPanelArticleLnk;

	/* List of Article Links in Priority Panel in Homepage */
	@FindBy(xpath ="//div[contains(@class,'top_story')]//a//img" )
	private List<WebElement> priorityPanelImgLnk;

	/* Article Header Text in Article Consumption Page */
	@FindBy(xpath ="//h1[contains(@class,'article_heading')] | //h1[contains(@class,'live_blog')] | //h1[contains(@class,'gallery_tilte')] | //div[contains(@class,'article-box')]/h1" )
	private WebElement articleHeaderTxt;

	/* More News From Showsha Link in News18 Showsha Widget In Homepage */
	@FindBy(xpath ="//div[contains(@class,'ss_wrp')]/div[contains(@class,'header')]/a[contains(@class,'more')]" )
	private WebElement moreFromNews18ShowshaLnk;

	/* News18 Showsha Logo Link in HOmepage*/
	@FindBy(xpath = "//div[contains(@class,'ss_wrp')]//div[contains(@class,'logo')]/a[contains(@class,'ss_logo')]")
	private WebElement news18ShowshaLogoLnk;

	/* List of Image Links in News18 Showsha Widget In Homepage */
	@FindBy(xpath ="//div[contains(@class,'ss_wrp')]/div[contains(@class,'ss_parent')]//a//img[contains(@aria-hidden,'true')]" )
	private List<WebElement> news18ShowshaImgLnk;

	/* List of Articles Links in News18Showsha Homepage */
	//div[contains(@class,'ss_wrp')]/div[contains(@class,'ss_parent')]//div[contains(@class,'copy')]
	@FindBy(xpath ="//div[contains(@class,'ss_wrp')]/div[contains(@class,'ss_parent')]//a" )
	private List<WebElement> news18ShowshaArticleLnk;

	/* Hot and Trending Widget Text in Homepage */
	@FindBy(xpath ="//div[contains(@class,'hot_trending')]//span" )
	private WebElement hotAndTrendingWidgetTxt;

	/* List of Hot and Trending Widget Articles in Homepage */
	@FindBy(xpath ="//div[contains(@class,'hot_trending')]//ul/li//h4/a" )
	private List<WebElement> hotAndTrendingArticleLnk;

	/* List of Hot and Trending Widget Articles in Homepage */
	@FindBy(xpath ="//div[contains(@class,'hot_trending')]//ul/li//img" )
	private List<WebElement> hotAndTrendingImgLnk;

	/* WebStories Left Arrow Button */
	@FindBy(xpath ="//div[contains(@class,'story_list')]//div[contains(@class,'next_arrow')]//a[contains(@id,'button_1')]" )
	private WebElement webStoriesLeftArrowBtn;

	/* WebStories Right Arrow Button */
	@FindBy(xpath ="//div[contains(@class,'story_list')]//div[contains(@class,'next_arrow')]//a[contains(@id,'button_2')]" )
	private WebElement webStoriesRightArrowBtn;

	/* List of Images in WebStories Widget */
	@FindBy(xpath ="//div[contains(@class,'story_list')]/div[contains(@id,'webstory')]//div[contains(@class,'story_img')]/img" )
	private List<WebElement> webStoriesImgLnk;

	/* List of Article Link in WebStories Widget */
	@FindBy(xpath ="//div[contains(@class,'story_list')]/div[contains(@id,'webstory')]//figcaption/div/a" )
	private List<WebElement> webStoriesArticleLnk;

	/*List of Next Webstories Button Slider for Webstories in HOmepage */
	@FindBy(xpath = "//div[contains(@class,'story_list')]/div[contains(@id,'webstory')]//div[contains(@class,'next_arrow')]//button")
	private List<WebElement> webstoriesNextSliderBtn;
	/* Active Webstories Article Text for Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'story_list')]/div[contains(@id,'webstory')]//div[contains(@class,'active')]//figcaption/div/a")
	private WebElement activeWebstoriesArticleTxt;

	/* WebStories Next Story Button after navigation of WebStories Article */
	@FindBy(xpath = "//div[contains(@class,'next-container')]")
	private WebElement nextWebStoryBtn;

	/* WebStory See More Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'story_list')]/div[contains(@class,'story')]/a")
	private List<WebElement> webStoriesSeeMoreLnk;

	/* List of CricketNext Widget Article Links in Homepage */
	@FindBy(xpath ="//div[contains(@class,'cn_widget')]//div[contains(@class,'cnw_outer')]//a" )
	private List<WebElement> cricketNextArticleLnk;

	/* List of CricketNext Widget Article Links in Homepage */
	@FindBy(xpath ="//div[contains(@class,'cn_widget')]//div[contains(@class,'cnw_outer')]//a//img[@title]" )
	private List<WebElement> cricketNextImgLnk;

	/* List Of CricketNext Widget Tab Links in Homepage */
	@FindBy(xpath ="//div[contains(@class,'cn_widget')]//div[contains(@class,'cnw_header')]/a[contains(@class,'nws18')]" )
	private WebElement cricketNextNews18LogoLnk;

	/* List Of CricketNext Widget Tab Links in Homepage */
	@FindBy(xpath ="//div[contains(@class,'cn_widget')]//div[contains(@class,'cnw_header')]/a[contains(@class,'logo')]" )
	private WebElement cricketNextLogoLnk;

	/* More From CricketNext Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cn_widget')]//div[contains(@class,'cnw_header')]/a[contains(@class,'more')]")
	private WebElement cricketNextMoreLnk;

	/* List Of CricketNext Widget Tab Links in Homepage */
	@FindBy(xpath ="//div[contains(@class,'home_cricket_section')]/ul[contains(@class,'links')]/li/a" )
	private List<WebElement> cricketNextTabLnk;

	/* PhotoGallery Widget Text in Homepage */
	@FindBy(xpath ="//div[contains(@class,'home_sldier_section')]/div/a[contains(@href,'/photogallery/')]" )
	private WebElement photogalleryWidgetTxt;

	/* List of PhotoGallery Widget Image Links in Homepage */
	@FindBy(xpath ="//div[contains(@class,'home_sldier_section')]/ul[contains(@id,'photogallery_slider_photogallery')]//li[not(contains(@class , 'glide__slide--clone'))]/figure/a//img" )
	private List<WebElement> photogalleryImgLnk;

	/* List of PhotoGallery Widget Article Links in Homepage */
	@FindBy(xpath ="//div[contains(@class,'home_sldier_section')]/ul[contains(@id,'photogallery_slider_photogallery')]//li[not(contains(@class , 'clone'))]//figcaption/a[2]" )
	private List<WebElement> photogalleryArticleLnks;

	/* PhotoGallery Widget Active Image Link */
	@FindBy(xpath = "//div[contains(@class,'home_sldier_section')]/ul[contains(@id,'photogallery_slider_photogallery')]//li[contains(@class,'active')]/figure/a")
	private WebElement activePhotogalleryImgLnk;

	/* PhotoGallery Widget Active Image Link */
	@FindBy(xpath = "//div[contains(@class,'home_sldier_section')]/ul[contains(@id,'photogallery_slider_photogallery')]//li[contains(@class,'active')]//figcaption/a[2]")
	private WebElement activePhotogalleryArticleLnk;

	/* PhotoGallery Widget Active Image Link */
	@FindBy(xpath = "//div[contains(@class,'home_sldier_section')]/ul[contains(@id,'photogallery_slider_videos')]//li[contains(@class,'active')]/figure/a//img")
	private WebElement activeVideosImgLnk;

	/* PhotoGallery Widget Active Image Link */
	@FindBy(xpath = "//div[contains(@class,'home_sldier_section')]/ul[contains(@id,'photogallery_slider_videos')]//li[contains(@class,'active')]//figcaption/a[2]")
	private WebElement activeVideosArticleLnk;

	/* PhotoGallery Left Arrow Button in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_sldier_section')]/ul[contains(@id,'photogallery_slider_photogallery')]//button[contains(@class,'left')]")
	private WebElement photogalleryLeftArrowBtn;

	/* PhotoGallery Right Arrow Button in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_sldier_section')]/ul[contains(@id,'photogallery_slider_photogallery')]//button[contains(@class,'right')]")
	private WebElement photogalleryRightArrowBtn;

	/* Videos Left Arrow Button in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_sldier_section')]/ul[contains(@id,'photogallery_slider_video')]//button[contains(@class,'left')]")
	private WebElement videosLeftArrowBtn;

	/* Videos Right Arrow Button in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_sldier_section')]/ul[contains(@id,'photogallery_slider_video')]//button[contains(@class,'right')]")
	private WebElement videosRightArrowBtn;

	/* List Of Videos Widget Article Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_sldier_section')]/ul[contains(@id,'photogallery_slider_videos')]//li[not(contains(@class , 'clone'))]//figcaption/a[2]")
	private List<WebElement> videosArticleLnk;

	/* List Of Videos Widget Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_sldier_section')]/ul[contains(@id,'photogallery_slider_videos')]//li[not(contains(@class , 'clone'))]/figure/a//img")
	private List<WebElement> videosImgLnk;

	/*List of Buzz Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'buzz')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> buzzArticleLnk;

	/* Buzz Widget Image in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'buzz')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a//img")
	private List<WebElement> buzzImgLnk;


	/*More News on Buzz Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'buzz')]//ancestor::div[contains(@class,'home_section_row')]/ul/a[contains(@class,'more_link')]")
	private WebElement moreBuzzNewsLnk;

	/* Line One Widget Text */
	@FindBy(xpath = "//div[contains(@class,'headerContainer')]//h2")
	private WebElement widgetHeaderTxt;

	/*List of Education and Carrer Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'education-career')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> educationAndCareerArticleLnk;

	/*Education and Carrer Widget Image in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'education-career')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a//img")
	private List<WebElement> educationAndCareerImgLnk;

	/*More News on Education and Career Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'education-career')]//ancestor::div[contains(@class,'home_section_row')]/ul/a")
	private WebElement moreEducationandCareerNewsLnk;

	/*List of Tech Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/tech/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> techArticleLnk;

	/*List of Tech Widget Image in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/tech/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a//img")
	private List<WebElement> techImgLnk;

	/*More News on Education and Career Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/tech/')]//ancestor::div[contains(@class,'home_section_row')]/ul/a")
	private WebElement moreTechNewsLnk;

	/*List of Auto Widget Articles in Homepage */
	@FindBy(xpath = "//a[@href='/auto/']//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> autoArticleLnk;

	/* Auto Widget Image in Homepage */
	@FindBy(xpath = "//a[@href='/auto/']//ancestor::div[contains(@class,'home_section_row')]/ul/li/a//img")
	private List<WebElement> autoImgLnk;

	/*More News on Auto Link in Homepage */
	@FindBy(xpath = "//a[contains(@href,'/auto/')]/ancestor::div[contains(@class,'home_section_row')]/ul/a")
	private WebElement moreAutoNewsLnk;

	/*List of World Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/world/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> worldArticleLnk;

	/*List of World Widget Image in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/world/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a//img")
	private List<WebElement> worldImgLnk;

	/*More News on World Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/world/')]//ancestor::div[contains(@class,'home_section_row')]/ul/a")
	private WebElement moreWorldNewsLnk;

	/*List of Sports Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/sports/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> sportsArticleLnk;

	/*List of Sports Widget Image in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/sports/')]//ancestor::div[contains(@class,'home_section_row')]/ul//a//img")
	private List<WebElement> sportsImgLnk;

	/*More News on Sports Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/world/')]//ancestor::div[contains(@class,'home_section_row')]/ul/a")
	private WebElement moreSportsNewsLnk;

	/*List of Lifestyle Widget Articles in Homepage */
	@FindBy(xpath = "(//div[contains(@class,'heading_title')]//a[contains(@href,'/lifestyle/')]/ancestor::div[contains(@class,'home_section_row')])[1]/ul/li/a")
	private List<WebElement> lifestyleArticleLnk;

	/*List of Lifestyle Widget Articles in Homepage */
	@FindBy(xpath = "(//div[contains(@class,'heading_title')]//a[contains(@href,'/lifestyle/')]/ancestor::div[contains(@class,'home_section_row')])[1]/ul/li/a//img")
	private List<WebElement> lifestyleImgLnk;

	/*List of Lifestyle Widget Articles in Homepage */
	@FindBy(xpath = "(//div[contains(@class,'heading_title')]//a[contains(@href,'/lifestyle/')]/ancestor::div[contains(@class,'home_section_row')])[1]/ul/a")
	private WebElement lifestyleMoreNewsLnk;

	/*List of Health And Fitness Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/lifestyle/health-and-fitness/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> healthAndFitnessArticleLnk;

	/*List of Health And Fitness Widget Image in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/lifestyle/health-and-fitness/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a//img")
	private List<WebElement> healthAndFitnessImgLnk;

	/*More News On Health And Fitness Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/lifestyle/health-and-fitness/')]//ancestor::div[contains(@class,'home_section_row')]/ul/a")
	private WebElement healthAndFitnessMoreNewsLnk;

	/*List of Explainers Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/explainers/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> explainersArticleLnk;

	/*List of Explainers Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/explainers/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a//img")
	private List<WebElement> explainersImgLnk;

	/*List of Explainers Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/explainers/')]//ancestor::div[contains(@class,'home_section_row')]/ul/a")
	private WebElement explainersMoreNewsLnk;

	/*List of Opinion Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/opinion/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> opinionArticleLnk;

	/*List of Opinion Widget Image in Homepage */
	@FindBy(xpath = "//div[@class='heading_title']/a[(@href='/opinion/')]/ancestor::div[@class='home_section_row']/ul/li/a//img")
	private List<WebElement> opinionImgLnk;

	/*List of Opinion Widget Articles in Homepage */
	@FindBy(xpath = "//div[@class='heading_title']/a[(@href='/opinion/')]/ancestor::div[@class='home_section_row']/ul/a")
	private WebElement opinionMoreNewsLnk;

	/*List of Opinion Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/politics/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> politicsArticleLnk;

	/*List of Opinion Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/politics/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a//img")
	private List<WebElement> politicsImgLnk;

	/*More News on Opinion Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/politics/')]//ancestor::div[contains(@class,'home_section_row')]/ul/a")
	private WebElement politicsMoreNewsLnk;

	/*List of Football Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/football/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> footballArticleLnk;

	/*List of Football Widget Image in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/football/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a//img")
	private List<WebElement> footballImgLnk;

	/*More News on Football Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/football/')]//ancestor::div[contains(@class,'home_section_row')]/ul/a")
	private WebElement footballMoreNewsLnk;

	/*Header Division present in article page*/
	@FindBy(xpath ="//div[contains(@class,'headerContainer')] | //div[contains(@class,'n18')]/div[contains(@class,'container')]")
	private WebElement headerDiv;

	/* Article BreadCrumb Division */
	@FindBy(xpath = "//div[contains(@class,'bread') or contains(@class,'bred') or contains(@class,'Bread') or contains(@class,'heading_title') or contains(@class,'brade')] | //ul[contains(@class, 'bread')]")
	private WebElement articleBreadCrumbDiv;

	/*Video section Article BreadCrumb Division */
	@FindBy(xpath = "//div[contains(@class,'Bread')]")
	private WebElement videoBreadCrumbDiv;

	/* Videos Section Player Text in Video Article page*/
	@FindBy(xpath = "//div[@class='vjs-modal-dialog-content']")
	private WebElement videoPlayerTxt;


	//	**************************Sanjeeb**WebElemt*****************************

	/*electrical Hydra Icon Present On LineTwo Section*/
	@FindBy(xpath ="(//div[contains(@class,'elhead')]//img)[1]")
	private WebElement electricalHydraIcon;

	/*list of sections present in Line One Section Bar present at the header of Homepage*/
	@FindBy(xpath ="//div[contains(@class,'topNavContainer')]/ul/li/a")
	private List<WebElement> lineOneSectionELementLnk;

	/*list of sections Article present in Line One Section Bar after mouse hovering on it present at the header of Homepage*/
	@FindBy(xpath ="//div[contains(@class,'nomoredropdown')]/a")
	private List<WebElement> lineOneSectionArticlesLnk;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'headerContainer')] | //div[contains(@class,'headerContainer')]//h2 | //div[contains(@class,'n18hcontainer')] | (//h1)[1]")
	private WebElement headerTxtLogoLnk;

	//div[contains(@class,'rurmi pa')]//amp-img |

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'head_homepage')] | //div[contains(@class,'mc_interslogo')]")
	private WebElement moneyControlLogoLnk;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'inner_header')]/div[contains(@class,'logo')] | //div[contains(@class,'byjuheaderbox')] ")
	private WebElement missonPaniAndByjuLogoLnk;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'logo-div')] | //div[contains(@class,'launch_info')]")
	private WebElement trueCallerAndNetraSurkshaIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'townhall')] | //div[contains(@class,'logo bxshadow')]")
	private WebElement townHallAndTopLearningIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'header-wrap container')] | //div[contains(@class,'logo-main')] ")
	private WebElement firstPostAndCnbcIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'header-wrap container')] | //div[contains(@class,'container')]")
	private WebElement historyAndMTvIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'navbar-header')]")
	private WebElement clearDoubtGreatLearnigIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'rtImg')] | (//div[contains(@role,'banner')]//div)[1]")
	private WebElement caprepAndFacebookIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//h2 | (//div[contains(@class,'header')])[9]")
	private WebElement twitterAndYoutubeIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'pull-left')] | //div[contains(@class,'hero__media')]")
	private WebElement jioAndIosIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@id,'fixedheader')] | //div[contains(@id,'react-root')]//div/img | //header[contains(@role,'banner')]")
	private WebElement moneyControlInstaPlayStoreIcon;

	/*Search Button Link Present on Line One Section of Homepage*/
	@FindBy(xpath ="//div[contains(@class,'topNavContainer')]//ul[contains(@class,'header_search')]")
	private WebElement searchBtnLnk;

	/*Search Box Link Present on Line One Section of Homepage*/
	@FindBy(xpath ="(//div[contains(@class,'gsc-results')])[1]/div[contains(@class,'gsc-results')]")
	private WebElement closeBtn;

	/*Search Box Button present after clicking on Search Icon present on the Line One Section*/
	@FindBy(xpath ="//div[contains(@id,'gsearch')]//input")
	private WebElement searchBoxBtn;

	/*Search Icon Present After Clicking on The Search Btn Present On the Line One Bar */
	@FindBy(xpath ="//*[local-name()='svg']/parent::button")
	private WebElement insideSearchIcon;

	/*Page Not Found Icon Present In Page */
	@FindBy(xpath ="//div[contains(@class,'pagenotFount')]//h2")
	private WebElement pageNotFoundIcon;

	/*list of sections present inside hamburger menu present on the header of homepage*/
	@FindBy(xpath ="//div[contains(@class,'sub-nav')]//li/a")
	private List<WebElement> hamburgerSectionsLnk;

	/*list of sections present inside line two present on the header of homepage*/
	@FindBy(xpath ="//div[contains(@class,'secondNav')]//a")
	private List<WebElement> lineTwoSectionsLnk;

	/*list of sections present inside Footer present on the Footer of homepage*/
	@FindBy(xpath ="//div[contains(@id,'footer')]//div//a")
	private List<WebElement> footerSectionsLnk;

	/*list of elements present in Trending topic sections present on the Footer of homepage*/
	@FindBy(xpath ="//div[contains(@class,'trending-row')]//div//a")
	private List<WebElement> footerTrendingSectionsLnk;

	/*list of elements present in Hot On Social sections present on the Footer of homepage*/
	@FindBy(xpath ="//div[contains(@class,'hot_social')]//div//a")
	private List<WebElement> footerHotOnSocialSectionsLnk;

	/*list of elements present in Popular Category sections present on the Footer of homepage*/
	@FindBy(xpath ="//div[contains(@class,'popular-row')]//div//a")
	private List<WebElement> footerPopularCatSectionsLnk;

	/*list of elements present in Popular Category sections present on the Footer of homepage*/
	@FindBy(xpath ="(//div[contains(@class,'footer_right')]//div[contains(@class,'side_bar')])[1]//a")
	private List<WebElement> footerLanguageSectionsLnk;

	/*list of elements present in Popular Category sections present on the Footer of homepage*/
	@FindBy(xpath ="(//div[contains(@class,'footer_right')]//div[contains(@class,'side_bar')])[2]//a")
	private List<WebElement> footerNw18SitesSectionsLnk;

	/*Live TV Icon Present On the Footer Part */
	@FindBy(xpath ="//div[contains(@class,'live_tv')]/a")
	private WebElement liveTVIcon;

	/*list of elements present in Hot On Social sections present on the Footer of homepage*/
	@FindBy(xpath ="//div[contains(@class,'bottom_row')]//a")
	private List<WebElement> footerLogoSectionsLnk;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="(//h1)[1]")
	private WebElement headerTxtHotOnSocial;

	/*instagram and jio news Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="(//h2)[1] | //img[contains(@alt,'Instagram')]")
	private WebElement instaAndJioTxt;

	/*footer Language box */
	@FindBy(xpath = "(//div[contains(@class,'footer_right')]/div)[1]")
	private WebElement footerLanguageBox;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//header[@role='banner']")
	private WebElement googlePlayHeader;


	//*************************Anupam**Webelements**********************

	/*Movies Widget Img Link are present in Home Page*/
	@FindBy(xpath ="//div[@class='heading_title']/a[(@href='/movies/')]/ancestor::div[@class='home_section_row']/ul/li/a//img")
	private List<WebElement> moviesWidgetImgLnk;

	/*Cricket Next Widget Img Link are present in Home Page*/
	@FindBy(xpath ="//div[@class='heading_title']/a[(@href='/cricketnext/')]/ancestor::div[@class='home_section_row']/ul/li/a//img")
	private List<WebElement> cricketNextWidgetImgLnk;

	/*India Widget Img Link are present in Home Page*/
	@FindBy(xpath ="//div[@class='heading_title']/a[(@href='/india/')]/ancestor::div[@class='home_section_row']/ul/li/a//img")
	private List<WebElement> indiaWidgetImgLnk;

	/*Business Widget Img Link are present in Home Page*/
	@FindBy(xpath ="//div[@class='heading_title']/a[(@href='/business/')]/ancestor::div[@class='home_section_row']/ul/li/a//img")
	private List<WebElement> businessWidgetImgLnk;

	/*Breadcrum Division present in article page*/
	@FindBy(xpath ="(//div[contains(@class,'bredcrum')])[1] | //div[contains(@class,'breadcum')]")
	private WebElement breadcrumDiv;

	/*Movies Widget Articles Link are present in Home Page*/
	@FindBy(xpath ="//div[@class='heading_title']/a[(@href='/movies/')]/ancestor::div[@class='home_section_row']/ul/li/a")
	private List<WebElement> moviesWidgetArticlesLnk;

	/*CricketNext Widget Articles Link are present in Home Page*/
	@FindBy(xpath ="//div[@class='heading_title']/a[(@href='/cricketnext/')]/ancestor::div[@class='home_section_row']/ul/li/a")
	private List<WebElement> cricketNextWidgetArticlesLnk;

	/*India Widget Articles Link are present in Home Page*/
	@FindBy(xpath ="//div[@class='heading_title']/a[(@href='/india/')]/ancestor::div[@class='home_section_row']/ul/li/a")
	private List<WebElement> indiaWidgetArticlesLnk;

	/*Business Widget Articles Link are present in Home Page*/
	@FindBy(xpath ="//div[@class='heading_title']/a[(@href='/business/')]/ancestor::div[@class='home_section_row']/ul/li/a")
	private List<WebElement> businessWidgetArticlesLnk;

	/*more movies Widget present in Home Page*/
	@FindBy(xpath ="//div[@class='heading_title']/a[(@href='/movies/')]/ancestor::div[@class='home_section_row']/ul/a")
	private WebElement moreMoviesWidgetLnk;

	/*more cricketNext Widget present in Home Page*/
	@FindBy(xpath ="//div[@class='heading_title']/a[(@href='/cricketnext/')]/ancestor::div[@class='home_section_row']/ul/a")
	private WebElement moreCricketNextWidgetLnk;

	/*more India Widget present in Home Page*/
	@FindBy(xpath ="//div[@class='heading_title']/a[(@href='/india/')]/ancestor::div[@class='home_section_row']/ul/a")
	private WebElement moreIndiaWidgetLnk;

	/*more Business Widget present in Home Page*/
	@FindBy(xpath ="//div[@class='heading_title']/a[(@href='/business/')]/ancestor::div[@class='home_section_row']/ul/a")
	private WebElement moreBusinessWidgetLnk;

	/*Video wall Articles Link are present in Home Page*/
	@FindBy(xpath ="//div[contains(@class,'video_wall_row')]//img")
	private List<WebElement> videoWallWidgetImgLnk;

	/*Video wall Articles Link are present in Home Page*/
	@FindBy(xpath ="//div[contains(@class,'video_wall_row')]//a")
	private List<WebElement> videoWallWidgetArticlesLnk;

	/*video division present in article and img page*/
	@FindBy(xpath ="//div[contains(@class,'headerContainer')] | (//div[contains(@class,'video_black_cont')])[1]")
	private WebElement videoDiv;

	/* Previous button present in Horoscope sub module*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_section')]//div[contains(@class,'glide__arrows')]/button[.='prev']")
	private WebElement previousBtn;

	/*Astrology Signs present under Horoscope sub module*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_slider_row') and (not(contains(@class,'glide__slide--clone')))]/div")
	private  List<WebElement> astrologySignsBtn;

	/*Astrology Signs present under Horoscope sub module*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_slider_row') and (not(contains(@class,'glide__slide--clone')))]/span")
	private  List<WebElement> astrologySignsTxt;

	/*Astrology Sign present under Horoscope sub module*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_slider_row') and (not(contains(@class,'glide__slide--clone')))]/span")
	private  WebElement astrologySigns;

	/* Description for daily, weekly ,monthly and yearly,  Horoscope*/
	@FindBy(xpath ="//div[contains(@class,'horoscop_tab_left')]//button")
	private List<WebElement> horoscopeList;

	/* Description for each astro sign present under Horoscope sub module */
	@FindBy(xpath ="//div[contains(@class,'tab-content') and not(contains(@class,'hide'))]/p")
	private WebElement horoscopeDescription;

	/* Next button present in Horoscope sub module*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_section')]//div[contains(@class,'glide__arrows')]/button[.='next']")
	private WebElement nextBtn;

	/* Description for each astro sign present under Horoscope sub module */
	@FindBy(xpath ="//div[@id='horoscop-tab']//div[contains(@class,'tab-content') and not(contains(@class,'hide'))]//span[.='Read More']/parent::a")
	private WebElement horoscopeReadMore;

	/* Description for each astro sign present under Horoscope sub module */
	@FindBy(xpath ="//p[@class='detail_intro']")
	private WebElement detailIntro;

	/*Breadcrumb text present in article page*/
	@FindBy(xpath ="//div[contains(@class,'brade_crum')]//li/h1  |  (//ul[contains(@class,'breadcum')]/li)[2]")
	private WebElement breadcrumbTxt;

	/*Video section Article BreadCrumb Division */
	@FindBy(xpath = "//div[contains(@class,'bredcrum')] | //div[contains(@class,'BreadCum')]")
	private WebElement videoBreadcrumb;


	//***************************Rahul Webelements******************
	
	
	@FindBy(xpath ="(//div[contains(@class,'latest_news')])[2]//child::span" )
	private WebElement trendingNews;
	
	/*Air Quality Index HeadLine Text At RHS*/
	@FindBy(xpath ="//div[contains(@class,'aqiwidgethd')]" )
	private WebElement airQualityIndexHeadline;

	/*Air Quality Index widgets at RHS*/
	@FindBy(xpath ="//div[contains(@class,'aqiwidget kul')]//ul//li//a")
	private List<WebElement> airQualityIndexWidgetLst;

	/*Read More Panchang Button present at RHS*/
	@FindBy(xpath ="//div[contains(@class,'panchan_info')]//following-sibling::a" )
	private WebElement readMorePanchangBtn;

	/*Element in Air Quality Section*/
	@FindBy(xpath ="//div[contains(@class,'brade_crum')]" )
	private WebElement aqiBradeCrumb;

	/*Latest News article breadcrum Text at RHS*/
	@FindBy(xpath ="(//div[contains(@class,'bredcrum')] | //div[contains(@class,'bread')]  | //ul[contains(@class, 'bread')])[1]" )
	private WebElement latestNewsarticleBreadCrum;

	/*Latest news Headline breadcrum Text at RHS*/
	@FindBy(xpath ="//div[contains(@class,'brade_crum')]//a[contains(@href,'news')]")
	private WebElement moreLatestNewsBradecrumb ;

	/*Panchang bradecrum Text at Panchang Page*/
	@FindBy(xpath ="//div[@class='brade_crum fleft']")
	private WebElement panchangBreadcrum ;

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
	@FindBy(xpath = "//div[@class='vjs-custom-control-spacer vjs-spacer ']")
	private WebElement mouseoverActionBar;

	/*List of article  in latest news at RHS*/
	@FindBy(xpath ="(//div[contains(@class,'latest_news')])[1]//li//a")
	private List<WebElement> latestNewsLnkList;

	/*Latest News HeadlineLink present at RHS*/
	@FindBy(xpath ="//a[contains(@title,'News')]")
	private WebElement latestNewsHeadLineLnk;

	/*More Latest News Link present in RHS*/
	@FindBy(xpath ="//div[contains(@class,'heading_title')]//parent::div//ul//a[contains(@class,'more_latest')]")
	private WebElement moreLatestNewsLnk;

	/*Todays Panchang headline present in RHS*/
	@FindBy(xpath ="//div[contains(@class,'astro-rgtroundicon')]")
	private WebElement panchangHeadline;

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


	/**
	 * @author AbhishekRaj
	 * This method is used validate Covid tracker Date
	 */
	public void clickOnTracker() {
		try {
			webDriverActions.waitForSecond(2000);
			webDriverActions.highlightElement(trackerLnk);
			webDriverActions.waitForSecond(5000);
			webDriverActions.clickJS(trackerLnk);
		} catch (Exception e) {
			Assert.fail("Unable to Locate Covid Tracker Link "+trackerLnk);
		}
		webDriverActions.waitForElementVisibility(covidUpdatedTime,GlobalVariables.sec60);
		String covidDate=webDriverActions.getTextFromElement(covidUpdatedTime);
		//below actual variable is to get string position from the article text
		String actual = genericUtility.getSubstring(9, 20,covidDate).trim();
		Logs.info(getClass(), "Current Covid Tracker Date is: "+actual);
		String expected = genericUtility.getSystemDateTime();
		Logs.info(getClass(), "Current System Date is: " +expected);
		Assert.assertTrue(genericUtility.compareTwoStrings(actual,expected),"Failed to Update Covid Tracker Date and Time "+actual+"In this Url "+webDriverActions.getCurrentPageUrl());
	}

	/**
	 * @author Abhishek
	 * This method is used to click on First Article of English Home Page 
	 */
	public void clickOnFirstArticleHomePage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(1000);
			webDriverActions.click(homePageArticleLnks);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in first Article Homepage");
		}
	}

	/**
	 * @author Sanjeeb
	 * This method is used to click on CricketNext link present on Hamburger Menu
	 */
	public void clickOnCricketNextLnk()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(hamburgerMenuLnk);
			webDriverActions.click(cricketNextLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Hamburger Menu Link");
			Logs.error(getClass(), "Exception in Cricket Next Link");
		}	
	}

	/**
	 * @author Abhishek
	 * This method used to click on photos section
	 */
	public void clickOnPhotosSection()
	{

		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(hamburgerMenuLnk);
			webDriverActions.clickJS(photoSectionLineOneLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Hamburger Menu Link");
			Logs.error(getClass(), "Exception in Photo Section Link");
		}
	}

	/**
	 * @author Sanjeeb
	 * This method is used to Click on First topic link of Trending Topics Section present At the Footer Of HomePage
	 */
	public void clickOnFirstTopicLnkTrendingTopics() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(3000);
			webDriverActions.scrollToLast();
			webDriverActions.click(trendingTopicsfirstLnk);
			webDriverActions.switchToNewWindow();
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Trending Topic Link");
			Assert.fail("Unable to Locate First Trending Topics "+trendingTopicsfirstLnk +webDriverActions.getCurrentPageUrl());
		}
	}

	/**
	 * @author Sanjeeb
	 * This method is used to click on Videos Section present at Hamburger Menu of news 18 English Home Page 
	 */
	public void navigateToFirstVideosArticle() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(hamburgerMenuLnk);
			webDriverActions.click(videosSectionLnk);
			webDriverActions.click(videosArticleLnks.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Hamburger Menu Link");
			Logs.error(getClass(), "Exception in Video Section Link");
		}
		catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Hamburger Menu Link");
			Logs.error(getClass(), "Exception in Video Section Link");
		}
	}


	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of English Home Page 
	 */
	public void clickOnFirstLiveBlogArticleHomePage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(1000);
			if(webDriverActions.isElementDisplayed(homePageLiveBlogArticleLnks.get(0)))
			{
				webDriverActions.clickJS(homePageLiveBlogArticleLnks.get(0));
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
	 * This method is used to click on the article in footer containing /topics/ in the URL
	 */
	public void clickOnFooterTopics()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.scrollToLast();
			webDriverActions.mouseHover(footerGoldPriceTopicLnk);
			webDriverActions.highlightElement(footerGoldPriceTopicLnk);
			webDriverActions.click(footerGoldPriceTopicLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Footer Topics in Home Page");
		}
	}

	/**
	 * This method used to navigate to Latest Section Page
	 */
	public void latestSection() {
		try{
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(latestSectionLnk);
			Logs.info(getClass(),"Clicked on latest section link");
		}catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Latest Section in Home Page");
		}
	}

	/**************Danish**BusinessLogic***************/
	/**
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
	 * This method validates Live Tv navigation from HomaPage
	 */
	public void verifyHeaderLiveTv(String serverType) {
		webDriverActions.waitForPageToLoad();
		webDriverActions.softClickJS(headerLiveTv);
		String currentPageUrl = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preProd")) {
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
		webDriverActions.softClickJS(downloadNews18AppLnk);
		webDriverActions.switchToNewWindow();
		Logs.info(getClass(), "Navigated to " + webDriverActions.getCurrentPageUrl());
		String parent = webDriverActions.getCurrentPageUrl();
		if (serverType.contains("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(parent);
			webDriverActions.navigateToUrl(betaUrl);
			parent=betaUrl;
		}
		webDriverActions.softWaitForElementVisibility(logoHeader, 20);
		softAssert.assertTrue(webDriverActions.isElementDisplayed(logoHeader),"Possibly element not visible "+parent);
		softAssert.assertTrue(appStore.size()>0," Possibly element is not visible "+parent);
		for (int i = 0; i < appStore.size(); i++) 
		{
			webDriverActions.waitForSecond(2000);
			webDriverActions.softHighlightElement(appStore.get(i));
			webDriverActions.softClickJS(appStore.get(i));
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
	 * This method validates social Media navigation present on Home Page
	 */
	public void verifySocialMedia() {
		webDriverActions.waitForPageToLoad();
		String parent = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(socialMediaIconsLnk.size()>0, " Possibly Element is not Visible "+ socialMediaIconsLnk );
		for (int i = 0; i < socialMediaIconsLnk.size(); i++) {
			webDriverActions.softHighlightElement(socialMediaIconsLnk.get(i));//used to Highlight the particular element
			webDriverActions.softClickJS(socialMediaIconsLnk.get(i));
			String currentPage = webDriverActions.getCurrentPageUrl();
			webDriverActions.waitForSecond(2000);

			//it takes the social share Url from property File
			ArrayList<String> list=new ArrayList<String>();
			list.add(fileUtility.readDataFromPropertyFile("facebook"));
			list.add(fileUtility.readDataFromPropertyFile("twitter"));
			list.add(fileUtility.readDataFromPropertyFile("instagram"));
			list.add(fileUtility.readDataFromPropertyFile("youtube"));
			list.add(fileUtility.readDataFromPropertyFile("telegram"));

			//Below list adds webelements of social share icons
			ArrayList<WebElement> listEle=new ArrayList<WebElement>();
			listEle.add(facebookHeader);
			listEle.add(twitterHeader);
			listEle.add(instagramHeader);
			listEle.add(youtubeHeader);
			listEle.add(telegramHeader);

			// it will iterate the list and validate s
			for(int j=0;j<list.size();j++)
			{
				if(currentPage.contains(list.get(j)))
				{
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j)), "Possibly Element Is Not Visible For This URL "+currentPage);	
				}
			}
			webDriverActions.navigateToUrl(parent);

		}
		softAssert.assertAll("Issues found in Home Page Header Social Media ");
	}


	/**
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
			if (serverType.equalsIgnoreCase("preProd")) {
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

	//************************Vipin********************************************************

	// Vipin Business Logics

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Priority Panel Article Text Navigation 
	 */
	public void verifyPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , priorityPanelHeaderArticleLnk , articleHeaderTxt); // Verify Header Article of Priority Panel
		verifyArticleNavigation(serverType , priorityPanelArticleLnk , articleHeaderTxt);	// Verify RHS  Article of Priority Panel
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Priority Panel Image Navigation 
	 */
	public void verifyPriorityPanelImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType , priorityPanelImgLnk , articleHeaderTxt); 
	}


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
		webDriverActions.continuousScrollTillAllElement(artList, 20);
		webDriverActions.waitForSecond(1000);
		for(int i=0; i<artList.size() ;i++)
		{
			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			String actual =	webDriverActions.getAttribute("href", artList.get(i));
			Logs.info(getClass(), actual);
			webDriverActions.softClickJS(artList.get(i));
			webDriverActions.waitForSecond(1000);
			String currentPage =webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), currentPage);
			softAssert.assertEquals(actual, currentPage , "Unable to Navigate "+actual);
			if (serverType.equalsIgnoreCase("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			}
			webDriverActions.softHighlightElement(element);
			webDriverActions.waitForSecond(1000);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in "+currentPage +element );;
			if (serverType.equalsIgnoreCase("preProd")) {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			else {
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
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(imgList, 20);
		for(int i=0; i<imgList.size() ;i++)
		{
			webDriverActions.softMouseHover(imgList.get(i));
			webDriverActions.softScrollToElement(imgList.get(i));
			webDriverActions.softClickJS(imgList.get(i));
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
			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) ,  "Unable to Display Element in "+currentPage );
			if (serverType.equalsIgnoreCase("preProd")) {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
			}
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
		webDriverActions.continuousScrollTillElement(moreLnk, 5);
		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		String actual = webDriverActions.getAttribute("href", moreLnk);
		webDriverActions.softClickJS(moreLnk);
		webDriverActions.waitForSecond(1000);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		webDriverActions.softHighlightElement(element);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in "+currentPage);
		softAssert.assertEquals(actual, currentPage , "Unable to Navigate "+actual);
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyTitleNavigation(String serverType , WebElement element , WebElement breadcrumb)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(element, 20);
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
		webDriverActions.waitForPageToLoad();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb), "Unable to Display Element in "+currentPage);
		softAssert.assertAll("Issue in Homepage Body ");
	}

	public void verifyHotAndTrendingImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType , hotAndTrendingImgLnk , articleHeaderTxt);
	}

	public void verifyCricketNextTabsNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , cricketNextTabLnk, headerDiv);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify Photogallery Widget Image Navigation after Clicking
	 */
	public void verifyPhotogalleryImageNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		try {
			String title = webDriverActions.getPageTitle();
			webDriverActions.waitForPageToLoad();
			webDriverActions.continuousScrollTillAllElement(photogalleryArticleLnks, 5);
			for(int i=0;i<photogalleryArticleLnks.size(); i++)
			{
				if(webDriverActions.isElementDisplayed(activePhotogalleryImgLnk)) {
					webDriverActions.softScrollToElement(activePhotogalleryImgLnk);
					webDriverActions.softMouseHover(activePhotogalleryImgLnk);
					webDriverActions.navigateToNewTab(activePhotogalleryImgLnk);
					webDriverActions.waitForPageToLoad();
					webDriverActions.switchToNewWindow();
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
					softAssert.assertTrue(webDriverActions.isElementDisplayed(articleHeaderTxt) , "Unable To Display Element in "+currentPage);
					webDriverActions.closeDriver();
					webDriverActions.switchToWindow(title);
					webDriverActions.clickJS(photogalleryRightArrowBtn);
				}
			}
			softAssert.assertAll("Issues Found in Homepage Body");
		} catch (Exception e) {
			//			e.printStackTrace();
		}
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify PhotoGallery Widget Article Text Navigation after Clicking
	 */
	public void verifyPhotogalleryArticleNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		try {
			String title = webDriverActions.getPageTitle();
			webDriverActions.waitForPageToLoad();
			webDriverActions.scrollDown();
			webDriverActions.continuousScrollTillAllElement(photogalleryArticleLnks , 15);
			for(int i=0;i<photogalleryArticleLnks.size(); i++)
			{
				if(webDriverActions.isElementDisplayed(activePhotogalleryArticleLnk)) {
					webDriverActions.waitForPageToLoad();
					webDriverActions.navigateToNewTab(activePhotogalleryArticleLnk);
					webDriverActions.waitForPageToLoad();
					webDriverActions.switchToNewWindow();
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
					softAssert.assertTrue(webDriverActions.isElementDisplayed(articleHeaderTxt) , "Unable To Display Element in "+currentPage);
					webDriverActions.closeDriver();
					webDriverActions.switchToWindow(title);
					webDriverActions.clickJS(photogalleryRightArrowBtn);
				}
			}
			softAssert.assertAll("Issues Found in Homepage Body");
		} catch (Exception e) {
			//			e.printStackTrace();
		}
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Videos Widget Left Arrow Button Navigation
	 */
	public void verifyVideosLeftSliderNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(videosArticleLnk, 10);
		webDriverActions.softMouseHover(videosLeftArrowBtn);
		webDriverActions.softScrollToElement(videosLeftArrowBtn);
		for(int i = 1; i<videosArticleLnk.size() ; i++)
		{
			String sliderTitle = webDriverActions.getTextFromElement(activeVideosArticleLnk);
			Logs.info(getClass(), sliderTitle);
			webDriverActions.softMouseHover(videosLeftArrowBtn);
			webDriverActions.softScrollToElement(videosLeftArrowBtn);
			webDriverActions.softClickJS(videosLeftArrowBtn);
			webDriverActions.waitForSecond(2000);
			String sliderTitleAfterScroll = webDriverActions.getTextFromElement(activeVideosArticleLnk);
			Logs.info(getClass(), sliderTitleAfterScroll);
			softAssert.assertNotEquals(sliderTitle, sliderTitleAfterScroll, "Videos Left slider is not working");
			//			sliderTitle = sliderTitleAfterScroll;
			webDriverActions.waitForSecond(1000);
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Videos Widget Left Arrow Button Navigation
	 */
	public void verifyVideosRightSliderNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(videosArticleLnk, 15);
		webDriverActions.softMouseHover(videosRightArrowBtn);
		webDriverActions.softScrollToElement(videosRightArrowBtn);
		for(int i = 1; i<videosArticleLnk.size() ; i++)
		{
			String sliderTitle = webDriverActions.getTextFromElement(activeVideosArticleLnk);
			Logs.info(getClass(), sliderTitle);
			webDriverActions.softMouseHover(videosRightArrowBtn);
			webDriverActions.softScrollToElement(videosRightArrowBtn);
			webDriverActions.softClickJS(videosRightArrowBtn);
			webDriverActions.waitForSecond(2000);
			String sliderTitleAfterScroll = webDriverActions.getTextFromElement(activeVideosArticleLnk);
			Logs.info(getClass(), sliderTitleAfterScroll);
			softAssert.assertNotEquals(sliderTitle, sliderTitleAfterScroll, "Videos Right slider is not working");
			//			sliderTitle = sliderTitleAfterScroll;
			webDriverActions.waitForSecond(1000);
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify Videos Widget Article Text Navigation after Clicking
	 */
	public void verifyVideosArticleNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		String title = webDriverActions.getPageTitle();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		webDriverActions.continuousScrollTillAllElement(videosArticleLnk , 15);
		for(int i=0;i<videosArticleLnk.size(); i++)
		{
			webDriverActions.navigateToNewTab(activeVideosArticleLnk);
			webDriverActions.waitForPageToLoad();
			webDriverActions.switchToNewWindow();
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
			webDriverActions.softHighlightElement(videoBreadCrumbDiv);
			softAssert.assertFalse(webDriverActions.softIsElementDisplayed(videoPlayerTxt), "Possibly Video Player is Not Working in "+currentPage);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(videoBreadCrumbDiv) , "Unable To Display Element in "+currentPage);
			webDriverActions.waitForSecond(1000);
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(title);
			webDriverActions.clickJS(videosRightArrowBtn);
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify Videos Widget Image Navigation after Clicking
	 */
	public void verifyVideosImageNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		try {
			String title = webDriverActions.getPageTitle();
			webDriverActions.waitForPageToLoad();
			webDriverActions.scrollDown();
			webDriverActions.continuousScrollTillElement(activeVideosImgLnk , 5);
			for(int i=0;i<videosImgLnk.size(); i++)
			{
				if(webDriverActions.isElementDisplayed(activeVideosImgLnk)) {
					webDriverActions.navigateToNewTab(activeVideosImgLnk);
					webDriverActions.waitForPageToLoad();
					webDriverActions.switchToNewWindow();
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
					webDriverActions.softHighlightElement(videoBreadCrumbDiv);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(videoBreadCrumbDiv) , "Unable To Display Element in "+currentPage);
					softAssert.assertFalse(webDriverActions.softIsElementDisplayed(videoPlayerTxt), "Possibly Video Player is Not Working in "+currentPage);
					webDriverActions.waitForSecond(1000);
					webDriverActions.closeDriver();
					webDriverActions.switchToWindow(title);
					webDriverActions.clickJS(videosRightArrowBtn);
				}
			}
		} catch (Exception e) {
			//			e.printStackTrace();
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify Photogallery Widget Right Arrow Button Navigation  
	 */
	public void verifyPhotogalleryRightSliderNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(photogalleryRightArrowBtn);
		webDriverActions.softScrollToElement(photogalleryRightArrowBtn);
		for(int i = 1; i<photogalleryArticleLnks.size() ; i++)
		{
			String sliderTitle = webDriverActions.getTextFromElement(activePhotogalleryArticleLnk);
			Logs.info(getClass(), sliderTitle);
			webDriverActions.softMouseHover(photogalleryRightArrowBtn);
			webDriverActions.softScrollToElement(photogalleryRightArrowBtn);
			webDriverActions.softClickJS(photogalleryRightArrowBtn);
			webDriverActions.waitForSecond(2000);
			String sliderTitleAfterScroll = webDriverActions.getTextFromElement(activePhotogalleryArticleLnk);
			Logs.info(getClass(), sliderTitleAfterScroll);
			softAssert.assertNotEquals(sliderTitle, sliderTitleAfterScroll, "Photogallery Right slider is not working");
			//			sliderTitle = sliderTitleAfterScroll;
			webDriverActions.waitForSecond(1000);
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify Photogallery Widget Left Arrow Button Navigation  
	 */
	public void verifyPhotogalleryLeftSliderNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(photogalleryLeftArrowBtn);
		webDriverActions.softScrollToElement(photogalleryLeftArrowBtn);
		for(int i = 1; i<photogalleryArticleLnks.size() ; i++)
		{
			String sliderTitle = webDriverActions.getTextFromElement(activePhotogalleryArticleLnk);
			Logs.info(getClass(), sliderTitle);
			webDriverActions.softMouseHover(photogalleryLeftArrowBtn);
			webDriverActions.softScrollToElement(photogalleryLeftArrowBtn);
			webDriverActions.softClickJS(photogalleryLeftArrowBtn);
			webDriverActions.waitForSecond(2000);
			String sliderTitleAfterScroll = webDriverActions.getTextFromElement(activePhotogalleryArticleLnk);
			Logs.info(getClass(), sliderTitleAfterScroll);
			softAssert.assertNotEquals(sliderTitle, sliderTitleAfterScroll, "Photogallery Left slider is not working");
			//			sliderTitle = sliderTitleAfterScroll;
			webDriverActions.waitForSecond(1000);
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyBuzzArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,buzzArticleLnk , articleHeaderTxt);
	}

	public void verifyBuzzImageValidation(String serverType)
	{
		verifyImageNavigation(serverType,buzzImgLnk, articleHeaderTxt);
	}

	public void verifyEducationAndCareerArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , educationAndCareerArticleLnk ,articleHeaderTxt);
	}

	public void verifyEducationAndCareerImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, educationAndCareerImgLnk ,articleHeaderTxt);
	}
	public void verifyTechArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType ,techArticleLnk , articleHeaderTxt);
	}

	public void verifyTechImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, techImgLnk, articleHeaderTxt);
	}

	public void verifyAutoArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType, autoArticleLnk , articleHeaderTxt);
	}

	public void verifyAutoImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType ,autoImgLnk, articleHeaderTxt);
	}

	public void verifyMoreAutoNews(String serverType)
	{
		verifyMoreNewsNavigation( serverType ,moreAutoNewsLnk , articleBreadCrumbDiv);
	}

	public void verifyWorldArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , worldArticleLnk , articleHeaderTxt);
	}

	public void verifyWorldImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType,worldImgLnk, articleHeaderTxt);
	}

	public void verifyWorldMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType,moreWorldNewsLnk , articleBreadCrumbDiv);
	}

	public void verifySportsArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,sportsArticleLnk ,articleHeaderTxt);
	}

	public void verifySportsImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType,sportsImgLnk, articleHeaderTxt);
	}

	public void verifySportsMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType,moreSportsNewsLnk , articleBreadCrumbDiv);
	}

	public void verifyLifestyleArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , lifestyleArticleLnk , articleHeaderTxt);
	}

	public void verifyLifestyleImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType,lifestyleImgLnk , articleHeaderTxt);
	}

	public void verifyLifestyleMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType,lifestyleMoreNewsLnk , articleBreadCrumbDiv);
	}

	public void verifyHealthAndFitnessArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,healthAndFitnessArticleLnk, articleHeaderTxt);
	}

	public void verifyHealthAndFitnessImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType,healthAndFitnessImgLnk, articleHeaderTxt);
	}

	public void verifyHealthAndFitnessMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType,healthAndFitnessMoreNewsLnk , articleBreadCrumbDiv);
	}

	public void verifyExplainersImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType,explainersImgLnk ,articleHeaderTxt);
	}

	public void verifyExplainersMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType,explainersMoreNewsLnk , articleBreadCrumbDiv);
	}

	public void verifyExplainersArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,explainersArticleLnk ,articleHeaderTxt);
	}
	public void verifyOpinionArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,opinionArticleLnk ,articleHeaderTxt);
	}

	public void verifyOpinionImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType,opinionImgLnk ,articleHeaderTxt);
	}

	public void verifyOpinionMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , opinionMoreNewsLnk , articleBreadCrumbDiv);
	}

	public void verifyPoliticsArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , politicsArticleLnk ,articleHeaderTxt);
	}

	public void verifyPoliticsImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType,politicsImgLnk ,articleHeaderTxt);
	}

	public void verifyPoliticsMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , politicsMoreNewsLnk ,articleBreadCrumbDiv);
	}

	public void verifyFootballArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,footballArticleLnk ,articleHeaderTxt);
	}

	public void verifyFootballImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType,footballImgLnk ,articleHeaderTxt);
	}

	public void verifyFootballMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , footballMoreNewsLnk ,articleBreadCrumbDiv);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify WebStories Widget Left Arrow Button Navigation  
	 */
	public void verifyWebStoriesSliderNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(webStoriesRightArrowBtn);
		webDriverActions.softScrollToElement(webStoriesRightArrowBtn);
		if(webDriverActions.isElementDisplayed(webStoriesRightArrowBtn))
		{
			for(int i = 1; i<webstoriesNextSliderBtn.size() ; i++)
			{
				String sliderTitle = webDriverActions.getTextFromElement(activeWebstoriesArticleTxt);
				Logs.info(getClass(), sliderTitle);
				webDriverActions.softMouseHover(webStoriesRightArrowBtn);
				webDriverActions.softScrollToElement(webStoriesRightArrowBtn);
				webDriverActions.softClickJS(webStoriesRightArrowBtn);
				webDriverActions.waitForSecond(2000);
				String sliderTitleAfterScroll = webDriverActions.getTextFromElement(activeWebstoriesArticleTxt);
				Logs.info(getClass(), sliderTitleAfterScroll);
				softAssert.assertNotEquals(sliderTitle, sliderTitleAfterScroll, "Webstories Right slider is not working");
				//			sliderTitle = sliderTitleAfterScroll;
				webDriverActions.waitForSecond(1000);
			}
		}
		else
		{
			softAssert.fail("Webstories Right Arrow Slider is Not Displayed "+webDriverActions.getCurrentPageUrl());
		}
		if(webDriverActions.isElementDisplayed(webStoriesLeftArrowBtn))
		{
			for(int i = 1; i<webstoriesNextSliderBtn.size() ; i++)
			{
				String sliderTitle = webDriverActions.getTextFromElement(activeWebstoriesArticleTxt);
				Logs.info(getClass(), sliderTitle);
				webDriverActions.softMouseHover(webStoriesLeftArrowBtn);
				webDriverActions.softScrollToElement(webStoriesLeftArrowBtn);
				webDriverActions.softClickJS(webStoriesLeftArrowBtn);
				webDriverActions.waitForSecond(2000);
				String sliderTitleAfterScroll = webDriverActions.getTextFromElement(activeWebstoriesArticleTxt);
				Logs.info(getClass(), sliderTitleAfterScroll);
				softAssert.assertNotEquals(sliderTitle, sliderTitleAfterScroll, "Webstories Left slider is not working");
				//			sliderTitle = sliderTitleAfterScroll;
				webDriverActions.waitForSecond(1000);
			}
		}
		else
		{
			softAssert.fail("Webstories Left Arrow Slider is Not Displayed "+webDriverActions.getCurrentPageUrl());
		}
		softAssert.assertAll("Issue Found in Photogallery Slider");
	}

	public void verifyWebStoriesArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,webStoriesArticleLnk, nextWebStoryBtn);
	}

	public void verifyWebStoriesImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType,webStoriesImgLnk, nextWebStoryBtn);
	}

	public void verifyWebStoriesSeeMoreNavigation(String serverType)
	{
		verifyImageNavigation( serverType,webStoriesSeeMoreLnk, articleBreadCrumbDiv);
	}

	public void verifyMoreBuzzNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreBuzzNewsLnk , articleBreadCrumbDiv);
	}

	public void verifyMoreEducationAndCarrerNews(String serverType)
	{
		verifyMoreNewsNavigation( serverType,moreEducationandCareerNewsLnk ,articleBreadCrumbDiv);
	}

	public void verifyMoreTechNews(String serverType)
	{
		verifyMoreNewsNavigation( serverType,moreTechNewsLnk , articleBreadCrumbDiv);
	}

	public void verifyNews18ShowshaArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,news18ShowshaArticleLnk, articleHeaderTxt);
	}

	public void verifyNews18ShowshaImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType,news18ShowshaImgLnk, articleHeaderTxt);
	}

	/**
	 * This method is used to verify More News18 Showsha Link Navigation in News 18 Homepage
	 */
	public void verifyMoreFromNews18Showsha(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String actual = webDriverActions.getAttribute("href", moreFromNews18ShowshaLnk);
		webDriverActions.softClickJS(moreFromNews18ShowshaLnk);
		webDriverActions.waitForPageToLoad();
		String currentPage = webDriverActions.getCurrentPageUrl();
		softAssert.assertEquals(actual, currentPage , "Unable to Navigate "+actual);
		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		softAssert.assertTrue(webDriverActions.isElementDisplayed(articleBreadCrumbDiv) , "Unable To Display Element in "+currentPage);
		softAssert.assertAll("Issues Found in Homepage News18Showsha Section");
	}

	public void verifyNews18ShowshaLogoNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, news18ShowshaLogoLnk, articleBreadCrumbDiv);
	}

	public void verifyCricketNextArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType ,cricketNextArticleLnk , articleBreadCrumbDiv);
	}

	public void verifyCricketNextImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType , cricketNextImgLnk, articleBreadCrumbDiv);
	}

	public void verifyCricketNextNews18LogoNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, cricketNextNews18LogoLnk, articleBreadCrumbDiv);
	}

	public void verifyCricketNextLogoNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, cricketNextLogoLnk, articleBreadCrumbDiv);
	}

	public void verifyCricketNextMoreNewsNavigation(String serverType)
	{
		verifyTitleNavigation( serverType , cricketNextMoreLnk, articleBreadCrumbDiv);
	}

	//***********************Sanjeeb**Business Logic*********************************


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify elements Present In Line One Section By Clicking On It.
	 */
	public void verfyLineOneSection(String server)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		//Validating the Line one section Except Search Button
		for (int i = 1; i < lineOneSectionELementLnk.size(); i++)
		{
			String actual = webDriverActions.getAttribute("href", lineOneSectionELementLnk.get(i));
			Logs.info(getClass(), actual);
			webDriverActions.softHighlightElement(lineOneSectionELementLnk.get(i));
			webDriverActions.softWaitForElementVisibility(lineOneSectionELementLnk.get(i), 3);
			webDriverActions.softClick(lineOneSectionELementLnk.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softWaitForElementVisibility(lineOneSectionELementLnk.get(i), 3);
				webDriverActions.softClickJS(lineOneSectionELementLnk.get(i));
			}
			webDriverActions.waitForPageToLoad();
			String expected = webDriverActions.getCurrentPageUrl();	
			if(server.contains("preProd") && !expected.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(expected);
				expected=betaUrl;
				webDriverActions.navigateToUrl(expected);
			}
			webDriverActions.softWaitForElementVisibility(headerTxtLogoLnk, 3);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Failed To display Header Icon For This URL"+expected);
			if (expected.contains(actual)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}	
		}
		softAssert.assertAll("Issues Found In Line One Sections");
	}

	public void verfyLineOneSearchButton()
	{
		//validating Search Icon
		webDriverActions.softClick(searchBtnLnk);
		webDriverActions.waitForSecond(5000);
		webDriverActions.softWaitForElementVisibility(searchBoxBtn, 3);
		webDriverActions.inputText(searchBoxBtn, "News 18");
		webDriverActions.softHighlightElement(insideSearchIcon);
		webDriverActions.softClick(insideSearchIcon);
		webDriverActions.softHighlightElement(closeBtn);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(closeBtn), "Posibly Search Box is not displayed");	
		softAssert.assertAll("Issues Found In Validating Search Button");
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Line One section Articles By clicking on it.
	 */
	public void verfyLineOneSectionArticles(String server)
	{
		webDriverActions.waitForPageToLoad();
		String betaUrl ="";
		for(int i=0;i<lineOneSectionELementLnk.size();i++)
		{
			webDriverActions.waitForElement(1000);
			webDriverActions.softWaitForElementVisibility(lineOneSectionELementLnk.get(i), 3);
			webDriverActions.softMouseHover(lineOneSectionELementLnk.get(i));
			webDriverActions.softHighlightElement(lineOneSectionELementLnk.get(i));
			for(int j=0;j<lineOneSectionArticlesLnk.size();j++)
			{
				webDriverActions.softWaitForElementVisibility(lineOneSectionArticlesLnk.get(j), 3);
				webDriverActions.softMouseHover(lineOneSectionArticlesLnk.get(j));
				webDriverActions.softHighlightElement(lineOneSectionArticlesLnk.get(j));
				webDriverActions.softClickJS(lineOneSectionArticlesLnk.get(j));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softWaitForElementVisibility(lineOneSectionArticlesLnk.get(j), 3);
					webDriverActions.softMouseHover(lineOneSectionArticlesLnk.get(j));
					webDriverActions.softHighlightElement(lineOneSectionArticlesLnk.get(j));
					webDriverActions.softClickJS(lineOneSectionArticlesLnk.get(j));
				}
				String expected = webDriverActions.getCurrentPageUrl();
				if(server.contains("preProd") && !expected.contains("//beta"))
				{
					betaUrl = genericUtility.replaceInUrl(expected);
					webDriverActions.navigateToUrl(betaUrl);
				}
				Logs.info(getClass(), expected);
				webDriverActions.stopPageLoading();
				webDriverActions.softWaitForElementVisibility(headerTxtLogoLnk, 3);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Failed To display The Header Text For This URL "+expected);
				if(expected.equals(betaUrl))
				{
					webDriverActions.navigateBack();	
				}
				else
				{
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}
				webDriverActions.softMouseHover(lineOneSectionELementLnk.get(i));
				webDriverActions.softHighlightElement(lineOneSectionELementLnk.get(i));
			}
		}
		softAssert.assertAll("Issues Found In Line One Article Sections");
	}



	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Line One Hamburger Menu and Line Two Section after clicking on the hamburger Icon.
	 */
	public void verfyLineOneHamburgerMenu(String server)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softClickJS(hamburgerMenuLnk);
		//Validating the Line one section Except Search Button
		for (int i = 1; i < hamburgerSectionsLnk.size(); i++)
		{
			String actual = webDriverActions.getAttribute("href", hamburgerSectionsLnk.get(i));
			Logs.info(getClass(), actual);
			webDriverActions.softHighlightElement(hamburgerSectionsLnk.get(i));
			webDriverActions.softWaitForElementVisibility(hamburgerSectionsLnk.get(i), 3);
			webDriverActions.softMouseHover(hamburgerSectionsLnk.get(i));
			webDriverActions.softClickJS(hamburgerSectionsLnk.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softWaitForElementVisibility(hamburgerSectionsLnk.get(i), 3);
				webDriverActions.softMouseHover(hamburgerSectionsLnk.get(i));
				webDriverActions.softClickJS(hamburgerSectionsLnk.get(i));
			}
			String currentPageUrl = webDriverActions.getCurrentPageUrl();	
			String expected = webDriverActions.getCurrentPageUrl();	
			if(server.contains("preProd") && !expected.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(expected);
				expected=betaUrl;
				webDriverActions.navigateToUrl(expected);
			}
			webDriverActions.stopPageLoading();
			webDriverActions.softWaitForElementVisibility(headerTxtLogoLnk, 3);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Failed To display Header Icon For This URL"+expected);
			if (expected.contains(currentPageUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}	
			webDriverActions.softClickJS(hamburgerMenuLnk);
		}
		softAssert.assertAll("Issues Found In Validating Hamburger Menu");

	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Footer Section present at the footer Part of News 18 Home Page.
	 */
	public void verfyFooterSection(List<WebElement>sectionsLnk, WebElement headerTxt,String server)
	{
		String expected ="";
		String text="";
		String betaUrl ="";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		String pageURL = webDriverActions.getPageTitle();
		//It will fetch the line one Elements except search Icon
		for (int i = 0; i < sectionsLnk.size(); i++)
		{
			webDriverActions.softMouseHover(sectionsLnk.get(i));
			webDriverActions.softHighlightElement(sectionsLnk.get(i));
			String actual = webDriverActions.getAttribute("href", sectionsLnk.get(i));
			Logs.info(getClass(), actual);
			String title = webDriverActions.getAttribute("target", sectionsLnk.get(i));
			text=webDriverActions.getTextFromElement(sectionsLnk.get(i));
			if(text.contains(" "))
			{
				String[] s = text.split(" ");
				text=s[0].toLowerCase();
			}
			Logs.info(getClass(), text);
			webDriverActions.softWaitForElementVisibility(sectionsLnk.get(i), 3);
			webDriverActions.softClickJS(sectionsLnk.get(i));
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
				webDriverActions.scrollToLast();
				webDriverActions.softMouseHover(sectionsLnk.get(i));
				webDriverActions.softHighlightElement(sectionsLnk.get(i));
				webDriverActions.softWaitForElementVisibility(sectionsLnk.get(i), 3);
				webDriverActions.softClickJS(sectionsLnk.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					webDriverActions.waitForSecond(1000);
				}
			}
			webDriverActions.stopPageLoading();
			expected=webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd")&& !expected.contains("//beta"))
			{
				betaUrl = genericUtility.replaceInUrl(expected);
				webDriverActions.navigateToUrl(betaUrl);
			}
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxt), "Failed To display Header Icon For This URL"+actual);
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageURL);
			}
			else
			{
				if(expected.equals(betaUrl))
				{
					webDriverActions.navigateBack();	
				}
				else
				{
					webDriverActions.navigateBack();	
					webDriverActions.navigateBack();	
				}
			}
		}
		softAssert.assertAll("Issues Found In Validating Footer Section");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Footer Section Hot On Social present at the footer Part of News 18 Home Page.
	 */
	public void verfyFooterSectionHotOnSocial(String server)
	{
		verfyFooterSection(footerHotOnSocialSectionsLnk,headerTxtHotOnSocial,server);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Footer Section Language Sites present at the footer Part of News 18 Home Page.
	 */
	public void verfyFooterLanguageSection()
	{
		String text="";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		webDriverActions.softWaitForElementVisibility(footerLanguageBox, 3);
		webDriverActions.softMouseHover(footerLanguageBox);
		String pageURL = webDriverActions.getPageTitle();
		//It will fetch the line one Elements except search Icon
		for (int i = 0; i < footerLanguageSectionsLnk.size(); i++)
		{
			webDriverActions.softHighlightElement(footerLanguageSectionsLnk.get(i));
			String actual = webDriverActions.getAttribute("href", footerLanguageSectionsLnk.get(i));
			Logs.info(getClass(), actual);
			String title = webDriverActions.getAttribute("target", footerLanguageSectionsLnk.get(i));
			text=webDriverActions.getTextFromElement(footerLanguageSectionsLnk.get(i));
			if(text.contains(" "))
			{
				String[] s = text.split(" ");
				text=s[0].toLowerCase();
			}
			Logs.info(getClass(), text);
			webDriverActions.softMouseHover(footerLanguageSectionsLnk.get(i));
			webDriverActions.softClickJS(footerLanguageSectionsLnk.get(i));
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
				webDriverActions.softClickJS(footerLanguageSectionsLnk.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					webDriverActions.waitForSecond(1000);
				}
			}
			webDriverActions.stopPageLoading();
			String expected=webDriverActions.getCurrentPageUrl();
			webDriverActions.softWaitForElementVisibility(headerTxtLogoLnk, 3);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Failed To display Header Icon For This URL"+expected);
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageURL);
			}
			else
			{
				webDriverActions.navigateBack();
			}
			webDriverActions.scrollToLast();
			webDriverActions.softMouseHover(footerLanguageBox);
			webDriverActions.softMouseHover(footerLanguageSectionsLnk.get(i));
		}
		softAssert.assertAll("Issues Found In Validating Footer Section");
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Footer Popular Category Section Language Sites present at the footer Part of News 18 Home Page.
	 */
	public void verfyFooterPopularCategorySection(String server)
	{
		verfyFooterSection(footerPopularCatSectionsLnk,headerTxtLogoLnk,server);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Footer Trending Topic Section Section Language Sites present at the footer Part of News 18 Home Page.
	 */
	public void verfyFooterTrendingTopicSection(String server)
	{
		verfyFooterSection(footerTrendingSectionsLnk,headerTxtLogoLnk,server);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Footer Section News Sites present at the footer Part of News 18 Home Page.
	 */
	public void verfyFooterNewsSitesAndLiveTVSection()
	{
		//it takes the social share Url from property File
		ArrayList<String> list=new ArrayList<String>();
		list.add(fileUtility.readDataFromPropertyFile("townHall"));
		list.add(fileUtility.readDataFromPropertyFile("firstpost"));
		list.add(fileUtility.readDataFromPropertyFile("cnbctv18"));
		list.add(fileUtility.readDataFromPropertyFile("historyindia"));
		list.add(fileUtility.readDataFromPropertyFile("mtvindia"));
		list.add(fileUtility.readDataFromPropertyFile("moneycontrol"));
		list.add(fileUtility.readDataFromPropertyFile("cricketnext"));
		//it add the element of social share icons.
		ArrayList<WebElement> listEle=new ArrayList<WebElement>();
		listEle.add(townHallAndTopLearningIcon);
		listEle.add(firstPostAndCnbcIcon);
		listEle.add(firstPostAndCnbcIcon);
		listEle.add(historyAndMTvIcon);
		listEle.add(historyAndMTvIcon);
		listEle.add(moneyControlLogoLnk);
		listEle.add(headerTxtLogoLnk);

		String expected ="";
		String text="";
		webDriverActions.waitForSecond(1000);
		webDriverActions.scrollToLast();
		String pageURL = webDriverActions.getPageTitle();
		//Validating Footer News 18 Sites
		for (int i = 0; i < footerNw18SitesSectionsLnk.size(); i++)
		{
			webDriverActions.softMouseHover(footerNw18SitesSectionsLnk.get(i));
			webDriverActions.softHighlightElement(footerNw18SitesSectionsLnk.get(i));
			String actual = webDriverActions.getAttribute("href", footerNw18SitesSectionsLnk.get(i));
			Logs.info(getClass(), actual);
			String title = webDriverActions.getAttribute("target", footerNw18SitesSectionsLnk.get(i));
			webDriverActions.softClickJS(footerNw18SitesSectionsLnk.get(i));
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
				webDriverActions.softMouseHover(footerNw18SitesSectionsLnk.get(i));
				webDriverActions.softClickJS(footerNw18SitesSectionsLnk.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					webDriverActions.waitForSecond(1000);
				}
			}
			webDriverActions.stopPageLoading();
			expected=webDriverActions.getCurrentPageUrl();
			// it will iterate the list and validate 
			for(int j=0;j<list.size();j++)
			{
				if(actual.contains(list.get(j)))
				{
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j)), "Possibly Element Is Not Visible For This URL "+actual);	
				}
			}
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageURL);
			}
			else
			{
				webDriverActions.navigateBack();
			}
			webDriverActions.scrollToLast();
		}
		//Validating Footer Live Tv 
		webDriverActions.waitForSecond(3000);
		String actual = webDriverActions.getAttribute("href",liveTVIcon );
		Logs.info(getClass(), actual);
		webDriverActions.softClickJS(liveTVIcon);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softClickJS(liveTVIcon);
		}
		webDriverActions.switchToNewWindow();
		webDriverActions.waitForPageToLoad();
		String liveTVURL = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(actual.equals(liveTVURL), "Section Navigation Failed For the URL "+actual);
		softAssert.assertAll("Issues Found In Validating Footer News 18 Sites");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Footer Line Two Section present at the footer Part of News 18 Home Page.
	 */
	public void verfyFooterLineTwoSection()
	{
		//it takes the social share Url from property File
		ArrayList<String> list=new ArrayList<String>();
		list.add(fileUtility.readDataFromPropertyFile("facebook"));
		list.add(fileUtility.readDataFromPropertyFile("twitter"));
		list.add(fileUtility.readDataFromPropertyFile("instagram"));
		list.add(fileUtility.readDataFromPropertyFile("youtube"));
		list.add(fileUtility.readDataFromPropertyFile("jionews"));
		list.add(fileUtility.readDataFromPropertyFile("googlePlay"));
		list.add(fileUtility.readDataFromPropertyFile("apple"));
		Logs.info(getClass(), list);
		//it add the element of social share icons.
		ArrayList<WebElement> listEle=new ArrayList<WebElement>();
		listEle.add(facebookHeader);
		listEle.add(twitterAndYoutubeIcon);
		listEle.add(instaAndJioTxt);
		listEle.add(twitterAndYoutubeIcon);
		listEle.add(instaAndJioTxt);
		listEle.add(playStoreHeader);
		listEle.add(appleHeader);

		String expected ="";
		webDriverActions.waitForSecond(1000);
		webDriverActions.scrollToLast();
		String pageURL = webDriverActions.getPageTitle();
		//Validating Footer News 18 Sites
		for (int i = 0; i < footerLogoSectionsLnk.size(); i++)
		{
			webDriverActions.softHighlightElement(footerLogoSectionsLnk.get(i));
			webDriverActions.softMouseHover(footerLogoSectionsLnk.get(i));
			String actual = webDriverActions.getAttribute("href", footerLogoSectionsLnk.get(i));
			Logs.info(getClass(), actual);
			String title = webDriverActions.getAttribute("target", footerLogoSectionsLnk.get(i));
			Logs.info(getClass(), actual);
			if(actual.contains("facebook") || actual.contains("twitter") || actual.contains("instagram") || actual.contains("youtube") || actual.contains("jionews") || actual.contains("play.google.com") || actual.contains("apple"))
			{
				webDriverActions.softClickJS(footerLogoSectionsLnk.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softClickJS(footerLogoSectionsLnk.get(i));
					if(title.contains("_blank"))
					{
						webDriverActions.switchToNewWindow();
					}
					else
					{
						webDriverActions.waitForSecond(1000);
					}
				}
				webDriverActions.stopPageLoading();
				expected=webDriverActions.getCurrentPageUrl();
				for(int j=0;j<list.size();j++)
				{
					if(actual.contains(list.get(j)))
					{
						softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j)), "Possibly Element Is Not Visible For This URL "+expected);	
					}
				}
			}
			else
			{
				webDriverActions.softClickJS(footerLogoSectionsLnk.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softClickJS(footerLogoSectionsLnk.get(i));
					if(title.contains("_blank"))
					{
						webDriverActions.switchToNewWindow();
					}
					else
					{
						webDriverActions.waitForSecond(1000);
					}
				}
				webDriverActions.stopPageLoading();
				expected=webDriverActions.getCurrentPageUrl();
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Possibly Element Is Not Visible For This URL "+expected);		
			}
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageURL);
			}
			else
			{
				webDriverActions.navigateBack();
			}
			webDriverActions.scrollToLast();
		}
		softAssert.assertAll("Issues Found In Validating Footer Line Two");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Line Two Section.
	 */
	public void verfyLineTwoSection(String server)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String pageTitle = webDriverActions.getPageTitle();
		//it takes the social share Url from property File
		ArrayList<String> list=new ArrayList<String>();
		list.add(fileUtility.readDataFromPropertyFile("itsnotok"));
		list.add(fileUtility.readDataFromPropertyFile("netrasuraksha"));
		list.add(fileUtility.readDataFromPropertyFile("electral"));
		Logs.info(getClass(), list);

		//it add the element of social share icons.
		ArrayList<WebElement> listEle=new ArrayList<WebElement>();
		listEle.add(trueCallerAndNetraSurkshaIcon);
		listEle.add(trueCallerAndNetraSurkshaIcon);
		listEle.add(electricalHydraIcon);
		//Validating the Line one section Except Search Button
		for (int i = 0; i < lineTwoSectionsLnk.size(); i++)
		{

			String actual = webDriverActions.getAttribute("href", lineTwoSectionsLnk.get(i));
			Logs.info(getClass(), actual);
			String title = webDriverActions.getAttribute("target", lineTwoSectionsLnk.get(i));
			if(actual.contains("itsnotok") || actual.contains("netrasuraksha") || actual.contains("electral"))
			{
				webDriverActions.softHighlightElement(lineTwoSectionsLnk.get(i));
				webDriverActions.softWaitForElementVisibility(lineTwoSectionsLnk.get(i), 3);
				webDriverActions.softClick(lineTwoSectionsLnk.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softWaitForElementVisibility(lineTwoSectionsLnk.get(i), 3);
					webDriverActions.softClickJS(lineTwoSectionsLnk.get(i));
				}
				String expected = webDriverActions.getCurrentPageUrl();	
				webDriverActions.waitForSecond(1000);
				webDriverActions.stopPageLoading();
				for(int j=0;j<list.size();j++)
				{
					if(expected.contains(list.get(j)))
					{
						softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j)), "Possibly Element Is Not Visible For This URL "+expected);	
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
			}
			else
			{
				webDriverActions.softHighlightElement(lineTwoSectionsLnk.get(i));
				webDriverActions.softWaitForElementVisibility(lineTwoSectionsLnk.get(i), 3);
				webDriverActions.softClick(lineTwoSectionsLnk.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softWaitForElementVisibility(lineTwoSectionsLnk.get(i), 3);
					webDriverActions.softClickJS(lineTwoSectionsLnk.get(i));
				}
				webDriverActions.waitForPageToLoad();
				String expected = webDriverActions.getCurrentPageUrl();	
				if(server.contains("preProd") && !expected.contains("//beta"))
				{
					String betaUrl = genericUtility.replaceInUrl(expected);
					expected=betaUrl;
					webDriverActions.navigateToUrl(expected);
				}
				webDriverActions.waitForSecond(1000);
				webDriverActions.stopPageLoading();
				webDriverActions.softWaitForElementVisibility(headerTxtLogoLnk, 3);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Failed To display Header Icon For This URL"+expected);
				if(title.contains("_blank"))
				{
					webDriverActions.closeDriver();
					webDriverActions.switchToWindow(pageTitle);
				}
				else
				{
					if (expected.contains(actual)) {
						webDriverActions.navigateBack();
					}
					else {
						webDriverActions.navigateBack();
						webDriverActions.navigateBack();
					}
				}

			}
		}	
	}
	//*********************Anupam**Business Logic*****************

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Movies Widget Image
	 */
	public void verifyMoviesWidgetImg(String serverType ) {
		verifyImageNavigation(serverType,moviesWidgetImgLnk, breadcrumDiv);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of CricketNext Widget Image
	 */
	public void verifyCricketNextWidgetImg(String serverType ) {
		verifyImageNavigation(serverType,cricketNextWidgetImgLnk, breadcrumDiv);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of India Widget Image
	 */
	public void verifyIndiaWidgetImg(String serverType ) {
		verifyImageNavigation(serverType,indiaWidgetImgLnk, breadcrumDiv);	
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget Image
	 */
	public void verifyBusinessWidgetImg(String serverType ) {
		verifyImageNavigation(serverType ,businessWidgetImgLnk, breadcrumDiv);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Movies Widget Article
	 */
	public void verifyMoviesWidgetArticle(String serverType ) {
		verifyArticleNavigation(serverType,moviesWidgetArticlesLnk , breadcrumDiv);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of CricketNext Widget Article
	 */
	public void verifyCricketNextWidgetArticle(String serverType ) {
		verifyArticleNavigation(serverType,cricketNextWidgetArticlesLnk , breadcrumDiv);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of India Widget Article
	 */
	public void verifyIndiaWidgetArticle(String serverType ) {
		verifyArticleNavigation(serverType,indiaWidgetArticlesLnk , breadcrumDiv);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget Article
	 */
	public void verifyBusinessWidgetArticle(String serverType ) {
		verifyArticleNavigation(serverType,businessWidgetArticlesLnk , breadcrumDiv);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Movies News
	 */
	public void verifyMoreMoviesLnk(String serverType) {
		verifyMoreLnk(serverType,moreMoviesWidgetLnk);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More CricketNext News
	 */
	public void verifyMoreCricketNextLnk(String serverType) {
		verifyMoreLnk(serverType,moreCricketNextWidgetLnk);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More India News
	 */
	public void verifyMoreIndiaLnk(String serverType) {
		verifyMoreLnk(serverType,moreIndiaWidgetLnk);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Business News
	 */
	public void verifyMoreBusinessLnk(String serverType) {
		verifyMoreLnk(serverType,moreBusinessWidgetLnk);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate more link of widget in home page
	 * @param moreLnk
	 */
	public void verifyMoreLnk(String serverType, WebElement moreLnk) {
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		String actualUrl = webDriverActions.getAttribute("href", moreLnk);
		String actual = webDriverActions.getTextFromElement(moreLnk);
		Logs.info(getClass(),"Actual text Before Click " + actual);
		webDriverActions.softClickJS(moreLnk);

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

		//		String expectedUrl = webDriverActions.getCurrentPageUrl();
		String expected = webDriverActions.getTextFromElement(breadcrumbTxt);
		Logs.info(getClass(),"Actual text After Click " + expected);
		softAssert.assertTrue((genericUtility.compareTwoStrings(actual, expected)),"Failed to navigate "+actual);
		softAssert.assertAll("Issues found in this url"+ webDriverActions.getCurrentPageUrl());
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of VideoWall Widget Image
	 */
	public void verifyVideoWallImgLnk(String serverType) {
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(videoWallWidgetImgLnk.get(0));
		softAssert.assertTrue(videoWallWidgetImgLnk.size()>0, " Possibly Element is Not Visible "+ videoWallWidgetImgLnk );
		for(int i=0;i<videoWallWidgetImgLnk.size();i++)
		{
			webDriverActions.softMouseHover(videoWallWidgetImgLnk.get(i));
			webDriverActions.softScrollToElement(videoWallWidgetImgLnk.get(i));
			webDriverActions.softClickJS(videoWallWidgetImgLnk.get(i));

			webDriverActions.waitForSecond(1000);
			String currentPage = webDriverActions.getCurrentPageUrl();

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
			webDriverActions.softHighlightElement(videoBreadcrumb);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(videoBreadcrumb),"Unable to Display Element "+videoBreadcrumb+" on "+currentPage);
			if (serverType.equalsIgnoreCase("preProd")) {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
			}
		}
		softAssert.assertAll("Issues found in Video Wall Image link");

	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of VideoWall Widget Article
	 */
	public void verifyVideoWallArticleLnk(String serverType) {
		webDriverActions.waitForPageToLoad();
		softAssert.assertTrue(videoWallWidgetArticlesLnk.size()>0, " Possibly Element is Not Visible "+ videoWallWidgetArticlesLnk );
		for(int i=0;i<videoWallWidgetArticlesLnk.size();i++)
		{
			webDriverActions.softMouseHover(videoWallWidgetArticlesLnk.get(i));
			webDriverActions.softScrollToElement(videoWallWidgetArticlesLnk.get(i));
			String actualUrl = webDriverActions.getAttribute("href", videoWallWidgetArticlesLnk.get(i));
			webDriverActions.softClickJS(videoWallWidgetArticlesLnk.get(i));

			webDriverActions.waitForSecond(1000);
			String currentPage = webDriverActions.getCurrentPageUrl();
			softAssert.assertEquals(actualUrl, currentPage,"Unable to navigate "+actualUrl);

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
			webDriverActions.softHighlightElement(videoBreadcrumb);
			//			String expectedUrl = webDriverActions.getCurrentPageUrl();
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(videoBreadcrumb), "Unable to Display Element "+videoBreadcrumb+" on "+currentPage);
			//			softAssert.assertEquals(actualUrl, expectedUrl,"Unable to navigate "+actualUrl);
			if (serverType.equalsIgnoreCase("preProd")) {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
			}	
		}
		softAssert.assertAll("Issues found in Video Wall Article link");
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of read more for each horoscope sign
	 */
	public void horoscopeTimeLineDescription(){
		webDriverActions.waitForPageToLoad();
		String title = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillElement(astrologySigns, 5);
		softAssert.assertTrue(astrologySignsBtn.size()>0, " Possibly Element is Not Visible "+ astrologySignsBtn );
		//This loop is used for clicking each astro sign
		for(int i=0;i<astrologySignsBtn.size();i++)
		{
			String original = webDriverActions.getTextFromElement(astrologySignsTxt.get(i));
			Logs.info(getClass(), original);
			webDriverActions.softHighlightElement(astrologySignsBtn.get(i));
			webDriverActions.softWaitForElementVisibility(astrologySignsBtn.get(i),30);
			webDriverActions.softClickJS(astrologySignsBtn.get(i));
			//This is for daily , weekly , monthly and yearly horoscope timeline description
			for(int j=0;j<horoscopeList.size();j++)
			{  
				String horoscopeType= webDriverActions.getTextFromElement(horoscopeList.get(j));
				Logs.info(getClass(),horoscopeType+" TimeLine");
				webDriverActions.softWaitForElementVisibility(horoscopeList.get(j), 30);
				webDriverActions.softMouseHover(horoscopeList.get(j));
				webDriverActions.softClickJS(horoscopeList.get(j));
				//					webDriverActions.waitForSecond(2000);
				webDriverActions.softWaitForElementVisibility(horoscopeReadMore,30);
				webDriverActions.softMouseHover(horoscopeReadMore);
				webDriverActions.softHighlightElement(horoscopeReadMore);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(horoscopeReadMore),"read more is not displayed for "+original +" "+horoscopeType);
				webDriverActions.navigateToNewTab(horoscopeReadMore);
				webDriverActions.waitForSecond(1000);
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();
				webDriverActions.softWaitForElementVisibility(detailIntro, 60);
				webDriverActions.scrollToPoint(0, 80);
				webDriverActions.softScrollToElement(detailIntro);
				Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
				webDriverActions.softHighlightElement(detailIntro);
				Logs.info(getClass(), webDriverActions.getTextFromElement(detailIntro));
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(detailIntro),"failed to display description"+" after Clicking on "+original +" "+horoscopeType+" read more");
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(title);
				//					webDriverActions.waitForSecond(3000);
			}
			webDriverActions.softClickJS(nextBtn);
		}
		softAssert.assertAll("Issues found in Horoscope section Home page");
	}

	//***********************Rahul Business Logic***************************************

	/**
	 * @author Rahul
	 * This method is used to click on Latest News articles and More latest News Button 
	 * present at RHS and navigate to their respective pages
	 */
	public void latestNews(String serverType) {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softScrollToElement(latestNewsLnkList.get(0));
		if(latestNewsLnkList.size()>0) {
			for(int i=0;i<latestNewsLnkList.size();i++)
			{  
				webDriverActions.softScrollToElement(latestNewsLnkList.get(i));
				webDriverActions.softMouseHover(latestNewsLnkList.get(i));
				String actual = webDriverActions.getAttribute("href", latestNewsLnkList.get(i));
				webDriverActions.softClickJS(latestNewsLnkList.get(i));
				String currentPage = webDriverActions.getCurrentPageUrl();
				String expected = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(latestNewsarticleBreadCrum),"Unable to display Element"+webDriverActions.getCurrentPageUrl());
				if (currentPage.equals(expected)) {
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
			softAssert.fail("Possibly Element is Not Visible Or Size is "+latestNewsLnkList.size());
		}
		softAssert.assertAll("Issues found in this url "+ webDriverActions.getCurrentPageUrl()); 
	}

	/**
	 * This method is used to click on More Latest News articles and More latest News Button 
	 * present at RHS and navigate to their respective pages
	 */
	public void moreLatestNews(String serverType) {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softScrollToElement(moreLatestNewsLnk);
		webDriverActions.softMouseHover(moreLatestNewsLnk);
		webDriverActions.softClickJS(moreLatestNewsLnk);
	    String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(moreLatestNewsBradecrumb,1),"Unable to display Element"+webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues found in this url "+ webDriverActions.getCurrentPageUrl()); 
	}



	/**
	 * @author Rahul
	 * This method is used to click on Air Quality Index widgets present at the
	 * RHS and navigate their pages
	 */
	public void airQualityIndex(String serverType) {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String title = webDriverActions.getPageTitle();
		webDriverActions.softScrollToElement(trendingNews);
		webDriverActions.softWaitForElementVisibility(airQualityIndexHeadline, 2);
		webDriverActions.softScrollToElement(airQualityIndexHeadline);
		/* Below loop will fetch list of articles and navigate to each one by one */ 
		if(airQualityIndexWidgetLst.size()>0)
		{
			for(int i=0;i<airQualityIndexWidgetLst.size();i++)
			{
				webDriverActions.softScrollToElement(trendingNews);
				webDriverActions.softMouseHover(airQualityIndexWidgetLst.get(i));
				webDriverActions.softClickJS(airQualityIndexWidgetLst.get(i));
				webDriverActions.switchToNewWindow();
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				webDriverActions.waitForPageToLoad();
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(aqiBradeCrumb),"Unable to display Element"+webDriverActions.getCurrentPageUrl());
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(title);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+airQualityIndexWidgetLst.size());
		}
		softAssert.assertAll("Issues found in this url "+ webDriverActions.getCurrentPageUrl()); 
	}

	/**
	 * @author Rahul
	 * This method is used to click on Read more panchang Btn and
	 * navigate to Panchang page
	 */
	public void todaysPanchang(String serverType) { 
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(panchangHeadline, 6);
		webDriverActions.softMouseHover(readMorePanchangBtn);
		String actual = webDriverActions.getAttribute("href", readMorePanchangBtn);
		webDriverActions.waitForSecond(2000);
		webDriverActions.softClickJS(readMorePanchangBtn);
		Logs.info(getClass(),"Clicked on ReadMore Panchang Button");
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(readMorePanchangBtn);
			webDriverActions.softScrollToElement(readMorePanchangBtn);
			actual = webDriverActions.getAttribute("href", readMorePanchangBtn);
			Logs.info(getClass(), actual);
			webDriverActions.waitForSecond(2000);
			webDriverActions.softClickJS(readMorePanchangBtn);
		}
		webDriverActions.waitForPageToLoad();
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.softWaitForElementVisibility(panchangBreadcrum, 30);
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(panchangBreadcrum),"Unable to display Element");
		softAssert.assertAll("Issues found in this url "+ webDriverActions.getCurrentPageUrl()+webDriverActions.getCurrentPageUrl()); 
	}

	/**
	 * This method contains the steps to validate the functionalities of the Live Tv section
	 * present at the RHS of the page
	 * @throws InterruptedException
	 */
	public void liveTv() {

		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		//vidgyor_iframe is the frame name for Live TV
		webDriverActions.waitForElement(2000);
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
		//		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(liveTvPlayer),"Unable to display Element"+liveTvPlayer);

		/* Pause button */

		webDriverActions.waitForSecond(4000);
		webDriverActions.softMouseHover(mouseoverActionBar);
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
		webDriverActions.softWaitForElementVisibility(unmuteBtn, 20);
		webDriverActions.softClickJS(unmuteBtn);
		Logs.info(getClass(),"audio unmuted");
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(muteBtn),"Unable to display Element");

		/* Mute Button */
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softMouseHover(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(muteBtn, 20);
		webDriverActions.softClickJS(muteBtn);
		Logs.info(getClass(),"audio is muted");

		/* Share Button */
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softWaitForElementVisibility(shareBtn, 30);
		webDriverActions.softClickJS(shareBtn);
		Logs.info(getClass(),"clicked on share Button");
		webDriverActions.softClickJS(shareCloseBtn);
		Logs.info(getClass(),"clicked on close Button");

		/* Maximize Button */
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softMouseHover(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(maximizeBtn, 30);
		webDriverActions.softClickJS(maximizeBtn);
		Logs.info(getClass(), "Maximized Live Tv");

		/* Minimize Button */
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softWaitForElementVisibility(minimizeBtn, 30);
		webDriverActions.softClickJS(minimizeBtn);
		Logs.info(getClass(), "Minimized Live Tv");

		softAssert.assertAll("Live Tv Functionalities are not working fine "+ webDriverActions.getCurrentPageUrl()); 
	}

}

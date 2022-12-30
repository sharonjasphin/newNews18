package com.news18.lokmatpages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Abhishek Raj
 *This Class Contains elements and business logics for Lokmat Desktop Landing  Page
 */
public class DesktopLokmatLandingPage extends WebDriverActions{

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopLokmatLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Trending Topics Link is present in Footer of home page*/
	@FindBy(xpath="//div[contains(@class,'nhtranding')]//a[contains(@href,'/tag/')]")
	private WebElement trendingTopicsfirstLnk;

	/*Homepage First article Link  is present below the Line Two Menu bar in RHS*/
	@FindBy(xpath ="(//div[contains(@class,'topnews-right')]//li/a[not(contains(@href,'live'))  and not(contains(@href,'photogallery'))])[1]")
	private WebElement homePageArticleLnk;

	/*Videos link present after clicking on Hamburger menu*/
	@FindBy(xpath ="//div[contains(@class,'video-gallery')]//a[text()='व्हिडीओ']")
	private WebElement videosLnk;

	/*Homepage LiveBlog article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@id,'__next')]//a[contains(@href,'news-liv')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*photo section Present in L1 navigation bar */
	@FindBy(xpath="//div[contains(@class,'wapper')]//ul//li//a[.='फोटो गॅलरी']")
	private WebElement photoSectionLineOneLnk;

	/*Sports link present after clicking on Hamburger menu*/
	@FindBy(xpath ="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]//a[text()='स्पोर्ट्स']")
	private WebElement sportsSectionLnk;

	/* Section Link Present on the LIne One Section Of News18 Home Page*/
	@FindBy(xpath = "//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]//a[not(contains(@href,'/sport/')) and not(contains(@href,'/photogallery/'))]")
	private List<WebElement> sectionLnks;

	//---------------Anupam webelement-----------

	//---------nation
	/* Nation section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/national/')]")
	private WebElement nationSectionLnk;

	/* Nation section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/national/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> nationSectionArticleLnk;

	/* Nation section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/national/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> nationSectionImgLnk;

	/* Nation section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/national/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreNationSectionLnk;

	/*Breadcrumb present in nation article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]")
	private WebElement nationBreadcrumb;

	//---------InterNational
	/* Nation section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/videsh/')]")
	private WebElement interNationalSectionLnk;

	/* Nation section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/videsh/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> interNationalSectionArticleLnk;

	/* Nation section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/videsh/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> interNationalSectionImgLnk;

	/* Nation section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/videsh/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreInterNationalSectionLnk;

	/*Breadcrumb present in nation article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]")
	private WebElement interNationalBreadcrumb;

	//---------crime
	/* Crime section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/crime/')]")
	private WebElement crimeSectionLnk;

	/* Crime section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/crime/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> crimeSectionArticleLnk;

	/* Crime section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/crime/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> crimeSectionImgLnk;

	/* Crime section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/crime/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreCrimeSectionLnk;

	/*Breadcrumb present in Crime article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]")
	private WebElement crimeBreadcrumb;


	//---------career
	/* Career section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/career/')]")
	private WebElement careerSectionLnk;

	/* Career section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/career/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> careerSectionArticleLnk;

	/* Career section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/career/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> careerSectionImgLnk;

	/* Career section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/career/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreCareerSectionLnk;

	/*Breadcrumb present in Career article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]")
	private WebElement careerBreadcrumb;

	//---------Entertainment
	/* Entertainment section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/entertainment/')]")
	private WebElement entertainmentSectionLnk;

	/*Entertainment section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/entertainment/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> entertainmentSectionArticleLnk;

	/*Entertainment section Image present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/entertainment/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> entertainmentSectionImgLnk;

	/*Entertainment section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/entertainment/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreEntertainmentSectionLnk;

	/*Entertainment present in MobileAndTech article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]")
	private WebElement entertainmentBreadcrumb;

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

	//---------Technology
	/* Technology section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/technology/')]")
	private WebElement technologySectionLnk;

	/* Technology section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/technology/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> technologySectionArticleLnk;

	/* TechnologyTechnology section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/technology/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> technologySectionImgLnk;

	/* Technology section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/technology/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreTechnologySectionLnk;

	/*Breadcrumb present in Technology article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]")
	private WebElement technologyBreadcrumb;

	//---------sport
	/* Sport section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/sport/')]")
	private WebElement sportSectionLnk;

	/*Sport section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/sport/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> sportSectionArticleLnk;

	/* Sport section Image present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/sport/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> sportSectionImgLnk;

	/* Sport section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/sport/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreSportSectionLnk;

	/*Breadcrumb present in sport article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] |  //div[contains(@class,'brdcrm')]")
	private WebElement sportBreadcrumb;

	//---------sport
	/* Superhitbox section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'superhitbox')]//span | //div[contains(@class,'lk-globalhd')]//span")
	private WebElement superHitBoxSectionLnk;

	/*Superhitbox section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'superhitbox')]//li[not (contains(@class,'glide__slide--clone'))]/a  |  //div[contains(@class,'superhitSlider')]//li[not (contains(@class,'glide__slide--clone'))]//a")
	private List<WebElement> superHitBoxSectionArticleLnk;

	/*Superhitbox section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'superhitbox')]//li[not (contains(@class,'glide__slide--clone'))]//figure//img[not(contains(@aria-hidden,'true'))]  |  //div[contains(@class,'superhitSlider')]//li[not (contains(@class,'glide__slide--clone'))]//img")
	private List<WebElement> superHitBoxSectionImgLnk;

	/*Next button present in Superhitbox article page*/
	@FindBy(xpath ="//div[contains(@class,'superhitSlider')]//button[@aria-label='next']")
	private WebElement superHitBoxNextBtn;

	/*Breadcrumb present in Superhitbox article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] |  //div[contains(@class,'brdcrm')]")
	private WebElement superHitBoxBreadcrumb;

	//--------------------------------------Vipins Webelement -------------------------------------------//

	/* Article Header Text in Article Consumption Page */
	@FindBy(xpath ="//h1[contains(@class,'article_heading') or contains(@class,'live_blog') or contains(@class,'gallery_tilte')] | //div[contains(@class,'art') or contains(@class,'TstoryHead')]/h1" )
	private WebElement articleHeaderTxt;

	/* Article BreadCrumb Division */
	@FindBy(xpath = "//div[contains(@class,'brd') or contains(@class,'bread') or contains(@class,'brade')]  | //ul[contains(@class, 'bread')]")
	private WebElement articleBreadCrumbDiv;

	/*List of Priority Panel Article Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'topnews-left')]//ul/li/a")
	private List<WebElement> marathiNewsArticleLnk;

	/*List of Priority Panel Image Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'topnews-left')]//ul/li/a//img")
	private List<WebElement> marathiNewsImgLnk;

	/*List of Top News Article Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'topnews-right')]/ul[contains(@class,'top')]/li/a")
	private List<WebElement> topNewsArticleLnk;

	/*List of Top News Image Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'topnews-right')]/ul[contains(@class,'top')]/li/a//img")
	private List<WebElement> topNewsImgLnk;

	/*List of Top News Title Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'topnews-right')]/div[contains(@class,'global')]/h2/a")
	private WebElement topNewsTitleLnk;

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

	/* List of Money Section Article Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//a[contains(@href,'/money/')]/ancestor::div[contains(@class,'home-sports')]//ul/li/a")
	private List<WebElement> moneyArticleLnk;

	/* List of Money Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'global')]//a[contains(@href,'/money/')]/ancestor::div[contains(@class,'home-sports')]//ul/li/a//img[@data-src]")
	private List<WebElement> moneyImgLnk;

	/* Money Title Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'/money/')]")
	private WebElement moneyTitleLnk;

	/*Money Widget Read More Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//a[contains(@href,'/money/')]/ancestor::div[contains(@class,'home-sports')]//div[contains(@class,'sportstories')]/a")
	private WebElement moneyReadMoreLnk;

	/* List of Money Section Article Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//a[contains(@href,'/maharashtra/')]/ancestor::div[contains(@class,'home-sports')]//ul/li/a")
	private List<WebElement> maharashtraArticleLnk;

	/* List of Money Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'global')]//a[contains(@href,'/maharashtra/')]/ancestor::div[contains(@class,'home-sports')]//ul/li/a//img[@data-src]")
	private List<WebElement> maharashtraImgLnk;

	/* Money Title Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'/maharashtra/')]")
	private WebElement maharashtraTitleLnk;

	/*Money Widget Read More Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//a[contains(@href,'/maharashtra/')]/ancestor::div[contains(@class,'home-sports')]//div[contains(@class,'sportstories')]/a")
	private WebElement maharashtraReadMoreLnk;

	/* List of News18 Minis Section Image Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'nw18_minis')]/div[contains(@class,'inner')]//div[contains(@class,'imgBox')]//img[@loading]")
	private List<WebElement> news18MinisImgLnk;

	/* List of News18 Minis Section Image Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'nw18_minis')]/div[contains(@class,'inner')]//div[contains(@class,'contentBox')]//p/a[not (@target) and contains(@href,'html')]")
	private List<WebElement> news18MinisArticleLnk;

	/* News18 Minis See More Link Navigation in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'nw18_minis')]/div[contains(@class,'head')]/a")
	private WebElement news18MinisSeeMoreLnk;

	/*News18 Minis Previous Slide Button in HomePage */
	@FindBy(xpath = "//div[contains(@class,'nw18_minis')]/div[contains(@class,'inner')]//button[contains(@class,'prev')]")
	private WebElement news18MinisPrevBtn;

	/*News18 Minis Next Slide Button in HomePage */
	@FindBy(xpath = "//div[contains(@class,'nw18_minis')]/div[contains(@class,'inner')]//button[contains(@class,'next')]")
	private WebElement news18MinisNextBtn;

	/* News18 Minis Read Full Story Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'nw18_minis')]/div[contains(@class,'inner')]//div[contains(@class,'ftr_readfullstor')]/a[contains(@href,'/')]")
	private List<WebElement> news18MinisReadFullStoryLnk;

	/*News18 Minis Active Article Link in homepage */
	@FindBy(xpath = "//div[contains(@class,'nw18_minis')]/div[contains(@class,'inner')]//div[contains(@class,'slick-slide slick-active slick-current')]//div[contains(@class,'contentBox')]//h2/a")
	private WebElement activeNews18MinisArticleLnk;

	/*  News18 Minis Section New Image Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'nw18_minis')]//div[contains(@class,'slick-track')]/div[contains(@class,'slick-slide')]//div/a[contains(@class,'minishadow')]")
	private WebElement news18MinisNews18MoreNewsLnk;

	/* List of Photogallery Article links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'left')]//ul[contains(@class,'photogallerystories')]/li/a//figcaption/h3")
	private List<WebElement> photogalleryArticleLnk;

	/*List of Photogallery Images Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'left')]//ul[contains(@class,'photogallerystories')]/li/a//figure//img")
	private List<WebElement> photogalleryImgLnk;

	/* Photogallery Title Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'/photogallery/')]")
	private WebElement photogalleryTitleLnk;

	/* List of Photogallery Article links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'left')]//ul[contains(@class,'videostories')]/li/a/div/h3")
	private List<WebElement> videosArticleLnk;

	/*List of Photogallery Images Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'left')]//ul[contains(@class,'videostories')]/li/a//figure//img")
	private List<WebElement> videosImgLnk;

	/* Photogallery Title Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'/video/')]")
	private WebElement videosTitleLnk;

	/* Cities Maharashtra Title Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'/maharashtra/') and contains(@href,'lokmat')]")
	private WebElement maharashtraCitiesTitleLnk;

	/* Cities Maharashtra Cities Link in Homepage */ 
	@FindBy(xpath = "//div[contains(@class,'citiesname')]//ul/li/a")
	private List<WebElement> maharashtraCitiesCityName;

	/* Cities Maharashtra Article Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pradesh-newswrap')]/ul//li//a")
	private List<WebElement> maharashtraCitiesArticleLnk;

	/*Maharashtra Cities Section Previous Slider Button in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'citiesname')]/div[contains(@class,'contorls')]/button[@data-glide-dir='<']")
	private WebElement maharashtraSectionPreviousBtn;

	/*Cities Maharashtra Section Next Slider Button in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'citiesname')]/div[contains(@class,'contorls')]/button[@data-glide-dir='>']")
	private WebElement maharashtraSectionNextBtn;

	/* Active Cities Maharashtra Section City Name in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'citiesname')]/div/ul/li[contains(@class,'active')]/a")
	private WebElement activeMaharashtraCityName;

	/*Cities Maharashtra Section Read More Link in Homeoage*/
	@FindBy(xpath = "//div[contains(@class,'pradesh-newswrap')]/parent::div/a")
	private WebElement maharashtraSectionReadMoreLnk;

	//====================================Sanjeeb's Element=====================================

	/*Change Language Elements List present at Header Part*/
	@FindBy(xpath="//div[contains(@class,'languagebox_')]//a")
	private List<WebElement> changeLanguageList;

	/*Change Language Button present at Header Part*/
	@FindBy(xpath="//div[contains(@class,'languagebox_')]")
	private WebElement changeLanguageBtn;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'headerContainer')] | //div[contains(@class,'headerContainer')]//h2 | //div[contains(@class,'n18hcontainer')] ")
	private WebElement headerTxtLogoLnk;

	/*Header Part Element of Lokmat*/
	@FindBy(xpath="//div[contains(@class,'nhhdr-nav')]/div/div[not (contains(@class,'languagebox'))]/a | //div[contains(@class,'nhhdr-nav')]/div[contains(@class,'tranding')]/a")
	private List<WebElement> headerEleList;

	/*Change Language Button present at Header Part*/
	@FindBy(xpath="(//div[contains(@class,'lnlivetv')])[1]")
	private WebElement headerSection;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="(//div[contains(@class,'logo-renderer')])[1]")
	private WebElement youtubeIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//h2")
	private WebElement twitterIcon;

	/*instagram and jio news Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="(//h2)[1] | //img[contains(@alt,'Instagram')]")
	private WebElement instaAndJioTxt;

	/*Header Text Link Present in google app store page*/
	@FindBy(xpath ="//header//a[contains(@href,'store/games')]")
	private WebElement playStoreHeader;

	/*Header Text Link Present in apple app store page*/
	@FindBy(xpath ="//div[contains(@class,'container')]//following-sibling::ul")
	private WebElement appleHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div//a[contains(@aria-label,'Facebook')]")
	private WebElement facebookHeader;

	/*LineOne Section Elements List present at Header Part*/
	@FindBy(xpath="//ul[contains(@class,'nav_bar')]/li[ not (contains(@class,'for-logo'))]//a")
	private List<WebElement> lineOneSectionEleList;

	/*LineTwo Section Elements List present at Header Part*/
	@FindBy(xpath="//ul[contains(@class,'sub_navigation')]//a")
	private List<WebElement> lineTwoSectionEleList;

	/*Crypto Link Present on Line One Section of Homepage*/
	@FindBy(xpath ="//section[contains(@class,'banner')]")
	private WebElement cryptoLogo;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'launch_info')]")
	private WebElement netraSurkshaIcon;

	/*LineTwo Section Elements List present at Header Part*/
	@FindBy(xpath="//div[contains(@class,'open_nav_sub')]//a")
	private List<WebElement> hamburgerMenuEleList;

	/*header Hamburger Menu*/
	@FindBy(xpath ="//div[contains(@class,'nav_open')]")
	private WebElement hamburgerMenuBtn;

	/*Search  Button*/
	@FindBy(xpath ="//div[contains(@class,'header_search')]")
	private WebElement searchBtn;

	/*Search Box */
	@FindBy(xpath ="//div[contains(@id,'search-box')]")
	private WebElement searchBox;

	/*RajyaSeherChune Link Present on Line One Section Of Hindi Landing Page*/
	@FindBy(xpath="//div[contains(@class,'chsstctbtn')]")
	private WebElement rajyaSeherChuneLnk;

	/*list Of elements present under apna Seher chune*/
	@FindBy(xpath="//div[contains(@class,'tpctlits')]//a")
	private List<WebElement> apnaSeherChuneEleList;

	/*footer Section*/
	@FindBy(xpath="//section[contains(@class,'ftr_container')]")
	private WebElement footerSection;

	/*Footer Trending Section */
	@FindBy(xpath="//span[contains(text(),'Trending')]/ancestor::div[contains(@class,'side_bar')]")
	private WebElement footerTrendingSection;

	/*Footer Trending Section Element List*/
	@FindBy(xpath="//span[contains(text(),'Trending')]/ancestor::div[contains(@class,'side_bar')]//a")
	private List<WebElement> footerTrendingSectionEleList;

	/*Footer Bivag Section */
	@FindBy(xpath="//span[contains(text(),'विभाग')]/ancestor::div[contains(@class,'side_bar')]")
	private WebElement footerBivagSection;

	/*Footer Bivag Section Element List*/
	@FindBy(xpath="//span[contains(text(),'विभाग')]/ancestor::div[contains(@class,'side_bar')]//a")
	private List<WebElement> footerBivagSectionEleList;

	/*Footer Social Section */
	@FindBy(xpath="//span[contains(text(),'सोशल मीडिया')]/ancestor::div[contains(@class,'ftr_row categories')]")
	private WebElement footerSocialSection;

	/*Footer Social Section Element List*/
	@FindBy(xpath="//span[contains(text(),'सोशल मीडिया')]/ancestor::div[contains(@class,'ftr_row categories')]//a")
	private List<WebElement> footerSocialSectionEleList;

	/*Footer Language Section */
	@FindBy(xpath="//span[contains(text(),'LANGUAGE SITES')]/ancestor::div[contains(@class,'side_bar')]")
	private WebElement footerLangaugeSection;

	/*Footer Language Section Element List*/
	@FindBy(xpath="//span[contains(text(),'LANGUAGE SITES')]/ancestor::div[contains(@class,'side_bar')]//a")
	private List<WebElement> footerLanguageSectionEleList;

	/*Footer Language Section */
	@FindBy(xpath="//span[contains(text(),'NEWS18 GROUP SITES')]/ancestor::div[contains(@class,'side_bar')]")
	private WebElement footerGroupSitesSection;

	/*Footer Language Section Element List*/
	@FindBy(xpath="//span[contains(text(),'NEWS18 GROUP SITES')]/ancestor::div[contains(@class,'side_bar')]//a")
	private List<WebElement> footerGroupSitesSectionEleList;

	/*Footer LineTwo Section */
	@FindBy(xpath="//div[contains(@class,'bottom_footer')]")
	private WebElement footerLineTwoSection;

	/*Footer LineTwo Section Element List*/
	@FindBy(xpath="//div[contains(@class,'bottom_footer')]//a[not (contains(@href,'sitemap')) and not (contains(@href,'ibnkhabar'))]")
	private List<WebElement> footerLineTwoEleList;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'navbar-header')] | //div[contains(@class,'logo bxshadow')]")
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
	@FindBy(xpath ="//div[contains(@class,'r-')]//h1")
	private WebElement twitterHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'_acum')] | //div//img[contains(@alt,'Instagram')] | //div//img[contains(@alt,'Instagram')]")
	private WebElement instagramHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'ytd-topbar')]")
	private WebElement youtubeHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//img[contains(@src,'JioNewsAppIcon')]")
	private WebElement jioHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//header[@role='banner']")
	private WebElement googlePlayHeader;


	/**
	 * @author Abhishek
	 * This method is used to click on First Article of English Home Page 
	 */
	public void clickOnFirstArticleHomePage() {
		webDriverActions.waitForPageToLoad();
		try {
			webDriverActions.clickJS(homePageArticleLnk);
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First Article of Home page",e);
		}
	}


	/**
	 * @author Abhishek
	 * This method used to click on photos section
	 */
	public void clickOnPhotosSection()
	{
		try {
			webDriverActions.waitForSecond(5000);
			webDriverActions.clickJS(photoSectionLineOneLnk);
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Photos Section Link of Home page",e);
		}	
	}


	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of Telugu Home Page 
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
	 * This method is used to click on CricketNext link present on Hamburger Menu
	 */
	public void clickOnSportsLnk()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(sportsSectionLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Sports Section Link of Home page",e);
		}	
	}

	/**
	 * @author Sanjeeb
	 * This method is used to click on Entertainment Link present on Line One Section
	 */
	public void clickOnFirstSectionLnk() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(sectionLnks.get(1));
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Section page Link of Home page",e);
		}
	}


	/**
	 * @author Sanjeeb
	 * This method is used to click on Videos Section news 18 Hindi Home Page 
	 */
	public void navigateToVideosSection() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(videosLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Videos Section Link of Home page",e);
		}
	}


	/**
	 * @author Sanjeeb
	 * This method is used to Click on First topic link of Trending Topics Section present At the Footer Of HomePage
	 */
	public void clickOnFirstTopicLnkTrendingTopics() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.continuousScrollTillElement(trendingTopicsfirstLnk, GlobalVariables.sec30);
			webDriverActions.click(trendingTopicsfirstLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in First topic of Trending Topic");
		}
		webDriverActions.switchToNewWindow();
	}

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
		webDriverActions.continuousScrollTillElement(section, 8);
		webDriverActions.softMouseHover(section);
		webDriverActions.softScrollToElement(section);
		//		webDriverActions.softHighlightElement(section);
		webDriverActions.waitForElement(1000);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<artList.size() ;i++)
		{
			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			String actualUrl =	webDriverActions.getAttribute("href", artList.get(i));
			Logs.info(getClass(), actualUrl);
			webDriverActions.softClickJS(artList.get(i));
			webDriverActions.waitForPageToLoad();

			webDriverActions.waitForSecond(200);
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
			//			webDriverActions.waitForSecond(2000);
			//			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element "+element +" in "+currentPage);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}	
			webDriverActions.waitForSecond(400);
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
		webDriverActions.continuousScrollTillElement(section, 8);		
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
			//			webDriverActions.waitForSecond(2000);
			//			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) ,  "Unable to Display Element "+element + " in "+currentPage);
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
	public void verifyMoreLnks(String serverType,WebElement moreLnk, WebElement breadcrumb) 
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(2000);
		webDriverActions.scrollToPoint(0, 0);
		webDriverActions.continuousScrollTillElement(moreLnk, 8);	
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
		webDriverActions.continuousScrollTillElement(section, 12);	
		webDriverActions.softMouseHover(section);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softHighlightElement(section);
		String actualUrl = webDriverActions.getAttribute("href", section);
		Logs.info(getClass(),"Actual text Before Click " + actualUrl);
		webDriverActions.softClickJS(section);
		webDriverActions.waitForPageToLoad();

		webDriverActions.waitForSecond(100);
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
		//		webDriverActions.waitForSecond(2000);
		//		webDriverActions.softHighlightElement(breadcrumb);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+" in "+currentPage);
		webDriverActions.waitForSecond(100);
		softAssert.assertAll("Issue Found in HomePage Body Section Link");
	}

	//---nation	

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget
	 */
	public void verifyNationWidget(String serverType) {
		verifySectionLnks(serverType,nationSectionLnk, nationBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget Article
	 */
	public void verifyNationWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,nationSectionLnk,nationSectionArticleLnk, nationBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget Image
	 */
	public void verifyNationWidgetImg(String serverType) {
		verifyImgNavigation(serverType,nationSectionLnk,nationSectionImgLnk, nationBreadcrumb);
	}


	//---interNational	

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of InterNational Widget
	 */
	public void verifyInterNationalWidget(String serverType) {
		verifySectionLnks(serverType,interNationalSectionLnk, interNationalBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of InterNational Widget Article
	 */
	public void verifyInterNationalWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,interNationalSectionLnk,interNationalSectionArticleLnk, interNationalBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of InterNational Widget Image
	 */
	public void verifyInterNationalWidgetImg(String serverType) {
		verifyImgNavigation(serverType,interNationalSectionLnk,interNationalSectionImgLnk, interNationalBreadcrumb);
	}

	//-----Crime

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Crime Widget
	 */
	public void verifyCrimeWidget(String serverType) {
		verifySectionLnks(serverType,crimeSectionLnk, crimeBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Crime Widget Article
	 */
	public void verifyCrimeWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,crimeSectionLnk,crimeSectionArticleLnk, crimeBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Crime Widget Image
	 */
	public void verifyCrimeWidgetImg(String serverType) {
		verifyImgNavigation(serverType,crimeSectionLnk,crimeSectionImgLnk, crimeBreadcrumb);
	}


	//-----Career

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Career Widget
	 */
	public void verifyCareerWidget(String serverType) {
		verifySectionLnks(serverType,careerSectionLnk, careerBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Career Widget Article
	 */
	public void verifyCareerWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,careerSectionLnk,careerSectionArticleLnk, careerBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Career Widget Image
	 */
	public void verifyCareerWidgetImg(String serverType) {
		verifyImgNavigation(serverType,careerSectionLnk,careerSectionImgLnk, careerBreadcrumb);
	}

	//-----Entertainment
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Entertainment Widget
	 */
	public void verifyEntertainmentWidget(String serverType) {
		verifySectionLnks(serverType,entertainmentSectionLnk, entertainmentBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Entertainment Widget Article
	 */
	public void verifyEntertainmentWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,entertainmentSectionLnk,entertainmentSectionArticleLnk, entertainmentBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Entertainment Widget Image
	 */
	public void verifyEntertainmentWidgetImg(String serverType) {
		verifyImgNavigation(serverType,entertainmentSectionLnk,entertainmentSectionImgLnk, entertainmentBreadcrumb);
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

	//---Technology

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Technology Widget
	 */
	public void verifyTechnologyWidget(String serverType) {
		verifySectionLnks(serverType,technologySectionLnk, technologyBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Technology Widget Article
	 */
	public void verifyTechnologyWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,technologySectionLnk,technologySectionArticleLnk, technologyBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Technology Widget Image
	 */
	public void verifyTechnologyWidgetImg(String serverType) {
		verifyImgNavigation(serverType,technologySectionLnk,technologySectionImgLnk, technologyBreadcrumb);
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

	//-----SuperHitBox
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of SuperHitBox Widget Article
	 */
	public void verifySuperHitBoxWidgetArticle(String serverType) {
		{
			SoftAssert softAssert = new SoftAssert();
			webDriverActions.waitForPageToLoad();
			webDriverActions.scrollToLast();
			webDriverActions.scrollToPoint(0, 0);
			webDriverActions.continuousScrollTillElement(superHitBoxSectionLnk, 4);
			webDriverActions.softMouseHover(superHitBoxSectionLnk);
			//			webDriverActions.softScrollToElement(superHitBoxSectionLnk);
			webDriverActions.softHighlightElement(superHitBoxSectionLnk);
			webDriverActions.waitForElement(1000);
			softAssert.assertTrue(superHitBoxSectionArticleLnk.size()>0, " Possibly Element is Not Visible "+ superHitBoxSectionArticleLnk );
			for(int i=0; i<superHitBoxSectionArticleLnk.size() ;i++)
			{
				String actualUrl =	webDriverActions.getAttribute("href", superHitBoxSectionArticleLnk.get(i));
				Logs.info(getClass(), actualUrl);
				webDriverActions.mouseHoverAndClick(superHitBoxSectionArticleLnk.get(i));
				webDriverActions.waitForPageToLoad();

				//				webDriverActions.waitForSecond(1000);
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
				//				webDriverActions.waitForSecond(2000);
				//				webDriverActions.softHighlightElement(superHitBoxBreadcrumb);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(superHitBoxBreadcrumb) , "Unable to Display Element "+superHitBoxBreadcrumb +" in "+currentPage);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForSecond(50);
			}
			softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	
		}
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of SuperHitBox Widget Article
	 */
	public void verifySuperHitBoxWidgetImg(String serverType) {
		{
			SoftAssert softAssert = new SoftAssert();
			webDriverActions.waitForPageToLoad();
			webDriverActions.scrollToLast();
			webDriverActions.scrollToPoint(0, 0);
			webDriverActions.continuousScrollTillElement(superHitBoxSectionLnk, 4);
			webDriverActions.softMouseHover(superHitBoxSectionLnk);
			//			webDriverActions.softScrollToElement(superHitBoxSectionLnk);
			webDriverActions.softHighlightElement(superHitBoxSectionLnk);
			webDriverActions.waitForElement(1000);
			softAssert.assertTrue(superHitBoxSectionImgLnk.size()>0, " Possibly Element is Not Visible "+ superHitBoxSectionImgLnk );
			for(int i=0; i<superHitBoxSectionImgLnk.size() ;i++)
			{
				webDriverActions.mouseHoverAndClick(superHitBoxSectionImgLnk.get(i));
				webDriverActions.waitForPageToLoad();

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
				//				webDriverActions.waitForSecond(2000);
				//				webDriverActions.softHighlightElement(superHitBoxBreadcrumb);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(superHitBoxBreadcrumb) , "Unable to Display Element "+superHitBoxBreadcrumb +" in "+currentPage);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForSecond(50);
			}
			softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	
		}
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation in home page
	 * @param section
	 * @param artList
	 */
	public void verifySuperHitBoxWidgetArticles(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String title = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillElement(superHitBoxSectionLnk, 20);
		webDriverActions.softScrollToElement(superHitBoxSectionLnk);
		webDriverActions.softHighlightElement(superHitBoxSectionLnk);
		softAssert.assertTrue(superHitBoxSectionArticleLnk.size()>0, " Possibly Element is Not Visible "+ superHitBoxSectionArticleLnk );
		for(int i=0; i<1 ;i++)
		{
			webDriverActions.softWaitForElementVisibility(superHitBoxSectionArticleLnk.get(i),5);
			String actualUrl =	webDriverActions.getAttribute("href", superHitBoxSectionArticleLnk.get(i));
			Logs.info(getClass(), actualUrl);
			webDriverActions.navigateToNewTab(superHitBoxSectionArticleLnk.get(i));
			webDriverActions.switchToNewWindow();
			webDriverActions.waitForPageToLoad();

			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(title);
				webDriverActions.waitForSecond(2000);
				webDriverActions.softMouseHover(superHitBoxSectionArticleLnk.get(i));
				actualUrl =	webDriverActions.getAttribute("href",superHitBoxSectionArticleLnk.get(i));
				Logs.info(getClass(), actualUrl);
				webDriverActions.navigateToNewTab(superHitBoxSectionArticleLnk.get(i));
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();
			}


			webDriverActions.waitForSecond(1000);
			String currentPage = webDriverActions.getCurrentPageUrl();
			String expectedUrl = webDriverActions.getCurrentPageUrl();
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
			webDriverActions.softWaitForElementVisibility(superHitBoxBreadcrumb, 5);
			Logs.info(getClass(), expectedUrl);
			webDriverActions.softHighlightElement(superHitBoxBreadcrumb);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(superHitBoxBreadcrumb) , "Unable to Display Element "+superHitBoxBreadcrumb +"in "+currentPage);
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(title);
			webDriverActions.waitForSecond(2000);
		}
		softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	
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
		//			String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(artList, 15);
		webDriverActions.waitForElement(1000);
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
			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in "+currentPage);;
			//				webDriverActions.navigateToUrl(homeUrl);
			if (currentPage.equals(expectedUrl) && expectedUrl.contains("//beta"))
			{
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}	
			webDriverActions.waitForSecond(1000);
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
		webDriverActions.waitForElement(1000);
		if(imgList.size()>0)
		{
			for(int i=0; i<imgList.size() ;i++)
			{
				webDriverActions.softMouseHover(imgList.get(i));
				webDriverActions.softScrollToElement(imgList.get(i));
				String actual =	webDriverActions.getAttribute("src", imgList.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softHighlightElement(imgList.get(i));
				webDriverActions.softClickJS(imgList.get(i));
				//								webDriverActions.waitForPageToLoad();
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
				webDriverActions.softHighlightElement(element);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) ,  "Unable to Display Element in "+currentPage);
				//					webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.equals(expectedUrl) && expectedUrl.contains("//beta"))
				{
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForSecond(1000);
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
		webDriverActions.waitForElement(1000);					
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
		webDriverActions.continuousScrollTillElement(element,20);
		webDriverActions.waitForElement(1000);
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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb), "Unable to Display Element in"+currentPage);
		softAssert.assertAll("Issue in Homepage Body ");
	}


	public void verifyMarathiNewsArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, marathiNewsArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyMarathiNewsImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, marathiNewsImgLnk, articleBreadCrumbDiv);
	}

	public void verifyTopNewsArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, topNewsArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyTopNewsImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, topNewsImgLnk, articleBreadCrumbDiv);
	}

	public void verifyTopNewsTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, topNewsTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyWebstoriesArticleNavigation(String serverType)
	{
		List<String> list=new ArrayList<String>();
		//		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(webstoriesTitleLnk, 10);
		webDriverActions.softMouseHover(webstoriesTitleLnk);
		webDriverActions.scrollDown();
		for(int i=0 ; i<webstoriesArticleLnk.size() ; i++)
		{
			String attribute = webstoriesArticleLnk.get(i).getAttribute("href");
			if(serverType.equalsIgnoreCase("preProd") && !attribute.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(attribute);	
				Logs.info(getClass(), "Url Replaced "+betaUrl);
				list.add(betaUrl);
			}
		}
		Logs.info(getClass(),"Total Links "+list.size());
		list.parallelStream().forEach(e -> checkLinks(e));
		softAssert.assertAll("Issue Found in Homepage ");

	}
	//		public void verifyWebstoriesArticleNavigation(String serverType)
	//		{
	//			SoftAssert softAssert =new SoftAssert();
	//			webDriverActions.waitForPageToLoad();
	//			String title = webDriverActions.getPageTitle();
	//			webDriverActions.continuousScrollTillAllElement(webstoriesArticleLnk, 20);
	//			if(webstoriesArticleLnk.size()>0)
	//			{
	//				webDriverActions.softScrollToElement(webstoriesArticleLnk.get(0));
	//				webDriverActions.softMouseHover(webstoriesArticleLnk.get(0));
	//				webDriverActions.waitForSecond(1000);
	//				for(int i=0; i<webstoriesArticleLnk.size() ;i++)
	//				{
	//					webDriverActions.softClickJS(webstoriesSliderBtn.get(i));
	//					webDriverActions.softClickJS(activeWebstoriesArticleLnk);
	//					webDriverActions.switchToNewWindow();
	//					webDriverActions.waitForSecond(1000);
	//					String currentPage =webDriverActions.getCurrentPageUrl();
	//					Logs.info(getClass(), currentPage);
	//					if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
	//						String betaUrl = genericUtility.replaceInUrl(currentPage);
	//						webDriverActions.navigateToUrl(betaUrl);
	//						currentPage=betaUrl;
	//					}
	//					else {
	//						currentPage = webDriverActions.getCurrentPageUrl();
	//					}
	//					webDriverActions.waitForSecond(1000);
	//					webDriverActions.softHighlightElement(nextWebStoryBtn);
	//					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(nextWebStoryBtn) , "Unable to Display Element in "+currentPage);;
	//					webDriverActions.closeDriver();
	//					webDriverActions.switchToWindow(title);
	//				}
	//			}
	//			else
	//			{
	//				softAssert.fail("Possibly Element is Not Visible or Size is "+webstoriesArticleLnk.size());
	//			}
	//			softAssert.assertAll("Issues Found in Homepage Body");
	//		}

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
			for(int i = 0 ; i< 20 ; i++)
			{
				webDriverActions.softMouseHover(activeWebstoriesArticleLnk);
				webDriverActions.softScrollToElement(activeWebstoriesArticleLnk);
				String beforeSlide = webDriverActions.getTextFromElement(activeWebstoriesArticleLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softHighlightElement(webstoriesSliderBtn.get(i));
				webDriverActions.softClickJS(webstoriesSliderBtn.get(i));
				webDriverActions.waitForSecond(800);
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

	public void verifyMoneyArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , moneyArticleLnk, articleHeaderTxt);
	}

	public void verifyMoneyImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType , moneyImgLnk, articleHeaderTxt);
	}

	public void verifyMoneyTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , moneyTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyMoneyReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, moneyReadMoreLnk, articleBreadCrumbDiv);
	}

	public void verifyMaharashtraArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , maharashtraArticleLnk, articleHeaderTxt);
	}

	public void verifyMaharashtraImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType , maharashtraImgLnk, articleHeaderTxt);
	}

	public void verifyMaharashtraTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , maharashtraTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyMaharashtraReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, maharashtraReadMoreLnk, articleBreadCrumbDiv);
	}

	public void verifyNews18MinisArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , news18MinisArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyNews18MinisImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , news18MinisImgLnk, articleBreadCrumbDiv);
	}

	public void verifyNews18MinisSeeMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , news18MinisSeeMoreLnk, articleBreadCrumbDiv);
	}

	public void verifyNews18MinisSliderNavigation()
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(news18MinisReadFullStoryLnk, 10);
		webDriverActions.softMouseHover(activeNews18MinisArticleLnk);
		if(webDriverActions.softIsElementDisplayed(news18MinisNextBtn))
		{
			String beforeSlide = webDriverActions.getAttribute("href", activeNews18MinisArticleLnk);
			Logs.info(getClass(), beforeSlide);
			webDriverActions.softClickJS(news18MinisNextBtn);
			webDriverActions.waitForSecond(2000);
			String afterSlide = webDriverActions.getAttribute("href", activeNews18MinisArticleLnk);
			Logs.info(getClass(), afterSlide);
			softAssert.assertNotEquals(beforeSlide, afterSlide);
		}
		else
		{
			softAssert.fail("Possibly Next Button is Not Displayed in News18 Minis Section");
		}
		if(webDriverActions.softIsElementDisplayed(news18MinisPrevBtn))
		{
			String beforeSlide = webDriverActions.getAttribute("href", activeNews18MinisArticleLnk);
			Logs.info(getClass(), beforeSlide);
			webDriverActions.softClickJS(news18MinisPrevBtn);
			webDriverActions.waitForSecond(2000);
			String afterSlide = webDriverActions.getAttribute("href", activeNews18MinisArticleLnk);
			Logs.info(getClass(), afterSlide);
			softAssert.assertNotEquals(beforeSlide, afterSlide);
		}
		else
		{
			softAssert.fail("Possibly Previous Button is Not Displayed in News18 Minis Section");
		}
		softAssert.assertAll("Issue Found In Homepage Body");
	}

	public void verifyNews18MinisReadFullStoryNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(news18MinisReadFullStoryLnk, 20);
		if(news18MinisReadFullStoryLnk.size()>0)
		{
			webDriverActions.softScrollToElement(news18MinisReadFullStoryLnk.get(0));
			for(int i=0 ; i<news18MinisReadFullStoryLnk.size() ; i++)
			{
				webDriverActions.continuousScrollTillAllElement(news18MinisReadFullStoryLnk, 20);
				webDriverActions.softMouseHover(news18MinisReadFullStoryLnk.get(i));
				webDriverActions.softClickJS(news18MinisReadFullStoryLnk.get(i));
				webDriverActions.waitForPageToLoad();
				webDriverActions.waitForSecond(1000);
				String currentPage = webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), currentPage);
				String expectedUrl = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd") && !expectedUrl.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.waitForPageToLoad();
				webDriverActions.softHighlightElement(articleBreadCrumbDiv);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element in "+currentPage);
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
			softAssert.fail("Possibly Element is Not Visible or Size is "+news18MinisReadFullStoryLnk.size());
		}
		softAssert.assertAll("Issue Found in Homepage Body");
	}


	public void verifyNews18MinisNews18MoreStories(String serverType)
	{
		verifyMoreNewsNavigation(serverType, news18MinisNews18MoreNewsLnk, articleBreadCrumbDiv);
	}

	public void verifyPhotogalleryArticleNavigation(String serveType)
	{
		verifyArticleNavigation(serveType, photogalleryArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyPhotogalleryImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, photogalleryImgLnk, articleBreadCrumbDiv);
	}

	public void verifyPhotogalleryTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, photogalleryTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyVideoArticleNavigation(String serveType)
	{
		verifyArticleNavigation(serveType, videosArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyVideoImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, videosImgLnk, articleBreadCrumbDiv);
	}

	public void verifyVideoTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, videosTitleLnk, articleBreadCrumbDiv);
	}

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 */
	public void verifyCitiesMaharashtraTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, maharashtraCitiesTitleLnk, articleBreadCrumbDiv);
	}

	/**
	 * @author VipinKumarGawande
	 * This method used to verify Lokmat Slider Navigation on Home Page
	 */
	public void verifyMaharashtraCitiesSliderNavigation()
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(maharashtraSectionNextBtn, 10);
		webDriverActions.softMouseHover(maharashtraSectionNextBtn);
		webDriverActions.softScrollToElement(maharashtraSectionNextBtn);
		if(webDriverActions.isElementDisplayed(maharashtraSectionNextBtn))
		{
			for(int i = 0 ; i< maharashtraCitiesCityName.size() ; i++)
			{
				webDriverActions.softMouseHover(maharashtraSectionNextBtn);
				webDriverActions.softScrollToElement(maharashtraSectionNextBtn);
				String beforeSlide = webDriverActions.getTextFromElement(activeMaharashtraCityName);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softClickJS(maharashtraSectionNextBtn);
				webDriverActions.waitForSecond(2000);
				String afterSlide = webDriverActions.getTextFromElement(activeMaharashtraCityName);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Next Slider is Not Working ");
			}
		}
		else
		{
			softAssert.fail("Possibly Next Slider Button Is Not Displayed ");
		}

		if(webDriverActions.isElementDisplayed(maharashtraSectionPreviousBtn))
		{
			for(int i = 0 ; i< 10 ; i++)
			{
				webDriverActions.softMouseHover(maharashtraSectionPreviousBtn);
				webDriverActions.softScrollToElement(maharashtraSectionPreviousBtn);
				String beforeSlide = webDriverActions.getTextFromElement(activeMaharashtraCityName);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softClickJS(maharashtraSectionPreviousBtn);
				webDriverActions.waitForSecond(2000);
				String afterSlide = webDriverActions.getTextFromElement(activeMaharashtraCityName);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Previous Slider is Not Working ");
			}
		}
		else
		{
			softAssert.fail("Possibly Previous Slider Button Is Not Displayed ");
		}
		softAssert.assertAll("Issue in Homepage Body ");
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to click and navigate to Lokmat Cities Articles
	 * @return 
	 */
	//					public void verifyMaharashtraCitiesNavigation(String serverType)
	//					{
	//						HomePageLinksValidation http = new HomePageLinksValidation(driver);
	//
	//						SoftAssert softAssert =new SoftAssert();
	//						webDriverActions.waitForPageToLoad();
	//						webDriverActions.softScrollToElement(maharashtraCitiesCityName.get(0));
	//						softAssert.assertTrue(maharashtraCitiesCityName.size()>0, "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());
	//						ArrayList<String> articleList = new ArrayList<>();
	//						webDriverActions.waitForElement(1000);
	//
	//						for (int i = 0; i <maharashtraCitiesCityName.size() ;i++) {
	//							webDriverActions.softMouseHover(maharashtraCitiesCityName.get(i));
	//							webDriverActions.softHighlightElement(maharashtraCitiesCityName.get(i));
	//							webDriverActions.softClickJS(maharashtraCitiesCityName.get(i));
	//							webDriverActions.waitForSecond(2000);
	//							for (int j = 0; j < maharashtraArticleLnk.size();j++) {
	//								String aticleLink = maharashtraArticleLnk.get(j).getAttribute("href");
	//								if (serverType.equalsIgnoreCase("preProd")) {
	//									String betaUrl = genericUtility.replaceInUrl(aticleLink);	
	//									articleList.add(betaUrl);
	//								}
	//							}
	////							webDriverActions.softClickJS(kannadaSectionNextBtn);
	//						}
	//						Logs.info(getClass(),"Total Links "+articleList.size());
	//						long startingTime= System.currentTimeMillis();
	//						articleList.parallelStream().forEach(e -> http.checkLinks(e));
	//						long endingTime= System.currentTimeMillis();
	//						Logs.info(getClass(),"  Total time  "+(endingTime-startingTime)/1000 +"s");
	//						softAssert.assertAll("Issue present in this Url : "+webDriverActions.getCurrentPageUrl()+" "+" are below ");
	//
	//					}


	public void checkLinks(String links)  {
		//		SoftAssert softAssert = new SoftAssert();
		try {
			String authStr = fileUtility.readDataFromPropertyFile("username")+":"+fileUtility.readDataFromPropertyFile("password");
			String encoded = Base64.getEncoder().encodeToString(authStr.getBytes());  //Java 8

			HttpURLConnection httpUrlConnection = (HttpURLConnection) new URL(links).openConnection();
			httpUrlConnection.setRequestProperty("Authorization", "Basic "+encoded);
			//				URL url=new URL(links);
			httpUrlConnection.connect();
			int responseCode = httpUrlConnection.getResponseCode();
			Logs.info(getClass(), responseCode + "--------------- "  +links);
			softAssert.assertTrue((responseCode<400), "URL has issue in "+links);
		}
		catch (Exception e) {
			Logs.error(getClass(), "Unable to fetch the link response ", e );
		} 
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to click and navigate to Lokmat Cities Articles
	 */
	public void verifyMaharashtraCitiesArticleNavigation(String serverType)
	{

		List<String> list=new ArrayList<String>();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(maharashtraCitiesCityName, 10);
		webDriverActions.scrollDown();
		for(int i=0;i<maharashtraCitiesCityName.size() ; i++)
		{
			webDriverActions.mouseHover(maharashtraCitiesCityName.get(i));
			webDriverActions.softClickJS(maharashtraCitiesCityName.get(i));
			webDriverActions.waitForSecond(1000);
			for(int j=0 ; j<maharashtraCitiesArticleLnk.size() ; j++)
			{
				String attribute = maharashtraCitiesArticleLnk.get(j).getAttribute("href");
				if (serverType.equalsIgnoreCase("preProd")) {
					String betaUrl = genericUtility.replaceInUrl(attribute);	
					Logs.info(getClass(), "Url Replaced "+betaUrl);
					list.add(betaUrl);
				}
			}
		}
		Logs.info(getClass(),"Total Links "+list.size());
		list.parallelStream().forEach(e -> checkLinks(e));
		softAssert.assertAll("Issue Found in Homepage ");

	}

	public void verifyMaharashtraCitiesReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.softScrollToElement(maharashtraCitiesCityName.get(0));
		webDriverActions.waitForElement(1000);
		softAssert.assertTrue(maharashtraCitiesCityName.size()>0, "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());

		/* Below loop validates the Lokmat cities articles Navigations */
		for (int i = 0; i < maharashtraCitiesCityName.size() ;i++) {
			webDriverActions.softHighlightElement(maharashtraCitiesCityName.get(i));
			webDriverActions.softMouseHover(maharashtraCitiesCityName.get(i));
			webDriverActions.softClickJS(maharashtraCitiesCityName.get(i));
			webDriverActions.waitForSecond(2000);
			webDriverActions.softMouseHover(maharashtraSectionReadMoreLnk);
			webDriverActions.softClickJS(maharashtraSectionReadMoreLnk);
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.contains("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl=betaUrl;
			}
			webDriverActions.waitForPageToLoad();
			webDriverActions.softHighlightElement(articleBreadCrumbDiv);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element in ");
			if (serverType.contains("preProd") && expectedUrl.contains("//beta") ) {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			else
			{
				webDriverActions.navigateBack();
			}
		}
	}


	//===================================Sanjeeb's Business Logics=================================

	/**
	 * @author SanjeebKumarPati
	 * This method used to Verify Header Line Two Third Party Section
	 */
	public void verifyLineOneAndTwoSection(String server,List<WebElement> lineTwoSectionEleList) {
		String actual="";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String parentTitle = webDriverActions.getPageTitle();

		//it takes the social share Url from property File
		ArrayList<String> list=new ArrayList<String>();
		list.add(fileUtility.readDataFromPropertyFile("netrasuraksha"));
		list.add(fileUtility.readDataFromPropertyFile("crypto"));

		//it add the element of social share icons.
		ArrayList<WebElement> listEle=new ArrayList<WebElement>();
		listEle.add(netraSurkshaIcon);
		listEle.add(cryptoLogo);

		if (lineTwoSectionEleList.size()>0) {
			for (int i = 0; i < lineTwoSectionEleList.size(); i++) {
				String lineTwo = webDriverActions.getAttribute("href", lineTwoSectionEleList.get(i));
				if(lineTwo.contains("netrasuraksha") || lineTwo.contains("crypto"))
				{
					webDriverActions.softHighlightElement(lineTwoSectionEleList.get(i));
					webDriverActions.mouseHover(lineTwoSectionEleList.get(i));
					webDriverActions.navigateToNewTab(lineTwoSectionEleList.get(i));
					webDriverActions.switchToNewWindow();
					actual =webDriverActions.getCurrentPageUrl();
					for(int j=0;j<list.size();j++)
					{
						if(actual.contains(list.get(j)))
						{
							softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j)), "Possibly Element Is Not Visible For This URL "+actual);
						}
					}
				}
				else
				{
					webDriverActions.softHighlightElement(lineTwoSectionEleList.get(i));
					webDriverActions.mouseHover(lineTwoSectionEleList.get(i));
					webDriverActions.navigateToNewTab(lineTwoSectionEleList.get(i));
					webDriverActions.switchToNewWindow();
					actual =webDriverActions.getCurrentPageUrl();
					if(server.contains("preProd") && !actual.contains("//beta"))
					{
						String betaUrl = genericUtility.replaceInUrl(actual);
						actual=betaUrl;
						webDriverActions.navigateToUrl(actual);
					}
					webDriverActions.waitForSecond(1000);
					webDriverActions.stopPageLoading();
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Possibly Element Is Not Visible For This URL "+actual);
				}
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+lineTwoSectionEleList.size());
		}
		softAssert.assertAll("Issues found in this Url "+ actual);
	}




	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify line one Section Present On Header of Lokmat Language.
	 */
	public void verifyLineOneSection(String server) {
		verifyLineOneAndTwoSection(server, lineOneSectionEleList);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify line Two Section Present On Header of Lokmat Language.
	 */
	public void verifyLineTwoSection(String server) {
		verifyLineOneAndTwoSection(server, lineTwoSectionEleList);
	}



	/**
	 * @author SanjeebKumarPati
	 * This method used to navigate to All News18 Languages present in Home Page Header
	 */
	public void verifyChangeLanguage() {
		webDriverActions.waitForPageToLoad();
		String languageUrl="";
		webDriverActions.waitForElement(1000);
		String parentTitle = webDriverActions.getPageTitle();
		if (changeLanguageList.size()>0) {
			webDriverActions.softMouseHover(changeLanguageBtn);
			for (int i = 1; i < changeLanguageList.size(); i++) {
				webDriverActions.softHighlightElement(changeLanguageList.get(i));
				webDriverActions.navigateToNewTab(changeLanguageList.get(i));
				webDriverActions.switchToNewWindow();
				languageUrl=webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), "Naviagted to "+languageUrl);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk),"Unable to display "+languageUrl);
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+changeLanguageList.size());
		}
		softAssert.assertAll("Isuues Found In Change Language Section "+languageUrl);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method Is use to Verify Header Section Present on HomePage.
	 */
	public void verifyHeaderSection(String server) {
		String expected ="";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String parentTitle = webDriverActions.getPageTitle();

		//it takes the social share Url from property File
		ArrayList<String> list=new ArrayList<String>();
		list.add(fileUtility.readDataFromPropertyFile("facebook"));
		list.add(fileUtility.readDataFromPropertyFile("twitter"));
		list.add(fileUtility.readDataFromPropertyFile("instagram"));
		list.add(fileUtility.readDataFromPropertyFile("youtube"));
		list.add(fileUtility.readDataFromPropertyFile("googlePlay"));
		list.add(fileUtility.readDataFromPropertyFile("apple"));
		Logs.info(getClass(), list);
		//it add the element of social share icons.
		ArrayList<WebElement> listEle=new ArrayList<WebElement>();
		listEle.add(facebookHeader);
		listEle.add(twitterIcon);
		listEle.add(instaAndJioTxt);
		listEle.add(youtubeIcon);
		listEle.add(playStoreHeader);
		listEle.add(appleHeader);

		if (headerEleList.size()>0) {
			webDriverActions.softMouseHover(headerSection);
			for (int i = 0; i < headerEleList.size(); i++) {
				expected =webDriverActions.getAttribute("href", headerEleList.get(i));
				if(expected.contains("facebook") || expected.contains("twitter") || expected.contains("instagram") || expected.contains("youtube") || expected.contains("play.google.com") || expected.contains("apple"))
				{
					webDriverActions.mouseHover(headerEleList.get(i));
					webDriverActions.softHighlightElement(headerEleList.get(i));
					webDriverActions.navigateToNewTab(headerEleList.get(i));
					webDriverActions.switchToNewWindow();
					expected = webDriverActions.getCurrentPageUrl();
					for(int j=0;j<list.size();j++)
					{
						if(expected.contains(list.get(j)))
						{
							softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j)), "Possibly Element Is Not Visible For This URL "+expected);	
						}
					}
				}
				else
				{
					webDriverActions.mouseHover(headerEleList.get(i));
					webDriverActions.softHighlightElement(headerEleList.get(i));
					webDriverActions.navigateToNewTab(headerEleList.get(i));
					webDriverActions.switchToNewWindow();
					expected = webDriverActions.getCurrentPageUrl();
					if(server.contains("preProd") && !expected.contains("//beta"))
					{
						String betaUrl = genericUtility.replaceInUrl(expected);
						expected=betaUrl;
						webDriverActions.navigateToUrl(expected);
					}
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Possibly Element Is Not Visible For This URL "+expected);		
				}
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+headerEleList.size());
		}
		softAssert.assertAll("Issues Found In Header Section "+ expected);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Hamburger Menu Present On Header of Lokmat Language.
	 */
	public void verifyHamburgerMenu(String server) {
		String actual = "";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.softClickJS(hamburgerMenuBtn);
		if (hamburgerMenuEleList.size()>0) {
			for (int i = 0; i < hamburgerMenuEleList.size(); i++) {
				webDriverActions.softHighlightElement(hamburgerMenuEleList.get(i));
				webDriverActions.mouseHover(hamburgerMenuEleList.get(i));
				webDriverActions.navigateToNewTab(hamburgerMenuEleList.get(i));
				webDriverActions.switchToNewWindow();
				actual = webDriverActions.getCurrentPageUrl();
				if(server.contains("preProd") && !actual.contains("//beta"))
				{
					String betaUrl = genericUtility.replaceInUrl(actual);
					actual=betaUrl;
					webDriverActions.navigateToUrl(actual);
				}
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Possibly Element Is Not Visible For This URL "+actual);	
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+hamburgerMenuEleList.size());
		}
		softAssert.assertAll("Issues found in Hamburger Menu "+ actual);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Line One Section Rajya Seher Chune Present in Hindi Desktop Landing Page.
	 */
	public void verifyLineOneSectionRajyaSeherChune(String server)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(2000);
		webDriverActions.softClickJS(rajyaSeherChuneLnk);
		String mainPgTitle=webDriverActions.getPageTitle();
		for (int i = 0; i <apnaSeherChuneEleList.size(); i++) {	

			webDriverActions.navigateToNewTab(apnaSeherChuneEleList.get(i));
			webDriverActions.switchToNewWindow();
			String actual = webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd")&& !actual.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(actual);
				actual=betaUrl;
				webDriverActions.navigateToUrl(actual);
			}
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Possibly Element Is Not Visible For This URL ");
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(mainPgTitle);
		}
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Section Desktop Landing Page.
	 */
	public void verifyFooterSection(String server,List<WebElement> eleList,WebElement Section,WebElement header)
	{
		String actual = "";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.scrollToLast();
		webDriverActions.softMouseHover(Section);
		webDriverActions.softHighlightElement(Section);
		if (eleList.size()>0) {
			for (int i = 0; i < eleList.size(); i++) {
				webDriverActions.softHighlightElement(eleList.get(i));
				webDriverActions.mouseHover(eleList.get(i));
				webDriverActions.navigateToNewTab(eleList.get(i));
				webDriverActions.switchToNewWindow();
				actual = webDriverActions.getCurrentPageUrl();
				if(server.contains("preProd") && !actual.contains("//beta"))
				{
					String betaUrl = genericUtility.replaceInUrl(actual);
					actual=betaUrl;
					webDriverActions.navigateToUrl(actual);
				}
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(header), "Possibly Element Is Not Visible For This URL "+actual);	
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+eleList.size());
		}
		softAssert.assertAll("Issues found in this Url "+ actual);
	}

	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Second Section Desktop Landing Page.
	 */
	public void verifyFooterSecondSection(List<WebElement> eleList,WebElement Section,WebElement header)
	{
		String actual = "";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.scrollToLast();
		webDriverActions.softMouseHover(Section);
		webDriverActions.softHighlightElement(Section);

		//it takes the social share Url from property File
		ArrayList<String> list=new ArrayList<String>();
		list.add(fileUtility.readDataFromPropertyFile("younggenius"));
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
		Logs.info(getClass(), list);

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

		if (eleList.size()>0) {
			for (int i = 0; i < eleList.size(); i++) {
				actual=webDriverActions.getAttribute("href", eleList.get(i));
				if(actual.contains("topperlearning") || actual.contains("firstpost") || actual.contains("cnbctv18") || actual.contains("historyindia") || actual.contains("mtvindia") || actual.contains("moneycontrol") || actual.contains("play.google.com") || actual.contains("compareindia") || actual.contains("caprep18") || actual.contains("facebook") || actual.contains("twitter") || actual.contains("instagram") || actual.contains("youtube") || actual.contains("jionews") || actual.contains("apple"))
				{
					webDriverActions.softHighlightElement(eleList.get(i));
					webDriverActions.mouseHover(eleList.get(i));
					webDriverActions.navigateToNewTab(eleList.get(i));
					webDriverActions.switchToNewWindow();
					actual = webDriverActions.getCurrentPageUrl();
					for(int j=0;j<list.size();j++)
					{
						if(actual.contains(list.get(j)))
						{
							softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j)), "Possibly Element Is Not Visible For This URL "+actual);	
						}
					}
				}
				else
				{
					webDriverActions.softHighlightElement(eleList.get(i));
					webDriverActions.mouseHover(eleList.get(i));
					webDriverActions.navigateToNewTab(eleList.get(i));
					webDriverActions.switchToNewWindow();
					actual = webDriverActions.getCurrentPageUrl();
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(header), "Possibly Element Is Not Visible For This URL "+actual);	
				}
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+eleList.size());
		}
		softAssert.assertAll("Issues found in this Url "+ actual);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Trending Section Desktop Landing Page.
	 */
	public void verifyFooterTrendingSection(String server)
	{
		verifyFooterSection(server, footerTrendingSectionEleList, footerTrendingSection, headerTxtLogoLnk);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer bivag Section Desktop Landing Page.
	 */
	public void verifyFooterBivagSection(String server)
	{
		verifyFooterSection(server, footerBivagSectionEleList, footerBivagSection, headerTxtLogoLnk);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Social Section Desktop Landing Page.
	 */
	public void verifyFooterSocialSection(String server)
	{
		verifyFooterSection(server, footerSocialSectionEleList, footerSocialSection, headerTxtLogoLnk);
	}

	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Language Section Desktop Landing Page.
	 */
	public void verifyFooterLanguageSitesSection()
	{
		verifyFooterSecondSection( footerLanguageSectionEleList, footerLangaugeSection, headerTxtLogoLnk);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Group Sites Section Desktop Landing Page.
	 */
	public void verifyFooterGroupSitesSection()
	{
		verifyFooterSecondSection( footerGroupSitesSectionEleList, footerGroupSitesSection, headerTxtLogoLnk);
	}

	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer LineTwo Section Desktop Landing Page.
	 */
	public void verifyFooterLineTwoSection()
	{
		verifyFooterSecondSection(footerLineTwoEleList, footerLineTwoSection, headerTxtLogoLnk);
	}
}

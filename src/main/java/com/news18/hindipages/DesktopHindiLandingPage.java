package com.news18.hindipages;

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
 *This Class Contains elements and business logics for Bengali Desktop Landing  Page
 */
public class DesktopHindiLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	public SoftAssert softAssert = new SoftAssert();

	public DesktopHindiLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Videos link present on Homepage*/
	@FindBy(xpath ="//div[contains(@class,'video-gallery')]//div//a")
	private WebElement videosLnk;

	/*Homepage LiveBlog article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@id,'__next')]//a[contains(@href,'live-updates')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*photo section Present in L1 navigation bar */
	@FindBy(xpath="//ul[contains(@class,'sub_navigation_ul')]//a[text()='फोटो']")
	private WebElement photoSectionLineTwoLnk;

	/* Link of Gold Price Today in footer Tending Topics section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'side_bar')]//a[contains(text(),'सोने के भाव')]")
	private WebElement footerGoldPriceTopicLnk;

	/*Latest Section in line one navigation bar*/
	@FindBy(xpath="//div[contains(@class,'container')]//ul[contains(@class,'sub_navigation')]//a[@href='/news/']")
	private WebElement latestSectionLnk;

	/*Homepage articles Link for news18 Hindi Page*/
	@FindBy(xpath ="//div[contains(@class,\"topnews-right\")]//ul//li/a[not(contains(@href,\"live\")) and contains(@href,\"/news/\")]")
	private WebElement homePageArticlesLnk;

	/*CricketNext link present after clicking on Homepage*/
	@FindBy(xpath ="//div[contains(@class,'leftwrap')]//div[contains(@class,'home-sports cricket')]//h2/a[contains(@href,'/news/sports/cricket/')]")
	private WebElement cricketNextSectionLnk;

	/*Trending Topics First Link is present in Footer of home page*/
	@FindBy(xpath="(//div[contains(@class,'nhtranding')]//a[contains(@href,'tag')])[1]")
	private WebElement trendingTopicsfirstLnk;

	//	***********************Danish**WebElement*****************************

	/*Social Media icons present in header of HomePage*/
	@FindBy(xpath ="(//div[contains(@class,'social')])[1]//a[contains(translate(@href,'News18','news18'),'news18')]")
	private List<WebElement> socialMediaIconsLnk;

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

	/*Change Language Button present at Header Part*/
	@FindBy(xpath="(//div[contains(@class,'languagebox')]//parent::div//a[contains(@href,'news18')])[1]")
	private WebElement changeLanguageBtn;

	/* Change Language List present in Homepage Header*/
	@FindBy(xpath ="//div[contains(@class,'languagebox')]//parent::div/a[contains(@href,'news18')]" )
	private List<WebElement> changeLanguageList;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'logo')]")
	private WebElement logoHeader;

	/*Home Page Header Watch Live TV*/
	@FindBy(xpath="(//div[contains(@class,'nhlivetv')]//a[contains(@href,'livetv')])[1]")
	private WebElement headerLiveTv;

	/*Home Page Header Watch Live TV*/
	@FindBy(xpath="//div[contains(@class,'nhlivetv')]//a[contains(@href,'livetv')]")
	private List<WebElement> headerLiveTvDropdown;

	/*Download News-18 App Link is present on the Top before the Follow us on link*/
	@FindBy(xpath ="//div[contains(@class,'lnlapp')]/a")
	private WebElement downloadNews18AppLnk;

	/*List Of App Store Image after clicking on News18 Download App present in header*/
	@FindBy(xpath ="//div[@class='gpaimg']//a//img")
	private List<WebElement> appStore;

	/*Trending Topics First Link is present in Header of home page*/
	@FindBy(xpath="//div[contains(@class,'tranding')]//a[contains(@href,'news18')]")
	private List<WebElement> headerTrendingTopicsLnks;

	/*Header Text Link Present in google app store page*/
	@FindBy(xpath ="//header//a[contains(@href,'store/games')]")
	private WebElement playStoreHeader;

	/*Header Text Link Present in apple app store page*/
	@FindBy(xpath ="//div[contains(@class,'container')]//following-sibling::ul")
	private WebElement appleHeader;

	/*Articles breadcrumb Header Text */
	@FindBy(xpath ="//div[contains(@class,'crum') or contains(@class,'breadcum') or contains(@class,'brdc')]  | //ul[contains(@class, 'bread') or contains(@class,'brdc')]")
	private WebElement articleBreadcrumb;

	/*Pradesh News aur bhi dekhu-more*/
	@FindBy(xpath ="//div//a[contains(@href,'pradesh') and contains(@class,'aur')]")
	private WebElement pradeshNewsMoreLinks;


	//	********************************Rahul***WebElements**********************

	/*Air Quality Index widgets at RHS*/
	@FindBy(xpath ="//div[contains(@class,'aqiwidget kul')]//ul//li//a")
	private List<WebElement> airQualityIndexWidgetLst;

	/*Element in Air Quality Section*/
	@FindBy(xpath ="//div[contains(@class,'logo_wrap')]" )
	private WebElement aqiLogo;

	/*Air Quality Index HeadLine Text At RHS*/
	@FindBy(xpath ="//div[contains(@class,'aqiwidgethd')]" )
	private WebElement airQualityIndexHeadline;

	@FindBy(xpath ="//div[contains(@class,'mobile-tech-wrap')]//h2//a[@href='/news/tech/']" )
	private WebElement mobileTech;

	@FindBy(xpath ="//div[contains(@class,'mobile-tech-wrap')]//h2//a[contains(@href,'/news/literature')]" )
	private WebElement hindilitrature;

	/*Todays Panchang headline present in RHS*/
	@FindBy(xpath ="//div[contains(@class,'astro-rgtroundicon')]")
	private WebElement panchangHeadline;

	/*Read More और भी पढ़ें Button present at RHS*/
	@FindBy(xpath ="//div[contains(@class,'panchan_info')]//following-sibling::a" )
	private WebElement readMorePanchangBtn;

	/*Panchang bradecrum Text at Panchang Page*/
	@FindBy(xpath ="//div[@class='brade_crum fleft']")
	private WebElement panchangBreadcrum ;

	/*Food widget Present at the RHS*/
	@FindBy(xpath ="//ul[contains(@class,'right-food')]//li//a")
	private List<WebElement> foodWidget ;

	/*Food title present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'food-slider news')]//h2")
	private WebElement foodTitle;

	/*Food previous button present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'global-round-arrowwarp')]//button[contains(@class,'prev')]")
	private WebElement foodPrevBtn;

	/*Foos next button present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'global-round-arrowwarp')]//button[contains(@class,'next')]")
	private WebElement foodNextBtn;

	/*Food section breadcrum present at the consumption page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum scrollbar')]")
	private WebElement foodSectionBreadcrum;

	/*Cricket option present at the RHS*/
	@FindBy(xpath ="(//div[contains(@class,'clue-box')])[1]//span")
	private WebElement cricketOption;

	/*cricketOptionNext present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'qus-pn-cont')]//a")
	private WebElement cricketOptionNext;

	/* cricketHeadline present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'quiz-container ')]//div")
	private WebElement cricketHeadline;

	/* cricketHeadline present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//h2//a[contains(@href,'/health')]")
	private WebElement healthAndFitnessHeadline;

	/* healthAndFitnessImg present at the RHS*/
	@FindBy(xpath ="(//a[contains(@href,'/health')]//parent::div[contains(@class,'list-view')]//ul//li//a//img)[1]")
	private WebElement healthAndFitnessImg;

	/* healthAndFitnessMoreBtn present at the RHS*/
	@FindBy(xpath ="//div//a[contains(@href,'/news/lifestyle/health') and contains(@class,'aurbhi-button')]")
	private WebElement healthAndFitnessMoreBtn;

	/* healthAndFitnessArticleLst present at the RHS*/
	@FindBy(xpath ="//div//a[contains(@href,'/news/lifestyle/health')]//parent::div[contains(@class,'list-view')]//child::ul//li//a//h3")
	private List<WebElement> healthAndFitnessArticleLst;

	/* autoHeadline present at the RHS*/
	@FindBy(xpath ="//div//h2//a[contains(@href,'/news/auto')]")
	private WebElement autoHeadline;

	/* autoArticleLst present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'auto-view')]//parent::div[contains(@class,'auto-view')]//ul//li//a")
	private List<WebElement> autoArticleLst;

	/* autoMoreBtn present at the RHS*/
	@FindBy(xpath ="//div//a[contains(@href,'/news/auto') and contains(@class,'aurbhi-button')]")
	private WebElement autoMoreBtn;

	/* jobHeadline present at the RHS*/
	@FindBy(xpath ="//div//h2//a[contains(@href,'/news/job')]")
	private WebElement jobHeadline;

	/* jobArticleImg present at the RHS*/
	@FindBy(xpath ="(//div[contains(@class,'list-view')]//ul//li//a[contains(@href,'job')]//img)[2]")
	private WebElement jobArticleImg;

	/* jobArticleTitleLnk present at the RHS*/
	@FindBy(xpath ="//div//h2//a[contains(@href,'/news/job')]//parent::h2//parent::div//following-sibling::a//h3")
	private WebElement jobArticleTitleLnk;

	/* jobArticleLst present at the RHS*/
	@FindBy(xpath ="//div//h2//a[contains(@href,'/news/job')]//parent::h2//parent::div//following-sibling::ul//li//a")
	private List<WebElement> jobArticleLst;

	/* jobMoreBtn present at the RHS*/
	@FindBy(xpath ="//div//a[contains(@href,'/news/job') and contains(@class,'aurbhi-button')]")
	private WebElement jobMoreBtn;

	/* cartoonStory present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'cartoon-corner')]//ul[contains(@class,'cartoon-corners dflex right-news')]//li//a")
	private List<WebElement> cartoonStory;

	/* cartoonHeadline present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'global')]//h2//a[contains(@href,'cartoon')]")
	private WebElement cartoonHeadline;

	/* healthBreadcrum present at the consumption page*/
	@FindBy(xpath ="//div[contains(@class,'top') or contains(@class,'article')]/preceding-sibling::div")
	private WebElement healthBreadcrum;

	/* autoArticleBreadcrum present at the consumption page*/
	@FindBy(xpath ="//div[contains(@class,'top') or contains(@class,'article')]/preceding-sibling::div")
	private WebElement autoArticleBreadcrum;

	/* autoTitleBreadcrum present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'top') or contains(@class,'article')]/preceding-sibling::div")
	private WebElement autoTitleBreadcrum;

	/* autoMoreBreadcrum present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'top') or contains(@class,'article')]/preceding-sibling::div")
	private WebElement autoMoreBreadcrum;

	/* jobBreadcrum present at the consumption page*/
	@FindBy(xpath ="//div[contains(@class,'top') or contains(@class,'article')]/preceding-sibling::div")
	private WebElement jobBreadcrum;

	/* cartoonBreadcrum present at the consumption page*/
	@FindBy(xpath ="//div[contains(@class,'brdc')] | //div[contains(@class,'bread')]  | //ul[contains(@class, 'bread')]")
	private WebElement cartoonBreadcrum;

	/* cricketFrame present at the RHS*/
	@FindBy(xpath ="//iframe[contains(@class,'contestIframe')]")
	private WebElement cricketFrame;

	/* cricketKaTestNxtBtn present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'qus-info clearfix')]//span")
	private List<WebElement> cricketKaTestNxtBtn;

	@FindBy(xpath ="(//a[contains(@href,'/news/sports')]//parent::h2//parent::div)[3]")
	private WebElement businessHeadline;

	/* cricketKaTestNxtBtn present at the RHS*/
	@FindBy(xpath ="//div[@class='qus-layout']//div[contains(@class,'clue-box')][1]//span")
	private List<WebElement> cricket;

	/* Send Button in cricket Ka Test*/
	@FindBy(xpath ="//button[contains(@id,'saveUser')]")
	private WebElement sendButton;


	//-----------------------------Sanjeeb's WebElement-----------------------------//

	/*Line One Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]/li/a[not(contains(@href,'entertainment')) and not(contains(@href,'tech')) and not(contains(@href,'states'))]")
	private List<WebElement> lineOneSectionEleList;

	/*Line One Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]/li/a")
	private List<WebElement> lineOneSectionEleeList;

	/*Line One Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]/li/a[(contains(@href,'entertainment')) or (contains(@href,'tech')) or (contains(@href,'states'))]")
	private List<WebElement> lineOneSectionElementList;

	/*Line One Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'outterSubmenu')]/a")
	private List<WebElement> lineOneSectionArticleList;

	/*Line One Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'innerSubmenu')]/a")
	private List<WebElement> lineOneSectionInnerSubMenuList;

	/*Line One Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'submenu_boxwrap')]/ul/li/a")
	private List<WebElement> lineOnePradeshAndTechList;

	/*BreadCrumb Present on Article Header*/
	@FindBy(xpath="//div[contains(@class,'brda') or contains(@class,'bread') or contains(@class,'br')] | //ul[contains(@class,'brdcrm') or contains(@class,'bread')]")
	private WebElement headerBreadcrumbLnk;

	/*RajyaSeherChune Link Present on Line One Section Of Hindi Landing Page*/
	@FindBy(xpath="//div[contains(@class,'header_search')]//a[contains(@class,'chsstctbtn')]")
	private WebElement rajyaSeherChuneLnk;

	/*Search Icon Link Present on Line One Section Of Hindi Landing Page*/
	@FindBy(xpath="//div[contains(@class,'header_search')]//a[contains(@class,'top_search_icond')]")
	private WebElement searchIconLnk;

	/*Live Tv Icon Link Present on Line One Section Of Hindi Landing Page*/
	@FindBy(xpath="//div[contains(@class,'header_search')]//a[contains(@class,'top_livetvbtn')]")
	private WebElement liveTVLnk;

	/*google Search Box Link Present on Line One Section Of Hindi Landing Page*/
	@FindBy(xpath="//div[contains(@id,'search-box')]")
	private WebElement googleSearchBoxLnk;

	/*Search Box Button present after clicking on Search Icon present on the Line One Section*/
	@FindBy(xpath ="//div[contains(@id,'search-box')]//input")
	private WebElement searchBoxBtn;

	/*Search Icon Present After Clicking on The Search Btn Present On the Line One Bar */
	@FindBy(xpath ="//div[contains(@id,'search-box')]//td[contains(@class,'search-button')]/button")
	private WebElement insideSearchIcon;

	/*Search Box Link Present on Line One Section of Homepage*/
	@FindBy(xpath ="(//div[contains(@class,'gsc-results')])[1]/div[contains(@class,'gsc-results')]")
	private WebElement closeBtn;

	/*Line Two Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'sub_navigation')]//a")
	private List<WebElement> lineTwoSectionEleList;

	/*Nerolac Link Present on Line One Section of Homepage*/
	@FindBy(xpath ="//div[contains(@class,'logo_sec')]")
	private WebElement nerolacLogo;

	/*Crypto Link Present on Line One Section of Homepage*/
	@FindBy(xpath ="//section[contains(@class,'banner')]")
	private WebElement cryptoLogo;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'launch_info')]")
	private WebElement netraSurkshaIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'headtop')]")
	private WebElement electralHydrationText;

	/*Footer Trending Topics Links Present on Hindi Desktop landing Page*/
	@FindBy(xpath="((//div[contains(@class,'ftr_row')])[1]/div)[1]//a")
	private List<WebElement> footerTrendingTopicLnks;

	/*Footer Trending Topic Section  Link Present on Hindi Desktop landing Page*/
	@FindBy(xpath="((//div[contains(@class,'ftr_row')])[1]/div)[1]")
	private WebElement footerTrendingTopicLnk;

	/*Footer Social Media Links Present on Hindi Desktop landing Page*/
	@FindBy(xpath="((//div[contains(@class,'ftr_row')])[1]/div)[2]//a")
	private List<WebElement> footerSocialMediaLnks;

	/*Footer Social  Section  Link Present on Hindi Desktop landing Page*/
	@FindBy(xpath="((//div[contains(@class,'ftr_row')])[1]/div)[2]")
	private WebElement footerSocialMediaLnk;

	/*Footer Popular Category Links Present on Hindi Desktop landing Page*/
	@FindBy(xpath="((//div[contains(@class,'ftr_row')])[2]/div)[1]//a")
	private List<WebElement> footerPopularCategoryLnks;

	/*Footer Popular Category Link Present on Hindi Desktop landing Page*/
	@FindBy(xpath="((//div[contains(@class,'ftr_row')])[2]/div)[1]")
	private WebElement footerPopularCategoryLnk;

	/*Footer Live Tv Link Present on Hindi Desktop landing Page*/
	@FindBy(xpath="((//div[contains(@class,'ftr_row')])[2]/div)[2]//a")
	private WebElement footerliveTVLnk;

	/*Footer Language Sites Links Present on Hindi Desktop landing Page*/
	@FindBy(xpath="((//div[contains(@class,'ftr_row')])[3]/div)[1]//a")
	private List<WebElement> footerLanguageSitesLnks;

	/*Footer Language Sites Section Present on Hindi Desktop landing Page*/
	@FindBy(xpath="((//div[contains(@class,'ftr_row')])[3]/div)[1]")
	private WebElement footerLanguageSitesLnk;

	/*Footer News18 Groups Links Present on Hindi Desktop landing Page*/
	@FindBy(xpath="((//div[contains(@class,'ftr_row')])[3]/div)[2]//a")
	private List<WebElement> footerNews18GroupsLnks;

	/*Footer Language Sites Section Present on Hindi Desktop landing Page*/
	@FindBy(xpath="((//div[contains(@class,'ftr_row')])[3]/div)[2]")
	private WebElement footerNews18GroupsLnk;

	/*Footer LineTwo Section Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'bottom_row')]//div[contains(@class,'link_table')]/a")
	private List<WebElement> footerLineTwoLHSLnks;

	/*Footer Line Two Links Present in footer Section of News 18 Home Page*/
	@FindBy(xpath="//div[contains(@class,'bottom_row')]//div[contains(@class,'link_table')]")
	private WebElement footerLineTwoLHSLnk;

	/*Footer LineTwo Section Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'social_icon')]//a")
	private List<WebElement> footerLineTwoRHSLnks;

	/*Apna Seher Chune Input Box Present after Clicking on Seher Chune Present on the Line One Section of Hindi homepage*/
	@FindBy(xpath="//div[contains(@class,'tpchsstctnames')]/input")
	private WebElement apnaSeherChuneBox;

	/*list Of elements present under apna Seher chune*/
	@FindBy(xpath="//div[contains(@class,'tpchsstctnames')]//a")
	private List<WebElement> apnaSeherChuneEleList;

	/*list Of all elements present under rajya Section*/
	@FindBy(xpath="//div[contains(@class,'tpstatesnames')]//li")
	private List<WebElement> rajyaSectionEleDropDwn;

	/*list Of elements present under rajya Section*/
	@FindBy(xpath="//div[contains(@class,'tpstatesnames')]//li/a")
	private List<WebElement> rajyaSectionEleList;

	/*cancel Button Present After clicking Seher Chune Present on the Line One Section of Hindi homepage */
	@FindBy(xpath="//div[contains(@class,'tpchsstctpopup')]/a")
	private WebElement cancelBtn;

	/*list Of All elements present under rajya Section*/
	@FindBy(xpath="//div[contains(@class,'tpstatesnames')]//li/div/a")
	private List<WebElement> rajyaSectionAllEleList;

	/*list Of elements present under rajya Section Dropdown*/
	@FindBy(xpath="//li[contains(@class,'active')]//parent::li/child::div/a")
	private List<WebElement> rajyaSectionDropdwnEleList;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'navbar-header')] | (//div[contains(@class,'logo')])[1]")
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

	/*list Of elements present at Right Side of Footer Line Two Section*/
	@FindBy(xpath="//div[contains(@class,'social_icon')]//a")
	private List<WebElement> footerLineTwoSocialEleList;

	/*Social Share Icon Section Right Side of Footer Line Two Section*/
	@FindBy(xpath="//div[contains(@class,'social_icon')]")
	private WebElement footerLineTwoSocialEleSection;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'headerContainer')] | //div[contains(@class,'headerContainer')]//h2 | //div[contains(@class,'n18hcontainer')] ")
	private WebElement headerTxtLogoLnk;

	//===========================Anupam*webelement===========================
	/* Previous button present in Horoscope sub module*/
	@FindBy(xpath ="//div[contains(@class,'rashifal-horoscope-sldier')]//div[contains(@class,'glide__arrows')]/button[contains(@class,'left')]")
	private WebElement previousBtn;

	/* Horoscope section in homepage*/
	@FindBy(xpath ="//div[contains(@class,'home_astro')]//a[contains(@href,'/news/astro/')]")
	private WebElement horoscopeLnk;

	/*Astrology Signs present under Horoscope sub module*/
	@FindBy(xpath ="//div[contains(@class,'rashifal-horoscope-sldier')]//div[contains(@class,'cursor-pointer')]//em")
	private  List<WebElement> astrologySignsBtn;

	/*Astrology Signs present under Horoscope sub module*/
	@FindBy(xpath ="//div[contains(@class,'rashifal-horoscope-sldier')]//div[contains(@class,'cursor-pointer')]/p")
	private  List<WebElement> astrologySignsTxt;

	/* Description for daily, weekly ,monthly and yearly,  Horoscope*/
	@FindBy(xpath ="//div[contains(@class,'rashifal-horoscope-tabs-left')]/a")
	private List<WebElement> horoscopeList;

	/* Description for each astro sign present under Horoscope sub module */
	@FindBy(xpath ="//div[contains(@class,'tab-content') and not(contains(@class,'hide'))]/p")
	private WebElement horoscopeDescription;

	/* Next button present in Horoscope sub module*/
	@FindBy(xpath ="//div[contains(@class,'rashifal-horoscope-sldier')]//div[contains(@class,'glide__arrows')]/button[contains(@class,'right')]")
	private WebElement nextBtn;

	/* read more link for each astro sign present under Horoscope sub module */
	@FindBy(xpath ="//div[contains(@class,'rashifal-horoscope-tabs')]//div[contains(@class,'tabs-right tabs') and not (contains(@style,'display: none'))]//span[.='और भी पढ़ें']/parent::a")
	private WebElement horoscopeReadMoreLnk;

	/* read more for each astro sign present under Horoscope sub module */
	@FindBy(xpath ="//div[contains(@class,'rashifal-horoscope-tabs')]//div[contains(@class,'tabs-right tabs') and not (contains(@style,'display: none'))]//span[.='और भी पढ़ें']")
	private WebElement horoscopeReadMore;

	/* Description for each astro sign present under Horoscope sub module */
	@FindBy(xpath ="//p[@class='detail_intro']")
	private WebElement detailIntro;


	/* DharmStories section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'home_astro')]//a[contains(@href,'/news/astro/')]")
	private WebElement dharmStoriesSection;

	/*DharmStories section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'dharmstories_section')]/ul//a")
	private  List<WebElement> dharmStoriesSectionArticleLnk;

	/*Breadcrumb text present in article page*/
	@FindBy(xpath ="//div[contains(@class,'brade_crum')]//li/h1  |  (//ul[contains(@class,'breadcum')]/li)[2]")
	private WebElement breadcrumbTxt;

	///------------video
	/* Video section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'video-gallery')]//a[(@href='/videos/')]")
	private WebElement videoSectionLnk;

	/* Video section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'video-gallery')]//div[contains(@class,'newvdwdgt-story')]//li//a")
	private List<WebElement> videoSectionArticleLnk;

	/* Video section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'video-gallery')]//div[contains(@class,'newvdwdgt-story')]//li//figure//img")
	private List<WebElement> videoSectionImgLnk;

	/*Breadcrumb present in article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')]/h2 | //div[contains(@class,'breadcrumb')]")
	private WebElement videoBreadcrumb;

	/* Video section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'video-gallery')]//div[contains(@class,'newvdwdgt')]/a")
	private WebElement readMoreVideoSectionLnk;

	//---------nation
	/* Nation section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/nation/')]")
	private WebElement nationSectionLnk;

	/* Nation section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/nation/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> nationSectionArticleLnk;

	/* Nation section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/nation/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> nationSectionImgLnk;

	/* Nation section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/nation/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreNationSectionLnk;

	/*Breadcrumb present in nation article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')]/h2 | //div[contains(@class,'brdcrmb')]")
	private WebElement nationBreadcrumb;


	//---------world
	/* World section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/world/')]")
	private WebElement worldSectionLnk;

	/* World section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/world/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> worldSectionArticleLnk;

	/* World section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/world/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> worldSectionImgLnk;

	/* world section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/world/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreWorldSectionLnk;

	/*Breadcrumb present in world article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')]/h2 | //div[contains(@class,'brdcrmb')]")
	private WebElement worldBreadcrumb;

	//---------lifestyle
	/* Lifestyle section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/lifestyle/')]")
	private WebElement lifestyleSectionLnk;

	/* Lifestyle section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/lifestyle/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> lifestyleSectionArticleLnk;

	/* Lifestyle section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/lifestyle/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> lifestyleSectionImgLnk;

	/* Lifestyle section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/lifestyle/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreLifestyleSectionLnk;

	/*Breadcrumb present in Lifestyle article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')]/h2 | //div[contains(@class,'brdcrmb')]")
	private WebElement lifestyleBreadcrumb;


	//---------dharm
	/* Dharm section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/dharm/')]")
	private WebElement dharmSectionLnk;

	/* Dharm section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/dharm/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> dharmSectionArticleLnk;

	/* Dharm section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/dharm/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> dharmSectionImgLnk;

	/* Dharm section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/dharm/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreDharmSectionLnk;

	/*Breadcrumb present in Dharm article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')]/h2 | //div[contains(@class,'brdcrmb')]")
	private WebElement dharmBreadcrumb;

	//---------crime
	/* Crime section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/crime/')]")
	private WebElement crimeSectionLnk;

	/* Crime section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/crime/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> crimeSectionArticleLnk;

	/* Crime section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/crime/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> crimeSectionImgLnk;

	/* Crime section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/crime/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreCrimeSectionLnk;

	/*Breadcrumb present in Crime article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')]/h2 | //div[contains(@class,'brdcrmb')]")
	private WebElement crimeBreadcrumb;


	//---------sportcricket
	/* Footer sport section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/news/sports/cricket/')]")
	private WebElement footerSportSectionLnk;

	/*Footer sport section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/news/sports/cricket/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> footerSportSectionArticleLnk;

	/* Footer sport section Image present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/news/sports/cricket/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> footerSportSectionImgLnk;

	/* Footer sport section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/news/sports/cricket/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreFooterSportSectionLnk;

	/*Breadcrumb present in Footer sport article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')]/h2 | //div[contains(@class,'brdcrmb')]")
	private WebElement footerSportBreadcrumb;

	//---------knowledge
	/* Knowledge section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/knowledge/')]")
	private WebElement knowledgeSectionLnk;

	/* Knowledge section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/knowledge/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> knowledgeSectionArticleLnk;

	/* Knowledge section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/knowledge/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> knowledgeSectionImgLnk;

	/* Knowledge section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/knowledge/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreKnowledgeSectionLnk;

	/*Breadcrumb present in Knowledge article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')]/h2 | //div[contains(@class,'brdcrmb')]")
	private WebElement knowledgeBreadcrumb;


	//---------career
	/* Career section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/career/')]")
	private WebElement careerSectionLnk;

	/* Career section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/career/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> careerSectionArticleLnk;

	/* Career section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/career/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> careerSectionImgLnk;

	/* Career section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/news/career/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreCareerSectionLnk;

	/*Breadcrumb present in Career article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')]/h2 | //div[contains(@class,'brdcrmb')]  | //ul[contains(@class,'breadcum')]")
	private WebElement careerBreadcrumb;


	//-----blog
	/* Blog section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[contains(@href,'/blogs/')]")
	private WebElement blogSectionLnk;

	/* Journalist profile link in Blog section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[contains(@href,'/blogs/')]/ancestor::div[contains(@class,'globalhd large')]/following-sibling::ul/li/a[1]")
	private List<WebElement> journalistProfileLnk;

	/* Journalist Article link in Blog section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[contains(@href,'/blogs/')]/ancestor::div[contains(@class,'globalhd large')]/following-sibling::ul/li/a[2]")
	private List<WebElement> journalistArticleLnk;

	/*Journalist Image link in Blog section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[contains(@href,'/blogs/')]/ancestor::div[contains(@class,'globalhd large')]/following-sibling::ul/li//div[contains(@style,'display: inline-block')]/img")
	private List<WebElement> journalistImgLnk;

	/*Breadcrumb present in journalist page*/
	@FindBy(xpath ="//div[contains(@class,'brade_crum')] | //div[contains(@class,'breadcrumb')]  |  //div[contains(@class,'brdacrum')]")
	private WebElement blogBreadcrumb;

	/* Blog section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[contains(@href,'/blogs/')]/ancestor::div[contains(@class,'globalhd large')]/following-sibling::a")
	private WebElement readMoreBlogSectionLnk;

	//================================= Vipin Webelements  ==========================================//

	/* List of Top News Article in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'topnews')]/ul/li/a")
	private List<WebElement> priorityPanelArticleLnk;

	/* List of Top News Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'topnews')]//ul/li/a//img[@data-src or @class]")
	private List<WebElement> priorityPanelImgLnk;

	/* List of Related News Links in PriorityPanel in Homepage */
	@FindBy(xpath = "//div[contains(@class,'topnews')]//ul/li/div[contains(@class,'click')]")
	private List<WebElement> relatedNewsLnk;

	/* List of Active Articles After Navigating to Related News Division */
	@FindBy(xpath = "//div[contains(@class,'topnews')]//ul/li/div[contains(@class,'active')]//a")
	private List<WebElement> activeRelatedNewsLnk;

	/* List of News18 Hindi Plus Section Article Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'ayodhyaspecial')]/div[contains(@class,'glide')]//ul//li[not (contains(@class,'clone'))]/a")
	private List<WebElement> news18HindiPlusArticleLnk;

	/* Active Article of  News18 Hindi Plus Section Article Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'ayodhyaspecial')]/div[contains(@class,'glide')]//ul//li[not (contains(@class,'clone')) and contains(@class,'active')]")
	private WebElement activeNews18HindiPlusArticleLnk;

	/* News18 Hindi Original Banner in News18 Hindi Plus Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'ayodhyaspecial')]//div[contains(@class,'banner')]/a")
	private WebElement news18HindiPlusOriginalBannerLnk;

	/* List of News18 Hindi Plus Section Image Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'ayodhyaspecial')]/div[contains(@class,'glide')]//ul//li[not (contains(@class,'clone'))]/a/img")
	private List<WebElement> news18HindiPlusImgLnk;

	/* News18 Hindi Plus Left Slider Button in News18 Hindi Plus in Homepage */
	@FindBy(xpath = "//div[contains(@class,'ayodhyaspecial')]/div[contains(@class,'glide')]//div[contains(@class,'button')]/button[@data-glide-dir='<']")
	private WebElement news18HindiPlusLeftSliderBtn;

	/* News18 Hindi Plus Right Slider Button in News18 Hindi Plus in Homepage */
	@FindBy(xpath = "//div[contains(@class,'ayodhyaspecial')]/div[contains(@class,'glide')]//div[contains(@class,'button')]/button[@data-glide-dir='>']")
	private WebElement news18HindiPlusRightSliderBtn;

	/* List of Cricket Section Article Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricket-news')]/div[contains(@class,'sportstories')]/ul/li/a")
	private List<WebElement> cricketArticleLnk; 

	/* Cricket Dhamal Image Link in Cricket Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricket-news')]/div/a/img")
	private WebElement cricketDhamalImgLnk;

	/* Cricket Title Link In Homepage body*/
	@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[@href='/news/sports/cricket/']")
	private WebElement cricketTitleLnk;

	/* List of Cricket Section Image Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricket-news')]/div[contains(@class,'sportstories')]/ul/li/a//img")
	private List<WebElement> cricketImgLnk;

	/* List of Cricket Section Image Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricket-news')]/div[contains(@class,'sportstories')]/a")
	private WebElement moreCricketNewsLnk;

	/* List of News18 Minis Section Image Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'nw18_minis')]/div[contains(@class,'inner')]//div[contains(@class,'imgBox')]//img[@loading]")
	private List<WebElement> news18MinisImgLnk;

	/* List of News18 Minis Section Image Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'nw18_minis')]/div[contains(@class,'inner')]//div[contains(@class,'contentBox')]//h2/a[not(@target)]")
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

	/* List of Webstrories Article Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'slick-slide') and not (contains(@class,'slick-cloned'))]//a")
	private List<WebElement> webstoriesArticleLnk;

	/* List of Webstrories Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'slick-slide') and not (contains(@class,'slick-cloned'))]//a/img")
	private List<WebElement> webstoriesImgLnk;

	/* Active Webstories Article Link in Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'current') and not (contains(@class,'slick-cloned'))]//a")
	private WebElement activeWebstoriesArticleLnk;

	/* Webstories Title Link In HOmepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]//h2/a")
	private WebElement webstoriesTitleLnk;

	/* Webstories Slider Button in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]//ul[contains(@class,'slick-dots')]/li[not (contains(@class,'active'))]/button")
	private List<WebElement> webstoriesSliderBtn;

	/* List of Mobile Tech Article Links in Homepage */
	@FindBy(xpath = "//h2/a[contains(@href,'/news/tech/')]/ancestor::div[contains(@class,'mobile-tech')]/descendant::div[contains(@class,'techstories')]//ul/li/a")
	private List<WebElement> mobileTechArticleLnk;

	/* List of Mobile Tech Article Links in Homepage */
	@FindBy(xpath = "//h2/a[contains(@href,'/news/tech/')]/ancestor::div[contains(@class,'mobile-tech')]/descendant::div[contains(@class,'techstories')]//ul/li/a//img[@data-src]")
	private List<WebElement> mobileTechImgLnk;

	/* List of Mobile Tech Tabs Link Navigation In Homepage*/
	@FindBy(xpath = "//h2/a[contains(@href,'/news/tech/')]/ancestor::div[contains(@class,'mobile-tech')]/descendant::ul[contains(@class,'sub-nav')]//a")
	private List<WebElement> mobileTechTabsLnk;

	/* Mobile Tech Section Read More Link in homepage*/
	@FindBy(xpath = "//h2/a[contains(@href,'/news/tech/')]/ancestor::div[contains(@class,'mobile-tech')]/descendant::div[contains(@class,'techstories')]/div/a")
	private WebElement mobileTechReadMoreLnk;

	/* Mobile Tech title Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'/news/tech/')]")
	private WebElement mobileTechTitleLnk;

	/* List of Photos Article Link in Homepage */
	@FindBy(xpath = "//ul[contains(@class,'photogallerystories')]//a")
	private List<WebElement> photoArticleLnk;

	/* List of Photos Article Link in Homepage */
	@FindBy(xpath = "//ul[contains(@class,'photogallerystories')]//a//img")
	private List<WebElement> photoImgLnk;

	/* List of Photo Tabs Link Navigation In Homepage*/
	@FindBy(xpath = "//h2/a[(@href='/photogallery/')]/ancestor::div[contains(@class,'global')]/ul//li[not (contains(@class,'active'))]/a")
	private List<WebElement> photoTabsLnk;

	/*Photo Title Link in Body Photo Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[(@href='/photogallery/')]")
	private WebElement photoTitleLnk;

	/* List of Literature Article in Homepage */
	@FindBy(xpath = "//h2/a[contains(@href,'literature')]/ancestor::div[contains(@class,'mobile-tech')]//div[contains(@class,'tech')]//ul//a")
	private List<WebElement> literatureArticleLnk;

	/* List of Photos Article Link in Homepage */
	@FindBy(xpath = "//h2/a[contains(@href,'literature')]/ancestor::div[contains(@class,'mobile-tech')]//div[contains(@class,'tech')]//ul//a//img[@data-src]")
	private List<WebElement> literatureImgLnk;

	/* Aur bhe Padhe Link in Photo Section */
	@FindBy(xpath = "//h2/a[contains(@href,'literature')]/ancestor::div[contains(@class,'mobile-tech')]//div[contains(@class,'bollywood')]/a")
	private WebElement literatureReadMoreLnk;

	/* Literature Title Link for Literature Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'literature')]")
	private WebElement literatureTitleLnk;

	/* List of Bollywood Section Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'bollywoodnews-wrap')]/div[contains(@class,'bollywoodstories')]//ul/li/a")
	private List<WebElement> bollywoodArticleLnk;

	/* List of Bollywood Tabs Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'bollywoodnews-wrap')]//ul[contains(@class,'sub-nav')]/li[not (contains(@class,'active'))]/a")
	private List<WebElement> bollywoodTabsLnk;

	/* List of Bollywood Section Image Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'bollywoodnews-wrap')]/div[contains(@class,'bollywoodstories')]//ul/li/a//img[@data-src]")
	private List<WebElement> bollywoodImgLnk;

	/* Bollywood Read More Link in Bollywood Widget in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'bollywoodnews-wrap')]/a")
	private WebElement bollywoodReadMoreLnk;

	/* Bollywood Read More Link in Bollywood Widget in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'bollywoodnews-wrap')]//h2/a")
	private WebElement bollywoodTitleLnk;

	/* List of Money Section Article Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'jobstories')]//ul/li/a")
	private List<WebElement> moneyArticleLnk;

	/* List of Money Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'jobstories')]//ul/li/a//img")
	private List<WebElement> moneyImgLnk;

	/* List of Money Section Tabs Link in Homepage */
	@FindBy(xpath = "//h2/a[contains(@href,'news/business/')]/ancestor::div[contains(@class,'global')]//ul/li[not (contains(@class,'active'))]/a")
	private List<WebElement> moneyTabsLnk;

	/* List of Money Section Tabs Link in Homepage */
	@FindBy(xpath = "//h2/a[contains(@href,'news/business/')]/ancestor::div[contains(@class,'global')]//ul/li/a")
	private List<WebElement> allMoneyTabsLnk;

	/* Money Title Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'news/business/')]")
	private WebElement moneyTitleLnk;

	/* Money Control Link in Money Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//div[contains(@class,'money')]/a")
	private WebElement moneyControlLnk;

	/*Money Control Logo Link in MoneyControl homepage after Navigating to MoneyControl Banner*/
	@FindBy(xpath = "//div[contains(@class,'headtop')  or contains(@class,'head_homepage') or contains(@class,'stmimg')]")
	private WebElement moneyControlLogo;

	/* Read More Link in Money Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'jobstories')]/a")
	private WebElement moneyReadMoreNewsLnk;

	/* Article Header Text in Article Consumption Page */
	@FindBy(xpath ="//h1[contains(@class,'article_heading')] | //h1[contains(@class,'live_blog')] | //h1[contains(@class,'gallery_tilte')] | //div[contains(@class,'art')]/h1" )
	private WebElement articleHeaderTxt;

	/* Article BreadCrumb Division */
	@FindBy(xpath = "//div[contains(@class,'brd')] | //div[contains(@class,'bread')]  | //ul[contains(@class, 'bread')]")
	private WebElement articleBreadCrumbDiv;

	/* WebStories Next Story Button after navigation of WebStories Article */
	@FindBy(xpath = "//div[contains(@class,'next-container')]")
	private WebElement nextWebStoryBtn;

	/* List of Body Sports Article Links in Homepage */
	@FindBy(xpath = "//h2/a[@href='/news/sports/']/ancestor::div[contains(@class,'home-sports')]//ul[contains(@class,'khelnews')]//a")
	private List<WebElement> bodySportsArticleLnk;

	/* List of Body Sports Image Links in Homepage */
	@FindBy(xpath = "//h2/a[@href='/news/sports/']/ancestor::div[contains(@class,'home-sports')]//ul[contains(@class,'khelnews')]//a//img[@data-src]")
	private List<WebElement> bodySportsImgLnk;

	/* Body Khel Title Link in Khel Section In Homepage */
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[@href='/news/sports/']")
	private WebElement bodyKhelTitleLnk;

	/* List of Body Khel Tabs Link in Khel section in Homepage*/
	@FindBy(xpath = "//h2/a[@href='/news/sports/']/ancestor::div[contains(@class,'home-sports')]//ul[contains(@class,'sub-nav')]/li[not (contains(@class,'active'))]/a")
	private List<WebElement> bodyKhelTabsLnk;

	/*Read more News Link in Body Khel Section in homepage */
	@FindBy(xpath = "//h2/a[@href='/news/sports/']/ancestor::div[contains(@class,'home-sports')]/div/a")
	private WebElement bodyKhelReadMoreLnk;

	/* List of Latest Mobile News Article Links in Mobile Finder Section in Homepage*/ 
	@FindBy(xpath = "//div[contains(@class,'single-tabs')]/div[contains(@class,'tabcontent')]//div[contains(@class,'lmn_wrp')]/div//a")
	private List<WebElement> latestMobileNewsArticleLnk;

	/* List of Mobile Finder Section Image in Homepage */
	@FindBy(xpath = "//div[contains(@class,'single-tabs')]/div[contains(@id,'tab_one')]//div[contains(@class,'lmn_wrp')]/div//a//img")
	private List<WebElement> latestMobileNewsImgLnk;

	/* More News Link in Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'single-tabs')]/div[contains(@class,'tabcontent')]//div[contains(@class,'lmn_wrp')]/a")
	private WebElement mobileFinderMoreNewsLnk;

	/* Find Mobile by brand Banner Mobile brands Links for Mobile Finder Section in homepage */
	@FindBy(xpath = "//div[contains(@class,'find')]//div[contains(@class,'content')]//a")
	private List<WebElement> mobileBrandsLnk;

	/*Mobile Finder Tabs Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'single-tabs')]/div[contains(@class,'tab')]/a[not (contains(@class,'active'))]")
	private List<WebElement> mobileFinderTabsLnk; 

	/* List of Trending and Recommended Mobile Stories Link for Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@id,'tab_two')]//div[contains(@class,'glide--swipeable')]/div/ul/li[not (contains(@class,'clone'))]/a")
	private List<WebElement> trendindAndRecommendedStoriesLnk;

	/* List of Trending and Recommended Mobile Stories Link for Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@id,'tab_two')]//div[contains(@class,'glide--swipeable')]/div/ul/li[not (contains(@class,'clone')) and contains(@class,'active')]/a/div[contains(@class,'ttl')]")
	private WebElement activeTrendindAndRecommendedStoriesLnk;

	/* Backword Slider Division for Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'tab_two')]//div[contains(@class,'glide--swipeable')]/div[contains(@class,'ctrls')]//div[@data-glide-dir='<']")
	private WebElement trendindAndRecommendedBackwordSlider;

	/* Forward Slider Division for Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'tab_two')]//div[contains(@class,'glide--swipeable')]/div[contains(@class,'ctrls')]//div[@data-glide-dir='>']")
	private WebElement trendindAndRecommendedForwordSlider;

	/* Read More Stories Link in Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'tab_two')]//div[contains(@class,'glide--swipeable')]/div/ul/li[not (contains(@class,'clone'))]//div[contains(@class,'trndbtn_wrp')]/a")
	private List<WebElement> trendindAndRecommendedReadMoreLnk;

	/* List of Trending and Recommended Mobile Stories Link for Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@id,'upcomingMobile')]//div[contains(@class,'glide--swipeable')]/div/ul/li[not (contains(@class,'clone'))]/a")
	private List<WebElement> upcomingMobileStoriesLnk;

	/* List of Trending and Recommended Mobile Stories Link for Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@id,'upcomingMobile')]//div[contains(@class,'glide--swipeable')]/div/ul/li[not (contains(@class,'clone')) and contains(@class,'active')]/a/div[contains(@class,'ttl')]")
	private WebElement activeUpcomingMobileStoriesLnk;

	/* Backword Slider Division for Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'upcomingMobile')]//div[contains(@class,'glide--swipeable')]/div[contains(@class,'ctrls')]//div[@data-glide-dir='<']")
	private WebElement upcomingMobileBackwordSlider;

	/* Forward Slider Division for Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'upcomingMobile')]//div[contains(@class,'glide--swipeable')]/div[contains(@class,'ctrls')]//div[@data-glide-dir='>']")
	private WebElement upcomingMobileForwordSlider;

	/* Read More Stories Link in Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'upcomingMobile')]//div[contains(@class,'glide--swipeable')]/div/ul/li[not (contains(@class,'clone'))]//div[contains(@class,'trndbtn_wrp')]/a")
	private List<WebElement> upcomingMobileReadMoreLnk;

	/*List Of Ajab Gajab Article Links for Ajab Gajab Sections in Homeoage*/
	@FindBy(xpath = "//h2/a[contains(@href,'ajab-gajab')]/ancestor::div[contains(@class,'mobile-tech-wrap')]//div[contains(@class,'bollywoodnews')]/ul/li/a")
	private List<WebElement> ajabGajabArticleLnk;

	/*List of Ajab Gajab Image Links for Ajab Gajba Section in Homepage*/
	@FindBy(xpath = "//h2/a[contains(@href,'ajab-gajab')]/ancestor::div[contains(@class,'mobile-tech-wrap')]//div[contains(@class,'bollywoodnews')]/ul/li/a//img[@data-src]")
	private List<WebElement> ajabGajabImgLnk;

	/* Ajab Gajab Section Read More Link in Homepage */
	@FindBy(xpath = "//h2/a[contains(@href,'ajab-gajab')]/ancestor::div[contains(@class,'mobile-tech-wrap')]/div[contains(@class,'tech')]/div/a")
	private WebElement ajabGajabReadMoreLnk;

	/*Ajab Gajab Section Title Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'ajab-gajab')]")
	private WebElement ajabGajabTitleLnk;

	/*Pradesh News present after cricket next section*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//h2//a[contains(@href,'states')]")
	private WebElement pradeshNews;

	/*Pradesh News state links*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//div[contains(@class,'pradeshnavwrap')]//ul//li//a")
	private List<WebElement> pradeshStatesLnks;

	/*Pradesh News rajya chune link*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[contains(@class,'forstatesection')]")
	private WebElement rajyaChuneLnk;

	/*Pradesh News rajya chune link*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//div[contains(@class,'forstatesection')]//ul//li//a")
	private List<WebElement> rajyaChuneStateList;

	/*Pradesh News state left right buttons*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//div//button")
	private List<WebElement> buttonLnks;

	/*Pradesh News City Names right button*/
	@FindBy(xpath ="(//div[contains(@class,'citiesname')]//div//button)[2]")
	private WebElement citybuttonLnk;

	/*Pradesh News state left right buttons*/
	@FindBy(xpath ="//div[contains(@class,'pradesh-newswrap')]//ul//li//a")
	private List<WebElement> stateArticleLnks;

	/*Pradesh News City Names Header Links*/
	@FindBy(xpath ="//div[contains(@class,'citiesname')]//ul//li//a")
	private List<WebElement> stateCityNamesLnks;


	/**
	 * @author Sanjeeb
	 * This method is used to click on CricketNext link present on Home Page
	 */
	public void clickOnCricketNextLnk()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.continuousScrollTillElement(cricketNextSectionLnk,GlobalVariables.sec60);
			webDriverActions.click(cricketNextSectionLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Cricket Next Link", e);
		}	
	}


	/**
	 * @author Sanjeeb
	 * This method used to click on photos section of Hindi Homepage
	 */
	public void clickOnPhotoSection()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(photoSectionLineTwoLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Photos Section Link", e);
		}	
	}


	/**
	 * @author Sanjeeb
	 * This method is used to click on Videos Section news 18 Hindi Home Page 
	 */
	public void navigateToVideosSection() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.continuousScrollTillElement(videosLnk, GlobalVariables.sec60);
			webDriverActions.click(videosLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Videos Section Link", e);
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
			webDriverActions.click(trendingTopicsfirstLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in First Trending Topic Link", e);
		}	
	}

	/**
	 * @author abhishek
	 * This method is used to click on First Article of Hindi Home Page 
	 */
	public void clickOnFirstArticleHomePage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(2000);
			webDriverActions.clickJS(homePageArticlesLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in first Article Homepage", e);
		}	
	}


	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of English Home Page 
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
	 * @author Vipin Gawande
	 * This method is used to click on the article in footer containing /topics/ in the URL
	 */
	public void clickOnFooterTopics()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		try {
			webDriverActions.mouseHover(footerGoldPriceTopicLnk);
			webDriverActions.highlightElement(footerGoldPriceTopicLnk);
			webDriverActions.click(footerGoldPriceTopicLnk);
			webDriverActions.switchToNewWindow();
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Footer Topic Link ", e);
		}	
	}


	/**
	 * @author AnupamGupta
	 * This method used to navigate to Latest Section Page
	 */
	public void latestSection() {
		try{
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(latestSectionLnk);
			Logs.info(getClass(),"Clicked on latest section link");
		}catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Section Link in HomePage ", e);
		}
	}

	/*	*************************Danish***BusinessLogic*********************************************** */

	/**
	 * @author DanishR
	 * This method validates social Media navigation present on Home Page
	 */
	public void verifySocialMedia() {
		webDriverActions.waitForPageToLoad();
		String parent = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(socialMediaIconsLnk.size()>0, " Possibly Element is Not Visible "+ socialMediaIconsLnk );
		for (int i = 0; i < socialMediaIconsLnk.size(); i++) {
			webDriverActions.waitForSecond(2000);
			webDriverActions.softHighlightElement(socialMediaIconsLnk.get(i));//used to Highlight the particular element
			webDriverActions.softClickJS(socialMediaIconsLnk.get(i));
			String currentPage = webDriverActions.getCurrentPageUrl();

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

			// it will iterate the list and validate 
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
	 * This method used to navigate to All News18 Languages present in Home Page Header
	 */
	public void verifyChangeLanguage() {
		webDriverActions.waitForPageToLoad();
		String parentTitle = webDriverActions.getPageTitle();
		if (changeLanguageList.size()>0) {
			for (int i = 1; i < changeLanguageList.size(); i++) {
				webDriverActions.softMouseHover(changeLanguageBtn);
				webDriverActions.softHighlightElement(changeLanguageList.get(i));
				webDriverActions.softClickJS(changeLanguageList.get(i));
				webDriverActions.switchToNewWindow();
				String languageUrl=webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), "Naviagted to "+languageUrl);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(logoHeader),"Unable to display "+languageUrl);
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+changeLanguageList.size());
		}

		softAssert.assertAll("Issues found in this Url ");
	}


	/**
	 * This method validates Live Tv and its drop down navigation from HomaPage
	 */
	public void verifyHeaderLiveTv(String serverType) {
		webDriverActions.waitForPageToLoad();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerLiveTv)," Possibly element not visible "+webDriverActions.getCurrentPageUrl());
		for (int i = 0; i < headerLiveTvDropdown.size(); i++) {
			webDriverActions.waitForSecond(2000);
			webDriverActions.mouseHoverAndClick(headerLiveTvDropdown.get(i));
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			String expectedPageUrl = webDriverActions.getCurrentPageUrl();

			if (serverType.equalsIgnoreCase("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl=betaUrl;
			}
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb)," Possibily element is not visible "+currentPageUrl);
			webDriverActions.waitForSecond(2000);
			if (expectedPageUrl.equalsIgnoreCase(currentPageUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			webDriverActions.mouseHover(headerLiveTv);
		}
		softAssert.assertAll("Issues found in Home Page Header Live Tv");
	}

	/**
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
		softAssert.assertTrue(webDriverActions.isElementDisplayed(logoHeader),"Possibly element is not visible "+parent);
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
	 * This method is used to Validate Trending Topics Section in Home Page
	 */
	public void verifyTrendingTopics(String serverType) {
		webDriverActions.waitForPageToLoad();
		String parent = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(headerTrendingTopicsLnks.size()>0, " Possibly Element is Not Visible "+ webDriverActions.getCurrentPageUrl());
		for (int i = 0; i < headerTrendingTopicsLnks.size(); i++) {
			webDriverActions.softClickJS(headerTrendingTopicsLnks.get(i));
			webDriverActions.waitForPageToLoad();
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.contains("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl=betaUrl;
			}
			//			Logs.info(getClass(), "Navigated to Trending Topic Link "+ webDriverActions.getCurrentPageUrl());
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Possibly Element is not Visible "+currentPageUrl);
			webDriverActions.navigateToUrl(parent);
		}
		softAssert.assertAll("Issues found in this Url ");
	}

	//	*****************************Rahul*****Business**Logic***********************

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on Air Quality Index widgets present at the
	 * RHS and navigate their pages
	 */
	public void verifyAirQualityIndex(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);
		webDriverActions.softScrollToElement(airQualityIndexHeadline);
		if(airQualityIndexWidgetLst.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<airQualityIndexWidgetLst.size();i++)
			{
				webDriverActions.softClickJS(airQualityIndexWidgetLst.get(i));
				Logs.info(getClass(),"Clicked on Air Quality Index Widget");
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(airQualityIndexWidgetLst.get(i));
					webDriverActions.softScrollToElement(airQualityIndexWidgetLst.get(i));
					webDriverActions.waitForSecond(2000);
					webDriverActions.softClickJS(airQualityIndexWidgetLst.get(i));
				}
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(aqiLogo),"Unable to display Element"+webDriverActions.getCurrentPageUrl());
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+airQualityIndexWidgetLst.size());
		}
		softAssert.assertAll("Issues found in this Url "); 
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on Read more panchang Btn and
	 * navigate to Panchang page
	 */
	public void verifyTodaysPanchang(String serverType) { 
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);
		webDriverActions.softScrollToElement(panchangHeadline);
		webDriverActions.softMouseHover(readMorePanchangBtn);
		webDriverActions.waitForSecond(2000);
		webDriverActions.softClickJS(readMorePanchangBtn);
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
		webDriverActions.waitForSecond(1000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(panchangBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url "); 
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the title of food Section present at the RHS of the
	 * home page
	 */
	public void foodTitle(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);
		webDriverActions.softScrollToElement(foodTitle);
		webDriverActions.mouseHover(foodTitle);
		webDriverActions.softClick(foodTitle);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(healthBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url "); 
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the story of food section and their navigation 
	 */
	public void verifyArticleNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);
		webDriverActions.softScrollToElement(foodNextBtn);
		if(foodWidget.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for (int i = 0; i < foodWidget.size(); i++) {
				webDriverActions.mouseHoverAndClick(foodWidget.get(i));
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					Logs.info(getClass(), "Navigated to "+currentPage);
				}
				webDriverActions.waitForSecond(1000);
				webDriverActions.navigateBack();
			}
			softAssert.assertAll("Issues found in this url "); 
		}
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the Image of the health and fitness section and their navigation
	 */
	public void verifyHealthHeadlineNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);
		webDriverActions.continuousScrollTillElement(healthAndFitnessHeadline, 20);
		webDriverActions.softScrollToElement(healthAndFitnessHeadline);
		webDriverActions.mouseHover(healthAndFitnessHeadline);
		webDriverActions.softClickJS(healthAndFitnessHeadline);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(1000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(healthBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url "); 
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the article of the health and fitness section
	 */
	public void verifyHealthArticleNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);
		webDriverActions.continuousScrollTillElement(healthAndFitnessHeadline, 10);

		if(healthAndFitnessArticleLst.size()>0) {

			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<healthAndFitnessArticleLst.size();i++) {
				webDriverActions.softScrollToElement(healthAndFitnessArticleLst.get(i));
				webDriverActions.softClickJS(healthAndFitnessArticleLst.get(i));
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					Logs.info(getClass(), "Navigated to "+currentPage);
				}
				webDriverActions.waitForSecond(1000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(healthBreadcrum),"Unable to display Element "+currentPage);
				webDriverActions.navigateBack();
				webDriverActions.waitForSecond(2000);
			}
			softAssert.assertAll("Issues found in this url ");
		}
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the read more button of the health and fitness section
	 */
	public void verifyHealthReadMoreNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToElement(mobileTech);
		webDriverActions.continuousScrollTillElement(healthAndFitnessHeadline, 10);
		webDriverActions.scrollToElement(healthAndFitnessMoreBtn);
		webDriverActions.softClick(healthAndFitnessMoreBtn);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(1000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(healthBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the title of the auto section
	 */
	public void verifyAutoTitleNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);
		webDriverActions.continuousScrollTillElement(autoHeadline, 10);
		webDriverActions.mouseHover(autoHeadline);
		webDriverActions.softClickJS(autoHeadline);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(1000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(autoTitleBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the articles of Auto section
	 */
	public void verifyAutoArticleNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);
		webDriverActions.continuousScrollTillElement(autoHeadline, 10);
		if(autoArticleLst.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<autoArticleLst.size();i++) {
				webDriverActions.waitForSecond(2000);
				webDriverActions.softClickJS(autoArticleLst.get(i));
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage = betaUrl;
				}
				else {
					Logs.info(getClass(), "Navigated to "+currentPage);
				}
				webDriverActions.waitForSecond(1000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(autoArticleBreadcrum),"Unable to display Element "+currentPage);
				webDriverActions.navigateBack();
				webDriverActions.waitForSecond(1000);
				webDriverActions.continuousScrollTillElement(autoHeadline, 10);
			}
			softAssert.assertAll("Issues found in this url ");
		}
	}
	/**
	 * @author Rahul
	 * @param serverType
	 * This metod is used to click on Read more button of Auto section
	 */
	public void verifyAutoReadMoreNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);
		webDriverActions.continuousScrollTillElement(autoHeadline, 10);
		webDriverActions.softScrollToElement(autoMoreBtn);
		webDriverActions.softClick(autoMoreBtn);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(1000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(autoMoreBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the title of the Job section
	 */
	public void verifyJobTitle(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToElement(mobileTech);
		webDriverActions.continuousScrollTillElement(jobHeadline, 10);
		webDriverActions.softClick(jobHeadline);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(1000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(jobBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");

	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the Image of the Job section
	 */
	public void verifyJobImageNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);
		webDriverActions.continuousScrollTillElement(jobHeadline, 10);
		webDriverActions.softClick(jobArticleImg);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(1000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(jobBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the article of the job section
	 */
	public void verifyJobArticleNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);
		webDriverActions.continuousScrollTillElement(jobHeadline, 10);
		webDriverActions.mouseHover(jobHeadline);

		if(jobArticleLst.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<jobArticleLst.size();i++) {
				webDriverActions.scrollToElement(jobArticleLst.get(i));
				webDriverActions.softClickJS(jobArticleLst.get(i));
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					Logs.info(getClass(), "Navigated to "+currentPage);
				}
				webDriverActions.waitForSecond(1000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(jobBreadcrum),"Unable to display Element "+currentPage);
				webDriverActions.navigateBack();
				webDriverActions.waitForSecond(1000);
			}
			softAssert.assertAll("Issues found in this url ");
		}
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the Read more button of the job section
	 */
	public void verifyjobReadMoreNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);
		webDriverActions.continuousScrollTillElement(jobHeadline, 10);
		webDriverActions.softClick(jobMoreBtn);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(1000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(jobBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the title of the cartoon section
	 */
	public void verifyCartoonCornerTitle(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);
		webDriverActions.continuousScrollTillElement(cartoonHeadline, 10);
		webDriverActions.softClick(cartoonHeadline);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(1000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 *@author Rahul
	 *@param serverType
	 *This method is used to click on the article of the cartoon section
	 */
	public void verifyCartoonCornerArticle(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		String expected = null;
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);
		webDriverActions.continuousScrollTillElement(cartoonHeadline, 10);

		if(cartoonStory.size()>0) {

			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for (int i = 0; i < cartoonStory.size(); i++) {
				String actual = webDriverActions.getAttribute("href", cartoonStory.get(i));

				webDriverActions.mouseHoverAndClick(cartoonStory.get(i));

				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					Logs.info(getClass(), "Navigated to "+currentPage);
				}

				webDriverActions.waitForSecond(1000);
				softAssert.assertEquals(actual,expected , "Failed to navigate "+actual);
				webDriverActions.navigateBack();
			}
			softAssert.assertAll("Issues found in this url ");
		}
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the options and Next button of the Cricket section
	 */
	public void verifyCricketKaTest() {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);
		webDriverActions.continuousScrollTillElement(cricketHeadline, 10);
		webDriverActions.waitForSecond(2000);
		DriverUtility .getDriver().switchTo().frame(cricketFrame);
		webDriverActions.waitForSecond(2000);
		Logs.info(getClass(), "df"+cricket.size());
		for (int i = 0; i < cricket.size(); i++) {
			webDriverActions.softHighlightElement(cricket.get(i));
			webDriverActions.mouseHoverAndClick(cricket.get(i));
			webDriverActions.waitForSecond(4000);
			webDriverActions.softClickJS(cricketOptionNext);	
			webDriverActions.waitForSecond(7000);
		}
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(sendButton),"Unable to display Element");
		softAssert.assertAll("Issues found in this url ");
	}


	//================================Sanjeeb's Business Logic ===============================//

	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Line One Section Article Present in Hindi Desktop Landing Page.
	 */
	public void verifyLineOneArticleSection(String server)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		softAssert.assertTrue(lineOneSectionEleList.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for(int i=1;i<lineOneSectionEleList.size();i++)
		{
			webDriverActions.softMouseHover(lineOneSectionEleList.get(i));
			webDriverActions.softHighlightElement(lineOneSectionEleList.get(i));
			String link = webDriverActions.getAttribute("href", lineOneSectionEleList.get(i));
			Logs.info(getClass(), link);
			for(int l=0;l<lineOneSectionArticleList.size();l++)
			{
				webDriverActions.softMouseHover(lineOneSectionArticleList.get(l));
				webDriverActions.softHighlightElement(lineOneSectionArticleList.get(l));
				String previousURL= webDriverActions.getAttribute("href", lineOneSectionArticleList.get(l));
				Logs.info(getClass(), previousURL);
				webDriverActions.softClickJS(lineOneSectionArticleList.get(l));
				String originalURL = webDriverActions.getCurrentPageUrl();
				String actual = webDriverActions.getCurrentPageUrl();
				if(server.contains("preProd") && !originalURL.contains("//beta"))
				{
					String betaUrl = genericUtility.replaceInUrl(originalURL);
					originalURL=betaUrl;
					webDriverActions.navigateToUrl(originalURL);
				}
				webDriverActions.softWaitForElementVisibility(headerBreadcrumbLnk, 3);
				webDriverActions.stopPageLoading();
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Possibly Element Is Not Visible For This URL "+originalURL);
				Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
				if(originalURL.equals(actual))
				{
					webDriverActions.navigateBack();	
				}
				else
				{
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}
				webDriverActions.softMouseHover(lineOneSectionEleList.get(i));
				webDriverActions.softHighlightElement(lineOneSectionEleList.get(i));
			}
		}

		ArrayList<String>list=new ArrayList<String>();
		for(int j=0;j<lineOneSectionElementList.size();j++)
		{
			webDriverActions.softMouseHover(lineOneSectionElementList.get(j));
			for(int k=0;k<lineOnePradeshAndTechList.size();k++)
			{
				webDriverActions.softMouseHover(lineOnePradeshAndTechList.get(k));
				for(int l=0;l<lineOneSectionInnerSubMenuList.size();l++)
				{
					String previousURL= webDriverActions.getAttribute("href", lineOneSectionInnerSubMenuList.get(l));
					Logs.info(getClass(), previousURL);
					list.add(previousURL);	
				}
			}
			Logs.info(getClass(), list);
		}
		for(int m=0;m<list.size();m++)
		{
			webDriverActions.navigateToUrl(list.get(m));
			String actual = webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd") && !actual.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(actual);
				actual=betaUrl;
				webDriverActions.navigateToUrl(actual);
			}
			webDriverActions.softWaitForElementVisibility(headerBreadcrumbLnk, 3);
			webDriverActions.stopPageLoading();
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Possibly Element Is Not Visible For This URL ");
		}
		softAssert.assertAll("Issues Found In Line One Article Sections");
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Line One Section Present in Hindi Desktop Landing Page.
	 */
	public void verifyLineOneSection(String server)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		softAssert.assertTrue(lineOneSectionEleeList.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		//this Method is use to verify the line One Section of Hindi Home page Except Rajyaseher chune, live Tv and Search Icon.
		for(int i=2;i<lineOneSectionEleeList.size();i++)
		{
			webDriverActions.softHighlightElement(lineOneSectionEleeList.get(i));
			webDriverActions.softClickJS(lineOneSectionEleeList.get(i));
			String currentPageUrl=webDriverActions.getCurrentPageUrl();
			if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(lineOneSectionEleeList.get(i));
			}
			String actual = webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd") && !actual.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(actual);
				actual=betaUrl;
				webDriverActions.navigateToUrl(actual);
			}
			webDriverActions.softWaitForElementVisibility(headerBreadcrumbLnk, 3);
			webDriverActions.stopPageLoading();
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Possibly Element Is Not Visible For This URL "+actual);
			Logs.info(getClass(), actual);
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(lineOneSectionEleeList.get(i));
		}

		//This line of Script to verify the Search Icon Present in the Linone Section of Hindi News 18 Home Page.
		webDriverActions.softClick(searchIconLnk);
		webDriverActions.waitForSecond(2000);
		webDriverActions.inputText(searchBoxBtn, "News 18");
		webDriverActions.softHighlightElement(insideSearchIcon);
		webDriverActions.softClick(insideSearchIcon);
		webDriverActions.waitForSecond(2000);
		webDriverActions.softHighlightElement(closeBtn);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(closeBtn), "Posibly Search Box is not displayed");
		webDriverActions.softClick(closeBtn);

		//This line of Script to verify the Live TV Icon Present in the Linone Section of Hindi News 18 Home Page.
		String expected = webDriverActions.getAttribute("href",liveTVLnk);
		Logs.info(getClass(), expected);
		webDriverActions.waitForSecond(2000);
		webDriverActions.softClick(liveTVLnk);
		String currentPageUrl=webDriverActions.getCurrentPageUrl();
		if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softClickJS(liveTVLnk);
		}
		webDriverActions.waitForPageToLoad();
		String actual = webDriverActions.getCurrentPageUrl();
		if(server.contains("preProd")&& !actual.contains("//beta"))
		{
			String betaUrl = genericUtility.replaceInUrl(actual);
			expected=betaUrl;
			webDriverActions.navigateToUrl(actual);
		}
		webDriverActions.softWaitForElementVisibility(headerBreadcrumbLnk, 3);
		webDriverActions.stopPageLoading();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Possibly Element Is Not Visible For This URL "+actual);
		softAssert.assertAll("Issues Found In Line One Sections");
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Line One Section Rajya Seher Chune Present in Hindi Desktop Landing Page.
	 */
	public void verifyLineOneSectionRajyaSeherChune(String server)
	{

		//This line of Script to verify RajyaSeher Chune Icon Present in the Linone Section of Hindi News 18 Home Page.
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softClickJS(rajyaSeherChuneLnk);
		softAssert.assertTrue(apnaSeherChuneEleList.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for(int i=0;i<apnaSeherChuneEleList.size();i++)
		{
			webDriverActions.softHighlightElement(apnaSeherChuneEleList.get(i));
			String expected = webDriverActions.getAttribute("href", apnaSeherChuneEleList.get(i));
			Logs.info(getClass(), expected);
			webDriverActions.softClickJS(apnaSeherChuneEleList.get(i));
			String currentPageUrl=webDriverActions.getCurrentPageUrl();
			if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(apnaSeherChuneEleList.get(i));
			}
			String currentPage = webDriverActions.getCurrentPageUrl();
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
			if(currentPage.equals(actual))
			{
				webDriverActions.navigateBack();
			}
			else
			{
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			webDriverActions.softClickJS(rajyaSeherChuneLnk);
		}

		//These Lines of Scripts use to Verify the links present under Rajya Section Of Rajya Seher Chune Popup Of Hindi Home Page.
		ArrayList<String>list=new ArrayList<String>();
		for(int i=0;i<rajyaSectionEleList.size();i++)
		{
			String title=webDriverActions.getAttribute("class", rajyaSectionEleDropDwn.get(i));
			if (title.contains("noarrow"))
			{
				webDriverActions.softHighlightElement(rajyaSectionEleList.get(i));
				String expected = webDriverActions.getAttribute("href", rajyaSectionEleList.get(i));
				list.add(expected);
			}
			else
			{
				webDriverActions.softClickJS(rajyaSectionEleList.get(i));
				for(int j=0;j<rajyaSectionDropdwnEleList.size();j++)
				{
					webDriverActions.softHighlightElement(rajyaSectionDropdwnEleList.get(j));
					String expected = webDriverActions.getAttribute("href", rajyaSectionDropdwnEleList.get(j));
					list.add(expected);
				}
			}
		}
		Logs.info(getClass(), list);
		for(int k=0;k<list.size();k++)
		{
			webDriverActions.navigateToUrl(list.get(k));
			String actual= webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd")&& !actual.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(actual);
				actual=betaUrl;
				webDriverActions.navigateToUrl(actual);
			}
			webDriverActions.softWaitForElementVisibility(headerBreadcrumbLnk, 3);
			webDriverActions.stopPageLoading();
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Possibly Element Is Not Visible For This URL "+actual);
		}
		softAssert.assertAll("Rajya Seher Chune Verification Failed");
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Line Two Elements present on Hindi Desktop Landing Page.
	 */
	public void verfyLineTwoSection(String server)
	{
		//it takes the social share Url from property File
		ArrayList<String> list=new ArrayList<String>();
		list.add(fileUtility.readDataFromPropertyFile("netrasuraksha"));
		list.add(fileUtility.readDataFromPropertyFile("crypto"));
		list.add(fileUtility.readDataFromPropertyFile("electral"));
		list.add(fileUtility.readDataFromPropertyFile("missionPani"));

		//it add the element of social share icons.
		ArrayList<WebElement> listEle=new ArrayList<WebElement>();
		listEle.add(netraSurkshaIcon);
		listEle.add(cryptoLogo);
		listEle.add(electralHydrationText);
		listEle.add(headerBreadcrumbLnk);

		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		softAssert.assertTrue(lineTwoSectionEleList.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for(int i=0;i<lineTwoSectionEleList.size();i++)
		{
			String expected = webDriverActions.getAttribute("href", lineTwoSectionEleList.get(i));
			Logs.info(getClass(), expected);
			webDriverActions.softClick(lineTwoSectionEleList.get(i));
			String currentPageUrl=webDriverActions.getCurrentPageUrl();
			if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(lineTwoSectionEleList.get(i));
			}
			String actual = webDriverActions.getCurrentPageUrl();
			String currentPage= webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd")&& !actual.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(actual);
				actual=betaUrl;
				webDriverActions.navigateToUrl(actual);
			}

			// it will iterate the list and validate 
			if(actual.contains("mission-") || actual.contains("electral") || actual.contains("crypto-ki") || actual.contains("netrasuraksha") )
			{
				for(int j=0;j<list.size();j++)
				{
					if(actual.contains(list.get(j)))
					{
						webDriverActions.softWaitForElementVisibility(listEle.get(j), 3);
						webDriverActions.stopPageLoading();
						softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j)), "Possibly Element Is Not Visible For This URL "+expected);	
					}
				}
			}
			else
			{
				webDriverActions.softWaitForElementVisibility(headerTxtLogoLnk, 3);
				webDriverActions.stopPageLoading();
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Possibly Element Is Not Visible For This URL "+expected);	

			}
			if(currentPage.equals(actual))
			{
				webDriverActions.navigateBack();
			}
			else
			{
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			softAssert.assertAll("Line Two Validation Failed");		
		}	
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Sections present on Footer of Hindi Desktop Landing Page.
	 */
	public void verfyFooterSection(List<WebElement> footerLinks,WebElement footerSection, String server)
	{
		String text="";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(2000);
		webDriverActions.scrollToLast();
		webDriverActions.softWaitForElementVisibility(footerSection, 3);
		webDriverActions.softHighlightElement(footerSection);
		String pageURL = webDriverActions.getPageTitle();
		softAssert.assertTrue(footerLinks.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for(int i=0;i<footerLinks.size();i++)
		{
			String expected = webDriverActions.getAttribute("href", footerLinks.get(i));
			Logs.info(getClass(), expected);
			String title = webDriverActions.getAttribute("target", footerLinks.get(i));
			text=webDriverActions.getTextFromElement(footerLinks.get(i));
			if(text.contains(" "))
			{
				String[] s = text.split(" ");
				text=s[0].toLowerCase();
			}
			webDriverActions.softClickJS(footerLinks.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
			}
			String currentPageURL = webDriverActions.getCurrentPageUrl();
			if(currentPageURL.contains("google_vignette") || currentPageURL.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(footerLinks.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
				}
			}
			webDriverActions.waitForSecond(1000);
			String actual = webDriverActions.getCurrentPageUrl();
			String currentPage = webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd")&& !actual.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(expected);
				actual=betaUrl;
				webDriverActions.navigateToUrl(actual);
			}
			webDriverActions.softWaitForElementVisibility(headerBreadcrumbLnk, 3);
			webDriverActions.stopPageLoading();
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Failed To display Header Icon For This URL"+actual);
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageURL);
			}
			else
			{
				if(currentPage.equals(actual))
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
	 * This method used to verify Trending Topics present on Footer of Hindi Desktop Landing Page.
	 */
	public void verfyFooterTrendingTopicSection(String server)
	{
		verfyFooterSection(footerTrendingTopicLnks, footerTrendingTopicLnk,server);
	}



	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Social Section present on Footer of Hindi Desktop Landing Page.
	 */
	public void verfyFooterSocialSectionValidation(String server)
	{
		verfyFooterSection(footerSocialMediaLnks, footerSocialMediaLnk,server);	
	}



	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Popular Category Section present on Footer of Hindi Desktop Landing Page.
	 */
	public void verfyFooterPopularCategorySection(String server)
	{
		verfyFooterSection(footerPopularCategoryLnks, footerPopularCategoryLnk,server);	
	}



	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Line Two Section present on Footer of Hindi Desktop Landing Page.
	 */

	public void verfyFooterLineTwoSection()
	{

		String text="";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(2000);
		webDriverActions.scrollToLast();
		webDriverActions.softHighlightElement(footerLineTwoLHSLnk);
		String pageURL = webDriverActions.getPageTitle();
		softAssert.assertTrue(footerLineTwoLHSLnks.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for(int i=0;i<footerLineTwoLHSLnks.size();i++)
		{
			String expected = webDriverActions.getAttribute("href", footerLineTwoLHSLnks.get(i));
			Logs.info(getClass(), expected);
			String title = webDriverActions.getAttribute("target", footerLineTwoLHSLnks.get(i));
			text=webDriverActions.getTextFromElement(footerLineTwoLHSLnks.get(i));
			if(text.contains(" "))
			{
				String[] s = text.split(" ");
				text=s[0].toLowerCase();
			}
			webDriverActions.softClickJS(footerLineTwoLHSLnks.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
			}
			String currentPageURL = webDriverActions.getCurrentPageUrl();
			if(currentPageURL.contains("google_vignette") || currentPageURL.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(footerLineTwoLHSLnks.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
				}
			}
			webDriverActions.waitForSecond(1000);
			String actual = webDriverActions.getCurrentPageUrl();
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Failed To display Header Icon For This URL"+actual);
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageURL);
			}
			else
			{
				webDriverActions.navigateBack();
			}
		}
		softAssert.assertAll("Issues Found In Validating Footer Section");
	}



	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Language Sites Section present on Footer of Hindi Desktop Landing Page.
	 */
	public void verfyFooterLanguageSection()
	{
		String text="";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		webDriverActions.softWaitForElementVisibility(footerLanguageSitesLnk, 3);
		webDriverActions.softMouseHover(footerLanguageSitesLnk);
		String pageURL = webDriverActions.getPageTitle();
		softAssert.assertTrue(footerLanguageSitesLnks.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		//It will fetch the line one Elements except search Icon
		for (int i = 0; i < footerLanguageSitesLnks.size(); i++)
		{
			webDriverActions.softHighlightElement(footerLanguageSitesLnks.get(i));
			String actual = webDriverActions.getAttribute("href", footerLanguageSitesLnks.get(i));
			Logs.info(getClass(), actual);
			String title = webDriverActions.getAttribute("target", footerLanguageSitesLnks.get(i));
			text=webDriverActions.getTextFromElement(footerLanguageSitesLnks.get(i));
			if(text.contains(" "))
			{
				String[] s = text.split(" ");
				text=s[0].toLowerCase();
			}
			Logs.info(getClass(), text);
			webDriverActions.softMouseHover(footerLanguageSitesLnks.get(i));
			webDriverActions.softClickJS(footerLanguageSitesLnks.get(i));
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
				webDriverActions.softClickJS(footerLanguageSitesLnks.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					webDriverActions.waitForSecond(1000);
				}
			}
			String expected=webDriverActions.getCurrentPageUrl();
			webDriverActions.softWaitForElementVisibility(headerTxtLogoLnk, 3);
			webDriverActions.stopPageLoading();
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
			webDriverActions.softMouseHover(footerLanguageSitesLnk);
			webDriverActions.softMouseHover(footerLanguageSitesLnks.get(i));
		}
		softAssert.assertAll("Issues Found In Validating Footer Section");
	}



	/**
	 * @author SanjeebKumarPati
	 * This method used to verify News 18 Sites Section present on Footer of Hindi Desktop Landing Page.
	 */
	public void verfyFooterNewsSitesSection()
	{
		//it takes the social share Url from property File
		ArrayList<String> list=new ArrayList<String>();
		list.add(fileUtility.readDataFromPropertyFile("topperlearning"));
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
		listEle.add(moneyControlInstaPlayStoreIcon);
		listEle.add(headerBreadcrumbLnk);

		String text="";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(2000);
		webDriverActions.scrollToLast();
		webDriverActions.softWaitForElementVisibility(footerNews18GroupsLnk, 3);
		webDriverActions.softHighlightElement(footerNews18GroupsLnk);
		String pageURL = webDriverActions.getPageTitle();
		softAssert.assertTrue(footerNews18GroupsLnks.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for(int i=0;i<footerNews18GroupsLnks.size();i++)
		{

			String expected = webDriverActions.getAttribute("href", footerNews18GroupsLnks.get(i));
			Logs.info(getClass(), expected);
			String title = webDriverActions.getAttribute("target", footerNews18GroupsLnks.get(i));
			text=webDriverActions.getTextFromElement(footerNews18GroupsLnks.get(i));
			if(text.contains(" "))
			{
				String[] s = text.split(" ");
				text=s[0].toLowerCase();
			}
			text=text.toLowerCase();
			webDriverActions.softClickJS(footerNews18GroupsLnks.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
			}
			String currentPageUrl=webDriverActions.getCurrentPageUrl();
			if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.scrollToLast();
				webDriverActions.softWaitForElementVisibility(footerNews18GroupsLnk, 3);
				webDriverActions.softHighlightElement(footerNews18GroupsLnk);
				webDriverActions.softClickJS(footerLineTwoSocialEleList.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
				}
			}
			webDriverActions.waitForSecond(1000);
			String actual = webDriverActions.getCurrentPageUrl();

			for(int j=0;j<list.size();j++)
			{
				if(actual.contains(list.get(j)))
				{
					webDriverActions.softWaitForElementVisibility(listEle.get(j), 3);
					webDriverActions.stopPageLoading();
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j)), "Possibly Element Is Not Visible For This URL "+expected);	
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
		}
		softAssert.assertAll("Issues Found In Validating Footer Section");
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Live TV Section present on Footer of Hindi Desktop Landing Page.
	 */
	public void verfyFooterLiveTVSection(String server)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(2000);
		webDriverActions.scrollToLast();
		webDriverActions.softHighlightElement(footerliveTVLnk);
		webDriverActions.softClickJS(footerliveTVLnk);
		String currentPageUrl=webDriverActions.getCurrentPageUrl();
		if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softClickJS(footerliveTVLnk);
		}
		webDriverActions.switchToNewWindow();
		webDriverActions.waitForSecond(2000);
		String actual = webDriverActions.getCurrentPageUrl();
		if(server.contains("preProd"))
		{
			String betaUrl = genericUtility.replaceInUrl(actual);
			actual=betaUrl;
			webDriverActions.navigateToUrl(actual);
		}
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Possibly Element Is Not Visible For This URL "+actual);
		softAssert.assertAll("Issues Found In Validating Footer Live TV Section");
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Line Two Social Share Section present on Footer of Hindi Desktop Landing Page.
	 */
	public void verfyFooterLineTwoSocialShareSection()
	{
		String text="";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(2000);
		webDriverActions.scrollToLast();
		webDriverActions.softHighlightElement(footerLineTwoSocialEleSection);
		String pageURL = webDriverActions.getPageTitle();
		softAssert.assertTrue(footerLineTwoSocialEleList.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for(int i=0;i<footerLineTwoSocialEleList.size();i++)
		{

			String expected = webDriverActions.getAttribute("href", footerLineTwoSocialEleList.get(i));
			Logs.info(getClass(), expected);
			String title = webDriverActions.getAttribute("target", footerLineTwoSocialEleList.get(i));
			text=webDriverActions.getTextFromElement(footerLineTwoSocialEleList.get(i));
			if(text.contains(" "))
			{
				String[] s = text.split(" ");
				text=s[0].toLowerCase();
			}
			webDriverActions.softClickJS(footerLineTwoSocialEleList.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
			}
			String currentPageUrl=webDriverActions.getCurrentPageUrl();
			if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(footerLineTwoSocialEleList.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
				}
			}
			webDriverActions.waitForSecond(1000);
			String actual = webDriverActions.getCurrentPageUrl();
			softAssert.assertTrue((expected.contains(actual) || expected.contains(text)), "Failed To Navigate for This URL "+actual);
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageURL);
			}
			else
			{
				webDriverActions.navigateBack();
			}
		}
		softAssert.assertAll("Issues Found In Validating Footer Section");	
	}	

	//=================================Anupam*Business Logic=====================


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of read more for each horoscope sign
	 */
	public void horoscopeTimeLineDescription(){
		webDriverActions.waitForPageToLoad();
		String title = webDriverActions.getPageTitle();
		webDriverActions.scrollToLast();
		//		webDriverActions.scrollUp();
		//		webDriverActions.scrollUp();

		webDriverActions.continuousScrollTillElement(horoscopeLnk, 12);
		webDriverActions.scrollToElement(horoscopeLnk);
		webDriverActions.softClickJS(previousBtn);
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
				String actual =	webDriverActions.getAttribute("href", horoscopeReadMoreLnk);
				webDriverActions.navigateToNewTab(horoscopeReadMore);
				//					webDriverActions.waitForSecond(3000);
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();
				webDriverActions.softWaitForElementVisibility(detailIntro, 60);
				webDriverActions.scrollToPoint(0, 80);
				webDriverActions.softScrollToElement(detailIntro);
				Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
				webDriverActions.softHighlightElement(detailIntro);
				String expected =webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), webDriverActions.getTextFromElement(detailIntro));
				softAssert.assertTrue(genericUtility.compareTwoStrings(expected, actual), "Unable to Navigate "+actual);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(detailIntro),"failed to display discription for "+original +" "+horoscopeType);
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(title);
				webDriverActions.waitForSecond(1000);
			}
			webDriverActions.waitForSecond(2000);
			webDriverActions.softHighlightElement(nextBtn);
			webDriverActions.softClickJS(nextBtn);
		}
		softAssert.assertAll("Issues found in Horoscope section Home page");
	}


	//-----

	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation in home page
	 * @param section
	 * @param artList
	 */
	public void verifyArticlesNavigation(String serverType,WebElement section ,List<WebElement> artList, WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(videoSectionLnk);
		webDriverActions.continuousScrollTillElement(section, 12);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softMouseHover(section);
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
			//			String expectedUrl =webDriverActions.getCurrentPageUrl();
			//			Logs.info(getClass(), expectedUrl);
			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element "+element +" on "+currentPage);
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
	 * @param section
	 * @param artList
	 */
	public void verifyImgNavigation(String serverType ,WebElement section ,List<WebElement> artList ,WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(videoSectionLnk);
		webDriverActions.continuousScrollTillElement(section, 12);		
		webDriverActions.softScrollToElement(section);
		webDriverActions.softMouseHover(section);
		webDriverActions.softHighlightElement(section);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<artList.size() ;i++)
		{
			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			String actualTitle =	webDriverActions.getAttribute("title", artList.get(i));
			webDriverActions.softClickJS(artList.get(i));
			webDriverActions.waitForPageToLoad();

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
	 * @param moreLnk
	 * @param breadcrumb
	 */
	public void verifyMoreLnks(String serverType,WebElement moreLnk, WebElement breadcrumb) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(videoSectionLnk);
		webDriverActions.continuousScrollTillElement(moreLnk, 12);	
		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		webDriverActions.softHighlightElement(moreLnk);
		String actualUrl = webDriverActions.getAttribute("href", moreLnk);
		Logs.info(getClass(),"Actual text Before Click " + actualUrl);
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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+ " on "+currentPage);
		softAssert.assertAll("Issue Found in HomePage Body More Link");
	}

	/**
	 * @author AnupamGupta
	 * This method is used to Verify the More Widget News Navigation
	 * @param sectionLnk
	 * @param breadcrumb
	 */
	public void verifySectionLnks(String serverType,WebElement section, WebElement breadcrumb) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(videoSectionLnk);
		webDriverActions.continuousScrollTillElement(section, 12);	
		webDriverActions.softMouseHover(section);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softHighlightElement(section);
		String actualUrl = webDriverActions.getAttribute("href", section);
		Logs.info(getClass(),"Actual text Before Click " + actualUrl);
		webDriverActions.softHighlightElement(section);
		webDriverActions.softClickJS(section);
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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+" on "+currentPage);
		softAssert.assertAll("Issue Found in HomePage Body Section Link");
	}



	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Video Widget
	 */
	public void verifyVideoWidget(String serverType) {
		verifySectionLnks(serverType,videoSectionLnk, videoBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Video Widget Article
	 */
	public void verifyVideoWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,videoSectionLnk,videoSectionArticleLnk, videoBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Video Widget Image
	 */
	public void verifyVideoWidgetImg(String serverType) {
		verifyImgNavigation(serverType,videoSectionLnk,videoSectionImgLnk, videoBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Nation News
	 */
	public void verifyMoreVideoLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreVideoSectionLnk, videoBreadcrumb);
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

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Nation News
	 */
	public void verifyMoreNationLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreNationSectionLnk, nationBreadcrumb);
	}


	//-----World

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget
	 */
	public void verifyWorldWidget(String serverType) {
		verifySectionLnks(serverType,worldSectionLnk, worldBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget Article
	 */
	public void verifyWorldWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,worldSectionLnk,worldSectionArticleLnk, worldBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget Image
	 */
	public void verifyWorldWidgetImg(String serverType) {
		verifyImgNavigation(serverType,worldSectionLnk,worldSectionImgLnk, worldBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More World News
	 */
	public void verifyMoreWorldLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreWorldSectionLnk, worldBreadcrumb);
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

	//-----Dharm

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Dharm Widget
	 */
	public void verifyDharmWidget(String serverType) {
		verifySectionLnks(serverType,dharmSectionLnk, dharmBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Dharm Widget Article
	 */
	public void verifyDharmWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,dharmSectionLnk,dharmSectionArticleLnk, dharmBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Dharm Widget Image
	 */
	public void verifyDharmWidgetImg(String serverType) {
		verifyImgNavigation(serverType,dharmSectionLnk,dharmSectionImgLnk, dharmBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Dharm News
	 */
	public void verifyMoreDharmLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreDharmSectionLnk, dharmBreadcrumb);
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

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Crime News
	 */
	public void verifyMoreCrimeLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreCrimeSectionLnk, crimeBreadcrumb);
	}

	//-----FooterSport
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget
	 */
	public void verifyFooterSportWidget(String serverType) {
		verifySectionLnks(serverType,footerSportSectionLnk, footerSportBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget Article
	 */
	public void verifyFooterSportWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,footerSportSectionLnk,footerSportSectionArticleLnk, footerSportBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget Image
	 */
	public void verifyFooterSportWidgetImg(String serverType) {
		verifyImgNavigation(serverType,footerSportSectionLnk,footerSportSectionImgLnk, footerSportBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More FooterSport News
	 */
	public void verifyMoreFooterSportLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreFooterSportSectionLnk, footerSportBreadcrumb);
	}

	//-----Knowledge
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Knowledge Widget
	 */
	public void verifyKnowledgeWidget(String serverType) {
		verifySectionLnks(serverType,knowledgeSectionLnk, knowledgeBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Knowledge Widget Article
	 */
	public void verifyKnowledgeWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,knowledgeSectionLnk,knowledgeSectionArticleLnk, knowledgeBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Knowledge Widget Image
	 */
	public void verifyKnowledgeWidgetImg(String serverType) {
		verifyImgNavigation(serverType,knowledgeSectionLnk,knowledgeSectionImgLnk, knowledgeBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Knowledge News
	 */
	public void verifyMoreKnowledgeLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreKnowledgeSectionLnk, knowledgeBreadcrumb);
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

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Career News
	 */
	public void verifyMoreCareerLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreCareerSectionLnk, careerBreadcrumb);
	}

	//------Blog

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Career Widget
	 */
	public void verifyBlogWidget(String serverType) {
		verifySectionLnks(serverType,blogSectionLnk, blogBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Blog News
	 */
	public void verifyMoreBlogLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreBlogSectionLnk, blogBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Blog Widget Article
	 */
	public void verifyBlogWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,blogSectionLnk,journalistArticleLnk, blogBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Blog Widget Image
	 */
	public void verifyBlogWidgetJournalistImg(String serverType) {
		verifyImgNavigation(serverType,blogSectionLnk,journalistImgLnk, blogBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Blog Widget Image
	 */
	public void verifyBlogWidgetJournalistProfileLnk(String serverType) {
		verifyImgNavigation(serverType,blogSectionLnk,journalistProfileLnk, blogBreadcrumb);
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
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		//			String homeUrl =webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(artList, 20);
		if(artList.size()>1)
		{
			webDriverActions.softScrollToElement(artList.get(0));
			webDriverActions.softMouseHover(artList.get(0));
			webDriverActions.waitForSecond(1000);
			for(int i=0; i<artList.size() ;i++)
			{
				webDriverActions.continuousScrollTillAllElement(artList, 20);
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				//					String actual =	webDriverActions.getAttribute("href", artList.get(i));
				//					Logs.info(getClass(), actual);
				webDriverActions.waitForSecond(1000);
				webDriverActions.softClickJS(artList.get(i));
				webDriverActions.waitForPageToLoad();
				webDriverActions.waitForSecond(2000);
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
				webDriverActions.waitForSecond(2000);
				webDriverActions.softHighlightElement(element);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in "+currentPage);;
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForPageToLoad();
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
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		if(imgList.size()>1)
		{
			webDriverActions.continuousScrollTillAllElement(imgList, 20);
			webDriverActions.softScrollToElement(imgList.get(0));
			webDriverActions.softMouseHover(imgList.get(0));
			for(int i=0; i<imgList.size() ;i++)
			{
				webDriverActions.continuousScrollTillAllElement(imgList, 20);
				webDriverActions.softMouseHover(imgList.get(i));
				//					String actual =	webDriverActions.getAttribute("src", imgList.get(i));
				//					Logs.info(getClass(), actual);
				webDriverActions.softClickJS(imgList.get(i));
				webDriverActions.waitForSecond(2000);
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
				webDriverActions.waitForSecond(2000);
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
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(moreLnk, 20);
		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		webDriverActions.softClickJS(moreLnk);
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
		webDriverActions.waitForSecond(2000);
		webDriverActions.highlightElement(element);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in "+currentPage);
		softAssert.assertAll("Issues Found in Homepage Body");
	}


	public void verifyPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , priorityPanelArticleLnk, articleHeaderTxt);
	}

	public void verifyPriorityPanelImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType ,priorityPanelImgLnk, articleHeaderTxt);
	}

	public void verifyCricketArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , cricketArticleLnk, articleHeaderTxt);
	}

	public void verifyCricketImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , cricketImgLnk, articleHeaderTxt);
	}

	public void verifyMoreCricketNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreCricketNewsLnk, articleBreadCrumbDiv);
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
		if(webDriverActions.softIsElementDisplayed(news18MinisNextBtn))
		{
			String beforeSlide = webDriverActions.getTextFromElement(activeNews18MinisArticleLnk);
			Logs.info(getClass(), beforeSlide);
			webDriverActions.softClickJS(news18MinisNextBtn);
			webDriverActions.waitForSecond(2000);
			String afterSlide = webDriverActions.getTextFromElement(activeNews18MinisArticleLnk);
			Logs.info(getClass(), afterSlide);
			softAssert.assertNotEquals(beforeSlide, afterSlide);
		}
		else
		{
			softAssert.fail("Possibly Next Button is Not Displayed in News18 Minis Section");
		}
		if(webDriverActions.softIsElementDisplayed(news18MinisPrevBtn))
		{
			String beforeSlide = webDriverActions.getTextFromElement(activeNews18MinisArticleLnk);
			Logs.info(getClass(), beforeSlide);
			webDriverActions.softClickJS(news18MinisPrevBtn);
			webDriverActions.waitForSecond(2000);
			String afterSlide = webDriverActions.getTextFromElement(activeNews18MinisArticleLnk);
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
				if (serverType.equalsIgnoreCase("preProd")) {
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
			webDriverActions.waitForSecond(2000);
			for(int i=0; i<webstoriesArticleLnk.size() ;i++)
			{
				webDriverActions.softClick(webstoriesArticleLnk.get(i));
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
		webDriverActions.continuousScrollTillAllElement(webstoriesImgLnk, 10);
		if(webstoriesImgLnk.size()>0)
		{
			webDriverActions.softScrollToElement(webstoriesImgLnk.get(0));
			webDriverActions.softMouseHover(webstoriesImgLnk.get(0));
			String title = webDriverActions.getPageTitle();
			for(int i=0; i<webstoriesImgLnk.size() ;i++)
			{
				webDriverActions.softClick(webstoriesImgLnk.get(i));
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
				webDriverActions.softHighlightElement(nextWebStoryBtn);
				webDriverActions.waitForSecond(1000);
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

	public void verifyRelatedNewsArticleNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// // String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(relatedNewsLnk, 10);
		for(int i=0; i<relatedNewsLnk.size() ; i++)
		{
			webDriverActions.softScrollToElement(relatedNewsLnk.get(i));
			webDriverActions.softMouseHover(relatedNewsLnk.get(i));
			webDriverActions.softClickJS(relatedNewsLnk.get(i));
			webDriverActions.waitForSecond(5000);
			for(int j=0 ;j< activeRelatedNewsLnk.size() ; j++)
			{
				webDriverActions.scrollToElement(activeRelatedNewsLnk.get(j));
				webDriverActions.softScrollToElement(activeRelatedNewsLnk.get(j));
				//					String actual = webDriverActions.getAttribute("href", activeRelatedNewsLnk.get(j));
				webDriverActions.softClickJS(activeRelatedNewsLnk.get(j));
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
				webDriverActions.softHighlightElement(articleHeaderTxt);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleHeaderTxt), "Unable to Display Element in "+currentPage);
				webDriverActions.waitForSecond(2000);
				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForSecond(1000);
				webDriverActions.continuousScrollTillElement(relatedNewsLnk.get(i), 10);
				webDriverActions.softClickJS(relatedNewsLnk.get(i));
				webDriverActions.waitForSecond(2000);
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyBodyKhelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , bodySportsArticleLnk, articleHeaderTxt);
	}

	public void verifyBodyKhelImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType , bodySportsImgLnk, articleHeaderTxt);
	}

	public void verifyPhotoArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , photoArticleLnk, articleHeaderTxt);
	}

	public void verifyPhotoImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType , photoImgLnk, articleHeaderTxt);
	}

	public void verifyLiteratureArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , literatureArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyLiteratureImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType , literatureImgLnk, articleBreadCrumbDiv);
	}

	public void verifyLiteratureReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType , literatureReadMoreLnk, articleBreadCrumbDiv);
	}

	public void verifyLiteratureTitleNavigation(String serveType)
	{
		verifyTitleNavigation(serveType , literatureTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyPhotoTabsArticleNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(photoTabsLnk, 10);
		webDriverActions.softScrollToElement(photoTabsLnk.get(0));
		webDriverActions.softMouseHover(photoTabsLnk.get(0));
		webDriverActions.waitForSecond(2000);
		for(int j =0 ; j<photoTabsLnk.size() ; j++)
		{
			webDriverActions.continuousScrollTillAllElement(photoTabsLnk, 10);
			webDriverActions.softMouseHover(photoTabsLnk.get(j));
			webDriverActions.softHighlightElement(photoTabsLnk.get(j));
			webDriverActions.softClickJS(photoTabsLnk.get(j));
			webDriverActions.waitForSecond(2000);
			for(int i=0; i<photoArticleLnk.size() ;i++)
			{
				webDriverActions.waitForSecond(1000);
				webDriverActions.softMouseHover(photoArticleLnk.get(i));
				webDriverActions.softScrollToElement(photoArticleLnk.get(i));
				//					String actual =	webDriverActions.getAttribute("href", photoArticleLnk.get(i));
				//					Logs.info(getClass(), actual);
				webDriverActions.softClickJS(photoArticleLnk.get(i));
				webDriverActions.waitForPageToLoad();
				webDriverActions.waitForSecond(2000);
				String currentPage =webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), currentPage);
				String expectedUrl = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				webDriverActions.softHighlightElement(articleHeaderTxt);
				webDriverActions.waitForSecond(2000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleHeaderTxt) , "Unable to Display Element in "+currentPage);;
				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.softClickJS(photoTabsLnk.get(j));
				webDriverActions.waitForSecond(2000);
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyPhotoTabsImageNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// // String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(photoTabsLnk, 20);
		//		webDriverActions.softScrollToElement(photoTabsLnk.get(0));
		//		webDriverActions.softMouseHover(photoTabsLnk.get(0));
		webDriverActions.waitForSecond(2000);
		for(int j =0 ; j<photoTabsLnk.size() ; j++)
		{
			webDriverActions.continuousScrollTillAllElement(photoTabsLnk, 20);
			webDriverActions.softMouseHover(photoTabsLnk.get(j));
			webDriverActions.softHighlightElement(photoTabsLnk.get(j));
			webDriverActions.softClickJS(photoTabsLnk.get(j));
			webDriverActions.waitForSecond(2000);
			for(int i=0; i<photoImgLnk.size() ;i++)
			{
				webDriverActions.continuousScrollTillAllElement(photoImgLnk, 20);
				webDriverActions.waitForSecond(1000);
				webDriverActions.softMouseHover(photoImgLnk.get(i));
				webDriverActions.softScrollToElement(photoImgLnk.get(i));
				//					String actual =	webDriverActions.getAttribute("src", photoImgLnk.get(i));
				//					Logs.info(getClass(), actual);
				webDriverActions.softClickJS(photoImgLnk.get(i));
				webDriverActions.waitForPageToLoad();
				webDriverActions.waitForSecond(2000);
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
				webDriverActions.softHighlightElement(articleHeaderTxt);
				webDriverActions.waitForSecond(1000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleHeaderTxt) , "Unable to Display Element in "+currentPage);;
				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForSecond(2000);
				webDriverActions.continuousScrollTillAllElement(photoTabsLnk, 20);
				webDriverActions.softClickJS(photoTabsLnk.get(j));
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyPhotoTitleNavigation(String serveType)
	{
		verifyTitleNavigation( serveType , photoTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyNews18HindiPlusArticleNavigation(String serveType)
	{
		verifyArticleNavigation(serveType , news18HindiPlusArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyNews18HindiPlusImageNavigation(String serveType)
	{
		verifyImageNavigation(serveType , news18HindiPlusImgLnk, articleBreadCrumbDiv);
	}

	public void verifyNews18HindiPlusSliderNavigation()
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(news18HindiPlusRightSliderBtn);
		webDriverActions.softScrollToElement(activeNews18HindiPlusArticleLnk);
		if(webDriverActions.isElementDisplayed(news18HindiPlusRightSliderBtn))
		{
			for(int i = 0 ; i< news18HindiPlusArticleLnk.size() ; i++)
			{
				webDriverActions.softMouseHover(activeNews18HindiPlusArticleLnk);
				webDriverActions.softScrollToElement(activeNews18HindiPlusArticleLnk);
				String beforeSlide = webDriverActions.getTextFromElement(activeNews18HindiPlusArticleLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softClickJS(news18HindiPlusRightSliderBtn);
				webDriverActions.waitForSecond(2000);
				String afterSlide = webDriverActions.getTextFromElement(activeNews18HindiPlusArticleLnk);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Slider is Not Working ");
			}
		}
		else
		{
			softAssert.fail("Possibly Right Slider Button Is Not Displayed ");
		}

		if(webDriverActions.isElementDisplayed(news18HindiPlusLeftSliderBtn))
		{
			for(int i = 0 ; i< news18HindiPlusArticleLnk.size() ; i++)
			{
				webDriverActions.softMouseHover(activeNews18HindiPlusArticleLnk);
				webDriverActions.softScrollToElement(activeNews18HindiPlusArticleLnk);
				String beforeSlide = webDriverActions.getTextFromElement(activeNews18HindiPlusArticleLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softClickJS(news18HindiPlusLeftSliderBtn);
				webDriverActions.waitForSecond(2000);
				String afterSlide = webDriverActions.getTextFromElement(activeNews18HindiPlusArticleLnk);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Slider is Not Working ");
			}
		}
		else
		{
			softAssert.fail("Possibly Left Slider Button Is Not Displayed ");
		}
		softAssert.assertAll("Issue in Homepage Body ");
	}


	public void verifyNews18HindiPlusOriginalBannerNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(news18HindiPlusOriginalBannerLnk);
		webDriverActions.softMouseHover(news18HindiPlusOriginalBannerLnk);
		webDriverActions.softClickJS(news18HindiPlusOriginalBannerLnk);
		webDriverActions.waitForSecond(2000);
		String currentPage = webDriverActions.getCurrentPageUrl();
		Logs.info(getClass(), currentPage);
		if (serverType.equalsIgnoreCase("preProd")) {
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
		softAssert.assertAll("Issue in Homepage Body ");
	}

	public void verifyCricketDhamalNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(cricketDhamalImgLnk);
		webDriverActions.softMouseHover(cricketDhamalImgLnk);
		webDriverActions.softClickJS(cricketDhamalImgLnk);
		webDriverActions.waitForSecond(2000);
		String currentPage = webDriverActions.getCurrentPageUrl();
		Logs.info(getClass(), currentPage);
		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(articleBreadCrumbDiv);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element "+currentPage);
		softAssert.assertAll("Issue in Homepage Body ");
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

	public void verifyCricketTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , cricketTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyBollywoodArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , bollywoodArticleLnk, articleHeaderTxt);
	}

	public void verifyBollywoodImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType , bollywoodImgLnk, articleHeaderTxt);
	}


	public void verifyBollywoodTabsArticleNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// // String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(bollywoodTabsLnk, 10);
		if(bollywoodTabsLnk.size()>1)
		{
			webDriverActions.softScrollToElement(bollywoodTabsLnk.get(0));
			webDriverActions.softMouseHover(bollywoodTabsLnk.get(0));
			for(int j =0 ; j<bollywoodTabsLnk.size() ; j++)
			{
				webDriverActions.continuousScrollTillAllElement(bollywoodTabsLnk, 10);
				webDriverActions.softHighlightElement(bollywoodTabsLnk.get(j));
				webDriverActions.softClickJS(bollywoodTabsLnk.get(j));
				webDriverActions.waitForSecond(1000);
				for(int i=0; i<bollywoodArticleLnk.size() ;i++)
				{
					webDriverActions.continuousScrollTillAllElement(bollywoodArticleLnk, 10);
					webDriverActions.waitForSecond(1000);
					webDriverActions.softMouseHover(bollywoodArticleLnk.get(i));
					webDriverActions.softScrollToElement(bollywoodArticleLnk.get(i));
					String actual =	webDriverActions.getAttribute("href", bollywoodArticleLnk.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClickJS(bollywoodArticleLnk.get(i));
					webDriverActions.waitForSecond(1000);
					String currentPage =webDriverActions.getCurrentPageUrl();
					Logs.info(getClass(), currentPage);
					String expectedUrl = webDriverActions.getCurrentPageUrl();
					if (serverType.equalsIgnoreCase("preProd")) {
						String betaUrl = genericUtility.replaceInUrl(currentPage);
						webDriverActions.navigateToUrl(betaUrl);
						currentPage=betaUrl;
					}
					else 
					{
						currentPage = webDriverActions.getCurrentPageUrl();
					}
					webDriverActions.waitForPageToLoad();
					webDriverActions.softHighlightElement(articleHeaderTxt);
					webDriverActions.waitForSecond(2000);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleHeaderTxt) , "Unable to Display Element in "+currentPage);;
					// webDriverActions.navigateToUrl(homeUrl);
					if (currentPage.contains(expectedUrl)) {
						webDriverActions.navigateBack();
					}
					else {
						webDriverActions.navigateBack();
						webDriverActions.navigateBack();
					}	
					webDriverActions.continuousScrollTillAllElement(bollywoodTabsLnk, 10);
					webDriverActions.softClickJS(bollywoodTabsLnk.get(j));
					webDriverActions.waitForSecond(2000);
				}
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyBollywoodTabsImageNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// // String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(bollywoodImgLnk, 20);
		if(bollywoodTabsLnk.size()>1)
		{
			webDriverActions.softScrollToElement(bollywoodTabsLnk.get(0));
			webDriverActions.softMouseHover(bollywoodTabsLnk.get(0));
			webDriverActions.waitForSecond(2000);
			for(int j =0 ; j<bollywoodTabsLnk.size() ; j++)
			{
				webDriverActions.continuousScrollTillAllElement(bollywoodTabsLnk, 20);
				webDriverActions.softHighlightElement(bollywoodTabsLnk.get(j));
				webDriverActions.softClickJS(bollywoodTabsLnk.get(j));
				webDriverActions.waitForSecond(2000);
				for(int i=0; i<bollywoodImgLnk.size() ;i++)
				{
					webDriverActions.continuousScrollTillAllElement(bollywoodImgLnk, 20);
					webDriverActions.waitForSecond(1000);
					webDriverActions.softMouseHover(bollywoodImgLnk.get(i));
					webDriverActions.softScrollToElement(bollywoodImgLnk.get(i));
					String actual =	webDriverActions.getAttribute("src", bollywoodImgLnk.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.waitForSecond(2000);
					webDriverActions.softClick(bollywoodImgLnk.get(i));
					webDriverActions.waitForPageToLoad();
					webDriverActions.waitForSecond(2000);
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
					webDriverActions.waitForPageToLoad();
					webDriverActions.softHighlightElement(articleHeaderTxt);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleHeaderTxt) , "Unable to Display Element in "+currentPage);;
					// webDriverActions.navigateToUrl(homeUrl);
					if (currentPage.contains(expectedUrl)) {
						webDriverActions.navigateBack();
					}
					else {
						webDriverActions.navigateBack();
						webDriverActions.navigateBack();
					}	
					webDriverActions.continuousScrollTillAllElement(bollywoodImgLnk, 10);
					webDriverActions.softClickJS(bollywoodTabsLnk.get(j));
					webDriverActions.waitForPageToLoad();
				}
			}
		}
		else
		{
			softAssert.fail("Possibly Element is not Visible or Size is "+bollywoodTabsLnk.size());
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyBollywoodReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType , bollywoodReadMoreLnk, articleBreadCrumbDiv);
	}

	public void verifyBollywoodTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , bollywoodTitleLnk, articleBreadCrumbDiv);
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

	public void verifyMoneyArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , moneyArticleLnk, articleHeaderTxt);
	}

	public void verifyMoneyImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType , moneyImgLnk, articleHeaderTxt);
	}

	public void verifyMoneyTabsArticleNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// // String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(moneyTabsLnk, 10);
		webDriverActions.softMouseHover(moneyTitleLnk);
		webDriverActions.waitForSecond(2000);
		for(int j =0 ; j<moneyTabsLnk.size() ; j++)
		{
			webDriverActions.softScrollToElement(moneyTabsLnk.get(j));
			webDriverActions.softMouseHover(moneyTabsLnk.get(j));
			webDriverActions.softHighlightElement(moneyTabsLnk.get(j));
			webDriverActions.softClickJS(moneyTabsLnk.get(j));
			webDriverActions.waitForSecond(2000);
			for(int i=0; i<moneyArticleLnk.size() ;i++)
			{
				webDriverActions.waitForSecond(1000);
				webDriverActions.softMouseHover(moneyArticleLnk.get(i));
				webDriverActions.softScrollToElement(moneyArticleLnk.get(i));
				String actual =	webDriverActions.getAttribute("href", moneyArticleLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.waitForSecond(2000);
				webDriverActions.softClickJS(moneyArticleLnk.get(i));
				webDriverActions.waitForPageToLoad();
				webDriverActions.waitForSecond(2000);
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
				webDriverActions.waitForPageToLoad();
				webDriverActions.softHighlightElement(articleHeaderTxt);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleHeaderTxt) , "Unable to Display Element in "+currentPage);;
				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.continuousScrollTillAllElement(moneyTabsLnk, 10);
				webDriverActions.softClickJS(moneyTabsLnk.get(j));
				webDriverActions.waitForPageToLoad();
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyMoneyTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , moneyTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyMoneyTabsImageNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// // String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(moneyImgLnk, 20);
		if(moneyTabsLnk.size()>1)
		{
			webDriverActions.softScrollToElement(moneyTabsLnk.get(0));
			webDriverActions.softMouseHover(moneyTabsLnk.get(0));
			webDriverActions.waitForSecond(2000);
			for(int j =0 ; j<moneyTabsLnk.size() ; j++)
			{
				webDriverActions.softHighlightElement(moneyTabsLnk.get(j));
				webDriverActions.softClickJS(moneyTabsLnk.get(j));
				webDriverActions.waitForSecond(2000);
				for(int i=0; i<moneyImgLnk.size() ;i++)
				{
					webDriverActions.waitForSecond(1000);
					webDriverActions.softMouseHover(moneyImgLnk.get(i));
					webDriverActions.softScrollToElement(moneyImgLnk.get(i));
					String actual =	webDriverActions.getAttribute("src", moneyImgLnk.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.waitForSecond(2000);
					webDriverActions.softClick(moneyImgLnk.get(i));
					webDriverActions.waitForPageToLoad();
					webDriverActions.waitForSecond(2000);
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
					webDriverActions.waitForPageToLoad();
					webDriverActions.softHighlightElement(articleHeaderTxt);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleHeaderTxt) , "Unable to Display Element in "+currentPage);;
					// webDriverActions.navigateToUrl(homeUrl);
					if (currentPage.contains(expectedUrl)) {
						webDriverActions.navigateBack();
					}
					else {
						webDriverActions.navigateBack();
						webDriverActions.navigateBack();
					}	
					webDriverActions.continuousScrollTillAllElement(moneyImgLnk, 20);
					webDriverActions.softClickJS(moneyTabsLnk.get(j));
					webDriverActions.waitForPageToLoad();
				}
			}
		}
		else
		{
			softAssert.fail("Possibly Element is not Visible or Size is "+moneyImgLnk.size());
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyMoneyControlNavigation()
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String title = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillElement(moneyControlLnk, 20);
		webDriverActions.softScrollToElement(moneyControlLnk);
		webDriverActions.softMouseHover(moneyControlLnk);
		webDriverActions.softClickJS(moneyControlLnk);
		webDriverActions.switchToNewWindow();
		webDriverActions.waitForSecond(5000);
		String currentPage =webDriverActions.getCurrentPageUrl();
		Logs.info(getClass(), currentPage);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(moneyControlLogo), "Unable to Display Element in "+currentPage);
		webDriverActions.closeDriver();
		webDriverActions.switchToWindow(title);
		softAssert.assertAll("Issue in Homepage Body ");
	}

	public void verifyMoneyReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(allMoneyTabsLnk, 10);
		if(allMoneyTabsLnk.size()>1)
		{
			webDriverActions.waitForSecond(1000);
			for(int j =0 ; j<allMoneyTabsLnk.size() ; j++)
			{
				webDriverActions.continuousScrollTillAllElement(allMoneyTabsLnk, 20);
				webDriverActions.softMouseHover(allMoneyTabsLnk.get(j));
				webDriverActions.softHighlightElement(allMoneyTabsLnk.get(j));
				webDriverActions.softClickJS(allMoneyTabsLnk.get(j));
				webDriverActions.waitForSecond(1000);
				webDriverActions.softClickJS(moneyReadMoreNewsLnk);
				webDriverActions.waitForSecond(1000);
				String currentPage = webDriverActions.getCurrentPageUrl();
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
				webDriverActions.waitForPageToLoad();
				webDriverActions.softHighlightElement(articleBreadCrumbDiv);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Possibly Element is Not Visible in "+currentPage);
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
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyBodyKhelTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , bodyKhelTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyBodyKhelTabsArticleNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(bodyKhelTabsLnk, 20);
		if(bodyKhelTabsLnk.size()>1)
		{
			webDriverActions.softScrollToElement(bodyKhelTabsLnk.get(0));
			webDriverActions.softMouseHover(bodyKhelTabsLnk.get(0));
			webDriverActions.waitForSecond(1000);
			for(int j =0 ; j<bodyKhelTabsLnk.size() ; j++)
			{
				webDriverActions.continuousScrollTillAllElement(bodyKhelTabsLnk, 20);
				//			webDriverActions.softScrollToElement(photoTabsLnk.get(j));
				//			webDriverActions.softMouseHover(photoTabsLnk.get(j));
				webDriverActions.softHighlightElement(bodyKhelTabsLnk.get(j));
				webDriverActions.softClickJS(bodyKhelTabsLnk.get(j));
				webDriverActions.waitForSecond(2000);
				for(int i=0; i<bodySportsArticleLnk.size() ;i++)
				{
					webDriverActions.waitForSecond(1000);
					webDriverActions.softMouseHover(bodySportsArticleLnk.get(i));
					webDriverActions.softScrollToElement(bodySportsArticleLnk.get(i));
					String actual =	webDriverActions.getAttribute("href", bodySportsArticleLnk.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClickJS(bodySportsArticleLnk.get(i));
					webDriverActions.waitForPageToLoad();
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
					webDriverActions.waitForPageToLoad();
					webDriverActions.softHighlightElement(articleHeaderTxt);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleHeaderTxt) , "Unable to Display Element in "+currentPage);;
					// webDriverActions.navigateToUrl(homeUrl);
					if (currentPage.contains(expectedUrl)) {
						webDriverActions.navigateBack();
					}
					else {
						webDriverActions.navigateBack();
						webDriverActions.navigateBack();
					}	
					webDriverActions.continuousScrollTillAllElement(bodyKhelTabsLnk, 20);
					webDriverActions.softClickJS(bodyKhelTabsLnk.get(j));
					webDriverActions.waitForSecond(1000);
				}
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");

	}

	public void verifyBodyKhelTabsImageNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(bodySportsArticleLnk, 10);
		if(bodyKhelTabsLnk.size()>1)
		{
			webDriverActions.softMouseHover(bodyKhelTabsLnk.get(0));
			webDriverActions.waitForSecond(2000);
			for(int j =0 ; j<bodyKhelTabsLnk.size() ; j++)
			{
				webDriverActions.softHighlightElement(bodyKhelTabsLnk.get(j));
				webDriverActions.softClickJS(bodyKhelTabsLnk.get(j));
				webDriverActions.waitForSecond(2000);
				for(int i=0; i<bodySportsImgLnk.size() ;i++)
				{
					webDriverActions.waitForSecond(1000);
					webDriverActions.softMouseHover(bodySportsImgLnk.get(i));
					webDriverActions.softScrollToElement(bodySportsImgLnk.get(i));
					String actual =	webDriverActions.getAttribute("src", bodySportsImgLnk.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.waitForSecond(2000);
					webDriverActions.softClickJS(bodySportsImgLnk.get(i));
					webDriverActions.waitForPageToLoad();
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
					webDriverActions.waitForPageToLoad();
					webDriverActions.softHighlightElement(articleHeaderTxt);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleHeaderTxt) , "Unable to Display Element in "+currentPage);;
					// webDriverActions.navigateToUrl(homeUrl);
					if (currentPage.contains(expectedUrl)) {
						webDriverActions.navigateBack();
					}
					else {
						webDriverActions.navigateBack();
						webDriverActions.navigateBack();
					}	
					webDriverActions.waitForPageToLoad();
					webDriverActions.continuousScrollTillAllElement(bodySportsArticleLnk, 10);
					webDriverActions.softClickJS(bodyKhelTabsLnk.get(j));
					webDriverActions.waitForPageToLoad();
				}
			}
		}
		else
		{
			softAssert.fail("Possibly Element is not Visible or Size is "+bodyKhelTabsLnk.size());
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyBodyKhelReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(bodySportsArticleLnk, 10);
		if(bodyKhelTabsLnk.size()>1)
		{
			webDriverActions.softMouseHover(bodyKhelTabsLnk.get(0));
			webDriverActions.waitForSecond(2000);
			for(int j =0 ; j<bodyKhelTabsLnk.size() ; j++)
			{
				webDriverActions.softHighlightElement(bodyKhelTabsLnk.get(j));
				webDriverActions.softClickJS(bodyKhelTabsLnk.get(j));
				webDriverActions.waitForSecond(2000);
				webDriverActions.softClickJS(bodyKhelReadMoreLnk);
				webDriverActions.waitForSecond(2000);
				String currentPage =  webDriverActions.getCurrentPageUrl();
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
				webDriverActions.softHighlightElement(articleBreadCrumbDiv);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element in "+currentPage);
				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillAllElement(bodySportsArticleLnk, 10);
				webDriverActions.softHighlightElement(bodyKhelTabsLnk.get(j));
				webDriverActions.softClickJS(bodyKhelTabsLnk.get(j));
			}
		}
		//		verifyMoreNewsNavigation(serverType , bodyKhelReadMoreLnk, articleBreadCrumbDiv);
	}

	public void verifyLatestMobileNewsArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , latestMobileNewsArticleLnk, articleHeaderTxt);
	}

	public void verifyLatestMobileNewsImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType , latestMobileNewsImgLnk, articleHeaderTxt);
	}

	public void verifyLatestMobileMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType , mobileFinderMoreNewsLnk, articleBreadCrumbDiv);
	}

	public void verifyMobileBrandsNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , mobileBrandsLnk, articleBreadCrumbDiv);
	}

	public void verifyTrendingAndRecommendedSliderNavigation()
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(mobileFinderTabsLnk, 10);
		webDriverActions.softHighlightElement(mobileFinderTabsLnk.get(0));
		webDriverActions.softClickJS(mobileFinderTabsLnk.get(0));
		webDriverActions.waitForSecond(2000);
		if(trendindAndRecommendedStoriesLnk.size()>0)
		{
			for(int i =0 ; i<trendindAndRecommendedStoriesLnk.size();i++)
			{
				webDriverActions.softMouseHover(activeTrendindAndRecommendedStoriesLnk);
				String beforeSlide = webDriverActions.getTextFromElement(activeTrendindAndRecommendedStoriesLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softClickJS(trendindAndRecommendedForwordSlider);
				webDriverActions.waitForSecond(1000);
				String afterSlide = webDriverActions.getTextFromElement(activeTrendindAndRecommendedStoriesLnk);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Slider is Not Working for Trending and Recommended Mobile Section ");
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+trendindAndRecommendedStoriesLnk.size());
		}
		softAssert.assertAll("Issue Found in Homepage Body");
	}


	public void verifyTrendingAndRecommendedStoriesNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(mobileFinderTabsLnk, 10);
		webDriverActions.softHighlightElement(mobileFinderTabsLnk.get(0));
		webDriverActions.softClickJS(mobileFinderTabsLnk.get(0));
		webDriverActions.waitForSecond(2000);
		if(trendindAndRecommendedStoriesLnk.size()>1)
		{
			for(int i=0; i<trendindAndRecommendedStoriesLnk.size() ;i++)
			{
				webDriverActions.waitForSecond(1000);
				webDriverActions.softMouseHover(trendindAndRecommendedStoriesLnk.get(i));
				webDriverActions.softScrollToElement(trendindAndRecommendedStoriesLnk.get(i));
				String actual =	webDriverActions.getAttribute("href", trendindAndRecommendedStoriesLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.waitForSecond(2000);
				webDriverActions.softClickJS(trendindAndRecommendedStoriesLnk.get(i));
				webDriverActions.waitForPageToLoad();
				webDriverActions.waitForSecond(2000);
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
				webDriverActions.waitForPageToLoad();
				webDriverActions.softHighlightElement(articleBreadCrumbDiv);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in "+currentPage);;
				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillAllElement(mobileFinderTabsLnk, 10);
				webDriverActions.softClickJS(mobileFinderTabsLnk.get(0));
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+trendindAndRecommendedStoriesLnk.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyTrendingAndRecommendedMobileReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillElement(mobileFinderMoreNewsLnk, 10);
		webDriverActions.softHighlightElement(mobileFinderTabsLnk.get(0));
		webDriverActions.softClickJS(mobileFinderTabsLnk.get(0));
		webDriverActions.waitForSecond(1000);
		if(trendindAndRecommendedReadMoreLnk.size()>1)
		{
			for(int i=0; i<trendindAndRecommendedReadMoreLnk.size() ;i++)
			{
				webDriverActions.softMouseHover(trendindAndRecommendedReadMoreLnk.get(i));
				webDriverActions.softScrollToElement(trendindAndRecommendedReadMoreLnk.get(i));
				String actual =	webDriverActions.getAttribute("href", trendindAndRecommendedReadMoreLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(trendindAndRecommendedReadMoreLnk.get(i));
				webDriverActions.waitForSecond(2000);
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
				webDriverActions.waitForPageToLoad();
				webDriverActions.softHighlightElement(articleBreadCrumbDiv);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in "+currentPage);;
				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillElement(mobileFinderMoreNewsLnk, 10);
				webDriverActions.softClickJS(mobileFinderTabsLnk.get(0));
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+trendindAndRecommendedStoriesLnk.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}


	public void verifyUpcomingMobileSliderNavigation()
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(mobileFinderTabsLnk, 10);
		webDriverActions.softHighlightElement(mobileFinderTabsLnk.get(1));
		webDriverActions.softClickJS(mobileFinderTabsLnk.get(1));
		webDriverActions.waitForSecond(2000);
		if(upcomingMobileStoriesLnk.size()>0)
		{
			for(int i =0 ; i<upcomingMobileStoriesLnk.size();i++)
			{
				webDriverActions.softMouseHover(activeUpcomingMobileStoriesLnk);
				String beforeSlide = webDriverActions.getTextFromElement(activeUpcomingMobileStoriesLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softClickJS(upcomingMobileForwordSlider);
				webDriverActions.waitForSecond(1000);
				String afterSlide = webDriverActions.getTextFromElement(activeUpcomingMobileStoriesLnk);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Slider is Not Working for Soon Upcoming Mobile Section");
			}
		}
		else
		{
			softAssert.fail("Possibly Element is not Visible or Size is "+upcomingMobileStoriesLnk.size());
		}
		softAssert.assertAll("Issue Found in Homepage Body");
	}


	public void verifyUpcomingMobileStoriesNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(mobileFinderTabsLnk, 10);
		webDriverActions.softHighlightElement(mobileFinderTabsLnk.get(1));
		webDriverActions.softClickJS(mobileFinderTabsLnk.get(1));
		webDriverActions.waitForSecond(2000);
		if(upcomingMobileStoriesLnk.size()>1)
		{
			for(int i=0; i<upcomingMobileStoriesLnk.size() ;i++)
			{
				webDriverActions.softMouseHover(upcomingMobileStoriesLnk.get(i));
				webDriverActions.softScrollToElement(upcomingMobileStoriesLnk.get(i));
				String actual =	webDriverActions.getAttribute("href", upcomingMobileStoriesLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(upcomingMobileStoriesLnk.get(i));
				webDriverActions.waitForSecond(2000);
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
				webDriverActions.waitForPageToLoad();
				webDriverActions.softHighlightElement(articleBreadCrumbDiv);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in "+currentPage);;
				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillAllElement(mobileFinderTabsLnk, 10);
				webDriverActions.softClickJS(mobileFinderTabsLnk.get(1));
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+trendindAndRecommendedStoriesLnk.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyUpcomingMobileReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(mobileFinderTabsLnk, 10);
		webDriverActions.softHighlightElement(mobileFinderTabsLnk.get(1));
		webDriverActions.softClickJS(mobileFinderTabsLnk.get(1));
		webDriverActions.waitForSecond(1000);
		if(upcomingMobileReadMoreLnk.size()>1)
		{
			for(int i=0; i<upcomingMobileReadMoreLnk.size() ;i++)
			{
				webDriverActions.softMouseHover(upcomingMobileReadMoreLnk.get(i));
				webDriverActions.softScrollToElement(upcomingMobileReadMoreLnk.get(i));
				String actual =	webDriverActions.getAttribute("href", upcomingMobileReadMoreLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(upcomingMobileReadMoreLnk.get(i));
				webDriverActions.waitForPageToLoad();
				webDriverActions.waitForSecond(2000);
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
				webDriverActions.waitForPageToLoad();
				webDriverActions.softHighlightElement(articleBreadCrumbDiv);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in "+currentPage);;
				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillElement(mobileFinderMoreNewsLnk, 10);
				webDriverActions.softClickJS(mobileFinderTabsLnk.get(1));
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+trendindAndRecommendedStoriesLnk.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyMobileTechTabsArticleNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(mobileTechTabsLnk, 10);
		if(mobileTechTabsLnk.size()>1)
		{
			webDriverActions.softScrollToElement(mobileTechTabsLnk.get(0));
			webDriverActions.softMouseHover(mobileTechTabsLnk.get(0));
			webDriverActions.waitForSecond(1000);
			for(int j =0 ; j<mobileTechTabsLnk.size() ; j++)
			{
				//			webDriverActions.softScrollToElement(photoTabsLnk.get(j));
				//			webDriverActions.softMouseHover(photoTabsLnk.get(j));
				webDriverActions.softHighlightElement(mobileTechTabsLnk.get(j));
				webDriverActions.softClickJS(mobileTechTabsLnk.get(j));
				webDriverActions.waitForSecond(2000);
				for(int i=0; i<mobileTechArticleLnk.size() ;i++)
				{
					webDriverActions.waitForSecond(1000);
					webDriverActions.softMouseHover(mobileTechArticleLnk.get(i));
					webDriverActions.softScrollToElement(mobileTechArticleLnk.get(i));
					String actual =	webDriverActions.getAttribute("href", mobileTechArticleLnk.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClick(mobileTechArticleLnk.get(i));
					webDriverActions.waitForSecond(1000);
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
					webDriverActions.waitForPageToLoad();
					webDriverActions.softHighlightElement(articleBreadCrumbDiv);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in "+currentPage);;
					// webDriverActions.navigateToUrl(homeUrl);
					if (currentPage.contains(expectedUrl)) {
						webDriverActions.navigateBack();
					}
					else {
						webDriverActions.navigateBack();
						webDriverActions.navigateBack();
					}	
					webDriverActions.waitForPageToLoad();
					webDriverActions.continuousScrollTillAllElement(mobileTechTabsLnk, 10);
					webDriverActions.softClickJS(mobileTechTabsLnk.get(j));
					webDriverActions.waitForSecond(2000);
				}
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");

	}

	public void verifyMobileTechTabsImageNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(mobileTechTabsLnk, 20);
		if(mobileTechTabsLnk.size()>1)
		{
			webDriverActions.softScrollToElement(mobileTechTabsLnk.get(0));
			webDriverActions.softMouseHover(mobileTechTabsLnk.get(0));
			webDriverActions.waitForSecond(2000);
			for(int j =0 ; j<mobileTechTabsLnk.size() ; j++)
			{
				//			webDriverActions.softScrollToElement(photoTabsLnk.get(j));
				//			webDriverActions.softMouseHover(photoTabsLnk.get(j));
				webDriverActions.softHighlightElement(mobileTechTabsLnk.get(j));
				webDriverActions.softClickJS(mobileTechTabsLnk.get(j));
				webDriverActions.waitForSecond(2000);
				for(int i=0; i<mobileTechImgLnk.size() ;i++)
				{
					webDriverActions.waitForSecond(1000);
					webDriverActions.softMouseHover(mobileTechImgLnk.get(i));
					webDriverActions.softScrollToElement(mobileTechImgLnk.get(i));
					String actual =	webDriverActions.getAttribute("src", mobileTechImgLnk.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClick(mobileTechImgLnk.get(i));
					webDriverActions.waitForSecond(2000);
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
					webDriverActions.waitForPageToLoad();
					webDriverActions.softHighlightElement(articleBreadCrumbDiv);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in "+currentPage);;
					// // webDriverActions.navigateToUrl(homeUrl);
					if (currentPage.contains(expectedUrl)) {
						webDriverActions.navigateBack();
					}
					else {
						webDriverActions.navigateBack();
						webDriverActions.navigateBack();
					}	
					webDriverActions.waitForPageToLoad();
					webDriverActions.softClickJS(mobileTechTabsLnk.get(j));
					webDriverActions.waitForSecond(2000);
				}
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");

	}

	public void verifyMobileTechReadMoreNavigation(String serveType)
	{
		verifyMoreNewsNavigation(serveType , mobileTechReadMoreLnk, articleBreadCrumbDiv);
	}

	public void verifyMobileTechTitleNavigation(String serveType)
	{
		verifyTitleNavigation(serveType , mobileTechTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyAjabGajabArticleNavigation(String serveType)
	{
		verifyArticleNavigation(serveType , ajabGajabArticleLnk, articleHeaderTxt);
	}

	public void verifyAjabGajabImageNavigation(String serveType) 
	{
		verifyImageNavigation(serveType , ajabGajabImgLnk, articleHeaderTxt);
	}

	public void verifyAjabGajabReadMoreNavigation(String serveType)
	{
		verifyMoreNewsNavigation(serveType , ajabGajabReadMoreLnk, articleBreadCrumbDiv);
	}

	public void verifyAjabGajabTitleNavigation(String serveType)
	{
		verifyTitleNavigation(serveType , ajabGajabTitleLnk, articleBreadCrumbDiv);
	}

	/**
	 * @author DanishR
	 * This method is used to click and naviagte to pradesh news and Rajya Lists
	 */
	public void pradeshNewsCityNames(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		String parent = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(stateCityNamesLnks.size()>0, "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());
		for (int i = 0; i < stateCityNamesLnks.size(); i++) {
			webDriverActions.mouseHoverAndClick(stateCityNamesLnks.get(i));
			webDriverActions.waitForPageToLoad();
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.continuousScrollTillElement(pradeshNews,GlobalVariables.sec60);
				webDriverActions.mouseHoverAndClick(stateCityNamesLnks.get(i));
				webDriverActions.waitForPageToLoad();
			}
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.contains("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl=betaUrl;
			}
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Possibly Element is Not Visible "+currentPageUrl);
			webDriverActions.navigateToUrl(parent);
			webDriverActions.waitForPageToLoad();
			webDriverActions.softScrollToElement(pradeshNews);
		}
	}

	/**
	 * @author DanishR
	 * This method is used to click and naviagte to pradesh news and Rajya Lists
	 */
	public void verifyPradeshNewsRajyaList(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(pradeshNews,GlobalVariables.sec60);
		webDriverActions.softClickJS(pradeshNews);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());
		webDriverActions.navigateBack();
		webDriverActions.waitForSecond(2000);
		webDriverActions.mouseHoverAndClick(rajyaChuneLnk);
		softAssert.assertTrue(rajyaChuneStateList.size()>0, "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());
		for (int i = 0; i < rajyaChuneStateList.size(); i++) {
			webDriverActions.softClickJS(rajyaChuneStateList.get(i));
			webDriverActions.waitForPageToLoad();
			String expectedPageUrl = webDriverActions.getCurrentPageUrl();
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.contains("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl=betaUrl;
			}
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Possibly Element is Not Visible "+currentPageUrl);
			if (expectedPageUrl.equalsIgnoreCase(currentPageUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			webDriverActions.waitForSecond(2000);
			webDriverActions.mouseHoverAndClick(rajyaChuneLnk);
		}
	}

	//	/**
	//	 * @author DanishR
	//	 * This method is used to click and navigate to pradesh news states and its articles
	//	 */
	//	public void pradeshNewsStatesWiseArticles(String serverType)
	//	{
	//		webDriverActions.waitForPageToLoad();
	//		webDriverActions.continuousScrollTillElement(pradeshNews,GlobalVariables.sec60);
	//		webDriverActions.softMouseHover(pradeshNews);
	//		softAssert.assertTrue(pradeshStatesLnks.size()>0, "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());
	//
	//		/*Below loop validates the Pradesh news articles Navigations*/
	//		for (int i = 0; i < pradeshStatesLnks.size();i++) {
	//			webDriverActions.softMouseHover(pradeshStatesLnks.get(i));
	//			webDriverActions.softHighlightElement(pradeshStatesLnks.get(i));
	//			webDriverActions.softClickJS(pradeshStatesLnks.get(i));
	//			webDriverActions.waitForSecond(2000);
	//
	//			for (int j = 0; j < stateArticleLnks.size();j++) {
	//				webDriverActions.softMouseHover(stateArticleLnks.get(j));
	//				webDriverActions.softHighlightElement(stateArticleLnks.get(j));
	//				webDriverActions.softClickJS(stateArticleLnks.get(j));
	//				webDriverActions.waitForSecond(2000);
	//				String currentPageUrl = webDriverActions.getCurrentPageUrl();
	//				String expectedUrl = webDriverActions.getCurrentPageUrl();
	//				if (serverType.contains("preProd")) {
	//					String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
	//					webDriverActions.navigateToUrl(betaUrl);
	//					currentPageUrl=betaUrl;
	//				}
	//				webDriverActions.softHighlightElement(articleBreadcrumb);
	//				webDriverActions.waitForSecond(2000);
	//				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Possibly Element is Not Visible "+currentPageUrl);
	//				if (currentPageUrl.contains(expectedUrl)) {
	//					webDriverActions.navigateBack();
	//				}
	//				else {
	//					webDriverActions.navigateBack();
	//					webDriverActions.navigateBack();
	//				}	
	//				webDriverActions.waitForSecond(2000);
	//				//				webDriverActions.softScrollToElement(pradeshNews);
	//				webDriverActions.softMouseHover(pradeshStatesLnks.get(i));
	//				webDriverActions.softClickJS(pradeshStatesLnks.get(i));
	//			}
	//		}
	//		softAssert.assertAll("Issues Found In Validating Pradesh News Articles Present on HomePage");
	//	}


	/**
	 * @author DanishR
	 * This method is used to click and navigate to pradesh news states and its articles
	 */
	public void pradeshNewsStatesWiseArticles(String serverType)
	{
		HomePageLinksValidation http = new HomePageLinksValidation(driver);

		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(pradeshStatesLnks.get(0));
		softAssert.assertTrue(pradeshStatesLnks.size()>0, "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());
		ArrayList<String> articleList = new ArrayList<>();
		webDriverActions.waitForElement(1000);

		for (int i = 0; i <pradeshStatesLnks.size() ;i++) {
			webDriverActions.softMouseHover(pradeshStatesLnks.get(i));
			webDriverActions.softHighlightElement(pradeshStatesLnks.get(i));
			webDriverActions.softClickJS(pradeshStatesLnks.get(i));
			webDriverActions.waitForSecond(2000);
			for (int j = 0; j < stateArticleLnks.size();j++) {
				String aticleLink = stateArticleLnks.get(j).getAttribute("href");
				if (serverType.equalsIgnoreCase("preProd")) {
					String betaUrl = genericUtility.replaceInUrl(aticleLink);	
					articleList.add(betaUrl);
				}
			}
			//			webDriverActions.softClickJS(kannadaSectionNextBtn);
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
	 * This method is used to click and navigate to pradesh news states and its articles
	 */
	public void pradeshNewsStatesArticleMoreNews(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(pradeshNews,GlobalVariables.sec60);
		webDriverActions.softMouseHover(pradeshNews);
		softAssert.assertTrue(pradeshStatesLnks.size()>0, "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());
		webDriverActions.waitForSecond(2000);
		webDriverActions.softMouseHover(pradeshNewsMoreLinks);
		webDriverActions.softHighlightElement(pradeshNewsMoreLinks);
		webDriverActions.softClickJS(pradeshNewsMoreLinks);
		String currentPageUrl = webDriverActions.getCurrentPageUrl();
		if (serverType.contains("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
			webDriverActions.navigateToUrl(betaUrl);
			currentPageUrl=betaUrl;
		}
		webDriverActions.softHighlightElement(articleBreadcrumb);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Possibly Element is Not Visible "+currentPageUrl);
		softAssert.assertAll("Issues Found In Validating Pradesh News Articles More News Present on HomePage");
	}
}

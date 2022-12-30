package com.news18.hindipages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.asserts.SoftAssert;

import com.news18.init.DriverUtility;
import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class DesktopHindiSanityLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	public SoftAssert softAssert = new SoftAssert();

	public DesktopHindiSanityLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

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
	@FindBy(xpath="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]/li/a")
	private List<WebElement> lineOneSectionEleList;

	/*Line One Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'container')]//ul[contains(@class,'nav_bar')]/li/a")
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
	@FindBy(xpath="(//div[contains(@class,'ftr_grid5 mrgl_auto')])//child::div//a")
	private List<WebElement> footerPopularCategoryLnks;

	/*Footer Popular Category Link Present on Hindi Desktop landing Page*/
	@FindBy(xpath="((//div[contains(@class,'ftr_grid5 mrgl_auto')])//span)[1]")
	private WebElement footerPopularCategorySection;

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
	@FindBy(xpath="(//div[contains(@class,'ftr_row')])[3]//child::div//child::div//a")
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

	/*list of sections present in Line One Section Bar present at the header of Homepage*/
	@FindBy(xpath ="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]/li/a")
	private List<WebElement> lineOneSectionELementLnk;

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
	@FindBy(xpath = "//div[contains(@class,'Minis_slider')]//child::div[contains(@class,'slick-slide')]//div[contains(@class,'imgBox')]//a")
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
	@FindBy(xpath = "//div//ul[contains(@class,'photogallerystories')]//a")
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
	@FindBy(xpath = "//div//ul[contains(@class,'global-sub-nav dflex')]//li//a[contains(@class,'jobsee')]")
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

	/*Live blog Headline*/
	@FindBy(xpath ="(//div[contains(@class,'hd_heading')]//following-sibling::ul//li//a[contains(@href,'live')])[1]")
	private List<WebElement> liveBlogHeadline;

	/*Live blog Headline*/
	@FindBy(xpath ="(//div[contains(@class,'hd_heading')]//following-sibling::ul//li//a[contains(@href,'live')]//img)[1]")
	private List<WebElement> liveBlogImage;

	/*Ad Link in priority panel*/
	@FindBy(xpath ="(//div[contains(@class,'topnews')]//div[contains(@class,'adunit')])[1]")
	private List<WebElement> AdLink;

	/*promoted content headline*/
	@FindBy(xpath ="//div[contains(@class,'ob-widget-section ob-first')]//div[contains(text(),'Promoted')]")
	private WebElement promotedContentHeadline;

	@FindBy(xpath ="(//div[contains(@class,'breadcum')]//following-sibling::h1)[2]")
	private WebElement secondArticleHeadline;

	@FindBy(xpath ="(//div[contains(@class,'single-tabs')]/div[contains(@class,'tab')]/a[contains(@class,'active')])//following-sibling::a[1]")
	private WebElement trendingTab;

	@FindBy(xpath ="(//div[contains(@class,'single-tabs')]/div[contains(@class,'tab')]/a[contains(@class,'active')])//following-sibling::a[2]")
	private WebElement upcomingTab;

	@FindBy(xpath ="//span[contains(text(),'__NEXT_DATA__')]")
	private WebElement newStackText;

	/*Videos link present on Homepage*/
	@FindBy(xpath ="//div[contains(@class,'video-gallery')]//div//a")
	private WebElement videosLnk;

	/*Homepage articles Link for news18 Hindi Page*/
	@FindBy(xpath ="//div[contains(@class,\"topnews-right\")]//ul//li/a[not(contains(@href,\"live\")) and contains(@href,\"/news/\")]")
	private WebElement homePageArticlesLnk;

	/*photo section Present in L1 navigation bar */
	@FindBy(xpath="//ul[contains(@class,'sub_navigation_ul')]//a[text()='फोटो']")
	private WebElement photoSectionLineTwoLnk;

	/*Homepage First article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//ul[contains(@class,'pht-tprgt')]//h2//a")
	private List<WebElement> photogalleryArticleLnk ;

	/*Homepage LiveBlog article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@id,'__next')]//a[contains(@href,'live-updates')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/* Video Section Article Link */
	@FindBy(xpath = "//div[contains(@class,'trading_news')]//li/a")
	private List<WebElement> videosArticleLnks;

	/*Topics Links articles present on Homepage*/
	@FindBy(xpath ="//a[contains(@href,'https://hindi.news18.com/tag/')]")
	private List<WebElement> topicslinks;

	@FindBy(xpath ="(//div//ul//li//div//iframe)[1]")
	private WebElement switchFrame;





	/**
	 * @author 
	 * This method is used to validate article navigation in home page
	 * @param section
	 * @param artList
	 */
	public void verifyArticlesNavigation(String serverType,WebElement section ,List<WebElement> artList, WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(videoSectionLnk);
		webDriverActions.continuousScrollTillElement(section, 20);
		webDriverActions.softMouseHover(section);
		if (artList.size()>0) {
			for(int i=0; i<1 ;i++)
			{
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				String actualUrl =	webDriverActions.getAttribute("href", artList.get(i));
				webDriverActions.softClickJS(artList.get(i));
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				String pageTitle = webDriverActions.getPageTitle();
				if (!pageTitle.contains("404")) {
					boolean status = genericUtility.compareUrlSub(currentPage, actualUrl);
					softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
					webDriverActions.softHighlightElement(element);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element,1) , "Unable to Display Element "+element +"in "+currentPage);
				}
				else {
					Logs.error(getClass(),"Page has issue in this url : "+currentPage);
					softAssert.fail("Page has issue in this url : "+currentPage);
				}
			}
		}
		else
		{
			Logs.error(getClass(),"Possibily element is not visible or size is "+ artList.size() +" "+ webDriverActions.getCurrentPageUrl());
			softAssert.fail("Possibily element is not visible or size is "+ artList.size()+" "+"in this url "+webDriverActions.getCurrentPageUrl());
		}
		softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation in home page
	 * @param section
	 * @param artList
	 */
	public void verifyArticlesNavigationNewTab(String serverType,WebElement section ,List<WebElement> artList, WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(videoSectionLnk);
		webDriverActions.continuousScrollTillElement(section, 20);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softMouseHover(section);
		if(artList.size()>0)
		{
			for(int i=0; i<1 ;i++)
			{
				String actualUrl =	webDriverActions.getAttribute("href", artList.get(i));
				Logs.info(getClass(), actualUrl);
				webDriverActions.navigateToNewTab(artList.get(i));
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForSecond(1000);
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				String pageTitle = webDriverActions.getPageTitle();
				if (!pageTitle.contains("404")) {
					boolean status = genericUtility.compareUrlSub(currentPage, actualUrl);
					softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
					webDriverActions.softHighlightElement(element);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element,1) , "Unable to Display Element "+element +"in "+currentPage);
				}
				else {
					Logs.error(getClass(),"Page has issue in this url : "+currentPage);
					softAssert.fail("Page has issue in this url : "+currentPage);
				}
			}
		}
		else
		{
			Logs.error(getClass(),"Possibily element is not visible or size is "+ artList.size() +" "+ webDriverActions.getCurrentPageUrl());
			softAssert.fail("Possibily element is not visible or size is "+ artList.size()+" "+"in this url "+webDriverActions.getCurrentPageUrl());
		}
		softAssert.assertAll("Issue Found in HomePage Body Article Navigation"+webDriverActions.getCurrentPageUrl());	
	}

	//------video

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Video Widget Article
	 */
	public void verifyVideoWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,videoSectionLnk,videoSectionArticleLnk, videoBreadcrumb);
	}




	//------Lifestyle


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget Article
	 */
	public void verifyLifeWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,lifestyleSectionLnk,lifestyleSectionArticleLnk, articleBreadCrumbDiv);
	}



	//----Dharm

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget Article
	 */
	public void verifyDharmWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,dharmSectionLnk,dharmSectionArticleLnk, articleBreadCrumbDiv);
	}

	//----Nation

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget Article
	 */
	public void verifyNationWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,nationSectionLnk,nationSectionArticleLnk, articleBreadCrumbDiv);
	}

	//-----blog-------------------

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Blog Widget Article
	 */
	public void verifyBlogWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,blogSectionLnk,journalistArticleLnk, blogBreadcrumb);
	}

	//----World

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget Article
	 */
	public void verifyWorldWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,worldSectionLnk,worldSectionArticleLnk, articleBreadCrumbDiv);
	}


	//--------------
	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation in home page
	 * @param section
	 * @param artList
	 */
	public void verifyArticlesNavigationBelowMobileTech(String serverType,WebElement section ,List<WebElement> artList, WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(videoSectionLnk);
		webDriverActions.continuousScrollTillElement(section, 20);
		webDriverActions.softMouseHover(section);
		if(artList.size()>0)
		{
			for(int i=0; i<1 ;i++)
			{
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				String actualUrl =	webDriverActions.getAttribute("href", artList.get(i));
				Logs.info(getClass(), actualUrl);
				webDriverActions.softClickJS(artList.get(i));
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				String pageTitle = webDriverActions.getPageTitle();
				if (!pageTitle.contains("404")) {
					boolean status = genericUtility.compareUrlSub(currentPage, actualUrl);
					softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
				}
				else {
					Logs.error(getClass(),"Page has issue in this url : "+currentPage);
					softAssert.fail("Page has issue in this url : "+currentPage);
				}
			}
		}
		else
		{
			Logs.error(getClass(),"Possibily element is not visible or size is "+ artList.size() +" "+ webDriverActions.getCurrentPageUrl());
			softAssert.fail("Possibily element is not visible or size is "+ artList.size()+" "+"in this url "+webDriverActions.getCurrentPageUrl());
		}
		softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Knowledge Widget Article
	 */
	public void verifyKnowledgeWidgetArticle(String serverType) {
		verifyArticlesNavigationBelowMobileTech(serverType,knowledgeSectionLnk,knowledgeSectionArticleLnk, articleBreadCrumbDiv);
	}

	// ------------------------- Vipin Business Logic  ---------------------------------------- //

	/**
	 * @param artList
	 * @param element
	 * @author 
	 * This method is used to Verify All The Widgets Article Text Navigation  
	 */
	public void verifyArticleNavigation(String serverType , List<WebElement> artList , WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(artList, 15);
		if(artList.size()>0)
		{
			webDriverActions.softScrollToElement(artList.get(0));
			webDriverActions.softMouseHover(artList.get(0));
			for(int i=0; i<1 ;i++)
			{
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				String actual =	webDriverActions.getAttribute("href", artList.get(i));
				webDriverActions.softClickJS(artList.get(i));
				String currentPage =webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				String pageTitle = webDriverActions.getPageTitle();
				if (!pageTitle.contains("404")) {
					boolean status = genericUtility.compareUrlSub(currentPage, actual);
					softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
					webDriverActions.softHighlightElement(element);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element, 1) , "Unable to Display Element in "+currentPage);;
				}
				else {
					Logs.error(getClass(),"Page has issue in this url : "+currentPage);
					softAssert.fail("Page has issue in this url : "+currentPage);
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
	 * The below method is used validate count of Articles and Ad present in Priority Panel on Home Page
	 */
	public void verifyPriorityPanelArticleCount() {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		Logs.info(getClass(), priorityPanelArticleLnk.size()+ " Articles present in Priority panel");
		softAssert.assertTrue(priorityPanelArticleLnk.size()==14, "Articles count do not match the pre condition and Articles count is : "+priorityPanelArticleLnk.size());
		webDriverActions.scrollDown();
		webDriverActions.scrollDown();
		webDriverActions.waitForSecond(2000);
		DriverUtility.getDriver().switchTo().frame(switchFrame);
		int adSize = AdLink.size();
		Logs.info(getClass(), adSize+ " Ad present in Priority panel");
		softAssert.assertTrue(adSize==1, "Possibily no Ad is present and Ad count is : "+AdLink.size());
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyPriorityArticleNavigation(String serverType , List<WebElement> artList , WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		if(artList.size()>0)
		{
			webDriverActions.softMouseHover(artList.get(0));
			for(int i=0; i<artList.size() ;i++)
			{
				webDriverActions.softMouseHover(artList.get(i));
				String actual =	webDriverActions.getAttribute("href", artList.get(i));
				webDriverActions.softClickJS(artList.get(i));
				String currentPage =webDriverActions.getCurrentPageUrl();
				String expectedUrl = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				String pageTitle = webDriverActions.getPageTitle();
				if (!pageTitle.contains("404")) {
					boolean status = genericUtility.compareUrlSub(currentPage, actual);
					softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
					webDriverActions.softHighlightElement(element);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element, 1) , "Unable to Display Element in "+currentPage);;
				}
				else {
					Logs.error(getClass(),"Page has issue in this url : "+currentPage);
					softAssert.fail("Page has issue in this url : "+currentPage);
				}
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
	public void verifyRelatedNewsArticleNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
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
				webDriverActions.softClickJS(activeRelatedNewsLnk.get(j));
				webDriverActions.waitForSecond(2000);
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
				webDriverActions.softClickJS(relatedNewsLnk.get(i));
				webDriverActions.waitForSecond(2000);
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");

	}


	public void verifyNews18HindiPlusArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, news18HindiPlusArticleLnk, articleHeaderTxt);
	}

	public void verfyLiveBlogHeadline(String serverType)
	{
		verfyLiveBlog(serverType, liveBlogHeadline, articleBreadcrumb);
	}




	/**
	 *@author 
	 * This method is used to click on LiveBlog Article of Hindi Home Page 
	 */

	public void verfyLiveBlog(String serverType, List<WebElement> image,WebElement breadcrum)
	{
		SoftAssert softAssert = new SoftAssert();
		ArrayList<String>list=new ArrayList<>();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		if(liveBlogHeadline.size()>0)
		{
			String actual = webDriverActions.getAttribute("href", liveBlogHeadline.get(0));
			webDriverActions.softClickJS(liveBlogHeadline.get(0));
			String currentPage = webDriverActions.getCurrentPageUrl();
			if (serverType.contains("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				currentPage=betaUrl;
			}
			String pageTitle = webDriverActions.getPageTitle();
			if (!pageTitle.contains("404")) {
				list.add(currentPage);
				boolean status = genericUtility.compareUrlSub(currentPage, actual);
				softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
			}
			else {
				Logs.error(getClass(),"Page has issue in this url : "+currentPage);
				softAssert.fail("Page has issue in this url : "+currentPage);
			}
		}
		else
		{
			Logs.error(getClass(), "Exception in Live blog in HomePage Link");
			throw new SkipException("Unable to locate Live Blog Article element possibly no Live Blog Present "+webDriverActions.getCurrentPageUrl());	
		}
	}


	public void verifyWebstoriesArticleNavigation(String serverType)
	{

		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(webstoriesArticleLnk, 10);
		if(webstoriesArticleLnk.size()>0)
		{
			for(int i=0; i<1 ;i++)
			{
				webDriverActions.softMouseHover(activeWebstoriesArticleLnk); 
				webDriverActions.softMouseHover(webstoriesArticleLnk.get(i)); 
				String actualUrl =	webDriverActions.getAttribute("href", webstoriesArticleLnk.get(i));
				webDriverActions.mouseHoverAndClick(webstoriesArticleLnk.get(i));
				webDriverActions.switchToNewWindow(); 
				String currentPage =webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), currentPage);
				if (serverType.equalsIgnoreCase("preProd")) { 
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				String pageTitle = webDriverActions.getPageTitle();
				if (!pageTitle.contains("404")) {
					boolean status = genericUtility.compareUrlSub(currentPage, actualUrl);
					softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
					webDriverActions.softHighlightElement(articleBreadcrumb);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb, 1) , "Unable to Display Element in "+currentPage);;
				}
				else {
					Logs.error(getClass(),"Page has issue in this url : "+currentPage);
					softAssert.fail("Page has issue in this url : "+currentPage);
				}
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+webstoriesArticleLnk.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyCricketArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , cricketArticleLnk, articleHeaderTxt);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Crime Widget Article
	 */
	public void verifyCrimeWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,crimeSectionLnk,crimeSectionArticleLnk, articleBreadcrumb);
	}

	public void verifyLatestMobileNewsArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , latestMobileNewsArticleLnk, articleHeaderTxt);
	}

	public void verifyTrendingAndRecommendedStoriesNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softScrollToElement(bodyKhelTitleLnk);
		webDriverActions.continuousScrollTillElement(upcomingTab, 3);
		webDriverActions.softClickJS(upcomingTab);
		for (int i = 0; i < 1; i++) {
			webDriverActions.softMouseHover(upcomingMobileStoriesLnk.get(i));
			String actualUrl =	webDriverActions.getAttribute("href", upcomingMobileStoriesLnk.get(i));
			webDriverActions.softClickJS(upcomingMobileStoriesLnk.get(i));
			String currentPage =webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			String pageTitle = webDriverActions.getPageTitle();
			if (!pageTitle.contains("404")) {
				boolean status = genericUtility.compareUrlSub(currentPage, actualUrl);
				softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
				webDriverActions.softHighlightElement(articleBreadcrumb);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb, 1) , "Unable to Display Element in "+currentPage);;
			}
			else {
				Logs.error(getClass(),"Page has issue in this url : "+currentPage);
				softAssert.fail("Page has issue in this url : "+currentPage);
			}
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyUpcomingMobileStoriesNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softScrollToElement(bodyKhelTitleLnk);
		webDriverActions.continuousScrollTillElement(trendingTab, 3);
		webDriverActions.softClickJS(trendingTab);
		for (int i = 0; i < 1; i++) {
			webDriverActions.waitForSecond(1000);
			webDriverActions.softMouseHover(trendindAndRecommendedStoriesLnk.get(i));
			String actualUrl =	webDriverActions.getAttribute("href", trendindAndRecommendedStoriesLnk.get(i));
			webDriverActions.softClickJS(trendindAndRecommendedStoriesLnk.get(i));
			String currentPage =webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			String pageTitle = webDriverActions.getPageTitle();
			if (!pageTitle.contains("404")) {
				boolean status = genericUtility.compareUrlSub(currentPage, actualUrl);
				softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
				webDriverActions.softHighlightElement(articleBreadcrumb);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb, 1) , "Unable to Display Element in "+currentPage);;
			}
			else {
				Logs.error(getClass(),"Page has issue in this url : "+currentPage);
				softAssert.fail("Page has issue in this url : "+currentPage);
			}
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyMobileBrandsNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , mobileBrandsLnk, articleBreadCrumbDiv);
	}

	public void verifyAjabGajabArticleNavigation(String serveType)
	{
		verifyArticleNavigation(serveType , ajabGajabArticleLnk, articleHeaderTxt);
	}

	public void verifyBodyKhelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , bodySportsArticleLnk, articleHeaderTxt);
	}
	public void verifyBollywoodArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , bollywoodArticleLnk, articleHeaderTxt);
	}
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Career Widget Article
	 */
	public void verifyCareerWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,careerSectionLnk,careerSectionArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyLiteratureArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , literatureArticleLnk, articleBreadCrumbDiv);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget Article
	 */
	public void verifyFooterSportWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,footerSportSectionLnk,footerSportSectionArticleLnk, articleBreadcrumb);
	}

	public void verifyMobileTechTabsArticleNavigation(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softScrollToElement(mobileTechTitleLnk);
		if (mobileTechTabsLnk.size()>0) {

			for (int j = 1; j < 3; j++) {
				webDriverActions.softMouseHover(mobileTechTabsLnk.get(j));
				webDriverActions.softHighlightElement(mobileTechTabsLnk.get(j));
				webDriverActions.softClickJS(mobileTechTabsLnk.get(j));
				for (int i = 0; i < 1; i++) {
					webDriverActions.softMouseHover(mobileTechArticleLnk.get(i));
					webDriverActions.waitForElementVisibility(mobileTechArticleLnk.get(i), 2);
					webDriverActions.softHighlightElement(mobileTechArticleLnk.get(i));
					String actual =	webDriverActions.getAttribute("href", mobileTechArticleLnk.get(i));
					webDriverActions.softClickJS(mobileTechArticleLnk.get(i));
					String currentPage =webDriverActions.getCurrentPageUrl();
					String expected =webDriverActions.getCurrentPageUrl();
					if (serverType.contains("preProd") && !currentPage.contains("//beta")) {
						String betaUrl = genericUtility.replaceInUrl(currentPage);
						currentPage=betaUrl;
					}
					String pageTitle = webDriverActions.getPageTitle();
					if (!pageTitle.contains("404")) {
						boolean status = genericUtility.compareUrlSub(currentPage, actual);
						softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
					}
					else {
						Logs.error(getClass(),"Page has issue in this url : "+currentPage);
						softAssert.fail("Page has issue in this url : "+currentPage);
					}
					if (currentPage.contains(expected)) {
						webDriverActions.navigateBack();
					}
					else {
						webDriverActions.navigateBack();
						webDriverActions.navigateBack();
					}	
				}
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+mobileTechTabsLnk.size());
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyMoneyTabsArticleNavigation(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softScrollToElement(moneyTabsLnk.get(0));
		if (moneyTabsLnk.size()>0) {

			for (int j = 1; j < 3; j++) {
				webDriverActions.softMouseHover(moneyTabsLnk.get(j));
				webDriverActions.softHighlightElement(moneyTabsLnk.get(j));
				webDriverActions.softClickJS(moneyTabsLnk.get(j));
				for (int i = 0; i < 1; i++) {
					webDriverActions.softMouseHover(moneyArticleLnk.get(i));
					webDriverActions.waitForElementVisibility(moneyArticleLnk.get(i), 2);
					webDriverActions.softHighlightElement(moneyArticleLnk.get(i));
					String actual =	webDriverActions.getAttribute("href", moneyArticleLnk.get(i));
					webDriverActions.softClickJS(moneyArticleLnk.get(i));
					String currentPage =webDriverActions.getCurrentPageUrl();
					webDriverActions.navigateBack();
					webDriverActions.clickJS(moneyTabsLnk.get(j));
					if (serverType.contains("preProd") && !currentPage.contains("//beta")) {
						String betaUrl = genericUtility.replaceInUrl(currentPage);
						currentPage=betaUrl;
					}
					String pageTitle = webDriverActions.getPageTitle();
					if (!pageTitle.contains("404")) {
						boolean status = genericUtility.compareUrlSub(currentPage, actual);
						softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
					}
					else {
						Logs.error(getClass(),"Page has issue in this url : "+currentPage);
						softAssert.fail("Page has issue in this url : "+currentPage);
					}
				}
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+moneyTabsLnk.size());
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}


	public void verifyPhotoTabsArticleNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(photoTabsLnk, 10);
		if(photoTabsLnk.size()>1)
		{
			webDriverActions.softScrollToElement(photoTabsLnk.get(0));
			webDriverActions.softMouseHover(photoTabsLnk.get(0));
			for(int j =0 ; j<2 ; j++)
			{
				webDriverActions.continuousScrollTillAllElement(photoTabsLnk, 10);
				webDriverActions.softHighlightElement(photoTabsLnk.get(j));
				webDriverActions.softClickJS(photoTabsLnk.get(j));
				for(int i=0; i<1 ;i++)
				{
					webDriverActions.continuousScrollTillAllElement(photoArticleLnk, 10);
					webDriverActions.softMouseHover(photoArticleLnk.get(i));
					webDriverActions.softScrollToElement(photoArticleLnk.get(i));
					String actual =	webDriverActions.getAttribute("href", photoArticleLnk.get(i));
					webDriverActions.softClickJS(photoArticleLnk.get(i));
					String currentPage =webDriverActions.getCurrentPageUrl();
					String expectedUrl = webDriverActions.getCurrentPageUrl();
					if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
						String betaUrl = genericUtility.replaceInUrl(currentPage);
						webDriverActions.navigateToUrl(betaUrl);
						currentPage=betaUrl;
					}
					String pageTitle = webDriverActions.getPageTitle();
					if (!pageTitle.contains("404")) {
						boolean status = genericUtility.compareUrlSub(currentPage, actual);
						softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
						webDriverActions.softHighlightElement(articleBreadCrumbDiv);
						softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv, 1) , "Unable to Display Element in "+currentPage);;
						if (currentPage.contains(expectedUrl)) {
							webDriverActions.navigateBack();
						}
						else {
							webDriverActions.navigateBack();
							webDriverActions.navigateBack();
						}	
						webDriverActions.continuousScrollTillAllElement(photoTabsLnk, 10);
						webDriverActions.softClickJS(photoTabsLnk.get(j));
					}
					else {
						Logs.error(getClass(),"Page has issue in this url : "+currentPage);
						softAssert.fail("Page has issue in this url : "+currentPage);
					}
				}
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+photoTabsLnk.size());
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}


	/**
	 * @author DanishR
	 * This method is used to click and naviagte to pradesh news and Rajya Lists
	 */
	public void pradeshNewsCityNames(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		softAssert.assertTrue(stateCityNamesLnks.size()>0, "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());
		for (int i = 0; i <1; i++) {
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
			if (serverType.equalsIgnoreCase("preProd")&&!currentPageUrl.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl=betaUrl;
			}
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Possibly Element is Not Visible "+currentPageUrl);

		}
	}
	/**
	 * @author DanishR
	 * This method is used to click and navigate to pradesh news states and its articles
	 */
	public void pradeshNewsStatesWiseArticles(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softScrollToElement(cricketTitleLnk);
		webDriverActions.continuousScrollTillAllElement(pradeshStatesLnks, 10);
		if(pradeshStatesLnks.size()>0)
		{
			webDriverActions.softScrollToElement(pradeshStatesLnks.get(0));
			webDriverActions.softMouseHover(pradeshStatesLnks.get(0));
			for(int j =0 ; j<2 ; j++)
			{
				webDriverActions.softScrollToElement(cricketTitleLnk);
				webDriverActions.continuousScrollTillAllElement(pradeshStatesLnks, 10);
				webDriverActions.softHighlightElement(pradeshStatesLnks.get(j));
				webDriverActions.softClickJS(pradeshStatesLnks.get(j));
				for(int i=0; i<1 ;i++)
				{
					webDriverActions.softScrollToElement(cricketTitleLnk);
					webDriverActions.continuousScrollTillAllElement(stateArticleLnks, 10);
					webDriverActions.softMouseHover(stateArticleLnks.get(i));
					webDriverActions.softScrollToElement(stateArticleLnks.get(i));
					String actual =	webDriverActions.getAttribute("href", stateArticleLnks.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClickJS(stateArticleLnks.get(i));
					String currentPage =webDriverActions.getCurrentPageUrl();
					Logs.info(getClass(), currentPage);
					String expectedUrl = webDriverActions.getCurrentPageUrl();
					if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
						String betaUrl = genericUtility.replaceInUrl(currentPage);
						webDriverActions.navigateToUrl(betaUrl);
						currentPage=betaUrl;
					}
					else 
					{
						currentPage = webDriverActions.getCurrentPageUrl();
					}
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
					webDriverActions.softScrollToElement(cricketTitleLnk);
					webDriverActions.continuousScrollTillAllElement(pradeshStatesLnks, 10);
					webDriverActions.softClickJS(pradeshStatesLnks.get(j));
				}
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyPriorityPanelArticleNavigation(String serverType)
	{
		verifyPriorityArticleNavigation(serverType , priorityPanelArticleLnk, articleHeaderTxt);
	}
	public void verifyPriorityPanelImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType ,priorityPanelImgLnk, articleHeaderTxt);
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
		webDriverActions.waitForElement(1000);
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		if(imgList.size()>1)
		{
			webDriverActions.continuousScrollTillAllElement(imgList, 20);
			webDriverActions.softMouseHover(imgList.get(0));
			for(int i=0; i<1 ;i++)
			{
				webDriverActions.continuousScrollTillAllElement(imgList, 20);
				webDriverActions.softMouseHover(imgList.get(i));
				webDriverActions.softClickJS(imgList.get(i));
				String currentPage =webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), currentPage);
				if (serverType.equalsIgnoreCase("preProd")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				webDriverActions.softHighlightElement(element);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) ,  "Unable to Display Element in "+currentPage);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+imgList.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyBollywoodTabsArticleNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		// // String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(bollywoodTabsLnk, 10);
		if(bollywoodTabsLnk.size()>1)
		{
			webDriverActions.softScrollToElement(bollywoodTabsLnk.get(0));
			webDriverActions.softMouseHover(bollywoodTabsLnk.get(0));
			for(int j =0 ; j<2 ; j++)
			{
				webDriverActions.continuousScrollTillAllElement(bollywoodTabsLnk, 10);
				webDriverActions.softHighlightElement(bollywoodTabsLnk.get(j));
				webDriverActions.softClickJS(bollywoodTabsLnk.get(j));
				for(int i=0; i<1 ;i++)
				{
					webDriverActions.continuousScrollTillAllElement(bollywoodArticleLnk, 10);
					webDriverActions.softMouseHover(bollywoodArticleLnk.get(i));
					webDriverActions.softScrollToElement(bollywoodArticleLnk.get(i));
					String actual =	webDriverActions.getAttribute("href", bollywoodArticleLnk.get(i));
					webDriverActions.softClickJS(bollywoodArticleLnk.get(i));
					String currentPage =webDriverActions.getCurrentPageUrl();
					String expectedUrl = webDriverActions.getCurrentPageUrl();
					if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
						String betaUrl = genericUtility.replaceInUrl(currentPage);
						webDriverActions.navigateToUrl(betaUrl);
						currentPage=betaUrl;
					}
					String pageTitle = webDriverActions.getPageTitle();
					if (!pageTitle.contains("404")) {
						boolean status = genericUtility.compareUrlSub(currentPage, actual);
						softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
						webDriverActions.softHighlightElement(articleBreadcrumb);
						if (currentPage.contains(expectedUrl)) {
							webDriverActions.navigateBack();
						}
						else {
							webDriverActions.navigateBack();
							webDriverActions.navigateBack();
						}	
					}
					else {
						Logs.error(getClass(),"Page has issue in this url : "+currentPage);
						softAssert.fail("Page has issue in this url : "+currentPage);
					}
					webDriverActions.continuousScrollTillAllElement(bollywoodTabsLnk, 10);
					webDriverActions.softClickJS(bollywoodTabsLnk.get(j));
				}
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+bollywoodTabsLnk.size());
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyNews18MinisArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , news18MinisArticleLnk, articleBreadCrumbDiv);
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
		webDriverActions.softHighlightElement(footerLanguageSitesLnk);
		String pageURL = webDriverActions.getPageTitle();
		for(int i=0;i<1;i++)
		{

			String expected = webDriverActions.getAttribute("href", footerLanguageSitesLnks.get(i));
			Logs.info(getClass(), expected);
			String title = webDriverActions.getAttribute("target", footerLanguageSitesLnks.get(i));
			text=webDriverActions.getTextFromElement(footerLanguageSitesLnks.get(i));
			if(text.contains(" "))
			{
				String[] s = text.split(" ");
				text=s[0].toLowerCase();
			}
			webDriverActions.softClickJS(footerLanguageSitesLnks.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				webDriverActions.waitForSecond(1000);
			}
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
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
			String actual = webDriverActions.getCurrentPageUrl();
			softAssert.assertTrue((expected.contains(actual) || expected.contains(text)), "Failed To Navigate for This URL "+actual);
			webDriverActions.waitForSecond(2000);
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
	 * This method used to verify Trending Topics present on Footer of Hindi Desktop Landing Page.
	 */
	public void verfyFooterTrendingTopicSection(String server)
	{
		verfyFooterSection(footerTrendingTopicLnks, footerTrendingTopicLnk,server);
	}

	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Sections present on Footer of Hindi Desktop Landing Page.
	 */
	public void verfyFooterSection(List<WebElement> footerLinks,WebElement footerSection, String server)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		webDriverActions.softHighlightElement(footerSection);
		for(int i=0;i<1;i++)
		{
			webDriverActions.softMouseHover(footerSection);
			String actual = webDriverActions.getAttribute("href", footerLinks.get(i));
			webDriverActions.clickJS(footerLinks.get(i));
			webDriverActions.switchToNewWindow();
			String currentPageUrl=webDriverActions.getCurrentPageUrl();
			String pageTitle = webDriverActions.getPageTitle();
			if (!pageTitle.contains("404")) {
				softAssert.assertTrue(actual.contains(currentPageUrl) , "Unable to Display Element in "+currentPageUrl);;
			}
			else {
				Logs.error(getClass(),"Page has issue in this url : "+currentPageUrl);
				softAssert.fail("Page has issue in this url : "+currentPageUrl);
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
		String actual = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Possibly Element Is Not Visible For This URL "+actual);
		softAssert.assertAll("Issues Found In Validating Footer Live TV Section");
	}

	/**
	 * @author SanjeebKumarPati
	 * This method used to verify News 18 Sites Section present on Footer of Hindi Desktop Landing Page.
	 */
	public void verfyFooterNewsSitesSection()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		if(footerNews18GroupsLnks.size()>0) {
			for(int i=0;i<1;i++)
			{
				String actual = webDriverActions.getAttribute("href", footerNews18GroupsLnks.get(i));
				webDriverActions.softClickJS(footerNews18GroupsLnks.get(i));
				webDriverActions.switchToNewWindow();
				String currentPageUrl=webDriverActions.getCurrentPageUrl();
				String pageTitle = webDriverActions.getPageTitle();
				if (!pageTitle.contains("404")) {
					softAssert.assertTrue(actual.contains(currentPageUrl) , "Unable to Display Element in "+currentPageUrl);;
				}
				else {
					Logs.error(getClass(),"Page has issue in this url : "+currentPageUrl);
					softAssert.fail("Page has issue in this url : "+currentPageUrl);
				}
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+photoTabsLnk.size());
		}
		softAssert.assertAll("Issues Found In Validating Footer Section");
	}
	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Popular Category Section present on Footer of Hindi Desktop Landing Page.
	 */
	public void verfyFooterPopularCategorySection(String server)
	{
		verfyFooterSection(footerPopularCategoryLnks, footerPopularCategorySection,server);	
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
	 * This method is used to validate 
	 */
	public void verifyInfiniteScroll(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		if(priorityPanelArticleLnk.size()>0)
		{
			webDriverActions.softMouseHover(priorityPanelArticleLnk.get(0));
			for(int i=0; i<1;i++)
			{
				webDriverActions.softMouseHover(priorityPanelArticleLnk.get(i));
				String actual =	webDriverActions.getAttribute("href", priorityPanelArticleLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(priorityPanelArticleLnk.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(priorityPanelArticleLnk.get(i));
					actual = webDriverActions.getAttribute("href", priorityPanelArticleLnk.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClickJS(priorityPanelArticleLnk.get(i));
				}
				String currentPage =webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.waitForPageToLoad();
				webDriverActions.mobileScroll(6);
				webDriverActions.continuousScrollTillElement(promotedContentHeadline, 5);
				webDriverActions.softWaitForElementVisibility(secondArticleHeadline, 3);
				webDriverActions.softHighlightElement(secondArticleHeadline);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(secondArticleHeadline) , "Unable to Display Element in "+currentPage);
			}
			softAssert.assertAll("Issues Found In Validating Infinite Scroll");
		}
	}

	/**
	 * This method is used to validate 
	 */
	public void verifyHomepageNewStack() {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.viewPageSource();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(newStackText) , "Unable to Display Element in "+webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues Found");
	}

	/**
	 * This method is used to validate 
	 */
	public void verifyTagPageNewStack() {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		webDriverActions.softClickJS(footerTrendingTopicLnks.get(1));
		webDriverActions.switchToNewWindow();
		webDriverActions.viewPageSource();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(newStackText) , "Unable to Display Element in "+webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues Found");
	}

	/**
	 * This method is used to validate 
	 */
	public void verifyPhotogalleryPageNewStack() {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		webDriverActions.softClickJS(cricketArticleLnk.get(1));
		webDriverActions.switchToNewWindow();
		webDriverActions.viewPageSource();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(newStackText) , "Unable to Display Element in "+webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues Found");
	}

	/**
	 * This method is used to validate 
	 */
	public void verifyVideoPageNewStack() {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		webDriverActions.softClickJS(videoSectionArticleLnk.get(1));
		webDriverActions.switchToNewWindow();
		webDriverActions.viewPageSource();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(newStackText) , "Unable to Display Element in "+webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues Found");	
	}

	/**
	 * @author abhishek
	 * This method is used to click on First Article of Hindi Home Page 
	 */
	public void clickOnFirstArticleHomePage() {
		SoftAssert softAssrt = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		softAssrt.assertTrue(webDriverActions.softIsElementDisplayed(homePageArticlesLnk), "Possibily element is not displayed "+webDriverActions.getCurrentPageUrl());
		webDriverActions.softWaitForElementVisibility(homePageArticlesLnk, 3);
		webDriverActions.softClickJS(homePageArticlesLnk);

	}

	/**
	 * @author Sanjeeb
	 * This method used to click on photos section of Hindi Homepage
	 */
	public void clickOnPhotoSection()
	{
		SoftAssert softAssrt = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softClickJS(photoSectionLineTwoLnk);
		webDriverActions.waitForAllElementsVisible(photogalleryArticleLnk, GlobalVariables.sec30);
		softAssrt.assertTrue(webDriverActions.softIsElementDisplayed(photogalleryArticleLnk.get(0)), "Possibily element is not displayed "+webDriverActions.getCurrentPageUrl());
		webDriverActions.click(photogalleryArticleLnk.get(0));
	}

	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of English Home Page 
	 */
	public void clickOnLiveBlogArticleHomePage(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		ArrayList<String>list=new ArrayList<>();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		if(liveBlogHeadline.size()>0)
		{
			String actual = webDriverActions.getAttribute("href", liveBlogHeadline.get(0));
			webDriverActions.softClickJS(liveBlogHeadline.get(0));
			String currentPage = webDriverActions.getCurrentPageUrl();
			if (serverType.contains("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				currentPage=betaUrl;
			}
			String pageTitle = webDriverActions.getPageTitle();
			if (!pageTitle.contains("404")) {
				list.add(currentPage);
				boolean status = genericUtility.compareUrlSub(currentPage, actual);
				softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
				webDriverActions.softHighlightElement(articleBreadcrumb);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb) , "Unable to Display Element in"+currentPage);
			}
			else {
				Logs.error(getClass(),"Page has issue in this url : "+currentPage);
				softAssert.fail("Page has issue in this url : "+currentPage);
			}
		}
		else
		{
			Logs.error(getClass(), "Exception in Live blog in HomePage Link");
			throw new SkipException("Unable to locate Live Blog Article element possibly no Live Blog Present "+webDriverActions.getCurrentPageUrl());	
		}

	}

	/**
	 * @author Sanjeeb
	 * This method is used to click on Videos Section news 18 Hindi Home Page 
	 */
	public void navigateToVideosSection() {
		SoftAssert softAssrt = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillElement(videosLnk, GlobalVariables.sec60);
		webDriverActions.softClickJS(videosLnk);
		webDriverActions.waitForElementVisibility(videosArticleLnks.get(0), 3);
		softAssrt.assertTrue(webDriverActions.softIsElementDisplayed(videosArticleLnks.get(0)), "Possibily element is not displayed "+webDriverActions.getCurrentPageUrl());
		webDriverActions.click(videosArticleLnks.get(0));
	}

	/**
	 * @author DanishR
	 * This method used to validate Topics Links on Home Page
	 */
	public void topicsLinks(String serverType) {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		for (int i = 0; i < 1; i++) {
			webDriverActions.scrollToLast();
			webDriverActions.softWaitForElementVisibility(topicslinks.get(i), 3);
			String link = webDriverActions.getAttribute("target", topicslinks.get(i));
			if (link.contains("_blank")) {
				webDriverActions.navigateToNewTab(topicslinks.get(i));
				webDriverActions.switchToNewWindow();
			}
			else {
				webDriverActions.softClickJS(topicslinks.get(i));
			}

			String currentPage = webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			webDriverActions.softWaitForElementVisibility(articleBreadcrumb, 3);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb)," Possibily element not visible "+currentPage);
		}
		softAssert.assertAll("Issues found in topics page : ");
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify elements Present In Line One Section By Clicking On It.
	 */
	public void verfyLineOneSearchIconAndWatchTv()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		//validating Search Icon
		webDriverActions.softHighlightElement(searchIconLnk);
		webDriverActions.softClickJS(searchIconLnk);
		webDriverActions.softWaitForElementVisibility(searchBoxBtn, 3);
		webDriverActions.inputText(searchBoxBtn, "News 18");
		webDriverActions.softHighlightElement(insideSearchIcon);
		webDriverActions.softClick(insideSearchIcon);
		webDriverActions.softWaitForElementVisibility(closeBtn, 3);
		webDriverActions.softHighlightElement(closeBtn);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(closeBtn), "Posibly Search Box is not displayed");
		webDriverActions.softClick(closeBtn);
		webDriverActions.softWaitForElementVisibility(liveTVLnk, 3);
		webDriverActions.softClickJS(liveTVLnk);
		webDriverActions.softWaitForElementVisibility(articleBreadcrumb, 3);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Posibly Search Box is not displayed");
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Line Two Section.
	 */
	public void verfyLineOneSection(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		if(lineTwoSectionEleList.size()>0) {
			for (int i = 2; i < lineOneSectionArticleList.size(); i++) {
				webDriverActions.mouseHover(lineOneSectionArticleList.get(i));
				webDriverActions.softHighlightElement(lineOneSectionArticleList.get(i));
				String actual = webDriverActions.getAttribute("href", lineOneSectionArticleList.get(i));
				webDriverActions.softClickJS(lineOneSectionArticleList.get(i));
				String currentPage =webDriverActions.getCurrentPageUrl();
				if (serverType.contains("preProd") && !currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					currentPage=betaUrl;
				}
				webDriverActions.navigateBack();
				String pageTitle = webDriverActions.getPageTitle();
				if (!pageTitle.contains("404")) {
					boolean status = genericUtility.compareUrlSub(currentPage, actual);
					softAssert.assertTrue(actual.contains(currentPage), "Possibly Url mismatch"+currentPage);
				}
				else {
					Logs.error(getClass(),"Page has issue in this url : "+currentPage);
					softAssert.fail("Page has issue in this url : "+currentPage);
				}
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+photoTabsLnk.size());
		}
		softAssert.assertAll("Issues found in this Url ");
	}
	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Line Two Section.
	 */
	public void verfyLineTwoSection(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		if(lineTwoSectionEleList.size()>0) {
			for (int i = 0; i < lineTwoSectionEleList.size(); i++) {
				webDriverActions.mouseHover(lineTwoSectionEleList.get(i));
				webDriverActions.softHighlightElement(lineTwoSectionEleList.get(i));
				String actual = webDriverActions.getAttribute("href", lineTwoSectionEleList.get(i));
				webDriverActions.softClickJS(lineTwoSectionEleList.get(i));
				String currentPage =webDriverActions.getCurrentPageUrl();
				if (serverType.contains("preProd") && !currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					currentPage=betaUrl;
				}
				webDriverActions.navigateBack();
				String pageTitle = webDriverActions.getPageTitle();
				if (!pageTitle.contains("404")) {
					softAssert.assertTrue(actual.contains(currentPage), "Possibily url is not same in article page "+currentPage);
				}
				else {
					Logs.error(getClass(),"Page has issue in this url : "+currentPage);
					softAssert.fail("Page has issue in this url : "+currentPage);
				}
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+lineTwoSectionEleList.size());
		}
		softAssert.assertAll("Issues found in this Url ");
	}
}




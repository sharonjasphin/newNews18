package com.news18.englishpages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class AMPLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	SoftAssert softAssert=new SoftAssert();

	public AMPLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	/*list of sections present in Line One Section Bar present at the header of Homepage*/
	@FindBy(xpath ="//ul[contains(@class,'L1_menu')]//li/a")
	private List<WebElement> lineOneSectionELementLnk;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'news_page')] | //div[contains(@class,'brade_crum')] | //div[contains(@class,'CN-PageWrap')] | //div[contains(@class,'story_container')] | //div[contains(@class,'videosSliderWrapper')] | //div[contains(@class,'photoGalleryWrapper')] | //div[contains(@class,'main_header')] | (//h1)[1]")
	private WebElement headerTxtLogoLnk;

	/*Amp Link */
	@FindBy(xpath = "//td[contains(@class,'line-content')]//span[text()='amphtml']/following-sibling::a")
	private WebElement  ampLnk;

	/*AMP Home Page Header Logo */
	@FindBy(xpath ="//div[contains(@class,'logo_box')]" )
	private WebElement headerLogo;

	/*AMP Home Page Header Live Tv */
	@FindBy(xpath ="//div[contains(@class,'main_header')]//ul/li/a[contains(@href,'livetv')]")
	private WebElement headerLiveTv;

	/*AMP Home Page Header Page header text */
	@FindBy(xpath ="//div[contains(@class,'top')]/preceding-sibling::div")
	private WebElement pageContent;


	//	*************************Sanjeeb*****Webelements*****************************

	/*Homepage LiveBlog article Link  is present below the LineTwo Tag  Menu in RHS*/
	@FindBy(xpath ="(//a[contains(@href,'live-updates')])[1]")
	private WebElement homePageLiveBlogArticleLnks;

	/*live Blog Icon*/
	@FindBy(xpath ="(//div[contains(@class,'liveBlog')])[1]")
	private WebElement homepageLiveBlogIcon;

	/*AMP_LiveBlogPage Social share Links*/
	@FindBy(xpath = "//div[contains(@class,'socalWrap')]//a")
	private List<WebElement> socialShareIconsLnks;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'socalWrap')]")
	private WebElement allShareIcons;

	public List<WebElement> getSocialShareIconsLnks() {
		return socialShareIconsLnks;
	}

	public WebElement getAllShareIcons() {
		return allShareIcons;
	}

	/*Header Text Present After Clicking On top Learning Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="//div[contains(@class,'header-navbar')] | (//div[contains(@class,'header')])[1]")
	private WebElement topLearningTxt;

	/*hamburger Section Header Icons present after clicking on hamburger Icon of Mobile English Home Page*/
	@FindBy(xpath ="((//div[contains(@class,'left')])[1]//ul//a)")
	private List<WebElement> hamburgerHeaderIcon;

	/*List of link present inside In Trends Section Present On the header Of Hamburger Menu Mobile English Home Page*/
	@FindBy(xpath ="//div[contains(@class,'nav_main')]//ul[contains(@class,'inTrendsList')]//li/a")
	private List<WebElement> inTrendsList;

	/*Change Language Header Icons present after clicking on hamburger Icon of Mobile English Home Page*/
	@FindBy(xpath ="//ul[contains(@class,'lang_list')]//a")
	private List<WebElement> changeLanguageSectionList;

	/*Social Share Section Elements Present in AMP English Home Page*/
	@FindBy(xpath ="//ul[contains(@class,'nav_social')]//a")
	private List<WebElement> socialShareEleList;

	/*language DropDown Present on the Hamburger Menu Of Landing Page*/
	@FindBy(xpath ="//div[contains(@class,'language_click')]")
	private WebElement languageDropdwn;

	/*Header Section Present After Clicking on any elements in Mobile Landing Page*/
	@FindBy(xpath ="//div[contains(@id,'header')] | //div[contains(@class,'new-header')]")
	private WebElement headerSection;

	/*List of link present inside initiative Dropdown Icon Present On the header Of Hamburger Menu Mobile English Home Page*/
	@FindBy(xpath ="(//div[contains(@class,'nav_main')])//ul[contains(@class,'topmenu_initiative')]//a")
	private List<WebElement> nw18InitiativesList;

	/*List of link present inside Know Us Dropdown Icon Present On the header Of Hamburger Menu Mobile English Home Page*/
	@FindBy(xpath ="(//div[contains(@class,'nav_main')])//ul[contains(@class,'topmenu_static')]//a")
	private List<WebElement> knowUsList;

	/*List of link present inside Section Dropdown Icon Present On the header Of Hamburger Menu Mobile English Home Page*/
	@FindBy(xpath ="(//div[contains(@class,'nav_main')])//ul[contains(@class,'topmenu_2')]//a")
	private List<WebElement> sectionList;

	/*List of link present inside Section Dropdown Icon Present On the header Of Hamburger Menu Mobile English Home Page*/
	@FindBy(xpath ="(//div[contains(@class,'nav_main')])//ul[contains(@class,'topmenu_4')]//a")
	private List<WebElement> groupSitesList;

	/*Hamburger Icon Present On the header Of Mobile English Home Page*/
	@FindBy(xpath ="//div[contains(@class,'hamburger_btn')]")
	private WebElement hamburgerrBtn;

	/*News 18 Initiative Drop down in Mobile Landing Page*/
	@FindBy(xpath ="(//div[contains(@class,'nav_main')]//h2)[2]")
	private WebElement nw18InitiativeDropDown;

	/*News 18 Initiative Drop down in Mobile Landing Page*/
	@FindBy(xpath ="(//div[contains(@class,'nav_main')]//h2)[3]")
	private WebElement groupSitesDropDown;

	/*googlePlay Icon Present After Clicking on open App present in Hamburger Menu*/
	@FindBy(xpath ="(//header)[1]")
	private WebElement googlePlayIcon;

	/*Header Text Present After Clicking On FaceBook Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="//div[@id='MChromeHeader'] | //img[contains(@alt,'facebook')]")
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

	/*Header Text Present After Clicking On JIo Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="(//div[@class='container'])[1]")
	private WebElement jioTxt;

	/*Header Text Present After Clicking On Youtube Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="(//img[contains(@src,'yt3.ggpht')])[2] | (//img[contains(@src,'yt3.ggpht')])")
	private WebElement youtubeTxt;

	/*Header Text Present After Clicking On TownHall Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="//div[contains(@class,'townhall')]")
	private WebElement towmHallTxt;

	/*Header Text Present After Clicking On netrasuraksha Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="//div[contains(@class,'novartis')]/div")
	private WebElement netrasurakshaTxt;

	/*Header Text Present After Clicking On Mission Pani Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="(//div[contains(@class,'inner_header')]/div)[1]")
	private WebElement missionPaniTxt;

	/*Header Text Present After Clicking On itsnotok Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="//div[contains(@class,'logo-div')]")
	private WebElement itsnotokTxt;

	/*Header Text Present After Clicking On youngGenius Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="//div[contains(@class,'header_menu')]")
	private WebElement youngGeniusTxt;

	/*Header Text Present After Clicking On youngGenius Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="//div[contains(@class,'main-frame')]/img")
	private WebElement swabhimanBharatTxt;

	/*Header Text Present After Clicking On period of pride Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="//div[contains(@class,'hero_section')]")
	private WebElement periodofprideTxt;

	/*Header Text Present After Clicking On influential Leader Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="//div[contains(@class,'banner-section')]")
	private WebElement influentialLeaderTxt;

	/*Header Text Present After Clicking On MoneyControl Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="//div[contains(@class,'icpancakeblock')]")
	private WebElement moneycontrolTxt;

	/*Header Text Present After Clicking On FirstPost Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="//header[contains(@id,'mainHeader')]")
	private WebElement firstPostTxt;

	/*Header Text Present After Clicking On CNBC Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="//div[contains(@class,'logo-main')]")
	private WebElement cnbcTxt;

	/*Header Text Present After Clicking On History Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="//div[contains(@class,'brand')]")
	private WebElement histotryTxt;

	/*Header Text Present After Clicking On MTV Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="//div[contains(@class,'navbar-wrapper')]")
	private WebElement mtvTxt;

	/*News 18 Initiative Drop down in Mobile Landing Page*/
	@FindBy(xpath ="(//div[contains(@class,'nav_main')]//h2)[4]")
	private WebElement knowUsDropDown;

	/*electrical Hydra Icon Present On LineTwo Section*/
	@FindBy(xpath ="(//div[contains(@class,'elhead')]//img)[1]")
	private WebElement electricalHydraIcon;

	//	*****************************Rahul****Webelement***************

	/*More Latest news Headline*/
	@FindBy(xpath ="//div[contains(@class,'latestNewsWidget vspacer30')]//span")
	private WebElement latestNewsHeadline;

	/*Latest news article Link List*/
	@FindBy(xpath ="//div[contains(@class,'latestNewsWidget')]//div[contains(@class,'txt')]//a")
	private List<WebElement> latestNewsArticleLinkLst;

	/* Latest News Breadcrum*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')])[1]")
	private WebElement latestNewsBreadcrum;

	/*More Latest news Btn present in Latest News Section*/
	@FindBy(xpath ="//div[contains(@class,'more-listing')]//a[contains(@href,'/amp/news')]")
	private WebElement moreLatestNewsBtn;
	//	***************************Anupam***Webelement******************

	/* movie section Link in Homepage */
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/movies/')]" )
	private WebElement moviesWidgetSectionLnk;

	/*movie widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/movies/')]/parent::div/ul/li/a")
	private List<WebElement> moviesWidgetArticleLnk;

	/*movie widget image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/movies/')]/parent::div/ul/li/a/amp-img")
	private List<WebElement> moviesWidgetImgLnk;

	/*movie  article body Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'article-body')])[1]")
	private WebElement moviesArticleBody;

	/*article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')]/span)[1] | (//div[contains(@class,'breadcum')])[1] | //div[contains(@class,'brade_crum bnon')]")
	private WebElement articleBreadcrumb;

	/*breadcrum present in movies page*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')]/h1)[1]")
	private WebElement moviesMoreBreadcrumb;

	/*more movies Lnk present in Home Page*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/movies/')]/parent::div/div/a")
	private WebElement moreMoviesWidgetLnk;

	////------cricketnext

	/* CricketNext section Link in Homepage */
	@FindBy(xpath ="//div[(@class='vspacer30')]/a[contains(@href,'/cricketnext/')]" )
	private WebElement cricketNextWidgetSectionLnk;

	/*CricketNext widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/cricketnext/')]/parent::div/ul/li/a")
	private List<WebElement> cricketNextWidgetArticleLnk;

	/*CricketNext widget image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/cricketnext/')]/parent::div/ul/li/a/amp-img")
	private List<WebElement> cricketNextWidgetImgLnk;

	/*more CricketNext Lnk present in Home Page*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/cricketnext/')]/parent::div/div/a")
	private WebElement moreCricketNextWidgetLnk;

	/*CricketNext  article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')]/p)[1] | //div[contains(@class,'breadcum')]")
	private WebElement cricketNextBreadcrumb;


	////------india

	/* india section Link in Homepage */
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/india/')]" )
	private WebElement indiaWidgetSectionLnk;

	/*india widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/india/')]/parent::div/ul/li/a")
	private List<WebElement> indiaWidgetArticleLnk;

	/*india widget image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/india/')]/parent::div/ul/li/a/amp-img")
	private List<WebElement> indiaWidgetImgLnk;

	/*more india Lnk present in Home Page*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/india/')]/parent::div/div/a")
	private WebElement moreIndiaWidgetLnk;

	/*india article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')])[1]")
	private WebElement indiaBreadcrumb;


	////------business

	/* business section Link in Homepage */
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/business/')]" )
	private WebElement businessWidgetSectionLnk;

	/*business widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/business/')]/parent::div/ul/li/a")
	private List<WebElement> businessWidgetArticleLnk;

	/*business widget image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/business/')]/parent::div/ul/li/a/amp-img")
	private List<WebElement> businessWidgetImgLnk;

	/*more business Lnk present in Home Page*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/business/')]/parent::div/div/a")
	private WebElement moreBusinessWidgetLnk;

	/*business article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')]/h1)[1]")
	private WebElement businessBreadcrumb;

	/*Horoscope Section Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_section')]")
	private WebElement horoscopeSectionLnk;

	/*Horoscope Active Text in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_slider')]//div[(@aria-hidden='false')]//p")
	private WebElement horoscopeActiveText;

	/*Forward tap Button in Horoscope Section in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_slider')]//div[contains(@class,'carousel-arrows')]/div[contains(@class,'button-next')]")
	private WebElement forwardTapButton;

	/*Backward tap Button in Horoscope Section in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_slider')]//div[contains(@class,'carousel-arrows')]/div[contains(@class,'button-prev')]")
	private WebElement backwardTapButton;

	/*Astrology Signs present under Horoscope sub module*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_section')]//div[contains(@class,'i-amphtml-carousel-slotted i-amphtml-carousel-wrapper i-amphtml-carousel-slide-item')]//a")
	private  List<WebElement> horoscopeSigns;

	/* Description for each astro sign present in horoscope page */
	@FindBy(xpath ="//p[@class='detail_intro']")
	private WebElement detailIntro;

	//videowall------
	/*video wall widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'videoWall')]//a")
	private WebElement videoWallWidgetArticleLnk;

	/*video wall article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'BreadCum')]/span)[1]")
	private WebElement videoWallArticleBreadcrumb;

	/*video wall widget image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'videoWall')]//amp-img")
	private WebElement videoWallWidgetImgLnk;

	/*fromOurShows widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'story_listing_left')]/a[contains(@href,'/ivideos/')]/parent::div//a[2]")
	private List<WebElement> fromOurShowsWidgetArticleLnk;

	/*fromOurShows widget Image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'story_listing_img')]//amp-img//parent::a")
	private List<WebElement> fromOurShowsWidgetImgLnk;

	/*jump to show widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'category_select from_shows_select')]/select")
	private WebElement jumpToShowWidgetLnk;

	/*jump to show option Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'category_select from_shows_select')]/select/option")
	private List<WebElement> jumpToShowOptionLnk;

	/*jump to show option breadcrumb in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'brade_crum bnon')]")
	private WebElement jumpToShowOptionBreadcrumb;

	/*video wall widget Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'photo-gallery')]//h2[contains(.,'Videos Wall')]")
	private WebElement videoWallWidgetLnk;


	//	****************Vipin***Webelements**************************

	/*List of Priority Article Links in News18 Homepage*/
	@FindBy(xpath = "//div[contains(@class,'mlead-story')]/h1/a | //div[contains(@class,'story')]/div[contains(@class,'mstory-thumb')]//div[contains(@class,'text')]//a")
	private List<WebElement> priorityPanelArticleLnk;

	/*Article Header Text in Article Consumption Page*/
	@FindBy(xpath = "//h1[contains(@class,'article_heading')] | //div[contains(@class,'article_main')]/h1 | //div[contains(@class,'TstoryHead')]/h1 | //div[contains(@class,'pht-artcl')]/h1 | //div[contains(@class,'article-container')]//h1")
	private WebElement articleHeaderTxt;

	/*List of Priority Article Links in News18 Homepage*/
	@FindBy(xpath = "//div[contains(@class,'mlead-story')]//amp-img | //div[contains(@class,'story')]/div[contains(@class,'mstory-thumb')]//div[contains(@class,'img')]//amp-img")
	private List<WebElement> priorityPanelImgLnk;

	/*Top Stories Widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'story')]/div[contains(@class,'mtopstory')]/ul//a")
	private List<WebElement> topStoriesWidgetArticleLnk;

	/*List of Hot and Trending Widget articles Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'hntranding')]//ul//a[contains(@class,'story_title')]")
	private List<WebElement> hotAndTrendingWidgetArticleLnk;

	/*List of Hot and Trending Widget Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'hntranding')]//ul//amp-img")
	private List<WebElement> hotAndTrendingWidgetImgLnk;

	/*More Hot and Trending articles Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'host_trending')]//h2[.='Hot & Trending']/ancestor::div[contains(@class,'host_trending')]/ul/div[contains(@class,'more_story')]/a")
	private WebElement moreHotAndTrendingLnk;

	/* List Of WebStories Article Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'story_top')]//h2/a[contains(@href,'web-stories')]/ancestor::div[contains(@class,'story_list')]//div[contains(@class,'scroll')]/a")
	private List<WebElement> webstoriesArticleLnk;

	/* WebStoreis Next Story Button */
	@FindBy(xpath = "//button[contains(@aria-label,'Next page')]")
	private WebElement nextWebstoriesBtn;

	/* List Of WebStories Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'story_top')]//h2/a[contains(@href,'web-stories')]/ancestor::div[contains(@class,'story_list')]//div[contains(@class,'scroll')]/a//amp-img")
	private List<WebElement> webstoriesImgLnk;

	/* Right Slide Button for Webstories Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'story_top')]//h2/a[contains(@href,'web-stories')]/ancestor::div[contains(@class,'story_list')]//div[contains(@class,'arrows')]/div[contains(@class,'next')]")
	private WebElement webstoriesRightSlideBtn;

	/* Left Slide Button for Webstories Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'story_top')]//h2/a[contains(@href,'web-stories')]/ancestor::div[contains(@class,'story_list')]//div[contains(@class,'arrows')]/div[contains(@class,'prev')]")
	private WebElement webstoriesLeftSlideBtn;

	/*Active Webstories Article text for Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'story_list')]//a[contains(@href,'/web-stories/')]/ancestor::div[contains(@class,'story_list')]//div[contains(@class,'active')]/a//figcaption//h3")
	private WebElement activeWebstoriesArticleTxt;

	/*Active Arrow Button for Webstories Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'story_list')]//a[contains(@href,'/web-stories/')]/ancestor::div[contains(@class,'story_list')]//div[contains(@class,'next_arrow')]//button[contains(@class,'active')]")
	private WebElement activeWebstoriesBtn;

	/*Webstories Widget See More Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'story_list')]//a[contains(@href,'/web-stories/')]/ancestor::div[contains(@class,'story_list')]/div/a[contains(@class,'see_more')]")
	private WebElement webstoriesSeeMoreLnk;

	/* BreadCrumb Division after Navigation of Article */
	@FindBy(xpath = "//div[contains(@class,'brade_crum')]")
	private WebElement webstoriesBreadCrumbDiv;

	/* BreadCrumb Division for More News Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'bread')] | //div[contains(@class,'Bread')] | //div[contains(@class,'heading_title')]")
	private WebElement articleBreadCrumbDiv;

	/* List of Slider Button for Cricknext in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet_section')]/div[contains(@class,'glide')]//button")
	private List<WebElement> cricketnextRightSlideBtn;

	/* Active Arrow Button for CricketNext Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet_section')]/div[contains(@class,'glide')]//button[contains(@class,'active')]")
	private WebElement activeCricketnextBtn;

	/* Active Cricketnext Article for Cricketnext Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet_section')]//li[contains(@class,'active')]//h3")
	private WebElement activeCricketnextTxt;


	/* Active Photogallery Article Text for Photogallery Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photogallerie')]//div[contains(@class,'active')]//h3")
	private WebElement activePhotgallerySlider;

	/* Active Videos Article Text for Videos Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'video_section')]//div[contains(@class,'active')]//figcaption/h3")
	private WebElement activeVideosSlider;

	/*List of Photogallery Article Text for Photogallery Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photogalleries')]//div[contains(@class,'photogallerie_row') and (not (contains(@class,'clone')))]/a/figcaption/h3")
	private List<WebElement> photogallerySectionArticleTxt;

	/* Active Arrow Button for Photogallery Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photogalleries')]//div[contains(@class,'bullets')]/button[contains(@class,'active')]")
	private WebElement activePhotogalleryBtn;

	/*List of Buzz Article Link for Buzz Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/buzz/')]/parent::div//li/a")
	private List<WebElement> buzzSectiontArticleLnk;

	/*List of Buzz Image Links for Buzz Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/buzz/')]/parent::div//li/a//img")
	private List<WebElement> buzzSectiontImgLnk;

	/* More Buzz News Link for Buzz Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/buzz/')]/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreBuzzLnk;

	/*List of Buzz Article Link for Buzz Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/education-career/')]/parent::div//li/a")
	private List<WebElement> educationAndCareerSectiontArticleLnk;

	/*List of Buzz Image Links for Buzz Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/education-career/')]/parent::div//li/a//img")
	private List<WebElement> educationAndCareerSectiontImgLnk;

	/* More Buzz News Link for Buzz Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/education-career/')]/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreEducationAndCareerLnk;

	/*List of Tech Article Link for Tech Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/tech/')]/parent::div//li/a")
	private List<WebElement> techSectiontArticleLnk;

	/*List of Tech Image Links for Tech Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/tech/')]/parent::div//li/a//img")
	private List<WebElement> techSectiontImgLnk;

	/* More Tech News Link for Tech Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/tech/')]/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreTechLnk;

	/*List of Health and Fitness Article Link for Health and Fitness Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/health-and-fitness/')]/parent::div//li/a")
	private List<WebElement> healthAndFitnessSectiontArticleLnk;

	/*List of Health and Fitness Image Links for Health and Fitness Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/health-and-fitness/')]/parent::div//li/a//img")
	private List<WebElement> healthAndFitnessSectiontImgLnk;

	/* More Health and Fitness News Link for Health and Fitness Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/health-and-fitness/')]/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreHealthAndFitnessLnk;

	/*List of Health and Fitness Article Link for Health and Fitness Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/explainers/')]/parent::div//li/a")
	private List<WebElement> explainersSectiontArticleLnk;

	/*List of Health and Fitness Image Links for Health and Fitness Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/explainers/')]/parent::div//li/a//img")
	private List<WebElement> explainersSectiontImgLnk;

	/* More Health and Fitness News Link for Health and Fitness Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/explainers/')]/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreExplainersLnk;

	/*List of Opinion Article Link for Opinion Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/opinion/')]/parent::div//li/a")
	private List<WebElement> opinionSectiontArticleLnk;

	/*List of Opinion Image Links for Opinion Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/opinion/')]/parent::div//li/a//amp-img")
	private List<WebElement> opinionSectiontImgLnk;

	/* More Opinion News Link for Opinion Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/opinion/')]/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreOpinionLnk;

	/*List of politics Article Link for politics Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/politics/')]/parent::div//li/a")
	private List<WebElement> politicsSectiontArticleLnk;

	/*List of politics Image Links for politics Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/politics/')]/parent::div//li/a//img")
	private List<WebElement> politicsSectiontImgLnk;

	/* More politics News Link for politics Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/politics/')]/parent::div/div[contains(@class,'more')]/a")
	private WebElement morePoliticsLnk;

	/*List of Football Article Link for Football Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/football/')]/parent::div//li/a")
	private List<WebElement> footballSectiontArticleLnk;

	/*List of Football Image Links for Football Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/football/')]/parent::div//li/a//img")
	private List<WebElement> footballSectiontImgLnk;

	/* More Football News Link for Football Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/football/')]/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreFootballLnk;

	/*List of News18 Showsha Article Link for News18 Showsha Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'ss_widget')]//div[contains(@class,'ss_rows')]/a[contains(@class,'row')]")
	private List<WebElement> news18ShowshaSectiontArticleLnk;

	/*List of Football Image Links for Football Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'ss_widget')]//div[contains(@class,'ss_rows')]/a[contains(@class,'row')]//img")
	private List<WebElement> news18ShowshaSectiontImgLnk;

	/* More Football News Link for Football Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'ss_widget')]/a")
	private WebElement moreFromNews18ShowshaLnk;

	/* News18 Showsha Logo Image Link for News18 Showsha Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'ss_widget')]/div[contains(@class,'header')]/a/img[contains(@src,'showsha')]")
	private WebElement news18ShowshaLogoImgLnk;

	/*List of Auto Article Link for Auto Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/auto/')]/parent::div/ul/li/a")
	private List<WebElement> autoSectiontArticleLnk;

	/*List of Auto Image Links for Auto Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/auto/')]/parent::div/ul/li/a/amp-img")
	private List<WebElement> autoSectiontImgLnk;

	/* More Auto News Link for Auto Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/auto/')]/parent::div/div/a")
	private WebElement moreAutoLnk;

	/*List of World Article Link for World Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/world/')]/parent::div/ul/li/a")
	private List<WebElement> worldSectiontArticleLnk;

	/*List of World Image Links for World Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/world/')]/parent::div/ul/li/a/amp-img")
	private List<WebElement> worldSectiontImgLnk;

	/* More World News Link for World Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/world/')]/parent::div/div/a")
	private WebElement moreWorldLnk;

	/*List of Sports Article Link for Sports Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/sports/')]/parent::div/ul/li/a")
	private List<WebElement> sportsSectiontArticleLnk;

	/*List of Sports Image Links for Sports Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/sports/')]/parent::div/ul/li/a/amp-img")
	private List<WebElement> sportsSectiontImgLnk;

	/* More Sports News Link for Sports Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/sports/')]/parent::div/div/a")
	private WebElement moreSportsLnk;

	/*List of Lifestyle Article Link for Lifestyle Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/lifestyle/') and not (contains(@href,'/health-and-fitness/'))]/parent::div/ul/li/a")
	private List<WebElement> lifestyleSectiontArticleLnk;

	/*List of Lifestyle Image Links for Lifestyle Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/lifestyle/') and not (contains(@href,'/health-and-fitness/'))]/parent::div/ul/li/a/amp-img")
	private List<WebElement> lifestyleSectiontImgLnk;

	/* More Lifestyle News Link for Lifestyle Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/lifestyle/') and not (contains(@href,'/health-and-fitness/'))]/parent::div/div/a")
	private WebElement moreLifestyleLnk;

	/*List of CricketNext Widget Article Image in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet-box')]//ul//li//a//img")
	private List<WebElement> cricketnextImgLnk;


	/* List of Cricknext Widget Article Text in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet-box')]//ul//li//a")
	private List<WebElement> cricketnextArticleLnk;

	/* List of Cricketnext Tabs Link in CricketNext Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet_tab')]/a")
	private List<WebElement> cricketnextTabLnk;

	/*List of Photogallery Article Links in Photogallery Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photo-gallery vspace')]//descendant::li/a[@class]")
	private List<WebElement> photogalleryWidgetArticleLnk;

	/* Slider Button in Photogallery Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photo-gallery vspacer')]//span[.='Photogalleries']/ancestor::div[contains(@class,'photo')]//div[contains(@class,'next')]")
	private WebElement photogalleryRightSliderBtn;

	/* Slider Button in Photogallery Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photo-gallery vspacer')]//span[.='Photogalleries']/ancestor::div[contains(@class,'photo')]//div[contains(@class,'prev')]")
	private WebElement photogalleryLeftSliderBtn;

	/*List of Photogallery Image Links in Photogallery Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photo-gallery vspace')]//descendant::li/a//amp-img")
	private List<WebElement> photogalleryWidgetImgLnk;

	/* More Photogalleries Link for Photogallery Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photo-gallery vspacer30 prelative photo-gallery-slider ')]//div[@class='load_more']//a[contains(@href,'/amp/photogallery')]")
	private WebElement morePhotogalleryLnk;

	/* List of Slider Button in Videos Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photo-gallery vspacer')]//span[.='Videos']/ancestor::div[contains(@class,'photo')]//div[contains(@class,'next')]")
	private WebElement videosRightSliderBtn;

	/* List of Slider Button in Videos Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photo-gallery vspacer')]//span[.='Videos']/ancestor::div[contains(@class,'photo')]//div[contains(@class,'prev')]")
	private WebElement videosLeftSliderBtn;

	/* More Video Button Breadcrum*/
	@FindBy(xpath = "//div[contains(@class,'BreadCum')]")
	private WebElement moreVideosBreadcrum;

	/* More Videos Link for Videos Section in Homepage */
	@FindBy(xpath = "//div[@class='load_more']//a[@href='/amp/videos/']")
	private WebElement moreVideosLnk;

	/*List of Videos Image Links for Videos Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photo-gallery vspacer')]//span[.='Videos']/ancestor::div[contains(@class,'photo')]//div[contains(@class,'slider_row')]//amp-img")
	private List<WebElement> videosSectiontImgLnk;

	/*List of Videos Article Links in Videos Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photo-gallery vspacer')]//span[.='Videos']/ancestor::div[contains(@class,'photo')]//div[contains(@class,'slider_row')]/a[@class]")
	private List<WebElement> videosSectiontArticleLnk;

	/* List of CricketNext Widget Article Links in Homepage */
	@FindBy(xpath ="//div[contains(@class,'cn_widget')]/a/div[contains(@class,'txt')]" )
	private List<WebElement> cricketNextArticleLnk;

	/* List of CricketNext Widget Article Links in Homepage */
	@FindBy(xpath ="//div[contains(@class,'cn_widget')]/a/div[contains(@class,'img')]/amp-img" )
	private List<WebElement> cricketNextImgLnk;

	/* List Of CricketNext Widget Tab Links in Homepage */
	@FindBy(xpath ="//div[contains(@class,'cn_widget')]//div[contains(@class,'cnw_header')]/a[contains(@class,'nws18')]" )
	private WebElement cricketNextNews18LogoLnk;

	/* List Of CricketNext Widget Tab Links in Homepage */
	@FindBy(xpath ="//div[contains(@class,'cn_widget')]//div[contains(@class,'cnw_header')]/a[contains(@class,'logo')]" )
	private WebElement cricketNextLogoLnk;

	/* More From CricketNext Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cn_widget')]/a[contains(@class,'more')]")
	private WebElement cricketNextMoreLnk;


	/**
	 * This method is used to get valid AMP URL from current Page URL by navigating to View Page source
	 */
	public void changeToAmpURL()
	{
		String currentUrl = webDriverActions.getCurrentPageUrl();
		String ampurl =getAmpHtml(currentUrl);
		if(!(ampurl==""))
		{
			webDriverActions.navigateToUrl(ampurl);
		}
		else
		{
			softAssert.fail("No AMP URL is available For This Url "+ currentUrl);	
		}
	}

	/**
	 * @author Abhishek Raj
	 * This Method is used to get AmpHtml urls present in respective pages
	 * @param url
	 * @return
	 */
	public String getAmpHtml(String url) {
		String amphHtmlLnk = "";
		webDriverActions.navigateToUrl(url);
		webDriverActions.waitForPageToLoad();
		webDriverActions.viewPageSource();
		webDriverActions.waitForPageToLoad();
		amphHtmlLnk = webDriverActions.getAttribute("href", ampLnk);
		if(! amphHtmlLnk.contains("amp") || amphHtmlLnk==" ") {
			Logs.error(getClass(), "Amp url is not present");	
		}
		Logs.info(getClass(), amphHtmlLnk);
		int count=0;
		if(amphHtmlLnk.contains("amp"))
		{
			count++;
			if(count==1)
			{
				Logs.info(getClass(), amphHtmlLnk  +" Amp  is  present  " + count);
			}
			else
			{
				Logs.info(getClass(), amphHtmlLnk  + "null" );
			}
		}
		return amphHtmlLnk;
	}

	/**
	 * @author DanishR
	 * This method is used to display News18 logo
	 */
	public void verifyHeaderLogo() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.softWaitForElementVisibility(headerLogo, 20);
		webDriverActions.mouseHoverAndClick(headerLogo);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(headerLogo);
			webDriverActions.softClick(headerLogo);
		}
		Logs.info(getClass(),"News18 Header Logo is displayed");
		softAssert.assertTrue(webDriverActions.isElementDisplayed(pageContent), "Possibly element not displayed "+ webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues found in Home Page Header Logo ");
	}

	/**
	 * @author DanishR
	 * This method is used to validate Header Live Tv
	 */
	public void verifyHeaderLiveTv(String serverType) {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForSecond(2000);
		webDriverActions.softWaitForElementVisibility(headerLiveTv, 20);
		webDriverActions.mouseHoverAndClick(headerLiveTv);
		webDriverActions.waitForPageToLoad();
		String currentPageUrl = webDriverActions.getCurrentPageUrl();
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(headerLiveTv);
			webDriverActions.softClick(headerLiveTv);
		}
		if (serverType.contains("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
			webDriverActions.navigateToUrl(betaUrl);
			currentPageUrl=betaUrl;
		}
		Logs.info(getClass(),"Navigated to Live TV page");
		softAssert.assertTrue(webDriverActions.isElementDisplayed(pageContent), "Possibly element not displayed "+ currentPageUrl);
		softAssert.assertAll("Issues found in Home Page Header Logo ");
	}

	//	*************************Sanjeeb**Business Logic********************************


	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of English Home Page 
	 */
	public void clickOnFirstLiveBlogArticleHomePage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(1000);
			webDriverActions.continuousScrollTillElement(homepageLiveBlogIcon, 10);
			String title = webDriverActions.getAttribute("target", homepageLiveBlogIcon);
			if(webDriverActions.isElementDisplayed(homePageLiveBlogArticleLnks))
			{
				webDriverActions.clickJS(homePageLiveBlogArticleLnks);
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					webDriverActions.waitForSecond(1000);
				}
			}
			else
			{
				Logs.error(getClass(), "Exception in Live blog in HomePage Link");
				throw new SkipException("Unable to locate Live Blog Article element possibly no Live Blog Present "+webDriverActions.getCurrentPageUrl());	
			}
		}
		catch(Exception e) {
			Logs.error(getClass(), "Exception in Live blog in HomePage Link");
			throw new SkipException("Unable to locate Live Blog Article element possibly no Live Blog Present "+webDriverActions.getCurrentPageUrl());
		}
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Line One section elements By clicking on it.
	 */
	public void verfyLineOneSection()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		//Validating the Line one section Except Search Button
		for (int i = 1; i < lineOneSectionELementLnk.size(); i++)
		{
			for (int j = 1; j <= 2 ; j++) {
				lineOneSectionELementLnk.get(i).sendKeys(Keys.ARROW_RIGHT);
			}
			webDriverActions.softMouseHover(lineOneSectionELementLnk.get(i));
			webDriverActions.softHighlightElement(lineOneSectionELementLnk.get(i));
			String actual = webDriverActions.getAttribute("href", lineOneSectionELementLnk.get(i));
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(lineOneSectionELementLnk.get(i)), "possibly line One Element Is not Visible"+actual);
			webDriverActions.softClickJS(lineOneSectionELementLnk.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(lineOneSectionELementLnk.get(i));
				webDriverActions.softHighlightElement(lineOneSectionELementLnk.get(i));
				webDriverActions.softClickJS(lineOneSectionELementLnk.get(i));
			}
			webDriverActions.stopPageLoading();
			webDriverActions.softWaitForElementVisibility(headerTxtLogoLnk, 3);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Failed To display Header Icon For This URL"+actual);
			webDriverActions.navigateBack();
		}
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Hamburger Menu Header Part By clicking on Hamburger Icon it.
	 */
	public void verifyHamburgerHeader(String server)
	{
		verifyHamburgerSection(hamburgerHeaderIcon, server);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Hamburger Menu News 18 Initiatives Dropdown Section By clicking on Hamburger Icon it.
	 */
	public void verifyHamburgerInTrendsSection(String server)
	{
		verifyHamburgerSection(inTrendsList,server);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Hamburger Menu Header Part By clicking on Hamburger Icon it.
	 */
	public void verifyHamburgerChangeLanguage()
	{
		webDriverActions.waitForPageToLoad();
		String pageURL = webDriverActions.getPageTitle();
		webDriverActions.softClickJS(hamburgerrBtn);
		webDriverActions.softClickJS(languageDropdwn);
		webDriverActions.waitForElement(1000);
		//Validating the Line one section Except Search Button
		for (int i = 1; i < changeLanguageSectionList.size(); i++)
		{
			String actual = webDriverActions.getAttribute("href",changeLanguageSectionList.get(i));
			Logs.info(getClass(), actual);
			webDriverActions.softClickJS(changeLanguageSectionList.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.waitForSecond(5000);
				webDriverActions.softClickJS(hamburgerrBtn);
				webDriverActions.softClickJS(languageDropdwn);
				webDriverActions.softClickJS(changeLanguageSectionList.get(i));
			}
			webDriverActions.switchToNewWindow();
			webDriverActions.stopPageLoading();
			webDriverActions.softWaitForElementVisibility(headerSection, 3);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerSection), "possibly Header Section Of Language Section Is not Displayed"+actual);
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(pageURL);
		}
		softAssert.assertAll("Issues Found In Validating Hamburger Language Section");
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Hamburger Menu Social Share Icons Section By clicking on Hamburger Icon it.
	 */
	public void verifyHamburgerSocialShareIconSection()
	{
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

		webDriverActions.waitForPageToLoad();
		String pageTitle = webDriverActions.getPageTitle();
		webDriverActions.waitForElement(1000);
		webDriverActions.softClickJS(hamburgerrBtn);
		//Validating the Line one section Except Search Button
		for (int i = 0; i < socialShareEleList.size(); i++)
		{
			webDriverActions.waitForPageToLoad();
			String actual = webDriverActions.getAttribute("href",socialShareEleList.get(i));
			Logs.info(getClass(), actual);
			String title = webDriverActions.getAttribute("target", socialShareEleList.get(i));
			webDriverActions.scrollToLast();
			webDriverActions.softMouseHover(socialShareEleList.get(i));
			webDriverActions.softClickJS(socialShareEleList.get(i));
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
				webDriverActions.softClickJS(hamburgerrBtn);
				webDriverActions.softClickJS(socialShareEleList.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					webDriverActions.waitForSecond(1000);
				}
			}
			webDriverActions.waitForSecond(5000);
			webDriverActions.waitForPageToLoad();
			String expected = webDriverActions.getCurrentPageUrl();
			// it will iterate the list and validate 
			for(int j=0;j<list.size();j++)
			{
				if(actual.contains(list.get(j)))
				{
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j)), "Possibly Element Is Not Visible For This URL "+expected);	
				}
			}
			if(title.contains("_blank"))
			{
				webDriverActions.waitForSecond(2000);
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageTitle);
			}
			else
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(hamburgerrBtn);
			}
		}

		softAssert.assertAll("Issues Found In Validating Hamburger Menu Social Share Section");
	}


	public void verifyHamburgerSection(List<WebElement> sectionEleList,String server)
	{
		webDriverActions.waitForPageToLoad();
		String pageTitle = webDriverActions.getPageTitle();
		String pageUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForElement(1000);
		webDriverActions.softClickJS(hamburgerrBtn);
		for (int i = 0; i < sectionEleList.size(); i++)
		{
			String actual = webDriverActions.getAttribute("href",sectionEleList.get(i));
			Logs.info(getClass(), actual);	
			String title = webDriverActions.getAttribute("target", sectionEleList.get(i));
			webDriverActions.softHighlightElement(sectionEleList.get(i));
			webDriverActions.softClickJS(sectionEleList.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				Logs.info(getClass(), actual);
			}
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(hamburgerrBtn);
				webDriverActions.softHighlightElement(sectionEleList.get(i));
				webDriverActions.softClickJS(sectionEleList.get(i));
			}	
			String expected = webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd") && !expected.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(expected);
				webDriverActions.navigateToUrl(betaUrl);
				expected=betaUrl;
			}
			webDriverActions.stopPageLoading();
			actual = webDriverActions.getCurrentPageUrl();
			if (actual.contains("play.google.com"))
			{
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(googlePlayIcon), "Possibly Google Play Icon Is not displayed");
			}
			else
			{
				webDriverActions.softWaitForElementVisibility(headerTxtLogoLnk, 3);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Possibly Element Is Not Visible For This URL "+expected);
			}
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageTitle);

			}
			else {
				webDriverActions.navigateToUrl(pageUrl);
				webDriverActions.softClickJS(hamburgerrBtn);
			}
		}
	}

	public void mobileHeaderHamburgerThirdPartySection(WebElement section,List<WebElement> sectionEleList)
	{
		//it add the urls to the list 
		ArrayList<String> list=new ArrayList<String>();
		list.add(fileUtility.readDataFromPropertyFile("topperlearning"));
		list.add(fileUtility.readDataFromPropertyFile("firstpost"));
		list.add(fileUtility.readDataFromPropertyFile("cnbctv18"));
		list.add(fileUtility.readDataFromPropertyFile("historyindia"));
		list.add(fileUtility.readDataFromPropertyFile("mtvindia"));
		list.add(fileUtility.readDataFromPropertyFile("moneycontrol"));
		list.add(fileUtility.readDataFromPropertyFile("itsnotok"));
		list.add(fileUtility.readDataFromPropertyFile("netrasuraksha"));
		list.add(fileUtility.readDataFromPropertyFile("townHall"));
		list.add(fileUtility.readDataFromPropertyFile("missionPani"));
		list.add(fileUtility.readDataFromPropertyFile("younggenius"));
		list.add(fileUtility.readDataFromPropertyFile("swabhimanbharat"));
		list.add(fileUtility.readDataFromPropertyFile("periodofpride"));
		list.add(fileUtility.readDataFromPropertyFile("influential"));
		list.add(fileUtility.readDataFromPropertyFile("electral"));

		//it add the element of social share icons.
		ArrayList<WebElement> listEle=new ArrayList<WebElement>();
		listEle.add(topLearningTxt);
		listEle.add(firstPostTxt);
		listEle.add(cnbcTxt);
		listEle.add(histotryTxt);
		listEle.add(mtvTxt);
		listEle.add(moneycontrolTxt);
		listEle.add(itsnotokTxt);
		listEle.add(netrasurakshaTxt);
		listEle.add(towmHallTxt);
		listEle.add(missionPaniTxt);
		listEle.add(youngGeniusTxt);
		listEle.add(swabhimanBharatTxt);
		listEle.add(periodofprideTxt);
		listEle.add(influentialLeaderTxt);
		listEle.add(electricalHydraIcon);

		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String pageUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.softClickJS(hamburgerrBtn);
		webDriverActions.continuousScrollTillElement(section, 10);
		webDriverActions.softClickJS(section);
		for (int i = 0; i < sectionEleList.size(); i++)
		{
			String actual = webDriverActions.getAttribute("href",sectionEleList.get(i));
			Logs.info(getClass(), actual);	
			if(actual.contains("town-hall") || actual.contains("netrasuraksha") || actual.contains("mission-paani") || actual.contains("itsnotok") ||actual.contains("swabhimanbharat") || actual.contains("periodofpride") || actual.contains("electralhydrationforhealth") || actual.contains("younggenius") || actual.contains("electralhydrationforhealth") || actual.contains("younggenius") || actual.contains("topperlearning") || actual.contains("moneycontrol") || actual.contains("firstpost") || actual.contains("cnbctv18") || actual.contains("historyindia") || actual.contains("mtvindia"))
			{
				webDriverActions.softHighlightElement(sectionEleList.get(i));
				webDriverActions.softClickJS(sectionEleList.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softClickJS(hamburgerrBtn);
					webDriverActions.continuousScrollTillElement(section, 10);
					webDriverActions.softClickJS(section);
					webDriverActions.softHighlightElement(sectionEleList.get(i));
					webDriverActions.softClickJS(sectionEleList.get(i));
				}	
				webDriverActions.stopPageLoading();
				String expected = webDriverActions.getCurrentPageUrl();
				for(int j=0;j<list.size();j++)
				{
					if(actual.contains(list.get(j)))
					{
						webDriverActions.softWaitForElementVisibility(listEle.get(j), 3);
						softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j)), "Possibly Element Is Not Visible For This URL "+expected);	
					}
				}
			}
			else
			{
				webDriverActions.softHighlightElement(sectionEleList.get(i));
				webDriverActions.softClickJS(sectionEleList.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softClickJS(hamburgerrBtn);
					webDriverActions.continuousScrollTillElement(section, 10);
					webDriverActions.softClickJS(section);
					webDriverActions.softHighlightElement(sectionEleList.get(i));
					webDriverActions.softClickJS(sectionEleList.get(i));
				}	
				webDriverActions.stopPageLoading();
				String expected = webDriverActions.getCurrentPageUrl();
				webDriverActions.softWaitForElementVisibility(headerTxtLogoLnk, 3);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Possibly Element Is Not Visible For This URL "+expected);
			}
			webDriverActions.navigateToUrl(pageUrl);
			webDriverActions.softClickJS(hamburgerrBtn);
			webDriverActions.continuousScrollTillElement(section, 10);
			webDriverActions.softClickJS(section);
		}
		softAssert.assertAll("Issues Found In Validating Hamburger Menu");
	}
	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Hamburger Menu News 18 Initiatives Dropdown Section By clicking on Hamburger Icon it.
	 */
	public void verifyHamburgerNews18InitiativesDropdown()
	{
		mobileHeaderHamburgerThirdPartySection(nw18InitiativeDropDown, nw18InitiativesList);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Hamburger Menu Sections Dropdown Section By clicking on Hamburger Icon it.
	 */
	public void verifyHamburgerMenuSectionDropdown(String server)
	{
		verifyHamburgerSection(sectionList, server);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Hamburger Menu News 18 Group Sites Dropdown Section By clicking on Hamburger Icon it.
	 */
	public void verifyHamburgerNews18GroupSitesDropdown()
	{
		mobileHeaderHamburgerThirdPartySection(groupSitesDropDown, groupSitesList);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Hamburger Menu News 18 Initiatives Dropdown Section By clicking on Hamburger Icon it.
	 */
	public void verifyHamburgerKnowUsDropdown(String server)
	{
		mobileHeaderHamburgerThirdPartySection(knowUsDropDown, knowUsList);
	}

	//	***************Rahul**Business Logic****************

	/**
	 * This method contains the steps to verify Latest News article section navigation
	 */
	public void verifyLatestNews() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(latestNewsHeadline, 6);
		if(latestNewsArticleLinkLst.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */
			for(int i=0;i<latestNewsArticleLinkLst.size();i++)
			{
				webDriverActions.softMouseHover(latestNewsArticleLinkLst.get(i));
				webDriverActions.softClickJS(latestNewsArticleLinkLst.get(i));
				webDriverActions.waitForSecond(1000);
				softAssert.assertTrue(webDriverActions.isElementDisplayed(latestNewsBreadcrum),"Possibly Latest News Breadcrum is not present");
				webDriverActions.navigateBack();
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+latestNewsArticleLinkLst.size());
		}
		softAssert.assertAll("Issues found in this url "+ webDriverActions.getCurrentPageUrl()); 
	}
	public void moreLatestNews() {		
		webDriverActions.scrollDown();
		webDriverActions.softMouseHover(moreLatestNewsBtn);
		String actual2 = webDriverActions.getAttribute("href", moreLatestNewsBtn);
		webDriverActions.softClickJS(moreLatestNewsBtn);
		Logs.info(getClass(),"Clicked on More Latest News Link");
		String expected2 = webDriverActions.getCurrentPageUrl();
		softAssert.assertEquals(actual2,expected2 , "Failed to navigate "+actual2);
		webDriverActions.waitForSecond(1000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(latestNewsBreadcrum),"Unable to display Element"+webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues found in this url "+ webDriverActions.getCurrentPageUrl()); 
	}


	//	***************Rahul**Business Logic****************

	/**
	 * This method contains the steps to verify Latest News article section navigation
	 */
	public void verifyLatestNews(String serverType) {
		webDriverActions.waitForPageToLoad();
		if(latestNewsArticleLinkLst.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<latestNewsArticleLinkLst.size();i++)
			{  
				webDriverActions.softMouseHover(latestNewsArticleLinkLst.get(i));
				webDriverActions.softClickJS(latestNewsArticleLinkLst.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(latestNewsArticleLinkLst.get(i));
					webDriverActions.softScrollToElement(latestNewsArticleLinkLst.get(i));
					String actual = webDriverActions.getAttribute("href", latestNewsArticleLinkLst.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.waitForSecond(2000);
					webDriverActions.softClickJS(latestNewsArticleLinkLst.get(i));
				}

				else {
					webDriverActions.getCurrentPageUrl();
				}
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					Logs.info(getClass(), "Navigated to "+currentPage);
				}
				Logs.info(getClass(),"Clicked Latest News articles link");
				webDriverActions.waitForPageToLoad();
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(latestNewsBreadcrum),"Unable to display Element"+webDriverActions.getCurrentPageUrl());
				webDriverActions.navigateBack();	
				webDriverActions.navigateBack();
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+latestNewsArticleLinkLst.size());
		}
		softAssert.assertAll("Issues found in this url "+ webDriverActions.getCurrentPageUrl()); 
	}
	public void moreLatestNews(String serverType) {	
		webDriverActions.scrollDown();
		webDriverActions.softMouseHover(moreLatestNewsBtn);
		webDriverActions.softClickJS(moreLatestNewsBtn);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(moreLatestNewsBtn);
			webDriverActions.softScrollToElement(moreLatestNewsBtn);
			String actual = webDriverActions.getAttribute("href", moreLatestNewsBtn);
			Logs.info(getClass(), actual);
			webDriverActions.waitForSecond(2000);
			webDriverActions.softClickJS(moreLatestNewsBtn);
		}

		else {
			webDriverActions.getCurrentPageUrl();
		}
		Logs.info(getClass(),"Clicked on More Latest News Link");
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}

		webDriverActions.waitForPageToLoad();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(latestNewsBreadcrum),"Unable to display Element"+webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues found in this url "+ webDriverActions.getCurrentPageUrl()); 
	}

	//	****************Anupam**Business Logic*****************

	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation in home page
	 * @param section
	 * @param artList
	 */
	public void verifyArticlesNavigation(String serverType,WebElement section ,List<WebElement> artList)
	{
		SoftAssert softAssert=new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(section, 5);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softMouseHover(section);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<artList.size() ;i++)
		{
			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			String actualUrl =	webDriverActions.getAttribute("href", artList.get(i));
			Logs.info(getClass(), actualUrl);
			webDriverActions.softClickJS(artList.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				actualUrl =	webDriverActions.getAttribute("href", artList.get(i));
				Logs.info(getClass(), actualUrl);
				webDriverActions.softClickJS(artList.get(i));
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
			String expectedUrl =webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), expectedUrl);
			webDriverActions.softHighlightElement(articleBreadcrumb);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb) , "Unable to Display Element "+articleBreadcrumb+" on "+currentPage);
			if (serverType.equalsIgnoreCase("preProd")) {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
			}		
		}
		softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Movies Widget Article
	 */
	public void verifyMoviesWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,moviesWidgetSectionLnk,moviesWidgetArticleLnk);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of CricketNext Widget Article
	 */
	public void verifyCricketNextWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,cricketNextWidgetSectionLnk,cricketNextWidgetArticleLnk);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of India Widget Article
	 */
	public void verifyIndiaWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,indiaWidgetSectionLnk,indiaWidgetArticleLnk);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget Article
	 */
	public void verifyBusinessWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,businessWidgetSectionLnk,businessWidgetArticleLnk);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to verify image navigation of section in home page	
	 * @param section
	 * @param artList
	 */
	public void verifyImgNavigation(String serverType,WebElement section ,List<WebElement> artList)
	{
		SoftAssert softAssert=new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(section, 5);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softMouseHover(section);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<artList.size() ;i++)
		{
			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			String actualTitle =webDriverActions.getAttribute("title", artList.get(i));
			webDriverActions.softClickJS(artList.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				actualTitle =webDriverActions.getAttribute("title", artList.get(i));
				webDriverActions.softClickJS(artList.get(i));
			}

			webDriverActions.waitForSecond(1000);
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
			webDriverActions.waitForSecond(2000);
			webDriverActions.softHighlightElement(articleBreadcrumb);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb) ,  "Unable to Display Element "+articleBreadcrumb + " on "+currentPage);
			if (serverType.equalsIgnoreCase("preProd")) {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
			}			}
		softAssert.assertAll("Issue Found in HomePage Body Image Navigation");	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Movies Widget Image
	 */
	public void verifyMoviesWidgetImg(String serverType) {
		verifyImgNavigation(serverType,moviesWidgetSectionLnk,moviesWidgetImgLnk);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of CricketNext Widget Image
	 */
	public void verifyCricketNextWidgetImg(String serverType) {
		verifyImgNavigation(serverType,cricketNextWidgetSectionLnk,cricketNextWidgetImgLnk);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of India Widget Image
	 */
	public void verifyIndiaWidgetImg(String serverType) {
		verifyImgNavigation(serverType,indiaWidgetSectionLnk,indiaWidgetImgLnk);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget Image
	 */
	public void verifyBusinessWidgetImg(String serverType) {
		verifyImgNavigation(serverType,businessWidgetSectionLnk,businessWidgetImgLnk);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to Verify the More Widget News Navigation
	 * @param moreLnk
	 * @param breadcrumb
	 */
	public void verifyMoreLnks(String serverType,WebElement moreLnk, WebElement breadcrumb) {
		SoftAssert softAssert=new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		String actualUrl = webDriverActions.getAttribute("href", moreLnk);
		webDriverActions.softHighlightElement(moreLnk);
		webDriverActions.softClickJS(moreLnk);

		webDriverActions.waitForSecond(1000);
		String currentPage = webDriverActions.getCurrentPageUrl();
		Logs.info(getClass(), currentPage);
		softAssert.assertTrue(genericUtility.compareStringsWithIgnoreCase(actualUrl, currentPage),"Failed to navigate "+actualUrl);
		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		} 
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+" on "+currentPage);
		softAssert.assertAll("Issue Found in HomePage Body More Link");	}



	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Movies News
	 */
	public void verifyMoreMoviesLnk(String serverType) {
		verifyMoreLnks(serverType,moreMoviesWidgetLnk, moviesMoreBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More CricketNext News
	 */
	public void verifyMoreCricketNextLnk(String serverType) {
		verifyMoreLnks(serverType,moreCricketNextWidgetLnk, cricketNextBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More India News
	 */
	public void verifyMoreIndiaLnk(String serverType) {
		verifyMoreLnks(serverType,moreIndiaWidgetLnk, indiaBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Business News
	 */
	public void verifyMoreBusinessLnk(String serverType) {
		verifyMoreLnks(serverType,moreBusinessWidgetLnk, businessBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate forward arrow button of horoscope section
	 */
	public void verifyHoroscopeForwardArrow()
	{
		SoftAssert softAssert=new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(horoscopeSectionLnk, 6);
		webDriverActions.softScrollToElement(horoscopeSectionLnk);
		if(webDriverActions.softIsElementDisplayed(horoscopeSectionLnk))
		{
			String prevText = webDriverActions.getTextFromElement(horoscopeActiveText);
			Logs.info(getClass(), prevText+" Text before forward tap");
			webDriverActions.softClickJS(forwardTapButton);
			webDriverActions.waitForSecond(1000);
			String currText = webDriverActions.getTextFromElement(horoscopeActiveText);
			Logs.info(getClass(), currText+" Text after forward tap");
			softAssert.assertNotEquals(prevText, currText, "Forward Tap is not working");
		}
		else 
		{
			softAssert.fail("Possibly element is not present or visible ");
		}
		softAssert.assertAll("Issues found in horoscope section home page");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Backward arrow button of horoscope section
	 */
	public void verifyHoroscopeBackArrow()
	{
		SoftAssert softAssert=new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(horoscopeSectionLnk, 6);
		webDriverActions.softScrollToElement(horoscopeSectionLnk);
		if(webDriverActions.softIsElementDisplayed(horoscopeSectionLnk))
		{
			webDriverActions.waitForSecond(1000);
			webDriverActions.softClickJS(forwardTapButton);
			webDriverActions.waitForSecond(1000);
			String prevText = webDriverActions.getTextFromElement(horoscopeActiveText);
			Logs.info(getClass(), prevText+" Text before backward tap");
			webDriverActions.softClickJS(backwardTapButton);
			webDriverActions.waitForSecond(1000);
			String currText = webDriverActions.getTextFromElement(horoscopeActiveText);
			Logs.info(getClass(), currText+" Text after backward tap");
			softAssert.assertNotEquals(prevText, currText, "Backward Tap is not working");
		}
		else 
		{
			softAssert.fail("Possibly element is not present or visible ");
		}
		softAssert.assertAll("Issues found in horoscope section home page");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate horoscope description for each sign in horoscope section
	 */
	public void verifyHoroscopeDescription(String serverType)
	{
		SoftAssert softAssert=new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String title = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillElement(horoscopeSectionLnk, 6);
		webDriverActions.softScrollToElement(horoscopeSectionLnk);
		softAssert.assertTrue(horoscopeSigns.size()>0, " Possibly Element is Not Visible "+ horoscopeSigns );
		for(int i=0; i<horoscopeSigns.size() ;i++)
		{
			webDriverActions.waitForSecond(2000);
			String horoscopeText = webDriverActions.getTextFromElement(horoscopeActiveText);
			Logs.info(getClass(), horoscopeText);
			webDriverActions.navigateToNewTab(horoscopeSigns.get(i));
			webDriverActions.switchToNewWindow();

			webDriverActions.waitForSecond(1000);
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
			webDriverActions.waitForSecond(1000);
			webDriverActions.softHighlightElement(detailIntro);
			Logs.info(getClass(), "horoscope description  : "+webDriverActions.getTextFromElement(detailIntro));
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(detailIntro) , "Unable to Display description after clicking on "+horoscopeText);
			webDriverActions.closeDriver();
			webDriverActions.waitForSecond(2000);
			webDriverActions.switchToWindow(title);
			webDriverActions.waitForSecond(1000);
			webDriverActions.softClickJS(forwardTapButton);
		}
		softAssert.assertAll("Issues found in horoscope section home page ");
	}

	//------

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of VideoWall Widget Article
	 */
	public void verifyVideoWallArticleNavigation(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(videoWallWidgetArticleLnk, 5);
		webDriverActions.softScrollToElement(videoWallWidgetArticleLnk);
		String actualUrl =	webDriverActions.getAttribute("href", videoWallWidgetArticleLnk);
		webDriverActions.softClickJS(videoWallWidgetArticleLnk);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softScrollToElement(videoWallWidgetArticleLnk);
			actualUrl =	webDriverActions.getAttribute("href", videoWallWidgetArticleLnk);
			webDriverActions.softClickJS(videoWallWidgetArticleLnk);			
		}

		webDriverActions.waitForSecond(1000);
		String currentPage = webDriverActions.getCurrentPageUrl();
		Logs.info(getClass(), currentPage);
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
		webDriverActions.softHighlightElement(videoWallArticleBreadcrumb);
		//		String expectedUrl = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(videoWallArticleBreadcrumb),"Unable to Display Element "+videoWallArticleBreadcrumb+" on "+currentPage);
		softAssert.assertAll("Issue Found in HomePage Body Video Wall Widget");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of VideoWall Widget Image
	 */
	public void verifyVideoWallImgNavigation(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(videoWallWidgetImgLnk, 5);
		webDriverActions.softScrollToElement(videoWallWidgetImgLnk);
		String actualUrl =	webDriverActions.getAttribute("href", videoWallWidgetImgLnk);
		webDriverActions.softClickJS(videoWallWidgetImgLnk);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softScrollToElement(videoWallWidgetImgLnk);
			actualUrl =	webDriverActions.getAttribute("href", videoWallWidgetImgLnk);
			webDriverActions.softClickJS(videoWallWidgetImgLnk);
		}

		webDriverActions.waitForSecond(1000);
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
		webDriverActions.waitForSecond(2000);
		webDriverActions.softHighlightElement(videoWallArticleBreadcrumb);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(videoWallArticleBreadcrumb),"Unable to Display Element "+videoWallArticleBreadcrumb+" on "+currentPage);
		softAssert.assertAll("Issue Found in HomePage Body Video Wall Widget");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of From our shows Widget Article
	 */
	public void verifyFromOurShowsArticleNavigation(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(videoWallWidgetLnk, 5);
		webDriverActions.softScrollToElement(videoWallWidgetLnk);
		webDriverActions.softMouseHover(videoWallWidgetLnk);
		softAssert.assertTrue(fromOurShowsWidgetArticleLnk.size()>0, " Possibly Element is Not Visible "+ fromOurShowsWidgetArticleLnk );
		for(int i=0; i<fromOurShowsWidgetArticleLnk.size() ;i++)
		{
			webDriverActions.softMouseHover(fromOurShowsWidgetArticleLnk.get(i));
			webDriverActions.softScrollToElement(fromOurShowsWidgetArticleLnk.get(i));
			String actualUrl =	webDriverActions.getAttribute("href", fromOurShowsWidgetArticleLnk.get(i));
			Logs.info(getClass(), actualUrl);
			webDriverActions.softClickJS(fromOurShowsWidgetArticleLnk.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(fromOurShowsWidgetArticleLnk.get(i));
				webDriverActions.softScrollToElement(fromOurShowsWidgetArticleLnk.get(i));
				actualUrl =	webDriverActions.getAttribute("href", fromOurShowsWidgetArticleLnk.get(i));
				Logs.info(getClass(), actualUrl);
				webDriverActions.softClickJS(fromOurShowsWidgetArticleLnk.get(i));
			}

			webDriverActions.waitForSecond(1000);
			String currentPage = webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), currentPage);
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
			webDriverActions.softHighlightElement(videoWallArticleBreadcrumb);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(videoWallArticleBreadcrumb) , "Unable to Display Element "+videoWallArticleBreadcrumb+" on "+currentPage);
			if (serverType.equalsIgnoreCase("preProd")) {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
			}	
		}
		softAssert.assertAll("Issue Found in HomePage Body From Our Shows Widget");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of From our shows Widget Image
	 */
	public void verifyFromOurShowsImgNavigation(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(videoWallWidgetLnk, 5);
		webDriverActions.softScrollToElement(videoWallWidgetLnk);
		webDriverActions.softMouseHover(videoWallWidgetLnk);
		softAssert.assertTrue(fromOurShowsWidgetImgLnk.size()>0, " Possibly Element is Not Visible "+ fromOurShowsWidgetImgLnk );
		for(int i=0; i<fromOurShowsWidgetImgLnk.size() ;i++)
		{
			webDriverActions.softMouseHover(fromOurShowsWidgetImgLnk.get(i));
			webDriverActions.softScrollToElement(fromOurShowsWidgetImgLnk.get(i));
			String actualUrl =	webDriverActions.getAttribute("href", fromOurShowsWidgetImgLnk.get(i));
			Logs.info(getClass(), actualUrl);
			webDriverActions.softClickJS(fromOurShowsWidgetImgLnk.get(i));

			webDriverActions.waitForSecond(1000);
			String currentPage = webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), currentPage);
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
			webDriverActions.softHighlightElement(videoWallArticleBreadcrumb);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(videoWallArticleBreadcrumb) , "Unable to Display Element "+videoWallArticleBreadcrumb+" on "+currentPage);
			if (serverType.equalsIgnoreCase("preProd")) {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
			}	
		}
		softAssert.assertAll("Issue Found in HomePage Body From Our Show Widget");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Jump to show Widget 
	 */
	public void verifyJumpToShowNavigation(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(jumpToShowWidgetLnk, 5);
		webDriverActions.mouseHoverAndClick(jumpToShowWidgetLnk);
		softAssert.assertTrue(jumpToShowOptionLnk.size()>0, " Possibly Element is Not Visible "+ jumpToShowOptionLnk );
		for(int i=1; i<jumpToShowOptionLnk.size() ;i++)
		{
			webDriverActions.waitForSecond(1000);
			webDriverActions.softScrollToElement(jumpToShowOptionLnk.get(i));
			String actualUrl =	webDriverActions.getAttribute("value", jumpToShowOptionLnk.get(i));
			Logs.info(getClass(), actualUrl);
			webDriverActions.softClick(jumpToShowOptionLnk.get(i));

			webDriverActions.waitForSecond(1000);
			String currentPage = webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), currentPage);
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
			String expectedUrl =webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), expectedUrl);
			webDriverActions.softHighlightElement(jumpToShowOptionBreadcrumb);
			softAssert.assertTrue(((genericUtility.compareTwoStrings(expectedUrl, actualUrl)) && (webDriverActions.softIsElementDisplayed(jumpToShowOptionBreadcrumb))),"Failed to navigate to"+actualUrl);
			if (serverType.equalsIgnoreCase("preProd")) {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
			}	
			webDriverActions.waitForSecond(2000);
			webDriverActions.mouseHoverAndClick(jumpToShowWidgetLnk);
		}
		softAssert.assertAll("Issue Found in HomePage Body Jump To Show Widget");
	}


	//	*****************************Vipin***Business Logic****************

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
		webDriverActions.continuousScrollTillAllElement(artList, 50);
		for(int i=0; i<artList.size() ;i++)
		{
			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			webDriverActions.softClickJS(artList.get(i));
			webDriverActions.waitForPageToLoad();
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
			webDriverActions.waitForSecond(1000);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in"+currentPage);
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
		webDriverActions.continuousScrollTillAllElement(imgList, 50);
		for(int i=0; i<imgList.size() ;i++)
		{
			webDriverActions.softMouseHover(imgList.get(i));
			webDriverActions.softScrollToElement(imgList.get(i));
			webDriverActions.softClickJS(imgList.get(i));
			webDriverActions.waitForPageToLoad();
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
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) ,  "Unable to Display Element in "+currentPage);
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
		webDriverActions.continuousScrollTillElement(moreLnk, 50);
		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		String actual = webDriverActions.getAttribute("href", moreLnk);
		webDriverActions.softClickJS(moreLnk);
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
		webDriverActions.softHighlightElement(element);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in "+currentPage);
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * @param element
	 * @param breadcrumb
	 * This method is used to Validate the Title Navigation for All Sections
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
		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		webDriverActions.continuousScrollTillElement(breadcrumb, 5);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb), "Unable to Display Element in"+currentPage);
		softAssert.assertAll("Issue in Homepage Body ");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to More Hot and Trending Link and Navigate to all 
	 * the Hot and Trending 
	 */
	public void verifyHotAndTrendingArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,hotAndTrendingWidgetArticleLnk, articleHeaderTxt);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to More Hot and Trending Link and Navigate to all 
	 * the Hot and Trending 
	 */
	public void verifyHotAndTrendingImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , hotAndTrendingWidgetImgLnk, articleHeaderTxt);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Slider Navigation for Webstories Section in Homepage
	 */
	public void verifyWebStoriesSlideNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(webstoriesRightSlideBtn);
		webDriverActions.softScrollToElement(webstoriesRightSlideBtn);
		if (webDriverActions.isElementDisplayed(webstoriesRightSlideBtn)) {
			for (int i = 0; i < webstoriesArticleLnk.size(); i++) {
				if(i==0 || i==1 || i==2 || i==3 )
				{
					softAssert.assertTrue(webDriverActions.isElementDisplayed(webstoriesRightSlideBtn));
					webDriverActions.softMouseHover(webstoriesRightSlideBtn);
					webDriverActions.softScrollToElement(webstoriesRightSlideBtn);
					webDriverActions.softClickJS(webstoriesRightSlideBtn);
					webDriverActions.waitForSecond(1000);
				} 
			}
		}
		else
		{
			softAssert.fail("Webstories Right Slider is not Displayed or Not Clickable ");
		}
		if (webDriverActions.isElementDisplayed(webstoriesLeftSlideBtn)) {
			for (int i = 0; i < webstoriesArticleLnk.size(); i++) {
				if(i==0 || i==1 || i==2 || i==3 )
				{
					softAssert.assertTrue(webDriverActions.isElementDisplayed(webstoriesLeftSlideBtn));
					webDriverActions.softMouseHover(webstoriesLeftSlideBtn);
					webDriverActions.softScrollToElement(webstoriesLeftSlideBtn);
					webDriverActions.softClickJS(webstoriesLeftSlideBtn);
					webDriverActions.waitForSecond(1000);
				} 
			}
		}
		else
		{
			softAssert.fail("Webstories Left Slider is not Displayed or Not Clickable ");
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the See More Link Navigation for Webstories Section in Homepage
	 */
	public void verifyWebstoriesSeeMoreLinkNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(webstoriesSeeMoreLnk, 20);
		webDriverActions.softMouseHover(webstoriesSeeMoreLnk);
		webDriverActions.softScrollToElement(webstoriesSeeMoreLnk);
		String actual = webDriverActions.getAttribute("href", webstoriesSeeMoreLnk);
		webDriverActions.clickJS(webstoriesSeeMoreLnk);
		String currentPage = webDriverActions.getCurrentPageUrl();
		softAssert.assertEquals(actual, currentPage, "Unable to Navigate "+actual);
		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		webDriverActions.softHighlightElement(webstoriesBreadCrumbDiv);
		softAssert.assertTrue(webDriverActions.isElementDisplayed(webstoriesBreadCrumbDiv), "Unable to Display Element in "+currentPage);
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Cricketnext Slider Navigation for Cricketnext Section in Homepage
	 */
	public void verifyCrickNextSliderNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(cricketnextRightSlideBtn, 20);
		webDriverActions.softMouseHover(cricketnextRightSlideBtn.get(0));
		webDriverActions.softScrollToElement(cricketnextRightSlideBtn.get(0));
		for(int i = 1; i<cricketnextRightSlideBtn.size() ; i++)
		{
			String sliderTitle = webDriverActions.getTextFromElement(activeCricketnextTxt);
			Logs.info(getClass(), sliderTitle);
			webDriverActions.softMouseHover(cricketnextRightSlideBtn.get(i));
			webDriverActions.softScrollToElement(cricketnextRightSlideBtn.get(i));
			webDriverActions.softClickJS(cricketnextRightSlideBtn.get(i));
			webDriverActions.waitForSecond(2000);
			String sliderTitleAfterScroll = webDriverActions.getTextFromElement(activeCricketnextTxt);
			Logs.info(getClass(), sliderTitleAfterScroll);
			softAssert.assertNotEquals(sliderTitle, sliderTitleAfterScroll, "Cricket Next slider is not working");
			//			sliderTitle = sliderTitleAfterScroll;
			webDriverActions.waitForSecond(1000);
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Cricketnext Tabs Navigation for Cricketnext Section in Homeoage
	 */
	public void verifyCricketNextTabNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(cricketnextTabLnk.get(0));
		webDriverActions.scrollToElement(cricketnextTabLnk.get(0));
		for(int i=0 ; i<cricketnextTabLnk.size() ; i++)
		{
			webDriverActions.softMouseHover(cricketnextTabLnk.get(i));
			webDriverActions.softScrollToElement(cricketnextTabLnk.get(i));
			String actual = webDriverActions.getAttribute("href", cricketnextTabLnk.get(i));
			webDriverActions.softClickJS(cricketnextTabLnk.get(i));
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
			webDriverActions.softHighlightElement(articleBreadCrumbDiv);
			softAssert.assertTrue(webDriverActions.isElementDisplayed(articleBreadCrumbDiv));
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
	 * @author VipinKumarGawande
	 * This method is used to Verify the Photgallery Slider Navigation for Photogallery Section in Homepage
	 */
	public void verifyPhotogallerySliderNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(photogalleryWidgetImgLnk, 20);
		webDriverActions.softMouseHover(photogalleryRightSliderBtn);
		webDriverActions.softScrollToElement(photogalleryRightSliderBtn);
		if(webDriverActions.isElementDisplayed(photogalleryRightSliderBtn))
		{
			for(int i = 1; i<photogalleryWidgetImgLnk.size() ; i++)
			{
				webDriverActions.softMouseHover(photogalleryRightSliderBtn);
				webDriverActions.softScrollToElement(photogalleryRightSliderBtn);
				webDriverActions.softClickJS(photogalleryRightSliderBtn);
				webDriverActions.waitForSecond(2000);
				webDriverActions.waitForSecond(1000);
				softAssert.assertTrue(webDriverActions.isElementDisplayed(photogalleryRightSliderBtn), "Unable to Display Element "+photogalleryRightSliderBtn);
			}
		}
		else
		{
			softAssert.fail("Photogallery Right Slider is Not Displayed");
		}

		if(webDriverActions.isElementDisplayed(photogalleryLeftSliderBtn))
		{
			for(int i = 1; i<photogalleryWidgetImgLnk.size() ; i++)
			{
				webDriverActions.softMouseHover(photogalleryLeftSliderBtn);
				webDriverActions.softScrollToElement(photogalleryLeftSliderBtn);
				softAssert.assertTrue(webDriverActions.isElementDisplayed(photogalleryLeftSliderBtn), "Unable to Display Element "+photogalleryLeftSliderBtn);
				webDriverActions.softClickJS(photogalleryLeftSliderBtn);
				webDriverActions.waitForSecond(2000);
				webDriverActions.waitForSecond(1000);
			}
		}
		else
		{
			softAssert.fail("Photogallery Left Slider is Not Displayed");
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Video Slider Navigation for Videos Section in Homepage
	 */
	public void verifyVideosSliderNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(videosRightSliderBtn, 20);
		webDriverActions.softMouseHover(videosRightSliderBtn);
		webDriverActions.softScrollToElement(videosRightSliderBtn);
		if(webDriverActions.isElementDisplayed(videosRightSliderBtn))
		{
			for(int i = 0; i<videosSectiontArticleLnk.size() ; i++)
			{
				webDriverActions.softMouseHover(videosRightSliderBtn);
				webDriverActions.softScrollToElement(videosRightSliderBtn);
				softAssert.assertTrue(webDriverActions.isElementDisplayed(videosRightSliderBtn), "Unable to Display Element "+videosRightSliderBtn);
				webDriverActions.softClickJS(videosRightSliderBtn);
				webDriverActions.waitForSecond(2000);
				webDriverActions.waitForSecond(1000);
			}
		}
		else
		{
			softAssert.fail("Possibly Video Section Right Slider Button is not Displayed");
		}

		if(webDriverActions.isElementDisplayed(videosLeftSliderBtn))
		{
			for(int i = 0; i<videosSectiontArticleLnk.size() ; i++)
			{
				webDriverActions.softMouseHover(videosLeftSliderBtn);
				webDriverActions.softScrollToElement(videosLeftSliderBtn);
				softAssert.assertTrue(webDriverActions.isElementDisplayed(videosLeftSliderBtn), "Unable to Display Element "+videosLeftSliderBtn);
				webDriverActions.softClickJS(videosLeftSliderBtn);
				webDriverActions.waitForSecond(2000);
			}
		}
		else
		{
			softAssert.fail("Possibly Video Section Left Slider Button is not Displayed");
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More From News18 Showsha Link Navigation for News18 Showsha Section in Homepage 
	 */
	public void verifyMoreFromNews18ShowshaLinkNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(moreFromNews18ShowshaLnk, 20);
		webDriverActions.softScrollToElement(moreFromNews18ShowshaLnk);
		webDriverActions.softMouseHover(moreFromNews18ShowshaLnk);
		String actual = webDriverActions.getAttribute("href", moreFromNews18ShowshaLnk);
		webDriverActions.softHighlightElement(moreFromNews18ShowshaLnk);
		webDriverActions.softClickJS(moreFromNews18ShowshaLnk);
		webDriverActions.waitForPageToLoad();
		String currentPage =webDriverActions.getCurrentPageUrl();
		softAssert.assertEquals(actual, currentPage , "Unable to Navigate "+actual);
		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		webDriverActions.softHighlightElement(articleBreadCrumbDiv);
		softAssert.assertTrue(webDriverActions.isElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element "+articleBreadCrumbDiv);
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the News18 Showsha Logo Navigation for News18 Showsha Section In Homepage 
	 */
	public void verifyNews18ShowshaLogoNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(news18ShowshaLogoImgLnk, 20);
		webDriverActions.softScrollToElement(news18ShowshaLogoImgLnk);
		webDriverActions.softMouseHover(news18ShowshaLogoImgLnk);
		webDriverActions.softHighlightElement(news18ShowshaLogoImgLnk);
		webDriverActions.softClickJS(news18ShowshaLogoImgLnk);
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
		webDriverActions.softHighlightElement(articleBreadCrumbDiv);
		softAssert.assertTrue(webDriverActions.isElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element "+articleBreadCrumbDiv);
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyMoreVideosLinkNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType,moreVideosLnk, articleBreadCrumbDiv);
	}

	public void verifyBuzzArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,buzzSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyBuzzImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType,buzzSectiontImgLnk, articleHeaderTxt);
	}

	public void verifyMoreBuzzNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreBuzzLnk, articleBreadCrumbDiv);
	}

	public void verifyEducationAndCareerArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , educationAndCareerSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyEducationAndCareerImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , educationAndCareerSectiontImgLnk, articleHeaderTxt);
	}

	public void verifyMoreEducationAndCareerNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreEducationAndCareerLnk, articleBreadCrumbDiv);
	}

	public void verifyTechArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType ,techSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyTechImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , techSectiontImgLnk, articleHeaderTxt);
	}

	public void verifyMoreTechNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreTechLnk , articleBreadCrumbDiv);
	}

	public void verifyAutoArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , autoSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyAutoImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , autoSectiontImgLnk, articleHeaderTxt);
	}

	public void verifyMoreAutoNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreAutoLnk , articleBreadCrumbDiv);
	}

	public void verifyWorldArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , worldSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyWorldImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , worldSectiontImgLnk, articleHeaderTxt);
	}

	public void verifyMoreWorldNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreWorldLnk , articleBreadCrumbDiv);
	}

	public void verifySportsArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , sportsSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifySportsImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , sportsSectiontImgLnk, articleHeaderTxt);
	}

	public void verifyMoreSportsNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreSportsLnk , articleBreadCrumbDiv);
	}

	public void verifyLifestyleArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , lifestyleSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyLifestyleImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , lifestyleSectiontImgLnk, articleHeaderTxt);
	}

	public void verifyMoreLifestyleNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreLifestyleLnk , articleBreadCrumbDiv);
	}

	public void verifyHealthAndFitnessArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , healthAndFitnessSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyHealthAndFitnessImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , healthAndFitnessSectiontImgLnk, articleHeaderTxt);
	}

	public void verifyMoreHealthAndFitnessNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreHealthAndFitnessLnk , articleBreadCrumbDiv);
	}

	public void verifyExplainersArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , explainersSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyExplainersImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , explainersSectiontImgLnk, articleHeaderTxt);
	}

	public void verifyMoreExplainersNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreExplainersLnk , articleBreadCrumbDiv);
	}

	public void verifyOpinionArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , opinionSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyOpinionImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , opinionSectiontImgLnk, articleHeaderTxt);
	}

	public void verifyMoreOpinionNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreOpinionLnk , articleBreadCrumbDiv);
	}

	public void verifyPoliticsArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , politicsSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyPoliticsImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , politicsSectiontImgLnk, articleHeaderTxt);
	}

	public void verifyMorePoliticsNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , morePoliticsLnk , articleBreadCrumbDiv);
	}

	public void verifyFootballArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , footballSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyFootballImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , footballSectiontImgLnk, articleHeaderTxt);
	}

	public void verifyMoreFootballNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreFootballLnk , articleBreadCrumbDiv);
	}

	public void verifyNews18ShowshaArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , news18ShowshaSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyNews18ShowshaImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , news18ShowshaSectiontImgLnk, articleHeaderTxt);
	}

	public void verifyMorePhotogalleryLnkNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , morePhotogalleryLnk, articleBreadCrumbDiv);
	}

	public void verifyVideosSectionArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , videosSectiontArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyVideosSectionImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , videosSectiontImgLnk, articleBreadCrumbDiv);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Navigate the Article Text Navigation for Webstories Navigation
	 */
	public void verifyWebstoriesArticleNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String title = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillAllElement(webstoriesArticleLnk, 10);
		for(int i=0; i<webstoriesArticleLnk.size() ;i++)
		{
			webDriverActions.softMouseHover(webstoriesArticleLnk.get(i));
			webDriverActions.softScrollToElement(webstoriesArticleLnk.get(i));
			webDriverActions.softClickJS(webstoriesArticleLnk.get(i));
			webDriverActions.switchToNewWindow();
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(1000);
			String currentPage =webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			}
			webDriverActions.softHighlightElement(nextWebstoriesBtn);
			webDriverActions.waitForSecond(1000);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(nextWebstoriesBtn) , "Unable to Display Element "+nextWebstoriesBtn+ " in "+webDriverActions.getCurrentPageUrl());;
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(title);
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Navigate the Image Navigation for Webstories Navigation
	 */
	public void verifyWebstoriesImageNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String title = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillAllElement(webstoriesImgLnk, 10);
		webDriverActions.softScrollToElement(webstoriesImgLnk.get(0));
		webDriverActions.softMouseHover(webstoriesImgLnk.get(0));
		for(int i=0; i<webstoriesImgLnk.size() ;i++)
		{
			webDriverActions.softMouseHover(webstoriesImgLnk.get(i));
			webDriverActions.softScrollToElement(webstoriesImgLnk.get(i));
			webDriverActions.softClickJS(webstoriesImgLnk.get(i));
			webDriverActions.switchToNewWindow();
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(2000);
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
			webDriverActions.softHighlightElement(nextWebstoriesBtn);
			webDriverActions.waitForSecond(1000);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(nextWebstoriesBtn) , "Unable to Display Element "+nextWebstoriesBtn+ " in "+webDriverActions.getCurrentPageUrl());;
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(title);
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyPhotogallerySectionArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , photogalleryWidgetArticleLnk, articleHeaderTxt);
	}

	public void verifyPhotogallerySectionImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , photogalleryWidgetImgLnk, articleHeaderTxt);
	}

	public void verifyPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , priorityPanelArticleLnk, articleHeaderTxt);
	}

	public void verifyPriorityPanelImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , priorityPanelImgLnk, articleHeaderTxt);
	}

	public void verifyTopStoriesArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , topStoriesWidgetArticleLnk , articleHeaderTxt);
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
}

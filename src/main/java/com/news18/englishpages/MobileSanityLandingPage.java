package com.news18.englishpages;

import java.util.Currency;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class MobileSanityLandingPage {
	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	public SoftAssert softAssert = new SoftAssert();

	public MobileSanityLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//*****************************************Vipin***Webelements**********************************

	/*List of Priority Article Links in News18 Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]/h1/a | (//ul[@class='story_listing'])[1]//a")
	private List<WebElement> priorityPanelArticleLnk;

	/*Article Header Text in Article Consumption Page*/
	@FindBy(xpath = "//h1[contains(@class,'gallery_tilte')] | //div[contains(@class,'article_main')]/h1 | //div[contains(@class,'TstoryHead')]/h1 | //div[contains(@class,'pht-artcl')]/h1 | //div[contains(@class,'article-container')]//h1 ")
	private WebElement articleHeaderTxt;

	/*List of Priority Article Links in News18 Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_story_img')]/a/img | (//ul[@class='story_listing'])[1]//div[contains(@class,'img')]//img[@title]")
	private List<WebElement> priorityPanelImgLnk;

	/*Top Stories Widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_stories')]/a[@href='/news/']/parent::div/child::ul/li/a")
	private List<WebElement> topStoriesWidgetArticleLnk;

	/*List of Hot and Trending Widget articles Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'host_trending')]//h2[.='Hot & Trending']/ancestor::div[contains(@class,'host_trending')]/ul//div//h2/a")
	private List<WebElement> hotAndTrendingWidgetArticleLnk;

	/*List of Hot and Trending Widget Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'host_trending')]//h2[.='Hot & Trending']/ancestor::div[contains(@class,'host_trending')]/ul//a[contains(@class,'img')]//img[@title]")
	private List<WebElement> hotAndTrendingWidgetImgLnk;

	/*More Hot and Trending articles Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'host_trending')]//h2[.='Hot & Trending']/ancestor::div[contains(@class,'host_trending')]/ul/div[contains(@class,'more_story')]/a")
	private WebElement moreHotAndTrendingLnk;

	/* List Of WebStories Article Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'story_list')]//a[contains(@href,'/web-stories/')]/ancestor::div[contains(@class,'story_list')]//div[contains(@class,'stroy_list_row')]/a")
	private List<WebElement> webstoriesArticleLnk;

	/* WebStoreis Next Story Button */
	@FindBy(xpath = "//button[contains(@aria-label,'Next page')]")
	private WebElement nextWebstoriesBtn;

	/* List Of WebStories Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'story_list')]//a[contains(@href,'/web-stories/')]/ancestor::div[contains(@class,'story_list')]//div[contains(@class,'stroy_list_row')]/a//img[@title]")
	private List<WebElement> webstoriesImgLnk;

	/*List of Right Slide Button for Webstories Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'story_list')]//a[contains(@href,'/web-stories/')]/ancestor::div[contains(@class,'story_list')]//div[contains(@class,'next_arrow')]//button")
	private List<WebElement> webstoriesRightSlideBtn;

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
	@FindBy(xpath = "//div[contains(@class,'top') or contains(@class,'article')]/preceding-sibling::div")
	private WebElement articleBreadCrumbDiv;

	/* Video Article Breadcrumb Division in Video Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'BreadCum')]")
	private WebElement videoBreadCrumbDiv;

	/* List of Slider Button for Cricknext in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet_section')]/div[contains(@class,'glide')]//button")
	private List<WebElement> cricketnextRightSlideBtn;

	/* Active Arrow Button for CricketNext Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet_section')]/div[contains(@class,'glide')]//button[contains(@class,'active')]")
	private WebElement activeCricketnextBtn;

	/* Active Cricketnext Article for Cricketnext Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet_section')]//li[contains(@class,'active')]//h3")
	private WebElement activeCricketnextTxt;

	/* List of Cricknext Widget Article Text in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cn_widget')]/a/div[contains(@class,'txt')]")
	private List<WebElement> cricketnextArticleLnk;

	/*List of CricketNext Widget Article Image in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet_section')]/div[contains(@class,'glide')]//li[not (contains(@class,'clone'))]/a//img")
	private List<WebElement> cricketnextImgLnk;

	/* List of Cricketnext Tabs Link in CricketNext Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet_section')]/div[contains(@class,'tab')]/a[not (contains(@class,'active'))]")
	private List<WebElement> cricketnextTabLnk;

	/*List of Photogallery Article Links in Photogallery Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photogalleries')]//div[contains(@class,'photogallerie_row') and (not (contains(@class,'clone')))]/a")
	private List<WebElement> photogalleryWidgetArticleLnk;

	/*List of Photogallery Image Links in Photogallery Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photogalleries')]//div[contains(@class,'photogallerie_row') and (not (contains(@class,'clone')))]/a//img[@title]")
	private List<WebElement> photogalleryWidgetImgLnk;

	/* List of Slider Button in Photogallery Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photogalleries')]//div[contains(@class,'bullets')]/button")
	List<WebElement> photogalleryRightSliderBtn;

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

	/* More Photogalleries Link for Photogallery Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photogalleries')]//div[contains(@class,'load_more')]/a")
	private WebElement morePhotogalleryLnk;

	/* List of Slider Button in Videos Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'video_section')]//div[contains(@class,'bullets')]/button")
	List<WebElement> videosRightSliderBtn;

	/*List of Videos Article Links in Videos Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'video_section')]//div[contains(@class,'video_slider_row') and (not (contains(@class,'clone')))]//figure/a")
	private List<WebElement> videosSectiontArticleLnk;

	/*List of Videos Image Links for Videos Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'video_section')]//div[contains(@class,'video_slider_row') and (not (contains(@class,'clone')))]//figure/a//img")
	private List<WebElement> videosSectiontImgLnk;

	/* More Videos Link for Videos Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photogalleries')]//div[contains(@class,'load_more')]/a")
	private WebElement moreVideosLnk;

	/*List of Buzz Article Link for Buzz Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/buzz/']/parent::div/ul/li/a")
	private List<WebElement> buzzSectiontArticleLnk;

	/*List of Buzz Image Links for Buzz Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/buzz/']/parent::div/ul/li/a//img")
	private List<WebElement> buzzSectiontImgLnk;

	/* More Buzz News Link for Buzz Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/buzz/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreBuzzLnk;

	/*List of Buzz Article Link for Buzz Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/education-career/']/parent::div/ul/li/a")
	private List<WebElement> educationAndCareerSectiontArticleLnk;

	/*List of Buzz Image Links for Buzz Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/education-career/']/parent::div/ul/li/a//img")
	private List<WebElement> educationAndCareerSectiontImgLnk;

	/* More Buzz News Link for Buzz Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/education-career/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreEducationAndCareerLnk;

	/*List of Tech Article Link for Tech Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/tech/']/parent::div/ul/li/a")
	private List<WebElement> techSectiontArticleLnk;

	/*List of Tech Image Links for Tech Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/tech/']/parent::div/ul/li/a//img")
	private List<WebElement> techSectiontImgLnk;

	/* More Tech News Link for Tech Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/tech/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreTechLnk;

	/*List of Auto Article Link for Auto Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/auto/']/parent::div/ul/li/a")
	private List<WebElement> autoSectiontArticleLnk;

	/*List of Auto Image Links for Auto Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/auto/']/parent::div/ul/li/a//img")
	private List<WebElement> autoSectiontImgLnk;

	/* More Auto News Link for Auto Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/auto/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreAutoLnk;

	/*List of World Article Link for World Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/world/']/parent::div/ul/li/a")
	private List<WebElement> worldSectiontArticleLnk;

	/*List of World Image Links for World Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/world/']/parent::div/ul/li/a//img")
	private List<WebElement> worldSectiontImgLnk;

	/* More World News Link for World Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/world/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreWorldLnk;

	/*List of Sports Article Link for Sports Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/sports/']/parent::div/ul/li/a")
	private List<WebElement> sportsSectiontArticleLnk;

	/*List of Sports Image Links for Sports Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/sports/']/parent::div/ul/li/a//img")
	private List<WebElement> sportsSectiontImgLnk;

	/* More Sports News Link for Sports Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/sports/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreSportsLnk;

	/*List of Lifestyle Article Link for Lifestyle Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/lifestyle/']/parent::div/ul/li/a")
	private List<WebElement> lifestyleSectiontArticleLnk;

	/*List of Lifestyle Image Links for Lifestyle Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/lifestyle/']/parent::div/ul/li/a//img")
	private List<WebElement> lifestyleSectiontImgLnk;

	/* More Lifestyle News Link for Lifestyle Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/lifestyle/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreLifestyleLnk;

	/*List of Health and Fitness Article Link for Health and Fitness Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/lifestyle/health-and-fitness/']/parent::div/ul/li/a")
	private List<WebElement> healthAndFitnessSectiontArticleLnk;

	/*List of Health and Fitness Image Links for Health and Fitness Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/lifestyle/health-and-fitness/']/parent::div/ul/li/a//img")
	private List<WebElement> healthAndFitnessSectiontImgLnk;

	/* More Health and Fitness News Link for Health and Fitness Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/lifestyle/health-and-fitness/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreHealthAndFitnessLnk;

	/*List of Health and Fitness Article Link for Health and Fitness Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/explainers/']/parent::div/ul/li/a")
	private List<WebElement> explainersSectiontArticleLnk;

	/*List of Health and Fitness Image Links for Health and Fitness Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/explainers/']/parent::div/ul/li/a//img")
	private List<WebElement> explainersSectiontImgLnk;

	/* More Health and Fitness News Link for Health and Fitness Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/explainers/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreExplainersLnk;

	/*List of Opinion Article Link for Opinion Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/opinion/']/parent::div/ul/li/a")
	private List<WebElement> opinionSectiontArticleLnk;

	/*List of Opinion Image Links for Opinion Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/opinion/']/parent::div/ul/li/a//img")
	private List<WebElement> opinionSectiontImgLnk;

	/* More Opinion News Link for Opinion Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/opinion/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreOpinionLnk;

	/*List of politics Article Link for politics Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/politics/']/parent::div/ul/li/a")
	private List<WebElement> politicsSectiontArticleLnk;

	/*List of politics Image Links for politics Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/politics/']/parent::div/ul/li/a//img")
	private List<WebElement> politicsSectiontImgLnk;

	/* More politics News Link for politics Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/politics/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement morePoliticsLnk;

	/*List of Football Article Link for Football Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/football/']/parent::div/ul/li/a")
	private List<WebElement> footballSectiontArticleLnk;

	/*List of Football Image Links for Football Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/football/']/parent::div/ul/li/a//img")
	private List<WebElement> footballSectiontImgLnk;

	/* More Football News Link for Football Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/football/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreFootballLnk;

	/*List of News18 Showsha Article Link for News18 Showsha Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'ss_widget')]//div[contains(@class,'ss_rows')]/a[contains(@class,'row')]")
	private List<WebElement> news18ShowshaSectiontArticleLnk;

	/*List of Football Image Links for Football Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'ss_widget')]//div[contains(@class,'ss_rows')]/a//img[@class] | //div[contains(@class,'ss_widget')]//div[contains(@class,'ss_rows')]/a//img[@title]")
	private List<WebElement> news18ShowshaSectiontImgLnk;

	/* More Football News Link for Football Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'ss_widget')]/a")
	private WebElement moreFromNews18ShowshaLnk;

	/* News18 Showsha Logo Image Link for News18 Showsha Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'ss_widget')]/div[contains(@class,'header')]/a/img[contains(@src,'showsha')]")
	private WebElement news18ShowshaLogoImgLnk;


	//***********************************Anupam***Webelemt************************

	/* photo section Link in Homepage */
	@FindBy(xpath ="(//div[contains(@class,'photogallerie')]//a[contains(@href,'/photogallery')])[1]" )
	private WebElement photoWidgetSectionLnk;

	/* movie section Link in Homepage */
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/movies/']" )
	private WebElement moviesWidgetSectionLnk;

	/*movie widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/movies/']/parent::div/ul/li/a")
	private List<WebElement> moviesWidgetArticleLnk;

	/*movie widget image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/movies/']/parent::div/ul/li//img")
	private List<WebElement> moviesWidgetImgLnk;

	/*movie  article body Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'article-body')])[1]")
	private WebElement moviesArticleBody;

	/*movie  article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')]/span)[1]  |  (//div[contains(@class,'breadcum')])[1]")
	private WebElement moviesArticleBreadcrumb;

	/*movie  article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')]/h1)[1]")
	private WebElement moviesMoreBreadcrumb;

	/*more movies Lnk present in Home Page*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/movies/']/parent::div/div/a")
	private WebElement moreMoviesWidgetLnk;

	////------cricketnext

	/* CricketNext section Link in Homepage */
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/cricketnext/']" )
	private WebElement cricketNextWidgetSectionLnk;

	/*CricketNext widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/cricketnext/']/parent::div/ul/li/a")
	private List<WebElement> cricketNextWidgetArticleLnk;

	/*CricketNext widget image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/cricketnext/']/parent::div/ul/li//img")
	private List<WebElement> cricketNextWidgetImgLnk;

	/*more CricketNext Lnk present in Home Page*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/cricketnext/']/parent::div/div/a")
	private WebElement moreCricketNextWidgetLnk;

	/*movie  article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')]/p)[1]")
	private WebElement cricketNextBreadcrumb;

	/*Header Text Link Present in article link*/
	@FindBy(xpath ="//div[contains(@class,'crum') or contains(@class,'breadcum') or contains(@class,'brdc')]  | //ul[contains(@class, 'bread') or contains(@class,'brdc')] | //h1")
	private WebElement articleBreadcrumb;


	////------india

	/* india section Link in Homepage */
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/india/']" )
	private WebElement indiaWidgetSectionLnk;

	/*india widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/india/']/parent::div/ul/li/a")
	private List<WebElement> indiaWidgetArticleLnk;

	/*india widget image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/india/']/parent::div/ul/li//img")
	private List<WebElement> indiaWidgetImgLnk;

	/*more india Lnk present in Home Page*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/india/']/parent::div/div/a")
	private WebElement moreIndiaWidgetLnk;

	/*india article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')]/h1)[1]")
	private WebElement indiaBreadcrumb;


	////------business

	/* business section Link in Homepage */
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/business/']" )
	private WebElement businessWidgetSectionLnk;

	/*business widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/business/']/parent::div/ul/li/a")
	private List<WebElement> businessWidgetArticleLnk;

	/*business widget image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/business/']/parent::div/ul/li//img")
	private List<WebElement> businessWidgetImgLnk;

	/*more business Lnk present in Home Page*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/business/']/parent::div/div/a")
	private WebElement moreBusinessWidgetLnk;

	/*business article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')]/h1)[1]")
	private WebElement businessBreadcrumb;

	////------videowall
	/*video wall widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'videoWall')]//a")
	private WebElement videoWallWidgetArticleLnk;

	/*video wall article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'BreadCum')]/span)[1]")
	private WebElement videoWallArticleBreadcrumb;

	/*video wall widget image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'videoWall')]//img")
	private WebElement videoWallWidgetImgLnk;

	/*fromOurShows widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'story_listing_left')]/a[@href='/videos/']/parent::div/h2/a")
	private List<WebElement> fromOurShowsWidgetArticleLnk;

	/*fromOurShows widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'story_listing_left')]/a[@href='/videos/']/ancestor::li/a")
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

	/*Horoscope Section Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_section')]//a")
	private WebElement horoscopeSectionLnk;

	/*Horoscope Active Text in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_slider_row glide__slide--active')]/p")
	private WebElement horoscopeActiveText;

	/*Forward tap Button in Horoscope Section in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_section')]//button[contains(@class,'arrow--next')]")
	private WebElement forwardTapButton;

	/*Backward tap Button in Horoscope Section in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_section')]//button[contains(@class,'arrow--prev')]")
	private WebElement backwardTapButton;

	/*Astrology Signs present under Horoscope sub module*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_slider_row') and (not(contains(@class,'glide__slide--clone')))]")
	private  List<WebElement> horoscopeSigns;

	/*horoscope info present in Horoscope Section in Homepage*/
	@FindBy(xpath ="//p[contains(@class,'horoscope_info')]")
	private WebElement horoscopeInfo;

	/*video wall widget Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'video_section')]//p[contains(.,'Videos Wall')]")
	private WebElement videoWallWidgetLnk;

	/**************Sanjeeb*************/

	@FindBy(xpath ="//div[contains(@class,'header')]")
	private WebElement indianOfTheYearTxt;

	/*list of sections present in Line One Section Bar present at the header of Homepage*/
	@FindBy(xpath ="//div[contains(@class,'L1_neuWrapper')]//li/a")
	private List<WebElement> lineOneSectionELementLnk;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'news_page') or contains(@class,'brade_crum') or contains(@class,'navbar-header')] | //div[contains(@class,'CN-PageWrap')] | //div[contains(@class,'story_container')] | //div[contains(@class,'videosSliderWrapper')] | //div[contains(@class,'photoGalleryWrapper')] | //div[contains(@class,'main_header')]")
	private WebElement headerTxtLogoLnk;

	/*Hamburger Icon Present On the header Of Mobile English Home Page*/
	@FindBy(xpath ="//div[contains(@class,'Hamburger_icon')]")
	private WebElement hamburgerrIcon;

	/*Language Dropdown Icon Present On the header Of Mobile English Home Page*/
	@FindBy(xpath ="//div[contains(@class,'language_click')]")
	private WebElement languageIcon;

	/*Tracker Present On Hamburger Menu After Clicking on The Hamburger Icon Present on the header Of Mobile English Home Page*/
	@FindBy(xpath ="//a[contains(@id,'trackerClickMenu')]")
	private WebElement trackerIcon;

	/*Tracker Header Logo Present On Tracker Page After Clicking On the Tracker Icon Present on Hamburger Menu ofMobile English Home Page*/
	@FindBy(xpath ="//div[contains(@class,'virus bounce')]")
	private WebElement trackerLogo;

	/*googlePlay Icon Present After Clicking on open App present in Hamburger Menu*/
	@FindBy(xpath ="(//header)[1]")
	private WebElement googlePlayIcon;

	/*cancel icon Present on Tracker page*/
	@FindBy(xpath ="//div[contains(@class,'cross-icon')]")
	private WebElement cancelIcon;

	/*Open in App Icon Present On the Hamburger Menu of  Mobile English Home Page*/
	@FindBy(xpath ="((//div[contains(@class,'left')])[1]//ul//a)[2]")
	private WebElement openInAppIcon;

	/*hamburger Section Header Icons present after clicking on hamburger Icon of Mobile English Home Page*/
	@FindBy(xpath ="(//div[contains(@class,'left')])[1]//ul//a")
	private List<WebElement> hamburgerHeaderIcon;

	/*List of link present inside In Trends Section Present On the header Of Hamburger Menu Mobile English Home Page*/
	@FindBy(xpath ="//div[contains(@class,'nav_main')]//ul[contains(@class,'inTrendsList')]//li/a")
	private List<WebElement> inTrendsList;

	/*List of link present inside Section Dropdown Icon Present On the header Of Hamburger Menu Mobile English Home Page*/
	@FindBy(xpath ="(//div[contains(@class,'headerNav_slide')])[1]/ul/li/a")
	private List<WebElement> sectionList;
	
	/*Topics Links articles present on Homepage*/
	@FindBy(xpath ="//a[contains(@href,'https://www.news18.com/topics/') and contains(@onclick,'Footer')]")
	private List<WebElement> topicslinks;

	/**
	 * This method uses common logic for clicking and navigating Article pages
	 * @param serverType
	 * @param artList
	 * @param element
	 */
	public void verifyArticleNavigation(String serverType , List<WebElement> artList , WebElement element)
	{
		SoftAssert softAssert = new SoftAssert(); 
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillElement(artList.get(0), 10);
		webDriverActions.softScrollToElement(artList.get(0));
		//		webDriverActions.softMouseHover(artList.get(0));
		//		webDriverActions.waitForSecond(2000);
		for(int i=0; i<1 ;i++)
		{
			//			webDriverActions.waitForSecond(1000);
			//			webDriverActions.softMouseHover(artList.get(i));
			//			webDriverActions.softScrollToElement(artList.get(i));
			String actual =	webDriverActions.getAttribute("href", artList.get(i));
			Logs.info(getClass(), actual);
			//			webDriverActions.waitForSecond(2000);
			webDriverActions.softWaitForElementVisibility(artList.get(i), 3);
			webDriverActions.softClickJS(artList.get(i));
			String currentPage =webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), currentPage);
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				actual = webDriverActions.getAttribute("href", artList.get(i));
				Logs.info(getClass(), actual);
				//				webDriverActions.waitForSecond(2000);
				webDriverActions.softClickJS(artList.get(i));
			}
			if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			//			webDriverActions.waitForPageToLoad();
			webDriverActions.softHighlightElement(element);
			//			webDriverActions.waitForSecond(2000);
			webDriverActions.softWaitForElementVisibility(element, 3);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in " +currentPage);
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * This method uses common logic for clicking and navigating Article pages
	 * @param serverType
	 * @param artList
	 * @param element
	 */
	public void verifyPriorityArticleNavigation(String serverType , List<WebElement> artList , WebElement element)
	{
		SoftAssert softAssert = new SoftAssert(); 
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(artList, 30);
		for(int i=0; i<artList.size() ;i++)
		{
			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			webDriverActions.softClickJS(artList.get(i));
			webDriverActions.waitForSecond(1000);
			String currentPage =webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), currentPage);
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
			{
				webDriverActions.refreshPage();
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				webDriverActions.softClickJS(artList.get(i));
				webDriverActions.waitForSecond(1000);
			}
			if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			}
			webDriverActions.softHighlightElement(element);
			webDriverActions.softWaitForElementVisibility(element, 3);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in " +currentPage);
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

	public void verifyPriorityPanelArticleNavigation(String serverType)
	{
		verifyPriorityArticleNavigation( serverType,priorityPanelArticleLnk, articleBreadcrumb);
	}

	public void verifyNews18ShowshaArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,news18ShowshaSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyCricketNextArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,cricketnextArticleLnk, articleHeaderTxt);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to More Hot and Trending Link and Navigate to all 
	 * the Hot and Trending 
	 */
	public void verifyHotAndTrendingArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,hotAndTrendingWidgetArticleLnk , articleHeaderTxt);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Photgallery Slider Navigation for Photogallery Section in Homepage
	 */
	public void verifyPhotogallerySliderNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(photogalleryRightSliderBtn.get(0));
		webDriverActions.softScrollToElement(photogalleryRightSliderBtn.get(0));
		for(int i = 1; i<photogalleryRightSliderBtn.size() ; i++)
		{
			String sliderTitle = webDriverActions.getTextFromElement(activePhotgallerySlider);
			Logs.info(getClass(), sliderTitle);
			webDriverActions.softMouseHover(photogalleryRightSliderBtn.get(i));
			webDriverActions.softScrollToElement(photogalleryRightSliderBtn.get(i));
			webDriverActions.softClickJS(photogalleryRightSliderBtn.get(i));
			webDriverActions.waitForSecond(2000);
			String sliderTitleAfterScroll = webDriverActions.getTextFromElement(activePhotgallerySlider);
			Logs.info(getClass(), sliderTitleAfterScroll);
			softAssert.assertNotEquals(sliderTitle, sliderTitleAfterScroll, "Photo gallery slider is not working");
			//			sliderTitle = sliderTitleAfterScroll;
			webDriverActions.waitForSecond(1000);
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
		webDriverActions.softMouseHover(videosRightSliderBtn.get(0));
		webDriverActions.softScrollToElement(videosRightSliderBtn.get(0));
		for(int i = 1; i<videosRightSliderBtn.size() ; i++)
		{
			String sliderTitle = webDriverActions.getTextFromElement(activeVideosSlider);
			Logs.info(getClass(), sliderTitle);
			webDriverActions.softMouseHover(videosRightSliderBtn.get(i));
			webDriverActions.softScrollToElement(videosRightSliderBtn.get(i));
			webDriverActions.softClickJS(videosRightSliderBtn.get(i));
			webDriverActions.waitForSecond(2000);
			String sliderTitleAfterScroll = webDriverActions.getTextFromElement(activeVideosSlider);
			Logs.info(getClass(), sliderTitleAfterScroll);
			softAssert.assertNotEquals(sliderTitle, sliderTitleAfterScroll, "Videos Slider is not working");
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Movies Widget Article
	 */
	public void verifyMoviesWidgetArticle(String serverType) {
		verifyArticlesNavigation(moviesWidgetSectionLnk,moviesWidgetArticleLnk,serverType);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation in home page
	 * @param section
	 * @param artList
	 */
	public void verifyArticlesNavigation(WebElement section ,List<WebElement> artList ,String serverType)
	{
		SoftAssert softAssert=new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softScrollToElement(moviesWidgetSectionLnk);
		webDriverActions.continuousScrollTillElement(section, 5);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<1 ;i++)
		{
			String actualUrl =	webDriverActions.getAttribute("href", artList.get(i));
			Logs.info(getClass(), actualUrl);
			webDriverActions.softWaitForElementVisibility(artList.get(i), 3);
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
			Logs.info(getClass(), currentPage);
			softAssert.assertEquals(actualUrl, currentPage , "Unable to Navigate "+actualUrl);

			if (serverType.equalsIgnoreCase("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			webDriverActions.softHighlightElement(moviesArticleBreadcrumb);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(moviesArticleBreadcrumb) , "Unable to Display Element "+moviesArticleBreadcrumb+" after Clicking on "+actualUrl);
		}
		softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	

	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of CricketNext Widget Article
	 */
	public void verifyCricketNextWidgetArticle(String serverType) {
		verifyArticlesNavigation(cricketNextWidgetSectionLnk,cricketNextWidgetArticleLnk,serverType);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of India Widget Article
	 */
	public void verifyIndiaWidgetArticle(String serverType) {
		verifyArticlesNavigation(indiaWidgetSectionLnk,indiaWidgetArticleLnk,serverType);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget Article
	 */
	public void verifyBusinessWidgetArticle(String serverType) {
		verifyArticlesNavigation(businessWidgetSectionLnk,businessWidgetArticleLnk,serverType);
	}

	public void verifyBuzzArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,buzzSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyEducationAndCareerArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,educationAndCareerSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyTechArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,techSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyAutoArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, autoSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyWorldArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,worldSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifySportsArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,sportsSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyLifestyleArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,lifestyleSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyHealthAndFitnessArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,healthAndFitnessSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyExplainersArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,explainersSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyOpinionArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,opinionSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyPoliticsArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,politicsSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyFootballArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , footballSectiontArticleLnk, articleHeaderTxt);
	}

	public void verifyWebstoriesArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,webstoriesArticleLnk, nextWebstoriesBtn);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of VideoWall Widget Article
	 */
	public void verifyVideoWallArticleNavigation(String serverType)
	{
		SoftAssert softAssert=new SoftAssert();
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
		softAssert.assertTrue(genericUtility.compareStringsWithIgnoreCase(actualUrl, currentPage),"Failed to navigate "+actualUrl);

		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		} 
		webDriverActions.waitForPageToLoad();
		//		webDriverActions.waitForSecond(2000);
		webDriverActions.softHighlightElement(videoWallArticleBreadcrumb);
		//		String expectedUrl = webDriverActions.getCurrentPageUrl();
		//		softAssert.assertEquals(actualUrl, expectedUrl , "Unable to Navigate "+actualUrl);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(videoWallArticleBreadcrumb),"Unable to Display Element "+videoWallArticleBreadcrumb+ " after Clicking on "+actualUrl);
		softAssert.assertAll("Issue Found in HomePage Body Video Wall Widget");
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate horoscope description for each sign in horoscope section
	 */
	public void verifyHoroscopeDescription()
	{
		SoftAssert softAssert=new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(horoscopeSectionLnk, 6);
		webDriverActions.softScrollToElement(horoscopeSectionLnk);
		softAssert.assertTrue(horoscopeSigns.size()>0, " Possibly Element is Not Visible "+ horoscopeSigns );
		for(int i=0; i<horoscopeSigns.size() ;i++)
		{
			String horoscopeText = webDriverActions.getTextFromElement(horoscopeActiveText);
			Logs.info(getClass(), horoscopeText+" Text before forward tap");
			//			webDriverActions.waitForSecond(2000);
			webDriverActions.softHighlightElement(horoscopeInfo);
			Logs.info(getClass(), "horoscope description  : "+webDriverActions.getTextFromElement(horoscopeInfo));
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(horoscopeInfo) , "Unable to Display description for "+horoscopeText);
			webDriverActions.softClickJS(forwardTapButton);
		}
		softAssert.assertAll("Issues found in horoscope section home page ");
	}

	public void verifyPhotogallerySectionArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,photogalleryWidgetArticleLnk, articleHeaderTxt);
	}

	public void verifyVideosSectionArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,videosSectiontArticleLnk, videoBreadCrumbDiv);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Hamburger Menu Sections Dropdown Section By clicking on Hamburger Icon it.
	 */
	public void verifyHamburgerMenuSectionAndIntrendsSection(String server,List<WebElement> section)
	{
		webDriverActions.waitForPageToLoad();
		String pageTitle = webDriverActions.getPageTitle();
		webDriverActions.waitForElement(1000);
		webDriverActions.softClickJS(hamburgerrIcon);
		for (int i = 0; i < section.size(); i++)
		{
			String actual = webDriverActions.getAttribute("href",section.get(i));
			Logs.info(getClass(), actual);	
			String title = webDriverActions.getAttribute("target", section.get(i));
			webDriverActions.softHighlightElement(section.get(i));
			webDriverActions.softClickJS(section.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(hamburgerrIcon);
				webDriverActions.softHighlightElement(section.get(i));
				webDriverActions.softClickJS(section.get(i));
			}	
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				Logs.info(getClass(), actual);
			}
			String currentPage = webDriverActions.getCurrentPageUrl();
			String expected = webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd") && !currentPage.contains("//beta"))
			{
			    String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			webDriverActions.stopPageLoading();
			webDriverActions.softWaitForElementVisibility(headerTxtLogoLnk, 3);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Possibly Element Is Not Visible For This URL "+expected);
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageTitle);

			}
			else {
				if (currentPage.equals(expected)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}
			}
			webDriverActions.softClickJS(hamburgerrIcon);
		}
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Hamburger Menu Sections Dropdown Section By clicking on Hamburger Icon it.
	 */
	public void verifyHamburgerMenuSectionDropdown(String server)
	{
		verifyHamburgerMenuSectionAndIntrendsSection(server, sectionList);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Line One section elements By clicking on it.
	 */
	public void verfyLineOneSection(String server)
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForElement(1000);
			//Validating the Line one section Except Search Button
			for (int i = 1; i < lineOneSectionELementLnk.size(); i++)
			{
				webDriverActions.softHighlightElement(lineOneSectionELementLnk.get(i));
				webDriverActions.softMouseHover(lineOneSectionELementLnk.get(i));
				webDriverActions.softWaitForElementVisibility(lineOneSectionELementLnk.get(i), 3);
				webDriverActions.softClickJS(lineOneSectionELementLnk.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softWaitForElementVisibility(lineOneSectionELementLnk.get(i), 3);
					webDriverActions.softClickJS(lineOneSectionELementLnk.get(i));
				}
				String expected = webDriverActions.getCurrentPageUrl();	
				String actual = webDriverActions.getCurrentPageUrl();	
				if(server.contains("preProd"))
				{
					String betaUrl = genericUtility.replaceInUrl(expected);
					webDriverActions.navigateToUrl(betaUrl);
					expected=betaUrl;
				}
				webDriverActions.stopPageLoading();
				expected = webDriverActions.getCurrentPageUrl();	
				String currentPage = webDriverActions.getCurrentPageUrl();	
				if(expected.contains("indianoftheyear"))
				{
					webDriverActions.softWaitForElementVisibility(indianOfTheYearTxt, 3);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(indianOfTheYearTxt), "Failed To display Header Icon For This URL"+expected);
				}
				else
				{	
					webDriverActions.softWaitForElementVisibility(headerTxtLogoLnk, 3);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Failed To display Header Icon For This URL"+expected);
				}
				if (expected.contains(currentPage)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
			}
		}
		catch(Exception e)
		{
			softAssert.assertTrue(false, "Possibly Element Is Not Clickable or Visible");	
		}
		softAssert.assertAll("Issues Found In Validating Line One Section");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Hamburger Menu Header Part By clicking on Hamburger Icon it.
	 */
	public void verifyHamburgerHeader(String server)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String pagURL = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(hamburgerHeaderIcon.size()>0," Possibily element not visibly " +pagURL);
		//Validating the Line one section Except Search Button
		for (int i = 0; i < hamburgerHeaderIcon.size(); i++)
		{
			webDriverActions.softClickJS(hamburgerrIcon);
			//			webDriverActions.waitForSecond(4000);
			String actual = webDriverActions.getAttribute("href",hamburgerHeaderIcon.get(i));
			Logs.info(getClass(), actual);
			webDriverActions.softClickJS(hamburgerHeaderIcon.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(hamburgerHeaderIcon.get(i));
			}
			if (actual.contains("#"))
			{
				webDriverActions.softWaitForElementVisibility(trackerLogo, 3);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(trackerLogo), "Failed To display Tracker Icon");
			}
			//			webDriverActions.waitForSecond(1000);
			String currentPage =webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd") && !currentPage.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}

			if (actual.contains("play.google.com"))
			{
				webDriverActions.switchToNewWindow();
				webDriverActions.softWaitForElementVisibility(googlePlayIcon, 3);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(googlePlayIcon), " Possibly Google Play Icon Is not displayed "+currentPage);
			}
			else if (actual.contains("livetv"))
			{
				webDriverActions.softWaitForElementVisibility(headerTxtLogoLnk, 3);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Possibly Live TV header Text Is not displayed "+currentPage);
			}
			webDriverActions.navigateToUrl(pagURL);
		}
		softAssert.assertAll("Issues Found In Validating Hamburger Header");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Hamburger Menu News 18 Initiatives Dropdown Section By clicking on Hamburger Icon it.
	 */
	public void verifyHamburgerInTrendsSection(String server)
	{
		verifyHamburgerMenuSectionAndIntrendsSection(server, inTrendsList);
	}
	
	/**
	 * @author DanishR
	 * This method used to validate Topics Links on Home Page
	 */
	public void topicsLinks(String serverType) {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.mobileScroll(3);
		webDriverActions.scrollToLast();
		for (int i = 0; i < 1; i++) {
			webDriverActions.softWaitForElementVisibility(topicslinks.get(i), 3);
			String link = webDriverActions.getAttribute("target", topicslinks.get(i));
			if (link.contains("_blank")) {
				webDriverActions.softClickJS(topicslinks.get(i));
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
			webDriverActions.softWaitForElementVisibility(headerTxtLogoLnk, 3);
			webDriverActions.softHighlightElement(headerTxtLogoLnk);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk)," Possibily element not visible "+currentPage);
		}
		softAssert.assertAll("Issues found in topics page : ");
	}


}

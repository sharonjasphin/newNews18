package com.news18.gujaratipages;

import java.net.HttpURLConnection;
import java.net.URL;
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

import com.news18.commonpages.HomePageLinksValidation;
import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author DanishR
 *
 */
public class MobileGujaratiLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	SoftAssert softAssert = new SoftAssert();

	public MobileGujaratiLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Homepage List of article Link for news18 Gujarati Page*/
	@FindBy(xpath ="//div[contains(@class,'newstrendvideo-box')]//li/a[not(contains(@href,'live')) and not(contains(@href,'cricket')) and contains(@href,'/news/')]")
	private List<WebElement> homePageArticleLnk;

	/*Homepage List of Live article Link for news18 Gujarati Page*/
	@FindBy(xpath ="//div[contains(@class,'wapper')]//li/a[contains(@href,'live-updates')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*photo section Present in Line one navigation bar in Gujarati HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[@href='/photogallery/']")
	private WebElement photoSectionLnk;

	@FindBy(xpath ="//div[contains(@class,' top_links_cont')]//a[text()='વીડિયો']")
	private List<WebElement> homePageVideoSection;

	/*Sports link present in Gujarati HomePage  */
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/sport/')]")
	private WebElement sportsLnk;

	/*Section link present at line one menu */
	@FindBy(xpath ="//div[contains(@class,'top_links_cont')]//a[not(contains(@href,'/videos/')) and not(contains(@href,'/photogallery/')) and not(contains(@href,'/career/')) and not(contains(@href,'paani/')) and not(contains(@href,'live')) and not(@href='/')]")
	private List<WebElement> sectionLnks;  

	//----------------------------Anupam*Webelements----------------
	//---------lifestyle
	/* Lifestyle section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/lifestyle/')]")
	private WebElement lifestyleSectionLnk;

	/* Lifestyle section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/lifestyle/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/lifestyle/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> lifestyleSectionArticleLnk;

	/* Lifestyle section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/lifestyle/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> lifestyleSectionImgLnk;

	/* Lifestyle section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/lifestyle/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreLifestyleSectionLnk;

	/*Breadcrumb present in Lifestyle article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement lifestyleBreadcrumb;

	//---------sport
	/* Sport section present in homepage */
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/sport/')]")
	private WebElement sportSectionLnk;

	/*Sport section Article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/sport/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/sport/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> sportSectionArticleLnk;

	/* Sport section Image present in homepage */
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/sport/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> sportSectionImgLnk;

	/* Sport section ReadMore present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/sport/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreSportSectionLnk;

	/*Breadcrumb present in sport article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement sportBreadcrumb;


	//---------EyeCatcher
	/* EyeCatcher section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/eye-catcher/')]")
	private WebElement eyeCatcherSectionLnk;

	/*EyeCatcher section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/eye-catcher/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/eye-catcher/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> eyeCatcherSectionArticleLnk;

	/* EyeCatcher section Image present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/eye-catcher/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> eyeCatcherSectionImgLnk;

	/* EyeCatcher section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/eye-catcher/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreEyeCatcherSectionLnk;

	/*Breadcrumb present in EyeCatcher article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement eyeCatcherBreadcrumb;

	//---------MobileAndTech
	/* MobileAndTech section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/tech/')]")
	private WebElement mobileAndTechSectionLnk;

	/*MobileAndTech section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/tech/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/tech/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> mobileAndTechSectionArticleLnk;

	/*MobileAndTech section Image present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/tech/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> mobileAndTechSectionImgLnk;

	/*MobileAndTech section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/tech/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreMobileAndTechSectionLnk;

	/*Breadcrumb present in MobileAndTech article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement mobileAndTechBreadcrumb;

	//---------Entertainment
	/* Entertainment section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/entertainment/')]")
	private WebElement entertainmentSectionLnk;

	/*Entertainment section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/entertainment/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/entertainment/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> entertainmentSectionArticleLnk;

	/*Entertainment section Image present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/entertainment/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> entertainmentSectionImgLnk;

	/*Entertainment section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/entertainment/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreEntertainmentSectionLnk;

	/*Entertainment present in MobileAndTech article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement entertainmentBreadcrumb;

	//---------national-international
	/* national-international section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/national-international/')]")
	private WebElement nationalInternationalSectionLnk;

	/*national-international section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/national-international/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/national-international/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> nationalInternationalArticleLnk;

	/*national-international section Image present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/national-international/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> nationalInternationalImgLnk;

	/*national-international section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/national-international/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreNationalInternationalLnk;

	/*national-international present in MobileAndTech article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement nationalInternationalBreadcrumb;

	//---------career
	/* Career section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/career/')]")
	private WebElement careerSectionLnk;

	/* Career section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/career/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/career/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> careerSectionArticleLnk;

	/* Career section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/career/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> careerSectionImgLnk;

	/* Career section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/career/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreCareerSectionLnk;

	/*Breadcrumb present in Career article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement careerBreadcrumb;

	//---------Business
	/* Business section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/business/')]")
	private WebElement businessSectionLnk;

	/* Business section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/business/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/business/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> businessSectionArticleLnk;

	/* Business section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/business/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> businessSectionImgLnk;

	/* Business section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/business/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreBusinessSectionLnk;

	/*Breadcrumb present in Business article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement businessBreadcrumb;

	//------------video
	/* Video section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/videos/')]")
	private WebElement videoBodySectionLnk;

	/* Video section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/videos/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> videoSectionArticleLnk;

	/* Video section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/videos/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> videoSectionImgLnk;

	/* Video section ReadMore present in homepage */
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/videos/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreVideoSectionLnk;

	/*Breadcrumb present in article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement videoBreadcrumb;

	//------------Photos
	/* Photos section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/photogallery/')]")
	private WebElement photosBodySectionLnk;

	/* Photos section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/photogallery/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> photosSectionArticleLnk;

	/* Photos section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/photogallery/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> photosSectionImgLnk;

	/* Photos section ReadMore present in homepage */
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/photogallery/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMorePhotosSectionLnk;

	/*Breadcrumb present in article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement photosBreadcrumb;


	//------------------------------- Vipins Webelement -----------------------------------//

	/* Article Header Text in Article Consumption Page */
	@FindBy(xpath ="//h1[contains(@class,'article_heading') or contains(@class,'live_blog') or contains(@class,'gallery_tilte')] | //div[contains(@class,'art') or contains(@class,'TstoryHead')]/h1" )
	private WebElement articleHeaderTxt;

	/* Article BreadCrumb Division */
	@FindBy(xpath = "//div[contains(@class,'brd')] | //div[contains(@class,'bread')]  | //ul[contains(@class, 'bread')]")
	private WebElement articleBreadCrumbDiv;

	/*Priority Panel Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'bigstory')]/parent::div[contains(@class,'wapper')]/div[contains(@class,'bigstory') or @class='container']//a")
	private List<WebElement> priorityPanelArticleLnk;

	/*Priority Panel Image Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'bigstory')]/parent::div[contains(@class,'wapper')]/div[contains(@class,'bigstory') or @class='container']//a//img[@title]")
	private List<WebElement> priorityPanelImgLnk;

	/* DharamBhakti Article Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'globalhd')]//a[contains(@href,'dharm')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a")
	private List<WebElement> dharamBhaktiArticleLnk;

	/*DharamBhakti Image Links in Homepage*/
	@FindBy(xpath = "//a[contains(@href,'dharm')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a//img")
	private List<WebElement> dharamBhaktiImgLnk;

	/*DharamBhakti Read More Link in Homepage */
	@FindBy(xpath = "//a[contains(@href,'dharm')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement dharamBhaktiReadMoreLnk;

	/* Webstories Section  Title Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]//h2/a")
	private WebElement webstoriesTitleLnk;

	/* List of Webstrories Article Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'slick-slide') and not (contains(@class,'slick-cloned'))]//a")
	private List<WebElement> webstoriesArticleLnk;

	/* List of Webstrories Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'slick-slide') and not (contains(@class,'slick-cloned'))]//a//img")
	private List<WebElement> webstoriesImgLnk;

	/* Active Webstories Article Link in Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'current') and not (contains(@class,'slick-cloned'))]//a")
	private WebElement activeWebstoriesArticleLnk;

	/* Active Webstories Image Link in Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'current') and not (contains(@class,'slick-cloned'))]//a//img")
	private WebElement activeWebstoriesImgLnk;

	/* WebStories Next Story Button after navigation of WebStories Article */
	@FindBy(xpath = "//div[contains(@class,'next-container')]")
	private WebElement nextWebStoryBtn;

	/* Webstories Slider Button in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]//ul[contains(@class,'slick-dots')]/li[not (contains(@class,'active'))]/button")
	private List<WebElement> webstoriesSliderBtn;


	/************************Danish**WebElements************************/

	/*District Icon present on Home Page Header*/
	@FindBy(xpath="//div[contains(@id,'header')]//div[contains(text(),'District')]")
	private WebElement districtIcon;

	/*District Cities present inside District icon*/
	@FindBy(xpath="//div[contains(@class,'tpctlits')]//ul//li//a")
	private List<WebElement> districtIconCities;

	/*Header Logo Icon */
	@FindBy(xpath ="//*[local-name()='svg']//parent::a")
	private WebElement headerLogo;

	/*Gujarat Section City Links*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'/gujarat/')]//parent::h2//parent::div//following-sibling::ul//li//a")
	private List<WebElement> citiesLnks;

	/*Gujarat Section City Article Links*/
	@FindBy(xpath="(//div[contains(@class,'bigstory')]//following-sibling::ul)[1]//li//a[contains(@href,'gujarat')]")
	private List<WebElement> citiesArticleLnks;

	/*Gujarat Section Read More Link in Homeoage*/
	@FindBy(xpath = "(//div[contains(@class,'globalhd')]/parent::div/a)[1]")
	private WebElement gujaratSectionReadMoreLnk;

	/*Articles breadcrumb Header Text */
	@FindBy(xpath ="//div[contains(@class,'crum') or contains(@class,'breadcum') or contains(@class,'brdc')]  | //ul[contains(@class, 'bread') or contains(@class,'brdc')]")
	private WebElement articleBreadcrumb;

	//===========================Sanjeeb's Elements ============================================

	/*BreadCrumb Present on Article Header*/
	@FindBy(xpath="//div[contains(@class,'brda') or contains(@class,'bread') or contains(@class,'brd')] | //ul[contains(@class,'brdcrm') or contains(@class,'bread')]  | //h2[contains(@class,'brd')]")
	private WebElement headerBreadcrumbLnk;

	/*Line One Section Article Links Present in Mobile Hindi Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_links_cont')]//a")
	private List<WebElement> lineOneSectionELementLnk;  

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

	/*Header Text Present After Clicking On Youtube Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="//div[@id='channel-header'] | //div[contains(@class,'header-banner')]")
	private WebElement youtubeTxt;

	/*Header Text Present After Clicking On JIo Icon Present In Hamburger Menu of Mobile English Landing Page*/
	@FindBy(xpath ="(//div[@class='container'])[1]")
	private WebElement jioTxt;

	/*social Share Section Present on Mobile Landing Page At footer section*/
	@FindBy(xpath ="//div[contains(@class,'footer-mobile')]")
	private WebElement socialShareSection;

	/*social Share Section Present on Mobile Landing Page At footer section*/
	@FindBy(xpath ="//div[contains(@class,'footer-mobile')]//a")
	private List<WebElement> socialShareSectionEle;

	/*Hambergur icon present in Gujarati HomePage  */
	@FindBy(xpath ="//div[contains(@class,'mobile_nav_icon')]//a[contains(@href,'#')]")
	private WebElement hambergerIcon;

	/*Bhasha Chune(Change Language) section herader present at Header Hamburger Menu*/
	@FindBy(xpath ="//div[contains(@class,'chs-tplng')]//ul//li//a[contains(@href,'#')]")
	private WebElement hamburgerLangSection;  

	/*Bhasha Chune(Change Language) links present at Header Hamburger Menu*/
	@FindBy(xpath ="//ul[contains(@class,'lng-subnav lng-scrlsbnv')]//li//a[contains(@href,'news18')]")
	private List<WebElement> hamburgerLangLnks; 

	/*Hamburger Menu Home Section Links*/
	@FindBy(xpath ="//div//ul[contains(@id,'india-top-menu')]//li//a")
	private List<WebElement> hamburgerHomeSectionLnks;

	/*Header logo present in Gujarati HomePage  */
	@FindBy(xpath ="//div[contains(@class,'news_page')] | //div[contains(@class,'brade_crum')] | //div[contains(@class,'CN-PageWrap')] | //div[contains(@class,'story_container')] | //div[contains(@class,'videosSliderWrapper')] | //div[contains(@class,'photoGalleryWrapper')] | //div[contains(@class,'header')] | //div[contains(@class,'row')]")
	private WebElement headerSection;
	
	/*social Share Section Present on Mobile Landing Page At footer section*/
	@FindBy(xpath ="//ul[contains(@class,'footer_nav')]")
	private WebElement footerStickySection;

	/*social Share Section Present on Mobile Landing Page At footer section*/
	@FindBy(xpath ="//ul[contains(@class,'footer_nav')]//a")
	private List<WebElement> footerStickySectionEle;


	public void clickOnVideoSection() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(homePageVideoSection.get(0));
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in Videos Section Homepage ", e);
		}
	}


	/**
	 * @author Abhishek
	 * This method is used to click on First Article of Gujarati Home Page 
	 */
	public void clickOnFirstArticleGujaratiHomePage() {
		try {
			webDriverActions.clickJS(homePageArticleLnk.get(0));
			Logs.info(getClass(), "Clicked on first article");
		}
		catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in first Article Homepage ", e);
		}
	}



	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of Gujurati Home Page 
	 */
	public void clickOnFirstLiveBlogArticleGujaratiHomePage() {
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
	 * @author Abhishek
	 * This method used to click on photos section of Gujarati Homepage
	 */
	public void clickOnPhotoSection()
	{
		try {
			webDriverActions.click(photoSectionLnk);
			Logs.info(getClass(), "Clicked on photo section");
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in PhotoSection Link ", e);
		}
	}


	/**
	 * @author Sanjeeb
	 * This method used to verify liveblog in Homepage
	 */
	public void clickOnLiveBlogArticleHomePage() {
		try {
			webDriverActions.clickJS(homePageLiveBlogArticleLnk.get(0));
		}
		catch(NoSuchElementException e)
		{
			Logs.error(getClass(), "Live Blog is not present");
		}
		catch(IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in first Live Blog Article Homepage ", e);
			Assert.fail("Unable to locate Live Blog Article "+webDriverActions.getCurrentPageUrl());
		}
	}

	/**
	 * @author AnupamGupta
	 * This method is used to click on the sports link of home page
	 */
	public void clickOnSportsLnk()
	{
		try {
			webDriverActions.continuousScrollTillElement(sportsLnk, GlobalVariables.sec30);
			webDriverActions.clickJS(sportsLnk);
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in Sports Link Homepage ", e);
		}
	}

	/**
	 * @author AnupamGupta
	 * This method is used to click on First Section link present on line one section
	 */
	public void clickOnFirstSection()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(sectionLnks.get(0));
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in Videos Section Homepage ", e);
		}
	}


	//----------------------Anupam Business logic----------------
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
			String actualTitle =	webDriverActions.getAttribute("title", artList.get(i));
			webDriverActions.softClickJS(artList.get(i));
			webDriverActions.waitForPageToLoad();

			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				actualTitle =	webDriverActions.getAttribute("title", artList.get(i));
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
				webDriverActions.waitForSecond(1000);
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
		webDriverActions.waitForSecond(1000);
		softAssert.assertAll("Issue Found in HomePage Body Section Link");
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
		String title = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillElement(section, 20);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softMouseHover(section);
		webDriverActions.softHighlightElement(section);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<artList.size() ;i++)
		{
			String actualUrl =	webDriverActions.getAttribute("href", artList.get(i));
			Logs.info(getClass(), actualUrl);
			webDriverActions.navigateToNewTab(artList.get(i));
			webDriverActions.switchToNewWindow();
			webDriverActions.waitForPageToLoad();

			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				//				webDriverActions.closeDriver();
				//				webDriverActions.switchToWindow(title);
				webDriverActions.navigateBack();
				webDriverActions.waitForSecond(2000);
				actualUrl =	webDriverActions.getAttribute("href", artList.get(i));
				Logs.info(getClass(), actualUrl);
				webDriverActions.navigateToNewTab(artList.get(i));
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
			webDriverActions.softWaitForElementVisibility(element, 5);
			Logs.info(getClass(), expectedUrl);
			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element "+element +"in "+currentPage);
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(title);
			webDriverActions.waitForSecond(2000);
		}
		softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	
	}


	/**
	 * @author AnupamGupta
	 * This method is used to verify image navigation of section in home page	
	 * @param section
	 * @param artList
	 */
	public void verifyImgNavigationNewTab(String serverType,WebElement section ,List<WebElement> artList ,WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String title = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillElement(section, 20);		
		webDriverActions.softScrollToElement(section);
		webDriverActions.softMouseHover(section);
		webDriverActions.softHighlightElement(section);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<artList.size() ;i++)
		{
			webDriverActions.navigateToNewTab(artList.get(i));
			webDriverActions.switchToNewWindow();
			webDriverActions.waitForPageToLoad();

			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				//				webDriverActions.closeDriver();
				//				webDriverActions.switchToWindow(title);
				webDriverActions.navigateBack();
				webDriverActions.waitForSecond(2000);
				webDriverActions.navigateToNewTab(artList.get(i));
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();
			}

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
			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) ,  "Unable to Display Element "+element + " on "+currentPage);
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(title);
			webDriverActions.waitForSecond(2000);
		}
		softAssert.assertAll("Issue Found in HomePage Body Image Navigation");	}


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

	//-----EyeCatcher
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of EyeCatcher Widget
	 */
	public void verifyEyeCatcherWidget(String serverType) {
		verifySectionLnks(serverType,eyeCatcherSectionLnk, eyeCatcherBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of EyeCatcher Widget Article
	 */
	public void verifyEyeCatcherWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,eyeCatcherSectionLnk,eyeCatcherSectionArticleLnk, eyeCatcherBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of EyeCatcher Widget Image
	 */
	public void verifyEyeCatcherWidgetImg(String serverType) {
		verifyImgNavigation(serverType,eyeCatcherSectionLnk,eyeCatcherSectionImgLnk, eyeCatcherBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More EyeCatcher News
	 */
	public void verifyMoreEyeCatcherLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreEyeCatcherSectionLnk, eyeCatcherBreadcrumb);
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

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Entertainment News
	 */
	public void verifyMoreEntertainmentLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreEntertainmentSectionLnk, entertainmentBreadcrumb);
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


	//-----Business

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget
	 */
	public void verifyBusinessWidget(String serverType) {
		verifySectionLnks(serverType,businessSectionLnk, businessBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget Article
	 */
	public void verifyBusinessWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,businessSectionLnk,businessSectionArticleLnk, businessBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget Image
	 */
	public void verifyBusinessWidgetImg(String serverType) {
		verifyImgNavigation(serverType,businessSectionLnk,businessSectionImgLnk, businessBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Business News
	 */
	public void verifyMoreBusinessLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreBusinessSectionLnk, businessBreadcrumb);
	}

	//-----Video
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Video Widget
	 */
	public void verifyVideoWidget(String serverType) {
		verifySectionLnks(serverType,videoBodySectionLnk, videoBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Video Widget Article
	 */
	public void verifyVideoWidgetArticle(String serverType) {
		verifyArticlesNavigationNewTab(serverType,videoBodySectionLnk,videoSectionArticleLnk, videoBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Video Widget Image
	 */
	public void verifyVideoWidgetImg(String serverType) {
		verifyImgNavigationNewTab(serverType,videoBodySectionLnk,videoSectionImgLnk, videoBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Video News
	 */
	public void verifyMoreVideoLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreVideoSectionLnk, videoBreadcrumb);
	}


	//-----Photos
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Photos Widget
	 */
	public void verifyPhotosWidget(String serverType) {
		verifySectionLnks(serverType,photosBodySectionLnk, photosBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Photos Widget Article
	 */
	public void verifyPhotosWidgetArticle(String serverType) {
		verifyArticlesNavigationNewTab(serverType,photosBodySectionLnk,photosSectionArticleLnk, photosBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Photos Widget Image
	 */
	public void verifyPhotosWidgetImg(String serverType) {
		verifyImgNavigationNewTab(serverType,photosBodySectionLnk,photosSectionImgLnk, photosBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Photos News
	 */
	public void verifyMorePhotosLnk(String serverType) {
		verifyMoreLnks(serverType,readMorePhotosSectionLnk, photosBreadcrumb);
	}


	//------------------------------------------ Vipins Business Logic ------------------------------------------//


	/**
	 * @param artList
	 * @param element
	 * @author VipinKumarGawande
	 * This method is used to Verify All The Widgets Article Text Navigation  
	 */
	public void verifyArticleNavigation(String serverType , List<WebElement> artList , WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
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
		if (serverType.equalsIgnoreCase("preProd")) {
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


	public void verifyPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, priorityPanelArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyPriorityPanelImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, priorityPanelImgLnk, articleBreadCrumbDiv);
	}

	public void verifyDharamBhaktiArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, dharamBhaktiArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyDharamBhaktiImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, dharamBhaktiImgLnk, articleBreadCrumbDiv);
	}

	public void checkLinks(String links)  {
//		SoftAssert softAssert = new SoftAssert();
		try {
			URL url=new URL(links);
			HttpURLConnection httpUrlConnection=(HttpURLConnection)url.openConnection();
			httpUrlConnection.setConnectTimeout(40000);	
			httpUrlConnection.connect();
			int responseCode = httpUrlConnection.getResponseCode();
			softAssert.assertTrue((responseCode<400), "URL has issue in "+links);
		}
		catch (Exception e) {
			Logs.error(getClass(), "Issue Found in Homepage Body" );
		} 
		
	}	
	
	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to Validate the Webstories Article Navigation for Webstories Section
	 */
	public void verifyWebstoriesArticleNavigation(String serverType)
	{
			List<String> list=new ArrayList<String>();
//			SoftAssert softAssert = new SoftAssert();
			webDriverActions.waitForPageToLoad();
			webDriverActions.continuousScrollTillElement(webstoriesTitleLnk, 10);
			webDriverActions.softMouseHover(webstoriesTitleLnk);
			webDriverActions.scrollDown();
			Logs.info(getClass(),"Total Links "+webstoriesArticleLnk.size());
			webDriverActions.waitForSecond(5000);
			for(WebElement webstoryArticle:webstoriesArticleLnk)
			{
				String attribute = webstoryArticle.getAttribute("href");
				list.add(attribute);
			}
			list.parallelStream().forEach(e -> checkLinks(e));
			softAssert.assertAll("Issue Found in Homepage ");
		}

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to Validate the Webstories Image Navigation for Webstories Section 
	 */
	public void verifyWebstoriesImageNavigation(String serverType)
	{

		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(webstoriesTitleLnk, 50);
		if(webstoriesImgLnk.size()>0)
		{
			webDriverActions.softMouseHover(activeWebstoriesImgLnk);
			String title = webDriverActions.getPageTitle();
			for(int i=0; i<15 ;i++)
			{
				webDriverActions.softMouseHover(activeWebstoriesArticleLnk);
				webDriverActions.softClickJS(webstoriesSliderBtn.get(i));
				webDriverActions.softClickJS(activeWebstoriesArticleLnk);
				//					webDriverActions.softMouseHover(activeWebstoriesArticleLnk);
				//					webDriverActions.softMouseHover(webstoriesImgLnk.get(i));
				//					webDriverActions.mouseHoverAndClick(webstoriesImgLnk.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(activeWebstoriesArticleLnk);
					webDriverActions.softClickJS(webstoriesSliderBtn.get(i));
					webDriverActions.softClickJS(activeWebstoriesArticleLnk);
				}
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
				webDriverActions.softHighlightElement(nextWebStoryBtn);
				webDriverActions.waitForSecond(2000);
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


	/**
	 *  @author VipinKumarGawande
	 *  This method is used to Validate the Slider Navigation in Webstories Section
	 */
	public void verifyWebstoriesSliderNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
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

	public void verifyDharamBhaktiReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, dharamBhaktiReadMoreLnk, articleBreadCrumbDiv);
	}

//	/**
//	 * @author DanishR
//	 * This method is used to click and navigate to gujarat Cities Articles
//	 */
//	public void verifyGujaratCitiesNavigation(String serverType)
//	{
//
//		SoftAssert softAssert =new SoftAssert();
//		webDriverActions.waitForPageToLoad();
//		String homeUrl = webDriverActions.getCurrentPageUrl();
//		//		webDriverActions.continuousScrollTillAllElement(citiesLnks, 6);
//		webDriverActions.softScrollToElement(citiesLnks.get(0));
//		softAssert.assertTrue(citiesLnks.size()>0, "Possibly Element is Not Visible "+homeUrl);
//
//		/* Below loop validates the Gujarati cities articles Navigations */
//		for (int i = 10; i < citiesLnks.size();i++) {
//			webDriverActions.softHighlightElement(citiesLnks.get(i));
//			webDriverActions.softMouseHover(citiesLnks.get(i));
//			webDriverActions.softClickJS(citiesLnks.get(i));
//			webDriverActions.waitForSecond(2000);
//
//			for (int j = 0; j < citiesArticleLnks.size();j++) {
//				webDriverActions.softHighlightElement(citiesArticleLnks.get(j));
//				webDriverActions.softMouseHover(citiesArticleLnks.get(j));
//				webDriverActions.softClickJS(citiesArticleLnks.get(j));
//				webDriverActions.waitForSecond(2000);
//				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
//				{
//					webDriverActions.navigateBack();
//					webDriverActions.softHighlightElement(citiesArticleLnks.get(j));
//					webDriverActions.softMouseHover(citiesArticleLnks.get(j));
//					webDriverActions.softClickJS(citiesArticleLnks.get(j));
//					webDriverActions.waitForSecond(2000);
//				}
//
//				String currentPageUrl = webDriverActions.getCurrentPageUrl();
//				if (serverType.contains("preProd")) {
//					String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
//					webDriverActions.navigateToUrl(betaUrl);
//					currentPageUrl=betaUrl;
//				}
//				webDriverActions.softHighlightElement(articleBreadcrumb);
//				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb) | webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Possibly Element is Not Visible "+currentPageUrl);
//				webDriverActions.navigateToUrl(homeUrl);
//				webDriverActions.waitForSecond(2000);
//				webDriverActions.softScrollToElement(citiesLnks.get(i));
//				webDriverActions.softHighlightElement(citiesLnks.get(i));
//				webDriverActions.softMouseHover(citiesLnks.get(i));
//				webDriverActions.softClickJS(citiesLnks.get(i));
//				webDriverActions.waitForSecond(2000);
//			}
//		}
//		softAssert.assertAll("Issues Found In Validating Gujarat Section Cities Articles Present on HomePage");
//	}
	
	/**
	 * @author DanishR
	 * This method is used to click and navigate to gujarat Cities Articles
	 */
	public void verifyGujaratCitiesNavigation(String serverType)
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
	 * This method is used to click and navigate to gujarat Cities Articles Read More
	 */
	public void verifyGujaratReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType,gujaratSectionReadMoreLnk , articleBreadcrumb);
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
			if (serverType.contains("preProd")) {
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

	//=============================sanjeeb's Business Logics ==============================

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Line One section elements By clicking on it.
	 */
	public void verfyLineOneSectionAndSearchIcon()
	{
		try {
			webDriverActions.waitForPageToLoad();
			String pageUrl=webDriverActions.getCurrentPageUrl();
			//Validating the Line one section Except Search Button
			for (int i = 1; i < lineOneSectionELementLnk.size(); i++)
			{
				webDriverActions.waitForSecond(2000);
				webDriverActions.softMouseHover(lineOneSectionELementLnk.get(i));
				String actual = webDriverActions.getAttribute("href", lineOneSectionELementLnk.get(i));
				Logs.info(getClass(), actual);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(lineOneSectionELementLnk.get(i)), "possibly line One Element Is not Visible"+actual);
				webDriverActions.softClick(lineOneSectionELementLnk.get(i));
				String currentPageUrl=webDriverActions.getCurrentPageUrl();
				if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateToUrl(pageUrl);
					webDriverActions.waitForPageToLoad();
					webDriverActions.softMouseHover(lineOneSectionELementLnk.get(i));
					webDriverActions.softClickJS(lineOneSectionELementLnk.get(i));
				}
				webDriverActions.waitForPageToLoad();
				webDriverActions.waitForPageToLoad();
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Failed To display Header Icon For This URL"+actual);
				webDriverActions.navigateToUrl(pageUrl);
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

	public void verifyHamburgerLanguageSection(String serverType) 
	{
		SoftAssert softAssert = new SoftAssert();
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(hambergerIcon);
		webDriverActions.softClickJS(hambergerIcon);
		webDriverActions.waitForSecond(2000);
		webDriverActions.softClickJS(hamburgerLangSection);
		for (int i = 0; i < hamburgerLangLnks.size(); i++) {
			webDriverActions.softScrollToElement(hamburgerLangLnks.get(i));
			webDriverActions.softMouseHover(hamburgerLangLnks.get(i));
			webDriverActions.softClickJS(hamburgerLangLnks.get(i));
			webDriverActions.switchToNewWindow();
			String currentPage = webDriverActions.getCurrentPageUrl();
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(hamburgerLangLnks.get(i));
				webDriverActions.softScrollToElement(hamburgerLangLnks.get(i));
				String actual = webDriverActions.getAttribute("href", hamburgerLangLnks.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.waitForSecond(2000);
				webDriverActions.softClickJS(hamburgerLangLnks.get(i));
			}
			else { 
				Logs.info(getClass(), "Navigated to "+currentPage);
			}
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(2000);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerSection),"Unable to display Element");
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(parentTitle);
		}
		softAssert.assertAll("Issues found in this url ");
	}

	public void verifyHamburgerSectionNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(hambergerIcon);
		webDriverActions.waitForSecond(2000);
		webDriverActions.softClickJS(hambergerIcon);
		for (int i = 1; i < hamburgerHomeSectionLnks.size(); i++) {

			webDriverActions.softScrollToElement(hamburgerHomeSectionLnks.get(i));
			webDriverActions.softMouseHover(hamburgerHomeSectionLnks.get(i));
			webDriverActions.softClickJS(hamburgerHomeSectionLnks.get(i));
			String currentPage = webDriverActions.getCurrentPageUrl();
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(hamburgerHomeSectionLnks.get(i));
				webDriverActions.softScrollToElement(hamburgerHomeSectionLnks.get(i));
				String actual = webDriverActions.getAttribute("href", hamburgerHomeSectionLnks.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.waitForSecond(2000);
				webDriverActions.softClickJS(hamburgerHomeSectionLnks.get(i));
			}
			//				if (serverType.equalsIgnoreCase("preprod")) {
			//					String betaUrl = genericUtility.replaceInUrl(currentPage);
			//					webDriverActions.navigateToUrl(betaUrl);
			//					currentPage = betaUrl;
			//				}
			else { 
				Logs.info(getClass(), "Navigated to "+currentPage);
			}
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(2000);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerSection),"Unable to display Element");
			webDriverActions.navigateBack();
			webDriverActions.softClickJS(hambergerIcon);
		}
		softAssert.assertAll("Issues found in this url ");
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Footer Sticky Section Present In Footer Part Of Mobile English Home Page.
	 */
	public void verifyStickySection()
	{
	webDriverActions.waitForPageToLoad();	
	webDriverActions.continuousScrollTillElement(footerStickySection,20);
	for(int i=0;i<footerStickySectionEle.size();i++)
	{
		webDriverActions.softClickJS(footerStickySectionEle.get(i));
		String currentPageUrl = webDriverActions.getCurrentPageUrl();
		if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.continuousScrollTillElement(footerStickySection,20);
			webDriverActions.softClickJS(footerStickySectionEle.get(i));
		}
		String actual = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Possibly Element Is Not Visible For This URL "+actual);
		webDriverActions.navigateBack();
	}
	softAssert.assertAll("Mobile Sticky Section Validation Failed");
	}



}
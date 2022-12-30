package com.news18.gujaratipages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.asserts.SoftAssert;

import com.news18.init.DriverUtility;
import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class DesktopGujaratiSanityLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public  DesktopGujaratiSanityLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Priority panel image present in the home page*/
	@FindBy(xpath ="//div[contains(@class,'topnews dflex')]//ul//li//img")
	private List<WebElement> priorityImgLst;

	/*Priority panel Headline present in the home page*/
	@FindBy(xpath ="//div[contains(@class,'topnews dflex')]//ul//li//h2")
	private List<WebElement> priorityHeadlineLst;

	/*Priority Article present in the home page*/
	@FindBy(xpath ="//div[contains(@class,'topnews dflex')]//ul//li//a")
	private List<WebElement> priorityArticleLst;

	/*Priority Article present in the home page*/
	@FindBy(xpath ="//div[contains(@class,'topnews dflex')]//ul//li//img")
	private List<WebElement> priorityImageLst;

	/*Ad Link in priority panel*/
	@FindBy(xpath ="(//div[contains(@class,'topnews')]//div[contains(@class,'adunit')])[1]")
	private List<WebElement> AdLink;

	/*Header Text Links Present in Article BreadCrumb*/
	@FindBy(xpath ="//div[contains(@class,'crum') or contains(@class,'breadcum') or contains(@class,'brdc')]  | //ul[contains(@class, 'bread') or contains(@class,'brdc')]")
	private WebElement articleBreadcrumb;

	/*BreadCrumb Present on Article Header*/
	@FindBy(xpath="//div[contains(@class,'headerContainer')] | //div[contains(@class,'headerContainer')]//h2 | //div[contains(@class,'n18hcontainer')] ")
	private WebElement headerBreadcrumbLnk;

	/*list of sections present in Line One Section Bar present at the header of Homepage*/
	@FindBy(xpath ="//ul[contains(@class,'Menu_nav_bar')]//li/a")
	private List<WebElement> lineOneSectionELementLnk;

	@FindBy(xpath ="(//div[contains(@class,'header_search')]/a)[1]")
	private WebElement searchBtnLnk;

	/*Search Box Button present after clicking on Search Icon present on the Line One Section*/
	@FindBy(xpath ="//div[contains(@id,'_gcse')]//input")
	private WebElement searchBoxBtn;

	/*Search Icon Present After Clicking on The Search Btn Present On the Line One Bar */
	@FindBy(xpath ="//*[local-name()='svg']/parent::button")
	private WebElement insideSearchIcon;

	/*Search Box Link Present on Line One Section of Homepage*/
	@FindBy(xpath ="(//div[contains(@class,'gsc-results')])[1]/div[contains(@class,'gsc-results')]")
	private WebElement closeBtn;

	/*list of sections present inside line two present on the header of homepage*/
	@FindBy(xpath ="//ul[contains(@class,'Menu_sub_navigation')]//a")
	private List<WebElement> lineTwoSectionsLnk;

	/*electrical Hydra Icon Present On LineTwo Section*/
	@FindBy(xpath ="(//div[contains(@class,'elhead')]//img)[1]")
	private WebElement electricalHydraIcon;

	/*crypto ki Samajh Icon Present On LineTwo Section*/
	@FindBy(xpath ="(//div[contains(@class,'crypto_container')])[1]")
	private WebElement cryptoKiSamajhIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'logo-div')] | //div[contains(@class,'launch_info')]")
	private WebElement trueCallerAndNetraSurkshaIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'headerContainer')] | //div[contains(@class,'headerContainer')]//h2 | //div[contains(@class,'n18hcontainer')] | //div[contains(@class,'row')]")
	private WebElement headerTxtLogoLnk;

	/*Trending Topics First Link is present in Header of home page*/
	@FindBy(xpath="//div[contains(@class,'nhtranding')]//a[contains(@href,'news18')]")
	private List<WebElement> headerTrendingTopicsLnks;

	///------------video
	/* Video section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'video-gallery')]//a[(@href='/videos/')]")
	private WebElement videoBodySectionLnk;

	/* Video section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'video-gallery')]//li/a")
	private List<WebElement> videoSectionArticleLnk;

	/* Video section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'video-gallery')]//li//img")
	private List<WebElement> videoSectionImgLnk;

	/*Breadcrumb present in article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')] | //div[contains(@class,'breadcrumb')]")
	private WebElement videoBreadcrumb;


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

	//---------EyeCatcher
	/* EyeCatcher section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/eye-catcher/')]")
	private WebElement eyeCatcherSectionLnk;

	/*EyeCatcher section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/eye-catcher/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> eyeCatcherSectionArticleLnk;

	/* EyeCatcher section Image present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/eye-catcher/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> eyeCatcherSectionImgLnk;

	/* EyeCatcher section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/eye-catcher/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreEyeCatcherSectionLnk;

	/*Breadcrumb present in EyeCatcher article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]")
	private WebElement eyeCatcherBreadcrumb;

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


	//---------Business
	/* Business section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/business/')]")
	private WebElement businessSectionLnk;

	/* Business section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/business/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> businessSectionArticleLnk;

	/* Business section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/business/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> businessSectionImgLnk;

	/* Business section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/business/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreBusinessSectionLnk;

	/*Breadcrumb present in Business article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]")
	private WebElement businessBreadcrumb;


	//------------------------------- Vipins Webelement -----------------------------------//

	/* Article Header Text in Article Consumption Page */
	@FindBy(xpath ="//h1[contains(@class,'article_heading') or contains(@class,'live_blog') or contains(@class,'gallery_tilte')] | //div[contains(@class,'art') or contains(@class,'TstoryHead')]/h1" )
	private WebElement articleHeaderTxt;

	/* Article BreadCrumb Division */
	@FindBy(xpath = "//div[contains(@class,'crum') or contains(@class,'breadcum') or contains(@class,'brdc')]  | //ul[contains(@class, 'bread') or contains(@class,'brdc')]")
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

	/*Superhit Gallery Article Link in Homepage*/
	@FindBy(xpath = "//ul[contains(@class,'superhitgalley')]/li/a")
	private List<WebElement> superhitGalleryArticleLnk;

	@FindBy(xpath = "//div[contains(@class,'globalhd')]//h2//a[contains(@href,'/photo')]")
	private WebElement photoGalleryHeadline;

	/*Superhit section liveNowNext*/
	@FindBy(xpath="//div[contains(@class,'mcricket_widget')]//following-sibling::div[contains(@class,' glide__arrows')]//button[text()='next']")
	private WebElement liveNowNext;

	/*Live now section article*/
	@FindBy(xpath ="//div[contains(@class,'live_cwidget')]//div[contains(@class,'track')]//ul//li/a")
	private List<WebElement> liveNowSectionArticle;

	/*Gujarat Section Article Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pradesh-newswrap')]/ul//li//a")
	private List<WebElement> gujaratSectionArticleLnk;

	/* Gujarat Section Cities Name in Homepage */
	@FindBy(xpath = "//div[contains(@class,'citiesname')]//ul/li/a")
	private List<WebElement> gujaratSectionCitiesName;

	/*Hamburger Menu Link is present in the Top Main Menu*/
	@FindBy(xpath ="//div[contains(@class,'Menu_nav')]")
	private WebElement hamburgerMenuLnk;

	/*list of sections present inside hamburger menu present on the header of homepage*/
	@FindBy(xpath ="//div[contains(@class,'open_nav_sub')]//li/a")
	private List<WebElement> hamburgerSectionsLnk;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'inner_header')]/div[contains(@class,'logo')] | //div[contains(@class,'byjuheaderbox')] ")
	private WebElement missonPaniAndByjuLogoLnk;

	/*Live blog Headline*/
	@FindBy(xpath ="(//div[contains(@class,'hd_heading')]//following-sibling::ul//li//a[contains(@href,'live')])[1]")
	private List<WebElement> liveBlogHeadline;

	@FindBy(xpath ="(//div[contains(@class,'carousel__slider-tray-wrapper carousel__slider-tray-wrap--horizontal')]//ul)[2]//li//a")
	private List<WebElement> footerLiveTvArticleLnks;

	@FindBy(xpath ="//div[contains(@class,'footer_other')]//ul[contains(@class,'footer_links')]//li//a")
	private List<WebElement> footerSectionArticleLnks;

	@FindBy(xpath ="//div//ul[contains(@class,'footer_news')]//li//a")
	private List<WebElement> footerLatestNewsArticleLnks;

	@FindBy(xpath ="//div//ul[contains(@class,'network_site')]//li//a")
	private List<WebElement> network18Sites;

	@FindBy(xpath ="//span[contains(text(),'__NEXT_DATA__')]")
	private WebElement newStackText;

	@FindBy(xpath ="//a[contains(@href,'/tag/')]")
	private WebElement homePageTag;

	/*promoted content headline*/
	@FindBy(xpath ="//div[contains(@class,'ob-widget-section ob-first')]//div[contains(text(),'Promoted')]")
	private WebElement promotedContentHeadline;

	@FindBy(xpath ="(//div[contains(@class,'breadcum')]//following-sibling::h1)[2]")
	private WebElement secondArticleHeadline;

	@FindBy(xpath="//div[contains(@class,'Header_logonsection')]")
	private WebElement news18Logo;

	@FindBy(xpath="//div[contains(@class,'brda') or contains(@class,'bread') or contains(@class,'br')] | //ul[contains(@class,'brdcrm') or contains(@class,'bread')]")
	private WebElement liveTvHeadline;

	/*Homepage First article Link  is present below the Line Two Menu bar in RHS*/
	@FindBy(xpath ="//div[contains(@class,'topnews-right')]//ul//li//a[not(contains(@href,'live')) and not(contains(@href,'/photogallery/'))]")
	private List<WebElement> homePageArticleLnk;

	/*photo section Present in LineOne navigation bar */
	@FindBy(xpath="//ul[contains(@class,'nav_bar')]//a[@href='/photogallery/']")
	private WebElement photoSectionLineOneLnk;

	/*Homepage First article Link  is present below the LineTwo Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@class,'pht-tp clearfix')]//ul[contains(@class,'pht-tprgt')]//li//a")
	private List<WebElement> photogalleryArticleLnk;

	/*Homepage LiveBlog article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@id,'__next')]//a[contains(@href,'live-updates')]")
	private WebElement homePageLiveBlogArticleLnk;

	/*video link present at line one section*/
	@FindBy(xpath ="//div[contains(@class,'Menu_container')]//a[text()='VIDEOS']")
	private WebElement videoSectionLnk;

	/*Article of video Page*/
	@FindBy(xpath = "//div[contains(@class,'video')]//ul//li//a[contains(@href,'video')]")
	private WebElement videoArticlesLnk;

	/*Tag Page present in home page*/
	@FindBy(xpath="//a[contains(@href,'/tag/')]")
	private WebElement tagPageLnk;
	
	@FindBy(xpath ="(//div//ul//li//div//iframe)[1]")
	private WebElement switchFrame;


	/**
	 * @author
	 * @param serverType
	 * This method is used to click on the articles present in the Homepage body 
	 */
	public void verifyPriorityPanelImageNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(priorityImageLst, 15);
		if(priorityImageLst.size()>0)
		{
			webDriverActions.softScrollToElement(priorityImageLst.get(0));
			webDriverActions.softMouseHover(priorityImageLst.get(0));
			for(int i=0; i<1 ;i++)
			{
				webDriverActions.softMouseHover(priorityImageLst.get(i));
				webDriverActions.softScrollToElement(priorityImageLst.get(i));
				String actual =	webDriverActions.getAttribute("src", priorityImageLst.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(priorityImageLst.get(i));
				String currentPage =webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				String pageTitle = webDriverActions.getPageTitle();
				if (!pageTitle.contains("404")) {
					webDriverActions.softHighlightElement(articleBreadCrumbDiv);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv, 1) , "Unable to Display Element in "+currentPage);;
				}
				else {
					Logs.error(getClass(),"Page has issue in this url : "+currentPage);
					softAssert.fail("Page has issue in this url : "+currentPage);
				}
			}
		}
		else
		{
			Logs.error(getClass(),"Possibily element is not visible or size is "+ priorityImageLst.size() +" "+ webDriverActions.getCurrentPageUrl());
			softAssert.fail("Possibily element is not visible or size is "+ priorityImageLst.size()+" "+"in this url "+webDriverActions.getCurrentPageUrl());
		}

		softAssert.assertAll("Issues Found in Homepage Body");
	}


	/**
	 * @author
	 * @param serverType
	 * This method is used to click on the headline in the priority panel
	 */
	public void verifyPriorityPanelHeadlineNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(priorityHeadlineLst, 15);
		if(priorityHeadlineLst.size()>0)
		{
			webDriverActions.softScrollToElement(priorityHeadlineLst.get(0));
			webDriverActions.softMouseHover(priorityHeadlineLst.get(0));
			for(int i=0; i<1 ;i++)
			{
				webDriverActions.softMouseHover(priorityHeadlineLst.get(i));
				webDriverActions.softScrollToElement(priorityHeadlineLst.get(i));
				webDriverActions.softClickJS(priorityHeadlineLst.get(i));
				String currentPage =webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				String pageTitle = webDriverActions.getPageTitle();
				if (!pageTitle.contains("404")) {
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
			Logs.error(getClass(),"Possibily element is not visible or size is "+ priorityHeadlineLst.size() +" "+ webDriverActions.getCurrentPageUrl());
			softAssert.fail("Possibily element is not visible or size is "+ priorityHeadlineLst.size()+" "+"in this url "+webDriverActions.getCurrentPageUrl());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author 
	 * @param serverType
	 * This method is used to click on the articles in the priority panel
	 */
	public void verifyPriorityPanelArticleNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		if(priorityArticleLst.size()>0)
		{
			webDriverActions.softScrollToElement(priorityArticleLst.get(0));
			webDriverActions.softMouseHover(priorityArticleLst.get(0));
			for(int i=0; i<priorityArticleLst.size();i++)
			{
				webDriverActions.softMouseHover(priorityArticleLst.get(i));
				webDriverActions.softScrollToElement(priorityArticleLst.get(i));
				String actual =	webDriverActions.getAttribute("href", priorityArticleLst.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(priorityArticleLst.get(i));
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
					webDriverActions.softHighlightElement(articleBreadCrumbDiv);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv, 1) , "Unable to Display Element in "+currentPage);
					webDriverActions.navigateBack();
				}
				else {
					Logs.error(getClass(),"Page has issue in this url : "+currentPage);
					softAssert.fail("Page has issue in this url : "+currentPage);
				}
			}
		}
		else
		{
			Logs.error(getClass(),"Possibily element is not visible "+ priorityArticleLst +" "+ webDriverActions.getCurrentPageUrl());
			softAssert.fail("Possibily element is not visible "+priorityArticleLst+" "+"in this url "+webDriverActions.getCurrentPageUrl());
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

	/**
	 * @author
	 * @param serverType
	 * This method is used to click on the categories present in the line one section
	 */
	public void verfyLineOneSection(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		//Validating the Line one section Except Search Button
		for (int i = 0; i < lineOneSectionELementLnk.size()-1; i++)
		{
			String actual = webDriverActions.getAttribute("href", lineOneSectionELementLnk.get(i));
			Logs.info(getClass(), actual);
			webDriverActions.softClick(lineOneSectionELementLnk.get(i));
			String currentPage =webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			String pageTitle = webDriverActions.getPageTitle();
			if (!pageTitle.contains("404")) {
				boolean status = genericUtility.compareUrlSub(currentPage, actual);
				softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk,1), "Failed To display Header Icon For This URL"+actual);
				webDriverActions.navigateBack();
			}

			else {
				Logs.error(getClass(),"Page has issue in this url : "+currentPage);
				softAssert.fail("Page has issue in this url : "+currentPage);
			}
		}
		//validating Search Button
		webDriverActions.waitForSecond(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('div[class=\"jsx-2746090766 Menu_header_search__XynqV header_search\"]>a:nth-child(2)').click();");
		webDriverActions.waitForSecond(2000);
		webDriverActions.inputText(searchBoxBtn, "News 18");
		webDriverActions.softHighlightElement(insideSearchIcon);
		webDriverActions.softClick(insideSearchIcon);
		webDriverActions.waitForSecond(2000);
		webDriverActions.softHighlightElement(closeBtn);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(closeBtn), "Posibly Search Box is not displayed");	
		softAssert.assertAll("Issues Found In Line One Sections");
	}


	/**
	 * @author
	 * @param serverType
	 * This method is used to click on the categories present in the line two section
	 */
	public void verfyLineTwoSection(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		if (lineTwoSectionsLnk.size()>0) {
			for (int i = 0; i < lineTwoSectionsLnk.size(); i++) {
				String actual= webDriverActions.getAttribute("href", lineOneSectionELementLnk.get(i));
				webDriverActions.softHighlightElement(lineTwoSectionsLnk.get(i));
				webDriverActions.mouseHover(lineTwoSectionsLnk.get(i));
				webDriverActions.clickJS(lineTwoSectionsLnk.get(i));
				String currentPage = webDriverActions.getCurrentPageUrl();
				if(serverType.contains("preProd") && !currentPage.contains("//beta") && !currentPage.contains("crypto") && !currentPage.contains("netrasuraksha"))
				{
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				//it takes the social share Url from property File
				ArrayList<String> list=new ArrayList<String>();
				list.add(fileUtility.readDataFromPropertyFile("netrasuraksha"));
				list.add(fileUtility.readDataFromPropertyFile("crypto"));
				Logs.info(getClass(), list);
				//it add the element of social share icons.
				ArrayList<WebElement> listEle=new ArrayList<WebElement>();
				listEle.add(trueCallerAndNetraSurkshaIcon);
				listEle.add(cryptoKiSamajhIcon);

				if(actual.contains("netrasuraksha") || actual.contains("crypto") )
				{
					for(int j=0;j<list.size();j++)
					{
						if(actual.contains(list.get(j)))
						{
							softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j),1), "Possibly Element Is Not Visible For This URL "+actual);	
							webDriverActions.navigateBack();
						}
					}
				}
				else
				{
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk,1), "Possibly Element Is Not Visible For This URL "+actual);	
					webDriverActions.navigateBack();
				}
			}
		}
		else
		{
			Logs.error(getClass(),"Possibily element is not visible or size is "+ lineTwoSectionsLnk.size() +" "+ webDriverActions.getCurrentPageUrl());
			softAssert.fail("Possibily element is not visible or size is "+ lineTwoSectionsLnk.size()+" "+"in this url "+webDriverActions.getCurrentPageUrl());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author
	 * @param serverType
	 * This method is used to click on the articles present in the Homepage body 
	 */
	public void verifyUpperWidgetArticlesNavigation(String serverType , List<WebElement> artList , WebElement element)
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
				Logs.info(getClass(), actual);
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
			Logs.error(getClass(),"Possibily element is not visible or size is "+ artList.size() +" "+ webDriverActions.getCurrentPageUrl());
			softAssert.fail("Possibily element is not visible or size is "+ artList.size()+" "+"in this url "+webDriverActions.getCurrentPageUrl());
		}

		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author
	 * @param serverType
	 * This method is used to click on the articles present in the Homepage body 
	 */
	public void verifyPriorityPanelImageNavigation(String serverType , List<WebElement> artList , WebElement element)
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
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(artList.get(i));
				String currentPage =webDriverActions.getCurrentPageUrl();
				softAssert.assertTrue(actual.contains(currentPage),"Possibily url is not same in article page "+currentPage);
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				String pageTitle = webDriverActions.getPageTitle();
				if (!pageTitle.contains("404")) {
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
			Logs.error(getClass(),"Possibily element is not visible or size is "+ artList.size() +" "+ webDriverActions.getCurrentPageUrl());
			softAssert.fail("Possibily element is not visible or size is "+ artList.size()+" "+"in this url "+webDriverActions.getCurrentPageUrl());
		}

		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author
	 * @param serverType
	 * This method is used to click on the articles present in the Homepage body 
	 */
	public void verifyLowerWidgetArticlesNavigation(String serverType,WebElement section ,List<WebElement> artList, WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softScrollToElement(videoBodySectionLnk);
		webDriverActions.continuousScrollTillElement(section, 4);
		webDriverActions.softMouseHover(section);
		webDriverActions.softHighlightElement(section);
		if(artList.size()>0)
		{
			webDriverActions.softScrollToElement(artList.get(0));
			webDriverActions.softMouseHover(artList.get(0));
			for(int i=0; i<1 ;i++)
			{
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				String actual =	webDriverActions.getAttribute("href", artList.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(artList.get(i));
				String currentPage = webDriverActions.getCurrentPageUrl();
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
			softAssert.fail("Possibily element is not visibleor size is "+ artList.size()+" "+"in this url "+webDriverActions.getCurrentPageUrl());
		}

		softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	
	}

	/**
	 * @author
	 * @param serverType
	 * This method is used to click on the articles present in the Homepage body 
	 */
	public void verifyArticlesNavigationNewTab(String serverType,WebElement section ,List<WebElement> artList, WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(section, 20);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softMouseHover(section);
		webDriverActions.softHighlightElement(section);
		if (artList.size()>0) { 
			for(int i=0; i<1 ;i++)
			{
				String actual =	webDriverActions.getAttribute("href", artList.get(i));
				webDriverActions.softClickJS(artList.get(i));
				webDriverActions.switchToNewWindow();
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.softClickJS(artList.get(i));
					webDriverActions.switchToNewWindow();
					currentPage=betaUrl;
				}
				String pageTitle = webDriverActions.getPageTitle();
				if (!pageTitle.contains("404")) {
					boolean status = genericUtility.compareUrlSub(currentPage, actual);
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
			Logs.error(getClass(),"Possibily element is not visible  or size is "+ artList.size() +" "+ webDriverActions.getCurrentPageUrl());
			softAssert.fail("Possibily element is not visible or size is "+ artList.size()+" "+"in this url "+webDriverActions.getCurrentPageUrl());
		}
		softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Line One Hamburger Menu and Line Two Section after clicking on the hamburger Icon.
	 */
	public void verfyLineOneHamburgerMenu(String server)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softClickJS(hamburgerMenuLnk);
		if(hamburgerSectionsLnk.size()>0)
		{
			//It will fetch the line one Elements except search Icon
			for (int i = 0; i < hamburgerSectionsLnk.size(); i++)
			{
				webDriverActions.softHighlightElement(hamburgerSectionsLnk.get(i));
				String actual = webDriverActions.getAttribute("href", hamburgerSectionsLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(hamburgerSectionsLnk.get(i));
				String currentPage = webDriverActions.getCurrentPageUrl();	
				if(server.contains("preProd"))
				{
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				String pageTitle = webDriverActions.getPageTitle();
				if (!pageTitle.contains("404")) {
					boolean status = genericUtility.compareUrlSub(currentPage, actual);
					softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk,1), "Failed To display The Header Text For This URL "+currentPage);	
					webDriverActions.navigateBack();
					webDriverActions.softClickJS(hamburgerMenuLnk);
				}
			}
		}
		else
		{
			Logs.error(getClass(),"Possibily element is not visible or size is "+ hamburgerSectionsLnk.size() +" "+ webDriverActions.getCurrentPageUrl());
			softAssert.fail("Possibily element is not visible or size is "+hamburgerSectionsLnk.size()+" "+"in this url "+webDriverActions.getCurrentPageUrl());
		}
		softAssert.assertAll("Issues Found In Validating Hamburger Menu");
	}


	/**
	 * @author 
	 * This method is used to validate navigation of Lifestyle Widget Article
	 */
	public void verifyLifeWidgetArticle(String serverType) {
		verifyLowerWidgetArticlesNavigation(serverType,lifestyleSectionLnk,lifestyleSectionArticleLnk, lifestyleBreadcrumb);
	}

	//-----Sport

	/**
	 * @author 
	 * This method is used to validate navigation of FooterSport Widget Article
	 */
	public void verifySportWidgetArticle(String serverType) {
		verifyLowerWidgetArticlesNavigation(serverType,sportSectionLnk,sportSectionArticleLnk, sportBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of EyeCatcher Widget Article
	 */
	public void verifyEyeCatcherWidgetArticle(String serverType) {
		verifyLowerWidgetArticlesNavigation(serverType,eyeCatcherSectionLnk,eyeCatcherSectionArticleLnk, eyeCatcherBreadcrumb);
	}


	/** 
	 * @author AnupamGupta
	 * This method is used to validate navigation of MobileAndTech Widget Article
	 */
	public void verifyMobileAndTechWidgetArticle(String serverType) {
		verifyLowerWidgetArticlesNavigation(serverType,mobileAndTechSectionLnk,mobileAndTechSectionArticleLnk, mobileAndTechBreadcrumb);
	}


	/**
	 * @author 
	 * This method is used to validate navigation of Entertainment Widget Article
	 */
	public void verifyEntertainmentWidgetArticle(String serverType) {
		verifyLowerWidgetArticlesNavigation(serverType,entertainmentSectionLnk,entertainmentSectionArticleLnk, entertainmentBreadcrumb);
	}

	/**
	 * @author 
	 * This method is used to validate navigation of national-international Widget Article
	 */
	public void verifyNationalInternationalWidgetArticle(String serverType) {
		verifyLowerWidgetArticlesNavigation(serverType,nationalInternationalSectionLnk,nationalInternationalArticleLnk, nationalInternationalBreadcrumb);
	}


	/**
	 * @author 
	 * This method is used to validate navigation of Career Widget Article
	 */
	public void verifyCareerWidgetArticle(String serverType) {
		verifyLowerWidgetArticlesNavigation(serverType,careerSectionLnk,careerSectionArticleLnk, careerBreadcrumb);
	}

	/**
	 * @author 
	 * This method is used to validate navigation of Business Widget Article
	 */
	public void verifyBusinessWidgetArticle(String serverType) {
		verifyLowerWidgetArticlesNavigation(serverType,businessSectionLnk,businessSectionArticleLnk, businessBreadcrumb);
	}

	/**
	 * @author 
	 * This method is used to validate navigation of Video Widget Article
	 */
	public void verifyVideoWidgetArticle(String serverType) {
		verifyUpperWidgetArticlesNavigation(serverType,videoSectionArticleLnk, videoBreadcrumb);
	}

	/**
	 * @author 
	 * This method is used to validate navigation of Dharmbhakti Widget Article
	 */
	public void verifyDharamBhaktiArticleNavigation(String serverType)
	{
		verifyUpperWidgetArticlesNavigation(serverType, dharamBhaktiArticleLnk, articleBreadCrumbDiv);
	}

	/**
	 * @author 
	 * This method is used to validate navigation of SuperhitGallery Widget Article
	 */
	public void verifySuperhitGalleryArticleNavigation(String serverType)
	{
		verifyUpperWidgetArticlesNavigation(serverType, superhitGalleryArticleLnk, articleBreadcrumb);
	}

	/**
	 * @author
	 * @param serverType
	 * This method is used to click on the Gujarat articles present in the Homepage body 
	 */
	public void verifyGujaratCitiesNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.softScrollToElement(gujaratSectionCitiesName.get(0));
		if(gujaratSectionCitiesName.size()>0)
		{
			/* Below loop validates the Gujarati cities articles Navigations */
			for (int i = 0; i < 1;i++) {
				webDriverActions.softHighlightElement(gujaratSectionCitiesName.get(i));
				webDriverActions.softMouseHover(gujaratSectionCitiesName.get(i));
				webDriverActions.softClickJS(gujaratSectionCitiesName.get(i));

				for (int j = 0; j < 1;j++) {

					webDriverActions.softHighlightElement(gujaratSectionArticleLnk.get(j));
					webDriverActions.softMouseHover(gujaratSectionArticleLnk.get(j));
					String actual =	webDriverActions.getAttribute("href", gujaratSectionArticleLnk.get(i));
					webDriverActions.softClickJS(gujaratSectionArticleLnk.get(j));
					String currentPage = webDriverActions.getCurrentPageUrl();
					if (serverType.contains("preProd")) {
						String betaUrl = genericUtility.replaceInUrl(currentPage);
						webDriverActions.navigateToUrl(betaUrl);
						currentPage=betaUrl;
					}
					String pageTitle = webDriverActions.getPageTitle();
					if (!pageTitle.contains("404")) {
						boolean status = genericUtility.compareUrlSub(currentPage, actual);
						softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
						webDriverActions.softHighlightElement(articleBreadcrumb);
						softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb,1), "Possibly Element is Not Visible "+currentPage);
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
			Logs.error(getClass(),"Possibily element is not visible or size is "+ gujaratSectionCitiesName.size() +" "+ webDriverActions.getCurrentPageUrl());
			softAssert.fail("Possibily element is not visible or size is "+ gujaratSectionCitiesName.size()+" "+"in this url "+webDriverActions.getCurrentPageUrl());
		}
		softAssert.assertAll("Issues Found In Validating Gujarat Section Cities Articles Present on HomePage");
	}


	/**
	 * @author 
	 * @param serverType
	 * This method is used to Validate the Webstories Article Navigation for Webstories Section
	 */
	public void verifyWebstoriesArticleNavigation(String serverType) {
		verifyArticlesNavigationNewTab(serverType,webstoriesTitleLnk,webstoriesArticleLnk, videoBreadcrumb);
	}


	public void checkLinks(String links)  {
		SoftAssert softAssert = new SoftAssert();
		try {
			URL url=new URL(links);
			HttpURLConnection httpUrlConnection=(HttpURLConnection)url.openConnection();
			httpUrlConnection.setConnectTimeout(40000);	
			httpUrlConnection.connect();
			int responseCode = httpUrlConnection.getResponseCode();
			softAssert.assertTrue((responseCode<400), "URL has issue in "+links);
		}
		catch (Exception e) {
			Logs.error(getClass(), "Unable to fetch the link response ", e );
		} 
	}

	public void verfyLiveBlogHeadline(String serverType)
	{
		verfyLiveBlog(serverType, liveBlogHeadline, articleBreadcrumb);
	}

	/**
	 *@author 
	 * This method is used to click on LiveBlog Article of Hindi Home Page 
	 */
	public void verfyLiveBlog(String serverType, List<WebElement> headline,WebElement breadcrum)
	{
		SoftAssert softAssert = new SoftAssert();
		ArrayList<String>list=new ArrayList<>();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		if(headline.size()>0)
		{
			String actual = webDriverActions.getAttribute("href", headline.get(0));
			webDriverActions.softClickJS(headline.get(0));
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
				webDriverActions.softHighlightElement(breadcrum);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrum) , "Unable to Display Element in"+currentPage);
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


	public void verifyFooterLiveTv(String serverType)
	{
		verifyFooterNavigation( serverType , footerLiveTvArticleLnks, headerBreadcrumbLnk);
	}

	public void verifyLatestNews(String serverType)
	{
		verifyFooterNavigation( serverType , footerLatestNewsArticleLnks, articleBreadCrumbDiv);
	}

	public void verifySection(String serverType)
	{
		verifyFooterNavigation( serverType , footerSectionArticleLnks, articleBreadCrumbDiv);
	}

	public void verfyFooterNetwork18Sites(String serverType)
	{
		verifyFooterNavigation( serverType , network18Sites, articleBreadCrumbDiv);
	}

	public void verifyFooterNavigation(String serverType , List<WebElement> artList, WebElement element) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		webDriverActions.softHighlightElement(artList.get(0));
		if(artList.size()>0)
		{
			webDriverActions.softScrollToElement(artList.get(0));
			webDriverActions.softMouseHover(artList.get(0));
			for(int i=0; i<1 ;i++)
			{
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				String actual =	webDriverActions.getAttribute("href", artList.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(artList.get(i));
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta") && currentPage.contains("news18.com") && currentPage.contains("gujarati")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				String pageTitle = webDriverActions.getPageTitle();
				if (!pageTitle.contains("404")) {
					softAssert.assertTrue(actual.contains(currentPage),actual+" Possibily url is not same in article page "+currentPage);
				}
				else {
					Logs.error(getClass(),"Page has issue in this url : "+currentPage);
					softAssert.fail("Page has issue in this url : "+currentPage);
				}
			}	
		}
		else
		{
			Logs.error(getClass(),"Possibily element is not visible "+ artList +" "+ webDriverActions.getCurrentPageUrl());
			softAssert.fail("Possibily element is not visible "+artList+" "+"in this url "+webDriverActions.getCurrentPageUrl());
		}
		softAssert.assertAll("Issue Found in HomePage Footer Article Navigation");	
	}


	/**
	 * This method is used to validate 
	 */
	public void verifyHomepageNewStack() {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.viewPageSource();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(newStackText,1) , "Unable to Display Element in "+webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues Found");
	}

	/**
	 * This method is used to validate 
	 */
	public void verifyTagPageNewStack(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		webDriverActions.softClickJS(homePageTag);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		String pageTitle = webDriverActions.getPageTitle();
		if (!pageTitle.contains("404")) {
			webDriverActions.viewPageSource();
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(newStackText,1) , "Unable to Display Element in "+webDriverActions.getCurrentPageUrl());

		}
		else {
			Logs.error(getClass(),"Page has issue in this url : "+currentPage);
			softAssert.fail("Page has issue in this url : "+currentPage);
		}
		softAssert.assertAll("Issue Found in HomePage Footer Article Navigation");
	}

	/**
	 * This method is used to validate 
	 */
	public void verifyPhotogalleryPageNewStack(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		webDriverActions.softClickJS(superhitGalleryArticleLnk.get(1));
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		String pageTitle = webDriverActions.getPageTitle();
		if (!pageTitle.contains("404")) {
			webDriverActions.viewPageSource();
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(newStackText,1) , "Unable to Display Element in "+webDriverActions.getCurrentPageUrl());

		}
		else {
			Logs.error(getClass(),"Page has issue in this url : "+currentPage);
			softAssert.fail("Page has issue in this url : "+currentPage);
		}
		softAssert.assertAll("Issue Found in HomePage Footer Article Navigation");
	}


	/**
	 * This method is used to validate 
	 */
	public void verifyVideoPageNewStack(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		if (videoSectionArticleLnk.size()>0) {
			webDriverActions.softClickJS(videoSectionArticleLnk.get(0));
			String currentPage = webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			String pageTitle = webDriverActions.getPageTitle();
			if (!pageTitle.contains("404")) {
				webDriverActions.viewPageSource();
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(newStackText,1) , "Unable to Display Element in "+webDriverActions.getCurrentPageUrl());
			}
			else {
				Logs.error(getClass(),"Page has issue in this url : "+currentPage);
				softAssert.fail("Page has issue in this url : "+currentPage);
			}
		}
		else
		{
			Logs.error(getClass(),"Possibily element is not visible "+ videoSectionArticleLnk +" "+ webDriverActions.getCurrentPageUrl());
			softAssert.fail("Possibily element is not visible "+videoSectionArticleLnk+" "+"in this url "+webDriverActions.getCurrentPageUrl());
		}
		softAssert.assertAll("Issues Found");	
	}

	public void verifyCategoryPageNewStack(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softClickJS(lineOneSectionELementLnk.get(1));
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		String pageTitle = webDriverActions.getPageTitle();
		if (!pageTitle.contains("404")) {
			webDriverActions.viewPageSource();
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(newStackText,1) , "Unable to Display Element in "+webDriverActions.getCurrentPageUrl());

		}
		else {
			Logs.error(getClass(),"Page has issue in this url : "+currentPage);
			softAssert.fail("Page has issue in this url : "+currentPage);
		}
		softAssert.assertAll("Issue Found in HomePage Footer Article Navigation");
	}


	/**
	 * This method is used to validate 
	 */
	public void verifyInfiniteScroll(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		if(priorityArticleLst.size()>0)
		{
			webDriverActions.softMouseHover(priorityArticleLst.get(0));
			for(int i=0; i<1;i++)
			{
				webDriverActions.softMouseHover(priorityArticleLst.get(i));
				webDriverActions.softClickJS(priorityArticleLst.get(i));
				String currentPage =webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				webDriverActions.waitForPageToLoad();
				webDriverActions.mobileScroll(6);
				webDriverActions.continuousScrollTillElement(promotedContentHeadline, 8);
				webDriverActions.softWaitForElementVisibility(secondArticleHeadline, 3);
				webDriverActions.softHighlightElement(secondArticleHeadline);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(secondArticleHeadline) , "Unable to Display Element in "+currentPage);
			}
		}
		else
		{
			Logs.error(getClass(),"Possibily element is not visible "+priorityArticleLst +" "+ webDriverActions.getCurrentPageUrl());
			softAssert.fail("Possibily element is not visible "+priorityArticleLst+" "+"in this url "+webDriverActions.getCurrentPageUrl());
		}
		softAssert.assertAll("Issues Found In Validating Infinite Scroll");

	}

	/**
	 * @author DanishR
	 * This method is used to click on First Article of Hindi Home Page 
	 */
	public void clickOnFirstArticleHomePage(String serverType) {
		SoftAssert softAssrt = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		if (homePageArticleLnk.size()>0) {
			webDriverActions.softClickJS(homePageArticleLnk.get(0));
			String currentPage = webDriverActions.getCurrentPageUrl();
			//Below if condition replaces to Beta Url
			if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
			}
			else {
				Logs.info(getClass(), "Navigated to "+currentPage);
			} 
		}
		else {
			softAssrt.fail(" Possibly Element is Not Visible in url : "+webDriverActions.getCurrentPageUrl()+" in article link element "+homePageArticleLnk);
		}
	}


	/**
	 * @author DanishR
	 * This method used to click on photos section of Hindi Homepage
	 */
	public void clickOnPhotoSection(String serverType)
	{
		SoftAssert softAssrt = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		if (webDriverActions.softIsElementDisplayed(photoSectionLineOneLnk, 1)) {
			webDriverActions.softClickJS(photoSectionLineOneLnk);
			if (photogalleryArticleLnk.size()>0) {
				webDriverActions.softClickJS(photogalleryArticleLnk.get(0));
				String currentPage = webDriverActions.getCurrentPageUrl();
				//Below if condition replaces to Beta Url
				if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
				}
			}
			else {
				softAssrt.fail(" Possibly Element is Not Visible in url : "+webDriverActions.getCurrentPageUrl()+" in article link element "+photogalleryArticleLnk.get(0));
			}
		}
		else {
			softAssrt.fail(" Possibly Element is Not Visible in url : "+webDriverActions.getCurrentPageUrl()+" in section link element "+photoSectionLineOneLnk);
		}
		softAssrt.assertAll("Issue found in Video section :");
	}


	/**
	 * @author Sanjeeb
	 * This method is used to click on Videos Section news 18 Hindi Home Page 
	 */
	public void navigateToVideosSection(String serverType) {
		SoftAssert softAssrt = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		if (webDriverActions.softIsElementDisplayed(videoSectionLnk, 1)) {
			webDriverActions.softClickJS(videoSectionLnk);
			if (webDriverActions.softIsElementDisplayed(videoArticlesLnk, 1)) {
				webDriverActions.softClickJS(videoArticlesLnk);
				String currentPage = webDriverActions.getCurrentPageUrl();
				//Below if condition replaces to Beta Url
				if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
				}
			}
			else {
				softAssrt.fail(" Possibly Element is Not Visible in url : "+webDriverActions.getCurrentPageUrl()+" in article link element "+videoArticlesLnk);
			}
		}
		else {
			softAssrt.fail(" Possibly Element is Not Visible in url : "+webDriverActions.getCurrentPageUrl()+" in section link element "+videoSectionLnk);
		}
		softAssrt.assertAll("Issue found in Video section :");
	}

	/**
	 * This method is used to Validate Trending Topics Section in Home Page
	 */
	public void verifyTrendingTopics(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		if (webDriverActions.softIsElementDisplayed(tagPageLnk, 1)) {
			String actual = webDriverActions.getAttribute("href", tagPageLnk);
			webDriverActions.softClickJS(tagPageLnk);
			String currentPage = webDriverActions.getCurrentPageUrl();
			softAssert.assertTrue(actual.contains(currentPage),"Possibily url is not same in article page "+currentPage);
			//Below if condition replaces to Beta Url
			if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			String title = webDriverActions.getPageTitle();
			if (!title.contains("404")) {
				Logs.info(getClass(), "Navigated to Trending Topic Link "+ webDriverActions.getCurrentPageUrl());
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb,1), "Failed to Display "+currentPage);
			}
			else {
				Logs.error(getClass(),"Page has issue in this url : "+currentPage);
				softAssert.fail("Page has issue in this url : "+currentPage);
			}
		}
		else {
			Logs.error(getClass(),"Possibily element is not visible "+ tagPageLnk +" "+ webDriverActions.getCurrentPageUrl());
			softAssert.fail("Possibily element is not visible "+tagPageLnk+" "+"in this url "+webDriverActions.getCurrentPageUrl());
		}
		softAssert.assertAll("Issues found in tag page validation : ");
	}


	/**
	 *@author 
	 * This method is used to click on LiveBlog Article of English Home Page 
	 */
	public void clickOnLiveBlogArticleHomePage(String serverType) {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		if(webDriverActions.softIsElementDisplayed(homePageLiveBlogArticleLnk,1))
		{
			webDriverActions.softClickJS(homePageLiveBlogArticleLnk);
			String currentPage = webDriverActions.getCurrentPageUrl();
			//Below if condition replaces to Beta Url
			if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
			}
			else {
				Logs.info(getClass(), "Navigated to "+currentPage);
			} 
		}
		else
		{
			Logs.error(getClass(), "Exception in Live blog in HomePage Link");
			throw new SkipException("Unable to locate Live Blog Article element possibly no Live Blog Present "+webDriverActions.getCurrentPageUrl());	
		}
	}
}




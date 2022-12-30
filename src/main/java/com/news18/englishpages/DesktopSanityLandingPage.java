package com.news18.englishpages;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.record.UserSViewEnd;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.github.dockerjava.api.model.Links;
import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class DesktopSanityLandingPage {
	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	public SoftAssert softAssert = new SoftAssert();


	public DesktopSanityLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	/*Trending Topics First Link is present in Header of home page*/
	@FindBy(xpath="//div[contains(@class,'trandingTopics')]//a[contains(@href,'news18')]")
	private List<WebElement> headerTrendingTopicsLnks;

	/*Topics Links articles present on Homepage*/
	@FindBy(xpath ="//a[contains(@href,'https://www.news18.com/topics/')]")
	private List<WebElement> topicslinks;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'crum') or contains(@class,'breadcum') or contains(@class,'brdc')]  | //ul[contains(@class, 'bread') or contains(@class,'brdc')] | //h1")
	private WebElement articleBreadcrumb;

	/*Search Button Link Present on Line One Section of Homepage*/
	@FindBy(xpath ="//div[contains(@class,'topNavContainer')]//ul[contains(@class,'header_search')]")
	private WebElement searchBtnLnk;

	/*Search Box Link Present on Line One Section of Homepage*/
	@FindBy(xpath ="(//div[contains(@class,'gsc-results')])[1]/div[contains(@class,'gsc-results')]")
	private WebElement closeBtn;

	/*Search Box Button present after clicking on Search Icon present on the Line One Section*/
	@FindBy(xpath ="//div[contains(@id,'gsearch')]//input")
	private WebElement searchBoxBtn;

	/*list of sections present in Line One Section Bar present at the header of Homepage*/
	@FindBy(xpath ="//div[contains(@class,'topNavContainer')]/ul/li/a[not(contains(text(),'Home'))]")
	private List<WebElement> lineOneSectionELementLnk;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'headerContainer')] | //div[contains(@class,'headerContainer')]//h2 | //div[contains(@class,'n18hcontainer')] ")
	private WebElement headerTxtLogoLnk;

	/*Search Icon Present After Clicking on The Search Btn Present On the Line One Bar */
	@FindBy(xpath ="//*[local-name()='svg']/parent::button")
	private WebElement insideSearchIcon;

	/*list of sections present inside line two present on the header of homepage*/
	@FindBy(xpath ="//div[contains(@class,'secondNav')]//a")
	private List<WebElement> lineTwoSectionsLnk;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'logo-div')] | //div[contains(@class,'launch_info')]")
	private WebElement trueCallerAndNetraSurkshaIcon;

	/*electrical Hydra Icon Present On LineTwo Section*/
	@FindBy(xpath ="(//div[contains(@class,'elhead')]//img)[1]")
	private WebElement electricalHydraIcon;

	/* List of Article Links in Priority Panel in Homepage */
	@FindBy(xpath ="//div[contains(@class,'top_story')]//figure/a[contains(@class,'head_story')]" )
	private List<WebElement> priorityPanelHeaderArticleLnk;

	/* List of SubHeader Article Links in Priority Panel in Homepage */
	@FindBy(xpath ="//div[contains(@class,'top_story')]//ul/li/a" )
	private List<WebElement> priorityPanelArticleLnk;

	/* List of Article Links in Priority Panel in Homepage */
	@FindBy(xpath ="//div[contains(@class,'top_story')]//a//img" )
	private List<WebElement> priorityPanelImgLnk;

	/* Article Header Text in Article Consumption Page */
	@FindBy(xpath ="//h1[contains(@class,'article_heading')] | //h1[contains(@class,'live_blog')] | //h1[contains(@class,'gallery_tilte')] | //div[contains(@class,'article-box')]/h1" )
	private WebElement articleHeaderTxt;

	/*Hamburger Menu Link is present in the Top Main Menu*/
	@FindBy(xpath ="//div[contains(@class,'hamburger')]")
	private WebElement hamburgerMenuLnk;

	/*list of sections present inside hamburger menu present on the header of homepage*/
	@FindBy(xpath ="//div[contains(@class,'sub-nav')]//li/a[not(contains(text(),'Home'))]")
	private List<WebElement> hamburgerSectionsLnk;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'inner_header')]/div[contains(@class,'logo')] | //div[contains(@class,'byjuheaderbox')] ")
	private WebElement missonPaniAndByjuLogoLnk;


	/* List of Articles Links in News18Showsha Homepage */
	//div[contains(@class,'ss_wrp')]/div[contains(@class,'ss_parent')]//div[contains(@class,'copy')]
	@FindBy(xpath ="//div[contains(@class,'ss_wrp')]/div[contains(@class,'ss_parent')]//a" )
	private List<WebElement> news18ShowshaArticleLnk;

	/* List of Article Link in WebStories Widget */
	@FindBy(xpath ="//div[contains(@class,'story_list')]/div[contains(@id,'webstory')]//figcaption/div/a" )
	private List<WebElement> webStoriesArticleLnk;

	/* WebStories Next Story Button after navigation of WebStories Article */
	@FindBy(xpath = "//div[contains(@class,'next-container')]")
	private WebElement nextWebStoryBtn;

	/* List of CricketNext Widget Article Links in Homepage */
	@FindBy(xpath ="//div[contains(@class,'cn_widget')]//div[contains(@class,'cnw_outer')]//a" )
	private List<WebElement> cricketNextArticleLnk;

	/* List Of Videos Widget Article Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_sldier_section')]/ul[contains(@id,'photogallery_slider_videos')]//li[not(contains(@class , 'clone'))]//figcaption/a[2]")
	private List<WebElement> videosArticleLnk;

	/*List of Buzz Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'buzz')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> buzzArticleLnk;

	/* Article BreadCrumb Division */
	@FindBy(xpath = "//div[contains(@class,'bread') or contains(@class,'bred') or contains(@class,'Bread') or contains(@class,'heading_title')] | //ul[contains(@class, 'bread')]")
	private WebElement articleBreadCrumbDiv;

	/*List of Sports Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/sports/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> sportsArticleLnk;

	/*List of Education and Carrer Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'education-career')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> educationAndCareerArticleLnk;

	/*List of Tech Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/tech/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> techArticleLnk;

	/*List of Auto Widget Articles in Homepage */
	@FindBy(xpath = "//a[@href='/auto/']//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> autoArticleLnk;

	/*List of World Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/world/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> worldArticleLnk;

	/*List of Lifestyle Widget Articles in Homepage */
	@FindBy(xpath = "(//div[contains(@class,'heading_title')]//a[contains(@href,'/lifestyle/')]/ancestor::div[contains(@class,'home_section_row')])[1]/ul/li/a")
	private List<WebElement> lifestyleArticleLnk;

	/*List of Health And Fitness Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/lifestyle/health-and-fitness/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> healthAndFitnessArticleLnk;

	/*List of Explainers Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/explainers/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> explainersArticleLnk;

	/*List of Opinion Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/opinion/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> opinionArticleLnk;

	/*List of Opinion Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/politics/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> politicsArticleLnk;

	/*List of Football Widget Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_section')]//a[contains(@href,'/football/')]//ancestor::div[contains(@class,'home_section_row')]/ul/li/a")
	private List<WebElement> footballArticleLnk;

	/* List of PhotoGallery Widget Article Links in Homepage */
	@FindBy(xpath ="//div[contains(@class,'home_sldier_section')]/ul[contains(@id,'photogallery_slider_photogallery')]//li[not(contains(@class , 'clone'))]//figcaption/a[2]" )
	private List<WebElement> photogalleryArticleLnks;

	/* PhotoGallery Widget Active Image Link */
	@FindBy(xpath = "//div[contains(@class,'home_sldier_section')]/ul[contains(@id,'photogallery_slider_photogallery')]//li[contains(@class,'active')]//figcaption/a[2]")
	private WebElement activePhotogalleryArticleLnk;

	/* PhotoGallery Right Arrow Button in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_sldier_section')]/ul[contains(@id,'photogallery_slider_photogallery')]//button[contains(@class,'right')]")
	private WebElement photogalleryRightArrowBtn;

	/*Movies Widget Articles Link are present in Home Page*/
	@FindBy(xpath ="//div[@class='heading_title']/a[(@href='/movies/')]/ancestor::div[@class='home_section_row']/ul/li/a")
	private List<WebElement> moviesWidgetArticlesLnk;

	/*Breadcrum Division present in article page*/
	@FindBy(xpath ="(//div[contains(@class,'bredcrum')])[1] | //div[contains(@class,'breadcum')]")
	private WebElement breadcrumDiv;

	/*India Widget Articles Link are present in Home Page*/
	@FindBy(xpath ="//div[@class='heading_title']/a[(@href='/india/')]/ancestor::div[@class='home_section_row']/ul/li/a")
	private List<WebElement> indiaWidgetArticlesLnk;

	/*CricketNext Widget Articles Link are present in Home Page*/
	@FindBy(xpath ="//div[@class='heading_title']/a[(@href='/cricketnext/')]/ancestor::div[@class='home_section_row']/ul/li/a")
	private List<WebElement> cricketNextWidgetArticlesLnk;

	/*Business Widget Articles Link are present in Home Page*/
	@FindBy(xpath ="//div[@class='heading_title']/a[(@href='/business/')]/ancestor::div[@class='home_section_row']/ul/li/a")
	private List<WebElement> businessWidgetArticlesLnk;

	/* PhotoGallery Widget Active Image Link */
	@FindBy(xpath = "//div[contains(@class,'home_sldier_section')]/ul[contains(@id,'photogallery_slider_videos')]//li[contains(@class,'active')]//figcaption/a[2]")
	private WebElement activeVideosArticleLnk;

	/*Video section Article BreadCrumb Division */
	@FindBy(xpath = "//div[contains(@class,'Bread')]")
	private WebElement videoBreadCrumbDiv;

	/* Videos Right Arrow Button in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_sldier_section')]/ul[contains(@id,'photogallery_slider_video')]//button[contains(@class,'right')]")
	private WebElement videosRightArrowBtn;

	/* Videos Section Player Text in Video Article page*/
	@FindBy(xpath = "//div[@class='vjs-modal-dialog-content']")
	private WebElement videoPlayerTxt;

	/*Video wall Articles Link are present in Home Page*/
	@FindBy(xpath ="//div[contains(@class,'video_wall_row')]//a")
	private List<WebElement> videoWallWidgetArticlesLnk;

	/*Video section Article BreadCrumb Division */
	@FindBy(xpath = "//div[contains(@class,'bredcrum')] | //div[contains(@class,'BreadCum')]")
	private WebElement videoBreadcrumb;

	/* List of Hot and Trending Widget Articles in Homepage */
	@FindBy(xpath ="//div[contains(@class,'hot_trending')]//ul/li//h4/a" )
	private List<WebElement> hotAndTrendingArticleLnk;

	//---------sport
	/* Sport section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/sport/')]")
	private WebElement sportSectionLnk;

	/*Sport section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/sport/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> sportSectionArticleLnk;

	/*Breadcrumb present in sport article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] |  //div[contains(@class,'brdcrm')]")
	private WebElement sportBreadcrumb;

	@FindBy(xpath ="//div[contains(@class,'heading_title')]//a[contains(@href,'photogallery')]")
	private WebElement photoSectionHeadline;

	/*electrical Hydra Icon Present On LineTwo Section*/
	@FindBy(xpath ="//div[contains(@class,'logo')]")
	private WebElement indianOfTheYearIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'logo-div')] | //div[contains(@class,'launch_info')]")
	private WebElement netraSurkshaIcon;


	public void verifyPriorityPanelArticleNavigation(String serverType)
	{
		verifyPrirityArticleNavigation(serverType , priorityPanelArticleLnk , articleBreadcrumb);	// Verify RHS  Article of Priority Panel
	}

	public void verifyPriorityPanelHeaderNavigation(String serverType)
	{
		verifyHeaderNavigation( serverType , priorityPanelHeaderArticleLnk , articleBreadcrumb); // Verify Header Article of Priority Panel
	}

	public void verifyPriorityPanelImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType , priorityPanelImgLnk , articleBreadcrumb); 
	}

	/**
	 * @author 
	 * This method is used to validate navigation of FooterSport Widget Article
	 */
	public void verifySportWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,sportSectionLnk,sportSectionArticleLnk, sportBreadcrumb);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify elements Present In Line One Section By Clicking On It.
	 */
	public void verfyLineOneSearchIcon(String server)
	{
		//validating Search Icon
		webDriverActions.softClick(searchBtnLnk);
		webDriverActions.waitForSecond(5000);
		webDriverActions.inputText(searchBoxBtn, "News 18");
		webDriverActions.softHighlightElement(insideSearchIcon);
		webDriverActions.softClick(insideSearchIcon);
		webDriverActions.softHighlightElement(closeBtn);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(closeBtn), "Posibly Search Box is not displayed");	
		softAssert.assertAll("Issues Found In Line One Sections");
	}


	/**
	 * @author 
	 * This method is used to validate article navigation in home page
	 * @param serverType
	 * @param section
	 * @param artList
	 */
	public void verifyArticlesNavigation(String serverType,WebElement section ,List<WebElement> artList, WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(photoSectionHeadline);
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
			//			webDriverActions.waitForSecond(2000);
			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element "+element +"in "+currentPage);
		}
		softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	
	}


	public void verifyArticleNavigation(String serverType , List<WebElement> artList , WebElement element)
	{
		SoftAssert softAssert = new SoftAssert(); 
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softScrollToElement(photoSectionHeadline);
		webDriverActions.continuousScrollTillAllElement(artList, 20);
		if(artList.size()>0)
		{
			for(int i=0; i<1;i++)
			{
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				String actual =	webDriverActions.getAttribute("href", artList.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(artList.get(0));
				String currentPage =webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), currentPage);
				softAssert.assertEquals(actual, currentPage , "Unable to Navigate "+actual);
				if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.softWaitForElementVisibility(element, 3);
				webDriverActions.softHighlightElement(element);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in "+currentPage);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+artList.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}


	public void verifyPrirityArticleNavigation(String serverType , List<WebElement> artList , WebElement element)
	{
		SoftAssert softAssert = new SoftAssert(); 
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(artList, 20);
		if(artList.size()>0)
		{
			for(int i=0; i<artList.size();i++)
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
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.softWaitForElementVisibility(element, 3);
				webDriverActions.softHighlightElement(element);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in "+currentPage +element );;
				if (serverType.equalsIgnoreCase("preProd")) {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
				}
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+artList.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyHeaderNavigation(String serverType , List<WebElement> artList , WebElement element)
	{
		SoftAssert softAssert = new SoftAssert(); 
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(artList, 20);
		if(artList.size()>0)
		{
			for(int i=0; i<1;i++)
			{
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				String actual =	webDriverActions.getAttribute("href", artList.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(artList.get(i));
				webDriverActions.waitForSecond(1000);
				String currentPage =webDriverActions.getCurrentPageUrl();
//				Logs.info(getClass(), currentPage);
//				softAssert.assertEquals(actual, currentPage , "Unable to Navigate "+actual);
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.softWaitForElementVisibility(element, 3);
				webDriverActions.softHighlightElement(element);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in "+currentPage +element );
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+artList.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyImageNavigation(String serverType , List<WebElement> imgList, WebElement element)
	{
		SoftAssert softAssert = new SoftAssert(); 
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(imgList, 20);
		if(imgList.size()>0)
		{
			webDriverActions.softScrollToElement(imgList.get(0));
			webDriverActions.softMouseHover(imgList.get(0));
			for(int i=0; i<1 ;i++)
			{
				webDriverActions.softMouseHover(imgList.get(i));
				webDriverActions.softScrollToElement(imgList.get(i));
				String actual =	webDriverActions.getAttribute("src", imgList.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(imgList.get(i));
				webDriverActions.waitForSecond(1000);
				String currentPage =webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), currentPage);
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.softWaitForElementVisibility(element, 3);
				webDriverActions.softHighlightElement(element);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) ,  "Unable to Display Element in "+currentPage );
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+imgList.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
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
			if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
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


	public void verifyNews18ShowshaArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,news18ShowshaArticleLnk, articleHeaderTxt);
	}

	public void verifyCricketNextArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType ,cricketNextArticleLnk , articleBreadCrumbDiv);
	}


	public void verifyHotAndTrendingArticleNavigation(String serverType) {

		verifyArticleNavigation( serverType ,hotAndTrendingArticleLnk , articleBreadCrumbDiv);
	}


	public void verifyWebStoriesArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,webStoriesArticleLnk, nextWebStoryBtn);
	}

	public void verifyPhotogalleryArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,photogalleryArticleLnks, breadcrumDiv);
	}

	public void verifyMoviesWidgetArticle(String serverType ) {
		verifyArticleNavigation(serverType,moviesWidgetArticlesLnk , breadcrumDiv);
	}

	public void verifyCricketNextWidgetArticle(String serverType ) {
		verifyArticleNavigation(serverType,cricketNextWidgetArticlesLnk , breadcrumDiv);
	}

	public void verifyIndiaWidgetArticle(String serverType ) {
		verifyArticleNavigation(serverType,indiaWidgetArticlesLnk , breadcrumDiv);
	}

	public void verifyBusinessWidgetArticle(String serverType ) {
		verifyArticleNavigation(serverType,businessWidgetArticlesLnk , breadcrumDiv);
	}


	public void verifyVideosArticleNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollDown();
		webDriverActions.continuousScrollTillElement(activeVideosArticleLnk , 5);
		for(int i=0;i<1; i++)
		{

			webDriverActions.navigateToNewTab(activeVideosArticleLnk);
			webDriverActions.switchToNewWindow();
			String currentPage = webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			}
			webDriverActions.softWaitForElementVisibility(videoBreadCrumbDiv, 3);
			webDriverActions.softHighlightElement(videoBreadCrumbDiv);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(videoBreadCrumbDiv) , "Unable To Display Element in "+currentPage);
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}


	public void verifyBuzzArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,buzzArticleLnk , articleHeaderTxt);
	}


	public void verifyEducationAndCareerArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , educationAndCareerArticleLnk ,articleHeaderTxt);
	}


	public void verifyTechArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType ,techArticleLnk , articleHeaderTxt);
	}


	public void verifyAutoArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType, autoArticleLnk , articleHeaderTxt);
	}


	public void verifyWorldArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , worldArticleLnk , articleHeaderTxt);
	}

	public void verifySportsArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,sportsArticleLnk ,articleHeaderTxt);
	}



	public void verifyLifestyleArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , lifestyleArticleLnk , articleHeaderTxt);
	}


	public void verifyHealthAndFitnessArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,healthAndFitnessArticleLnk, articleHeaderTxt);
	}

	public void verifyExplainersArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,explainersArticleLnk ,articleHeaderTxt);
	}

	public void verifyOpinionArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,opinionArticleLnk ,articleHeaderTxt);
	}


	public void verifyPoliticsArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , politicsArticleLnk ,articleHeaderTxt);
	}


	public void verifyFootballArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,footballArticleLnk ,articleHeaderTxt);
	}

	public void verifyVideoWallArticleLnk(String serverType) {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		softAssert.assertTrue(videoWallWidgetArticlesLnk.size()>0, " Possibly Element is Not Visible "+ videoWallWidgetArticlesLnk );
		for(int i=0;i<1;i++)
		{
			webDriverActions.softMouseHover(videoWallWidgetArticlesLnk.get(i));
			webDriverActions.softScrollToElement(videoWallWidgetArticlesLnk.get(i));
			String actualUrl = webDriverActions.getAttribute("href", videoWallWidgetArticlesLnk.get(i));
			webDriverActions.softClickJS(videoWallWidgetArticlesLnk.get(0));
			String currentPage = webDriverActions.getCurrentPageUrl();
			softAssert.assertEquals(actualUrl, currentPage,"Unable to navigate "+actualUrl);

			if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			} 
			webDriverActions.softWaitForElementVisibility(videoBreadcrumb, 3);
			webDriverActions.softHighlightElement(videoBreadcrumb);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(videoBreadcrumb), "Unable to Display Element "+videoBreadcrumb+" on "+currentPage);
		}
		softAssert.assertAll("Issues found in Video Wall Article link");
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
		softAssert.assertAll("Issue found in topics page : ");
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Hamburger Menu Present On Header of Lokmat Language.
	 */
	public void verifyHamburgerMenu(String serverType) {
		String actual = "";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softWaitForElementVisibility(hamburgerMenuLnk,3);
		webDriverActions.softClickJS(hamburgerMenuLnk);
		
		if (hamburgerSectionsLnk.size()>0) {
			for (int i = 0; i < hamburgerSectionsLnk.size(); i++) {
				
				webDriverActions.softWaitForElementVisibility(hamburgerSectionsLnk.get(i),3);
				webDriverActions.softHighlightElement(hamburgerSectionsLnk.get(i));
				webDriverActions.mouseHover(hamburgerSectionsLnk.get(i));
				webDriverActions.softClickJS(hamburgerSectionsLnk.get(i));
				actual = webDriverActions.getCurrentPageUrl();
				String expected = webDriverActions.getCurrentPageUrl();
				if(serverType.contains("preProd") && !actual.contains("//beta"))
				{
					String betaUrl = genericUtility.replaceInUrl(actual);
					actual=betaUrl;
					webDriverActions.navigateToUrl(actual);
				}
				webDriverActions.softWaitForElementVisibility(headerTxtLogoLnk, 3);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Possibly Element Is Not Visible For This URL "+actual);	
				if (actual.contains(expected)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}
				webDriverActions.softWaitForElementVisibility(hamburgerMenuLnk,3);
				webDriverActions.softClickJS(hamburgerMenuLnk);
			}
			
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+hamburgerSectionsLnk.size());
		}
		softAssert.assertAll("Issues found in Hamburger Menu "+ actual);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Line One Hamburger Menu
	 * @param server
	 */
	public void verfyLineOneHamburgerMenu(String server)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softClickJS(hamburgerMenuLnk);
		//Validating the Line one section Except Search Button
		for (int i = 0; i < hamburgerSectionsLnk.size(); i++)
		{
			webDriverActions.softWaitForElementVisibility(hamburgerSectionsLnk.get(i), 3);
			webDriverActions.softHighlightElement(hamburgerSectionsLnk.get(i));
			webDriverActions.softClickJS(hamburgerSectionsLnk.get(i));
			String currentPage = webDriverActions.getCurrentPageUrl();	
			String expected = webDriverActions.getCurrentPageUrl();	
			if(server.contains("preProd") && !expected.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(expected);
				webDriverActions.navigateToUrl(expected);
				expected=betaUrl;
			}
			webDriverActions.softWaitForElementVisibility(articleBreadcrumb, 3);
			webDriverActions.softHighlightElement(articleBreadcrumb);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Failed To display Header Icon For This URL"+expected);
			if (expected.contains(currentPage)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}	
			webDriverActions.softWaitForElementVisibility(hamburgerMenuLnk, 3);
			webDriverActions.softClickJS(hamburgerMenuLnk);
		}
		softAssert.assertAll("Issues Found In Validating Hamburger Menu");
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Line Two Section.
	 */
	public void verfyLineTwoSection(String server)
	{
//		verifyLineOneAndLineTwoSection(server, lineTwoSectionsLnk, headerTxtLogoLnk);
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

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Line Two Section.
	 */
	public void verfyLineOneSection(String serverType)
	{
		verifyLineOneAndLineTwoSection(serverType, lineOneSectionELementLnk, headerTxtLogoLnk);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Line Two Section.
	 */
	public void verfyLineTwoSectionThirdParty()
	{
		verifyLineOneAndLineTwoThirdParty(lineTwoSectionsLnk);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify line one and Line Two Section Present On Header of Lokmat Language.
	 */
	public void verifyLineOneAndLineTwoSection(String serverType,List<WebElement> eleList,WebElement headerTxtLogoLnk) {
		String actual = "";
		webDriverActions.waitForPageToLoad();
		String parentUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForElement(1000);

		if (eleList.size()>0) {
			for (int i = 0; i < eleList.size(); i++) {
				String lineSectionLinks = webDriverActions.getAttribute("href", eleList.get(i));
				String target = webDriverActions.getAttribute("target", eleList.get(i));
				if(!(lineSectionLinks.contains("netrasuraksha") || lineSectionLinks.contains("itsnotok") || lineSectionLinks.contains("electral") || lineSectionLinks.contains("indianoftheyear")))
				{
					webDriverActions.softHighlightElement(eleList.get(i));
					webDriverActions.mouseHover(eleList.get(i));
					if (target.contains("_blank")) {
						webDriverActions.navigateToNewTab(eleList.get(i));
						webDriverActions.switchToNewWindow();
					}
					else {
						webDriverActions.softClickJS(eleList.get(i));
					}
					actual = webDriverActions.getCurrentPageUrl();
					String expected = webDriverActions.getCurrentPageUrl();
					if(serverType.contains("preProd") && !actual.contains("//beta"))
					{
						String betaUrl = genericUtility.replaceInUrl(actual);
						actual=betaUrl;
						webDriverActions.navigateToUrl(actual);
					}
					webDriverActions.softWaitForElementVisibility(headerTxtLogoLnk, 3);
					webDriverActions.softHighlightElement(headerTxtLogoLnk);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Possibly Element Is Not Visible For This URL "+actual);	
					if (target.contains("_blank")) {
						webDriverActions.closeDriver();
						webDriverActions.switchToWindow(parentUrl);
					}
					else {
						if (actual.contains(expected)) {
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
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+eleList.size());
		}
		softAssert.assertAll("Issues found in this Url "+ actual);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify line one and Line Two Section Present On Header of Lokmat Language.
	 */
	public void verifyLineOneAndLineTwoThirdParty(List<WebElement> eleList) {
		String actual = "";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String parentUrl = webDriverActions.getCurrentPageUrl();
		//		//it takes the social share Url from property File
		ArrayList<String> list=new ArrayList<String>();
		list.add(fileUtility.readDataFromPropertyFile("electral"));
		list.add(fileUtility.readDataFromPropertyFile("indianoftheyear"));
		list.add(fileUtility.readDataFromPropertyFile("netrasuraksha"));

		Logs.info(getClass(), list);
		//it add the element of social share icons.
		ArrayList<WebElement> listEle=new ArrayList<WebElement>();
		listEle.add(electricalHydraIcon);
		listEle.add(indianOfTheYearIcon);
		listEle.add(netraSurkshaIcon);


		if (eleList.size()>0) {
			for (int i = 0; i < eleList.size(); i++) {
				String lineTwo = webDriverActions.getAttribute("href", eleList.get(i));
				if(lineTwo.contains("netrasuraksha") || lineTwo.contains("itsnotok") || lineTwo.contains("electral") || lineTwo.contains("indianoftheyear") )
				{
					webDriverActions.softWaitForElementVisibility(eleList.get(i), 3);
					webDriverActions.softHighlightElement(eleList.get(i));
					webDriverActions.mouseHover(eleList.get(i));
					webDriverActions.navigateToNewTab(eleList.get(i));
					webDriverActions.switchToNewWindow();
					actual =webDriverActions.getCurrentPageUrl();
					for(int j=0;j<list.size();j++)
					{
						if(actual.contains(list.get(j)))
						{
							webDriverActions.softWaitForElementVisibility(listEle.get(j), 3);
							softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j)), "Possibly Element Is Not Visible For This URL "+actual);
						}
					}
					webDriverActions.closeDriver();
					webDriverActions.switchToWindow(parentUrl);
				}
				
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+eleList.size());
		}
		softAssert.assertAll("Issues found in this Url "+ actual);
	}

}

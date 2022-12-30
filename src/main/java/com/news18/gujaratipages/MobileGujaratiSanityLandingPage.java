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
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.asserts.SoftAssert;

import com.news18.commonpages.AMPValidatorPage;
import com.news18.init.DriverUtility;
import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class MobileGujaratiSanityLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public MobileGujaratiSanityLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//---------lifestyle
	/* Lifestyle section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/lifestyle/')]")
	private WebElement lifestyleSectionLnk;

	/* Lifestyle section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/lifestyle/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/lifestyle/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> lifestyleSectionArticleLnk;


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


	/*Breadcrumb present in article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement photosBreadcrumb;


	/* Article Header Text in Article Consumption Page */
	@FindBy(xpath ="//h1[contains(@class,'article_heading') or contains(@class,'live_blog') or contains(@class,'gallery_tilte')] | //div[contains(@class,'art') or contains(@class,'TstoryHead')]/h1" )
	private WebElement articleHeaderTxt;

	/* Article BreadCrumb Division */
	@FindBy(xpath = "//div[contains(@class,'brd')] | //div[contains(@class,'bread')]  | //ul[contains(@class, 'bread')]")
	private WebElement articleBreadCrumbDiv;

	/*Priority Panel Article Links in Homepage*/
	@FindBy(xpath = "(//div[contains(@class,'newstrendvideo')]//ul[contains(@class,'global-storylist')]//li//a)|(//div[contains(@class,'bigstory')])[1]/a")
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

	/*Gujarat Section City Links*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'/gujarat/')]//parent::h2//parent::div//following-sibling::ul//li//a")
	private List<WebElement> citiesLnks;

	/*Gujarat Section City Article Links*/
	@FindBy(xpath="(//div[contains(@class,'bigstory')]//following-sibling::ul)[1]//li//a[contains(@href,'gujarat')]")
	private List<WebElement> citiesArticleLnks;

	/*Articles breadcrumb Header Text */
	@FindBy(xpath ="//div[contains(@class,'crum') or contains(@class,'breadcum') or contains(@class,'brdc')]  | //ul[contains(@class, 'bread') or contains(@class,'brdc')]")
	private WebElement articleBreadcrumb;

	/*Line One Section Article Links Present in Mobile Hindi Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_links_cont')]//a")
	private List<WebElement> lineOneSectionELementLnk;  


	/*BreadCrumb Present on Article Header*/
	@FindBy(xpath="//div[contains(@class,'brda') or contains(@class,'bread') or contains(@class,'brd')] | //ul[contains(@class,'brdcrm') or contains(@class,'bread')]  | //h2[contains(@class,'brd')]")
	private WebElement headerBreadcrumbLnk;


	/*Hambergur icon present in Gujarati HomePage  */
	@FindBy(xpath ="//div[contains(@class,'mobile_nav_icon')]//a[contains(@class,'icon')]")
	private WebElement hambergerIcon;

	/*Hamburger Menu Home Section Links*/
	@FindBy(xpath ="//div//ul[contains(@id,'india-top-menu')]//li//a")
	private List<WebElement> hamburgerHomeSectionLnks; 

	/*Header logo present in Gujarati HomePage  */
	@FindBy(xpath ="//div[contains(@class,'news_page')] | //div[contains(@class,'brade_crum')] | //div[contains(@class,'CN-PageWrap')] | //div[contains(@class,'story_container')] | //div[contains(@class,'videosSliderWrapper')] | //div[contains(@class,'photoGalleryWrapper')]|//div[contains(@id,'header')]|//div[contains(@class,'brd')]|//div[@class='row']")
	private WebElement headerSection;

	/*Ad Link in priority panel*/
	@FindBy(xpath ="//div[contains(@id,'adunit')]")
	private List<WebElement> AdLink;

	@FindBy(xpath ="(//iframe[contains(@id,'google_ads_iframe')])[2]")
	private WebElement adFrame;
	
	@FindBy(xpath ="//span[contains(text(),'__NEXT_DATA__')]")
	private WebElement newStackText;

	@FindBy(xpath ="//a[contains(@href,'/tag/')]")
	private WebElement homePageTag;

	/*promoted content headline*/
	@FindBy(xpath ="//div[contains(@class,'ob_what')]//a//span[contains(@title,'Outbrain')]")
	private WebElement promotedContentHeadline;

	@FindBy(xpath ="(//div[contains(@class,'breadcum')])[2]")
	private WebElement secondArticleHeadline;

	/*Live blog Headline*/
	@FindBy(xpath ="(//div[contains(@class,'hd_heading')]//following-sibling::ul//li//a[contains(@href,'live')])[1]")
	private List<WebElement> liveBlogHeadline;

	/*Homepage List of article Link for news18 Gujarati Page*/
	@FindBy(xpath ="//div[contains(@class,'newstrendvideo-box')]//li/a[not(contains(@href,'live')) and not(contains(@href,'cricket')) and contains(@href,'/news/')]")
	private List<WebElement> homePageArticleLnk;

	/*photo section Present in Line one navigation bar in Gujarati HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[@href='/photogallery/']")
	private WebElement photoSectionLnk;

	/*Homepage First article Link  is present below the Line Two Menu Bar in RHS*/
	@FindBy(xpath ="//div[contains(@class,'pwa_page')]//ul[contains(@class,'gridview-story')]//a")
	private List<WebElement> photogalleryArticleLink ;

	/*Homepage List of Live article Link for news18 Gujarati Page*/
	@FindBy(xpath ="//div[contains(@class,'wapper')]//li/a[contains(@href,'live-updates')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*video link present at line one section*/
	@FindBy(xpath ="//div[contains(@class,'Menu_container')]//a[text()='11VIDEOS1']")
	private WebElement videoSectionLnk;

	/*Article of video Page*/
	@FindBy(xpath = "//div[contains(@class,'video')]//ul//li//a[contains(@href,'video')]")
	private WebElement videoArticlesLnk;

	/*Homepage cricket article Link is present in Cricket section */
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/sport/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/sport/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> cricketArticleLnk;

	/*Homepage List of Live article Link for news18 Gujarati Page*/
	@FindBy(xpath ="//div[contains(@class,'wapper')]//li/a[contains(@href,'live-updates')]")
	private WebElement homePageLiveBlogArticleLnks;
	
	@FindBy(xpath ="(//div//ul//li//div//iframe)[1]")
	private WebElement switchFrame;



	/**
	 * @author
	 * @param serverType
	 * This method is used to click on the articles present in the Homepage body 
	 */
	public void verifyUpperArticleNavigation(String serverType , List<WebElement> artList , WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
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
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(artList.get(i));
					webDriverActions.softScrollToElement(artList.get(i));
					actual = webDriverActions.getAttribute("href", artList.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClickJS(artList.get(i));
				}
				String currentPage =webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), currentPage);
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")){
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				String pageTitle = webDriverActions.getPageTitle();
				if (!pageTitle.contains("404")) {
					boolean status = genericUtility.compareUrlSub(currentPage, actual);
					softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
					webDriverActions.softHighlightElement(element);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in "+currentPage);;
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
	 * @author
	 * @param serverType
	 * This method is used to click on the articles present in the Homepage body 
	 */
	public void verifyPriorityArticleNavigation(String serverType , List<WebElement> artList , WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(artList, 15);
		if(artList.size()>0)
		{
			webDriverActions.softScrollToElement(artList.get(0));
			webDriverActions.softMouseHover(artList.get(0));
			for(int i=0; i<artList.size() ;i++)
			{
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				String actual =	webDriverActions.getAttribute("href", artList.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(artList.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(artList.get(i));
					webDriverActions.softScrollToElement(artList.get(i));
					actual = webDriverActions.getAttribute("href", artList.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClickJS(artList.get(i));
				}
				String currentPage =webDriverActions.getCurrentPageUrl();
				String expectedUrl = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")){
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				String pageTitle = webDriverActions.getPageTitle();
				if (!pageTitle.contains("404")) {
					boolean status = genericUtility.compareUrlSub(currentPage, actual);
					softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
					webDriverActions.softHighlightElement(element);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in "+currentPage);
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
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+artList.size());
		}

		softAssert.assertAll("Issues Found in Homepage Body");
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
		webDriverActions.waitForElement(1000);
		String title = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillElement(section, 20);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softMouseHover(section);
		if(artList.size()>0)
		{
			for(int i=0; i<1 ;i++)
			{
				String actual =	webDriverActions.getAttribute("href", artList.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.navigateToNewTab(artList.get(i));
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();

				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					actual=webDriverActions.getAttribute("href", artList.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.navigateToNewTab(artList.get(i));
					webDriverActions.switchToNewWindow();
					webDriverActions.waitForPageToLoad();
				}
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")){
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				String pageTitle = webDriverActions.getPageTitle();
				if (!pageTitle.contains("404")) {
					boolean status = genericUtility.compareUrlSub(currentPage, actual);
					softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
					webDriverActions.softHighlightElement(element);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in "+currentPage);
					webDriverActions.closeDriver();
					webDriverActions.switchToWindow(title);
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
		softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	
	}

	/**
	 * @author
	 * @param serverType
	 * This method is used to click on the articles present in the Homepage body 
	 */
	public void verifyLowerArticleNavigation(String serverType,WebElement section ,List<WebElement> artList, WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillElement(section, 12);
		webDriverActions.softMouseHover(section);
		if(artList.size()>0)
		{
			for(int i=0; i<1 ;i++)
			{
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				String actual =	webDriverActions.getAttribute("href", artList.get(i));
				webDriverActions.softClickJS(artList.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(artList.get(i));
					webDriverActions.softScrollToElement(artList.get(i));
					actual =	webDriverActions.getAttribute("href", artList.get(i));
					webDriverActions.softClickJS(artList.get(i));
				}
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
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element "+element +"in "+currentPage);
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
		softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	
	}

	/**
	 * @author 
	 * This method is used to click and navigate to gujarat Cities Articles
	 */
	public void verifyGujaratCitiesNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.softScrollToElement(citiesLnks.get(0));
		if(citiesLnks.size()>0) 
		{
			/* Below loop validates the Gujarati cities articles Navigations */
			for (int i = 10; i < 1;i++) {
				webDriverActions.softHighlightElement(citiesLnks.get(i));
				webDriverActions.softMouseHover(citiesLnks.get(i));
				webDriverActions.softClickJS(citiesLnks.get(i));
				webDriverActions.waitForSecond(2000);

				for (int j = 0; j < 1;j++) {
					webDriverActions.softHighlightElement(citiesArticleLnks.get(j));
					webDriverActions.softMouseHover(citiesArticleLnks.get(j));
					String actual = webDriverActions.getAttribute("href", citiesArticleLnks.get(j));
					webDriverActions.softClickJS(citiesArticleLnks.get(j));
					if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
					{
						webDriverActions.navigateBack();
						webDriverActions.softHighlightElement(citiesArticleLnks.get(j));
						webDriverActions.softMouseHover(citiesArticleLnks.get(j));
						webDriverActions.softClickJS(citiesArticleLnks.get(j));
						webDriverActions.waitForSecond(2000);
					}

					String currentPage = webDriverActions.getCurrentPageUrl();
					if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")){
						String betaUrl = genericUtility.replaceInUrl(currentPage);
						webDriverActions.navigateToUrl(betaUrl);
						currentPage=betaUrl;
					}
					String pageTitle = webDriverActions.getPageTitle();
					if (!pageTitle.contains("404")) {
						boolean status = genericUtility.compareUrlSub(currentPage, actual);
						softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
						webDriverActions.softHighlightElement(articleBreadcrumb);
						softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb) | webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Possibly Element is Not Visible "+currentPage);
						webDriverActions.navigateToUrl(homeUrl);
						webDriverActions.softScrollToElement(citiesLnks.get(i));
						webDriverActions.softHighlightElement(citiesLnks.get(i));
						webDriverActions.softMouseHover(citiesLnks.get(i));
						webDriverActions.softClickJS(citiesLnks.get(i));
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
			softAssert.fail("Possibly Element is Not Visible or Size is "+citiesLnks.size());
		}
		softAssert.assertAll("Issues Found In Validating Gujarat Section Cities Articles Present on HomePage");
	}

	/**
	 * @author 
	 * @param serverType
	 * This method is used to Validate the Webstories Article Navigation for Webstories Section
	 */
	public void verifyWebstoriesArticleNavigation(String serverType)
	{
		verifyArticlesNavigationNewTab(serverType,webstoriesTitleLnk,webstoriesArticleLnk, articleBreadCrumbDiv);
	}

	/**
	 * @author
	 * @param serverType
	 * This method is used to click on the categories present in the line one section
	 */
	public void verfyLineOneSectionAndSearchIcon()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String pageUrl=webDriverActions.getCurrentPageUrl();
		//Validating the Line one section Except Search Button
		for (int i = 1; i < lineOneSectionELementLnk.size(); i++)
		{
			webDriverActions.softMouseHover(lineOneSectionELementLnk.get(i));
			String actual = webDriverActions.getAttribute("href", lineOneSectionELementLnk.get(i));
			webDriverActions.softClick(lineOneSectionELementLnk.get(i));
			String currentPage=webDriverActions.getCurrentPageUrl();
			if(currentPage.contains("google_vignette") || currentPage.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateToUrl(pageUrl);
				webDriverActions.waitForPageToLoad();
				webDriverActions.softMouseHover(lineOneSectionELementLnk.get(i));
				webDriverActions.softClickJS(lineOneSectionELementLnk.get(i));
			}
			String pageTitle = webDriverActions.getPageTitle();
			if (!pageTitle.contains("404")) {
				boolean status = genericUtility.compareUrlSub(currentPage, actual);
				softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Failed To display Header Icon For This URL"+actual);
				webDriverActions.navigateBack();
			}
			else {
				Logs.error(getClass(),"Page has issue in this url : "+currentPage);
				softAssert.fail("Page has issue in this url : "+currentPage);
			}
		}
		softAssert.assertAll("Issues Found In Validating Line One Section");
	}

	//-----Life

	/**
	 * @author 
	 * This method is used to validate navigation of Lifestyle Widget Article
	 */
	public void verifyLifeWidgetArticle(String serverType) {
		verifyLowerArticleNavigation(serverType,lifestyleSectionLnk,lifestyleSectionArticleLnk, lifestyleBreadcrumb);
	}

	//-----Sport

	/**
	 * @author 
	 * This method is used to validate navigation of FooterSport Widget Article
	 */
	public void verifySportWidgetArticle(String serverType) {
		verifyLowerArticleNavigation(serverType,sportSectionLnk,sportSectionArticleLnk, sportBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of EyeCatcher Widget Article
	 */
	public void verifyEyeCatcherWidgetArticle(String serverType) {
		verifyLowerArticleNavigation(serverType,eyeCatcherSectionLnk,eyeCatcherSectionArticleLnk, eyeCatcherBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of MobileAndTech Widget Article
	 */
	public void verifyMobileAndTechWidgetArticle(String serverType) {
		verifyLowerArticleNavigation(serverType,mobileAndTechSectionLnk,mobileAndTechSectionArticleLnk, mobileAndTechBreadcrumb);
	}


	/**
	 * @author 
	 * This method is used to validate navigation of Entertainment Widget Article
	 */
	public void verifyEntertainmentWidgetArticle(String serverType) {
		verifyLowerArticleNavigation(serverType,entertainmentSectionLnk,entertainmentSectionArticleLnk, entertainmentBreadcrumb);
	}

	/**
	 * @author 
	 * This method is used to validate navigation of national-international Widget Article
	 */
	public void verifyNationalInternationalWidgetArticle(String serverType) {
		verifyLowerArticleNavigation(serverType,nationalInternationalSectionLnk,nationalInternationalArticleLnk, nationalInternationalBreadcrumb);
	}

	/**
	 * @author 
	 * This method is used to validate navigation of Career Widget Article
	 */
	public void verifyCareerWidgetArticle(String serverType) {
		verifyLowerArticleNavigation(serverType,careerSectionLnk,careerSectionArticleLnk, careerBreadcrumb);
	}

	/**
	 * @author 
	 * This method is used to validate navigation of Business Widget Article
	 */
	public void verifyBusinessWidgetArticle(String serverType) {
		verifyLowerArticleNavigation(serverType,businessSectionLnk,businessSectionArticleLnk, businessBreadcrumb);
	}

	/**
	 * @author 
	 * This method is used to validate navigation of Video Widget Article
	 */
	public void verifyVideoWidgetArticle(String serverType) {
		verifyArticlesNavigationNewTab(serverType,videoBodySectionLnk,videoSectionArticleLnk, videoBreadcrumb);
	}

	/**
	 * @author 
	 * This method is used to validate navigation of Photo Widget Article
	 */
	public void verifyPhotosWidgetArticle(String serverType) {
		verifyArticlesNavigationNewTab(serverType,photosBodySectionLnk,photosSectionArticleLnk, photosBreadcrumb);
	}

	/**
	 * @author 
	 * This method is used to validate navigation of Priority panel Article
	 */
	public void verifyPriorityPanelArticleNavigation(String serverType)
	{
		verifyPriorityArticleNavigation(serverType, priorityPanelArticleLnk, articleBreadCrumbDiv);
	}

	/**
	 * @author 
	 * This method is used to validate navigation of DharamBhakti Widget Article
	 */
	public void verifyDharamBhaktiArticleNavigation(String serverType)
	{
		verifyUpperArticleNavigation(serverType, dharamBhaktiArticleLnk, articleBreadCrumbDiv);
	}

	/**
	 * @author 
	 * This method is used to validate navigation of Priority panel image Widget Article
	 */
	public void verifyPriorityPanelImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType ,priorityPanelImgLnk, articleHeaderTxt);
	}

	/**
	 * @author 
	 * @param serverType
	 * This method is used to click on the image present in the priority panel
	 */
	public void verifyHamburgerSectionNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softMouseHover(hambergerIcon);
		webDriverActions.clickJS(hambergerIcon);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softClickJS(hambergerIcon);
		}
		for (int i = 1;i < hamburgerHomeSectionLnks.size()-6; i++) {
			webDriverActions.softScrollToElement(hamburgerHomeSectionLnks.get(i));
			webDriverActions.softMouseHover(hamburgerHomeSectionLnks.get(i));
			String actual = webDriverActions.getAttribute("href", hamburgerHomeSectionLnks.get(i));
			webDriverActions.softClickJS(hamburgerHomeSectionLnks.get(i));
			String currentPage =webDriverActions.getCurrentPageUrl();
			String pageTitle = webDriverActions.getPageTitle();
			if (!pageTitle.contains("404")) {
				boolean status = genericUtility.compareUrlSub(currentPage, actual);
				softAssert.assertTrue(status==true, "Possibily url is not same in article page "+currentPage);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerSection) ,  "Unable to Display Element in "+currentPage);
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(hambergerIcon);
			}
			else {
				Logs.error(getClass(),"Page has issue in this url : "+currentPage);
				softAssert.fail("Page has issue in this url : "+currentPage);
			}
		}
		softAssert.assertAll("Issues found in this url ");
	}


	public void verifyImageNavigation(String serverType,List<WebElement> imgList, WebElement element)
	{
		SoftAssert softAssert = new SoftAssert(); 
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(imgList.get(0), 50);
		webDriverActions.softScrollToElement(imgList.get(0));
		webDriverActions.softMouseHover(imgList.get(0));
		for(int i=0; i<imgList.size() ;i++)
		{
			webDriverActions.softMouseHover(imgList.get(i));
			webDriverActions.softScrollToElement(imgList.get(i));
			String actual =	webDriverActions.getAttribute("src", imgList.get(i));
			webDriverActions.softClickJS(imgList.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(imgList.get(i));
				webDriverActions.softScrollToElement(imgList.get(i));
				actual = webDriverActions.getAttribute("href", imgList.get(i));
				webDriverActions.softClickJS(imgList.get(i));
			}
			String currentPage =webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			}
			webDriverActions.waitForPageToLoad();
			String expected =webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), expected);
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

	public void verifyHomepageNewStack() {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.viewPageSource();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(newStackText) , "Unable to Display Element in "+webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues Found");
	}

	public void verifyTagPageNewStack() {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.softClickJS(homePageTag);
		webDriverActions.switchToNewWindow();
		webDriverActions.viewPageSource();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(newStackText) , "Unable to Display Element in "+webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues Found");
	}
	public void verifyPhotogalleryPageNewStack() {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.softClickJS(dharamBhaktiImgLnk.get(1));
		webDriverActions.switchToNewWindow();
		webDriverActions.viewPageSource();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(newStackText) , "Unable to Display Element in "+webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues Found");
	}

	public void verifyVideoPageNewStack() {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		webDriverActions.softClickJS(videoSectionArticleLnk.get(0));
		webDriverActions.switchToNewWindow();
		webDriverActions.viewPageSource();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(newStackText) , "Unable to Display Element in "+webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues Found");	
	}

	public void verifyCategoryPageNewStack() {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		webDriverActions.softClickJS(lineOneSectionELementLnk.get(1));
		webDriverActions.switchToNewWindow();
		webDriverActions.viewPageSource();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(newStackText) , "Unable to Display Element in "+webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues Found");
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
				webDriverActions.softClickJS(priorityPanelArticleLnk.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(priorityPanelArticleLnk.get(i));
					actual = webDriverActions.getAttribute("href", priorityPanelArticleLnk.get(i));
					webDriverActions.softClickJS(priorityPanelArticleLnk.get(i));
				}
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
					webDriverActions.mobileScroll(6);
					webDriverActions.continuousScrollTillElement(promotedContentHeadline, 5);
					webDriverActions.softWaitForElementVisibility(secondArticleHeadline, 3);
					webDriverActions.softHighlightElement(secondArticleHeadline);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(secondArticleHeadline) , "Unable to Display Element in "+currentPage);
				}
				else {
					Logs.error(getClass(),"Page has issue in this url : "+currentPage);
					softAssert.fail("Page has issue in this url : "+currentPage);
				}
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+priorityPanelArticleLnk.size());
		}
		softAssert.assertAll("Issues Found In Validating Infinite Scroll");
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
	/**
	 * @author DanishR
	 * This method is used to click on First Article of English Home Page 
	 */
	public void ampPageNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		//		String currentPageUrl="";
		webDriverActions.waitForPageToLoad();
		String pageUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForElement(1000);
		webDriverActions.softWaitForAllElementsVisible(priorityPanelArticleLnk, 3);
		softAssert.assertTrue(priorityPanelArticleLnk.size()>0,"Possibily element not visible "+ webDriverActions.getCurrentPageUrl());
		ArrayList<String>list=new ArrayList<>();
		for (int i = 0; i < 1; i++) {
			webDriverActions.softMouseHover(priorityPanelArticleLnk.get(i));
			String priorityPanelUrl = webDriverActions.getAttribute("href", priorityPanelArticleLnk.get(i));

			if (serverType.contains("preProd") && !priorityPanelUrl.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(priorityPanelUrl);
				priorityPanelUrl=betaUrl;
			}
			list.add(priorityPanelUrl);	
			System.out.println(list.get(i));
			webDriverActions.navigateToUrl(pageUrl);
			AMPValidatorPage ampUrl = new AMPValidatorPage(driver);
			String url = ampUrl.getAmpHtml(list.get(i));
			webDriverActions.navigateToUrl(url);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb, 2),"Possibily element is not visible "+url);
		}
		softAssert.assertAll("Issue found in Amp Page Navigation ");
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
	 * @author Abhishek
	 * This method used to click on photos section of Gujarati Homepage
	 */
	public void clickOnPhotoSection(String serverType)
	{
		SoftAssert softAssrt = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		if (webDriverActions.softIsElementDisplayed(photoSectionLnk, 1)) {
			webDriverActions.softClickJS(photoSectionLnk);
			if (photogalleryArticleLink.size()>0) {
				webDriverActions.softClickJS(photogalleryArticleLink.get(0));
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
				softAssrt.fail(" Possibly Element is Not Visible in url : "+webDriverActions.getCurrentPageUrl()+" in article link element "+photogalleryArticleLink.get(0));
			}
		}
		else {
			softAssrt.fail(" Possibly Element is Not Visible in url : "+webDriverActions.getCurrentPageUrl()+" in section link element "+photoSectionLnk);
		}
		softAssrt.assertAll("Issue found in Video section :");
	}

	/**
	 * @author Sanjeeb
	 * This method used to verify liveblog in Homepage
	 */
	public void clickOnLiveBlogArticleHomePage(String serverType) {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		if(homePageLiveBlogArticleLnk.size()>1)
		{
			webDriverActions.softClickJS(homePageLiveBlogArticleLnk.get(0));
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

	/**
	 * @author Sanjeeb
	 * This method is used to click on Videos Section news 18 Hindi Home Page 
	 */
	public void navigateToVideosSection(String serverType) {
		SoftAssert softAssrt = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		Assert.assertTrue(webDriverActions.softIsElementDisplayed(videoSectionLnk, 1), " Possibly Element is Not Visible "+ webDriverActions.getCurrentPageUrl());
		webDriverActions.softClickJS(videoSectionLnk);
		Assert.assertTrue(webDriverActions.softIsElementDisplayed(videoArticlesLnk, 1), " Possibly Element is Not Visible "+ webDriverActions.getCurrentPageUrl());
		webDriverActions.softClickJS(videoArticlesLnk);
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
		softAssrt.assertTrue(webDriverActions.softIsElementDisplayed(videoArticlesLnk,1), "Possibily element is not displayed "+webDriverActions.getCurrentPageUrl());
		softAssrt.assertAll("Issue found in Video section :");
	}

	/**
	 * @author DanishR
	 * This method is used to click on First Article of English Home Page 
	 */
	public ArrayList<String> priorityPanelArticles(String serverType) {
		SoftAssert softAssrt = new SoftAssert();
		//		String currentPageUrl="";
		webDriverActions.waitForPageToLoad();
		String pageUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForElement(1000);
		webDriverActions.softWaitForAllElementsVisible(priorityPanelArticleLnk, 3);
		softAssrt.assertTrue(priorityPanelArticleLnk.size()>0,"Possibily element not visible "+ webDriverActions.getCurrentPageUrl());
		ArrayList<String>list=new ArrayList<>();
		for (int i = 0; i < 1; i++) {
			webDriverActions.softMouseHover(priorityPanelArticleLnk.get(i));
			String priorityPanelUrl = webDriverActions.getAttribute("href", priorityPanelArticleLnk.get(i));

			if (serverType.contains("preProd") && !priorityPanelUrl.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(priorityPanelUrl);
				priorityPanelUrl=betaUrl;
			}
			list.add(priorityPanelUrl);	
			System.out.println(list.get(i));
			webDriverActions.navigateToUrl(pageUrl);

		}
		softAssrt.assertAll("Issue found in priorityPanelArticles "+ webDriverActions.getCurrentPageUrl());
		return list;
	}
	/**
	 * @author DanishR
	 * @param serverType
	 * 
	 */
	public ArrayList<String> verifyCricketNextArticleLnk(String serverType)
	{
		SoftAssert assrt = new SoftAssert();
		ArrayList<String>list=new ArrayList<>();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		if (cricketArticleLnk.size()>0) {
			String cricketUrl = webDriverActions.getAttribute("href", cricketArticleLnk.get(0));
			if (serverType.contains("preProd") && !cricketUrl.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(cricketUrl);
				cricketUrl=betaUrl;
			}
			list.add(cricketUrl);
		}
		else {
			assrt.fail(" Possibly Element is Not Visible in url : "+webDriverActions.getCurrentPageUrl()+" in article link element "+cricketArticleLnk.get(0));
		}
		return list;

	}

	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of English Home Page 
	 */
	public ArrayList<String> homePageLiveBlogArticle(String serverType) {
		ArrayList<String>list=new ArrayList<>();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softWaitForElementVisibility(homePageLiveBlogArticleLnks, 3);
		if(webDriverActions.isElementDisplayed(homePageLiveBlogArticleLnks))
		{
			String liveBlogUrl = webDriverActions.getAttribute("href", homePageLiveBlogArticleLnks);
			if (serverType.contains("preProd") && !liveBlogUrl.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(liveBlogUrl);
				liveBlogUrl=betaUrl;
			}
			list.add(liveBlogUrl);
		}
		else
		{
			Logs.error(getClass(), "Exception in Live blog in HomePage Link");
			throw new SkipException("Unable to locate Live Blog Article element possibly no Live Blog Present "+webDriverActions.getCurrentPageUrl());	
		}
		return list;
	}
}

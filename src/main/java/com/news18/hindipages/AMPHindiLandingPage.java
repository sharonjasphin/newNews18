package com.news18.hindipages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.news18.init.DriverUtility;
import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class AMPHindiLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	SoftAssert softAssert=new SoftAssert();

	public AMPHindiLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//	************************Danish**Webelements*******************

	/*Hamburger Menu in AMP Hindi Home Page*/
	@FindBy(xpath="//div[contains(@class,'mobile_nav_icon')]//button[contains(@class,'nav_icon')]")
	private WebElement hamburgerMenuLnk;

	/*Hamburger Menu Home Section Links*/
	@FindBy(xpath ="//*[@id='sidebar1']/ul/li/a")
	private List<WebElement> hamburgerHomeSectionLnks;

	/*Bhasha Chune(Change Language) section herader present at Header Hamburger Menu*/
	@FindBy(xpath ="//div[contains(@class,'language')]//child::label[contains(@class,'language')]")
	private WebElement hamburgerLangSection;  

	/*Bhasha Chune(Change Language) links present at Header Hamburger Menu*/
	@FindBy(xpath ="//ul[contains(@class,'menu')]//li//a[contains(@href,'news18')]")
	private List<WebElement> hamburgerLangLnks; 

	/*Header Section Present After Clicking on any elements*/
	@FindBy(xpath ="//div[contains(@id,'header')] | //div[contains(@class,'header')]")
	private WebElement headerSection;

	/*Header Section Present After Clicking on any elements*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//h2//a[contains(@href,'web-stories')]")
	private WebElement webStoriesSection;

	/*Articles breadcrumb Header Text */
	@FindBy(xpath ="//div[contains(@class,'brade_crum')] | //div[contains(@class,'br')]  | //ul[contains(@class, 'br')]")
	private WebElement articleBreadcrumb;

	/*bollywoodTabLnk present at the AMP Hindi consumption Page*/
	@FindBy(xpath ="//a[contains(@href,'news/entertainment')]//parent::h2//parent::div//following-sibling::ul[1]//li//a")
	private List<WebElement> bollywoodTabLnk;

	/*bollywoodarticleLnk present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'bigstory')]//following-sibling::ul//li//a[contains(@href,'entertainment')]")
	private List<WebElement> bollywoodarticleLnk;

	/*bollywoodReadmore present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@id,'clkbuttonpradesh')]//following-sibling::a[contains(@class,'aur')and contains(@href,'entertainment')]")
	private WebElement bollywoodReadmore;

	/*bollywoodHeadline present at the AMP Hindi Home Page*/
	@FindBy(xpath ="(//div//a[contains(@href,'entertainment')]//parent::h2//parent::div)[2]")
	private WebElement bollywoodHeadline;

	/*mobileTech present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div//a[contains(@href,'tech')]//parent::h2//parent::div")
	private WebElement mobileTech;

	/*Pradesh News present after cricket next section*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//h2//a[contains(@href,'pradesh')]")
	private WebElement pradeshNews;

	/*Pradesh News state links*/
	@FindBy(xpath ="(//div[contains(@id,'pradesh')])[1]//a")
	private List<WebElement> pradeshNewsArticleLinks;

	/*Pradesh News rajya chune link*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@class,'forstatesection')]")
	private WebElement rajyaChuneLnk;

	/*Pradesh News rajya chune link*/
	@FindBy(xpath ="//div[contains(@class,'tpchsstctnames')]//div[contains(@class,'state')]//ul//li//a")
	private List<WebElement> rajyaChuneStateList;

	/*Pradesh News state left right buttons*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//div//button")
	private List<WebElement> buttonLnks;

	/*Pradesh News state left right buttons*/
	@FindBy(xpath ="(//div[contains(@id,'pradesh')])[1]//a")
	private List<WebElement> stateArticleLnks;

	/*Pradesh News aur bhi dekhu-more*/
	@FindBy(xpath ="//*[@id='__next']/div/div[12]/a[contains(@href,'pradesh')]")
	private WebElement aurbhiDekhu;

	/*Pradesh News aur bhi dekhu-more*/
	@FindBy(xpath ="//div//a[contains(@href,'pradesh') and contains(@class,'aur')]")
	private WebElement pradeshNewsMoreLinks;

	/* Webstories Section  Title Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]//h2/a")
	private WebElement webstoriesTitleLnk;

	/* List of Webstrories Article Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'slick-slide') and not (contains(@class,'slick-cloned'))]//a")
	private List<WebElement> webstoriesArticleLnk;

	/* List of Webstrories Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'slick-slide') and not (contains(@class,'slick-cloned'))]//a/img")
	private List<WebElement> webstoriesImgLnk;

	/* Active Webstories Article Link in Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'current') and not (contains(@class,'slick-cloned'))]//a")
	private WebElement activeWebstoriesArticleLnk;

	/* Active Webstories Image Link in Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'current') and not (contains(@class,'slick-cloned'))]//a")
	private WebElement activeWebstoriesImgLnk;

	/* WebStories Next Story Button after navigation of WebStories Article */
	@FindBy(xpath = "//div[contains(@class,'next-container')]")
	private WebElement nextWebStoryBtn;

	/* Webstories Slider Button in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]//ul[contains(@class,'slick-dots')]/li[not (contains(@class,'active'))]/button")
	private List<WebElement> webstoriesSliderBtn;

	//	************************Rahul**Webelements*******************************

	/*AirqualityHeadline present at the AMP Hindi Home Page*/
	@FindBy(xpath="//div[contains(@class,'aqiwidget kul')]//h2")
	private WebElement airQualityHeadline;

	/*airQualityWidgetLnkLst present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'aqiwidget kul')]//ul//li//a")
	private List<WebElement> airQualityWidgetLnkLst;

	/*airQualityBreadcrum present at the AMP Hindi consumption Page*/
	@FindBy(xpath="//div[contains(@class,'logo_wrap')]")
	private WebElement airQualityBreadcrum;

	/*jobHeadline present at the AMP Hindi Home Page*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//h2//a[contains(@href,'job')]")
	private WebElement jobHeadline;

	/*jobBreadcrum present at the AMP Hindi Consumption Page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')]")
	private WebElement jobBreadcrum;

	/*jobTabsLst present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div//a[contains(@href,'jobs')]//parent::h2//parent::div//following-sibling::ul//li//a")
	private List<WebElement> jobTabsLst;

	/*jobArticleLst present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/jobs/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li//a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/news/jobs/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a")
	private List<WebElement> jobArticleLst;

	/*jobReadmoreBtn present at the AMP Hindi Home Page*/
	@FindBy(xpath ="(//div[contains(@class,'cartoonwrap')]//following-sibling::div[contains(@id,'clkbuttonknowledge')])[1]//following-sibling::a[contains(@class,'aur')][1]")
	private WebElement jobReadmoreBtn;

	/*foodTitle present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//h2//a[contains(@href,'recipe')]")
	private WebElement foodTitle;

	/*foodSectionArticleLst present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div//a[contains(@href,'/recipe')]//parent::h2//parent::div//following-sibling::div[1]//ul//li//a")
	private List<WebElement> foodSectionArticleLst;

	/*foodSectionImg present at the AMP Hindi Home Page*/
	@FindBy(xpath ="(//a[contains(@href,'/recipe')]//parent::h2//parent::div//following-sibling::div//child::div[contains(@class,'bigstory')]//img)[1]")
	private WebElement foodSectionImg;

	/*foodSectionReadmore present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div//a[contains(@href,'/recipe') and contains(@class,'aur')]")
	private WebElement foodSectionReadmore;

	/*foodSectionBreadcrum present at the AMP Hindi Consumption Page*/
	@FindBy(xpath ="//div[contains(@class,'brade_crum')] | //div[contains(@class,'br')]  | //ul[contains(@class, 'bread')]")
	private WebElement foodSectionBreadcrum;

	/*foodSectionHeaderBreadcrum present at the AMP Hindi Consumption Page*/
	@FindBy(xpath ="//div[contains(@class,'bread')] ")
	private WebElement foodSectionHeaderBreadcrum;

	/*healthFitnessTitle present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//h2//a[contains(@href,'health')]")
	private WebElement healthFitnessTitle;

	/*healthFitnessImage present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'bigstory')] //a[contains(@href,'/health')]//img")
	private WebElement healthFitnessImage;

	/*healthArticleLst present at the AMP Hindi Home Page*/
	@FindBy(xpath ="(//div[contains(@class,'bigstory')]//a[contains(@href,'/health')]//parent::div//following-sibling::ul//li//a)")
	private List<WebElement> healthArticleLst;

	/*healthReadmore present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div//a[contains(@href,'/health') and contains(@class,'aur')]")
	private WebElement healthReadmore;

	/*healthSectionBreadcrum present at the AMP Hindi Consumption Page*/
	@FindBy(xpath ="//div[contains(@class,'top') or contains(@class,'article')]/preceding-sibling::div")
	private WebElement healthSectionBreadcrum;

	/*readMorePanchang present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'panchang')]//a")
	private WebElement readMorePanchang;

	/*todaysPanchangHeadline present at the AMP Hindi Home Page*/
	@FindBy(xpath ="(//div[contains(@class,'panchang')]//p)[1]")
	private WebElement todaysPanchangHeadline;

	/*panchangBreadcrum present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'brdcrm_row_link')]")
	private WebElement panchangBreadcrum;

	/*autoSectionHeadline present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//h2//a[contains(@href,'auto')]")
	private WebElement autoSectionHeadline;

	/*autoArticleLst present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//a[contains(@href,'/auto')]//parent::h2//parent::div//following-sibling::div[1]//ul//li//a")
	private List<WebElement> autoArticleLst;

	/*autoReadmore present at the AMP Hindi Home Page*/
	@FindBy(xpath ="(//div//a[contains(@href,'/auto')]//parent::h2//parent::div//following-sibling::div//following-sibling::a)[1]")
	private WebElement autoReadmore;

	/*autoSectionBreadcrum present at the AMP Hindi Home Page*/
	@FindBy(xpath ="(//div[contains(@class,'brade_crum')] | //div[contains(@class,'br')]  | //ul[contains(@class, 'bread')])[1]")
	private WebElement autoSectionBreadcrum;

	/*blogHeadline present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div//a[contains(@href,'blog')]//parent::h2//parent::div")
	private WebElement blogHeadline;

	/*cartoonTitle present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div//a[contains(@href,'cartoon')]//parent::div[contains(@class,'cartoon')]//a")
	private WebElement cartoonTitle;

	/*cartoonBreadcrum present at the AMP Hindi Consumption Page*/
	@FindBy(xpath ="//h1[contains(@class,'br')]")
	private WebElement cartoonBreadcrum;

	/*cartoonStory present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'cartoonwrap')]//img")
	private List<WebElement> cartoonStory;

	/*cricketOption present at the AMP Hindi Home Page*/
	@FindBy(xpath ="(//div[contains(@class,'clue-box')])[1]//span")
	private WebElement cricketOption;

	/*cricketOptionNext present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'qus-pn-cont')]//a")
	private WebElement cricketOptionNext;

	/*cricketOptionNext present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'quiz-container ')]//div")
	private WebElement cricketHeadline;

	/*cricketFrame present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//iframe[contains(@name,'amp_iframe')]")
	private WebElement cricketFrame;

	/*cricketKaTestNxtBtn present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'qus-info clearfix')]//span")
	private List<WebElement> cricketKaTestNxtBtn;

	/* cricketKaTestNxtBtn present at the RHS*/
	@FindBy(xpath ="//div[@class='qus-layout']//div[contains(@class,'clue-box')][1]//span")
	private List<WebElement> cricket;

	/* Send Button in cricket Ka Test*/
	@FindBy(xpath ="//a[contains(@class,'finish')]")
	private WebElement sendButton;

	//------------------------------Sanjeeb Elements-------------------------------//

	/*Header News 18 Logo*/
	@FindBy(xpath="//div[contains(@class,'header')]//a")
	private WebElement new18Logo;

	/*Line One Section Article Links Present in Mobile Hindi Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_links_cont')]//a")
	private List<WebElement> lineOneSectionELementLnk;  

	/*BreadCrumb Present on Article Header*/
	@FindBy(xpath="//div[contains(@class,'brda') or contains(@class,'bread') or contains(@class,'brd')] | //ul[contains(@class,'brdcrm') or contains(@class,'bread')] | //h1")
	private WebElement headerBreadcrumbLnk;

	/*minis Header Text*/
	@FindBy(xpath="//div[contains(@class,'minis_headWrap')] | //div[contains(@class,'bread')]")
	private WebElement miniHeaderTxtLnk;

	/*icici Header Text*/
	@FindBy(xpath="(//div[contains(@class,'logo')])[2]")
	private WebElement iciciHeaderTxtLnk;

	/*Nerolac Header Text*/
	@FindBy(xpath="//div[contains(@class,'logo_sec')]")
	private WebElement nerolacHeaderTxtLnk;

	/*Krypto ki khojo Header Text*/
	@FindBy(xpath="(//div[contains(@class,'crypto_wrap')]//div/img)[1]")
	private WebElement kryptoTxtLnk;

	/*netra Suraksha Header Text*/
	@FindBy(xpath="(//div[contains(@class,'launch_info')]//img)[1]")
	private WebElement netraSurkshaTxtLnk;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'headtop')]")
	private WebElement electralHydrationText;

	/*Search Icon Present On Header Section of hindi Homepage*/
	@FindBy(xpath="//div[contains(@class,'search_icon')]")
	private WebElement searchIconLnk;

	/*Input Box Present On Header Section of hindi Homepage after clicking on Search Button Present on the header*/
	@FindBy(xpath="//div[contains(@class,'gsc-input-box')]//input")
	private WebElement searchIconTxtField;

	/*Inside Search Button */
	@FindBy(xpath="//div[contains(@class,'gsc-control-wrapper-cse')]//button")
	private WebElement insideSearchBtn;

	/*Inside Close Button */
	@FindBy(xpath="//div[contains(@class,'close-btn')]")
	private WebElement insideCloseBtn;

	/*RajyaSeherChune Link Present on Line One Section Of Hindi Landing Page*/
	@FindBy(xpath="//div[contains(@class,'chs-stct')] | //div[contains(@class,'hdrrgt')]/button")
	private WebElement rajyaSeherChuneLnk;

	/*cancel Button Present After clicking Seher Chune Present on the Line One Section of Hindi homepage */
	@FindBy(xpath="//div[contains(@class,'tpchsstctpopup')]/a")
	private WebElement cancelBtn;

	/*Apna Seher Chune Input Box Present after Clicking on Seher Chune Present on the Line One Section of Hindi homepage*/
	@FindBy(xpath="//div[contains(@class,'tpchsstctnames')]/input")
	private WebElement apnaSeherChuneBox;

	/*list Of elements present under apna Seher chune*/
	@FindBy(xpath="//div[contains(@class,'tpchsstctnames')]//a")
	private List<WebElement> apnaSeherChuneEleList;

	/*list Of elements present under rajya Section*/
	@FindBy(xpath="//div[contains(@class,'tpstatesnames')]//li/a")
	private List<WebElement> rajyaSectionEleList;

	/*list Of elements present under rajya Section Dropdown*/
	@FindBy(xpath="//li[contains(@class,'active')]//parent::li/child::div/a")
	private List<WebElement> rajyaSectionDropdwnEleList;

	/*list Of all elements present under rajya Section*/
	@FindBy(xpath="//div[contains(@class,'tpstatesnames')]//li")
	private List<WebElement> rajyaSectionEleDropDwn;


	//====================Anupam* Webelement===========
	//------horoscope
	/*Horoscope Section Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/news/astro/')]")
	private WebElement horoscopeSectionLnk;

	/*Astrology Signs present under Horoscope sub module*/
	@FindBy(xpath ="//div[contains(@class,'astro_slides')]//em/ancestor::a")
	private  List<WebElement> horoscopeSigns;

	/*Astrology Signs present under Horoscope sub module*/
	@FindBy(xpath ="//div[contains(@class,'astro_slides')]//em/ancestor::a")
	private  List<WebElement> horoscopeSignsLnk;

	/*Horoscope Sign Text in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'astro_slides')]//em/ancestor::a")
	private List<WebElement> horoscopeSignsTxt;

	/*horoscope info present in Horoscope page*/
	@FindBy(xpath ="//p[contains(@class,'detail_intro')]")
	private WebElement horoscopeInfo;


	//---------Lifestyle
	/* Lifestyle section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/news/lifestyle/')]")
	private WebElement lifestyleSectionLnk;

	/* Lifestyle section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/news/lifestyle/')]/ancestor::div[contains(@class,'globalhd')]/following-sibling::div/div/a[contains(@href,'/news/lifestyle/')] |  //div[contains(@class,'globalhd')]//a[(@href='/news/lifestyle/')]/ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> lifestyleSectionArticleLnk;

	/* Lifestyle section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/news/lifestyle/')]/ancestor::div[contains(@class,'globalhd')]/following-sibling::div/div/a[contains(@href,'/news/lifestyle/')]//img |  //div[contains(@class,'globalhd')]//a[(@href='/news/lifestyle/')]/ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li//img")
	private List<WebElement> lifestyleSectionImgLnk;

	/* Lifestyle section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/news/lifestyle/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[(@href='/news/lifestyle/')]")
	private WebElement readMoreLifestyleSectionLnk;

	/*Breadcrumb present in Lifestyle article page*/
	@FindBy(xpath ="//div[contains(@class,'brdcrm')] | //div[contains(@class,'breadcum')]")
	private WebElement lifestyleBreadcrumb;

	//---------Dharm
	/* Dharm section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/dharm/')]")
	private WebElement dharmSectionLnk;

	/* Dharm section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/dharm/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li//a")
	private List<WebElement> dharmSectionArticleLnk;

	/* Dharm section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/dharm/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li//img")
	private List<WebElement> dharmSectionImgLnk;

	/* Dharm section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/dharm/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreDharmSectionLnk;

	/*Dharm present in Lifestyle article page*/
	@FindBy(xpath ="//div[contains(@class,'brdcrm')] | //div[contains(@class,'breadcum')]")
	private WebElement dharmBreadcrumb;

	//---------nation
	/* Nation section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/nation/')]")
	private WebElement nationSectionLnk;

	/* Nation section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/nation/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a  | //div[contains(@class,'globalhd')]//a[contains(@href,'/news/nation/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a")
	private List<WebElement> nationSectionArticleLnk;

	/* Nation section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/nation/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> nationSectionImgLnk;

	/* Nation section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/nation/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[contains(@href,'/news/nation/')]")
	private WebElement readMoreNationSectionLnk;

	/*Breadcrumb present in nation article page*/
	@FindBy(xpath ="//div[contains(@class,'brdcrm')] | //div[contains(@class,'breadcum')]")
	private WebElement nationBreadcrumb;


	//---------world
	/* World section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/world/')]")
	private WebElement worldSectionLnk;

	/* World section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/world/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li//a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/news/world/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a")
	private List<WebElement> worldSectionArticleLnk;

	/* World section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/world/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> worldSectionImgLnk;

	/* world section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/world/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[contains(@href,'/news/world/')]")
	private WebElement readMoreWorldSectionLnk;

	/*Breadcrumb present in world article page*/
	@FindBy(xpath ="//div[contains(@class,'brdcrm')] | //div[contains(@class,'breadcum')]")
	private WebElement worldBreadcrumb;

	///------------video
	/* Video section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/videos/')]")
	private WebElement videoSectionLnk;

	/* Video section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/videos/')]/ancestor::div[contains(@class,'globalhd')]/following-sibling::div//li[not (contains(@class,'slide--clone'))]/a")
	private List<WebElement> videoSectionArticleLnk;

	/* Video section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/videos/')]/ancestor::div[contains(@class,'globalhd')]/following-sibling::div//li[not (contains(@class,'slide--clone'))]//img")
	private List<WebElement> videoSectionImgLnk;

	/* Video section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/videos/')]/ancestor::div[contains(@class,'globalhd')]/following-sibling::a")
	private WebElement readMoreVideoSectionLnk;

	/* Video active slider present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/videos/')]/ancestor::div[contains(@class,'globalhd')]/following-sibling::a")
	private WebElement videoActiveSliderLnk;

	/* Video slider present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/videos/')]/ancestor::div[contains(@class,'globalhd')]/following-sibling::div//button")
	private List<WebElement> videoSliderLnk;

	/*Breadcrumb present in article page*/
	@FindBy(xpath ="//div[contains(@class,'brdcrm')] | //div[contains(@class,'breadcum')]")
	private WebElement videoBreadcrumb;

	//---------knowledge
	/* Knowledge section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/knowledge/')]")
	private WebElement knowledgeSectionLnk;

	/* Knowledge section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/knowledge/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li//a")
	private List<WebElement> knowledgeSectionArticleLnk;

	/* Knowledge section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/knowledge/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> knowledgeSectionImgLnk;

	/* Knowledge section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/knowledge/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreKnowledgeSectionLnk;

	/*Breadcrumb present in Knowledge article page*/
	@FindBy(xpath ="//div[contains(@class,'brdcrm')] | //div[contains(@class,'breadcum')]")
	private WebElement knowledgeBreadcrumb;

	// ------------------------------- Vipin Webelement ---------------------------//


	/* Article BreadCrumb Division */
	@FindBy(xpath = "//div[contains(@class,'brd')] | //div[contains(@class,'bread')]  | //ul[contains(@class, 'bread')]")
	private WebElement articleBreadCrumbDiv;

	/* Article Header Text in Article Consumption Page */
	@FindBy(xpath ="//h1[contains(@class,'article_heading') or contains(@class,'live_blog') or contains(@class,'gallery_tilte')] | //div[contains(@class,'art') or contains(@class,'TstoryHead') or contains(@class,'top')]/h1" )
	private WebElement articleHeaderTxt;

	/* Article Banner Link In homepage*/
	@FindBy(xpath = "//div[contains(@class,'exclusive-news')]/a")
	private List<WebElement> articleBannerLnk;

	/*List of Priority Panel Articles in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newstrendvideo')]/ul[contains(@class,'global-storylist')]/li/a")
	private List<WebElement> tazaSamacharArticleLnk;

	/*List of Priority Panel Image in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newstrendvideo')]/ul[contains(@class,'global-storylist')]/li/a//img")
	private List<WebElement> tazaSamacharImgLnk;

	/*Top Hindi News Article Link in Homepage */
	@FindBy(xpath = "//span[contains(@class,'pb')]/ancestor::div[contains(@class,'bigstory')]/a")
	private List<WebElement> topHindiNewsArticleLnk; 

	/*Top Hindi News Article Link in Homepage */
	@FindBy(xpath = "//span[contains(@class,'pb')]/ancestor::div[contains(@class,'bigstory')]/a//img")
	private List<WebElement> topHindiNewsImgLnk;

	/* List of Related News Links in PriorityPanel in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newstrendvideo')]/ul[contains(@class,'global-storylist')]/li/div[contains(@id,'right')]")
	private List<WebElement> relatedNewsLnk;

	/* List of Active Articles After Navigating to Related News Division */
	@FindBy(xpath = "//div[contains(@class,'newstrendvideo')]//div[contains(@class,'active')]//a")
	private List<WebElement> activeRelatedNewsLnk;

	/*List of Bollywood Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'globalhd')]//a[@href='/news/entertainment/']//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a")
	private List<WebElement> bollywoodArticleLnk;

	/*List of Bollywood Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'globalhd')]//a[@href='/news/entertainment/']//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a//img")
	private List<WebElement> bollywoodImgLnk;

	/*Bollywood Section Read More News Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'globalhd')]//a[@href='/news/entertainment/']//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[@href='/news/entertainment/']")
	private WebElement bollywoodReadMoreNewsLnk;

	/* Bollywood Title Link in Homepag*/
	@FindBy(xpath = "//div[contains(@class,'globalhd')]//a[@href='/news/entertainment/']")
	private WebElement bollywoodTitleLnk;

	/*News18 Minis Section A world of news at your finger tips Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_nw18_minis')]/div[contains(@class,'head')]/a")
	private WebElement worldOfNewsLnk;

	/*List of News18 Minis Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_nw18_minis')]/div[contains(@class,'Minis_slider')]/div[contains(@class,'slick-list')]//div[contains(@class,'imgBox')]//img")
	private List<WebElement> news18MinisImgLnk;

	/* List of News18 Minis Article Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_nw18_minis')]/div[contains(@class,'Minis_slider')]/div[contains(@class,'slick-list')]//div[contains(@class,'content')]//h2/a[not (@target)]")
	private List<WebElement> news18MinisArticleLnk;

	/*List of News18 Minis Read More link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'home_nw18_minis')]/div[contains(@class,'Minis_slider')]/div[contains(@class,'slick-list')]//div[contains(@class,'read')]/a[contains(@href,'http')]")
	private List<WebElement> news18MinisReadMoreLnk;

	/*list Of elements present under News 18 Plus Section Dropdown*/
	@FindBy(xpath="(//ul[contains(@class,'ayodhyaspecial')])[1]//a")
	private List<WebElement> news18PlusArtList;

	/*list Of elements present under News 18 Plus Section Dropdown*/
	@FindBy(xpath="(//ul[contains(@class,'ayodhyaspecial')])[2]//a")
	private List<WebElement> news18PlusCricketArtList;

	/*News18 Plus Header*/
	@FindBy(xpath="(//div[contains(@class,'globalhd large')])[1]")
	private WebElement news18PlusHeader;

	/*News18 Plus Header*/
	@FindBy(xpath="(//a[contains(@href,'/news/sports/cricket/')])[1]")
	private WebElement news18PlusCricketHeader;

	/*News18 Plus Banner Link*/
	@FindBy(xpath="(//div[contains(@class,'ayodhyabanner')]//a)[1]")
	private WebElement news18PlusBanner;

	/*News18 Plus Read more  Link*/
	@FindBy(xpath="(//a[contains(@href,'news18-hindi-originals')])[2]")
	private WebElement news18PlusReadMore;

	/*News18 Plus Read more  Link*/
	@FindBy(xpath="(//a[contains(@href,'/news/sports/cricket/')])[2]")
	private WebElement news18PlusCricketReadMore;

	/*moneyHeadline present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//h2//a[contains(@href,'business')]")
	private WebElement moneyHeadline;

	/*moneyReadmore present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@id,'clkbuttonpradesh')]//following-sibling::a[contains(@class,'aur')and contains(@href,'business')]")
	private WebElement moneyReadmore;

	/*moneyArticleLnk present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//a[contains(@href,'business')]//parent::h3//parent::div//following-sibling::ul//li//a")
	private List<WebElement> moneyArticleLnk;

	/*KhelHeadline present at the AMP Hindi Home Page*/
	@FindBy(xpath ="(//div[contains(@class,'globalhd')]//h2//a[contains(@href,'sports')])[2]")
	private WebElement khelHeadline;

	/*khelReadmore present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@id,'clkbuttonpradesh')]//following-sibling::a[contains(@class,'aur')and contains(@href,'sports')]")
	private WebElement khelReadmore;

	/*khelArticleLnk present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//a[contains(@href,'sports')]//parent::h3//parent::div//following-sibling::ul//li//a")
	private List<WebElement> khelArticleLnk;

	/*literatureHeadline present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//h2//a[contains(@href,'literature')]")
	private WebElement literatureHeadline;

	/*literatureReadmore present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@id,'clkbuttonpradesh')]//following-sibling::a[contains(@class,'aur')and contains(@href,'literature')]")
	private WebElement literatureReadmore;

	/*khelArticleLnk present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//a[contains(@href,'literature')]//parent::h3//parent::div//following-sibling::ul//li//a")
	private List<WebElement> literatureArticleLnk;

	/*ajabgajabHeadline present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//a[contains(@href,'ajab-gajab')]//parent::h3//parent::div//following-sibling::ul//li//a")
	private WebElement ajabgajabHeadline;

	/*literatureReadmore present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@id,'clkbuttonpradesh')]//following-sibling::a[contains(@class,'aur')and contains(@href,'ajab')]")
	private WebElement ajabgajabReadmore;

	/*khelArticleLnk present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//a[contains(@href,'ajab')]//parent::h3//parent::div//following-sibling::ul//li//a")
	private List<WebElement> ajabgajabArticleLnk;

	/*superHitGalleryHeadline present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'superhitgallerywrap')]//h2//a")
	private WebElement superHitGalleryHeadline;

	/*superHitGalleryBreadcrum present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'brade_crum')] | //div[contains(@class,'br')]| //ul[contains(@class, 'bread')]")
	private WebElement superHitGalleryBreadcrum;

	/*superHitGalleryReadmore present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@id,'clkbuttonpradesh')]//following-sibling::a[contains(@class,'aur')and contains(@href,'photo')]")
	private WebElement superHitGalleryReadmore;

	/*superHitGalleryArticleLink present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@id,'clkbuttonpradesh')]//ul[contains(@class,'photo')]//li//a")
	private List<WebElement> superHitGalleryArticleLink;

	/*artcileBreadcrum present at the AMP Hindi consumption Page*/
	@FindBy(xpath ="(//div[contains(@class,'brade_crum')] | //div[contains(@class,'br')]| //ul[contains(@class, 'bread')])[1]")
	private WebElement articleBreadcrum;

	/*mobileTecharticleLnk present at the AMP Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'bigstory')]//following-sibling::ul//li//a[contains(@href,'tech')]")
	private List<WebElement> mobileTecharticleLnk;

	//---------career
	/* Career section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/career/')]")
	private WebElement careerSectionLnk;

	/* Career section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/career/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li//a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/news/career/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a")
	private List<WebElement> careerSectionArticleLnk;

	/* Career section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/career/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> careerSectionImgLnk;

	/* Career section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/career/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[contains(@href,'/news/career/')]")
	private WebElement readMoreCareerSectionLnk;

	/*Breadcrumb present in Career article page*/
	@FindBy(xpath ="//div[contains(@class,'brdcrm')] | //div[contains(@class,'breadcum')]")
	private WebElement careerBreadcrumb;

	//---------crime
	/* Crime section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/news/crime/')]")
	private WebElement crimeSectionLnk;

	/* Crime section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/news/crime/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div/div/a  |  //div[contains(@class,'globalhd')]//a[(@href='/news/crime/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div//li/a")
	private List<WebElement> crimeSectionArticleLnk;

	/* Crime section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/news/crime/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div//img")
	private List<WebElement> crimeSectionImgLnk;

	/* Crime section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/news/crime/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a")
	private WebElement readMoreCrimeSectionLnk;

	/*Breadcrumb present in Crime article page*/
	@FindBy(xpath ="//div[contains(@class,'brdcrm')] | //div[contains(@class,'breadcum')]")
	private WebElement crimeBreadcrumb;


	/**
	 * @author DanishR
	 * This method is used to click and naviagte to pradesh news and Rajya Lists
	 */
	public void verifyPradeshNewsRajyaList(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillElement(pradeshNews,GlobalVariables.sec60);
		webDriverActions.softClickJS(pradeshNews);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());
		webDriverActions.navigateBack();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softClickJS(rajyaChuneLnk);
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(rajyaChuneStateList.size()>0, "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());
		for (int i = 0; i < rajyaChuneStateList.size(); i++) {
			webDriverActions.softHighlightElement(rajyaChuneStateList.get(i));
			webDriverActions.mouseHoverAndClick(rajyaChuneStateList.get(i));
			webDriverActions.waitForPageToLoad();
			String expectedPageUrl = webDriverActions.getCurrentPageUrl();
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.contains("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl=betaUrl;
			}
			webDriverActions.softWaitForElementVisibility(articleBreadcrumb, 3);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Possibly Element is Not Visible "+currentPageUrl);
			if (expectedPageUrl.equalsIgnoreCase(currentPageUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			webDriverActions.waitForSecond(3000);
			webDriverActions.softClickJS(rajyaChuneLnk);
			webDriverActions.waitForSecond(3000);
			softAssert.assertAll("Issues found in Pradesh News Rajya List on Home Page ");
		}
	}

	/**
	 * @author DanishR
	 * This method is used to click and navigate to pradesh news states and its articles
	 */
	public void pradeshNewsStatesWiseArticles(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softScrollToElement(pradeshNews);
		softAssert.assertTrue(pradeshNewsArticleLinks.size()>0, "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());
		webDriverActions.waitForElement(1000);
		for (int i = 0; i < pradeshNewsArticleLinks.size();i++) {
			webDriverActions.waitForSecond(3000);
			webDriverActions.softMouseHover(pradeshNewsArticleLinks.get(i));
			webDriverActions.softClickJS(pradeshNewsArticleLinks.get(i));
			webDriverActions.waitForPageToLoad();
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.contains("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl=betaUrl;
			}
			webDriverActions.softWaitForElementVisibility(articleBreadcrumb, 3);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Possibly Element is Not Visible "+currentPageUrl);
			webDriverActions.navigateBack();
			webDriverActions.softScrollToElement(pradeshNews);
		}
		softAssert.assertAll("Issues found in Pradesh News Articles on Home Page ");
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
		webDriverActions.softMouseHover(aurbhiDekhu);
		webDriverActions.softHighlightElement(aurbhiDekhu);
		webDriverActions.softClickJS(aurbhiDekhu);
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


	/**
	 * @author DanishR
	 * This Method is use to verify Web-Stories Section in AMP Home Page Body
	 */
	public void verifyWebStoriesTitle(String serverType)
	{
		verifyTitleNavigation(serverType, webStoriesSection, articleBreadCrumbDiv);
	}


	/**
	 * @author DanishR
	 * This Method is use to verify Web-Stories Section in AMP Home Page Body
	 */
	public void verifyWebStoriesSectionArticles(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String title = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillAllElement(webstoriesArticleLnk, 30);
		if(webstoriesArticleLnk.size()>0)
		{
			for(int i=0; i<webstoriesArticleLnk.size() ;i++)
			{
				webDriverActions.softMouseHover(activeWebstoriesArticleLnk);
				webDriverActions.softMouseHover(webstoriesArticleLnk.get(i));
				webDriverActions.mouseHoverAndClick(webstoriesArticleLnk.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(activeWebstoriesArticleLnk);
					webDriverActions.softMouseHover(webstoriesArticleLnk.get(i));
					webDriverActions.softMouseHover(webstoriesArticleLnk.get(i));
					webDriverActions.mouseHoverAndClick(webstoriesArticleLnk.get(i));
				}
				webDriverActions.switchToNewWindow();
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
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(nextWebStoryBtn) , "Unable to Display Element in"+currentPage);;
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

	/**
	 * @author DanishR
	 * This Method is use to verify Hamburger Menu Language Section By clicking on Hamburger Icon it.
	 */
	public void verifyHamburgerLanguageSection(String server)
	{

		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String currentPageUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.softClickJS(hamburgerMenuLnk);
		webDriverActions.waitForSecond(3000);
		webDriverActions.softClickJS(hamburgerLangSection);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softClickJS(hamburgerLangSection);
		}
		//Validating the Line one section Except Search Button
		for (int i = 0; i < hamburgerLangLnks.size(); i++)
		{
			webDriverActions.softClickJS(hamburgerLangLnks.get(i));
			webDriverActions.waitForPageToLoad();
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateToUrl(currentPageUrl);
				webDriverActions.waitForSecond(5000);
				webDriverActions.softClickJS(hamburgerMenuLnk);
				webDriverActions.softClickJS(hamburgerLangSection);
			}
			String pageURL = webDriverActions.getCurrentPageUrl();
			webDriverActions.waitForElementVisibility(headerSection, 3);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerSection), "possibly Header Section Of Language Section Is not Displayed"+pageURL);
			webDriverActions.navigateBack();
			webDriverActions.waitForPageToLoad();
			webDriverActions.softClickJS(hamburgerMenuLnk);
		}
		softAssert.assertAll("Issues Found In Validating Hamburger Language Section");
	}

	/**
	 * @author DanishR
	 * This Method is use to verify Hamburger Menu
	 */
	public void HamburgerMenuAllSectionsNavigation(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String parent = webDriverActions.getCurrentPageUrl();
		webDriverActions.softClickJS(hamburgerMenuLnk);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateToUrl(parent);
			webDriverActions.waitForSecond(5000);
			webDriverActions.softClickJS(hamburgerMenuLnk);
		}
		for (int i = 0; i < hamburgerHomeSectionLnks.size();i++)
		{
			webDriverActions.waitForSecond(2000);
			webDriverActions.softClickJS(hamburgerHomeSectionLnks.get(i));
			webDriverActions.waitForPageToLoad();
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.waitForSecond(2000);
				webDriverActions.softClickJS(hamburgerHomeSectionLnks.get(i));
				webDriverActions.waitForPageToLoad();
			}
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			String text = "https://hindi.news18.com/amp/";
			String text1 = "https://hindi.news18.com/";
			String text2 = "https://hindi.news18.com/amp/#/";
			if(serverType.contains("preProd"))
			{
				String betatext = "https://betaeng:v%T5ctTr%7BV~h%3CgQ8@betahindi.news18.com/amp";
				String betatext1 = "https://betaeng:v%T5ctTr%7BV~h%3CgQ8@betahindi.news18.com/";
				String betatext2 = "https://betaeng:v%T5ctTr%7BV~h%3CgQ8@betahindi.news18.com/amp/#";
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl=betaUrl;
				if (! (currentPageUrl.equalsIgnoreCase(betatext) || currentPageUrl.equalsIgnoreCase(betatext2) || currentPageUrl.equalsIgnoreCase(betatext1))) {
					webDriverActions.softWaitForElementVisibility(articleBreadcrumb, 3);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb)," Possibly element not visible " +currentPageUrl);
				}
			}
			else {
				if (!(currentPageUrl.equals(text) || currentPageUrl.equalsIgnoreCase(text2) || currentPageUrl.equalsIgnoreCase(text1))) {
					webDriverActions.softWaitForElementVisibility(articleBreadcrumb, 3);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb)," Possibly element not visible " +currentPageUrl);
				}
			}
			webDriverActions.navigateToUrl(parent);
			webDriverActions.softClickJS(hamburgerMenuLnk);
		}
		softAssert.assertAll("Issues Found In Validating Hamburger Menu All Section");
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on the bollywoodTitle section Headline present at the AMP Hindi home page
	 */
	public void verifyBollywoodTitle(String serverType) {
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(bollywoodHeadline);
		//		webDriverActions.continuousScrollTillElement(bollywoodHeadline, 10);
		webDriverActions.softClickJS(bollywoodHeadline);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(bollywoodHeadline);
			webDriverActions.softScrollToElement(bollywoodHeadline);
			webDriverActions.waitForSecond(2000);
			webDriverActions.softClickJS(bollywoodHeadline);
		}
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on the bollywoodArticle section Headline present at the AMP Hindi home page
	 */
	public void verifyBollywoodArticle(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);

		if(bollywoodarticleLnk.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<bollywoodarticleLnk.size();i++)
			{  
				webDriverActions.softMouseHover(bollywoodarticleLnk.get(i));
				webDriverActions.clickJS(bollywoodarticleLnk.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(bollywoodarticleLnk.get(i));
					webDriverActions.softScrollToElement(bollywoodarticleLnk.get(i));
					webDriverActions.waitForSecond(2000);
					webDriverActions.softClickJS(bollywoodarticleLnk.get(i));
				}
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage = betaUrl;
				}
				else {
					Logs.info(getClass(), "Navigated to "+currentPage);
				}
				webDriverActions.waitForSecond(2000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element "+currentPage);
				Logs.info(getClass(),"Clicked Latest News articles link");
				webDriverActions.waitForPageToLoad();
				webDriverActions.navigateBack();	
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+bollywoodarticleLnk.size());
		}
		softAssert.assertAll("Issues found in this url "); 
	}

	//	***********************************Rahul***Business**Logic******************************************

	/**
	 * @author Rahul
	 * This method is used to click on Air Quality Index widgets present at the
	 * body of the home page and navigate their pages
	 */
	public void verifyAirQualityIndex() {
		SoftAssert softAssert = new SoftAssert();
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.waitForPageToLoad();
		if(airQualityWidgetLnkLst.size()>0) {
			/* Below loop will fetch list of articles and navigate to each one by one*/ 
			for(int i=0;i<airQualityWidgetLnkLst.size();i++)
			{
				webDriverActions.softMouseHover(airQualityWidgetLnkLst.get(i));
				webDriverActions.softClickJS(airQualityWidgetLnkLst.get(i));
				Logs.info(getClass(),"Clicked on Air Quality Index Widget");
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(airQualityBreadcrum),"Unable to display Element "+webDriverActions.getCurrentPageUrl());
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+airQualityWidgetLnkLst.size());
		}
		softAssert.assertAll("Issues found in this url "); 
	}
	/**
	 * @author Rahul
	 * This method is used to click on the title of food Section present at the body of the
	 * home page
	 */
	public void verifyJobsTitle(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(jobHeadline);
		webDriverActions.continuousScrollTillElement(jobHeadline, 10);
		webDriverActions.softClickJS(jobHeadline);
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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}
	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the Food Headline present at the Amp Hindi Home Page
	 */
	public void verifyFoodSectionHeadline(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(foodTitle, 10);
		webDriverActions.softScrollToElement(foodTitle);
		webDriverActions.softHighlightElement(foodTitle);
		webDriverActions.softClickJS(foodTitle);
		//		webDriverActions.mouseHoverAndClick(foodTitle);
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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element"+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the Food Image section present at the AMP Hindi home page
	 */
	public void verifyFoodImgNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(foodTitle);
		webDriverActions.clickJS(foodSectionImg);
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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(foodSectionBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the Food article present at the AMP Hindi home page
	 */
	public void verifyFoodArticleNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(foodTitle);
		if(foodSectionArticleLst.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<foodSectionArticleLst.size();i++)
			{  
				webDriverActions.softMouseHover(foodSectionArticleLst.get(i));
				webDriverActions.clickJS(foodSectionArticleLst.get(i));
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage = betaUrl;
				}
				webDriverActions.waitForSecond(1000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(foodSectionBreadcrum),"Unable to display Element "+currentPage);
				Logs.info(getClass(),"Clicked Latest News articles link");
				webDriverActions.navigateBack();	
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+foodSectionArticleLst.size());
		}
		softAssert.assertAll("Issues found in this url "); 
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the Food read more section present at the AMP Hindi home page
	 */
	public void verifyFoodReadMore(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(foodTitle);
		webDriverActions.clickJS(foodSectionReadmore);
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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(foodSectionBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the Health section Headline present at the AMP Hindi home page
	 */
	public void verifyHealthSectionHeadline(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(foodTitle);
		webDriverActions.continuousScrollTillElement(healthFitnessTitle,10);
		webDriverActions.clickJS(healthFitnessTitle);
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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(healthSectionBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the HealthImg section Headline present at the AMP Hindi home page
	 */
	public void verifyHealthImgNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(foodTitle);
		webDriverActions.continuousScrollTillElement(healthFitnessTitle,10);
		webDriverActions.continuousScrollTillElement(healthFitnessTitle,10);
		webDriverActions.mouseHoverAndClick(healthFitnessImage);
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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(healthSectionBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the healthArticle section Headline present at the AMP Hindi home page
	 */
	public void verifyhealthArticleNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);
		webDriverActions.continuousScrollTillElement(healthFitnessTitle,13);
		if(healthArticleLst.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<healthArticleLst.size();i++)
			{  
				webDriverActions.mouseHover(healthArticleLst.get(i));
				webDriverActions.softClickJS(healthArticleLst.get(i));
				webDriverActions.waitForPageToLoad();
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage = betaUrl;
				}
				webDriverActions.waitForSecond(2000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element"+currentPage);
				webDriverActions.navigateBack();	
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+healthArticleLst.size());
		}
		softAssert.assertAll("Issues found in this url "); 
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the HealthReadMore section Headline present at the AMP Hindi home page
	 */
	public void verifyHealthReadMore(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(foodTitle);
		webDriverActions.continuousScrollTillElement(healthFitnessTitle,10);
		webDriverActions.clickJS(healthReadmore);
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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(healthSectionBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the TodaysPanchang section Headline present at the AMP Hindi home page
	 */
	public void verifyTodaysPanchang(String serverType) { 
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(todaysPanchangHeadline);
		webDriverActions.softScrollToElement(todaysPanchangHeadline);
		webDriverActions.softMouseHover(todaysPanchangHeadline);
		webDriverActions.waitForSecond(2000);
		webDriverActions.softClickJS(readMorePanchang);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		Logs.info(getClass(),"Clicked on ReadMore Panchang Button");
		webDriverActions.waitForPageToLoad();
		webDriverActions.softWaitForElementVisibility(panchangBreadcrum, 30);
		webDriverActions.waitForSecond(1000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(panchangBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url "); 
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the AutoSectionHeadline section Headline present at the AMP Hindi home page
	 */
	public void verifyautoSectionHeadline(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(cartoonTitle);
		webDriverActions.mouseHoverAndClick(autoSectionHeadline);
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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the AutoArticle section Headline present at the AMP Hindi home page
	 */
	public void verifyAutoArticleNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(autoSectionHeadline);
		if(autoArticleLst.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<autoArticleLst.size();i++)
			{  
				webDriverActions.softMouseHover(autoArticleLst.get(i));
				webDriverActions.mouseHoverAndClick(autoArticleLst.get(i));
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage = betaUrl;
				}
				webDriverActions.waitForSecond(2000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element "+currentPage);
				Logs.info(getClass(),"Clicked Latest News articles link");
				webDriverActions.navigateBack();	
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+autoArticleLst.size());
		}
		softAssert.assertAll("Issues found in this url "); 
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the AutoReadMore section Headline present at the AMP Hindi home page
	 */
	public void verifyAutoReadMore(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softScrollToElement(autoSectionHeadline);
		webDriverActions.softHighlightElement(autoSectionHeadline);
		webDriverActions.mouseHoverAndClick(autoReadmore);
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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the CartoonCornerTitle section Headline present at the AMP Hindi home page
	 */
	public void verifyCartoonCornerTitle(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(cartoonTitle);
		webDriverActions.continuousScrollTillElement(cartoonTitle, 10);
		webDriverActions.waitForSecond(2000);
		webDriverActions.softClickJS(cartoonTitle);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the CartoonCornerArticle section Headline present at the AMP Hindi home page
	 */
	public void verifyCartoonCornerArticle(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(cartoonTitle);
		webDriverActions.continuousScrollTillElement(cartoonTitle, 10);
		/* Below loop will fetch list of articles and navigate to each one by one */ 
		for (int i = 0; i < cartoonStory.size(); i++) {
			webDriverActions.softScrollToElement(cartoonStory.get(i));
			webDriverActions.softClickJS(cartoonStory.get(i));
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
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element "+currentPage);
			webDriverActions.navigateBack();
		}
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 *  This method is used to click on the JobArticleList section Headline present at the AMP Hindi home page
	 */
	public void verifyJobArticleList(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToElement(mobileTech);
		webDriverActions.continuousScrollTillElement(jobHeadline,GlobalVariables.sec60);
		webDriverActions.softMouseHover(jobHeadline);
		for (int i = 0; i < jobArticleLst.size();i++) {
			webDriverActions.softMouseHover(jobArticleLst.get(i));
			webDriverActions.softClickJS(jobArticleLst.get(i));
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
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element "+currentPage);
			webDriverActions.navigateBack();
		}
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 *  This method is used to click on the verifyCricketKaTest section Headline present at the AMP Hindi home page
	 */
	public void verifyCricketKaTest() { 
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softScrollToElement(mobileTech);
		webDriverActions.softHighlightElement(mobileTech);
		webDriverActions.softScrollToElement(cricketHeadline);
//		webDriverActions.softHighlightElement(cricketHeadline);
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


	//---------------------------------------Sanjeeb Business Logic-----------------------------//

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Line One section elements By clicking on it.
	 */
	public void verfyLineOneSection(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		//it takes the social share Url from property File
		ArrayList<String> list=new ArrayList<String>();
		list.add(fileUtility.readDataFromPropertyFile("netrasuraksha"));
		list.add(fileUtility.readDataFromPropertyFile("crypto"));
		list.add(fileUtility.readDataFromPropertyFile("electral"));
		list.add(fileUtility.readDataFromPropertyFile("nerolac"));

		//it add the element of social share icons.
		ArrayList<WebElement> listEle=new ArrayList<WebElement>();
		listEle.add(netraSurkshaTxtLnk);
		listEle.add(kryptoTxtLnk);
		listEle.add(electralHydrationText);
		listEle.add(nerolacHeaderTxtLnk);
		
		webDriverActions.waitForElement(1000);
		softAssert.assertTrue((lineOneSectionELementLnk.size()>0), "Possibly Element Is Not Visible For This URL "+ webDriverActions.getCurrentPageUrl());		
		for (int i = 1; i < lineOneSectionELementLnk.size(); i++)
		{
			webDriverActions.softWaitForElementVisibility(lineOneSectionELementLnk.get(i), 3);
			webDriverActions.softMouseHover(lineOneSectionELementLnk.get(i));
			webDriverActions.softHighlightElement(lineOneSectionELementLnk.get(i));
			String actual = webDriverActions.getAttribute("href", lineOneSectionELementLnk.get(i));
			Logs.info(getClass(), actual);
			webDriverActions.softClickJS(lineOneSectionELementLnk.get(i));
			String currentPageUrl=webDriverActions.getCurrentPageUrl();
			if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softWaitForElementVisibility(lineOneSectionELementLnk.get(i), 3);
				webDriverActions.softMouseHover(lineOneSectionELementLnk.get(i));
				webDriverActions.softHighlightElement(lineOneSectionELementLnk.get(i));
				webDriverActions.softClickJS(lineOneSectionELementLnk.get(i));
			}
			String expected = webDriverActions.getCurrentPageUrl();
			String currentPage = webDriverActions.getCurrentPageUrl();
			if( actual.contains("netra") || actual.contains("crypto") || actual.contains("electral")|| actual.contains("nerolac"))
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
					if(serverType.contains("preProd") && !expected.contains("//beta"))
					{
						String betaUrl = genericUtility.replaceInUrl(actual);
						expected=betaUrl;
						webDriverActions.navigateToUrl(expected);
					}
					webDriverActions.softWaitForElementVisibility(headerBreadcrumbLnk, 3);
					webDriverActions.stopPageLoading();
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Possibly Element Is Not Visible For This URL "+expected);		
				}
			if(expected.equals(currentPage))
			{
				webDriverActions.navigateBack();	
			}
			else
			{
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			webDriverActions.waitForSecond(1000);
		}
		softAssert.assertAll("Issues Found In Validating Line One Section");	
	}



	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Line One Section Rajya Seher Chune Present in Hindi Desktop Landing Page.
	 */
	public void verifyLineOneSectionRajyaSeherChune(String server)
	{

		//This line of Script to verify RajyaSeher Chune Icon Present in the Linone Section of Hindi News 18 Home Page.
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(2000);
		webDriverActions.softHighlightElement(rajyaSeherChuneLnk);
		webDriverActions.softClickJS(rajyaSeherChuneLnk);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(cancelBtn), "possibly Icon Is Not Displayed");
		for(int i=0;i<apnaSeherChuneEleList.size();i++)
		{
			String expected = webDriverActions.getAttribute("href", apnaSeherChuneEleList.get(i));
			Logs.info(getClass(), expected);
			webDriverActions.softClickJS(apnaSeherChuneEleList.get(i));
			String currentPageUrl=webDriverActions.getCurrentPageUrl();
			if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(apnaSeherChuneEleList.get(i));
			}
			String actual = webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd"))
			{
				String betaUrl = genericUtility.replaceInUrl(actual);
				expected=betaUrl;
				webDriverActions.navigateToUrl(expected);
			}
			softAssert.assertTrue(actual.contains(expected), "Possibly Not Navigated To This URL "+actual );
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Possibly Element Is Not Visible For This URL "+actual);
			Logs.info(getClass(), actual);
			webDriverActions.navigateBack();
			webDriverActions.softClickJS(rajyaSeherChuneLnk);
		}

		//These Lines of Scripts use to Verify the links present under Rajya Section Of Rajya Seher Chune Popup Of Hindi Home Page.
		for(int i=0;i<rajyaSectionEleList.size();i++)
		{
			String title=webDriverActions.getAttribute("class", rajyaSectionEleDropDwn.get(i));
			if (title.contains("noarrow"))
			{
				String expected = webDriverActions.getAttribute("href", rajyaSectionEleList.get(i));
				Logs.info(getClass(), expected);
				webDriverActions.softClickJS(rajyaSectionEleList.get(i));
				String currentPageUrl=webDriverActions.getCurrentPageUrl();
				if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softClickJS(rajyaSectionEleList.get(i));
				}
				String actual = webDriverActions.getCurrentPageUrl();
				if(server.contains("preProd"))
				{
					String betaUrl = genericUtility.replaceInUrl(actual);
					actual=betaUrl;
					webDriverActions.navigateToUrl(actual);
				}
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Possibly Element Is Not Visible For This URL "+actual);
				Logs.info(getClass(), actual);
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(rajyaSeherChuneLnk);
			}
			else
			{
				webDriverActions.softClickJS(rajyaSectionEleList.get(i));
				for(int j=0;j<rajyaSectionDropdwnEleList.size();j++)
				{
					String expected = webDriverActions.getAttribute("href", rajyaSectionDropdwnEleList.get(j));
					Logs.info(getClass(), expected);
					webDriverActions.softClickJS(rajyaSectionDropdwnEleList.get(j));
					String currentPageUrl=webDriverActions.getCurrentPageUrl();
					if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
					{
						webDriverActions.navigateBack();
						webDriverActions.softClickJS(rajyaSectionDropdwnEleList.get(i));
					}
					String actual = webDriverActions.getCurrentPageUrl();
					if(server.contains("preProd"))
					{
						String betaUrl = genericUtility.replaceInUrl(actual);
						actual=betaUrl;
						webDriverActions.navigateToUrl(actual);
					}
					softAssert.assertEquals(actual,expected, "Possibly Not Navigated To This URL "+actual );
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Possibly Element Is Not Visible For This URL "+actual);
					Logs.info(getClass(), actual);
					webDriverActions.navigateBack();
					webDriverActions.softClickJS(rajyaSeherChuneLnk);
					webDriverActions.softClickJS(rajyaSectionEleList.get(i));
				}
			}	
		}
		softAssert.assertAll("Rajya Seher Chune Verification Failed");
	}

	//======================================Anupam's Business Logic===========================

	/**
	 * @author AnupamGupta
	 * This method is used to validate horoscope description for each sign in horoscope section
	 */
	public void verifyHoroscopeDescription(String serverType) {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.scrollToPoint(0, 0);
		webDriverActions.continuousScrollTillElement(horoscopeSectionLnk, 10);		
		webDriverActions.softMouseHover(horoscopeSectionLnk);
		webDriverActions.softScrollToElement(horoscopeSectionLnk);
		webDriverActions.softHighlightElement(horoscopeSectionLnk);
		softAssert.assertTrue(horoscopeSigns.size()>0, " Possibly Element is Not Visible "+ horoscopeSigns );
		for(int i=0; i<horoscopeSigns.size() ;i++)
		{
			webDriverActions.waitForSecond(2000);
			String horoscopeText = webDriverActions.getAttribute("id",horoscopeSignsTxt.get(i));
			Logs.info(getClass(), horoscopeText);
			webDriverActions.softMouseHover(horoscopeSigns.get(i));
			webDriverActions.waitForElement(1000);
			webDriverActions.mouseHoverAndClick(horoscopeSigns.get(i));

			webDriverActions.waitForSecond(1000);
			String currentPage = webDriverActions.getCurrentPageUrl();
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), currentPage);

			if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			}

			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(1000);
			webDriverActions.scrollToPoint(0, 80);
			webDriverActions.softWaitForElementVisibility(horoscopeInfo, 3);
			webDriverActions.softHighlightElement(horoscopeInfo);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(horoscopeInfo) , "Unable to Display description after clicking on "+horoscopeText);
//			if(webDriverActions.softIsElementDisplayed(horoscopeInfo)) {
//				Logs.info(getClass(), "horoscope description  : "+webDriverActions.getTextFromElement(horoscopeInfo));
//			}
			webDriverActions.waitForSecond(1000);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
		}
		softAssert.assertAll("Issues found in horoscope section home page ");
	}



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
		webDriverActions.waitForSecond(1000);
		webDriverActions.scrollToPoint(0, 0);
		webDriverActions.continuousScrollTillElement(section, 20);
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
			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element "+element +" in "+currentPage);
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
	public void verifyImgNavigation(String serverType,WebElement section ,List<WebElement> artList ,WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(1000);
		webDriverActions.scrollToPoint(0, 0);
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
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}	
		}
		softAssert.assertAll("Issue Found in HomePage Body Image Navigation");
	}


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
		webDriverActions.waitForSecond(1000);
		webDriverActions.scrollToPoint(0, 0);
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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+ " in "+currentPage);
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
		webDriverActions.waitForSecond(1000);
		webDriverActions.scrollToPoint(0, 0);
		webDriverActions.continuousScrollTillElement(section, 20);	
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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+" in "+currentPage);
		softAssert.assertAll("Issue Found in HomePage Body Section Link");
	}




	//------Lifestyle
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


	//----Dharm
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget
	 */
	public void verifyDharmWidget(String serverType) {
		verifySectionLnks(serverType,dharmSectionLnk, dharmBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget Article
	 */
	public void verifyDharmWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,dharmSectionLnk,dharmSectionArticleLnk, dharmBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget Image
	 */
	public void verifyDharmWidgetImg(String serverType) {
		verifyImgNavigation(serverType,dharmSectionLnk,dharmSectionImgLnk, dharmBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Lifestyle News
	 */
	public void verifyMoreDharmLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreDharmSectionLnk, dharmBreadcrumb);
	}


	//----Nation
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


	//----World
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
	 * This method is used to validate navigation of Nation Widget Image
	 */
	public void verifyWorldWidgetImg(String serverType) {
		verifyImgNavigation(serverType,worldSectionLnk,worldSectionImgLnk, worldBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Nation News
	 */
	public void verifyMoreWorldLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreWorldSectionLnk, worldBreadcrumb);
	}


	//------video
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
	 * This method is used to validate navigation of More Video News
	 */
	public void verifyMoreVideoLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreVideoSectionLnk, videoBreadcrumb);
	}


	//----Knowledge
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


	// ----------------------------------------- Vipin Business Logic ----------------------------------//

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
				if(expectedUrl.equalsIgnoreCase(homeUrl)) {
					softAssert.fail("Unable to Navigate in "+actual);
				}
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


	public void verifyArticleBannerNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, articleBannerLnk, articleHeaderTxt);
	}

	public void verifyTaazaSamacharArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, tazaSamacharArticleLnk, articleHeaderTxt);
	}

	public void verifyTaazaSamacharImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, tazaSamacharImgLnk, articleHeaderTxt);
	}

	public void verifyTopHindiNewsArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, topHindiNewsArticleLnk, articleHeaderTxt);
	}

	public void verifyTopHindiNewsImageNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, topHindiNewsImgLnk, articleHeaderTxt);
	}

	public void verifyRelatedNewsArticleNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
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
				webDriverActions.softMouseHover(relatedNewsLnk.get(i));
				webDriverActions.softClickJS(relatedNewsLnk.get(i));
				webDriverActions.waitForSecond(5000);
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyBollywoodArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, bollywoodArticleLnk, articleHeaderTxt);
	}

	public void verifyBollywoodImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, bollywoodImgLnk, articleHeaderTxt);
	}

	public void verifyMoreBollywoodNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, bollywoodReadMoreNewsLnk, articleBreadCrumbDiv);
	}

	public void verifyBollywoodTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, bollywoodTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyNews18MinisWorldOfNewsNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(worldOfNewsLnk, 20);
		webDriverActions.softClickJS(worldOfNewsLnk);
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
		webDriverActions.softHighlightElement(articleBreadCrumbDiv);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element in "+currentPage);
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyNews18MinisImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, news18MinisImgLnk, articleBreadCrumbDiv);
	}

	public void verifyNews18MinisArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, news18MinisArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyNews18MinisReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(news18MinisReadMoreLnk, 20);
		for(int i=0 ; i<news18MinisReadMoreLnk.size() ; i++)
		{
			webDriverActions.continuousScrollTillAllElement(news18MinisReadMoreLnk, 20);
			webDriverActions.softMouseHover(news18MinisReadMoreLnk.get(i));
			webDriverActions.softClickJS(news18MinisReadMoreLnk.get(i));
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
			webDriverActions.softHighlightElement(articleBreadCrumbDiv);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable To Display Element in "+currentPage);
			// webDriverActions.navigateToUrl(homeUrl);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}


	//--------------------------------- Vipin/Sanjeeb -----------------------------------------------//


	public void verifyNews18HindiPlusBannerNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(news18PlusBanner, 10);
		webDriverActions.softClickJS(news18PlusBanner);
		webDriverActions.waitForSecond(2000);
		String currentPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.softHighlightElement(headerBreadcrumbLnk);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Unable To Display Element in "+currentPage);
		softAssert.assertAll("Issue Found in Homepage Body ");	
	}


	public void verifyNews18PlusArticleNavigation(String server)
	{
		verifyArticleNavigation(server, news18PlusArtList, headerBreadcrumbLnk);
	}

	public void verifyNews18PlusReadMoreNavigation(String server)
	{
		verifyMoreNewsNavigation(server, news18PlusReadMore, headerBreadcrumbLnk);
	}

	public void verifyNews18PlusCricketArticleNavigation(String server)
	{
		verifyArticleNavigation(server, news18PlusCricketArtList, headerBreadcrumbLnk);
	}

	public void verifyNews18PlusCricketReadMoreNavigation(String server)
	{
		verifyMoreNewsNavigation(server, news18PlusCricketReadMore, headerBreadcrumbLnk);
	}

	public void verifyNews18PlusTitleNavigation(String server)
	{
		verifyTitleNavigation(server, news18PlusCricketReadMore, headerBreadcrumbLnk);
	}

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to click on the MoneyHeadline section Headline present at the AMP Hindi home page
	 */
	public void verifyMoneyHeadline(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(moneyHeadline);
		webDriverActions.continuousScrollTillElement(moneyHeadline,10);
		webDriverActions.clickJS(moneyHeadline);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrum),"Unable to display Element in "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}


	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to click on the MoneyArticle section Headline present at the AMP Hindi home page
	 */
	public void verifyMoneyArticleNavigation(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(moneyHeadline);
		webDriverActions.continuousScrollTillElement(moneyHeadline,10);
		if(moneyArticleLnk.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<moneyArticleLnk.size();i++)
			{  
				webDriverActions.softMouseHover(moneyArticleLnk.get(i));
				webDriverActions.clickJS(moneyArticleLnk.get(i));
				String currentPage = webDriverActions.getCurrentPageUrl();
				String expectedUrl = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage = betaUrl;
				}
				webDriverActions.waitForSecond(2000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrum),"Unable to display Element "+currentPage);
				webDriverActions.waitForPageToLoad();

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
			softAssert.fail("Possibly Element is Not Visible Or Size is "+moneyArticleLnk.size());
		}
		softAssert.assertAll("Issues found in this url "); 
	}

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to click on the MoneyReadMore section Headline present at the AMP Hindi home page
	 */
	public void verifyMoneyReadMore(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(moneyHeadline);
		webDriverActions.continuousScrollTillElement(moneyHeadline,10);
		webDriverActions.clickJS(moneyReadmore);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to click on the SportsHeadline section Headline present at the AMP Hindi home page
	 */
	public void verifySportsHeadline(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(khelHeadline);
		webDriverActions.continuousScrollTillElement(khelHeadline,10);
		webDriverActions.clickJS(khelHeadline);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}


	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to click on the SportsArticle section Headline present at the AMP Hindi home page
	 */
	public void verifySportsArticleNavigation(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(moneyHeadline);
		webDriverActions.continuousScrollTillElement(moneyHeadline,10);
		if(khelArticleLnk.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<khelArticleLnk.size();i++)
			{  
				webDriverActions.softMouseHover(khelArticleLnk.get(i));
				webDriverActions.clickJS(khelArticleLnk.get(i));
				String currentPage = webDriverActions.getCurrentPageUrl();
				String expectedUrl = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage = betaUrl;
				}
				webDriverActions.waitForSecond(2000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrum),"Unable to display Element "+currentPage);
				webDriverActions.waitForPageToLoad();
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
			softAssert.fail("Possibly Element is Not Visible Or Size is "+khelArticleLnk.size());
		}
		softAssert.assertAll("Issues found in this url "); 
	}

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to click on the SportsReadMore section Headline present at the AMP Hindi home page
	 */
	public void verifySportsReadMore(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(moneyHeadline);
		webDriverActions.continuousScrollTillElement(moneyHeadline,10);
		webDriverActions.clickJS(khelReadmore);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrum),"Unable to display Element in "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to click on the AjabHeadline section Headline present at the AMP Hindi home page
	 */
	public void verifyAjabHeadline(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(ajabgajabHeadline);
		webDriverActions.continuousScrollTillElement(ajabgajabHeadline,10);
		webDriverActions.clickJS(ajabgajabHeadline);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrum),"Unable to display Elementin "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}


	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to click on the ajabNavigation section Headline present at the AMP Hindi home page
	 */
	public void verifyAjabArticleNavigation(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(ajabgajabHeadline);
		webDriverActions.continuousScrollTillElement(ajabgajabHeadline,10);
		if(ajabgajabArticleLnk.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<ajabgajabArticleLnk.size();i++)
			{  
				webDriverActions.softMouseHover(ajabgajabArticleLnk.get(i));
				webDriverActions.clickJS(ajabgajabArticleLnk.get(i));
				String currentPage = webDriverActions.getCurrentPageUrl();
				String expectedUrl = webDriverActions.getCurrentPageUrl();				
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage = betaUrl;
				}
				webDriverActions.waitForSecond(2000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrum),"Unable to display Element in "+currentPage);
				webDriverActions.waitForPageToLoad();
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
			softAssert.fail("Possibly Element is Not Visible Or Size is "+ajabgajabArticleLnk.size());
		}
		softAssert.assertAll("Issues found in this url "); 
	}

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to click on the ajabReadMore section Headline present at the AMP Hindi home page
	 */
	public void verifyAjabReadMore(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(ajabgajabHeadline);
		webDriverActions.continuousScrollTillElement(ajabgajabHeadline,10);
		webDriverActions.clickJS(ajabgajabReadmore);
		String currentPage = webDriverActions.getCurrentPageUrl();
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrum),"Unable to display Element in "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to click on the LiteratureHeadline section Headline present at the AMP Hindi home page
	 */
	public void verifyLiteratureHeadline(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(literatureHeadline);
		webDriverActions.continuousScrollTillElement(literatureHeadline,10);
		webDriverActions.clickJS(literatureHeadline);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}


	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to click on the LiteratureNavigation section Headline present at the AMP Hindi home page
	 */
	public void verifyLiteratureArticleNavigation(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(literatureHeadline);
		webDriverActions.continuousScrollTillElement(literatureHeadline,10);
		if(literatureArticleLnk.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<literatureArticleLnk.size();i++)
			{  
				webDriverActions.softMouseHover(literatureArticleLnk.get(i));
				webDriverActions.clickJS(literatureArticleLnk.get(i));
				String currentPage = webDriverActions.getCurrentPageUrl();
				String expectedUrl = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage = betaUrl;
				}
				webDriverActions.waitForSecond(2000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrum),"Unable to display Element "+currentPage);
				webDriverActions.waitForPageToLoad();
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
			softAssert.fail("Possibly Element is Not Visible Or Size is "+literatureArticleLnk.size());
		}
		softAssert.assertAll("Issues found in this url "); 
	}

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to click on the LiteratureReadMore section Headline present at the AMP Hindi home page
	 */
	public void verifyLiteratureReadMore(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(literatureHeadline);
		webDriverActions.continuousScrollTillElement(literatureHeadline,10);
		webDriverActions.clickJS(literatureReadmore);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to click on the MobileTechTitle section Headline present at the AMP Hindi home page
	 */
	public void verifyMobileTechTitle(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);
		webDriverActions.softHighlightElement(mobileTech);
		webDriverActions.mouseHoverAndClick(mobileTech);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to click on the MobileTechArticleList section Headline present at the AMP Hindi home page
	 */
	public void verifyMobileTechArticleList(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);

		if(mobileTecharticleLnk.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<mobileTecharticleLnk.size();i++)
			{  
				webDriverActions.softMouseHover(mobileTecharticleLnk.get(i));
				webDriverActions.clickJS(mobileTecharticleLnk.get(i));
				String currentPage = webDriverActions.getCurrentPageUrl();
				String expectedUrl = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage = betaUrl;
				}
				webDriverActions.waitForSecond(2000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrum),"Unable to display Element "+currentPage);
				Logs.info(getClass(),"Clicked Latest News articles link");
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
			softAssert.fail("Possibly Element is Not Visible Or Size is "+mobileTecharticleLnk.size());
		}
		softAssert.assertAll("Issues found in this url "); 

	}

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to click on the SuperHitGalleryTitle section Headline present at the AMP Hindi home page
	 */
	public void verifySuperHitGalleryTitle(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(superHitGalleryHeadline);
		webDriverActions.softHighlightElement(superHitGalleryHeadline);
		webDriverActions.clickJS(superHitGalleryHeadline);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(superHitGalleryBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to click on the SuperHitGalleryReadmore section Headline present at the AMP Hindi home page
	 */
	public void verifySuperHitGalleryReadmore(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(superHitGalleryReadmore);
		webDriverActions.softHighlightElement(superHitGalleryReadmore);
		webDriverActions.clickJS(superHitGalleryHeadline);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(superHitGalleryBreadcrum),"Unable to display Element "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to click on the SuperHitGalleryArticleLnk section Headline present at the AMP Hindi home page
	 */
	public void verifySuperHitGalleryArticleLnk(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(superHitGalleryHeadline);

		if(superHitGalleryArticleLink.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<superHitGalleryArticleLink.size();i++)
			{  
				webDriverActions.softMouseHover(superHitGalleryArticleLink.get(i));
				webDriverActions.clickJS(superHitGalleryArticleLink.get(i));
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage = betaUrl;
				}
				webDriverActions.waitForSecond(2000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(superHitGalleryBreadcrum),"Unable to display Element "+currentPage);
				Logs.info(getClass(),"Clicked Latest News articles link");
				webDriverActions.waitForPageToLoad();
				webDriverActions.navigateBack();	
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+superHitGalleryArticleLink.size());
		}
		softAssert.assertAll("Issues found in this url "); 
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of Career Widget
	 */
	public void verifyCareerWidget(String serverType) {
		verifySectionLnks(serverType,careerSectionLnk, careerBreadcrumb);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of Career Widget Article
	 */
	public void verifyCareerWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,careerSectionLnk,careerSectionArticleLnk, careerBreadcrumb);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of Career Widget Image
	 */
	public void verifyCareerWidgetImg(String serverType) {
		verifyImgNavigation(serverType,careerSectionLnk,careerSectionImgLnk, careerBreadcrumb);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of More Career News
	 */
	public void verifyMoreCareerLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreCareerSectionLnk, careerBreadcrumb);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of Crime Widget
	 */
	public void verifyCrimeWidget(String serverType) {
		verifySectionLnks(serverType,crimeSectionLnk, crimeBreadcrumb);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of Crime Widget Article
	 */
	public void verifyCrimeWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,crimeSectionLnk,crimeSectionArticleLnk, crimeBreadcrumb);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of Crime Widget Image
	 */
	public void verifyCrimeWidgetImg(String serverType) {
		verifyImgNavigation(serverType,crimeSectionLnk,crimeSectionImgLnk, crimeBreadcrumb);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of More Crime News
	 */
	public void verifyMoreCrimeLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreCrimeSectionLnk, crimeBreadcrumb);
	}
}
package com.news18.englishpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Danish R
 * This class contains webelements and business logic for News18 CricketNext Page
 */
public class DesktopCricketNextPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	public WebDriver driver;

	public DesktopCricketNextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	

	/* Team ranking text present in RHS of cricket next sub page*/
	@FindBy(xpath ="//div[contains(@class,'CN-TeamRanking')]/h2")
	private WebElement teamRankingTxt;

	/*Share Twitter Division in Twitter Sectiom in CricketNext page*/
	@FindBy(xpath = "(//div[contains(@class,'timeline-Tweet')]//ul//div[@class='timeline-ShareMenu-container'])[1]")
	private WebElement shareTweetDiv;

	/* Team ranking  present in RHS of cricket next sub page*/
	@FindBy(xpath ="//div[contains(@class,'CN-TeamRanking')]")
	private WebElement teamRanking;

	/* Test ,ODI and T20I links present under Team ranking sub section*/
	@FindBy(xpath ="//div[contains(@class,'CN-TeamRanking')]/ul//a")
	private  List<WebElement> matchTypeLnk;

	/* Full ranking link present under Team ranking sub section*/
	@FindBy(xpath ="//div[contains(@class,'tmrnk-tbl')]//tr//a")
	private  WebElement fullRankingLnk;

	/* First ranking team name present in Team ranking sub section*/
	@FindBy(xpath ="//table/tbody/tr[2]/td[2]")
	private  WebElement firstTeamName;

	/* First ranking team name present in Team ranking Page*/
	@FindBy(xpath ="//table/tbody/tr[1]/td[2]//h3")
	private  WebElement teamRankingFirstName;

	/*More Videos button present below videos section of CricketNext Page */
	@FindBy(xpath ="//a[text()='More Videos']")
	private WebElement cricketNextMoreVideosBtn;

	/*Video article links present below feature section of CricketNext Page*/
	@FindBy(xpath ="//ul[contains(@class,'cn-h-video')]//div/h3")
	private List<WebElement> videoArticleLnk;

	/*More Videos button present below videos section of CricketNext Page */
	@FindBy(xpath ="//div[contains(@class,'brade_crum')]//li/h1")
	private WebElement cricketNextMoreVideosBreadCrumbTxt;

	/*Latest News article links present below Video section of CricketNext Page*/
	@FindBy(xpath ="//ul[contains(@class,'CN-latestStory-widget')]//a/p")
	private List<WebElement> latestNewsArticleLnk;

	/*Article header Text present after clicking on the article below latest news of CricketNext Page*/
	@FindBy(xpath ="//h1")
	private WebElement articleHeaderTxt;

	/* RHS Tweets Text in CricketNext Page*/
	@FindBy(xpath = "//h1[text()='Tweets ']")
	private WebElement rhsTweetTxt;

	/* List of first Like and Share  buttons in RHS Tweet Section In CricketNext Page*/
	@FindBy(xpath = "(//ul[contains(@class,'timeline-Tweet')])[1]/li/a")
	private List<WebElement> firstTweetLikeShareBtn;

	/*Links of all promoted content in RHS*/
	@FindBy(xpath ="//div[@class='ob-widget-section ob-first']//ul")
	private List<WebElement> promotedContentLstLnk;

	/*Outbrain link in RHS*/
	@FindBy(xpath ="//div//span[@class='ob_logo']")
	private WebElement rhsOutbrainLnk;

	/* Schedulelink present after clicking on CricketNext */
	@FindBy(xpath ="//a[@href='/cricketnext/cricket-schedule/']")
	private WebElement scheduleLnk;

	/*Link of all Promoted Content in Desktop Cricket Next Schedule Page*/
	@FindBy(xpath = "//span[@class='ob-unit ob-rec-text']")
	private List<WebElement> cricketNxtpromotedContentLnk;

	/*Link of Outbrain in Desktop Cricket Next Schedule Page*/
	@FindBy(xpath = "(//span[@title='Outbrain - content marketing'])[1]")
	private WebElement cricketNxtOutbrainLnk;

	/*Link of all Bread crumb in Desktop Cricket Next Schedule Page*/
	@FindBy(xpath = "//ul[contains(@class,'breadcum')]//a")
	private List<WebElement> cricketNxtBreadCrumbLnk;

	/*Live Score section present in Navigation bar*/
	@FindBy(xpath = "//div[contains(@class,'top')]//ul//li//a[contains(@href,'live-scorecard')]")
	private WebElement liveScoreSection;

	/*List of advertisement present in page */
	@FindBy(xpath="//iframe[@aria-label='Advertisement']")
	private List<WebElement> ads;

	/*Link of all Promoted Content in Desktop Cricket Live Score Page*/
	@FindBy(xpath = "//span[@class='ob-unit ob-rec-text']")
	private List<WebElement> promotedContentLnk;

	/*Desktop List of LiveScore Breadcrumb link  */
	@FindBy(xpath = "//div[contains(@class,'brade_crum')]//ul//li//a")
	private List<WebElement> liveScoreSectionBreadcrumLnk;

	/*upcoming matches Section Link is present Below The Team Ranking at RHS of LiveScore Page*/
	@FindBy(xpath = "//div[contains(@class,'upcomming-matches-widget')]//ul/li/a  |  //a[text()='Complete Schedule']")
	private List<WebElement> upcomingmatchesLnk;

	/*List of Also Check Links in Live Matches section 
	 * after navigating to Live Score section 
	 */
	@FindBy(xpath = "//div[contains(@class,'result-box')]//ul[contains(@class,'alsocheck')]/li/a")
	private List<WebElement>  liveMatchUpdateLnkLst;

	/*Score Card Division after clicking on Full ScoreCrad Link*/
	@FindBy(xpath = "//ul[contains(@class,'tab')]/li[contains(@class,'active')]")
	private WebElement activeScoreCardTab;

	/*Latest News Link on Desktop Cricket Next Live Score Page*/
	@FindBy(xpath = "//div[contains(@class,'latest_news_row')]/p")
	private List<WebElement> cricketLatestNewsTextLnk;

	/*Header Text Present after Clicking on Latest News article of Cricket Live Score Page*/
	@FindBy(xpath = "//h1")
	private WebElement latestNewsheaderTxt; 

	/*More From the Archives present below Latest News article of Cricket Live Score Page*/
	@FindBy(xpath = "//div/a[contains(text(),'More From the Archives')]")
	private WebElement moreFromTheArchivesLnk; 

	/* CricketNext Articles Links in Cricket next page*/
	@FindBy(xpath = "//div[contains(@class,'cn-story-wrap')]//li//a")
	private List<WebElement> cricketNxtArticleLnks;

	/**
	 * @author SanjeebKumarPati
	 * This method is used to click on First Article of English Home Page 
	 */
	public void clickOnFirstArticleCricketNextPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForElementVisibility(cricketNxtArticleLnks.get(0), 10);
			webDriverActions.clickJS(cricketNxtArticleLnks.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Cricket Next Article Link");
		}
	}
}
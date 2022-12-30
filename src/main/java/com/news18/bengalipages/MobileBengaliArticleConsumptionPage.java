package com.news18.bengalipages;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.news18.init.GenericUtility;
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;


/**
 * @author SanjeebKumarPati
 *This Class Contains elements and business logics for Bengali Article Consumption Page
 */
public class MobileBengaliArticleConsumptionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	SoftAssert assrt =new SoftAssert();
	public WebDriver driver;
	public MobileBengaliArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Links of all latest article in latest section*/
	@FindBy(xpath = "//ul[contains(@class,'listview-story clearfix')]//a[2]")
	private List<WebElement> latestMobileLastFourArtcleLst;
	
	/*Links of all latest article in latest section*/
	@FindBy(xpath = "//div[contains(@class,'bigstory')]//h2/a")
	private WebElement latestMobileArtcleLst;

	/*First published date mentioned in latest article*/
	@FindBy(xpath = "(//ul[contains(@class,'artcl_byeline')]//time)[1] | (//ul[contains(@class,'pht-newbyeline-agency')]//time)[1]")
	private WebElement firstPublishedDate;

	/*Desktop_LiveBlogPage Social share Links*/
	@FindBy(xpath = "//div[contains(@class,'share clearfix')]//a")
	private List<WebElement> socialShareIconsLnks;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'share clearfix')]")
	private WebElement allShareIcon;
	
	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="(//div[contains(@class,'share-icon')])/a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'share-icon')]")
	private WebElement allShareIcons;

	public List<WebElement> getSocialShareIconsLnk() {
		return socialShareIconsLnk;
	}

	public WebElement getAllShareIcons() {
		return allShareIcons;
	}

	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to verify articles update time for All the Top Story in Home Page
	 */
	public void mobileVerifyLatestNewsUpdatedTime()   {

		ArrayList<String> list = new ArrayList<String>();
		ArrayList<ArrayList<String>> failedUrlWithDate= new ArrayList<ArrayList<String> >();
		ArrayList<String> failedUrlList = new ArrayList<String>();
		int count=0;
		try
		{
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(5000);
			//it will take fetch the href of first article and add it in list.
			String article = webDriverActions.getAttribute("href", latestMobileArtcleLst);
			list.add(article);	
			if(latestMobileLastFourArtcleLst.size()>4)
			{	
			for (int i = 0; i < 4; i++)
				{
				//it will take fetch the href of 5 articles and add it in list.
				String article1 = webDriverActions.getAttribute("href", latestMobileLastFourArtcleLst.get(i));
				list.add(article1);
				Logs.info(getClass(), list.get(i));
				}
			}
			else
			{
				for (int i = 0; i < latestMobileLastFourArtcleLst.size(); i++)
				{
				//it will take fetch the href of 5 articles and add it in list.
				String article3 = webDriverActions.getAttribute("href", latestMobileLastFourArtcleLst.get(i));
				list.add(article3);
				Logs.info(getClass(), list.get(i));
				}
			}
			//This loop will iterate the list one by one and navigating and checking the time difference i.e not more then 15 min
			for (int j = 0; j < list.size(); j++)
			{
				webDriverActions.waitForSecond(2000);
				webDriverActions.navigateToUrl(list.get(j));
				String latestArticleUrl = webDriverActions.getCurrentPageUrl();
				webDriverActions.waitForElementVisibility(firstPublishedDate,GlobalVariables.sec60);
				webDriverActions.mouseHover(firstPublishedDate);
				webDriverActions.highlightElement(firstPublishedDate);
				String date=webDriverActions.getTextFromElement(firstPublishedDate);
				long minutes = genericUtility.dateTimeDifference(date);
				Logs.info(getClass(),"Article is updated before: "+minutes+" minutes  "+latestArticleUrl);
				if(minutes<=15)
				{
					count++;
					if(count==1)
					{
						break;
					}
				}
				else
				{
					String failedUrls = webDriverActions.getCurrentPageUrl();
					failedUrlList.add(failedUrls);
					failedUrlList.add(date);
				}
			}
			failedUrlWithDate.add(failedUrlList);
			for(int k = 0; k < failedUrlList.size(); k++)
			{
				Assert.assertTrue(count>=1,"Article is not updated for more than 15 minutes. Current system time is: "+GenericUtility.getDateTime()+" For these Articles and article date "+failedUrlWithDate);
			}			
		}		
		catch(NoSuchElementException n)
		{
			Logs.error(getClass(), "possibly the element is not visible and clickable");
			Assert.fail("possibly the element is not visible and clickable");
		}
		catch(IndexOutOfBoundsException n)
		{
			Logs.error(getClass(), "possibly the element is not visible and clickable for article");
			Assert.fail("possibly the element is not visible and clickable index");
		}
}
	
}

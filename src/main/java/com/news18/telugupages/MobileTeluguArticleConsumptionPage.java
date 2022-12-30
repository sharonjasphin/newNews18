package com.news18.telugupages;

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
 *This Class Contains elements and business logics for Telugu Article Consumption Page
 */
public class MobileTeluguArticleConsumptionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	SoftAssert assrt =new SoftAssert();
	public WebDriver driver;
	public MobileTeluguArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="//div[contains(@class,'social_share_sec')]//a | //div[contains(@class,'share-icon fright')]//a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'social_share_sec')] | //div[contains(@class,'share-icon fright')]")
	private WebElement allShareIcons;

	/*Links of all latest article in latest section*/
	@FindBy(xpath = "//div[contains(@class,'chmpntpnwshd')]/h2/a")
	private List<WebElement> latestArtcleLst;

	/*First published date mentioned in latest article*/
	@FindBy(xpath = "(//div[contains(@class,'byline_sec')]//time)[1] | (//div[contains(@class,'pht-artcl-top')]//time)[1]")
	private WebElement firstPublishedDate;

	/*First published date mentioned in latest article*/
	@FindBy(xpath = "(//ul[contains(@class,'artcl_byeline')]//time)[1] | (//ul[contains(@class,'pht-newbyeline-agency')]//time)[1]")
	private WebElement mobileFirstPublishedDate;

	public List<WebElement> getSocialShareIconsLnk() {
		return socialShareIconsLnk;
	}

	public List<WebElement> getlatestArtcleLst() {
		return latestArtcleLst;
	}

	public WebElement getAllShareIcons() {
		return allShareIcons;
	}

	public WebElement getMobileFirstPublishedDate() {
		return mobileFirstPublishedDate;
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to verify articles update time for All the Top Story in Home Page
	 */
	public void mobileVerifyLatestNewsUpdatedTime()   {

		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> failedUrlList = new ArrayList<String>();
		ArrayList<ArrayList<String>> failedUrlWithDate= new ArrayList<ArrayList<String> >();
		int count=0;
		try
		{
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(3000);			
			if(latestArtcleLst.size()>5)
			{	
				for (int i = 0; i < 5; i++)
				{
					//it will take fetch the href of 5 articles and add it in list.
					String article = webDriverActions.getAttribute("href", latestArtcleLst.get(i));
					list.add(article);
					Logs.info(getClass(), list.get(i));
				}
			}
			else
			{
				for (int i = 0; i < latestArtcleLst.size(); i++)
				{
					//it will take fetch the href of 5 articles and add it in list.
					String article = webDriverActions.getAttribute("href", latestArtcleLst.get(i));
					list.add(article);
					Logs.info(getClass(), list.get(i));
				}
			}

			//This loop will iterate the list one by one and navigating and checking the time difference i.e not more then 15 min
			for (int j = 0; j < list.size(); j++)
			{
				webDriverActions.waitForSecond(2000);
				webDriverActions.navigateToUrl(list.get(j));
				String latestArticleUrl = webDriverActions.getCurrentPageUrl();
				webDriverActions.waitForElementVisibility(mobileFirstPublishedDate,GlobalVariables.sec60);
				webDriverActions.mouseHover(mobileFirstPublishedDate);
				webDriverActions.highlightElement(mobileFirstPublishedDate);
				String date=webDriverActions.getTextFromElement(mobileFirstPublishedDate);
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
				Assert.assertTrue(count>=1, "Article is not updated for more than 15 minutes. Current system time is: "+GenericUtility.getDateTime()+" For these Articles and article date "+failedUrlWithDate);
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

package com.news18.kannadapages;

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
 *This Class Contains Elements and Business Logics For Desktop Kannada Article Consumption Page
 */
public class DesktopKannadaArticleConsumptionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	SoftAssert assrt = new SoftAssert();

	public WebDriver driver;
	public DesktopKannadaArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Link of all latest article in latest section*/
	@FindBy(xpath = "//div[contains(@class,'left-img-list')]//a")
	private List<WebElement> latestArtcleLst;

	/*First published date mentioned in latest article*/
	@FindBy(xpath = "(//ul[contains(@class,'newbyeline-agency')]//time)[1] | (//ul[contains(@class,'phtartcl-newbyeline-agency')]//time)[1]")
	private WebElement firstPublishedDate;
	
	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="//div[contains(@class,'newbyeline')]//ul[contains(@class,'share')]//a | //div[contains(@class,'pht-artcl-share fright')]//a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'newbyeline')]//ul[contains(@class,'share')] | //div[contains(@class,'pht-artcl-share fright')]")
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
	public void desktopVerifyLatestNewsUpdatedTime()   {
		String latestArticleUrl="";
		String date="";
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> failedUrlList = new ArrayList<String>();
		ArrayList<ArrayList<String>> failedUrlWithDate= new ArrayList<ArrayList<String> >();
		
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
				latestArticleUrl = webDriverActions.getCurrentPageUrl();
				webDriverActions.waitForElementVisibility(firstPublishedDate,GlobalVariables.sec60);
				webDriverActions.mouseHover(firstPublishedDate);
				webDriverActions.highlightElement(firstPublishedDate);
				date=webDriverActions.getTextFromElement(firstPublishedDate);
				long minutes = genericUtility.dateTimeDifference(date);
				Logs.info(getClass(),"Article is updated before: "+minutes+" minutes  "+latestArticleUrl);
				if(minutes>15)
				{
					String failedUrls = webDriverActions.getCurrentPageUrl();
					failedUrlList.add(failedUrls);
					failedUrlList.add(date);
					
				}					
			}
			failedUrlWithDate.add(failedUrlList);
			for(int k = 0; k < failedUrlList.size(); k++)
			{
				Assert.fail("Article is not updated for more than 15 minutes. Current system time is: "+GenericUtility.getDateTime()+" For these Articles and article date "+failedUrlWithDate);
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

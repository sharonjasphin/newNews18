package com.news18.commonpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;


/**
 *@author SanjeebKumarPati
 *This Class Contains Method to verify Social Share Icons present and Its Navigations
 *In Every Pages Like Article,PhotoArticle and Live Blogs.
 */
public class VerifySocialShareIcons {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	public WebDriver driver;

	public VerifySocialShareIcons(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="//div[contains(@class,'share_icon')]//amp-social-share  | //div[contains(@class,'social_share_sec')]//amp-social-share") 
	private List<WebElement> AMPSocialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'share_icon')] | //div[contains(@class,'social_share_sec')]")
	private WebElement AMPAllShareIcons;


	/**
	 * @author SanjeebKumarPati
	 * This method is used to verify the social icons navigation after clicking on first article
	 */
	public void verifySocialMediaNavigation(List<WebElement>socialShareIconsLnk,WebElement allShareIcons )
	{
		try {
			webDriverActions.waitForPageToLoad();
			Assert.assertTrue(webDriverActions.isElementDisplayed(allShareIcons), "Possibly Social Share Icon is Not visible for this URL "+ webDriverActions.getCurrentPageUrl());
			for(int i=0;i<socialShareIconsLnk.size();i++)  
			{
				webDriverActions.highlightElement(socialShareIconsLnk.get(i));
				String actual = webDriverActions.getAttribute("href", socialShareIconsLnk.get(i));
				if(actual.contains("whatsapp")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else if (actual.contains("facebook")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else if (actual.contains("linkedin")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else if (actual.contains("getpocket")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else if (actual.contains("kooapp")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else if (actual.contains("mailto")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else if (actual.contains("google")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else if (actual.contains("twitter")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else if (actual.contains("telegram")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else if (actual.contains("news18dotcom")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else
				{
					Logs.error(getClass(), "Social Share Verification Failed "+actual);
					Assert.fail("Social Share Verification Failed "+actual);	
				}
			}
		}
		catch(Exception e)
		{
			Assert.fail("Social Share Verification Failed "+webDriverActions.getCurrentPageUrl());	
		}
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to verify the social icons navigation in AMP View
	 */
	public void verifyAMPSocialMediaNavigation()
	{
		try {
			webDriverActions.waitForPageToLoad();
			Assert.assertTrue(webDriverActions.isElementDisplayed(AMPAllShareIcons), "Possibly Social Share Icon is Not visible for this URL "+ webDriverActions.getCurrentPageUrl());
			for(int i=0;i<AMPSocialShareIconsLnk.size();i++)  
			{
				webDriverActions.highlightElement(AMPSocialShareIconsLnk.get(i));
				String actual = webDriverActions.getAttribute("type", AMPSocialShareIconsLnk.get(i));
				if(actual.contains("whatsapp")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else if (actual.contains("facebook")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else if (actual.contains("linkedin")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else if (actual.contains("getpocket")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else if (actual.contains("kooapp")||actual.contains("koo")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else if (actual.contains("mailto")||actual.contains("email")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else if (actual.contains("google")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else if (actual.contains("twitter")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else if (actual.contains("telegram")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else if (actual.contains("news18dotcom")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else
				{
					Logs.error(getClass(), "Social Share Verification Failed "+actual);
					Assert.fail("Social Share Verification Failed "+actual);	
				}
			}
		}
		catch(Exception e)
		{
			Assert.fail("Social Share Verification Failed "+webDriverActions.getCurrentPageUrl());	
		}
	}


}

package com.news18.commonpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.news18.init.Logs;
import com.news18.init.WebDriverActions;


/**
 * @author AnupamGupta
 * This class contains WebElements and Business Logics which is used to verify the Advertisement is 
 * displayed in Mobile Mode which is common for All the Languages 
 */
public class MobileAdsValidation {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();

	public MobileAdsValidation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*List of advertisement present in page */
	@FindBy(xpath="//iframe[(@aria-label='Advertisement') and (not(contains(@width,'1')))]")
	private  List<WebElement> ads;

	/*List of advertisement present in page */
	@FindBy(xpath="//div[contains(@id,'google_ads_iframe') and not(contains(@id,'1x1'))]//iframe[(not(@width<'2'))]")
	private  List<WebElement> mobileAds;
	
	/*List of advertisement present in page */
	@FindBy(xpath="//amp-ad//iframe[((@aria-label='Advertisement') or (@title='Advertisement'))and (not(@width<'2'))]")
	private  List<WebElement> ampAds;

	/**
	 * @author AnupamGupta
	 * This method used to validate Advertisements present in mobile web 
	 */
	public void verifyAds(){
		webDriverActions.waitForPageToLoad();
		String url = webDriverActions.getCurrentPageUrl();
		webDriverActions.mobileScroll(10);

		webDriverActions.waitForSecond(8000);
		Logs.info(getClass(),"Ads found on page " +ads.size());

		if(ads.size()>=2)
		{
			webDriverActions.waitForSecond(4000);
			//			webDriverActions.scrollDown();
			for(int i=0;i<2;i++) {
				//			webDriverActions.waitForElementVisibility(ads.get(i),GlobalVariables.sec60);
				Assert.assertTrue(webDriverActions.isElementDisplayed(ads.get(i)),"Failed to display Ads "+url);
				webDriverActions.scrollDown();
				webDriverActions.waitForSecond(2000);
				//				webDriverActions.highlightElement(ads.get(i)); // Highlighting the advertisement
			}
		}
		else
		{
			Assert.fail("Unable to Verify Ads in "+url);
		}
	}


	/**
	 * @author AnupamGupta
	 * This method used to validate Advertisements present in mobile web 
	 */
	public void verifyAds(int scroll,int wait){
		webDriverActions.waitForPageToLoad();
		String url = webDriverActions.getCurrentPageUrl();
		webDriverActions.mobileScroll(4);

		webDriverActions.waitForSecond(14000);
		if(ads.size()<2) {
			webDriverActions.scrollToPoint(0, 100);
			webDriverActions.mobileScroll(scroll);
			webDriverActions.waitForSecond(wait);
			if(ads.size()<2) {
				webDriverActions.scrollToPoint(0, 100);
				webDriverActions.mobileScroll(8);
				webDriverActions.waitForSecond(10000);
			}
		}
		Logs.info(getClass(),"Ads found on page " +ads.size());

		if(ads.size()>=2)
		{
			webDriverActions.waitForSecond(4000);
			for(int i=0;i<2;i++) {
				//			webDriverActions.waitForElementVisibility(ads.get(i),GlobalVariables.sec60);
				Assert.assertTrue(webDriverActions.isElementDisplayed(ads.get(i)),"Failed to display Ads "+webDriverActions.getCurrentPageUrl());
				webDriverActions.scrollToElement(ads.get(i));
				webDriverActions.scrollDown();
				//				webDriverActions.waitForSecond(2000);
				//				webDriverActions.highlightElement(ads.get(i)); // Highlighting the advertisement
			}
		}
		else
		{
			Assert.fail("Unable to Verify Ads in "+url);
		}
	}

	/**
	 * @author AnupamGupta
	 * This method used to validate Advertisements present in mobile web 
	 */
	public void verifyTamilAds(int scroll,int wait){
		int count=0;
		webDriverActions.waitForPageToLoad();
		String url = webDriverActions.getCurrentPageUrl();
		webDriverActions.mobileScroll(4);

		webDriverActions.waitForSecond(14000);
		if(ads.size()<2) {
			webDriverActions.scrollToPoint(0, 100);
			webDriverActions.mobileScroll(scroll);
			webDriverActions.waitForSecond(wait);
			if(ads.size()<2) {
				webDriverActions.scrollToPoint(0, 100);
				webDriverActions.mobileScroll(8);
				webDriverActions.waitForSecond(10000);
			}
		}
		Logs.info(getClass(),"Ads found on page " +ads.size());

		if(ads.size()>=2)
		{
			webDriverActions.waitForSecond(4000);
			for(int i=0;i<ads.size();i++) {
				if(webDriverActions.isElementDisplayed(ads.get(i))) {
					count++;
				}
			}
			Logs.info(getClass(), "Ads displayed in page is "+count);
			Assert.assertTrue(count>1,"Failed to display Ads "+webDriverActions.getCurrentPageUrl());
		}
		else
		{
			Assert.fail("Unable to Verify Ads in "+url);
		}
	}


	/**
	 * @author AnupamGupta
	 * This method used to validate Advertisements present in mobile web 
	 */
	public void verifyMobileAds(int scroll,int wait){
		int count=0;
		webDriverActions.waitForPageToLoad();
		String url = webDriverActions.getCurrentPageUrl();
		webDriverActions.mobileScroll(3);

		webDriverActions.waitForSecond(14000);
		if(mobileAds.size()<2) {
			webDriverActions.scrollToPoint(0, 100);
			webDriverActions.mobileScroll(scroll);
			webDriverActions.waitForSecond(wait);
			if(mobileAds.size()<2) {
				webDriverActions.scrollToPoint(0, 100);
				webDriverActions.refreshPage();
				webDriverActions.waitForPageToLoad();
				webDriverActions.mobileScroll(8);
				webDriverActions.waitForSecond(10000);
			}
		}
		Logs.info(getClass(), url+"  "+webDriverActions.getPageTitle());
		Logs.info(getClass(),"Ads found on page " +mobileAds.size());

		if(mobileAds.size()>=2)
		{
			webDriverActions.waitForSecond(4000);
			for(int i=0;i<mobileAds.size();i++) {
				if(webDriverActions.isElementDisplayed(mobileAds.get(i))) {
					count++;
				}
			}
			Logs.info(getClass(), "Ads displayed in page is "+count);
			Assert.assertTrue(count>1,"Failed to display Ads "+webDriverActions.getCurrentPageUrl());
		}
		else
		{
			Assert.fail("Unable to Verify Ads in "+url);
		}
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method used to validate Advertisements present in mobile web 
	 */
	public void verifyAMPAds(int scroll,int wait){
		int count=0;
		webDriverActions.waitForPageToLoad();
		String url = webDriverActions.getCurrentPageUrl();
		webDriverActions.mobileScroll(3);

		webDriverActions.waitForSecond(14000);
		if(ampAds.size()<2) {
			webDriverActions.scrollToPoint(0, 100);
			webDriverActions.mobileScroll(scroll);
			webDriverActions.waitForSecond(wait);
			if(ampAds.size()<2) {
				webDriverActions.scrollToPoint(0, 100);
				webDriverActions.refreshPage();
				webDriverActions.waitForPageToLoad();
				webDriverActions.mobileScroll(8);
				webDriverActions.waitForSecond(10000);
			}
		}
		Logs.info(getClass(), url+"  "+webDriverActions.getPageTitle());
		Logs.info(getClass(),"Ads found on page " +ampAds.size());

		if(ampAds.size()>=2)
		{
			webDriverActions.waitForSecond(4000);
			for(int i=0;i<ampAds.size();i++) {
				if(webDriverActions.isElementDisplayed(ampAds.get(i))) {
					count++;
				}
			}
			Logs.info(getClass(), "Ads displayed in page is "+count);
			Assert.assertTrue(count>1,"Failed to display Ads "+webDriverActions.getCurrentPageUrl());
		}
		else
		{
			Assert.fail("Unable to Verify Ads in "+url);
		}
	}
}
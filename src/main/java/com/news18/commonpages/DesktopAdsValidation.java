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
 * displayed in Desktop Mode which is common for All the Languages 
 */
public class DesktopAdsValidation {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();

	public DesktopAdsValidation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*List of advertisement present in page */
	@FindBy(xpath="//iframe[(@aria-label='Advertisement') and (not(contains(@width,'1')))]")
	private List<WebElement> ads;
	
	/*List of advertisement present in page */
	@FindBy(xpath="//iframe[(@aria-label='Advertisement') and (not(@width<'2'))]")
	private  List<WebElement> desktopAds;

	/**
	 * @author AnupamGupta
	 * This method used to validate Advertisement is displayed in desktop
	 */
	public void verifyAds() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		webDriverActions.waitForSecond(20000);
		//		webDriverActions.waitForAllElementsVisible(ads, GlobalVariables.sec60);
		if(ads.size()>=2)
		{
			webDriverActions.waitForSecond(4000);
			webDriverActions.scrollDown();
			for(int i=0; i < 2;i++) {
				webDriverActions.waitForSecond(2000);
				webDriverActions.scrollDown();
				Assert.assertTrue(webDriverActions.isElementDisplayed(ads.get(i)),"Failed to display Ads "+webDriverActions.getCurrentPageUrl());
				//			webDriverActions.mouseHover(ads.get(i));    //Mousehover to advertisement
				//			webDriverActions.highlightElement(ads.get(i));  //Highlighting the advertisement
			}
		}
		else
		{
			Assert.fail("Unable to Verify Ads "+webDriverActions.getCurrentPageUrl());
		}
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method used to validate Advertisement is displayed in desktop
	 */
	public void verifyAds(int wait) {
		int count=0;
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForSecond(10000);

		if(desktopAds.size()<2) {
			webDriverActions.scrollDown();
			webDriverActions.waitForSecond(1500);
			webDriverActions.scrollToPoint(0, 50);
			webDriverActions.waitForSecond(wait);
			if(desktopAds.size()<2) {
				webDriverActions.refreshPage();
				webDriverActions.waitForPageToLoad();
				webDriverActions.scrollDown();
				webDriverActions.waitForSecond(10000);
			}
		}
		Logs.info(getClass(),"Ads found on page " +desktopAds.size());
		//		webDriverActions.waitForAllElementsVisible(ads, GlobalVariables.sec60);
		if(desktopAds.size()>=2)
		{
			for(int i=0;i<desktopAds.size();i++) {
				if(webDriverActions.isElementDisplayed(desktopAds.get(i))) {
					count++;
				}
			}
			Logs.info(getClass(), "Ads displayed in page is "+count);
			Assert.assertTrue(count>1,"Failed to display Ads "+webDriverActions.getCurrentPageUrl());
		}
		else
		{
			Assert.fail("Unable to Verify Ads "+webDriverActions.getCurrentPageUrl());
		}
	}
}
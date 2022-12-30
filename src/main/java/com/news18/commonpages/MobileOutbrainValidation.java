package com.news18.commonpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author VipinKumarGawande
 * This class contains WebElements and Business Logics which is used to verify the Promoted Content and Outbrain is 
 * displayed/Loading in Mobile Mode which is common for All the Languages 
 */
public class MobileOutbrainValidation {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	public MobileOutbrainValidation(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Promoted Content All Article List present inside Outbrain in Homepage*/
	@FindBy(xpath ="//div[@class='OUTBRAIN']//span[contains(@class,'ob-rec-text')] | (//div[contains(@class,'ob-cards')])[1]//div[contains(@class,'OUTBRAIN')]")
	private List<WebElement> promotedContentArticleList;

	/*Promoted Content image is present inside Promoted Content Section in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'OUTBRAIN')]//span[contains(@class,'ob-rec-image-container')]")
	private List<WebElement> promotedContentImg;

	/*Outbrain Text  is present in the above the Footer and Rhs of Promoted Content*/
	@FindBy(xpath ="//div[contains(@class,'OUTBRAIN')]//span[contains(@class,'ob_logo')] | //div[contains(@class,'OUTBRAIN')]//span[contains(@class,'ob_amelia')]")
	private List<WebElement> outbrainTxt;

	/*Outbrain Division */
	@FindBy(xpath = "//div[contains(@class,'OUTBRAIN')]")
	private WebElement outbrainDiv;

	/*Promoted Content Division in Article Conumption Page */
	@FindBy(xpath = " (//div[contains(@class,'ob-cards')])[1]//div[contains(@class,'OUTBRAIN')]  | (//div[@class='OUTBRAIN'])[1]//span[contains(@class,'ob-rec-text')]")
	private List<WebElement> promotedContentDiv;
	
	/*Promoted Content Article in Homepage*/
	@FindBy(xpath = "//div[@class='OUTBRAIN']//span[contains(@class,'rec-text')]")
	private List<WebElement> promotedContentArticleLst;
	
	/*Promoted Content Image in Homepage*/
	@FindBy(xpath = "//div[@class='OUTBRAIN']//span[contains(@class,'rec-image')]")
	private List<WebElement> promotedContentImageLst;
	//div[contains(@class,'ob-cards')]//div[contains(@class,'OUTBRAIN')]
	//@FindBy(xpath = "(//div[contains(@class,'outbrain_row')])[1]//div[contains(@class,'OUTBRAIN')]")

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Promoted Content Ads and OutBrain is displayed/Loading in HomePage , 
	 * Article,LiveBlog,PhotoGallery in Mobile 
	 */
	public void verifyHomePageOutbrainContent()
	{
		webDriverActions.waitForPageToLoad();
				webDriverActions.mobileScroll(5);
		webDriverActions.continuousScrollTillElement(outbrainDiv, 5);
		webDriverActions.waitForSecond(2000);
		for(int i =0 ; i<promotedContentArticleList.size() ; i++)
		{
			webDriverActions.waitForSecond(1000);
			Assert.assertTrue(webDriverActions.isElementDisplayed(promotedContentArticleList.get(i)) , "Unable to Verify Promoted Content Text in "+webDriverActions.getCurrentPageUrl() +promotedContentArticleList);
			Assert.assertTrue(webDriverActions.isElementDisplayed(promotedContentImg.get(i)),"Unable to Verify Promoted Content Image in "+webDriverActions.getCurrentPageUrl() +promotedContentImg);
			webDriverActions.mouseHover(promotedContentArticleList.get(i));
			webDriverActions.scrollToElement(promotedContentArticleList.get(i));
			webDriverActions.highlightElement(promotedContentArticleList.get(i));
			Logs.info(getClass(), webDriverActions.getTextFromElement(promotedContentArticleList.get(i)));
			webDriverActions.mouseHover(promotedContentImg.get(i));
			webDriverActions.scrollToElement(promotedContentImg.get(i));
			webDriverActions.highlightElement(promotedContentImg.get(i));
			webDriverActions.scrollDown();
		}
//		for(int i=0 ; i<outbrainTxt.size() ; i++)
//		{
//			Assert.assertTrue(webDriverActions.isElementDisplayed(outbrainTxt.get(i)),"Unable to Verify Outbrain Logo in "+ webDriverActions.getCurrentPageUrl() +outbrainTxt);
//			webDriverActions.waitForSecond(2000);
//			webDriverActions.mouseHover(outbrainTxt.get(i));
//			webDriverActions.highlightElement(outbrainTxt.get(i));
//		}
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Promoted Content Ads and OutBrain is displayed/Loading in HomePage , 
	 * Article,LiveBlog,PhotoGallery in Mobile 
	 */
	public void verifyArticleOutbrainContent()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.mobileScroll(5);
		webDriverActions.continuousScrollTillElement(outbrainDiv, 5);
		webDriverActions.scrollToLast();
		Assert.assertTrue(webDriverActions.isElementDisplayed(outbrainDiv) , "Unable to Verify Outbrain Division in "+webDriverActions.getCurrentPageUrl() +outbrainDiv);

//		if(outbrainTxt.size()>=1)
//		{
//			for(int i=0 ; i<outbrainTxt.size() ; i++)
//			{
//				webDriverActions.mouseHover(outbrainTxt.get(i));
//				webDriverActions.waitForSecond(4000);
//				Assert.assertTrue(webDriverActions.isElementDisplayed(outbrainTxt.get(i) , GlobalVariables.sec30),"Unable to Verify Outbrain Logo in "+webDriverActions.getCurrentPageUrl() +outbrainTxt);
//				webDriverActions.highlightElement(outbrainTxt.get(i));
//			}
//		}
//		else
//		{
//			Assert.fail("Unable to Verify Outbrain Logo in "+webDriverActions.getCurrentPageUrl() +outbrainTxt);
//		}

		if(promotedContentDiv.size()>=1)
		{
			for(int i =0 ; i<promotedContentDiv.size() ; i++)
			{
				webDriverActions.waitForSecond(4000);
				Assert.assertTrue(webDriverActions.isElementDisplayed(promotedContentDiv.get(i)) , "Unable to Verify Promoted Content Division in "+webDriverActions.getCurrentPageUrl() +promotedContentDiv);
				webDriverActions.mouseHover(promotedContentDiv.get(i));
				webDriverActions.scrollToElement(promotedContentDiv.get(i));
				webDriverActions.highlightElement(promotedContentDiv.get(i));
				webDriverActions.scrollDown();
			}
		}
		else
		{
			Assert.fail("Unable to Verify Promoted Content Division in "+webDriverActions.getCurrentPageUrl() +promotedContentDiv);
		}

	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Promoted Content Ads and OutBrain is displayed/Loading in HomePage , 
	 * Article,LiveBlog,PhotoGallery in Mobile 
	 */
	public void verifyPromotedContentArticleNavigation()
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.mobileScroll(5);
		webDriverActions.scrollToLast();
		webDriverActions.continuousScrollTillElement(outbrainDiv, 15);
		webDriverActions.waitForSecond(2000);
		for(int i =0 ; i<promotedContentArticleLst.size() ; i++)
		{
			webDriverActions.waitForSecond(1000);
			webDriverActions.mobileScroll(5);
			webDriverActions.scrollToLast();
			webDriverActions.continuousScrollTillElement(outbrainDiv, 15);
			webDriverActions.waitForSecond(2000);
			webDriverActions.scrollDown();
			softAssert.assertTrue(webDriverActions.isElementDisplayed(promotedContentArticleLst.get(i)) , "Unable to Verify Promoted Content Text in "+webDriverActions.getCurrentPageUrl() +promotedContentArticleList);
			webDriverActions.mouseHover(promotedContentArticleLst.get(i));
			webDriverActions.scrollToElement(promotedContentArticleLst.get(i));
			webDriverActions.highlightElement(promotedContentArticleLst.get(i));
			Logs.info(getClass(), webDriverActions.getTextFromElement(promotedContentArticleLst.get(i)));
			webDriverActions.softClickJS(promotedContentArticleLst.get(i));
			webDriverActions.waitForSecond(2000);
			String currentPage = webDriverActions.getCurrentPageUrl();
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
			{
				webDriverActions.navigateBack();
				webDriverActions.mobileScroll(5);
				webDriverActions.continuousScrollTillElement(outbrainDiv, 5);
				webDriverActions.waitForSecond(2000);
				webDriverActions.mouseHover(promotedContentArticleLst.get(i));
				webDriverActions.scrollToElement(promotedContentArticleLst.get(i));
				webDriverActions.highlightElement(promotedContentArticleLst.get(i));
				Logs.info(getClass(), webDriverActions.getTextFromElement(promotedContentArticleLst.get(i)));
				webDriverActions.softClickJS(promotedContentArticleLst.get(i));
				webDriverActions.waitForSecond(2000);
			}
			String title = webDriverActions.getPageTitle();
			softAssert.assertFalse(title.contains("400") || title.contains("500") || title.contains("502") , "Issue Found in this URL : "+currentPage);
			webDriverActions.navigateBack();
		}
		softAssert.assertAll();
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Promoted Content Ads and OutBrain is displayed/Loading in HomePage , 
	 * Article,LiveBlog,PhotoGallery in Mobile 
	 */
	public void verifyPromotedContentImageNavigation()
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.mobileScroll(5);
		webDriverActions.continuousScrollTillElement(outbrainDiv, 15);
		webDriverActions.waitForSecond(2000);
		for(int i =0 ; i<promotedContentImageLst.size() ; i++)
		{
			webDriverActions.waitForSecond(1000);
			webDriverActions.scrollDown();
			softAssert.assertTrue(webDriverActions.isElementDisplayed(promotedContentImageLst.get(i)) , "Unable to Verify Promoted Content Text in "+webDriverActions.getCurrentPageUrl() +promotedContentArticleList);
			webDriverActions.mouseHover(promotedContentImageLst.get(i));
			webDriverActions.scrollToElement(promotedContentImageLst.get(i));
			webDriverActions.highlightElement(promotedContentImageLst.get(i));
			webDriverActions.softClickJS(promotedContentImageLst.get(i));
			webDriverActions.waitForSecond(2000);
			String currentPage = webDriverActions.getCurrentPageUrl();
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
			{
				webDriverActions.navigateBack();
				webDriverActions.mobileScroll(5);
				webDriverActions.continuousScrollTillElement(outbrainDiv, 5);
				webDriverActions.waitForSecond(2000);
				webDriverActions.mouseHover(promotedContentImageLst.get(i));
				webDriverActions.scrollToElement(promotedContentImageLst.get(i));
				webDriverActions.highlightElement(promotedContentImageLst.get(i));
				Logs.info(getClass(), webDriverActions.getTextFromElement(promotedContentImageLst.get(i)));
				webDriverActions.softClickJS(promotedContentImageLst.get(i));
				webDriverActions.waitForSecond(2000);
			}
			String title = webDriverActions.getPageTitle();
			softAssert.assertFalse(title.contains("400") || title.contains("500") || title.contains("502") , "Issue Found in this URL : "+currentPage);
			webDriverActions.navigateBack();
		}
		softAssert.assertAll();
	}
		
}

package com.news18.outbrainvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This test Class contains scripts to verify the OutBrain Contents is displayed/Loading in various pages 
 * like HomePage , Article Consumption Page , LiveBlog Article Consumption Page , PhotoGallery Consumption
 * Page for Bengali Language in Desktop Mode 
 */
public class DesktopBengaliOutbrainTest extends DesktopCommonConfig {
	
//	/**
//	 * @author VipinKumarGawande
//	 * This method is used to navigate to News18 HomePage for Bengali Language URL which is fetching from Property File
//	 * URL - https://bengali.news18.com/
//	 */
//	@BeforeMethod
//	public void navigateToBengaliHomePageUrl()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("bengaliUrl"));
//	}
	

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Promoted Content Ads and Image And OutBrain Content 
	 * is displayed/Loading in News18 HomePage for Bengali Language
	 */
	@Test
	public void verifyHomePageOutbrain()
	{
		pages.desktopOutbrainValidation.verifyHomepageOutbrainContent();
	}

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to first Article excluding LiveBlog Article Links in News18 HomePage and 
	 * verify the Promoted Content Ads and OutBrain Content is displayed/Loading in HomePage Article 
	 * Consumption Page
	 */
	@Test
	public void verifyArticleOutbrain()
	{
		pages.desktopBengaliLandingPage.clickOnFirstArticleHomePage();   // Click on First Article excluding LiveBlog Article
		pages.desktopOutbrainValidation.verifyArticleOutbarinContent();  
	}
	
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to first Article for only LiveBlog Article Links in News18 HomePage and 
	 * verify the Promoted Content Ads and OutBrain Content is displayed/Loading in HomePage Article 
	 * Consumption Page
	 */
	@Test
	public void verifyLiveblogOutbrain()
	{
		pages.desktopBengaliLandingPage.clickOnLiveBlogArticleHomePage(); 	// Click on First LiveBlog Article
		pages.desktopOutbrainValidation.verifyArticleOutbarinContent();
	}
	
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate Photos section and Click on the first PhotoGallery Article in News18 PhotoGallery Page 
	 * and Verify the Promoted Content Ads and OutBrain Content is displayed/Loading in PhotoGallery Article 
	 * Consumption Page
	 */
	@Test
	public void verifyPhotoGalleryOutbrain()
	{
		pages.desktopBengaliLandingPage.clickOnPhotoSection();  							// Click on Photos Section 
		pages.desktopBengaliPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();	// Click on First PhotoGallery Article
		pages.desktopOutbrainValidation.verifyArticleOutbarinContent();
	}
	
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to click on Tag links in News18 HomePage and Verify the Promoted Content 
	 * Ads and OutBrain Content is displayed/Loading in Tag Article Consumption Page 
	 */
	@Test
	public void verifyTopicsOutbrain()
	{
		pages.desktopBengaliLandingPage.clickOnFirstTopicLnkTrendingTopics();
		pages.desktopOutbrainValidation.verifyArticleOutbarinContent();
	}
}
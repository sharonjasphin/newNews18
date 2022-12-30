package com.news18.outbrainvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This test Class contains scripts to verify the OutBrain Contents is displayed/Loading in various pages 
 * like HomePage , Article Consumption Page , LiveBlog Article Consumption Page , PhotoGallery Consumption
 * Page for Hindi Language in Desktop Mode 
 */
public class DesktopHindiOutbrainTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for Hindi Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Promoted Content Ads and Image And OutBrain Content 
	 * is displayed/Loading in News18 HomePage for Hindi Language
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
		pages.desktopHindiLandingPage.clickOnFirstArticleHomePage();	// Click on First Article excluding LiveBlog Article
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
		pages.desktopHindiLandingPage.clickOnLiveBlogArticleHomePage();		// Click on First LiveBlog Article
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
		pages.desktopHindiLandingPage.clickOnPhotoSection();  								// Click on Photo Section in Line One Menu
		pages.desktopHindiPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();
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
		pages.desktopHindiLandingPage.clickOnFooterTopics();
		pages.desktopOutbrainValidation.verifyArticleOutbarinContent();
	}
}
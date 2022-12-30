package com.news18.outbrainvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This test Class contains scripts to verify the OutBrain Contents is displayed/Loading in various pages 
 * like HomePage , Article Consumption Page , LiveBlog Article Consumption Page , PhotoGallery Consumption
 * Page for Lokmat Language in Mobile Mode
 */
public class MobileLokmatOutbrainTest extends MobileCommonConfig {

//	/**
//	 * @author VipinKumarGawande
//	 * This method is used to navigate to News18 HomePage for Lokmat Language URL which is fetching from Property File
//	 * URL - https://lokmat.news18.com/
//	 */
//	@BeforeMethod
//	public void navigateToLokmatHomePageUrl()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatUrl"));
//	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Promoted Content Ads and Image And OutBrain Content 
	 * is displayed/Loading in News18 HomePage for Lokmat Language
	 */
	@Test
	public void verifyHomePageOutbrain()
	{
		pages.mobileOutbrainValidation.verifyHomePageOutbrainContent();
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
		pages.mobileLokmatLandingPage.clickOnFirstArticleLokmatHomePage();	// Click on First Article excluding LiveBlog Article
		pages.mobileOutbrainValidation.verifyArticleOutbrainContent();
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
		pages.mobileLokmatLandingPage.clickOnFirstLiveBlogArticleLokmatHomePage();		// Click on First LiveBlog Article
		pages.mobileOutbrainValidation.verifyArticleOutbrainContent();
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
		pages.mobileLokmatLandingPage.clickOnPhotoSection();  								// Click on Photo Section in Line One Menu
		pages.mobileLokmatPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();		// Click on First PhotoGallery Article
		pages.mobileOutbrainValidation.verifyArticleOutbrainContent();
	}
}

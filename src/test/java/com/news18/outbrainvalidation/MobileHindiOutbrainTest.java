package com.news18.outbrainvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This test Class contains scripts to verify the OutBrain Contents is displayed/Loading in various pages 
 * like HomePage , Article Consumption Page , LiveBlog Article Consumption Page , PhotoGallery Consumption
 * Page for Hindi Language in Mobile Mode
 */
public class MobileHindiOutbrainTest extends MobileCommonConfig {
//
//	/**
//	 * @author VipinKumarGawande
//	 * This method is used to navigate to News18 HomePage for Hindi Language URL which is fetching from Property File
//	 * URL - https://hindi.news18.com/
//	 */
//	@BeforeMethod
//	public void navigateToNews18HindiHomepage()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
//	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Promoted Content Ads and Image And OutBrain Content 
	 * is displayed/Loading in News18 HomePage for Hindi Language
	 */
	@Test
	public void verifyHomePageOutbrain()
	{
		pages.mobileOutbrainValidation.verifyArticleOutbrainContent();
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to first Article excluding LiveBlog Article Links in News18 HomePage and 
	 * Verify the Promoted Content Ads and OutBrain Content is displayed/Loading in HomePage Article 
	 * Consumption Page
	 */
	@Test
	public void verifyArticleOutbrain()
	{
		pages.mobileHindiLandingPage.clickOnFirstArticleHindiHomePage();	// Click on First Article excluding LiveBlog Article
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
		pages.mobileHindiLandingPage.clickOnFirstLiveBlogArticleHindiHomePage();	// Click on First LiveBlog Article
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
		pages.mobileHindiLandingPage.clickOnPhotoSection();								// Click on Photos Section
		pages.mobileHindiPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();	// Click on First PhotoGallery Article
		pages.mobileOutbrainValidation.verifyArticleOutbrainContent();
	}
}
package com.news18.socialsharelnksvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 *@author SanjeebKumarPati
 *This Test Class contains scripts to verify Social 
 *Share Links Present on News 18 english Page.
 */
public class MobileEnglishSocialShareLnksValidationTest extends MobileCommonConfig {

	/**
	 * This method is used to navigate to News18 Home Page for 
	 * English Language URL which is fetching from Property File
	 *  URL-https://news18.com/
	 */
//	@BeforeMethod
//	public void navigateToNews18Homepage()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
//	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to Article consumption Page 
	 * and verify the Social Share links Present.
	 * 
	 */
	@Test
	public void verifySocialShareLnksOnArticlePage()
	{
		pages.mobileLandingPage.clickOnFirstArticleHomePage();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.mobileArticleConsumptionPage.getSocialShareIconsLnk(),pages.mobileArticleConsumptionPage.getAllShareIcons());
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to Live Blog Page and 
	 * verify the Social Share links Present.
	 * 
	 */
	@Test
	public void verifySocialShareLnksOnLiveBlogPage()
	{
		pages.mobileLandingPage.clickOnFirstLiveBlogArticleHomePage();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.mobileLandingPage.getSocialShareIconsLnks(),pages.mobileLandingPage.getAllShareIcons());
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to photogallery article 
	 * consumption Page and verify the Social Share links Present.
	 * 
	 */
	@Test
	public void verifySocialShareLnksOnPhotoGalleryPage()
	{
		pages.mobileLandingPage.clickOnPhotoSection();
		pages.mobilePhotoGalleryConsumptionPage.navigateToPhotogalleryFirstArticle();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.mobilePhotoGalleryConsumptionPage.getSocialShareIconsLnk(),pages.mobilePhotoGalleryConsumptionPage.getAllShareIcons());
	}
	
	
}

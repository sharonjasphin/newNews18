package com.news18.socialsharelnksvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 *@author SanjeebKumarPati
 *This Test Class contains scripts to verify Social Share 
 *Links Present on News 18 hindi Page.
 */
public class MobileHindiSocialShareLnksValidationTest extends MobileCommonConfig {

	/**
	 * This method is used to navigate to News18 Home Page for 
	 * hindi Language URL which is fetching from Property File
	 *  URL-https://news18.com/
	 */
//	@BeforeMethod
//	public void navigateToNews18Homepage()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
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
		pages.mobileHindiLandingPage.clickOnFirstArticleHindiHomePage();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.mobileHindiArticleConsumptionPage.getSocialShareIconsLnk(), pages.mobileHindiArticleConsumptionPage.getAllShareIcons());
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
		pages.mobileHindiLandingPage.clickOnFirstLiveBlogArticleHomePage();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.mobileHindiLandingPage.getSocialShareIconsLnks(),pages.mobileHindiLandingPage.getAllShareIcons());
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
		pages.mobileHindiLandingPage.clickOnPhotoSection();
		pages.mobileHindiPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();;
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.mobileHindiPhotoGalleryConsumptionPage.getSocialShareIconsLnk(), pages.mobileHindiPhotoGalleryConsumptionPage.getAllShareIcons());
	}
		
}

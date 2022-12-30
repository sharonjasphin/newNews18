package com.news18.socialsharelnksvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 *@author SanjeebKumarPati
 *This Test Class contains scripts to verify Social Share 
 *Links Present on News 18 gujarati Page.
 */
public class MobileGujaratiSocialShareLnksValidationTest extends MobileCommonConfig {

	/**
	 * This method is used to navigate to News18 Home Page for gujarati 
	 * Language URL which is fetching from Property File
	 *  URL-https://news18.com/
	 */
//	@BeforeMethod
//	public void navigateToNews18Homepage()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiUrl"));
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
		pages.mobileGujaratiLandingPage.clickOnFirstArticleGujaratiHomePage();	
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.mobileGujaratiArticleConsumptionPage.getSocialShareIconsLnk(), pages.mobileGujaratiArticleConsumptionPage.getAllShareIcons());
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
		pages.mobileGujaratiLandingPage.clickOnPhotoSection();
		pages.mobileGujaratiPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();;
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.mobileGujaratiPhotogalleryConsumptionPage.getSocialShareIconsLnk(), pages.mobileGujaratiPhotogalleryConsumptionPage.getAllShareIcons());
	}
	
	
}

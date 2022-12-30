package com.news18.socialsharelnksvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 *@author SanjeebKumarPati
 *This Test Class contains scripts to verify Social 
 *Share Links Present on News 18 Odia Page.
 */
public class MobileOdiaSocialShareLnksValidationTest extends MobileCommonConfig {

	/**
	 * This method is used to navigate to News18 Home Page for 
	 * Odia Language URL which is fetching from Property File
	 *  URL-https://news18.com/
	 */
//	@BeforeMethod
//	public void navigateToNews18Homepage()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("odiaUrl"));
//	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to Article consumption 
	 * Page and verify the Social Share links Present.
	 * 
	 */
	@Test
	public void verifySocialShareLnksOnArticlePage()
	{
		pages.mobileOdiaLandingPage.clickOnFirstArticleOdiaHomePage();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.mobileOdiaArticleConsumptionPage.getSocialShareIconsLnk(),pages.mobileOdiaArticleConsumptionPage.getAllShareIcons());
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
		pages.mobileOdiaLandingPage.clickOnPhotosSection();
		pages.mobileOdiaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();;
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.mobileOdiaPhotogalleryConsumptionPage.getSocialShareIconsLnk(), pages.mobileOdiaPhotogalleryConsumptionPage.getAllShareIcons());
	}
	
	
}

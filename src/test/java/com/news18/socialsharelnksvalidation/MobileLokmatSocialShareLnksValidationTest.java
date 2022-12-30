package com.news18.socialsharelnksvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 *@author SanjeebKumarPati
 *This Test Class contains scripts to verify Social Share 
 *Links Present on News 18 lokmat Page.
 */
public class MobileLokmatSocialShareLnksValidationTest extends MobileCommonConfig {

	/**
	 * This method is used to navigate to News18 Home Page for lokmat 
	 * Language URL which is fetching from Property File
	 *  URL-https://news18.com/
	 */
//	@BeforeMethod
//	public void navigateToNews18Homepage()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatUrl"));
//	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to Article consumption Page and 
	 * verify the Social Share links Present.
	 * 
	 */
	@Test
	public void verifySocialShareLnksOnArticlePage()
	{
		pages.mobileLokmatLandingPage.clickOnFirstArticleLokmatHomePage();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.mobileLokmatArticleConsumptionPage.getSocialShareIconsLnk(),pages.mobileLokmatArticleConsumptionPage.getAllShareIcons());
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to photogallery article consumption 
	 * Page and verify the Social Share links Present.
	 * 
	 */
	@Test
	public void verifySocialShareLnksOnPhotoGalleryPage()
	{
		pages.mobileLokmatLandingPage.clickOnPhotoSection();
		pages.mobileLokmatPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();;
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.mobileLokmatPhotogalleryConsumptionPage.getSocialShareIconsLnk(), pages.mobileLokmatPhotogalleryConsumptionPage.getAllShareIcons());
	}
	
	
}

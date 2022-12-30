package com.news18.socialsharelnksvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 *@author SanjeebKumarPati
 *This Test Class contains scripts to verify Social Share 
 *Links Present on News 18 punjab Page.
 */
public class MobilePunjabSocialShareLnksValidationTest extends MobileCommonConfig {

	/**
	 * This method is used to navigate to News18 Home Page for punjab 
	 * Language URL which is fetching from Property File
	 *  URL-https://news18.com/
	 */
//	@BeforeMethod
//	public void navigateToNews18Homepage()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("punjabUrl"));
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
		pages.mobilePunjabLandingPage.clickOnFirstArticlePunjabHomePage();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.mobilePunjabArticleConsumptionPage.getSocialShareIconsLnk(), pages.mobilePunjabArticleConsumptionPage.getAllShareIcons());
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
		pages.mobilePunjabLandingPage.clickOnPhotoSection();
		pages.mobilePunjabPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();;
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.mobilePunjabPhotogalleryConsumptionPage.getSocialShareIconsLnk(), pages.mobilePunjabPhotogalleryConsumptionPage.getAllShareIcons());
	}
	
	
}

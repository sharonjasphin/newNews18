package com.news18.socialsharelnksvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 *@author SanjeebKumarPati
 *This Test Class contains scripts to verify Social Share 
 *Links Present on News 18 gujarati Page.
 */
public class DesktopGujaratiSocialShareLnksValidationTest extends DesktopCommonConfig {

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
		pages.desktopGujaratiLandingPage.clickOnFirstArticleHomePage();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.desktopGujaratiArticleConsumptionPage.getSocialShareIconsLnk(), pages.desktopGujaratiArticleConsumptionPage.getAllShareIcons());
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to Live Blog Page and verify 
	 * the Social Share links Present.
	 * 
	 */
	@Test
	public void verifySocialShareLnksOnLiveBlogPage()
	{
		pages.desktopGujaratiLandingPage.clickOnFirstLiveBlogArticleHomePage();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.desktopGujaratiLiveBlogPage.getSocialShareIconsLnk(), pages.desktopGujaratiLiveBlogPage.getAllShareIcons());
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
		pages.desktopGujaratiLandingPage.clickOnPhotosSection();
		pages.desktopGujaratiPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();;
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.desktopGujaratiPhotogalleryConsumptionPage.getSocialShareIconsLnk(), pages.desktopGujaratiPhotogalleryConsumptionPage.getAllShareIcons());
	}
	
	
}

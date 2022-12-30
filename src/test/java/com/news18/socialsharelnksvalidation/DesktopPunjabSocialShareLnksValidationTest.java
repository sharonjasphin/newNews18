package com.news18.socialsharelnksvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 *@author SanjeebKumarPati
 *This Test Class contains scripts to verify Social Share 
 *Links Present on News 18 punjab Page.
 */
public class DesktopPunjabSocialShareLnksValidationTest extends DesktopCommonConfig {

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
		pages.desktopPunjabLandingPage.clickOnFirstArticleHomePage();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.desktopPunjabArticleConsumptionPage.getSocialShareIconsLnk(), pages.desktopPunjabArticleConsumptionPage.getAllShareIcons());
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
		pages.desktopPunjabLandingPage.clickOnPhotosSection();
		pages.desktopPunjabPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();;
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.desktopPunjabPhotogalleryConsumptionPage.getSocialShareIconsLnk(), pages.desktopPunjabPhotogalleryConsumptionPage.getAllShareIcons());
	}
	
	
}

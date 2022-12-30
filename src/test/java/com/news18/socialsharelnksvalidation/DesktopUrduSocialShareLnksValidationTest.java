package com.news18.socialsharelnksvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 *@author SanjeebKumarPati
 *This Test Class contains scripts to verify Social
 * Share Links Present on News 18 urdu Page.
 */
public class DesktopUrduSocialShareLnksValidationTest extends DesktopCommonConfig {

	/**
	 * This method is used to navigate to News18 Home Page for 
	 * urdu Language URL which is fetching from Property File
	 *  URL-https://news18.com/
	 */
//	@BeforeMethod
//	public void navigateToNews18Homepage()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("urduUrl"));
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
		pages.desktopUrduLandingPage.clickOnFirstArticleHomePage();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.desktopUrduArticleConsumptionPage.getSocialShareIconsLnk(), pages.desktopUrduArticleConsumptionPage.getAllShareIcons());
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
		pages.desktopUrduLandingPage.clickOnPhotosSection();
		pages.desktopUrduPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();;
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.desktopUrduPhotogalleryConsumptionPage.getSocialShareIconsLnk(), pages.desktopUrduPhotogalleryConsumptionPage.getAllShareIcons());
	}


}

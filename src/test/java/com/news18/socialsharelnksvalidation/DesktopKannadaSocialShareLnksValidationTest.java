package com.news18.socialsharelnksvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 *@author SanjeebKumarPati
 *This Test Class contains scripts to verify Social Share Links 
 *Present on News 18 kannada Page.
 */
public class DesktopKannadaSocialShareLnksValidationTest extends DesktopCommonConfig {

	/**
	 * This method is used to navigate to News18 Home Page for 
	 * kannada Language URL which is fetching from Property File
	 *  URL-https://news18.com/
	 */
//	@BeforeMethod
//	public void navigateToNews18Homepage()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaUrl"));
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
		pages.desktopKannadaLandingPage.clickOnFirstArticleHomePage();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.desktopKannadaArticleConsumptionPage.getSocialShareIconsLnk(), pages.desktopKannadaArticleConsumptionPage.getAllShareIcons());
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
		pages.desktopKannadaLandingPage.clickOnPhotosSection();
		pages.desktopKannadaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();;
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.desktopKannadaPhotogalleryConsumptionPage.getSocialShareIconsLnk(), pages.desktopKannadaPhotogalleryConsumptionPage.getAllShareIcons());
	}
	
	
}

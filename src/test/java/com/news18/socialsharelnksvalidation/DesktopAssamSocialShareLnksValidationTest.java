package com.news18.socialsharelnksvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 *@author SanjeebKumarPati
 *This Test Class contains scripts to verify Social Share
 *Links Present on News 18 assam Page.
 */
public class DesktopAssamSocialShareLnksValidationTest extends DesktopCommonConfig {

	/**
	 * This method is used to navigate to News18 Home Page for 
	 * assam Language URL which is fetching from Property File
	 *  URL-https://news18.com/
	 */
//	@BeforeMethod
//	public void navigateToNews18Homepage()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("assamUrl"));
//	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to Article consumption 
	 * Page and verify the Social Share links Present.
	 */
	@Test
	public void verifySocialShareLnksOnArticlePage()
	{
		pages.desktopAssamLandingPage.clickOnFirstArticleHomePage();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.desktopAssamArticleConsumptionPage.getSocialShareIconsLnk(), pages.desktopAssamArticleConsumptionPage.getAllShareIcons());
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
		pages.desktopAssamLandingPage.clickOnPhotosSection();
		pages.desktopAssamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.desktopAssamPhotogalleryConsumptionPage.getSocialShareIconsLnk(), pages.desktopAssamPhotogalleryConsumptionPage.getAllShareIcons());
	}


}

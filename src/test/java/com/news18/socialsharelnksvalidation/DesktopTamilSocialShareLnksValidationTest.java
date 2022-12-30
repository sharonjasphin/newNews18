package com.news18.socialsharelnksvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 *@author SanjeebKumarPati
 *This Test Class contains scripts to verify Social 
 *Share Links Present on News 18 tamil Page.
 */
public class DesktopTamilSocialShareLnksValidationTest extends DesktopCommonConfig {

	/**
	 * This method is used to navigate to News18 Home Page for 
	 * tamil Language URL which is fetching from Property File
	 *  URL-https://news18.com/
	 */
//	@BeforeMethod
//	public void navigateToNews18Homepage()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("tamilUrl"));
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
		pages.desktopTamilLandingPage.clickOnFirstArticleHomePage();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.desktopTamilArticleConsumptionPage.getSocialShareIconsLnk(), pages.desktopTamilArticleConsumptionPage.getAllShareIcons());
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
		pages.desktopTamilLandingPage.clickOnPhotosSection();
		pages.desktopTamilPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();;
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.desktopTamilPhotogalleryConsumptionPage.getSocialShareIconsLnk(), pages.desktopTamilPhotogalleryConsumptionPage.getAllShareIcons());
	}
	
	
}

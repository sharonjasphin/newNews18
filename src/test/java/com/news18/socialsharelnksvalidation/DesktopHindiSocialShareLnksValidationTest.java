package com.news18.socialsharelnksvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 *@author SanjeebKumarPati
 *This Test Class contains scripts to verify Social Share 
 *Links Present on News 18 hindi Page.
 */
public class DesktopHindiSocialShareLnksValidationTest extends DesktopCommonConfig {

	/**
	 * This method is used to navigate to News18 Home Page for 
	 * hindi Language URL which is fetching from Property File
	 *  URL-https://news18.com/
	 */
//	@BeforeMethod
//	public void navigateToNews18Homepage()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
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
		pages.desktopHindiLandingPage.clickOnFirstArticleHomePage();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.desktopHindiArticleConsumptionPage.getSocialShareIconsLnk(), pages.desktopHindiArticleConsumptionPage.getAllShareIcons());
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
		pages.desktopHindiLandingPage.clickOnLiveBlogArticleHomePage();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.desktopHindiLiveBlogPage.getSocialShareIconsLnk(), pages.desktopHindiLiveBlogPage.getAllShareIcons());
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
		pages.desktopHindiLandingPage.clickOnPhotoSection();
		pages.desktopHindiPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();;
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.desktopHindiPhotoGalleryConsumptionPage.getSocialShareIconsLnks(), pages.desktopHindiPhotoGalleryConsumptionPage.getAllShareIcons());
	}
		
}
